package com.bridgelabz.functionalprogramming;

public class WindChill {

    public double findWindChill(double temperatureInFahrenheit,double windSpeed){
     double windChill , a,b,c;

     a=(0.6215*temperatureInFahrenheit);
     b=(0.4275*temperatureInFahrenheit);
     c=(b-35.75);

      windChill=35.75 + a + c * (Math.pow(windSpeed,0.16));
      return windChill;
    // return  windChill=35.75+ (0.6215*temperatureInFahrenheit)+(0.4275*temperatureInFahrenheit - 35.75)*Math.pow(windSpeed,0.16);

    }

    public static void main(String[] args) {

        double windSpeed,windChill,temperatureInFahrenheit=0;
        temperatureInFahrenheit=Double.parseDouble(args[0]);
        windSpeed=Double.parseDouble(args[1]);

        WindChill windch=new WindChill();
        windChill=windch.findWindChill(temperatureInFahrenheit,windSpeed);
        System.out.println("After Calculating Wind Chill : "+windChill);



    }
}
