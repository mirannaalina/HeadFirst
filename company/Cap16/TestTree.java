package com.company.Cap16;

import java.util.TreeSet;

public class TestTree {

    public static void main (String[]args){
        new TestTree().go().go().go().go().go();
    }

    public TestTree go() {
        Book b1 =new Book("how cats work");
        Book b2 =new Book("remix your bod");
        Book b3 =new Book("findin emo");

        TreeSet<Book> tree = new TreeSet<Book>();
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree);

        return new TestTree();

    }
//    class Book implements Comparable{
//        String title;
//        public Book(String t) {
//            title = t;
//        }
//        public int compareTo(Object b){
//            Book book = (Book)b;
//            return (title.compareTo(book.title));
//        }
//    }

}
