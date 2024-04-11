class Product {
    private String name;
    private int unitNumber;

    public Product(String name, int unitNumber) {
        this.name = name;
        this.unitNumber = unitNumber;
    }

    public String getName() {
        return name;
    }

    public int getUnitNumber() {
        return unitNumber;
    }

    public void addUnits(int units) {
        unitNumber += units;
    }

    @Override
    public String toString() {
        return "Product name: " + name + " and Unit Number: " + unitNumber;
    }
}