package pl.codegym.task.task04.task0416;

/*
    Colors of lights on a pedestrian crossing for the entered minute
        green -  <0;3)
        yellow - <3;4)
        red -    <4;5)
*/

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("The color is: " + colorLight(readNumber()));
    }

    public static double readNumber () throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String numberMinute = bufferedReader.readLine();
        double number = Double.parseDouble(numberMinute);

        return number;
    }

    public static String colorLight(double number){
        double restOfModuloDivision = number % 5;

        if (restOfModuloDivision < 5 && restOfModuloDivision >= 4){
            return "red";
        }
        else if (restOfModuloDivision < 4 && restOfModuloDivision >= 3){
            return "yellow";
        }
        else
            return "green";
    }
}