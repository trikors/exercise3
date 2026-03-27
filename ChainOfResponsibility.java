
interface Receiver{
    public void receive(Request request);
    private void send(){};
} 

class LevelZero implements Receiver{
    private Request request;

    public void receive(Request request){
        this.request = request;
        send();
    }
    private void send(){
        if(request.getStatusCode() == 0){
            System.out.println("You have reached level Zero , 0." + 
                "In order to understand how to use the Mouse, please refer " +
                "to the Instruction booklet. " + "This is level 0" + 
                "Enjoy using the mouse. It has 2 buttons for clicking, left and right" +
                " !!!!");
        }
        else{
            LevelOne levelOne = new LevelOne();
            levelOne.receive(request);
        }
    }
}

class LevelOne implements Receiver{
    private Request request;
    public void receive(Request request){
        this.request = request;
        send();
    }
    private void send(){
        if(request.getStatusCode() == 1){
            System.out.println("You have reached level One , 1." + 
            " Here you will learn to use the Keyboard" + 
            " Every Computer has a Keyboard that you can type on. " + 
            " If you have not understood it, please read the Instruction booklet" + 
            " In order to type you need to use the Keyboard. Remember that!");
        }
       else{
            LevelTwo levelTwo = new LevelTwo();
            levelTwo.receive(request);
        }
    }
}

class LevelTwo implements Receiver{
    private Request request;
    public void receive(Request request){
        this.request = request;
        send();
    }
    private void send(){
        if(request.getStatusCode() == 2){
            System.out.println(" Screens are a big part of modern computers" + 
                "In order to use a screen, you need to stare directly at the " +
                " Vacuum tube or the LCD panel. With Older computers, Vacuum tubes " +
                "need constant maintanence and upkeep. LCD screens are much better" +
                "If you have an LCD screen than just wipe with with slightly wet cloth" + 
                " and you have a perfect Screen!" + "Take care and remember to maintain the screen" + 
                "in good condition!");
        }
       else{
            LevelThree levelThree = new LevelThree();
            levelThree.receive(request);
        }
    }
}

class LevelThree implements Receiver{
    private Request request;
    public void receive(Request request){
        this.request = request;
        send();
    }
    private void send(){
        if(request.getStatusCode() == 3){
            System.out.println("How Do I Turn On My Computer?" + 
            "To answer this Age-old question please refer to the following presentation" + 
            "The power ON button is located directly beneath the screen, and above the keyboard" + 
            " You need to press and hold it for roughly One second to initiate Start-Up" + 
            " Once the computer begins to make sounds, it meants it has booted up " + 
            " Use this to your advantage and start using the computer");
        }
        else{
            System.out.println("Request Code Not Found!!! ERROR!!!!");
        }
    }
}

class Request{
    private int status_code;

    public int getStatusCode(){
        return status_code;
    }
    public void setStatusCode(int status_code){
        this.status_code = status_code;
    }
}

public class ChainOfResponsibility {
    public static void main(String[] args) {
        Request request = new Request();
        request.setStatusCode(3);
        LevelZero levelZero = new LevelZero();
        levelZero.receive(request);
    }
}
