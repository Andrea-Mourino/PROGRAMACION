


import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
 
 public class Main {
 
     public static void main(String[] args) {
 
         List<Contacto> Contactos = new ArrayList<>();
         Scanner sc = new Scanner(System.in);
         try(BufferedReader br = new BufferedReader(new FileReader("listacontactos.txt"))){
             String linea;
             while ((linea=br.readLine())!=null){
                 String [] datos = linea.split(" - ");
                 Contacto contacto = new Contacto((datos[0]),(datos[1]));
                 Contactos.add(contacto);
             }
         } catch (FileNotFoundException e) {
             throw new RuntimeException(e);
         } catch (IOException e) {
             throw new RuntimeException(e);
         }
 
         int op = 0;
         do {
             System.out.println("1 Engadir contacto");
             System.out.println("2 Eliminar contacto");
             System.out.println("3 Mudar o telefono dun contacto");
             System.out.println("4 Mostrar lista de contactos");
             System.out.println("5 Sair");
             op = sc.nextInt();
 
             switch (op){
                 case 1 -> engadirContactos(Contactos);
                 case 2 -> eliminarContactos(Contactos);
                 case 3 -> buscarContactosT(Contactos);
                 case 4 -> System.out.println(Contactos);
                 case 5 ->{
                     gardarContacto(Contactos);
                     System.out.println("Cerrando");
 
                 }
                 default -> System.out.println("Opcion no valida");
             }
 
         }while(op != 5);
     }
 
     static List<Contacto> engadirContactos(List<Contacto> Contactos){
         Scanner sc = new Scanner(System.in);
         System.out.println("Nombre del contacto: ");
         String nContacto = sc.nextLine();
         System.out.println("Numero: ");
         String nNumero = sc.nextLine();
         Contacto contacto = new Contacto(nContacto,nNumero);
         Contactos.add(contacto);
         return Contactos;
 
     }
 
     static void eliminarContactos(List<Contacto> Contactos){
         Scanner sc = new Scanner(System.in);
         System.out.println("Introduce el numero del contacto a eliminar:");
         String ContactoAEliminar = sc.nextLine();
         Contactos.removeIf(Contacto -> Contacto.getNome().equals(ContactoAEliminar));
         System.out.println("Contacto eliminada");
 
     }
 
     static void buscarContactosT(List<Contacto> Contactos){
 
         Scanner sc = new Scanner(System.in);
         System.out.println("Introduce el contacto a buscar");
         String tContacto = sc.nextLine();
 
 
         for (Contacto contacto : Contactos){
             if (contacto.getNome().equals(tContacto)){
                 System.out.println("El Nombre es: "+ contacto.getNome()+ " y su numero: "+ contacto.getTelefono());
             }
         }
 
     }
 
     static void gardarContacto(List<Contacto> Contactos){
         ObjectOutputStream fluxoSaida = null;
         try {
             fluxoSaida = new ObjectOutputStream(new FileOutputStream("listacontactos.txt"));
         }catch (IOException e){
             System.out.println("erro de entrada/saida"+ e.getMessage());
         }finally {
             try (BufferedWriter bw = new BufferedWriter(new FileWriter("listacontactos.txt"))){
                 for (Contacto info : Contactos) {
                     bw.append(info.toString());
                     bw.newLine();
                 }
 
 
                 fluxoSaida.close();
             }catch (IOException e){
                 System.out.println("erro:"+e.getMessage());
             }
         }
     }
 
 }


