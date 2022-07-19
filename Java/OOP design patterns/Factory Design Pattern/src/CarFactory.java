public class CarFactory {

    //Disadvantage:If we had a lot of models, we'd to write (lots of) else if's for each model.
    //To avoid this, check Abstract Factory Design
    /* Abstract Factory design =>
    Use an interface for Factory and create different factories for each model of cars. */
    public static Car getCar(String model, String weight, int engine)
    {
        Car car;
        if("Renault".equalsIgnoreCase(model))
        {
            car = new Renault(model, weight, engine);
        }
        else if ("Ford".equalsIgnoreCase(model))
        {
            car = new Ford(model, weight, engine);
        }
        else
        {
            throw new RuntimeException("Not a valid model");
        }
        return car;
    }
}
