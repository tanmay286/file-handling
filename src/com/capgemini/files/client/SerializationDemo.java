package com.capgemini.files.client;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.capgemini.files.model.BankAccount;
import com.capgemini.files.model.DebitCard;

public class SerializationDemo {
	public static void main(String arg[]) throws IOException, ClassNotFoundException {
		DebitCard debitCard=new DebitCard(1289025789324L, 242, 9, 2019);
		BankAccount bankAccount=new BankAccount(12312343, "JOHN DOE", "SAVING", 3400, debitCard);
		
		//Serialization Process
		
		FileOutputStream fileOutputStream=new FileOutputStream("account.ser");
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
		
		objectOutputStream.writeObject(bankAccount);
		objectOutputStream.close();
		
		FileInputStream fileInputStream=new FileInputStream("account.ser");
		ObjectInputStream inputStream=new ObjectInputStream(fileInputStream);
		
		BankAccount account2=(BankAccount) inputStream.readObject();
		inputStream.close();
		System.out.println(account2);
	}

}
