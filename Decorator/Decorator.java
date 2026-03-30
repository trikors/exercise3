package Decorator;

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
