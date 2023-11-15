package com.ouarari.entities;

import java.util.Date;
import java.util.List;

import com.ouarari.entities.Article;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Article {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id;
	private String nom;
	@Temporal(TemporalType.DATE)
	private Date dateProduction;
	
	@ManyToOne
	private Categorie ArticleCategorie;
	
	
	
	
	public Article() {
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
	public Date getDateProduction() {
		return dateProduction;
	}
	public void setDateProduction(Date dateProduction) {
		this.dateProduction = dateProduction;
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", nom=" + nom + "]";
	}
	
	
	

}
