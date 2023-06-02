package com.mueble.demo.repository;

import com.mueble.demo.entity.Almacen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlmacenRepo extends JpaRepository<Almacen , Long> {
}
