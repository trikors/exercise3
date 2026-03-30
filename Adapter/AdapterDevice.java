package Adapter;

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
