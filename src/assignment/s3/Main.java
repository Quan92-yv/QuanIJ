package assignment.s3;

public class Main {
    public static void main(String[] args){
        Product p1 = new Product();
        p1.setId(1);
        p1.setProductName("xe exciter");
        p1.setPrice(2100);
        p1.setQty(3);

        Product p2 = new Product();
        p2.setId(2);
        p2.setProductName("ao swe");
        p2.setPrice(17);
        p2.setQty(3);

        Cart c = new Cart();
        c.setId(1);
        c.setCustomer("Tran Duy 92");
        c.setCity("HP");

        c.addProduct(p1);
        c.addProduct(p1);
        c.addProduct(p1);
        c.addProduct(p2);
        c.addProduct(p2);

        System.out.println("Tong tien phai tra: "+c.calculateGrandTotal());
        System.out.println("Ds san pham da mua:");
        for(Product p:c.productList){
            System.out.println(p.getProductName()+"----"+p.getPrice());
        }
    }
}