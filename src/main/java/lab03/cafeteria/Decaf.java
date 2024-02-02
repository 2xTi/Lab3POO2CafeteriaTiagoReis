/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03.cafeteria;

/**
 *
 * @author palit
 */
public class Decaf implements Cafe{
    
    @Override
    public double custo() {
        return 8.00;
    }

    @Override
    public String getDescricao() {
        return "Cafe Descafeinado";
    }
    
}
