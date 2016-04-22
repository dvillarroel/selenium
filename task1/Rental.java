package task;

class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int calculateRent(int days) {
        return daysRented * days;
    }

    public double calculatePriceMovieByDays(int days) {
        return movie.calculatePrice(days);
    }

    public int frequetRenter(int days) {
        return movie.frequentRentRelease(days);
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

}