public class Renault implements Car {
    String model;
    String weight;
    int engine;

    public Renault(String model, String weight, int engine) {
        this.model = model;
        this.weight = weight;
        this.engine = engine;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getWeight() {
        return weight;
    }

    @Override
    public int getEngine() {
        return engine;
    }

}
