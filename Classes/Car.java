package Classes;

public class Car {
    int vin;
    String maker;
    String model;
    String trim;
    int year;

    public Car(int vin, String maker, String model, String trim, int year) {
        this.vin = vin;
        this.maker = maker;
        this.model = model;
        this.trim = trim;
        this.year = year;
    }

    public int getVIN()
    {
        return this.Vin;
    }

    public void setVin(int vin)
    {
        this.Vin = vin;
    }

    public boolean equals(Car that)
    {
        return this.Vin == that.Vin;
    }

    public boolean isBEtterThan(Car that)
    {
        this.maker.equals(that.maker) && this.model.equals(that.model) this.trim.equals(that.trim) && this.year <= that.year;
    }
}
