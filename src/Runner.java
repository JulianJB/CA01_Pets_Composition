class Runner {

    public static void main(String[] args) {
        // Creating a cat with a fish
        Pet cat = new Cat("Fluffy", "Female");
        // Creating a dog with a bone
        Pet dog = new Dog("Baxter", "Male");
        // Creating a person with a cat
        Person personWithACat = new Person("Joe");
        // Assigning the cat to the person
        personWithACat.setPersonPet(cat);
        // Creating a person with a dog
        Person personWithADog = new Person("Mary");
        // Assigning the dog to the person
        personWithADog.setPersonPet(dog);
        // Printing the person's name and pet's information
        System.out.println(personWithACat);
        System.out.println(personWithACat.getPersonPet());
        System.out.println("\n" + personWithADog);
        System.out.println(personWithADog.getPersonPet());

        /**
         * Alternative: Using a setter for the bone instance:
         * requires a dog instance to call the setBone() method.
         * The same logic can be used for the setter for the fish instance.
         */
        /*// Creating a dog instance
        Dog dog = new Dog("Baxter", "Male");
        // Creating a bone instance
        Bone bone = new Bone();
        // Passing the bone instance to the dog
        dog.setBone(bone);
        // Assigning the dog instance to the person
        personWithADog.setPersonPet(dog);
        // Printing the person's name and pet's information
        System.out.println(personWithADog.getPersonPet());*/

        System.exit(0);
    }
}