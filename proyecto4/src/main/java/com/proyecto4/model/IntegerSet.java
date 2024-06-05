package com.proyecto4.model;

import java.util.Arrays;

public class IntegerSet {

    private boolean[] set;

    // Constructor sin argumentos que inicializa el conjunto vacio
    public IntegerSet() {
        set = new boolean[101]; // Rango de 0 a 100, por lo tanto 101 elementos
    }

    // Metodo de union
    public static IntegerSet union(IntegerSet set1, IntegerSet set2) {
        IntegerSet resultSet = new IntegerSet();
        for (int i = 0; i < resultSet.set.length; i++) {
            resultSet.set[i] = set1.set[i] || set2.set[i];
        }
        return resultSet;
    }

    // Metodo de interseccion
    public static IntegerSet intersection(IntegerSet set1, IntegerSet set2) {
        IntegerSet resultSet = new IntegerSet();
        for (int i = 0; i < resultSet.set.length; i++) {
            resultSet.set[i] = set1.set[i] && set2.set[i];
        }
        return resultSet;
    }

    // Metodo para insertar un nuevo elemento
    public void insertElement(int k) {
        if (k >= 0 && k <= 100) {
            set[k] = true;
        } else {
            throw new IllegalArgumentException("El valor debe estar entre 0 y 100.");
        }
    }

    // Método para eliminar un elemento
    public void deleteElement(int m) {
        if (m >= 0 && m <= 100) {
            set[m] = false;
        } else {
            throw new IllegalArgumentException("El valor debe estar entre 0 y 100.");
        }
    }

    // Metodo para representar el conjunto como una cadena
    public String toSetString() {
        StringBuilder result = new StringBuilder();
        boolean isEmpty = true;

        for (int i = 0; i < set.length; i++) {
            if (set[i]) {
                result.append(i).append(" ");
                isEmpty = false;
            }
        }

        if (isEmpty) {
            return "-";
        } else {
            return result.toString().trim();
        }
    }

    // Metodo para determinar si dos conjuntos son iguales
    public boolean equalTo(IntegerSet otherSet) {
        return Arrays.equals(this.set, otherSet.set);
    }
}