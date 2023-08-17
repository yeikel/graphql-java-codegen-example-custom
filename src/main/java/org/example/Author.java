package org.example;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import io.github.kobylynskyi.product.graphql.model.Book;

import java.util.StringJoiner;

public class Author implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private Book book;

    public Author() {
    }

    public Author(String name, Book book) {
        this.name = name;
        this.book = book;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Book getBook() {
        return book;
    }
    public void setBook(Book book) {
        this.book = book;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (book != null) {
            joiner.add("book: " + GraphQLRequestSerializer.getEntry(book));
        }
        return joiner.toString();
    }

}
