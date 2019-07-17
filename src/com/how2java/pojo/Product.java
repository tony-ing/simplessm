package com.how2java.pojo;

public class Product {
	
	private int id;
	private String name;
	private float price;
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
		
		public void setCid(int cid) {
			this.cid = cid;
		}
		
		public int getCid() {
			return cid;
		}
		@Override
		public String toString() {
			return "Product [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + "]";
		}

}
