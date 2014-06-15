package com.levelup.java.exercises.beginner;

import java.util.ArrayList;
import java.util.List;

/**
 * This java exercise will demonstrate a solution to the phone book  will array list problem.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/phone-book-arraylist/'>Phone book arraylist</a>
 */
public class PhoneBookArrayList {

	public class PhoneBookEntry {
		
		public PhoneBookEntry(String name, String phoneNumber) {
			super();
			this.name = name;
			this.phoneNumber = phoneNumber;
		}
		
		private String name;
		private String phoneNumber;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		
		@Override
		public String toString() {
			return "PhoneBookEntry [name=" + name + ", phoneNumber="
					+ phoneNumber + "]";
		}
		
	}

	
	public static void main(String[] args) {

		PhoneBookArrayList bookArrayList = new PhoneBookArrayList();
		
		PhoneBookEntry entry1 = bookArrayList.new PhoneBookEntry("Jack", "920-456-2345");
		PhoneBookEntry entry2 = bookArrayList.new PhoneBookEntry("Sam", "868-344-2345");
		PhoneBookEntry entry3 = bookArrayList.new PhoneBookEntry("George", "414-234-2345");
		PhoneBookEntry entry4 = bookArrayList.new PhoneBookEntry("Dimo", "608-049-2345");
		PhoneBookEntry entry5 = bookArrayList.new PhoneBookEntry("Jenny", "971-456-2345");
		
		List<PhoneBookEntry> phoneNumberEntries = new ArrayList<>();
		phoneNumberEntries.add(entry1);
		phoneNumberEntries.add(entry2);
		phoneNumberEntries.add(entry3);
		phoneNumberEntries.add(entry4);
		phoneNumberEntries.add(entry5);
		
		phoneNumberEntries.forEach(number -> System.out.println(number));
	}
}
