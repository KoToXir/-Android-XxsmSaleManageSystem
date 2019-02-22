package com.aoics.xxsm.data;

import org.litepal.crud.DataSupport;
import org.litepal.crud.LitePalSupport;

public class People extends LitePalSupport{
    //id,姓名，密码，等级,工号
    private int id;

    private String name;

    private String psw;

    private int level;

    private String empno;

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
