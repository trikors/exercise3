package Strategy;


class SelectionSort implements SortingAlgorithm{
    private int[] data = new int[SIZE];
    
    public SelectionSort(){}

    public SelectionSort(int[] data){
        this.data = data;
        sort();
    }

    private void sort(){
        Swap swap = null;
        
        for(int left = 0; left < data.length; left++){
            int minInd = left;
            for(int i = left; i < data.length; i++){
                if(data[i] < data[minInd]){
                    minInd = i;
                }
            }
            swap = new Swap(left, minInd, data);
        }
    }
}
