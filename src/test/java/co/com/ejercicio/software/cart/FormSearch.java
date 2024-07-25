package co.com.ejercicio.software.cart;

import org.openqa.selenium.By;

public class FormSearch {
    public static By SEARCH_ELEMENT = By.name("search");
    public static By SEARCH_BUTTON = By.xpath("//*[@id=\"search\"]/span/button");
    public static By ADD_CART = By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div[2]/div[2]/button[1]/span");
    public static By VIEW_CART = By.xpath("//a[@title='Shopping Cart']");


}
