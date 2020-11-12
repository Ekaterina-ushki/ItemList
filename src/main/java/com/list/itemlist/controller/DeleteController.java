package com.list.itemlist.controller;

import com.list.itemlist.Service.ItemService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class DeleteController {

    @RequestMapping(path = "/item/{id}/delete", method = RequestMethod.POST)
    public ModelAndView delete(@PathVariable("id") int id) {
        ItemService service = new ItemService();
        service.deleteItem(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }


    @RequestMapping(path = "/item/{id}/delete/cart", method = RequestMethod.POST)
    public ModelAndView deleteFromCart(@PathVariable("id") int id) {
        ItemService service = new ItemService();
        service.deleteFromCart(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("cart");
        return modelAndView;
    }

}
