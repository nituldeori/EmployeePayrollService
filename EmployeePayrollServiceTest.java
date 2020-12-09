package com.employeepayrollservice;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

import static java.awt.Event.HOME;

public class EmployeePayrollServiceTest {
    @Test
    public void given3EmployeesWhenWrittenToFileShouldMatchEmployeeEntries(){
        EmployeePayrollData[] arrayOfEmps ={
                new EmployeePayrollData(1,"Jeff Bezos",100000000.0),
                new EmployeePayrollData(1,"Bill Gates",200000000.0),
                new EmployeePayrollData(1,"Mark Zuckerberg",300000000.0)
        };
        EmployeePayrollService employeePayrollService;
        employeePayrollService=new EmployeePayrollService(Arrays.asList(arrayOfEmps));
        employeePayrollService.writeEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);
        employeePayrollService.printData(EmployeePayrollService.IOService.FILE_IO);
        long entries=employeePayrollService.countEntries(EmployeePayrollService.IOService.FILE_IO);

        Assert.assertEquals(3,entries);
    }


}
