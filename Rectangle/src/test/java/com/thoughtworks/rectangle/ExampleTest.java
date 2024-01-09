package com.thoughtworks.rectangle;


import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class ExampleTest{


    @Test
    public void testAreaWithPositiveNumbers() {
        Rectangle rect = new Rectangle(4, 5);
        assertThat(rect.area(), equalTo(20));
    }


    @Test
    public void testAreaWithZero() {
        Rectangle rect = new Rectangle(0, 5);
        assertThat(rect.area(), equalTo(0));
    }


}