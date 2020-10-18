package com.example.demo.Magazine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MagazineService {

    @Autowired
    MagazineRepository magazineRepository;

    public void setMagazineRepository(MagazineRepository magazineRepository) {
        this.magazineRepository = magazineRepository;
    }
}
