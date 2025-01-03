package com.ManageStudent.practice.controller;

import com.ManageStudent.practice.service.ISinhVienService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ManNghi
 * @since 03/01/2025 - 12:14
 */

@RestController
@RequestMapping("/sinh-vien")
public class SinhVienController {
    private final ISinhVienService sinhvienService;

    public SinhVienController(ISinhVienService sinhvienService) {
        this.sinhvienService = sinhvienService;
    }
}
