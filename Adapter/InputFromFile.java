package Adapter;

import java.nio.file.StandardOpenOption;
import java.io.IOException;
import java.nio.file.Files;

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