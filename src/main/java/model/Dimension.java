package model;

public class Dimension {
    private int length;
    private int height;

    public Dimension(int length, int height) {
        this.length = length;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public Boolean equals(Dimension dimension){
        return (this.height == dimension.height && this.length == dimension.length) || (this.length == dimension.height && this.height == dimension.length);
    }
}
