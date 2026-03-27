import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


interface ReadFromInput{
    static final int ASCII_NL = 10;
    public void readData();
    public void writeData();
}

interface ReadFromFile{
    final Path filePathRead = Paths.get("./datain.txt");
    final Path filePathWrite = Paths.get("./dataout.txt");
    public void readData();
    public void printData();
}

class InputFromKeyboard implements ReadFromInput{
    private String text = "";

    public void readData(){
        while(true){
            try{
                int c = System.in.read();
                text += (char) c;
                if( c == ASCII_NL) 
                    break;
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        
    }
    public void writeData(){
        System.out.println(text);
    }
    public String getText(){
        return text;
    }
}

class InputFromFile implements ReadFromFile{
    String content = "";
    public void readData(){
        try{
            content = Files.readString(filePathRead);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public void printData(){
        try{
            for(int i = 0; i < 10; i++){
                Files.writeString(filePathWrite, content, StandardOpenOption.APPEND);
            }  
            System.out.println("Data successfully written");  
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    public void setContent(String content){
        this.content = content;
    }
}

class AdapterDevice implements ReadFromInput, ReadFromFile{
    private String text = "";
    private InputFromFile inputFromFile = new InputFromFile();
    private InputFromKeyboard inputFromKeyboard = new InputFromKeyboard();

    public void readData(){
        inputFromKeyboard.readData();
        text = inputFromKeyboard.getText();
    }

    public void writeData(){
        inputFromFile.setContent(text);
        inputFromFile.printData();
        printData();
    }

    public void printData(){
        inputFromKeyboard.writeData();
    }
}

public class Adapter {
    public static void main(String[] args) {

       AdapterDevice adapterDevice = new AdapterDevice();
       adapterDevice.readData();
       adapterDevice.writeData();
    }
}
