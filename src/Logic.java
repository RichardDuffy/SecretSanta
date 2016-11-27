public class Logic {
    /**
     * This method is the whole logic of the program.
     * It ensures that the returned name is not the same
     * as the name given in the arguments.
     * @param name
     * @param in
     */
    public void checkName(Name name, String in) {
        // Generate a random name.
        String genName = name.randomName();
        // If in is not equal to genName then return a generated name.
        if(!in.equals(genName)) {
            System.out.println("Your person is: " + genName + ".");
        } else {
            // Otherwise do a recursive call to this method.
            checkName(name, in);
        }
    }
}
