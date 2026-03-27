import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

interface TextParser{
    public void printEvenLetters();
    public void allText();
}

class TextAscii implements TextParser{
    private ArrayList<Integer> data = new ArrayList<>();

    public TextAscii(ArrayList<Integer> data){
        this.data = data;
    }

    public void printEvenLetters(){
        Iterator<Integer> iterator = data.iterator();
        int counter = 0;
        while(iterator.hasNext()){
            counter++;
            if(counter % 2 == 0){
                System.out.print(iterator.next());
                continue;
            }
            iterator.next();
        }
        System.out.println();
    }
    public void allText(){
        for(int i = 0; i < data.size(); i++)
            System.out.print(data.get(i));
        System.out.println();
    }
}

class TextChars implements TextParser{
    private ArrayList<Integer> data = new ArrayList<>();

    public TextChars(ArrayList<Integer> data){
        this.data = data;
    }

    public void printEvenLetters(){
        Iterator<Integer> iterator = data.iterator();
        int counter = 0;
        while(iterator.hasNext()){
            counter++;
            if(counter % 2 == 0){
                System.out.print((char)(int)iterator.next());
                continue;
            }
            iterator.next();
        }
        System.out.println();
    }
    public void allText(){
        for(int i = 0; i < data.size(); i++)
            System.out.print((char)(int)data.get(i));
        System.out.println();
    }
}

class TextShift implements TextParser{
    private ArrayList<Integer> data = new ArrayList<>();
    final int OFFSET = 2;

    public TextShift(ArrayList<Integer> data){
        this.data = data;
    }

    public void printEvenLetters(){
        Iterator<Integer> iterator = data.iterator();
        int counter = 0;
        
        while(iterator.hasNext()){
            counter++;
            if(counter % 2 == 0){
                System.out.print((char)((int)iterator.next() + OFFSET));
                continue;
            }
            iterator.next();
        }
        System.out.println();
    }
    public void allText(){
        for(int i = 0; i < data.size(); i++)
            System.out.print((char)((int)data.get(i) + OFFSET));
        System.out.println();
    }
}

class ProduceText{
    ArrayList<Integer> text_data= new ArrayList<>();
    final int ASCII_NL = 10;

    public ProduceText(){
        readText();
        TextAscii textAscii = new TextAscii(text_data);
        TextChars textChars = new TextChars(text_data);
        TextShift textShift = new TextShift(text_data);
        textAscii.allText();
        textAscii.printEvenLetters();
        textChars.allText();
        textChars.printEvenLetters();
        textShift.allText();
        textShift.printEvenLetters();
    }

    private void readText(){
        System.out.println("Please enter some text, hit Enter to finish!");
        while(true){
            try{
                int c = System.in.read();
                if(c == ASCII_NL)
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
