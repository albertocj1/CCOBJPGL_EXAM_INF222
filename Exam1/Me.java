public class Me implements Tourist {
    
    private int budget = 1000;

   @Override
    public void visit (Boracay boracay){
        if (this.budget - boracay.getFare() < 0){
            System.out.println("Not enough budget to travel...");
        } 
        else {
            System.out.println("Enjoying Boracay...");
            budget -= boracay.getFare();
        }
        checkBudget();
    }

    @Override
    public void visit (Palawan palawan) {
        if (this.budget - palawan.getFare() < 0){
            System.out.println("Not enough budget to travel...");
        } 
        else {
            System.out.println("Enjoying Palawan...");
            budget -= palawan.getFare();
        }
        checkBudget();
    }

    @Override
    public void visit (Baguio baguio) {
        if (this.budget - baguio.getFare() < 0){
            System.out.println("Not enough budget to travel...");
        } 
        else {
            System.out.println("Enjoying Baguio...");
            budget -= baguio.getFare();
        }
        checkBudget();
    }

    @Override
    public void visit (LaUnion laUnion) {
        if (this.budget - laUnion.getFare() < 0){
            System.out.println("Not enough budget to travel...");
        } 
        else {
            System.out.println("Enjoying La Union...");
            budget -= laUnion.getFare();
        }
        checkBudget();
    }

    @Override
    public void visit (Sagada sagada) {
        if (this.budget - sagada.getFare() < 0){
            System.out.println("Not enough budget to travel...");
        } 
        else {
            System.out.println("Enjoying Sagada...");
            budget -= sagada.getFare();
        }
        checkBudget();
    }

    public void checkBudget() {
        System.out.println("My budget is " + this.budget);
        System.out.println("");
    }


}
