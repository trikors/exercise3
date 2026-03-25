import java.util.Arrays;

class Swap{
    private int[] array;
    private final int temp;
    Swap(int index1, int index2, int[] array){
        this.array = array;
        this.temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}

interface sortingAlgorithm{
    static final int SIZE = 10;
    int[] data = new int[SIZE];
    private void sort(){};
    
}

class BubbleSort implements sortingAlgorithm{
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

public class Strategy{
    private int[] data;
    sortingAlgorithm SA;
    public Strategy(sortingAlgorithm SA, int[] data){
        this.data = data;
        this.SA = SA;
        System.out.println("Old: " + Arrays.toString(data));
        if(SA.getClass().getSimpleName() == "BubbleSort"){
            BubbleSort b = new BubbleSort(data);
        }
        System.out.println("New: " + Arrays.toString(data));
    }
    public static void main(String[] args) {
        int[] data = {10,5,3,4,6,7,8,9,1,2};
        Strategy strategy = new Strategy(new BubbleSort(), data);
    }
}