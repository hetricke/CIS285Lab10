package lab10;

/*
* testSelectionSort.java
*
* To change this template, choose Tools | Template Manager
* and open the template in the editor.
*/
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
public class testSelectionSort {

public testSelectionSort() {
}

@Test
public void testPositive(){
int[] arr = new int[5];
arr[0] = 8;
arr[1] = 9;
arr[2] = 7;
arr[3] = 10;
arr[4] = 2;

int[] Sortedarr = new int[5];
Sortedarr[0] = 2;
Sortedarr[1] = 7;
Sortedarr[2] = 8;
Sortedarr[3] = 9;
Sortedarr[4] = 10;

SelectionSort sorter = new SelectionSort();

arr = sorter.basicSelectionSort(arr);

boolean equals = Arrays.equals(arr, Sortedarr); 

assertEquals(true, equals);

}

@Test
public void testNegative(){
	int[] arr = new int[5];
	arr[0] = -8;
	arr[1] = -9;
	arr[2] = -7;
	arr[3] = -10;
	arr[4] = -2;

	int[] Sortedarr = new int[5];
	Sortedarr[4] = -2;
	Sortedarr[3] = -7;
	Sortedarr[2] = -8;
	Sortedarr[1] = -9;
	Sortedarr[0] = -10;

	SelectionSort sorter = new SelectionSort();

	arr = sorter.basicSelectionSort(arr);

	boolean equals = Arrays.equals(arr, Sortedarr); 

	assertEquals(true, equals);
	}

@Test
public void testMixed(){
	int[] arr = new int[5];
	arr[0] = -8;
	arr[1] = 9;
	arr[2] = -7;
	arr[3] = 0;
	arr[4] = 2;

	int[] Sortedarr = new int[5];
	Sortedarr[3] = 2;
	Sortedarr[1] = -7;
	Sortedarr[0] = -8;
	Sortedarr[4] = 9;
	Sortedarr[2] = 0;

	SelectionSort sorter = new SelectionSort();

	arr = sorter.basicSelectionSort(arr);
	
	boolean equals = Arrays.equals(arr, Sortedarr); 

	assertEquals(true, equals);
	}

@Test
public void testDuplicates(){
	int[] arr = new int[6];
	arr[0] = -8;
	arr[1] = -9;
	arr[2] = -7;
	arr[3] = -10;
	arr[4] = -2;
	arr[5] = -7;

	int[] Sortedarr = new int[6];
	Sortedarr[5] = -2;
	Sortedarr[4] = -7;
	Sortedarr[3] = -7;
	Sortedarr[2] = -8;
	Sortedarr[1] = -9;
	Sortedarr[0] = -10;

	SelectionSort sorter = new SelectionSort();

	arr = sorter.basicSelectionSort(arr);

	boolean equals = Arrays.equals(arr, Sortedarr); 

	assertEquals(true, equals);
	}


}