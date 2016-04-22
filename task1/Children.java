package task;

/**
 * Created by Administrator on 4/21/2016.
 */
public class Children extends Movie {

    public Children(){
        super();
    }

    public Children(String title)
    {
        super(title);

    }

    @Override
    public double calculatePrice(int days) {

        double price = 1.5;
        if (days > 3)
            price += (days - 3) * 1.5;
        return price;
    }

    @Override
    public int frequentRentRelease(int days) {
        return 0;
    }

}
