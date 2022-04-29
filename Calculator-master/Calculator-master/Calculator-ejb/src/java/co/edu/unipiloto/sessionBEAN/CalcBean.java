package co.edu.unipiloto.sessionBEAN;

import javax.ejb.Stateless;

@Stateless
public class CalcBean implements CalcBeanLocal {
    //La clase CalcBean implementa los valores definidos para las operaciones en la clase CalcBeanLocal
    //Una vez definidos los valores que recibira cada operación, se construyen los metodos que realizaran dicha operación
    @Override
    public Integer addition(int value1, int value2) {
        return (value1 + value2);
    }

    @Override
    public Integer subtraction(int value1, int value2) {
        return (value1 - value2);
    }

    @Override
    public Integer multiplication(int value1, int value2) {
        return (value1 * value2);
    }

    @Override
    public Double division(double value1, double value2) {
        return (value1 / value2);
    }

    @Override
    public Double module(double value1, double value2) {
        return (value1 % value2);
    }

    @Override
    public Double power(int value1, int value2) {
        return (Math.pow(value1, value2));
    }

}
