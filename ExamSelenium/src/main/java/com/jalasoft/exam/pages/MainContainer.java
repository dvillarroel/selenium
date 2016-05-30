package com.jalasoft.exam.pages;

/**
 * Created by Dante Villarroel on 5/28/2016.
 */
public class MainContainer {

    public LeftMenu goToLeftMenu(){
        return new LeftMenu();
    }

    public Header goToHeader(){
        return new Header();
    }
}
