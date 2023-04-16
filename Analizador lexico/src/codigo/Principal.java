/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.io.File;

/**
 *
 * @author javie
 */
public class Principal {
    public static void main(String[] args) {
        
        String ruta = "C:/Users/javie/Desktop/Analizador lexico/src/codigo/Lexer.flex";
        generateLexer(ruta);
    }
    public static void generateLexer(String ruta){
        File archivo = new File(ruta);
        JFlex.Main.generate(archivo);
    }
}
