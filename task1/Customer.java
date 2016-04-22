package task;

import java.util.ArrayList;
import java.util.List;

class Customer {
    private final String name;
    private List<Rental> rentals;
    private Printer print;
    private double totalAmount;
    private int frequentRenterPoints;


    public Customer(String name) {

        this.name = name;
        rentals = new ArrayList();
        print = new Printer();
        totalAmount = 0;
        frequentRenterPoints = 0;
        print.addResult("Rental Record for " + name + "\n");
    }

    public void addRental(Rental arg) {

        rentals.add(arg);
        totalAmount += arg.calculatePriceMovieByDays(arg.getDaysRented());
        frequentRenterPoints += arg.frequetRenter(arg.getDaysRented());
        print.addResult("\t" + arg.getMovie().getTitle() + "\t" +
                String.valueOf(arg.calculatePriceMovieByDays(arg.getDaysRented())) + "\n");
    }

    public String statement() {

        print.addResult("Amount owed is " + String.valueOf(totalAmount) + "\n");
        print.addResult("You earned " + String.valueOf(frequentRenterPoints) +
                " frequent renter points");
        ;
        return print.getResult();
    }


    public String getName() {
        return name;
    }
}
