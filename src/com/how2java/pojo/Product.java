package com.how2java.pojo;

import java.time.LocalDate;
import java.sql.Date;
import java.sql.Timestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;

public class Product {
	
	private int id;
	private String name;
	private float price;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date addDate;
	
	@Autowired
	private Category category;
	private int cid;
	
	
	
	 public int getId() {
	        return id;
	    }
	    public void setId(int id) {
	        this.id = id;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    
	    public void setPrice(float price) {
	    	this.price = price;
	    }
	    
	    public float getPrice() {
	    	return price;
	    }
	    public Category getCategory() {
			return category;
		}
		public void setCategory(Category category) {
			this.category = category;
		}
		
	
		
	
		
		
		public int getCid() {
			return cid;
		}
		public void setCid(int cid) {
			this.cid = cid;
		}
		public Date getAddDate() {
			return addDate;
		}
		public void setAddDate(Date addDate) {
			this.addDate = addDate;
		}
		@Override
		public String toString() {
			return "Product [id=" + id + ", name=" + name + ", price=" + price + ", addDate=" + addDate + ", category="
					+ category + ", cid=" + cid + "]";
		}
		public void printThrowException(){
		       System.out.println("Exception raised");
		       throw new IllegalArgumentException();
		   }

}
