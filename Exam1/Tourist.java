public interface Tourist {
    int budget = 0;

    void visit (Boracay boracay);

    void visit (Palawan palawan);

    void visit (Baguio baguio);

    void visit (LaUnion laUnion);

    void visit (Sagada sagada);

    default void visit (Locations locations){
        System.out.println("Arrived on location");
    }

    void checkBudget();
}
