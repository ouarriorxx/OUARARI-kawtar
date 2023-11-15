package com.ouarari.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ouarari.entities.Categorie;
@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Long> {

}
