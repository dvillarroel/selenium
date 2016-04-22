package task;

/**
 * Created by Administrator on 4/21/2016.
 */
public class NewRelease extends Movie {


    public NewRelease() {
        super();
    }

    public NewRelease(String title) {
        super(title);

    }

    @Override
    public double calculatePrice(int days) {

        return days * 3;
    }

    @Override
    public int frequentRentRelease(int days) {
        int frequent = 0;
        if (days > 1) frequent++;

        return frequent;

    }
}
