package DesignPattern.Proxy.imp;

import DesignPattern.Proxy.interfaces.IBook;

public class IBookParser implements IBook {
    String book = null;
    /**
     * this  operation is expensive
     * so we use proxy
     * => not do this operation until i really want it
     * */
    public IBookParser(String book){
        this.book = book;
    }
    @Override
    public void getNumber() {
        System.out.println(this.book.length());
    }
}
