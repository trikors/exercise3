package Strategy;

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
