public class Address {
    private String houseNumber;
    private String street;
    private String city;

    public Address(String houseNumber, String street, String city){
    this.houseNumber = houseNumber;
    this.street = street;
    this.city = city;
    }

    public String getCity(){

        return this.city;
    }
}