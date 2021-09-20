import java.io.*;
import java.util.*;

public class Net implements Product {

    @Override
    public void assign() {
        String cost ="error";
        try {
            File myObj = new File("database.txt");
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNext()) {
                String word  = myReader.next();
                if(word.equalsIgnoreCase("net")){
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