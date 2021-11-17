package com.arrayrange;

import java.util.Arrays;
import java.util.Scanner;

public class rangeofarray {

    public static void main(String[] args) {
	// write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=scn.nextInt();
        }
        Arrays.sort(array);
        System.out.println(array[n-1]-array[0]);
    }
}
