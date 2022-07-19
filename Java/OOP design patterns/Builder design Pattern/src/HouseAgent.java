public class HouseAgent {
    public static void main(String args[])
    {
        House house1 = new House();

        house1.setCity("Istanbul");
        house1.setBuiltDate(2008);
        house1.setHasAutopark(true);
        house1.setHasGarden(true);
        house1.setHasPool(false);
        house1.setWcCount(2);
        house1.setRoomCount(4);


        House house2 = new House("Black","USA","New York",2010,3,1,true,false,true);

        printHouse(house1);
        printHouse(house2);


    }

    private static void printHouse(House house)
    {
        System.out.println();
        System.out.println("House added ->" + house);
    }
}
