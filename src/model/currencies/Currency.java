package model.currencies;

public abstract class Currency {
    private String name;
    private String acronym;
    private String country;

    public Currency(String name, String acronym, String country) {
        this.name = name;
        this.acronym = acronym;
        this.country = country;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return String return the acronym
     */
    public String getAcronym() {
        return acronym;
    }

    /**
     * @return String return the country
     */
    public String getCountry() {
        return country;
    }
}