package DistanciaPuntos;

import java.util.Scanner;

public class DistanciaPuntos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Ingresa y1: ");
        double y1 = sc.nextDouble();

        System.out.print("Ingresa x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Ingresa y2: ");
        double y2 = sc.nextDouble();

        System.out.print("Ingresa x3: ");
        double x3 = sc.nextDouble();
        System.out.print("Ingresa y3: ");
        double y3 = sc.nextDouble();

        double lado1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double lado2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double lado3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

        System.out.printf("Lado 1: %.2f\n", lado1);
        System.out.printf("Lado 2: %.2f\n", lado2);
        System.out.printf("Lado 3: %.2f\n", lado3);

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("El triángulo es equilatero.");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            System.out.println("El triángulo es iscoceles.");
        } else {
            System.out.println("El triángulo es escaleno.");
        }

        sc.close();
    }
}
