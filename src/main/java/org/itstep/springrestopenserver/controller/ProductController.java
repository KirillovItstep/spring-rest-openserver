package org.itstep.springrestopenserver.controller;

import org.itstep.springrestopenserver.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductController {

    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index(Model model) {
        return "index";
    }

    @RequestMapping(value = { "/addProduct" }, method = RequestMethod.GET)
    public String showAddProductPage(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
        return "addProduct";
    }
}
