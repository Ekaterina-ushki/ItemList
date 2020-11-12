package com.list.itemlist.controller;

import com.list.itemlist.Service.ItemService;
import com.list.itemlist.model.Item;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@RestController
public class MainController {

    @GetMapping("/")
    public ModelAndView index(Model model) {
        ItemService itemService = new ItemService();
        List<Item> items = itemService.findAllInMain();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("items", items);
        return modelAndView;
    }

    @GetMapping("/cart")
    public ModelAndView cart(Model model) {
        ItemService itemService = new ItemService();
        List<Item> items = itemService.findAllInCart();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("cart");
        modelAndView.addObject("items", items);
        return modelAndView;
    }
}
