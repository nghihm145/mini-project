package com.ManageStudent.practice.entity;
import jakarta.persistence.*;
/**
 * @author ManNghi
 * @since 03/01/2025 - 12:09
 */


@Entity
@Table(name = "DIEM")
public class Diem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

//    @ManyToOne
//    @JoinColumn(name = "Ma_sinh_vien", nullable = false)
//    private SinhVien sinhVien;
//
//    @ManyToOne
//    @JoinColumn(name = "Ma_mon_hoc", nullable = false)
//    private MonHoc monHoc;

    @Column(name = "Diem_so", nullable = false)
    private Double diemSo;

    // Getters and setters
}

