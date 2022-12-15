package prak13;

import java.util.StringTokenizer;

public class address {
    String country;
    String region;
    String city;
    String street;
    String house;
    String building;
    String flat;

    public address() {
    }

    @Override
    public String toString() {
        return "Address{" + "country='" + country + '\'' + ", region='" + region + '\'' + ", city='" + city + '\'' + ", street='" + street + '\'' + ", house='" + house + '\'' + ", building='" + building + '\'' + ", flat='" + flat + '\'' + '}';
    }

    public void setAddress1(String address){
        String[] addressParts = address.split(", ");
        this.country = addressParts[0];
        this.region = addressParts[1];
        this.city = addressParts[2];
        this.street = addressParts[3];
        this.house = addressParts[4];
        this.building = addressParts[5];
        this.flat = addressParts[6];
    }
    public void setAddress2(String address) {
        StringTokenizer st = new StringTokenizer(address, ",.;");
        this.country = st.nextToken();
        this.region = st.nextToken();
        this.city = st.nextToken();
        this.street = st.nextToken();
        this.house = st.nextToken();
        this.building = st.nextToken();
        this.flat = st.nextToken();
    }
}