package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;  // Import the Scanner class

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter your birthdate:");

        String fechaNacimientoIngresada = myObj.nextLine();  // Read user input
        System.out.println("Date is: " + fechaNacimientoIngresada);  // Output user input


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(fechaNacimientoIngresada, formatter);
        System.out.println(date); // 2010-01-02


        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String pattern = "MM/dd/yyyy HH:mm:ss";
        DateFormat df = new SimpleDateFormat(pattern);

        LocalDate fechaNacimiento = LocalDate.parse(df.format(fechaNacimientoIngresada), fmt);
        LocalDate fechaHoy = LocalDate.now();

        Period periodoNacimientoAHoy = Period.between(fechaNacimiento, fechaHoy);
        System.out.printf("Tu edad es: %s años, %s meses y %s días",
                periodoNacimientoAHoy.getYears(), periodoNacimientoAHoy.getMonths(), periodoNacimientoAHoy.getDays());
    }
}
