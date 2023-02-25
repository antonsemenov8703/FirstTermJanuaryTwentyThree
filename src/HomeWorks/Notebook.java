package HomeWorks;

public class Notebook {

    String brand;
    int coast;
    int ram;
    int memory;
    int idNumber;

    public Notebook(String brand, int coast,  int ram, int memory, int idNumber) {
        this.brand = brand;
        this.coast = coast;
        this.ram = ram;
        this.memory = memory;
        this.idNumber = idNumber;
    }
    public int getCoast() {
        return coast;
    }

    @Override
    public String toString() {
        return "Ноутбук - %s, цена - %d $, ОЗУ - %d GB, объём HDD - %d GB, id - %d".formatted(this.brand, this.coast, this.ram, this.memory, this.idNumber);
    }
}
