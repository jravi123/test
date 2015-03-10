package com.grandcircus.javabootcamp.wordsparser;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		Document connect = Jsoup.connect("https://www.google.com").get();
		System.out.println(connect);
	} 
}
