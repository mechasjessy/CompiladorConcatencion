/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadores;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jessi
 */
public class MainCup {
    public static void main(String[] args) {
        String [] option=new String [5];
        option[0]="-destdir";
        option[1]="src" +File.separator+"archivos";
        option[2]="-parser";
        option[3]="AnalizadorSintac";
        option[4]="src"+File.separator+"archivos"+File.separator+"palabras.cup";
        
        try {
            java_cup.Main.main(option);    
        } catch (Exception e) {
            System.out.println("Error en: "+ e);
        }
        
            
               
    }
    
}
