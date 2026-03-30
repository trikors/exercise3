package ChainOfResponsibility;

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

