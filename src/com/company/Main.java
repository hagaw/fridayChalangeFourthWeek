package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
//--------------------------------------------------

  TempConv();



    }

    public static void TempConv() {

        double tempConvertdCel = 0;
        String Response = "";

        Random rn = new Random();


//====================Lists of collers============================
        ArrayList<String> myColors = new ArrayList<>();

        myColors.add("red");
        myColors.add("brown");
        myColors.add(("yellow"));
        myColors.add("orange");

        int rand = rn.nextInt(myColors.size());
        String colorPiked = "";
        colorPiked = myColors.get(rand);
        System.out.println(colorPiked);

        //=====================Lists of Drinks============================
        Random rnDrubk = new Random();

        ArrayList<String> myDrinks = new ArrayList<>();
        myDrinks.add("pumpkin spiced latte");
        myDrinks.add("chai tea");
        myDrinks.add("hot cocoa");

        int randDrink = rnDrubk.nextInt(myDrinks.size());
        String drinkPicked = "";
        drinkPicked = myDrinks.get(randDrink);


        Scanner sc = new Scanner(System.in);


        //=====================Temprature =============================================


        double userInputTemprature = 0;

        do {

            System.out.println("enter the temprature in Fahrenheit");
            userInputTemprature = sc.nextDouble();

            tempConvertdCel = (userInputTemprature - 32)*0.555;

            if (userInputTemprature >= 45 && userInputTemprature <= 70) {

               // System.out.printf("")

                //System.out.printf("tempConvertdCel");
                System.out.printf("The temperature in Celsius is " + tempConvertdCel + "\n" +
                        "Today's weather is a perfect fall day for a cup of" + drinkPicked + "The color of the leaves are" + colorPiked + ".\n" +
                        "Would you like to enter another temperature Y(yes) or N(no): y\n");

//
//                yourResponse = sc.next();
//                if (!yourResponse.equalsIgnoreCase("no")) {
//                    userInputTemprature = sc.nextDouble();
//                }


                }

                else if (userInputTemprature >= 80) {



                    System.out.printf("The temperature in Celsius is " + tempConvertdCel +
                            "The weather is a bit warm for fall.\n" +
                            "Would you like to enter another temperature Y(yes) or N(no): y\n");


//
//
//                    }

                } else if (userInputTemprature < 45) {

                System.out.printf("The temperature in Celsius is " + tempConvertdCel + "\n" +
                        "The temperature in Celsius is" + drinkPicked + "The weather is a bit chilly for fall.\n" +
                        "Would you like to enter another temperature Y(yes) or N(no): y\n");
//
//

                } else if (tempConvertdCel < 45) {

                    System.out.printf("The temperature in Celsius is" + tempConvertdCel + "\n" +
                            "The weather is a bit chilly for fall.\n" +
                            "Would you like to enter another temperature Y(yes) or N(no): n\n");

//


                }


                Response = sc.next();

                if (Response.equalsIgnoreCase("no")) {

                    System.out.println("exit");
                        }


            }


            while (!Response.equalsIgnoreCase("no")) ;

        }

    }



