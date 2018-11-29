package pl.a202273.creditcard;

import org.junit.Assert;
import org.junit.Test;

public class CreditCardApiTest{
    private final static double initialCredit=200;
    private final static String cardNumber= "123456789";
    private CreditCardApi api;
    private CreditCardPool creditCardPool;

    
    @Test
    public void handleWithDraw(){
        thereIsCreditCardPool();
        thereIsCreditCardApi();
        thereIsCardWithNumber(cardNumber);
        
        api.withdraw(cardNumber, 20);
        
        saldoOfCreditCardWithIdEquals(cardNumber, 180);
    }
    
    private void thereIsCreditCardApi(){
        this.api = new CreditCardApi();
    }
    
    private void thereIsCardWithNumber(String cardNumber){
        CreditCard card = new CreditCard(cardNumber);
        card.assignLimit(initialCredit);


        
    }
    
    private void saldoOfCreditCardWithIdEquals(String cardNumber, double expectedBalance){
        CreditCard c = new CreditCard(cardNumber);



        //Assert.assertEquals();
    }
    
    private void thereIsCreditCardPool(){
        this.creditCardPool = new CreditCardPool ();
    }
    
    public void handleRepay(){
        CreditCard c = new CreditCard(cardNumber);
        c.assignLimit(initialCredit);
        
        c.repay(200);
        Assert.assertEquals(c.getBalance(), 400 );
    }
}