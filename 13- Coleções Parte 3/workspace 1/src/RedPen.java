import interfaces.IPen;

public class RedPen implements IPen {

    String color;

    public RedPen(){
        color = "red";
    }

    @Override
    public void write(String text) {
        System.out.println("Writting the following text: " + text);
    }

    @Override
    public String getColor() {
        return color;
    }
}
