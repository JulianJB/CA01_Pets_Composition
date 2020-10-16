class Person {
    // Attributes of a person
    String personName;
    Pet personPet; // Object composition, in this case a person has a pet

    // Constructor of the person class, requires a name as a parameter
    Person(String personName) {
        this.personName = personName;
    }

    // Setter for a person's pet
    void setPersonPet(Pet personPet) {
        this.personPet = personPet;
    }

    // Getter for a person's pet
    Pet getPersonPet() {
        return personPet;
    }

    @Override
    public String toString() {
        // Returning the person's name
        String printString;
        printString = "Hello my name is: " + personName;
        return printString;
    }
}