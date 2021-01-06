import java.io.Console;

public class App {
    public static void main(String[] args) {
        Console con = System.console();

        System.out.println(" ");
        System.out.println("\n" +
                "  ______     ___       _______     _______.     ___      .______           ______ ____    ____ .______    __    __   _______ .______      \n" +
                " /      |   /   \\     |   ____|   /       |    /   \\     |   _  \\         /      |\\   \\  /   / |   _  \\  |  |  |  | |   ____||   _  \\     \n" +
                "|  ,----'  /  ^  \\    |  |__     |   (----`   /  ^  \\    |  |_)  |       |  ,----' \\   \\/   /  |  |_)  | |  |__|  | |  |__   |  |_)  |    \n" +
                "|  |      /  /_\\  \\   |   __|     \\   \\      /  /_\\  \\   |      /        |  |       \\_    _/   |   ___/  |   __   | |   __|  |      /     \n" +
                "|  `----./  _____  \\  |  |____.----)   |    /  _____  \\  |  |\\  \\----.   |  `----.    |  |     |  |      |  |  |  | |  |____ |  |\\  \\----.\n" +
                " \\______/__/     \\__\\ |_______|_______/    /__/     \\__\\ | _| `._____|    \\______|    |__|     | _|      |__|  |__| |_______|| _| `._____|\n" +
                "                                                                                                                                          \n");
        System.out.println(" ");
        System.out.println("WELCOME TO CAESAR CYPHER!!");

        while (true) {

            System.out.println(" ");
            System.out.println("Would you like to: \n 1. ENCODE \n 2. DECODE \n 3. EXIT");
            String res = con.readLine();
            int response = Integer.parseInt(res);
            String output;

            if (response == 1) {
                System.out.println("Input text to encode: ");
                String inputText = con.readLine();
                System.out.println("Enter key: ");
                int key = Integer.parseInt(con.readLine());
                Cypher cypher = new Cypher(key, inputText);
                if (cypher.isInputValid(inputText) && cypher.isKeyValid(key)) {
                    System.out.println("The encoded text is: \n"+ cypher.encode());
                }

            }else if (response==2){
                System.out.println("Input text to decode: ");
                String inputText = con.readLine();
                System.out.println("Enter key: ");
                int key = Integer.parseInt(con.readLine());
                Cypher cypher = new Cypher(key, inputText);
                if (cypher.isInputValid(inputText) && cypher.isKeyValid(key)) {
                    System.out.println("The decoded text is: \n"+ cypher.decode());
                }

            }else if ( response ==3){
                System.exit(0);
            }else{
                System.out.println("Invalid option");
            }

        }

    }
}