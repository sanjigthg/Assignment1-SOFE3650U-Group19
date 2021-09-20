import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BigBall implements Product {

    @Override
    public void assign() {
        String cost ="error";
        try {
            File myObj = new File("database.txt");
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNext()) {
                String word  = myReader.next();
                if(word.equalsIgnoreCase("bigball")){
                    cost = myReader.next();
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.println("The cost is "+cost);
    }
}