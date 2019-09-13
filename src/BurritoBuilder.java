import java.util.ArrayList;
import java.util.Collections;

public class BurritoBuilder {

    public static void addItems() {

        ArrayList<String> riceSelect = new ArrayList<String>();

        riceSelect.add("white rice");
        riceSelect.add("brown rice");
        riceSelect.add("no rice");
        riceSelect.add("all rice");

        ArrayList<String> meatSelect = new ArrayList<String>();

        meatSelect.add("chicken");
        meatSelect.add("steak");
        meatSelect.add("carnitas");
        meatSelect.add("chorizo");
        meatSelect.add("sofritas");
        meatSelect.add("veggies");
        meatSelect.add("no meat");
        meatSelect.add("all meat");

        ArrayList<String> beanSelect = new ArrayList<String>();

        beanSelect.add("pinto bean");
        beanSelect.add("black bean");
        beanSelect.add("no beans");

        ArrayList<String> salsaSelect = new ArrayList<String>();

        salsaSelect.add("mild salsa");
        salsaSelect.add("medium salsa");
        salsaSelect.add("hot salsa");
        salsaSelect.add("no salsa");
        salsaSelect.add("all salsa");

        ArrayList<String> veggiesSelect = new ArrayList<String>();

        veggiesSelect.add("lettuce");
        veggiesSelect.add("fajitas veggies");
        veggiesSelect.add("no veggies");
        veggiesSelect.add("all veggies");

        ArrayList<String> cheeseSelect = new ArrayList<String>();

        cheeseSelect.add("add cheese");
        cheeseSelect.add("no cheese");

        ArrayList<String> guacSelect = new ArrayList<String>();

        guacSelect.add("add guac");
        guacSelect.add("no guac");

        ArrayList<String> quesoSelect = new ArrayList<String>();

        quesoSelect.add("add queso");
        quesoSelect.add("no queso");

        ArrayList<String> sourCreamSelect = new ArrayList<String>();

        sourCreamSelect.add("add sourcream");
        sourCreamSelect.add("no sourcream");


        for (int i =1;i<=25;i++)  //loop 25 times

        {

            double totalPrice = 3;

            Collections.shuffle(riceSelect);
            Collections.shuffle(meatSelect);
            Collections.shuffle(beanSelect);
            Collections.shuffle(salsaSelect);
            Collections.shuffle(veggiesSelect);
            Collections.shuffle(cheeseSelect);
            Collections.shuffle(guacSelect);
            Collections.shuffle(quesoSelect);
            Collections.shuffle(sourCreamSelect);


            String riceItem = riceSelect.get(0);

            if (riceItem == "all rice") {
                totalPrice += 0.5;
            } else {
                totalPrice += 0;
            }

            String meatItem = meatSelect.get(0);
            if (meatItem == "no meat"){
                totalPrice += 0.5;
            } else {
                totalPrice += 0;
            }

            String beanItem = beanSelect.get(0);

            if (beanItem=="no beans") {
                totalPrice += 0;
            }
            else
            {
                totalPrice+=0.5;
            }

            String salsaItem = salsaSelect.get(0);

            if (salsaItem=="all salsa") {
                totalPrice += 0.5;
            }
            else {
                totalPrice+=0;
            }

            String veggiesItem = veggiesSelect.get(0);

            if (veggiesItem=="all veggies") {

                totalPrice += 0.5;
            }

            else {

                totalPrice+=0;
            }

            String cheeseAdd = cheeseSelect.get(0);

            if (cheeseAdd == "add cheese")
            {
                totalPrice+=0.5;
            }
            else
            {
                totalPrice+=0;
            }

            String guacAdd = guacSelect.get(0);

            if (guacAdd == "add guac")
            {
                totalPrice+=0.5;
            }
            else
            {
                totalPrice+=0;
            }

            String quesoAdd = quesoSelect.get(0);

            if (quesoAdd == "add queso")
            {
                totalPrice+=0.5;
            }
            else{
                totalPrice+=0;
            }

            String sourCreamAdd = sourCreamSelect.get(0);

            if (sourCreamAdd == "add sourcream")
            {
                totalPrice+=0.5;
            }

            else
            {
                totalPrice+=0;
            }

            System.out.println("Burrito "+ i +" : " + riceItem + " , " + meatItem +" , " + beanItem + " , " + salsaItem + " , " + veggiesItem + " , " + cheeseAdd + " , " + guacAdd + " , " + quesoAdd + " , " + sourCreamAdd + " ------- $" + totalPrice);

        }
    }
}

