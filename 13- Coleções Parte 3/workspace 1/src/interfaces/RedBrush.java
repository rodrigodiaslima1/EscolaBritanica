package interfaces;

public class RedBrush implements IPen {

    private String color;

    public RedBrush(){
        this.color = "red";
    }


    @Override
    public void write(String text) {
        System.out.println(text);
    }

    @Override
    public String getColor() {
        return String.format("Brush Color: %s", color);
    }

    @Override
    public String useEraser(){
        return "Using the eraser ...";
    }
}
