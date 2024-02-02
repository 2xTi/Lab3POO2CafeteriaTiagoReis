/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03.cafeteria;

/**
 *
 * @author palit
 */
public class Decorator implements Cafe{
    
protected Cafe cafe;
    
    public Decorator(Cafe cafe) {
        this.cafe = cafe;
    }

    @Override
    public double custo() {
        return cafe.custo();
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao();
    }
    
}
