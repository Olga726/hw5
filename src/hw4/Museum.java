package hw4;

public class Museum {
    private Exhibit exhibit;

    public void setExhibit(Exhibit exhibit){
        this.exhibit=exhibit;
    }

    public void showExhibit(){
        exhibit.preserve();
        exhibit.describe();
    }
}
