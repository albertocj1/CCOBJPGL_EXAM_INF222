public class Palawan implements Locations{
    int airFare = 500;

    public int getFare(){
        return airFare;
    }

    @Override
    public void accept(Tourist tourist){
        tourist.visit(this);
    }
}
