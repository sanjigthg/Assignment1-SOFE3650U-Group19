public class ProductFactory extends AbstractFactory{
    @Override
    public Product getProduct(String productType){
        if(productType.equalsIgnoreCase("NET")){
            return new Net();
        }
        else if(productType.equalsIgnoreCase("BALL")){
            return new Ball();
        }
        return null;
    }
}