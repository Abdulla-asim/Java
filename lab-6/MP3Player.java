public class MP3Player extends Electronics{
    private String color;

    public MP3Player (double regularPrice, String manufacturer, String color) {
        super(manufacturer, regularPrice);
        this.color = color;
    }

    @Override
    public double computeSalePrice() {
        return 0.9 * getRegularPrice();
    }  

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
