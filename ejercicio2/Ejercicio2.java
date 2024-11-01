package mx.unam.fi.poo.g1.p11.e2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;

public class Ejercicio2 {
    public static void main(String[] args) {
        String strLine = "";
        String str_data = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:/POO/practicas_poo/practica11/test.txt"));
            while (strLine != null) {
                if(strLine == null) break;
                
                str_data += strLine;
                strLine = br.readLine();
            }
            System.out.println(str_data);
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado...");
        } catch (IOException e) {
            System.err.println("No es posible leer el archivo...");
        }
    }
}
