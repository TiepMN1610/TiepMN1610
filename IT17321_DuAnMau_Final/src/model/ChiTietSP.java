/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class ChiTietSP {

    private String id;
    private SanPham idSP;
    private NXB idNXB;
    private MauSac idMauSac;
    private DongSP idDSP;
    private SanPham maSP;
    private SanPham tenSP;
    private DongSP maDSP;
    private DongSP tenDSP;
    private NXB maNXB;
    private NXB tenNXB;
    private MauSac maMS;
    private MauSac tenMS;
    private int namBH;
    private String moTa;
    private int soLuong;
    private double giaNhap;
    private double giaBan;

    public ChiTietSP() {
    }

    public ChiTietSP(String id, SanPham idSP, NXB idNXB, MauSac idMauSac, DongSP idDSP, SanPham maSP, SanPham tenSP, DongSP maDSP, DongSP tenDSP, NXB maNXB, NXB tenNXB, MauSac maMS, MauSac tenMS, int namBH, String moTa, int soLuong, double giaNhap, double giaBan) {
        this.id = id;
        this.idSP = idSP;
        this.idNXB = idNXB;
        this.idMauSac = idMauSac;
        this.idDSP = idDSP;
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.maDSP = maDSP;
        this.tenDSP = tenDSP;
        this.maNXB = maNXB;
        this.tenNXB = tenNXB;
        this.maMS = maMS;
        this.tenMS = tenMS;
        this.namBH = namBH;
        this.moTa = moTa;
        this.soLuong = soLuong;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    public ChiTietSP(SanPham idSP, NXB idNXB, MauSac idMauSac, DongSP idDSP, int namBH, String moTa, int soLuong, double giaNhap, double giaBan) {
        this.idSP = idSP;
        this.idNXB = idNXB;
        this.idMauSac = idMauSac;
        this.idDSP = idDSP;
        this.namBH = namBH;
        this.moTa = moTa;
        this.soLuong = soLuong;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SanPham getIdSP() {
        return idSP;
    }

    public void setIdSP(SanPham idSP) {
        this.idSP = idSP;
    }

    public NXB getIdNXB() {
        return idNXB;
    }

    public void setIdNXB(NXB idNXB) {
        this.idNXB = idNXB;
    }

    public MauSac getIdMauSac() {
        return idMauSac;
    }

    public void setIdMauSac(MauSac idMauSac) {
        this.idMauSac = idMauSac;
    }

    public DongSP getIdDSP() {
        return idDSP;
    }

    public void setIdDSP(DongSP idDSP) {
        this.idDSP = idDSP;
    }

    public SanPham getMaSP() {
        return maSP;
    }

    public void setMaSP(SanPham maSP) {
        this.maSP = maSP;
    }

    public SanPham getTenSP() {
        return tenSP;
    }

    public void setTenSP(SanPham tenSP) {
        this.tenSP = tenSP;
    }

    public DongSP getMaDSP() {
        return maDSP;
    }

    public void setMaDSP(DongSP maDSP) {
        this.maDSP = maDSP;
    }

    public DongSP getTenDSP() {
        return tenDSP;
    }

    public void setTenDSP(DongSP tenDSP) {
        this.tenDSP = tenDSP;
    }

    public NXB getMaNXB() {
        return maNXB;
    }

    public void setMaNXB(NXB maNXB) {
        this.maNXB = maNXB;
    }

    public NXB getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(NXB tenNXB) {
        this.tenNXB = tenNXB;
    }

    public MauSac getMaMS() {
        return maMS;
    }

    public void setMaMS(MauSac maMS) {
        this.maMS = maMS;
    }

    public MauSac getTenMS() {
        return tenMS;
    }

    public void setTenMS(MauSac tenMS) {
        this.tenMS = tenMS;
    }

    public int getNamBH() {
        return namBH;
    }

    public void setNamBH(int namBH) {
        this.namBH = namBH;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public Object[] toDataRow() {
        return new Object[]{maSP.getMaSP(), tenSP.getTenSP(), namBH, moTa, soLuong, giaNhap, giaBan};
    }

}
