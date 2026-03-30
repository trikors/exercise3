package ChainOfResponsibility;

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
