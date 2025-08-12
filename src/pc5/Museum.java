package pc5;

public class Museum {
    private Exhibit exhibit;

    public void setExhibit(Exhibit exhibit) {
        this.exhibit = exhibit;
    }

    public void showExhibit() {
        if (this.exhibit == null) {
            System.out.println("В музей не поступало экспонатов");
        } else {
            exhibit.preserve();
            exhibit.info();
        }
    }
}
