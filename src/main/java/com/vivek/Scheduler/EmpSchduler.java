//package com.vivek.Scheduler;
//
//import ch.qos.logback.core.util.FixedDelay;
//import com.vivek.Service.EmployeeService;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//import java.io.IOException;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//
//@Component
//@Slf4j
//public class EmpSchduler {
//
//    @Autowired
//    private EmployeeService service;
//
////    @Scheduled(fixedDelay = 10000)
//
//    public void createScheduler() throws IOException {
////        create Current dateTime
//        service.genrateExcelFile();
//        System.out.println("Viviek");
//        LocalDateTime  dateTime = LocalDateTime.now();
//        DateTimeFormatter crdate = DateTimeFormatter.ofPattern("dd-mm-yyyy hh-mm-ss");
//        String format = dateTime.format(crdate);
//        log.info("schedular time "+format);
//
//
//
//
//    }
//
//
//
//
//}
