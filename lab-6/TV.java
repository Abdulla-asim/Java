public class TV extends Electronics{
    private int size;

    public TV(double regularPrice, String manufacturer, int size) {
        super(manufacturer, regularPrice);
        this.size = size;
    }

    @Override
    public double computeSalePrice() {
        return 0.8 * getRegularPrice();
    }
}
