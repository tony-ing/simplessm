package com.how2java.service.impl;
 
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.how2java.mapper.ProductMapper;
import com.how2java.pojo.Product;
import com.how2java.service.ProductService;
 
@Service
public class ProductServiceImpl  implements ProductService{
    @Autowired
    ProductMapper productMapper;
     
    public List<Product> list(){
        return productMapper.list();
    }
    
	public void add(Product p) {
		productMapper.add(p);
		
	}
	
	public void delete(Product p) {
		productMapper.delete(p.getId());
	}
	
	public void update(Product p) {
		productMapper.update(p);
	}
	
	public Product get(int id) {
		return productMapper.get(id);
	}
	
	public Product getCid(int cid) {
		return productMapper.get(cid);
	}
	
	public List<Product> listCate(Map m){
		return productMapper.listCate(m);
	}
}