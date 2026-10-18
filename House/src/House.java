public class House {
    private String kind;
    private int nRooms;
    private Address address;
    private double price;

    public House(String kind, int nRooms, Address address, double price) {
        this.kind = kind;
        this.nRooms = nRooms;
        this.address = address;
        this.price = price;
    }

    public boolean hasMoreRooms(House that){

        return this.nRooms > that.nRooms;
    }

    public boolean inThisCity(String thatCity) {

        return this.address.getCity().equals(thatCity);
    }

    public boolean sameCity(House that) {
        return this.address.getCity().equals(that.address.getCity());
    }
}