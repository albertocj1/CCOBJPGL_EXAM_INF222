public class Sagada implements Locations{
    int airFare = 400;

    public int getFare(){
        return airFare;
    }

    @Override
        public void accept(Tourist tourist) {
            tourist.visit(this);
        }
}
