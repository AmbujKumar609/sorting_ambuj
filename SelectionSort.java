package heapSort;

public class SelectionSort {
	int sArray[];
	SelectionSort(int array[]){
		sArray=array;
	//public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//System.out.println("enter the size");
		//int size = sc.nextInt();
	   //int array[] = new int[size]; 
	   //for(int i=0;i<size;i++) {
		//   System.out.println("enter the "+i+"th element");
          // array [i]=sc.nextInt();
	   }
		
			int [] selectionSort() {
		
           for(int i=0;i<sArray.length;i++) {
        	   int min=i;
        	   int temp=0;
        	   for(int j=i+1;j<sArray.length;j++) {
        		  if( sArray[j]<sArray[min]) {
        			  temp=j;
        		  }
        	   }
        	   temp=sArray[i];
        	   sArray[i]=sArray[min];
        	   sArray[min]=temp;
        	   
           }
		
	return sArray;
	} 
			
	}


