/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03.cafeteria;

/**
 *
 * @author palit
 */
public class Leite extends Decorator{
    
    public Leite(Cafe cafe) {
        super(cafe);
    }
    
    @Override
    public double custo() {
        return cafe.custo() + 0.50;
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao() + " com leite";
    }
}
