package com.miranda.blog.service;

import java.util.List;

public interface GenericService <T, ID>{
	
	T create(T t);
	
	T update (T t);
	
	T findById(ID id);
	
	List<T> getAll();
	
	void delete(ID id);

}
