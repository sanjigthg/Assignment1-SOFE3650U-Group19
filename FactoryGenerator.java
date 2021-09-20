public class FactoryGenerator{
    public static AbstractFactory getFactory(boolean big){
        if(big){
            return new BigProductFactory();
        }
        else{
            return new ProductFactory();
        }
    }
}