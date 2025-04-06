class Bank {
    void bankDetails() {
        System.out.println("This is a National Bank.");
    }
}

class Branch extends Bank {
    void branchDetails() {
        System.out.println("Branch: New York Main Branch");
    }
}

class Customer extends Branch {
    void customerDetails() {
        System.out.println("Customer Name: Eren jeager");
    }
}

public class multilevel_inheritance2 {
    public static void main(String[] args) {
        Customer c = new Customer();

        c.bankDetails();
        c.branchDetails();
        c.customerDetails();
    }
}
