package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("//For loop//");
      //for loop
        for (int i=1;i<16;i++){
	     double result = i * 25.4;
         System.out.println("Inches "+i+" millimeter: "+result);
     }

	 //while loop
        System.out.println("//While loop//");
	 double i =1;
	 while (i<16){
         double result = i * 25.4;
         System.out.println("Inches "+i+" millimeter: "+result);
            i++;
     }

	 //do while loop
        System.out.println("//do while loop//");
        double j = 1;
	 do{
	     j++;
    double total =(j * 25.4);
         System.out.println(total);
     }while (j<16);



        int i, j;

        for (i = 1; i <10; i++) {
            for (j=1; j<=i; j++){
                System.out.print(i);
            }

            System.out.println();
        }

    }
}
