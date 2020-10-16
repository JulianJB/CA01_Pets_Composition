class Bone {
    // Attributes of a bone
    String printString;

    // Constructor of the bone class, initialises the printString
    Bone() {
        printString = "$==$";
    }

    @Override
    public String toString() {
        return printString;
    }
}