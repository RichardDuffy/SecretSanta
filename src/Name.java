import java.util.ArrayList;
import java.util.Random;

public class Name {
    // Private member variables.
    private ArrayList<String> name = new ArrayList<>();
    private Random random = new Random();

    /**
     * Reads in the list of names.
     */
    public Name() {
        readInNames();
    }

    /**
     * This method reads in the name of the persons.
     */
    private void readInNames() {
        /*
            Replace this with your own list of names.
            If you type them out make sure they are comma
            delimited. I would recommend using an online
            string comma delimiting tool to save time.
         */
        String names[] = "Chery  ,Alexia  ,Maira  ,Jinny  ,Elli  ,Norah  ,Versie  ,Rudy  ,Detra  ,Quiana".split(",");
        for(String s :  names) {
            if(!s.equals(",")) {
                name.add(s);
            }
        }
    }

    /**
     * This method gets a random name from the arraylist of names.
     * @return Random Name.
     */
    public String randomName() {
        return name.get(random.nextInt(name.size() - 0) + 0);
    }
}
