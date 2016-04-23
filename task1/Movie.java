package task1;

public abstract class Movie {

    private String title;


    public Movie() {
    }

    public Movie(String title) {
        this.title = title;

    }

    public abstract double calculatePrice(int days);

    public abstract int frequentRentRelease(int days);

    public String getTitle() {
        return title;
    }

}
