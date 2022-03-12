package Task01;

import java.util.Scanner;

public class Test {

//    static int ArrSize = 20  ;
//    int count = ArrSize;
//    static Task01.Cake[] cakeArray = new Task01.Cake[ ArrSize];
//
//    public Task01.OrderCake gettingCakeData(int i){
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter Task01.Cake Name : ");
//        String name = input.next();
//
//        System.out.print("\nEnter The rate : ");
//        int rate = input.nextInt();
//
//        System.out.print("\nEnter The Weight : ");
//        double weight = input.nextDouble();
//
//        Task01.OrderCake odrcake = new Task01.OrderCake(name, rate, weight);
//        cakeArray[i] = odrcake;
//
//        return odrcake;
//    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int ArrSize = 20  ;
        int count = ArrSize;
        Cake[] cakeArray = new Cake[ ArrSize];

        //Task01.Cake[] cakeArray = new Task01.Cake[ ArrSize];



        for(int i=0;i<ArrSize;i++) {


            System.out.print("\n");
            System.out.println("1 : Order Task01.Cake ");
            System.out.println("2 : Ready Made Task01.Cake \n");

            System.out.print("Enter the Task01.Cake Number to add : ");

            int cakeNum = input.nextInt();

            if (cakeNum == 1){

//                cakeArray[i] = gettingCakeData(i);

                System.out.print("Enter Task01.Cake Name : ");
                String name = input.next();

                System.out.print("Enter The rate : ");
                int rate = input.nextInt();

                System.out.print("Enter The Weight (Kg) : ");
                double weight = input.nextDouble();

                OrderCake odrcake = new OrderCake(name, rate, weight);
                cakeArray[i] = odrcake;

            } else {
                System.out.print("Enter Task01.Cake Name : ");
                String name = input.next();

                System.out.print("Enter The rate : ");
                int rate = input.nextInt();

                System.out.print("Enter The Weight : ");
                double quantity = input.nextDouble();

                OrderCake odrcake = new OrderCake(name, rate, quantity);
                cakeArray[i] = odrcake;


            }


        }



    }
}
