package com.col.web.controller;

import com.col.service.DataService;
import com.col.web.dto.DataDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhirayrg on 5/2/2017.
 */
@RestController("/")
public class DataController {

    @Autowired
    private DataService dataService;

    @GetMapping
    public void getHome(){
        System.out.println("It works!!!");;
    }

    @PostMapping("/data")
    public void insertData(DataDto dataDto){

        dataService.insertData(dataDto);
    }
}
