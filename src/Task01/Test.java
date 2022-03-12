package Task01;

import java.util.Scanner;

public class Test {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int ArrSize = 1;
        int count = ArrSize;

        Cake[] cakeArray = new Cake[ ArrSize];

        for(int i=0;i<ArrSize;i++) {


            System.out.print("\n");
            System.out.println("1 : Order Cake ");
            System.out.println("2 : Ready Made Cake \n");

            System.out.print("Enter the Cake Number to add : ");

            int cakeNum = input.nextInt();

            if (cakeNum == 1){


                System.out.print("Enter Cake Name : ");
                String name = input.next();

                System.out.print("Enter The rate : ");
                int rate = input.nextInt();

                System.out.print("Enter The Weight (Kg) : ");
                double weight = input.nextDouble();

                OrderCake odrcake = new OrderCake(name, rate, weight);
                cakeArray[i] = odrcake;

            } else {
                System.out.print("Enter Cake Name : ");
                String name = input.next();

                System.out.print("Enter The rate : ");
                int rate = input.nextInt();

                System.out.print("Enter The Weight : ");
                int quantity = input.nextInt();

                ReadymadeCake odrcake = new ReadymadeCake(name, rate, quantity);
                cakeArray[i] = odrcake;


            }


        }


        double totCakePrice =0;
        double RmdCakeTotPrice=0;
        int RmdCakeTotQnt=0;

        String maxCakeName = null;
        double maxPrice=0;

        for(int j=0;j<ArrSize;j++){

            if(maxPrice <= cakeArray[j].calcPrice()){
                maxPrice=cakeArray[j].calcPrice();
                maxCakeName=cakeArray[j].name;
            }

            if(cakeArray[j] instanceof ReadymadeCake){
                RmdCakeTotPrice= RmdCakeTotPrice + cakeArray[j].calcPrice();
                RmdCakeTotQnt= RmdCakeTotQnt + ((ReadymadeCake) cakeArray[j]).quantity;
            }

            totCakePrice = totCakePrice + cakeArray[j].calcPrice();

        }

        System.out.print("\n");
        System.out.println("Total Price for all Types of Cakes : Rs." + totCakePrice+ "\n");
        System.out.println("Ready Made Cakes ");
        System.out.println("Total Price in Ready Made Cakes : Rs." + RmdCakeTotPrice+ "");
        System.out.println("Total Price in Ready Made Cakes : Rs." + RmdCakeTotQnt+ "\n");

        System.out.println("Highest Price Cake is");
        System.out.println("Highest Price Cake is \""+ maxCakeName +"\" : Rs." + maxPrice+ "\n");

    }
}
