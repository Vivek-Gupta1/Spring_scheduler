package com.vivek.Service;

import com.vivek.Repo.EmployeeRepo;
import com.vivek.enttiy.Employee;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo repo;



    public Employee saveEmp(Employee emp){
       return repo.save(emp);
    }

    @Scheduled(cron="0 0/1 * 1/1 * ? *")
    public void genrateExcelFile() throws IOException {


        File file = new File("D:\\VivekPersonal\\Tp");
        FileOutputStream str = new FileOutputStream(file);
        //        to getall The Employee
        List<Employee> allEmp = repo.findAll();
//        creating workBook
        HSSFWorkbook books = new HSSFWorkbook();
//        creating sheet
        HSSFSheet sheet = books.createSheet("Employee_Details");
//        creating roow
        HSSFRow row = sheet.createRow(0);
//        creating cell and set the value
        row.createCell(0).setCellValue("id");
        row.createCell(1).setCellValue("name");
        row.createCell(2).setCellValue("sal");

//        taking 1 beacause index start 0 and o take row data
         int datarow = 1;
         for(Employee emp: allEmp){
             HSSFRow row1 = sheet.createRow(datarow);
             row1.createCell(0).setCellValue(emp.getId());
             row1.createCell(1).setCellValue(emp.getName());
             row1.createCell(2).setCellValue(emp.getSal());
//             update next row
             datarow++;

         }
//         send response to server

//         close all files
        books.write(str);
        books.close();
    }





}
