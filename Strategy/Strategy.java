package Strategy;

import java.util.Arrays;

public class Strategy{
    private int[] data;
    SortingAlgorithm SA;
    
    public Strategy(SortingAlgorithm SA, int[] data){
        this.data = data;
        this.SA = SA;

        System.out.println("Old: " + Arrays.toString(data));

        if((SA.getClass().getSimpleName()).equals("BubbleSort")){
            BubbleSort b = new BubbleSort(data);
        }

        if((SA.getClass().getSimpleName()).equals("SelectionSort")){
            SelectionSort s = new SelectionSort(data);
        }

        if((SA.getClass().getSimpleName()).equals("InsertionSort")){
            InsertionSort i = new InsertionSort(data);
        }

        System.out.println("New: " + Arrays.toString(data));
    }
    public static void main(String[] args) {
        int[] data = {10,5,3,4,6,7,8,9,1,2,66,13,1,44,11};
        Strategy strategy = new Strategy(new SelectionSort(), data);
    }
}