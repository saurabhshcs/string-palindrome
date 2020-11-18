package com.ptr.exercise;

/*
 * @created 18/11/2020 -09:56
 * @project ptr
 * @author  saurabhshcs
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindDistinctElements {

    public static void main(String[] args) {

        String [] nobel = { "Curie", "Marconi", "Planck", "Bohr", "Einstein", "Hertz", "Curie", "Curie", "Bohr", "Einstein", "Curie", "Curie", "Planck", "Marconi", "Marconi" };
        List<String> nobelLst = new ArrayList<String>(Arrays.asList(nobel));

        System.out.println("Before removeDuplicates nobelLst.length(): " + nobelLst.size());

        nobelLst = removeDuplicates(nobelLst);

        System.out.println("After removeDuplicates nobelLst.length(): " + nobelLst.size());
    }

    private static List<String> removeDuplicates(final List<String> list){
        return list.stream().distinct().collect(Collectors.toList());
    }
}
