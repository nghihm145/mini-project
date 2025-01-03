package com.ManageStudent.practice.entity;
import jakarta.persistence.*;
/**
 * @author ManNghi
 * @since 03/01/2025 - 12:08
 */


@Entity
@Table(name = "MONHOC")
public class MonHoc {

    @Id
    @Column(name = "Ma_mon_hoc", nullable = false, length = 50)
    private String maMonHoc;

    @Column(name = "Ten_mon_hoc", nullable = false, length = 255)
    private String tenMonHoc;

    @Column(name = "He_so_mon_hoc", nullable = false)
    private int heSoMonHoc;

    // Getters and setters
}
