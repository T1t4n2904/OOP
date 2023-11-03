interface MarketItem {
    void recordSales(double saleAmount);
    double calculateTotalSales();
}

class Hardware implements MarketItem {
    private String category;
    private String manufacturer;
    private double totalSalesLast3Months;
    private double salesMonth1;
    private double salesMonth2;
    private double salesMonth3;

    public Hardware(String category, String manufacturer) {
        this.category = category;
        this.manufacturer = manufacturer;
        this.totalSalesLast3Months = 0.0;
        this.salesMonth1 = 0.0;
        this.salesMonth2 = 0.0;
        this.salesMonth3 = 0.0;
    }

    @Override
    public void recordSales(double saleAmount) {
        totalSalesLast3Months -= salesMonth3;
        salesMonth3 = salesMonth2;
        salesMonth2 = salesMonth1;
        salesMonth1 = saleAmount;
        totalSalesLast3Months += saleAmount;
    }

    @Override
    public double calculateTotalSales() {
        return totalSalesLast3Months;
    }

    public void description(){
        System.out.println(category+"\n"+manufacturer);
    }
}

class Software implements MarketItem {
    private String softwareType;
    private String operatingSystem;
    private double totalSalesLast3Months;
    private double salesMonth1;
    private double salesMonth2;
    private double salesMonth3;

    public Software(String softwareType, String operatingSystem) {
        this.softwareType = softwareType;
        this.operatingSystem = operatingSystem;
        this.totalSalesLast3Months = 0.0;
        this.salesMonth1 = 0.0;
        this.salesMonth2 = 0.0;
        this.salesMonth3 = 0.0;
    }

    @Override
    public void recordSales(double saleAmount) {
        totalSalesLast3Months -= salesMonth3;
        salesMonth3 = salesMonth2;
        salesMonth2 = salesMonth1;
        salesMonth1 = saleAmount;
        totalSalesLast3Months += saleAmount;
    }

    @Override
    public double calculateTotalSales() {
        return totalSalesLast3Months;
    }

    public void description(){
        System.out.println(softwareType+"\n"+operatingSystem);
    }
}

public class Main{
    public static void main(String args[]){
        Hardware hardware = new Hardware("Laptop", "Lenovo");
        hardware.recordSales(100);
        hardware.recordSales(1000);
        hardware.recordSales(1000);
        hardware.recordSales(500);       
        System.out.println("\nHARDWARE"); 
        hardware.description();
        System.out.println(hardware.calculateTotalSales());

        Software software = new Software("Laptop", "Windows");
        hardware.recordSales(100);
        hardware.recordSales(1000);
        hardware.recordSales(1000);
        hardware.recordSales(500);        
        System.out.println("\nSOFTWARE"); 
        hardware.description();
        System.out.println(hardware.calculateTotalSales());
    }
}