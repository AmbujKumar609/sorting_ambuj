package heapSort;

public class MergeSort {
	int mArr[];
	int p;
	int r;
	MergeSort(int array[],int begin,int end){
		mArr = array;
		p=begin;
		r=end;
		}
	void mergeSort(int mArr[],int p,int r) {
		if(p<r) {
			int q=(p+r)/2;
			mergeSort(mArr,p,q);
			mergeSort(mArr,q+1,r);
			merge(mArr,p,q,r);
		}
	}
	void merge(int mArr[],int p,int q,int r) {
		int n1=q-p+1;
		int n2=r-q;
		int lArr[] = new int [n1];
		int rArr[] = new int [n2];		
		for(int i=0;i<n1;i++) {
			lArr[i] = mArr[p+i-1];
		}	
		for(int j=0;j<n2;j++) {
			 rArr[j]=mArr[q+j];
		    }
	    int i=1;
	    int j=1;
	    for(int k=p; k<r; k++) {
	    	if(n1>n2) {
	    	if(lArr[i] < rArr[j] && i<n1) {
	    		mArr[k]=lArr[i];
	    		i=i+1;
	    	}
	    	else {
	    		mArr[k]=rArr[j];
	    		j++;
	    	}
	    	}
	    	
	    	else {
	    		if(lArr[i] < rArr[j] && j<n2) {
		    		mArr[k]=lArr[i];
		    		i=i++;
		    	}
		    	else {
		    		mArr[k]=rArr[j];
		    		j++;
		    	}
	    	}
	    }
		}
	void print() {
		for(int i=0;i<mArr.length;i++) {
			System.out.print(mArr[i]+" ");
			
		}
	}
	}

