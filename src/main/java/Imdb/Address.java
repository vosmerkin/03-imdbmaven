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

//    @Override
//    public boolean equals(Object o) {
//        boolean retVal = false;
//        if (o instanceof Imdb.Imdb.Address) {
//            Imdb.Imdb.Address address = new Imdb.Imdb.Address();
//            address = (Imdb.Imdb.Address) o;
//            retVal = (address.city.equals(this.city) | address.street.equals(this.street) | address.app.equals(this.app));
//        }
//        return retVal;
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 17 * hash + this.city.hashCode();
//        hash = 17 * hash + this.street.hashCode();
//        hash = 17 * hash + this.app.hashCode();
//        return hash;
//    }

}
