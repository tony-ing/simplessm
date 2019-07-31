package com.how2java.controller;
 
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
import com.how2java.pojo.Category;
import com.how2java.service.CategoryService;
import com.how2java.pojo.Product;
import com.how2java.service.ProductService;


@Controller
@RequestMapping("")
public class CategoryController {
    @Autowired
    CategoryService categoryService;
    @Autowired
    ProductService productService;
    @RequestMapping("listCategory")
    public ModelAndView listCategory(){
        ModelAndView mav = new ModelAndView();
        List<Category> cs= categoryService.list();
        mav.addObject("cs", cs);
        mav.setViewName("listCategory");
        return mav;
    }
    
    @RequestMapping("showProduct")
    public ModelAndView showProduct(Category category) {
    	category = categoryService.get(category.getId());
    	
    	ModelAndView mav = new ModelAndView();
    	Map m = new HashMap();
		m.put("category", category);
    	List<Product> pd = productService.listCate(m);
    	
    	mav.addObject("cs" ,pd);
    	mav.setViewName("showProduct");
    	return mav;
    }
    
   @RequestMapping("addCategory")
   public ModelAndView addCategory(Category category) {
	   categoryService.add(category);
	   ModelAndView mav = new ModelAndView("redirect:/listCategory");
	   return mav;
	   
   }
   
   @RequestMapping("deleteCategory")
   public ModelAndView deleteCategory(Category category) {
	   category = categoryService.get(category.getId());
	   categoryService.delete(category);
	   ModelAndView mav = new ModelAndView("redirect:/listCategory");
	   return mav;
   }
   
   @RequestMapping("editCategory")
   public ModelAndView editCategory(Category category) {
	   Category c = categoryService.get(category.getId());
	   ModelAndView mav = new ModelAndView("editCategory");
	   mav.addObject("c", c);
	   return mav;
   }
   
   @RequestMapping("updateCategory")
   public ModelAndView updateCategory(Category category) {
	categoryService.update(category);
   	ModelAndView mav = new ModelAndView("redirect:/listCategory");
   	return mav;
   	
   }
   @RequestMapping("showdate")
   public ModelAndView date(@DateTimeFormat(iso = ISO.DATE) LocalDate localDate)
   {
	 String currDate = localDate.toString();
	 ModelAndView mav = new ModelAndView("date");
	 mav.addObject("d", currDate);
	 System.out.println(currDate);
     return mav;
   }
   
 
}