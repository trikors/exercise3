package Proxy;

class LargeText implements Text{
    private final int maxTextSize = 100000;
    private String text;
    private String proxyText;
    CreateRandomText createRandomText = new CreateRandomText();

    public LargeText(){
        text = createRandomText.createText(maxTextSize);
    }

    public void displayAll(){
        System.out.println(text);
    }

    public void displayPart(int size){
        for(int i = 0; i < size; i++){
            System.out.print(text.charAt(i));
        }
    }
    
    public String returnPart(int size){
        for(int i = 0; i < size; i++){
            proxyText += text.charAt(i);
        }
        return proxyText;
    }
}
