public class TestDrive {
    public static void main(String[] args) {
        Espresso esp = new Espresso();
        Mocha mocha = new Mocha(esp);
        SteamedMilk sm = new SteamedMilk(mocha);
        WhippedCream wc = new WhippedCream(sm);

        DarkRoast drk = new DarkRoast();
        SteamedMilk sm1 = new SteamedMilk(drk);
        WhippedCream wc1 = new WhippedCream(sm1);

        HouseBlend hb = new HouseBlend();
        Mocha mocha1 = new Mocha(hb);
        WhippedCream wc2 = new WhippedCream(mocha1);

        System.out.println(wc.getDescription() + " " + wc.cost() );
        System.out.println(wc1.getDescription() + " " + wc1.cost() );
        System.out.println(wc2.getDescription() + " " + wc2.cost() );


    }
}
