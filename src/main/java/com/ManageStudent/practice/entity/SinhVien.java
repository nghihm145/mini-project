package com.ManageStudent.practice.entity;
import jakarta.persistence.*;
import java.util.List;
/**
 * @author ManNghi
 * @since 03/01/2025 - 12:07
 */


    @Entity
    @Table(name = "SINHVIEN")
    public class SinhVien {

        @Id
        @Column(name = "Ma_sinh_vien", nullable = false, length = 255)
        private String maSinhVien;

        @Column(name = "Ho_dem", nullable = false, length = 255)
        private String hoDem;

        @Column(name = "Ten", nullable = false, length = 50)
        private String ten;

        @Column(name = "Nam_sinh", nullable = false, length = 50)
        private String namSinh;

        @Column(name = "Gioi_tinh", nullable = false, length = 45)
        private String gioiTinh;

        // Getters and setters
    }


