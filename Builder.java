import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

interface TextParser{
     ArrayList<Integer> data = new ArrayList<>();
     private void display(){};
}

class TextAscii implements TextParser{
    private ArrayList<Integer> data = new ArrayList<>();
    TextAscii(ArrayList<Integer> data){
        this.data = data;
        display();
    }
    private void display(){
        for(int i = 0; i < data.size(); i++)
            System.out.print(data.get(i));
        System.out.println();
    }
}

class TextChars implements TextParser{
    private ArrayList<Integer> data = new ArrayList<>();
    TextChars(ArrayList<Integer> data){
        this.data = data;
        display();
    }
    private void display(){
        for(int i = 0; i < data.size(); i++)
            System.out.print((char)(int)data.get(i));
        System.out.println();
    }
}

class TextShift implements TextParser{
    private ArrayList<Integer> data = new ArrayList<>();
    TextShift(ArrayList<Integer> data){
        this.data = data;
        display();
    }
    private void display(){
        for(int i = 0; i < data.size(); i++)
            System.out.print((char)((int)data.get(i) + 1));
        System.out.println();
    }
}

class ProduceText{
    Scanner scanner;
    ArrayList<Integer> text_data= new ArrayList<>();
    final int ASCII_0 = 48;

    ProduceText(){
        readText();
        TextAscii textAscii = new TextAscii(text_data);
        TextChars textChars = new TextChars(text_data);
        TextShift textShift = new TextShift(text_data);
    }

    private void readText(){
        while(true){
            try{
                int c = System.in.read();
                if(c == ASCII_0)
                    break;
                text_data.add(c);
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}

public class Builder {
    public static void main(String[] args) {
    ProduceText produceText = new ProduceText();
    }
}
