package com.sample.findintersection;

import java.util.*;
import java.io.*;
import java.lang.*;

class FindIntersection {

    public static String findIntersection(String[] strArr) {
        // code goes here

        String firstElement = strArr[0];
        String secondElement = strArr[1];

        String[] firstElemArr = firstElement.split(",");
        String[] secondElemArr = secondElement.split(",");
        String resultString = "";
        int index = 0;
        for (int i = 0; i < firstElemArr.length; i++) {
            for (int k = 0; k < secondElemArr.length; k++) {
                if (firstElemArr[i].trim().equals(secondElemArr[k].trim())) {
                    if (index > 0) {
                        resultString = resultString + "," + firstElemArr[i].trim();
                    } else {
                        resultString = resultString + firstElemArr[i].trim();
                    }
                    index++;

                }
            }
        }
        if (resultString == null || resultString.isEmpty()) {
            resultString = "false";
        }
        return resultString;
    }

    public static void main(String[] args) {
        // keep this function call here
        String[] strArr = {"1, 5, 6, 7, 10, 11, 12", "5, 6, 8, 11, 17"};
        System.out.println(findIntersection(strArr));
    }

}