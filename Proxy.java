import java.util.concurrent.ThreadLocalRandom;

interface Text{
    public void displayAll();
    public void displayPart(int size);
}

class CreateRandomText{
    private String randomText = "";
    private final int minAscii = 48;
    private final int maxAscii = 122;
    
    public String createText(int maxLetterCount){
        for(int i = 0; i < maxLetterCount; i++){
            int randomNum = ThreadLocalRandom.current().nextInt(minAscii, maxAscii + 1);
            randomText += (char)randomNum;
        }
        return randomText;
    }
}

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

class ProxyText implements Text{
    private final int proxySize = 200;
    private String text;
    LargeText largeText = null;

    public ProxyText(){
        largeText = new LargeText();
        text = largeText.returnPart(proxySize);
    }

    public void displayAll(){
        largeText.displayAll();
    }
    
    public void displayPart(int size){
        System.out.println(text);
    }
}

public class Proxy {
    public static void main(String[] args) {
        ProxyText proxyText = new ProxyText();
        proxyText.displayPart(0);
        proxyText.displayAll();
    }
}
