package Comparator;

import Covid19Data.Covid19Data;

import java.util.Comparator;

public class AldersgruppeComparator implements Comparator<Covid19Data> {
    @Override
    public int compare(Covid19Data d1, Covid19Data d2) {
        return d1.getAldersgruppe().compareTo(d2.getAldersgruppe());
    }
}
