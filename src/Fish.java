class Fish {
    // Attributes of a fish
    String printString;

    // Constructor of the fish class, initialises the printString
    Fish() {
        printString = "}==*->";
    }

    @Override
    public String toString() {
        return printString;
    }
}