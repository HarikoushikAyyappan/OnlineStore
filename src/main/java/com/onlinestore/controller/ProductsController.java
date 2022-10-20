package com.onlinestore.controller;
import com.onlinestore.model.Customer;
import com.onlinestore.model.Products;
import com.onlinestore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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
    @RequestMapping("/buy")
    public ModelAndView buy(@RequestParam int quantity){


        ModelAndView mav = new ModelAndView("buyPage");
            return mav;}
    @RequestMapping("/adminListOfProducts")
    public ModelAndView adminhome() {
        List<Products> productList  = productService.getAllProducts();
        Products product = new Products();
        ModelAndView mav = new ModelAndView("adminProductList");
        mav.addObject("product",product);
        mav.addObject("productList", productList);
        return mav;

}
    @RequestMapping("/edit/{productId}")
    public ModelAndView editPersonForm(@PathVariable int productId) {
        ModelAndView mav = new ModelAndView("editProducts");
        Products products = productService.getProducts(productId);
        mav.addObject("products", products);
        return mav;
    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView saveProducts(@ModelAttribute("products") Products products) {
        productService.update(products);
        return new ModelAndView("success");
    }
}
