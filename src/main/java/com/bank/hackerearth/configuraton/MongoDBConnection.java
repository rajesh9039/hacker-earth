
package com.bank.hackerearth.configuraton;

import org.springframework.context.annotation.Configuration;

import com.mongodb.MongoClient;

@Configuration
public class MongoDBConnection {
	private static MongoClient client;
	public static MongoClient getMongConnection() {
		return client = new MongoClient("localhost", 27017);
	}
}
