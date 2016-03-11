class InsertionSort {
	
	private void sort(int[] values){
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

	public static void main(String[] args) {
		InsertionSort insertionSort = new InsertionSort();
		int size = 10000;
		int[] values = new int[size];
		insertionSort.generateRandomValues(values,size);
		long tempoInicial = System.currentTimeMillis();
		insertionSort.sort(values);
		System.out.println("Tempo de execucao do algoritmo: " + (System.currentTimeMillis() - tempoInicial));
		/*
		for (int val : values) {
			System.out.println(val);
		}
		*/
	}

	private void generateSortedValues(int[] array){
		for (int i=0; i<1000; i++) {
			array[i] = i;
		}
	}

	private void generateRandomValues(int[] array, int size){
		for (int i=1001; i<array.length; i++) {
			array[i]=(int)(Math.random()*size);
		}
	}
}