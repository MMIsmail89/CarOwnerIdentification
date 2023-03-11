package com.example.caridentification;

import android.app.Application;

import java.util.ArrayList;

public class ApplicationClass extends Application {
    public static ArrayList<Motor> theListMotors;

    @Override
    public void onCreate() {
        super.onCreate();
        theListMotors = new ArrayList<Motor>();

        theListMotors.add(new Motor("Toyota", "Corolla", "Ahmed Mohamed", "0123456789"));
        theListMotors.add(new Motor("Nissan", "Sunny", "Mohamed Ali", "0111111111"));
        theListMotors.add(new Motor("Mercedes-Benz", "S-Class", "Ali Hassan", "0101010101"));
        theListMotors.add(new Motor("BMW", "5 Series", "Hassan Ahmed", "0198765432"));
        theListMotors.add(new Motor("Audi", "A4", "Mona Abdelaziz", "0166666666"));
        theListMotors.add(new Motor("Chevrolet", "Camaro", "Omar Ibrahim", "0155555555"));
        theListMotors.add(new Motor("Ford", "Mustang", "Fatma Mahmoud", "0144444444"));
        theListMotors.add(new Motor("Honda", "Civic", "Ahmed Said", "0133333333"));
        theListMotors.add(new Motor("Hyundai", "Elantra", "Hoda Kamal", "0123456789"));
        theListMotors.add(new Motor("Kia", "Optima", "Mohamed Ibrahim", "0111111111"));
        theListMotors.add(new Motor("Mazda", "CX-5", "Ali Ahmed", "0101010101"));
        theListMotors.add(new Motor("Mitsubishi", "Lancer", "Hassan Mohamed", "0198765432"));
        theListMotors.add(new Motor("Peugeot", "308", "Mona Ali", "0166666666"));
        theListMotors.add(new Motor("Renault", "Clio", "Omar Hassan", "0155555555"));
        theListMotors.add(new Motor("Subaru", "Impreza", "Fatma Ahmed", "0144444444"));
        theListMotors.add(new Motor("Suzuki", "Swift", "Ahmed Mahmoud", "0133333333"));
        theListMotors.add(new Motor("Toyota", "Camry", "Hoda Said", "0123456789"));
        theListMotors.add(new Motor("Volkswagen", "Passat", "Mohamed Kamal", "0111111111"));
        theListMotors.add(new Motor("Volvo", "S60", "Ali Ibrahim", "0101010101"));
        theListMotors.add(new Motor("Audi", "Q7", "Hassan Ali", "0198765432"));
        theListMotors.add(new Motor("BMW", "X5", "Mona Hassan", "0166666666"));
        theListMotors.add(new Motor("Ford", "Explorer", "Omar Mohamed", "0155555555"));
        theListMotors.add(new Motor("Honda", "CR-V", "Fatma Ali", "0144444444"));


    }
}
