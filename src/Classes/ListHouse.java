//----------------------------------------------------------------------------
// ListHouse.java by Dale/Joyce/Weems Chapter 3
//
// Provides elements for a list of house information
//----------------------------------------------------------------------------
package Classes;

public class ListHouse implements Listable {
// House information

    private String lastName;
    private String firstName;
    private int lotNumber;
    private String price;
    private String squareFeet;
    private String bedRooms;

    public ListHouse(String lastName, String firstName, int lotNumber, String price, String squareFeet, String bedRooms) 
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.lotNumber = lotNumber;
        this.price = price;
        this.squareFeet = squareFeet;
        this.bedRooms = bedRooms;
    }

    public Listable copy() // Returns a copy of this ListHouse
    {
        ListHouse result = new ListHouse(lastName, firstName, lotNumber, price, squareFeet, bedRooms);
        return result;
    }

    public int compareTo(Listable otherListHouse) // Houses are compared based on their lot numbers
    {
        ListHouse other = (ListHouse) otherListHouse;
        return (this.lotNumber - other.lotNumber);
    }
// Observers

    public String lastName() {
        return lastName;
    }

    public String firstName() {
        return firstName;
    }

    public int lotNumber() {
        return lotNumber;
    }

    public String price() {
        return price;
    }

    public String squareFeet() {
        return squareFeet;
    }

    public String bedRooms() {
        return bedRooms;
    }
}
