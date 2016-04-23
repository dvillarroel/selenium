package task1;

/**
 * Created by Administrator on 4/21/2016.
 */
public class Regular extends Movie {

    public Regular(String title) {
        super(title);

    }

    @Override
    public double calculatePrice(int days) {
        double price = 2;
        if (days > 2)
            price += (days - 2) * 1.5;
        return price;
    }

    @Override
    public int frequentRentRelease(int days) {
        return 0;
    }
}
