package Proxy;

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
