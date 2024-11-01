package mx.unam.fi.poo.g1.p11.e1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ejercicio1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:/POO/practicas_poo/practica11/test.txt"));
            while (strLine != null) {
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                if(strLine == null) break;
                System.out.println(strLine);
            }
            System.out.println(sb);
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado...");
        } catch (IOException e) {
            System.err.println("No es posible leer el archivo...");
        }
    }
}
