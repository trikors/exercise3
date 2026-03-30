package Proxy;

import java.util.concurrent.ThreadLocalRandom;

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