package heapSort;
import java.util.Scanner;
public class HeapSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();
	   int array[] = new int[size]; 
	   for(int i=0;i<size;i++) {
		   System.out.println("enter the "+i+"th element");
           array [i]=sc.nextInt();	
	   }
	   System.out.println("heapsort");
	   HeapSort1 hs = new HeapSort1(array);
	  int  hArr[] = hs.heapSort();
	  for(int i=0;i<hArr.length;i++) {
	  System.out.println(hArr[i]);
	  System.out.print("\t");
	  }
	  
	  
	  
	  System.out.println("mergesort");
	  MergeSort ms = new MergeSort(array,0,array.length-1);
	  ms.print();
	  System.out.println("\t");
	  
	  
	  
	  System.out.println("selectionsort");
	  SelectionSort ss = new SelectionSort(array);
	  int sarray[]=ss.selectionSort();
	  for(int i=0;i<sarray.length;i++) {
		  System.out.print(sarray[i]+" ");
		  System.out.println("\t");
		  
		  
	  }  
		  System.out.println("Quicksort");
		  QuickSort qs = new QuickSort(array,0,array.length);
		  qs.quickSort(array,0,array.length-1);
		  qs.print();
	
	  
	  sc.close();
	}
	 
}
