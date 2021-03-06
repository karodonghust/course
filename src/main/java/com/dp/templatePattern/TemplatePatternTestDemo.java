package com.dp.templatePattern;

public class TemplatePatternTestDemo {


    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Tea tea = new Tea();

        coffee.prepareRecipe();
        tea.prepareRecipe();
    }
}
