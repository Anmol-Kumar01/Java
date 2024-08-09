class Account {

    private int id = 10;
    private double balance = 25;


    Account() {
        System.out.println("Basic Constructor called");
    }

    Account(int newId, double NewBalance) {
        id = newId;
        balance = NewBalance;
        System.out.println(" Parameteric Constructor is called");
    }
    
    Account (Account obj) {
        this.id = obj.getid();
        this.balance = obj.getbalance();
        System.out.println("Copy constructor is called");

    }
    public void setid( int newId ) {
        id = newId;
    }

    public void setBalance( double NewBalance) {
        this.balance = NewBalance;

    }

    public int getid() {
        return id;
    }
    
    public double getbalance() {
        return balance;
    }

}
