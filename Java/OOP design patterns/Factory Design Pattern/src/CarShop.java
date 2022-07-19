public class CarShop {
    public static void main(String[] args)
    {
        Car renault = CarFactory.getCar("Renault","tenK",90);

        System.out.println("Renault özellikleri");
        System.out.println(renault);

        Car ford = CarFactory.getCar("Ford","nineK",120);
        System.out.println("Ford özellikleri");
        System.out.println(ford);

    }
}
