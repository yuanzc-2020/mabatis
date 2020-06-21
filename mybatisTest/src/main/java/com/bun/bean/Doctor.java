package com.bun.bean;

import java.io.Serializable;

public class Doctor implements Serializable {
    private String id_d;
    private String doctor;
    private String CD;
    private double pay1;
    private String workday;
    private String password;

    public Doctor() {
    }

    public Doctor(String id_d, String doctor, String CD, double pay1, String workday, String password) {
        this.id_d = id_d;
        this.doctor = doctor;
        this.CD = CD;
        this.pay1 = pay1;
        this.workday = workday;
        this.password = password;
    }

    public String getId_d() {
        return id_d;
    }

    public void setId_d(String id_d) {
        this.id_d = id_d;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getCD() {
        return CD;
    }

    public void setCD(String CD) {
        this.CD = CD;
    }

    public double getPay1() {
        return pay1;
    }

    public void setPay1(double pay1) {
        this.pay1 = pay1;
    }

    public String getWorkday() {
        return workday;
    }

    public void setWorkday(String workday) {
        this.workday = workday;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id_d='" + id_d + '\'' +
                ", doctor='" + doctor + '\'' +
                ", CD='" + CD + '\'' +
                ", pay1=" + pay1 +
                ", workday='" + workday + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
