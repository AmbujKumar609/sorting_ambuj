package heapSort;

public class QuickSort {
	int qArray[];
	int p;
	int r;
	 QuickSort(int array[],int begin,int end){
		qArray=array;
		p=begin;
		r=end;
		}
	 void quickSort(int qArray[],int begin,int end) {
		if (p<r) {
			int q= partion(qArray,p,r);
			quickSort(qArray,p,q-1);
			quickSort(qArray,q+1,r);
		}
		
		
	} 
	 private int partion(int qArray[],int p,int r) {
		 int temp;
		 int key = qArray[r];
		 int i= p-1;
		 for(int j=p;j<r;j++) {
			 if (qArray[j]<= key) {
				 i+=1;
				 temp=qArray[i];
				 qArray[i]=qArray[j];
				 qArray[j]=temp;
				 
			 }
		 }
		 temp=qArray[i];
		 qArray[i+1]=qArray[r];
		 qArray[r]=temp;
		 return i+1;
	 }
void print() {
	for(int i=0;i<qArray.length;i++) {
		
		System.out.print(qArray[i]+" ");
	
}
}
}

