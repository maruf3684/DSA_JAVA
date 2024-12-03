package SOLID.SingleResPrinciple;

import java.util.ArrayList;
import java.util.List;

//class a change korar single reason nai. onek reason ache. product depertment,accounting depertment 2 jon e change korte pare aikhane

public class OrderDepertment {
    List<Object> products;
    public OrderDepertment(){
        this.products = new ArrayList<>();
    }

    public void addProduct(Object product){
        products.add(product);
    }

    public void removeProduct(Object product){
        products.removeLast();
    }

    public List<Object> getProducts() {
        return products;
    }

    public void printinvoicee(){
        for(Object product : products){
            System.out.println(product);
        }
    }
}
