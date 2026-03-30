package Strategy;

class InsertionSort implements SortingAlgorithm{
    private int[] data = new int[SIZE];

    public InsertionSort(){}

    public InsertionSort(int[] data){
        this.data = data;
        sort();
    }

    private void sort(){
        for(int left = 0; left < data.length; left++){
            int value = data[left];
            int i = left - 1;
            for(; i >= 0; i--){
                if(value < data[i]){
                    data[i + 1] = data[i];
                } else {
                    break;
                }
            }
            data[i + 1] = value;
        }
    }
}

