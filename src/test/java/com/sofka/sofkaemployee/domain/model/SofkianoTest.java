package com.sofka.sofkaemployee.domain.model;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Date;

public class SofkianoTest {
    private Date date = new Date();
    private Sofkiano sofkiano = new Sofkiano("id", "idProject", "name", "lastName",1.0,
            2.0,3.0,"active","Medellin",4.0,5.0,6.0,
            7.0,8.0,9.0,10.0,"Yes",11.0, date);

    @Test
    public void testGetIdProject() {
        Assertions.assertThat(sofkiano.getIdProject()).isEqualTo("idProject");
    }

    @Test
    public void testSetIdProject() {
        sofkiano.setIdProject("newProjectId");
        Assertions.assertThat(sofkiano.getIdProject()).isEqualTo("newProjectId");
    }

    @Test
    public void testGetName() {
        Assertions.assertThat(sofkiano.getName()).isEqualTo("name");
    }

    @Test
    public void testSetName() {
        sofkiano.setName("newName");
        Assertions.assertThat(sofkiano.getName()).isEqualTo("newName");
    }

    @Test
    public void testGetLastName() {
        Assertions.assertThat(sofkiano.getLastName()).isEqualTo("lastName");
    }

    @Test
    public void testSetLastName() {
        sofkiano.setLastName("newLastName");
        Assertions.assertThat(sofkiano.getLastName()).isEqualTo("newLastName");
    }

    @Test
    public void testGetBaseSalary() {
        Assertions.assertThat(sofkiano.getBaseSalary()).isEqualTo(1.0);
    }

    @Test
    public void testSetBaseSalary() {
        sofkiano.setBaseSalary(10.0);
        Assertions.assertThat(sofkiano.getBaseSalary()).isEqualTo(10.0);
    }

    @Test
    public void testGetFlexibleSalary() {
        Assertions.assertThat(sofkiano.getFlexibleSalary()).isEqualTo(2.0);
    }

    @Test
    public void testSetFlexibleSalary() {
        sofkiano.setFlexibleSalary(20.0);
        Assertions.assertThat(sofkiano.getFlexibleSalary()).isEqualTo(20.0);
    }

    @Test
    public void testGetCtc() {
        Assertions.assertThat(sofkiano.getCtc()).isEqualTo(3.0);
    }

    @Test
    public void testSetCtc() {
        sofkiano.setCtc(30.0);
        Assertions.assertThat(sofkiano.getCtc()).isEqualTo(30.0);
    }

    @Test
    public void testGetStatus() {
        Assertions.assertThat(sofkiano.getStatus()).isEqualTo("active");
    }

    @Test
    public void testSetStatus() {
        sofkiano.setStatus("Inactive");
        Assertions.assertThat(sofkiano.getStatus()).isEqualTo("Inactive");
    }

    @Test
    public void testGetArea() {
        Assertions.assertThat(sofkiano.getArea()).isEqualTo("Medellin");
    }

    @Test
    public void testSetArea() {
        sofkiano.setArea("Poblado");
        Assertions.assertThat(sofkiano.getArea()).isEqualTo("Poblado");
    }

    @Test
    public void testGetHourlyRate() {
        Assertions.assertThat(sofkiano.getHourlyRate()).isEqualTo(4.0);
    }

    @Test
    public void testSetHourlyRate() {
        sofkiano.setHourlyRate(40.0);
        Assertions.assertThat(sofkiano.getHourlyRate()).isEqualTo(40.0);
    }

    @Test
    public void testGetMonthRate() {
        Assertions.assertThat(sofkiano.getMonthRate()).isEqualTo(5.0);
    }

    @Test
    public void testSetMonthRate() {
        sofkiano.setMonthRate(50.0);
        Assertions.assertThat(sofkiano.getMonthRate()).isEqualTo(50.0);
    }

    @Test
    public void testGetAssignmentMonth() {
        Assertions.assertThat(sofkiano.getAssignmentMonth()).isEqualTo(6.0);
    }

    @Test
    public void testSetAssignmentMonth() {
        sofkiano.setAssignmentMonth(60.0);
        Assertions.assertThat(sofkiano.getAssignmentMonth()).isEqualTo(60.0);
    }

    @Test
    public void testGetMonthEbilling() {
        Assertions.assertThat(sofkiano.getMonthEbilling()).isEqualTo(7.0);
    }

    @Test
    public void testSetMonthEbilling() {
        sofkiano.setMonthEbilling(70.0);
        Assertions.assertThat(sofkiano.getMonthEbilling()).isEqualTo(70.0);
    }

    @Test
    public void testGetRrMonth() {
        Assertions.assertThat(sofkiano.getRrMonth()).isEqualTo(8.0);
    }

    @Test
    public void testSetRrMonth() {
        sofkiano.setRrMonth(80.0);
        Assertions.assertThat(sofkiano.getRrMonth()).isEqualTo(80.0);
    }

    @Test
    public void testGetRentabilidadBruta() {
        Assertions.assertThat(sofkiano.getRentabilidadBruta()).isEqualTo(9.0);
    }

    @Test
    public void testSetRentabilidadBruta() {
        sofkiano.setRentabilidadBruta(90.0);
        Assertions.assertThat(sofkiano.getRentabilidadBruta()).isEqualTo(90.0);
    }

    @Test
    public void testGetGm() {
        Assertions.assertThat(sofkiano.getGm()).isEqualTo(10.0);
    }

    @Test
    public void testSetGm() {
        sofkiano.setGm(100.0);
        Assertions.assertThat(sofkiano.getGm()).isEqualTo(100.0);
    }

    @Test
    public void testGetBillable() {
        Assertions.assertThat(sofkiano.getBillable()).isEqualTo("Yes");
    }

    @Test
    public void testSetBillable() {
        sofkiano.setBillable("No");
        Assertions.assertThat(sofkiano.getBillable()).isEqualTo("No");
    }

    @Test
    public void testGetCapacity() {
        Assertions.assertThat(sofkiano.getCapacity()).isEqualTo(11.0);
    }

    @Test
    public void testSetCapacity() {
        sofkiano.setCapacity(110.0);
        Assertions.assertThat(sofkiano.getCapacity()).isEqualTo(110.0);
    }

    @Test
    public void testGetDateReport() {
        Assertions.assertThat(sofkiano.getDateReport()).isEqualTo(date);
    }

    @Test
    public void testSetDateReport() {
        Date newDate = new Date();
        sofkiano.setDateReport(newDate);
        Assertions.assertThat(sofkiano.getDateReport()).isEqualTo(newDate);
    }
}

