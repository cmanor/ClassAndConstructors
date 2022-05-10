public class Product {
    private float cost;
    private int quantity;
    private String productName;

    public Product(float cost, int quantity, String productName){
        this.cost = cost;
        this.quantity = quantity;
        this.productName = productName;
    }
    public void totalCost(){
        float bill = quantity * cost;
        System.out.println("Total cost is: " + bill);
    }

    public void printProduct(){
        System.out.println("1 " + productName + " costs " + cost
        + " and " + quantity + " units were purchased");
    }
}
