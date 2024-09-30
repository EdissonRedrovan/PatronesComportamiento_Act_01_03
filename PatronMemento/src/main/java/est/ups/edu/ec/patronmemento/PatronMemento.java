/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package est.ups.edu.ec.patronmemento;

import est.ups.edu.ec.patronmemento.entity.TextEditor;
import est.ups.edu.ec.patronmemento.impl.EditorCaretaker;

/**
 *
 * @author edisson
 */
public class PatronMemento {

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        EditorCaretaker caretaker = new EditorCaretaker();

        // El usuario escribe texto
        editor.setText("Este es el texto original.");
        System.out.println("Texto original: " + editor.getText());

        // Guardamos el estado
        caretaker.addMemento(editor.createMemento());

        // El usuario modifica el texto
        editor.setText("Este es el texto modificado.");
        System.out.println("Texto modificado: " + editor.getText());

        // El usuario decide deshacer los cambios
        editor.setMemento(caretaker.getMemento());
        System.out.println("Texto después de deshacer: " + editor.getText());
    }
}
