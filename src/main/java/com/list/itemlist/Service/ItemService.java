package com.list.itemlist.Service;

import com.list.itemlist.database.DBService;
import com.list.itemlist.database.ItemDAO;
import com.list.itemlist.model.Item;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    private static ItemDAO dataBase = new DBService();

    public void addItem(int id, String name, int price, String status) {
        Item item = new Item(id, name, price, status);
        dataBase.addItem(item);
    }

    public void addItemToCart(int id) {
        dataBase.addItemToCart(id);
    }

    public List<Item> findAllInMain() {
        return dataBase.findAllInMain();
    }


    public Item findById(int id) {
        return dataBase.findById(id);
    }

    public int countOfItems(){
        return dataBase.countOfItems();
    }

    public void deleteFromCart(int id){
        dataBase.deleteFromCart(id);
    }


    public void deleteItem(int id) {
        dataBase.deleteItem(id);
    }

    public List<Item> findAllInCart(){
        return dataBase.findAllInCart();
    }
}
