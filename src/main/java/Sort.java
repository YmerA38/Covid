import Comparator.AldersgruppeComparator;
import Comparator.RegionComparator;
import Covid19Data.Covid19Data;

import java.util.AbstractList;
import java.util.Collections;

public class Sort {

    public void sortListByRegion(AbstractList<Covid19Data> dataList){
        Collections.sort(dataList, new RegionComparator());
    }
    public void sortListByAlder(AbstractList<Covid19Data> dataList){

        Collections.sort(dataList, new AldersgruppeComparator());
    }
}
