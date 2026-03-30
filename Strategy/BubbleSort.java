package Strategy;

class BubbleSort implements SortingAlgorithm{
    private int[] data = new int[SIZE];
    
    public BubbleSort(){}

    public BubbleSort(int[] data){
        this.data = data;
        sort();
    }

    private void sort(){
        Swap swap = null;
        boolean needIteration = true;
        while(needIteration){
            needIteration = false;
            for(int i = 1; i < data.length; i++){
                if(data[i] < data[i - 1]){
                    swap = new Swap(i, i - 1, data);
                    needIteration = true;
                }
            }
        }
    }
}
