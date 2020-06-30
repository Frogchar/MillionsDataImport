package com.frogchar.poi.entity;

import lombok.Data;
import lombok.ToString;

/**
 * @author songc
 * @version 1.0
 * @date 2020/6/30 14:22
 * @description
 * @Email songchao_ss@163.com
 */
@Data
@ToString
public class PoiEntity {
    private String id;
    private String breast;
    private String adipocytes;
    private String negative;
    private String staining;
    private String supportive;
}
