package com.qf.web;

import com.qf.pojo.TbSheet;
import com.qf.service.SheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("sheet")
public class SheetController {

    @Autowired
    private SheetService sheetService;

    @RequestMapping("findAll")
    public List<TbSheet> findAll() {
       return sheetService.findAll();
    }



    @RequestMapping("insertSheet")
    public void insertSheet(String sheetName) {
        sheetService.insertSheet(sheetName);
    }
}
