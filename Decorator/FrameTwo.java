package Decorator;

class FrameTwo extends Window{
    final int numberOfSymbols = 45;
    Window object;

    public FrameTwo(Window object){
        this.object = object;
    }

    @Override
    public void draw(){
        System.out.println("#".repeat(numberOfSymbols));
        object.draw();
        System.out.println("#".repeat(numberOfSymbols));

    }
}

