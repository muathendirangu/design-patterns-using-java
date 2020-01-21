package com.muathendirangu.behavioral.chainofresponsibility;

public abstract class Account {
    protected Account successor;
    protected float balance;

    public Account(float balance){
        this.balance = balance;
    }

    public Account setSuccessor(Account account){
        this.successor = account;
        return this.successor;
    }

    public void pay(float amount) throws Exception {
        System.out.println(this.canPay(amount));

        if (this.canPay(amount)){
            System.out.printf("Paid %s using %s ", amount,this);
        } else if(this.successor != null){
            System.out.printf("unable to pay  via %s proceed to pay via the method %s", this, this.successor);
            this.successor.canPay(amount);
        }else{
            throw new Exception();
        }
    }

    public boolean canPay(float amountToPay){
        System.out.println(this.balance);
        System.out.println(amountToPay);
        if (this.balance >= amountToPay){
            return true;
        }
        return false;
    }
}
