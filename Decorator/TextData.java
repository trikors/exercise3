package Decorator;

class TextData extends Window{
    private String text;
    private final int numberOfLines = 10;

    public TextData(String text){
        this.text = text;
    }

    @Override 
    public void draw(){
        int lineLength = text.length() / numberOfLines;
        for(int i = 0; i < text.length(); i++){
            System.out.print(text.charAt(i));
            if(i % lineLength == 0 && i > 0)
                System.out.println();
        }
        System.out.println();
    }
}
