package interfaces;

public interface IPen {

    public void write(String text);
    public String getColor();

    public default String useEraser(){
        return "no eraser attatched ...";
    }

}
