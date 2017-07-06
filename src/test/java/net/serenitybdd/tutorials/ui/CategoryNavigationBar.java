package net.serenitybdd.tutorials.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.tutorials.model.Category;
import org.openqa.selenium.By;

/**
 * Created by anatoliihanziuk on 7/5/17.
 */
public class CategoryNavigationBar extends PageObject{

    public void selectCategory(Category category) {
        $("#w0-container").find(By.linkText(category.name())).click();
    }
}
