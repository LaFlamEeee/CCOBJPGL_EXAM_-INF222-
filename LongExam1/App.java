import Locations.*;
import Tourists.*;



public class App {
    public static void main(String[] args) throws Exception {

        Locations Bohol = new Bohol();
        Locations Boracay = new Boracay();
        Locations Cebu = new Cebu();
        Locations Palawan = new Palawan();
        Locations Siargao = new Siargao();
        Locations Vigan = new Vigan();

        Tourist Jules = new Jules();

        Boracay.accept(Jules);
        Bohol.accept(Jules);
        Cebu.accept(Jules);
        Palawan.accept(Jules);
        Siargao.accept(Jules);
        Vigan.accept(Jules);



    }
}