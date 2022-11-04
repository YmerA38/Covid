import Covid19Data.Covid19Data;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    private final String FILE_NAME = "Data/11_noegletal_pr_region_pr_aldersgruppe.csv";
    public void loadData(ArrayList<Covid19Data> dataList) throws IOException {
        Scanner fileScanner = new Scanner(new File(FILE_NAME), StandardCharsets.ISO_8859_1);
        fileScanner.nextLine();


        writeToArray(fileScanner, dataList); //


    }

    private void writeToArray(Scanner fileScanner, ArrayList<Covid19Data> dataList) {
        String line ="";
        do {
            if(fileScanner.hasNextLine()){
                line = fileScanner.nextLine();
                String[] part = line.split(";");
                dataList.add(new Covid19Data(part[0],part[1],Integer.parseInt(part[2]),Integer.parseInt(part[3]),
                        Integer.parseInt(part[4]),Integer.parseInt(part[5]),part[6]));
            }
        }while(fileScanner.hasNextLine()&&!line.isEmpty());
    }


}
