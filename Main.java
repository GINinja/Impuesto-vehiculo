import java.util.Scanner;
/**
 * Calculadora que permite determinar el valor del impuesto por tipo de vehiculo y su valor neto.
 *
 * @author (GINinja)
 * @version (a version number or a date)
 */

import java.util.*;

class Main {

public static void main(String[] args){

int selection,price;

System.out.println("CALCULADORA DE IMPUESTO DE VENTA A VEHICULO");

System.out.println("1. CAMIONETA\n2. AUTOMOVIL");

Scanner scan = new Scanner(System.in);

System.out.println("Ingrese el numero correspondiente al tipo de vehiculo: ");

selection = scan.nextInt();

System.out.println("Ingrese el precio del vehiculo: ");

price = scan.nextInt();

int tax = 0;

int total = 0;

if(selection==1 && price<80){

tax = 0;

total = tax + price;

System.out.println("El impuesto de venta es: "+tax);

System.out.println("El precio neto es: "+total);

}

if(selection==1 && price>=80){

tax = price/2;

total = tax + price;

System.out.println("El impuesto de venta es: "+tax);

System.out.println("El precio neto es: "+total);

}

if(selection==2 && price<20){

tax = 5;

total = tax + price;

System.out.println("El impuesto de venta es: "+tax);

System.out.println("El precio neto es: "+total);

}

if(selection==2 && (price>=20 && price<=40)){

tax = price/5;

total = tax + price;

System.out.println("El impuesto de venta es: "+tax);

System.out.println("El precio neto es: "+total);

}

if(selection==2 && price>40){

tax = 9;

total = tax + price;

System.out.println("El impuesto de venta es: "+tax);

System.out.println("El precio neto es: "+total);

}

}

}
  
   


