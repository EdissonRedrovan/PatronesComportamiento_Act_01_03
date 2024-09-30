/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package est.ups.edu.ec.patronmemento.entity;

import est.ups.edu.ec.patronmemento.impl.TextMemento;

/**
 *
 * @author edisson
 */
public class TextEditor {
    
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
     public TextMemento createMemento() {
        return new TextMemento(text);
    }

    public void setMemento(TextMemento memento) {
        this.text = memento.getState();
    }
    
}
