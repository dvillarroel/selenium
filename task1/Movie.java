package task;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String _title;
    private int _priceCode;

    public Movie(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
    }

    public int getPriceCode() {
        return _priceCode;
    }

    public void setPriceCode(int arg) {
        _priceCode = arg;
    }

    public String getTitle() {
        return _title;
    }

    public double calculatePrice(int days){
        double price = 0;
        switch (_priceCode) {
            case Movie.REGULAR:
                price = 2;
                if (days > 2)
                    price += (days - 2) * 1.5;
            break;
            case Movie.NEW_RELEASE:
                price += days * 3;
            break;
            case Movie.CHILDRENS:
                price += 1.5;
                if (days > 3)
                    price += (days - 3) * 1.5;
            break;
        }
        return price;

    }

    public int frequentRentRelease(int days){
        int frequent = 0;
        if (( _priceCode == Movie.NEW_RELEASE)
                &&
                days > 1) frequent ++;
        return frequent;

    }

}
