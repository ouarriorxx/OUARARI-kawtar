package com.ouarari.entities;

import java.util.List;


import com.ouarari.entities.Categorie;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Categorie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id;
	private String nom;
	
	@ManyToOne
	private Categorie categorieParent;
	 
	
	@OneToMany(mappedBy = "ArticleCategorie", fetch = FetchType.EAGER)
	private List<Article> articles;
	
	
	public Categorie(long id, String nom, Categorie categorieParent, List<Article> articles) {
		super();
		this.id = id;
		this.nom = nom;
		this.categorieParent = categorieParent;
		this.articles = articles;
	}
	public Categorie() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	@Override
	public String toString() {
		return "Categorie [id=" + id + ", nom=" + nom + "]";
	}
	
	
	

}
