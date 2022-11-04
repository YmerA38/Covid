import Covid19Data.Covid19Data;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class UI {

    private ArrayList<Covid19Data> dataList;
    private FileHandler fileHandler;
    private Sort sort;

    public void start() {
        dataList = new ArrayList<>();
        fileHandler = new FileHandler();
        sort = new Sort();
        Scanner userInput = new Scanner(System.in);


        int choice = 0;
        String choiceString = "";
        do {
            System.out.println(" 1...Load\n 2...Save\n 3...Print\n 4...Sorter efter Region" +
                    "\n 5...Sorter efter Navn\n 9...Exit");
            choiceString = userInput.next();
            try {
                choice = Integer.parseInt(choiceString);

            } catch (NumberFormatException exc) {
                System.out.println("Not a number try again");
            }
            switch (choice) {
                case 1 -> {

                    try {
                        fileHandler.loadData(dataList);

                    } catch (IOException ex) {
                        System.out.println("File not found error");
                    }
                    System.out.println("File loaded");
                }
                case 2 -> {
                    System.out.println("not don");
                }
                case 3 -> {
                    System.out.println(dataList);
                }
                case 4 -> {
                    sort.sortListByRegion(dataList);
                }
                case 5 -> {
                    sort.sortListByAlder(dataList);
                }
                case 9 -> {

                }

            }
        }while (choice!=9);

    }





}
