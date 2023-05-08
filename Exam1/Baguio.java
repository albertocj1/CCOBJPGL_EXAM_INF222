public class Baguio implements Locations {
    int airFare = 50;

    public int getFare(){
        return airFare;
    }

    @Override
        public void accept(Tourist tourist) {
            tourist.visit(this);
        }
}
