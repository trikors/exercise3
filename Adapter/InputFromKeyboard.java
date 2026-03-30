package Adapter;

import java.io.IOException;

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
