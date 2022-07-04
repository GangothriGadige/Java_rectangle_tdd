package com.tw;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class RectangleTest {

    @Test
    void should_have_an_area_of_one_if_length_one_and_breadth_one() {
        Rectangle rectangle = new Rectangle(1, 1);

        assertThat(rectangle.area(), is(equalTo(1)));
    }

    @Test
    void should_have_an_area_of_two_if_length_two_and_breadth_one() {
        Rectangle rectangle = new Rectangle(2, 1);

        assertThat(rectangle.area(), is(equalTo(2)));
    }

    @Test
    void should_have_a_perimeter_of_four_if_length_one_and_breadth_one() {
        Rectangle rectangle = new Rectangle(1, 1);

        assertThat(rectangle.perimeter(), is(equalTo(4)));
    }

    @Test
    void should_have_a_perimeter_of_six_if_length_two_and_breadth_one() {
        Rectangle rectangle = new Rectangle(2, 1);

        assertThat(rectangle.perimeter(), is(equalTo(6)));
    }

}




