package com.how2java.mapper;
import java.util.List;
import java.util.Map;

import com.how2java.pojo.Product;
public interface ProductMapper {
	
	public int add(Product product);
	
	public void delete(int id);
	
	public Product get(int id);
	
	public Product getCid(int cid);
	
	public int update(Product product);
	
	public List<Product> list();

	public List<Product> listCate(Map m);
}
