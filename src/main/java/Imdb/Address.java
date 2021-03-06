package Imdb;


public class Address {

    String city;
    String street;
    Integer app;

    public Address(String city, String street, int app) {
        this.city = city;
        this.street = street;
        this.app = app;
    }

    public Address() {
        String city;
        String street;
        int app;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getApp() {
        return app;
    }

    public void setApp(Integer app) {
        this.app = app;
    }

    public String toString() {
        return city + ":" + street + ":" + app.toString();
    }


    public boolean equals_search(Object o) {
        boolean retVal = false;
        if (o instanceof Address) {
            Address address = new Address();
            address = (Address) o;
            retVal = (address.city.toLowerCase().equals(this.city.toLowerCase()) && address.street.toLowerCase().equals(this.street.toLowerCase()) && address.app.equals(this.app));
        }
        return retVal;
    }

//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 17 * hash + this.city.hashCode();
//        hash = 17 * hash + this.street.hashCode();
//        hash = 17 * hash + this.app.hashCode();
//        return hash;
//    }

}
