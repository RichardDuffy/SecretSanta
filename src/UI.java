import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This class is the user interface of the program.
 * It enables users to interact with the program and
 * does not control logic.
 */
public class UI {
    // Private member variables
    private BufferedReader br ;
    private String input;
    private Name name;
    private Logic logic;
    // Make sure all of these methods are initialised in the correct order to avoid problems.
    // Also ensure that it throws an IOException because of the buffered reader.
    public UI() throws IOException{
        // Assign name to a new Name object.
        this.name = new Name();
        // Assign logic to a new Logic object.
        this.logic =  new Logic();
        // Initialise br to a new BufferedReader
        this.br = new BufferedReader(new InputStreamReader(System.in));
        askQuestion();
    }

    /**
     * This method asks the user to input their name.
     * It runs trough a do-while loop. It is running
     * while true. This should not be done in production
     * but it is easier in development because you can just
     * hit the stop button. Also ensure that this throws an
     * IOException to avoid errors.
     * @throws IOException
     */
    public void askQuestion() throws IOException {
        do {
            System.out.println("Please enter your name: ");
            input = br.readLine();
            logic.checkName(name, input);
        } while(true);
    }



}
