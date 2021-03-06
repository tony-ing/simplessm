package com.how2java.service;
import java.util.List;

import com.how2java.pojo.Category;
public interface CategoryService {
	List<Category> list();
	
	Category get(int id);
	
	void add (Category c);
	
	void delete(Category c);
	
	void update(Category c);
}
