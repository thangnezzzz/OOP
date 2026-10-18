import junit.framework.TestCase;

 public class CoffeeReceipt {
     private String kind;
     private double pricePerPound;
     private double weight;

     public CoffeeReceipt(String kind, double pricePerPound, double weight) {
         this.kind = kind;
         this.pricePerPound = pricePerPound;
         this.weight = weight;
     }

     //to compute the total cost of this coffee purchase [in cents]
     public double sellingCost() {
         return this.pricePerPound * this.weight;
     }
     public boolean weighsMore (double amount){
         return this.weight > amount;
     }
     public boolean isCheaperThan(CoffeeReceipt that){
         return this.pricePerPound < that.pricePerPound;
     }
     public boolean costLessThan(CoffeeReceipt that){
         return this.sellingCost() < that.sellingCost();
     }
 }

