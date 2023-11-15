package com.ouarari.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ouarari.dao.IDao;


import com.ouarari.entities.Article;
import com.ouarari.repositories.ArticleRepository;

@Service
public class ArticleService implements IDao<Article> {

	@Autowired
	private ArticleRepository repository;

	@Override
	public Article create(Article o) {
		return repository.save(o);
	}

	@Override
	public boolean delete(Article o) {
		try {
			repository.delete(o);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Article update(Article o) {
		return repository.save(o);
	}

	@Override
	public Article findById(long id) {
		return repository.findById((long) id).orElse(null);
	}

	@Override
	public List<Article> findAll(){
		return repository.findAll();
		}
	
	

}
