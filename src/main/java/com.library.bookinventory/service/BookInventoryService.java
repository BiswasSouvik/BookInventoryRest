package com.library.bookinventory.service;

import com.library.bookinventory.model.BookInventory;

import java.util.List;

public interface BookInventoryService {
    void addBookInventory(BookInventory bookInventory);

    List<BookInventory> listBookInventory();

    BookInventory getBookInventory(String bookId);

    void deleteBookInventory(BookInventory bookInventory);

    BookInventory updateBookInventory(BookInventory bookInventory);
}
