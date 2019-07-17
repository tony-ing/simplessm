package com.how2java.service;
import java.util.List;
import java.util.Map;

import com.how2java.pojo.Product;
public interface ProductService {
	List<Product> list();
	
	void add(Product p);
	
	void delete(Product p);
	
	void update(Product p);
	
	Product get(int id);
	
	Product getCid(int cid);
	
	List<Product> listCate(Map m);
}
