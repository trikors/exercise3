package ChainOfResponsibility;

interface Receiver{
    public void receive(Request request);
    private void send(){};
} 