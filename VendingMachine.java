import java.util.List;

public class VendingMachine {

    private List<Snacks> snacks;


    public VendingMachine(List<Snacks> snacks) {
        this.snacks = snacks;
    }

    public Chocolate getChocolate(String brand){
        for (Snacks snacks : snacks){
            if (snacks instanceof Chocolate){
                if (((Chocolate)snacks).getBrand()  == brand){
                    return (Chocolate)snacks;
                }
            }
        }
        return null;
    }

}