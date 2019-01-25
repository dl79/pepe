package javaapplication1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class JavaApplication1 {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        ArrayList<String> lista1 = new ArrayList<>();
        ArrayList<String> lista2 = new ArrayList<>();
        ArrayList<String> lista3 = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        int op, op1, pp, bus, nn;
        String pro, pro1, pro2, pro3, op2,nu;
        do {
            System.out.println("\t\t1.- agregar");
            System.out.println("\t\t2.- eliminar");
            System.out.println("\t\t3.- buscar");
            System.out.println("\t\t4.- modificar");
            System.out.print("Ingrese una opcion: ");
            op = teclado.nextInt();
            if (op == 1) {
                System.out.println("\tAgregar");
                System.out.print("cuantos productos desea: ");
                op1 = teclado.nextInt();
                for (int i = 0; i < op1; i++) {
                    System.out.print("Ingrese el producto: ");
                    pro = teclado.next();
                    System.out.print("Ingrese el codigo: ");
                    pro1 = teclado.next();
                    System.out.print("Ingrese el precio: ");
                    pro2 = teclado.next();
                    System.out.print("Ingrese el tipo: ");
                    pro3 = teclado.next();
                    lista.add(pro);
                    lista1.add(pro1);
                    lista2.add(pro2);
                    lista3.add(pro3);
                }
                System.out.println("El producto :" + lista.toString());
                System.out.println("El codigo :" + lista1.toString());
                System.out.println("El precio :" + lista2.toString());
                System.out.println("El tipo :" + lista3.toString());
            }

            if (op == 2) {
                System.out.println("\t Eliminar");
                System.out.print("que elemento quiere eliminar: ");
                pp = teclado.nextInt();
                lista.remove(pp);
                lista1.remove(pp);
                lista2.remove(pp);
                lista3.remove(pp);
                System.out.println("El producto :" + lista.toString());
                System.out.println("El codigo :" + lista1.toString());
                System.out.println("El precio :" + lista2.toString());
                System.out.println("El tipo :" + lista3.toString());
            }

            if (op == 3) {
                System.out.println("\t Buscar");
                System.out.print("Que elemento quiere: ");
                bus = teclado.nextInt();
                lista.get(bus);
                //System.out.println("Elemento encontrado1: " + lista.get(bus));
                System.out.println("El producto es :" + lista.toString());
                System.out.println("El codigo :" + lista1.toString());
                System.out.println("El precio :" + lista2.toString());
                System.out.println("El tipo :" + lista3.toString());
            }
            if (op == 4) {
                System.out.println("\t Modificar");
                System.out.println("Los elementos son " + lista.toString());
                System.out.print("Que elemto quiere: ");
                nn = teclado.nextInt();
                System.out.println("ingresa nuevo nombre: ");
                nu=teclado.next();
                System.out.println("nombre"+lista.set(nn, nu));
                System.out.println("El producto :" + lista.toString());
                System.out.println("El codigo :" + lista1.toString());
                System.out.println("El precio :" + lista2.toString());
                System.out.println("El tipo :" + lista3.toString());
                        
            }
            System.out.print("Desea continuar s/n: ");
            op2 = teclado.next();
        } while ("s".equals(op2));
    }

}
