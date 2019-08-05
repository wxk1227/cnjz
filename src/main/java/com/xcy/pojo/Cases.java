package com.xcy.pojo;

public class Cases {
    private int id;
    private String type;
    private String companyname;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCompanyname() {
        return companyname;

    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    @Override
    public String toString() {
        return "Case{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", companyname='" + companyname + '\'' +
                '}';
    }
}
