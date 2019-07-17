package com.how2java.controller;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
import com.how2java.pojo.Product;
import com.how2java.service.ProductService;

@Controller
@RequestMapping("")
public class ProductController {
    @Autowired
    ProductService productService;
 
    @RequestMapping("listProduct")
    public ModelAndView listProduct(){
        ModelAndView mav = new ModelAndView();
        List<Product> cs= productService.list();
        mav.addObject("cs", cs);
        mav.setViewName("listProduct");
        return mav;
    }
    
    @RequestMapping("addProduct")
	public ModelAndView addProduct(Product product){
		System.out.println(product);
		productService.add(product);
		ModelAndView mav = new ModelAndView("redirect:/listProduct");
	    return mav;
	}
    
    @RequestMapping("deleteProduct")
    public ModelAndView deleteProduct(Product product) {
    	product = productService.get(product.getId());
    	productService.delete(product);
    	ModelAndView mav = new ModelAndView("redirect:/listProduct");
	    return mav;
     }
    
    @RequestMapping("editProduct")
    public ModelAndView editProduct(Product product) {
    	Product p = productService.get(product.getId());
    	ModelAndView mav = new ModelAndView("editProduct");
    	mav.addObject("p", p);
    	return mav;
    }
    
    @RequestMapping("updateProduct")
    public ModelAndView updateProduct(Product product) {
    	productService.update(product);
    	ModelAndView mav = new ModelAndView("redirect:/listProduct");
    	return mav;
    	
    }
    
  
}