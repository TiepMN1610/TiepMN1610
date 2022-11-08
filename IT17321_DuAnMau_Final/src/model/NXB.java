/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class NXB {

    private String idNXB;
    private String maNXB;
    private String tenNXB;

    public NXB() {
    }

    public NXB(String idNXB, String maNXB, String tenNXB) {
        this.idNXB = idNXB;
        this.maNXB = maNXB;
        this.tenNXB = tenNXB;
    }

    public NXB(String maNXB, String tenNXB) {
        this.maNXB = maNXB;
        this.tenNXB = tenNXB;
    }

    public String getIdNXB() {
        return idNXB;
    }

    public void setIdNXB(String idNXB) {
        this.idNXB = idNXB;
    }

    public String getMaNXB() {
        return maNXB;
    }

    public void setMaNXB(String maNXB) {
        this.maNXB = maNXB;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    @Override
    public String toString() {
        return "NXB{" + "idNXB=" + idNXB + ", maNXB=" + maNXB + ", tenNXB=" + tenNXB + '}';
    }

}
