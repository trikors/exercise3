abstract class Window{
    public abstract void draw();
}

class TextData extends Window{
    private String text;
    private final int numberOfLines = 10;

    public TextData(String text){
        this.text = text;
    }

    @Override 
    public void draw(){
        int lineLength = text.length() / numberOfLines;
        for(int i = 0; i < text.length(); i++){
            System.out.print(text.charAt(i));
            if(i % lineLength == 0 && i > 0)
                System.out.println();
        }
        System.out.println();
    }
}

class FrameOne extends Window{
    final int numberOfSymbols = 45;
    Window object;

    public FrameOne(Window object){
        this.object = object;
        //draw();
    }

    @Override
    public void draw(){
        System.out.println("*".repeat(numberOfSymbols));
        object.draw();
        System.out.println("*".repeat(numberOfSymbols));
    }
}

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

public class Decorator {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("There was once a lonely wolf living in the garden. He was");
        sb.append("extemely lonely and there were no other wolves with him.");
        sb.append("Had he known that there were other wolves, he would have mated");
        sb.append("with some of them. But no other wolf was present and our");
        sb.append("lonely wolf simply lived by himself and died soon thereafter.");
        sb.append("The hunting community missed our wolf and it could not kill it.");
        sb.append("This is the time in our world that the wolf population began declining");

        FrameOne frameOne = new FrameOne(new TextData(sb.toString()));
        frameOne.draw();
        System.out.println();

        FrameTwo frameTwo = new FrameTwo(new TextData(sb.toString()));
        frameTwo.draw();
        System.out.println();

        FrameTwo frameTwoAndOne = new FrameTwo(new FrameOne(new TextData(sb.toString())));
        frameTwoAndOne.draw();
        System.out.println();

        FrameOne frameOneAndTwo = new FrameOne(new FrameTwo(new TextData(sb.toString())));
        frameOneAndTwo.draw();

    }
}
