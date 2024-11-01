package mx.unam.fi.poo.g1.p11.e4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        try {
            String fileName = "C:/POO/practicas_poo/practica11/miArchivo.txt";
            FileWriter fw = new FileWriter(fileName,false);
            fw.write("Me la estoy pasando bien raro...\n");
            fw.write("Probando escribir una linea mas.");
            fw.close();
            
            BufferedReader br = new BufferedReader(new FileReader("C:/POO/practicas_poo/practica11/miArchivo.txt"));
            while (strLine != null) {
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                if(strLine == null) break;
                System.out.println(strLine);
            }
            br.close();
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }
}
