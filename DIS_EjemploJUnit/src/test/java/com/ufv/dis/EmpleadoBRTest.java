package com.ufv.dis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpleadoBRTest {

    EmpleadoBR empleado = new EmpleadoBR();

    @Test
    void calcularSalarioBruto() {
        assertEquals(1360, empleado.calcularSalarioBruto(TipoEmplead .VENDEDOR, 2000, 8));
    }

    @Test
    void calcularSalarioNeto() {
    }
}