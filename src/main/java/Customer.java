public class Customer {

    private String name;
    private int wallet;

//    Constructor
    public Customer(String inputName, int inputWallet){
    this.name = inputName;
    this.wallet = inputWallet;

    }

//     Getters & Setters
    public String getName(){
        return this.name;
    }

    public int getWallet(){
        return this.wallet;
    }

} //last curly brackets
