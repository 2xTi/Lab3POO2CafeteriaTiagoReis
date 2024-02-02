/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03.cafeteria;

/**
 *
 * @author palit
 */
public class Espresso implements Cafe{
    
    @Override
    public double custo() {
        return 12.00;
    }

    @Override
    public String getDescricao() {
        return "Cafe Espresso";
    }
}
