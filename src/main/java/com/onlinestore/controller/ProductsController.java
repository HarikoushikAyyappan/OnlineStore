package com.onlinestore.controller;
import com.onlinestore.model.Customer;
import com.onlinestore.model.Products;
import com.onlinestore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class ProductsController {
    @Autowired
    ProductService productService;
    @RequestMapping("/listOfProducts")
    public ModelAndView house() {
        List<Products> productList  = productService.getAllProducts();
        Products product = new Products();
        ModelAndView mav = new ModelAndView("productList");
        mav.addObject("product",product);
        mav.addObject("productList", productList);
        return mav;
    }
}
