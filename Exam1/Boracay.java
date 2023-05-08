    public class Boracay implements Locations {

        int airFare = 100;
    
        public int getFare(){
            return airFare;
        }
        
        @Override
        public void accept(Tourist tourist) {
            tourist.visit(this);
        }
    }

