public class HouseBuilder {
    private String street;
    private String country;
    private String city;

    private int builtDate;
    private int roomCount;
    private int wcCount;

    private boolean hasGarden;
    private boolean hasAutopark;
    private boolean hasPool;

    public static HouseBuilder startBuild()
    {
        return new HouseBuilder();
    }

    public House build()
    {
        House house = new House();

        setStreet(street);
        setCountry(country);
        setCity(city);

        setBuiltDate(builtDate);
        setRoomCount(roomCount);
        setWcCount(wcCount);

        setHasGarden(hasGarden);
        setHasAutopark(hasAutopark);
        setHasPool(hasPool);

        return house;
    }

    public HouseBuilder setStreet(String street) {
        this.street = street;
        return this;
    }

    public HouseBuilder setCountry(String country) {
        this.country = country;
        return this;

    }

    public HouseBuilder setCity(String city) {
        this.city = city;
        return this;

    }

    public HouseBuilder setBuiltDate(int builtDate) {
       this.builtDate = builtDate;
        return this;

    }

    public HouseBuilder setRoomCount(int roomCount) {
        this.roomCount = roomCount;
        return this;

    }

    public HouseBuilder setWcCount(int wcCount) {
        this.wcCount = wcCount;
        return this;

    }

    public HouseBuilder setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
        return this;

    }

    public HouseBuilder setHasAutopark(boolean hasAutopark) {
        this.hasAutopark = hasAutopark;
        return this;

    }

    public HouseBuilder setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
        return this;

    }
}
