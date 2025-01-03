package com.ManageStudent.practice.service.impl;

import com.ManageStudent.practice.entity.SinhVien;
import com.ManageStudent.practice.service.ISinhVienService;

/**
 * @author ManNghi
 * @since 03/01/2025 - 12:21
 */
public class SinhVienService implements ISinhVienService {

    @Override
    public SinhVien createSinhVien(SinhVien sinhvien) {
        return sinhvienRepository.save(sinhvien);
    }
}
