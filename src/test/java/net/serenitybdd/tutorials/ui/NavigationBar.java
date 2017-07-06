package net.serenitybdd.tutorials.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.tutorials.model.Category;

/**
 * Created by anatoliihanziuk on 7/5/17.
 */
public class NavigationBar {
    public static Target category(Category category) {
        return Target.the(category.name() + " category")
                .locatedBy("//*[@id=\"w0-container\"]//a[contains(text(), '{0}')]")
                .of(category.name());
    }
}
