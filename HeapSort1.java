package heapSort;

public class HeapSort1 {
	int hArr[];
	HeapSort1(int array[]){
		hArr= array;
	}
 void maxHeapify(int i,int hArr[],int heapSize) {
 int l= 2*i+1;
 int r = 2*i+2;
 int largest;
 if (l<heapSize && hArr[l]>hArr[i] ) {
	 largest=l;
 }
 else {
	largest=i;
	
 }
 if(r<heapSize && hArr[r]>hArr[largest]) {
	 largest=r;
 }
 if (largest != i){
	 int temp = hArr[largest];
	 hArr[largest]=hArr[i];
	 hArr[i]=temp;
	 maxHeapify(largest,hArr,heapSize);
 }
}
 void buildMaxHeap(int hArr[]) {
	 for(int i=(hArr.length/2)-1; i>= 0;i--) {
		 maxHeapify(i,hArr,hArr.length);
		 
	 }
 }
 public int[]heapSort(){
 buildMaxHeap(hArr);
 for(int i=hArr.length-1;i>=1;i--) {
	 int temp = hArr[i];
	 hArr[i]=hArr[0];
	 hArr[0]=temp;
     maxHeapify(0,hArr,i);
}
 return hArr;
}

} 