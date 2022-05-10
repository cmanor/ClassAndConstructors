import org.jetbrains.annotations.NotNull;

public class Product {
    private float cost;
    private int quantity;
    private String productName;

    public Product(float cost, int quantity, String productName){
        this.setCost(cost);
        this.setQuantity(quantity);
        this.setProductName(productName);
    }
    public void totalCost(){
        float bill = quantity * cost;
        System.out.println("Total cost is: " + bill);
    }

    public void printProduct(){
        System.out.println("1 " + productName + " costs " + cost
        + " and " + quantity + " units were purchased");
    }

    public void setCost(float cost) {
        if (cost <0)
            throw new IllegalArgumentException("Cost must be equal or greater to 0");
        this.cost = cost;
    }

    public void setQuantity(int quantity) {
        if (quantity <0)
            throw new IllegalArgumentException("Quantity must be equal or greater to 0");
        this.quantity = quantity;
    }

    public void setProductName(@NotNull String productName) {
        if (productName.equals(""))
            throw new IllegalArgumentException("Product must have a name");
        this.productName = productName;
    }
}
