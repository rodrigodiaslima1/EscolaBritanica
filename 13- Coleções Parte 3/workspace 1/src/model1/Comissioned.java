package model1;

public class Comissioned extends Employee {

    double totalSold;
    double commissionFee;

    public double getTotalSold(){
        return this.totalSold;
    }

    public double getCommissionFee(){
        return this.commissionFee;
    }

    public void setTotalSold(double totalSold){
        this.totalSold = totalSold;
    }

    public void setCommissionFee(double commissionFee){
        this.commissionFee = commissionFee;
    }

    public double salary(){
        return totalSold - commissionFee;
    }

}
