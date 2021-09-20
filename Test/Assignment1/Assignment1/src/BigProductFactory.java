public class BigProductFactory extends AbstractFactory{

    @Override
    public Product getProduct(String productType){
        if(productType.equalsIgnoreCase("NET")){
            return new BigNet();
        }
        else if(productType.equalsIgnoreCase("BALL")){
            return new BigBall();
        }
        return null;
    }
}