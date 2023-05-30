/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author javie
 */
public class Principal {

    public static void main(String[] args) {

        String ruta1 = "C:/Users/javie/Desktop/proyecto2/src/codigo/Lexer.flex";
        String ruta2 = "C:/Users/javie/Desktop/proyecto2/src/codigo/LexerCup";
        String[] rutaS = {"-parser", "Sintax", "C:/Users/javie/Desktop/proyecto2/src/codigo/Sintax.cup"};
        generar(ruta1, ruta2, rutaS);
    }

    public static void generar(String ruta1, String ruta2, String[] rutaS) {
        try {
            File archivo = new File(ruta1);
            JFlex.Main.generate(archivo);
            archivo = new File(ruta2);
            JFlex.Main.generate(archivo);
            java_cup.Main.main(rutaS);

            Path rutaSym = Paths.get("C:/Users/javie/Desktop/proyecto2/src/codigo/sym.java");
            if (Files.exists(rutaSym)) {
                Files.delete(rutaSym);
            }
            Files.move(
                    Paths.get("C:/Users/javie/Desktop/proyecto2/sym.java"),
                    Paths.get("C:/Users/javie/Desktop/proyecto2/src/codigo/sym.java"));

            Path rutaSin = Paths.get("C:/Users/javie/Desktop/proyecto2/src/codigo/Sintax.java");
            if (Files.exists(rutaSin)) {
                Files.delete(rutaSin);
            }
            Files.move(
                    Paths.get("C:/Users/javie/Desktop/proyecto2/Sintax.java"),
                    Paths.get("C:/Users/javie/Desktop/proyecto2/src/codigo/Sintax.java"));
        } catch (java_cup.internal_error ex) {
            System.out.println("Error al generar Sintax.java: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

}
