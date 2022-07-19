public class HouseAgent2 {
    public static void main(String[] args)
    {
        House house1 = HouseBuilder.startBuild()
                .setHasPool(true)
                .setHasAutopark(false)
                .setWcCount(3)
                .setHasGarden(false)
                .setRoomCount(4)
                .setCity("LA")
                .setBuiltDate(2003)
                .setStreet("Wall")
                .setCountry("USA")
                .build();


    }
}
