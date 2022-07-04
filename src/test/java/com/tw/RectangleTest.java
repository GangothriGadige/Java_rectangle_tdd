package com.tw;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static com.tw.Rectangle.createSquare;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class RectangleTest {
    @Nested
    class RectangleMensuration {

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
    @Nested
    static
    class SquareMensuration {
        private static Rectangle square;

        @Test
        void should_have_an_area_of_nine_when_side_is_three() {
            square = createSquare(3);

            assertThat(square.area(), is(equalTo(9)));
        }

        @Test
        void should_have_perimeter_of_eight_when_side_is_two() {
            square = createSquare(2);

            assertThat(square.perimeter(), is(equalTo(8)));
        }
    }
}




