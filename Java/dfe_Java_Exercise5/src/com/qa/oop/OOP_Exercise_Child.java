package com.qa.oop;

public class OOP_Exercise_Child extends OOP_Exercise{
	//child class
	//field
	private boolean isRead;
	private int booksByAuthor;
	
	public OOP_Exercise_Child(String title, String author, String genre, boolean isRead, int booksByAuthor) {
		super(title, author, genre);
		this.isRead = isRead;
		this.booksByAuthor = booksByAuthor;
	}
	
	@Override
	public void bookReview() {
		System.out.println("The book was a good read");
	}
	
	/**
	 * @return the isRead
	 */
	public boolean isRead() {
		return isRead;
	}
	/**
	 * @param isRead the isRead to set
	 */
	public void setRead(boolean isRead) {
		this.isRead = isRead;
	}
	/**
	 * @return the booksByAuthor
	 */
	public int getBooksByAuthor() {
		return booksByAuthor;
	}
	/**
	 * @param booksByAuthor the booksByAuthor to set
	 */
	public void setBooksByAuthor(int booksByAuthor) {
		this.booksByAuthor = booksByAuthor;
	}
	
}
