package pc2;

public class Rectangle {
    int width;
    int height;

    Rectangle(int newWidth, int newHeight){
        this.width=newWidth;
        this.height=newHeight;
    }

    int getHeight(){
        return  height;
    }

    int getWidth(){
        return width;
    }

    void setWidth(int newWidth){
        width=newWidth;
    }

    public int calculateArea(){
        return width * height;
    }
}
