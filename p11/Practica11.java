package mx.unam.fi.poo.g1.p11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal de Practica 11
 * @author Aldo Axel Estrada Zacarias
 * @version 30-Octubre-2024
 */

public class Practica11 {
    /**
     * Método main
     * Se ejecuta toda la aplicacion.
     * @param args -> Arreglo por defecto del método main.
     */
    public static void main(String[] args) {
        String strLine = "";
        List<String> list = new ArrayList<String>();
        
        try {
            BufferedReader br1 = new BufferedReader(new FileReader("C:/POO/practicas_poo/practica11/p11/archivo1.txt"));
            while(strLine != null) {
                strLine = br1.readLine();
                
                if(strLine == null) break;
                
                list.add(strLine);
            }
            br1.close();
            strLine = "";
            
            BufferedReader br2 = new BufferedReader(new FileReader("C:/POO/practicas_poo/practica11/p11/archivo2.txt"));
            while(strLine != null) {
                strLine = br2.readLine();
                
                if(strLine == null) break;
                
                list.add(strLine);
            }
            br2.close();
            strLine = "";
            
            BufferedReader br3 = new BufferedReader(new FileReader("C:/POO/practicas_poo/practica11/p11/archivo3.txt"));
            while(strLine != null) {
                strLine = br3.readLine();
                
                if(strLine == null) break;
                
                list.add(strLine);
            }
            br3.close();
            
            String fileName = "C:/POO/practicas_poo/practica11/p11/archivoFinal.txt";
            FileWriter fw = new FileWriter(fileName, false);
            for(String line : list) {
                fw.write(line + '\n');
            }
            fw.close();
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado...");
        } catch (IOException e) {
            System.err.println("No es posible leer/escribir el archivo...");
        }
    }
}