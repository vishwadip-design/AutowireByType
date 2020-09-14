package com.byType;

public class Book {
private Author auther;
private float prize;
private String isbn;
public Author getAuther() {
	return auther;
}
public void setAuther(Author auther) {
	this.auther = auther;
}
public float getPrize() {
	return prize;
}
public void setPrize(float prize) {
	this.prize = prize;
}
public String getIsbn() {
	return isbn;
}
public void setIsbn(String isbn) {
	this.isbn = isbn;
}
@Override
public String toString() {
	return "Book [auther=" + auther + ", prize=" + prize + ", isbn=" + isbn + "]";
}

}
