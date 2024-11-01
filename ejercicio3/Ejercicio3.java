package mx.unam.fi.poo.g1.p11.e3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Ejercicio3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        List<String> list = new ArrayList<String>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:/POO/practicas_poo/practica11/test.txt"));
            int i = 1;
            while(strLine != null) {
                strLine = br.readLine();
                sb.append(strLine);
                sb.append(System.lineSeparator());
                
                if(strLine == null) break;
                
                list.add(strLine);
            }
            System.out.println(Arrays.toString(list.toArray()));
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado...");
        } catch (IOException e) {
            System.err.println("No es posible leer archivo...");
        }
    }
}
