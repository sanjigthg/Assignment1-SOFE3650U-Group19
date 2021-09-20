import java.util.Scanner;
public class Test{
    public static void main(String[] args){
        int product=0, size=0;
        String productS;
        boolean sizeS = false;
        Scanner in = new Scanner(System.in);
        while(product != 1 && product != 2) {
            System.out.println("Would you like to buy a 1.ball or 2.net?(Please input 1 or 2)");
            product = in.nextInt();
        }
        if(product == 1)
            productS = "ball";
        else
            productS = "net";
        while(size != 1 && size != 2){
            System.out.println("Would you like it to be 1.Big or 2.Regular Size(Please input 1 or 2)");
            size = in.nextInt();
        }
        if(size == 1)
            sizeS = true;

        AbstractFactory ProductFactory = FactoryGenerator.getFactory(sizeS);
        Product product1 = ProductFactory.getProduct(productS);
        product1.assign();
    }

}