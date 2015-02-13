/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadores;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author Jessi
 */
public class CompiladorConcatenacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, Exception {
        
        AnalizadorSintac als = new AnalizadorSintac(new AnalizadorLexico(new FileReader("src\\archivos\\test.txt")));
        als.parse();
    }
    
}
