
package Assignment.Customer;


public class Customer {
    
    private String firstName;
    private String lastName;
    
    public Customer(String fN, String lN){
        this.firstName = fN;
        this.lastName = lN;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
}
