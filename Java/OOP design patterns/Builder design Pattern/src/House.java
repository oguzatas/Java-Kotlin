public class House {
    private String street;
    private String country;
    private String city;

    private int builtDate;
    private int roomCount;
    private int wcCount;

    private boolean hasGarden;
    private boolean hasAutopark;
    private boolean hasPool;

    public House()
    {

    }
    public House(String street, String country, String city, int builtDate, int roomCount, int wcCount, boolean hasGarden, boolean hasAutopark, boolean hasPool) {
        this.street = street;
        this.country = country;
        this.city = city;
        this.builtDate = builtDate;
        this.roomCount = roomCount;
        this.wcCount = wcCount;
        this.hasGarden = hasGarden;
        this.hasAutopark = hasAutopark;
        this.hasPool = hasPool;
    }

    @Override
    public String toString() {
        return "House{" +
                "street='" + street + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", builtDate=" + builtDate +
                ", roomCount=" + roomCount +
                ", wcCount=" + wcCount +
                ", hasGarden=" + hasGarden +
                ", hasAutopark=" + hasAutopark +
                ", hasPool=" + hasPool +
                '}';
    }

    public String getStreet() {
        return street;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public int getBuiltDate() {
        return builtDate;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public int getWcCount() {
        return wcCount;
    }

    public boolean isHasGarden() {
        return hasGarden;
    }

    public boolean isHasAutopark() {
        return hasAutopark;
    }

    public boolean isHasPool() {
        return hasPool;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setBuiltDate(int builtDate) {
        this.builtDate = builtDate;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public void setWcCount(int wcCount) {
        this.wcCount = wcCount;
    }

    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    public void setHasAutopark(boolean hasAutopark) {
        this.hasAutopark = hasAutopark;
    }

    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }
}
