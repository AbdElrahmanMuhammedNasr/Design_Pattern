package DesignPattern.Proxy.imp;

import DesignPattern.Proxy.interfaces.IBook;

public class IBookParserProxy implements IBook {
    IBook iBook=null;
    String book;
    public IBookParserProxy(String book){
            this.book = book;
    }

    @Override
    public void getNumber() {
        if (iBook == null){
            iBook = new IBookParser(this.book);
        }
        this.iBook.getNumber();
    }
}
