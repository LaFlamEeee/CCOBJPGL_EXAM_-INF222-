package Tourists;


import Locations.*;

public class Jules implements Tourist {

    static int budget = 1000;


    public void visit() {
        System.out.print("pahinga day");
    }

    public void visit(Boracay boracay) {
        System.out.println("my budget is" + getBudget());

        if ( budget > boracay.airFare  ){
            System.out.println("lets get on Vacation" );
            budget -= boracay.airFare;

        }else{
            System.out.println("I dont have money left");
        }

      checkBudget();

    }

    public void visit(Bohol bohol) {

        if(budget >bohol.airFare){
            System.out.println("lets go to bohol");
            budget -= bohol.airFare;
        }else{
            System.out.println("I have no money left");
        }

        checkBudget();
    }
    public void visit(Cebu cebu) {
        if(budget >cebu.airFare){
            System.out.println("next stop cebu!");
            budget -= cebu.airFare;
        }else{
            System.out.println("im broke bruh");
        }

        checkBudget();
    }

    public void visit(Palawan palawan) {
        if(budget >palawan.airFare){
            System.out.println("next stop palawan!");
            budget -= palawan.airFare;
        }else{
            System.out.println("im broke bruh");
        }

        checkBudget();
    }

    public void visit(Siargao siargao) {
        if(budget >siargao.airFare){
            System.out.println("next stop siargao!");
            budget -= siargao.airFare;
        }else{
            System.out.println("im broke bruh");
        }

        checkBudget();
    }

    public void visit(Vigan vigan) {
        if(budget >vigan.airFare){
            System.out.println("next stop vigan! ");
            budget -= vigan.airFare;
        }else{
            System.out.println("im broke bruh");
        }

        checkBudget();
    }

    public void checkBudget() {
        System.out.println("my budget is " + budget);
    }

    public static int getBudget() {
        return budget;
    }


}