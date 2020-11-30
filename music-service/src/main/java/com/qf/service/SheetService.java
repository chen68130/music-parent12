package com.qf.service;

import com.qf.pojo.TbSheet;

import java.util.List;

public interface SheetService {
  public  List<TbSheet> findAll();

    void insertSheet(String sheetName);
}
