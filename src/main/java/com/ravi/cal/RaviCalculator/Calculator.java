package com.ravi.cal.RaviCalculator;

public class Calculator {
    
    private Operacion operacion;
    private static Calculator instance = null;
    
    //Constructor singleton
    private Calculator(Operacion operacion){
        this.operacion = operacion;
    }
    
    public static Calculator getInstance(Operacion operacion){
        if(instance == null){
            instance = new Calculator(operacion);
        } 
        instance.operacion = operacion;
        return instance;
    }
    
    public long ejecutarOperacion(long first, long second){
        return this.operacion.execute(first, second);
    }
    
    public static void main(String[] args) {
        
       //Ejemplos
        System.out.println(Calculator.getInstance(new Adicion()).ejecutarOperacion(5, 8));
        System.out.println(Calculator.getInstance(new Sustraccion()).ejecutarOperacion(5, 8));
        System.out.println(Calculator.getInstance(new Multiplicacion()).ejecutarOperacion(5, 8));
        
        
    }

}
