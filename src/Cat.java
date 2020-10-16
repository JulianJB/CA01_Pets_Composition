class Cat extends Pet {
    // Attributes of a cat
    Fish fish; // Object composition, in this case a cat has a fish

    Cat(String catName, String catGender) {
        super(catName, catGender);
        // A cat has "meoh" as a pet sound, so set it directly in the constructor
        petSound = "meoh";
        // A cat has a fish, so initialise a fish instance
        fish = new Fish();
    }

    @Override
    public String toString() {
        // Printing the pet's information
        String printString;
        printString = "My pet is: a cat \nits name is: " + petName + "\nits gender is: " + petGender
                + "\nits sound is: " + petSound + "\nand its favorite food is: " + fish;
        return printString;
    }

    /**
     * Alternative: Using a setter for the fish instance
     * requires a cat instance to call the setFish() method
     */
    /*void setFish(Fish fish) {
        this.fish = fish;
    }*/
}