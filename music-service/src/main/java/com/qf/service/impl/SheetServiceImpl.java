package com.qf.service.impl;

import com.qf.dao.TbSheetMapper;
import com.qf.pojo.TbSheet;
import com.qf.service.SheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SheetServiceImpl implements SheetService {

    @Autowired
    private TbSheetMapper tbSheetMapper;

    public List<TbSheet> findAll() {
        List<TbSheet> tbSheets = tbSheetMapper.selectByExample(null);
        return tbSheets;
    }

    public void insertSheet(String sheetName) {
        TbSheet tbSheet = new TbSheet();
        tbSheet.setSheetName(sheetName);
        tbSheetMapper.insert(tbSheet);
    }
}
