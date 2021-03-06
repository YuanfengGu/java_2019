/**
* 公办电脑
*
* */
package com.java.domain;

import com.java.service.TeamException;

public class PC extends EquipmentBasic implements Equipment {
    // 实例变量
    private String model;
    private String display;

    // 构造器
    public PC() {
        super();
    }

    public PC(String model, String display) {
//        this.model = model;
//        this.display = display;
        setModel(model);
        setDisplay(display);
    }

    public PC(int sn, String model, String display, EquipmentStatus status) throws TeamException {
        super(sn, status);
        setModel(model);
        setDisplay(display);
    }

    // 方法
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model.length() > 0 && model.length() <= 36) {
            this.model = model;
        } else {
            System.out.println("PC model字段长度为[1- 36]");
        }
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        if (display.length() > 0 && display.length() <= 36) {
            this.display = display;
        } else {
            System.out.println("PC display字段长度为[1- 36]");
        }
    }

    @Override
    public String toString() {
        return "PC{ " +
                "sn: " + getSn() +
                ", model: '" + model + '\'' +
                ", display: '" + display + '\'' +
                ", status: " + this.getStatus() +
                " }";
    }

    @Override
    public String getDescription() {
        return  "PC{ " +
                "sn: " + getSn() +
                ", model: '" + model + '\'' +
                " }";
    }
}
