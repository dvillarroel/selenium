package task;

class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public int calculateRent(int days) {
        return _daysRented * days;
    }

    public Movie getMovie() {
        return _movie;
    }

    public double calculatePriceMovieByDays() { return _movie.calculatePrice(_daysRented); }

    public int frequetRenter() { return _movie.frequentRentRelease(_daysRented); }

}