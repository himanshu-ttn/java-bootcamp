package assignment;

/*
* Q1) Write a program to display values of enums using a constructor & getPrice() method (Example display house & their prices)*/
public enum House {

    BUILDER_FLOOR (5000000),
    FLAT(8000000),
    VILLA( 12000000),
    MANSION(50000000),
    SMALL_HOUSE(2000000);

    private double price;

    // :: Custom constructor ::
    House (double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

}
