class InsertionSort {
	
	private void sort(int[] values){
		int in, out;

		for (out=1; out<values.length; out++) {
			int temp = values[out];
			in = out;
			while(in>0 && values[in-1] >= temp){
				values[in] = values[in-1];
				--in;
			}			
			values[in] = temp;
		}
	}

	public static void main(String[] args) {
		InsertionSort insertionSort = new InsertionSort();
		int size = 10;
		int[] values = new int[size];
		insertionSort.gerarValoresRandomicos(values,size);
		insertionSort.sort(values);
		for (int val : values) {
			System.out.println(val);
		}
	}

	private void gerarValoresRandomicos(int[] array, int size){
		for (int i=0; i<array.length; i++) {
			array[i]=(int)(Math.random()*size);
		}
	}
}