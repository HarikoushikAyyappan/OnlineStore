package com.onlinestore.controller;
import com.onlinestore.model.*;
import com.onlinestore.service.CustomerService;
import com.onlinestore.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @Autowired
    OrderService orderService;
    @GetMapping(value = "/getCustomer/{customerId}")
    public Customer customerGetById(@PathVariable int customerId)  {
        return customerService.customerGetById(customerId);
    }
    @GetMapping(value = "/listOfCustomers")
    public ModelAndView home() {
        List<Customer > customerList  = customerService.getAllCustomers();
        Customer customer = new Customer();
        ModelAndView mav = new ModelAndView("customerList");
        mav.addObject("customer",customer);
        mav.addObject("customerList", customerList);
        return mav;
    }
    @RequestMapping("/adminLogin")
    public ModelAndView newAdminForm() {
        ModelAndView modelAndView = new ModelAndView("adminLoginPage");
        modelAndView.addObject("admin",new Admin());
        return modelAndView;
    }
    @RequestMapping("/adminPage")
    public ModelAndView adminPage(@RequestParam int adminId,@RequestParam String password ){
        List<Admin> result = customerService.search(adminId,password);
        if(result.isEmpty()){
            return new ModelAndView("errorPage");
        }
        else {
            ModelAndView mav = new ModelAndView("adminPage");
            mav.addObject("result", result);
            return mav;
        }
    }
    @RequestMapping("/customerLogin")
    public ModelAndView newCustomerForm() {
        ModelAndView modelAndView = new ModelAndView("customerLoginPage");
        modelAndView.addObject("customer",new Customer());
        return modelAndView;
    }
    @RequestMapping("/customerPage")
    public ModelAndView customerPage(@RequestParam int customerId,@RequestParam String password ){
        List<Customer> customerResult = customerService.find(customerId,password);
        if(customerResult.isEmpty()){
            return new ModelAndView("errorPage");
        }
        else{
        ModelAndView mav = new ModelAndView("customerPage");
        mav.addObject("customerResult", customerResult);
        return mav;}
    }
    @RequestMapping("/orderList/{customerId}")
    public ModelAndView orderList(@PathVariable int customerId) {
        ModelAndView mav = new ModelAndView("orderList");
        List<Orders> orderList = orderService.get(customerId);
        mav.addObject("orderList", orderList);
        return mav;
    }
    @RequestMapping("/viewProfile/{addressId}")
    public ModelAndView viewProfile(@PathVariable int addressId){
        ModelAndView mav = new ModelAndView("customerProfile");
        List<Address> profile = customerService.getProfile(addressId);
        mav.addObject("profile", profile);
        return mav;
    }

}
