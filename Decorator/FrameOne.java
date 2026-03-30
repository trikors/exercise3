package Decorator;

class FrameOne extends Window{
    final int numberOfSymbols = 45;
    Window object;

    public FrameOne(Window object){
        this.object = object;
    }

    @Override
    public void draw(){
        System.out.println("*".repeat(numberOfSymbols));
        object.draw();
        System.out.println("*".repeat(numberOfSymbols));
    }
}
