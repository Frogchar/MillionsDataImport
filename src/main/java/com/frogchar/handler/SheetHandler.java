package com.frogchar.handler;

import com.frogchar.poi.entity.PoiEntity;
import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.usermodel.XSSFComment;

/**
 * @author songc
 * @version 1.0
 * @date 2020/6/30 14:23
 * @description
 * @Email songchao_ss@163.com
 */
public class SheetHandler implements XSSFSheetXMLHandler.SheetContentsHandler {

    private PoiEntity entity;
    /**
     * 当开始解析某一行的时候触发
     *      i:行索引
     */
    @Override
    public void startRow(int rowNum) {
        if (rowNum > 0) {
            entity = new PoiEntity();
        }
    }

    /**
     * 当开始解析某一行的时候触发
     *      i:行索引
     */
    @Override
    public void endRow(int rowNum) {
        System.out.println(entity);
    }


    /**
     * 对行中的每一个表格进行处理
     *      cellReference: 单元格名称
     *      value：数据
     *      xssfComment：批注
     */
    @Override
    public void cell(String cellReference, String formattedValue, XSSFComment comment) {
        //对对象属性赋值
        if(entity != null) {
            String pix = cellReference.substring(0,1);
            switch (pix) {
                case "A":
                    entity.setId(formattedValue);
                    break;
                case "B":
                    entity.setBreast(formattedValue);
                    break;
                case "C":
                    entity.setAdipocytes(formattedValue);
                    break;
                case "D":
                    entity.setNegative(formattedValue);
                    break;
                case "E":
                    entity.setStaining(formattedValue);
                    break;
                case "F":
                    entity.setSupportive(formattedValue);
                    break;
                default:
                    break;
            }
        }
    }
}
