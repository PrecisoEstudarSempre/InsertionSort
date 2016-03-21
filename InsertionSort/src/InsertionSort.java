class InsertionSort {
	
	public void sort(int[] values){
		int i,j;

		for (i=1; i<values.length; i++) {
			int temp = values[i];
			j = i;
			while(j>0 && values[j-1] >= temp){
				values[j] = values[j-1];
				--j;
			}			
			values[j] = temp;
		}
	}
}