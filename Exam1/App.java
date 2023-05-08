public class App {
    public static void main(String[] args) throws Exception {

        Locations boracay = new Boracay();
        Locations palawan = new Palawan();
        Locations baguio = new Baguio();
        Locations laUnion = new LaUnion();
        Locations sagada = new Sagada();

        Tourist CJ = new Me();

        boracay.accept(CJ);
        palawan.accept(CJ);
        baguio.accept(CJ);
        laUnion.accept(CJ);
        sagada.accept(CJ);
            
        
    }
}