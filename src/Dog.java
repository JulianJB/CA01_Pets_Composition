class Dog extends Pet {
    // Attributes of a dog
    Bone bone; // Object composition, in this case a dog has a bone

    Dog(String dogName, String dogGender) {
        super(dogName, dogGender);
        // A dog has "woof" as a pet sound, so set it directly in the constructor
        petSound = "woof";
        // A dog has a bone, so initialise a bone instance
        bone = new Bone();
    }

    @Override
    public String toString() {
        // Printing the pet's information
        String printString;
        printString = "My pet is: a dog \nits name is: " + petName + "\nits gender is: " + petGender
                + "\nits sound is: " + petSound + "\nand its favorite food is: " + bone;
        return printString;
    }

    /**
     * Alternative: Using a setter for the bone instance
     * requires a dog instance to call the setBone() method
     */
    /*void setBone(Bone bone) {
        this.bone = bone;
    }*/
}