//----------------------------------------------------------------------------
// HouseFile.java by Dale/Joyce/Weems Chapter 3
//
// Manages file "houses.dat" of real estate information
//----------------------------------------------------------------------------
package Classes;

import java.io.*;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class HouseFile // Manages file "houses.dat" of real estate information
{

    private static BufferedReader inFile;
    private static PrintWriter outFile;
    private static boolean inFileOpen = false;
    private static boolean outFileOpen = false;
    private static String inString = ""; // Holds "next" line from file
// Equals null if at end of file

    public static void reset() throws IOException // Reset file for reading
    {
        if (inFileOpen) {
            inFile.close();
        }
        if (outFileOpen) {
            outFile.close();
        }
        inFile = new BufferedReader(new FileReader("houses.dat"));
        inFileOpen = true;
        inString = inFile.readLine();
    }

    public static void rewrite() throws IOException // Reset file for writing
    {
        if (inFileOpen) {
            inFile.close();
        }
        if (outFileOpen) {
            outFile.close();
        }
        outFile = new PrintWriter(new FileWriter("houses.dat"));
        outFileOpen = true;
    }

    public static boolean moreHouses() // Returns true if file open for reading and there is still more house
    // information available in it
    {
        if (!inFileOpen || (inString == null)) {
            return false;
        } else {
            return true;
        }
    }

    public static ListHouse getNextHouse(Node nNode) throws IOException // Gets and returns house information from the house info file
    // Precondition: inFile is open and holds more house information
    {
        String lastName = "xxxxx";
        String firstName = "xxxxx";
        int lotNumber = 0;
        String price = "xxxxx";
        String squareFeet = "xxxxx";
        String bedRooms = "xxxxx";
        Element eElement = (Element) nNode;
        lastName = eElement.getAttribute("id");
        firstName = eElement.getElementsByTagName("name").item(0).getTextContent();
        lotNumber = Integer.parseInt(eElement.getElementsByTagName("age").item(0).getTextContent());
        price = eElement.getElementsByTagName("age").item(0).getTextContent();
        squareFeet = eElement.getElementsByTagName("gender").item(0).getTextContent();
        bedRooms = eElement.getElementsByTagName("name").item(0).getTextContent();
        ListHouse house = new ListHouse(lastName, firstName, lotNumber, price,
                squareFeet, bedRooms);
        
        
        
        /*String xmlValue="\nStaff id : " + eElement.getAttribute("id")+
                                "\nName : " + eElement.getElementsByTagName("name").item(0).getTextContent()+
                                "\nAge : " + eElement.getElementsByTagName("age").item(0).getTextContent()+
                                "\nRole : " + eElement.getElementsByTagName("role").item(0).getTextContent()+
                                "\nGender : " + eElement.getElementsByTagName("gender").item(0).getTextContent();*/
        return house;
    }

    public static void putToFile(ListHouse house) throws IOException // Puts parameter house information into the house info file
    // Precondition: outFile is open
    {
        outFile.println(house.lastName());
        outFile.println(house.firstName());
        outFile.println(house.lotNumber());
        outFile.println(house.price());
        outFile.println(house.squareFeet());
        outFile.println(house.bedRooms());
    }

    public static void close() throws IOException // Closes house info file
    {
        if (inFileOpen) {
            inFile.close();
        }
        if (outFileOpen) {
            outFile.close();
        }
        inFileOpen = false;
        outFileOpen = false;
    }
}
