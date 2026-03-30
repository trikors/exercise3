package ChainOfResponsibility;


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