package ChainOfResponsibility;

public class ChainOfResponsibility {
    public static void main(String[] args) {
        Request request = new Request();
        request.setStatusCode(3);
        LevelZero levelZero = new LevelZero();
        levelZero.receive(request);
    }
}
