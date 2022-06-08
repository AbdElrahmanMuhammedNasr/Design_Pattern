package DesignPattern.Proxy;

import DesignPattern.Proxy.imp.IBookParserProxy;
import DesignPattern.Proxy.interfaces.IBook;

public class main {
    public static void main(String[] args) {
        String book = "this is book as string";
        IBook iBook = new IBookParserProxy(book);
        iBook.getNumber();
    }
}
