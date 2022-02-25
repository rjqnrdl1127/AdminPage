package com.example.adminpage.Repository;

import com.example.adminpage.AdminPageApplicationTests;
import com.example.adminpage.Model.Entity.Item;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ItemRepositoryTest extends AdminPageApplicationTests {

    @Autowired
    private ItemRepository itemRepository;

    @Test
    public void create() {

        Item item = new Item();
        item.setName("노트북");
        item.setPrice(100000);
        item.setContent("삼성 노트북");

        Item newItem = itemRepository.save(item);
        Assert.assertNotNull(newItem);
    }

    @Test
    public void read() {
        Long id = 1L;

        Optional<Item> item = itemRepository.findById(id);

        Assertions.assertTrue(item.isPresent());
    }
}
