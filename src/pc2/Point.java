package pc2;

public class Point {
    float x;
    float y;

    Point(float x1, float y1){
        this.x=x1;
        this.y=y1;
    }

    float getX(){
        return x;
    }

    float getY(){
        return  y;
    }

    void setX(float x1){
        x=x1;
    }

    public void print(){
        System.out.println("x=" + this.x + " y=" + this.y);
    }
}
