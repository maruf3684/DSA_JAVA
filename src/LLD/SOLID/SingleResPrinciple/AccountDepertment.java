package LLD.SOLID.SingleResPrinciple;

import java.util.List;

public class AccountDepertment {
    public void printinvoicee(List<Object> products){
        for(Object product : products){
            System.out.println(product);
        }
    }
}
