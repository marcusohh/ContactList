package sg.edu.rp.c346.contactlist;

/**
 * Created by 16020089 on 23/7/2018.
 */

public class Contactitem {

    private String name;
    private String countrycode;
    private Integer number;

    public Contactitem(String name, String countrycode, Integer number) {
        this.name = name;
        this.countrycode = countrycode;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Contactitem{" +
                "name='" + name + '\'' +
                ", countrycode='" + countrycode + '\'' +
                ", number=" + number +
                '}';
    }
}
