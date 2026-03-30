package ChainOfResponsibility;

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
