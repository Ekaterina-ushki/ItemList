package com.list.itemlist.controller;

import com.list.itemlist.Service.ItemService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AddController {

    @PostMapping("/add/confirm")
    public ModelAndView add(@RequestParam("name") String name,
                            @RequestParam("price") int price)  {

        ItemService itemService = new ItemService();
        itemService.addItem(0, name, price, "Необходимо купить");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("confirm");
        return modelAndView;
    }

    @GetMapping("/add")
    public ModelAndView add(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("addItem");
        return modelAndView;
    }


    @RequestMapping(path = "/add/{id}/cart", method = RequestMethod.POST)
    public void addInCart(@PathVariable("id") int id) {
        ItemService itemService = new ItemService();
        itemService.addItemToCart(id);
    }
}
