public class Car {
    //Atributos
    private String brand;
    private String model;
    private int year;
    private boolean isOn;
    //Getter, Setters y Constructor

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.isOn = false;
    }

    //Funciones
    public boolean startEngine() {
        if (this.isOn) {
            System.err.println("El coche ya esta encendido");
        } else {
            this.isOn = true;
            System.out.println("Encendiendo el coche " + this.brand + " " + this.model + " " + this.year);
        }

        return this.isOn;
    }

    public boolean stopEngine() {
        if (!this.isOn) {
            System.err.println("El coche ya esta apagado");
        }else {
            this.isOn = false;
            System.out.println("Apagando el coche " + this.brand + " " + this.model + " " + this.year);
        }

        return this.isOn;
    }

}
