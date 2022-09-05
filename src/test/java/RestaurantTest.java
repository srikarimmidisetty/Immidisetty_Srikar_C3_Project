import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.ArrayList;
import java.time.LocalTime;


import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RestaurantTest {
    Restaurant restaurant;
    //REFACTOR CODE

   @BeforeEach
    public void addRestaurantDetails() {
        LocalTime openingTime = LocalTime.parse("10:30:00");
        LocalTime closingTime = LocalTime.parse("22:00:00");
        restaurant =new Restaurant("Amelie's cafe","Chennai",openingTime,closingTime);
        restaurant.addToMenu("Sweet corn soup",119);
        restaurant.addToMenu("Vegetable lasagne", 269);
    }
/*
    //>>>>>>>>>>>>>>>>>>>>>>>>>OPEN/CLOSED<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    // PASSING TEST CASE FOR RESTAURANT OPEN SCENARIO
    @Test
    public void is_restaurant_open_should_return_true_if_time_is_between_opening_and_closing_time(){
       LocalTime openingTime = LocalTime.now().minusHours(2);
       LocalTime closingTime = LocalTime.now().plusHours(2);
       restaurant = new Restaurant("Amelie's cafe","Chennai",openingTime,closingTime);
       assertTrue(restaurant.isRestaurantOpen());
    }

    // FAILING TEST CASE FOR RESTAURANT OPEN SCENARIO
   @Test
    public void is_restaurant_open_should_return_false_if_time_is_outside_opening_and_closing_time(){
       LocalTime openingTime = LocalTime.now().plusHours(1);
       LocalTime closingTime = LocalTime.now().minusHours(1);
       restaurant =new Restaurant("Amelie's cafe","Chennai",openingTime,closingTime);
       assertFalse(restaurant.isRestaurantOpen());
    }
    //<<<<<<<<<<<<<<<<<<<<<<<<<OPEN/CLOSED>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


    //>>>>>>>>>>>>>>>>>>>>>>>>>>>MENU<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    @Test
    public void adding_item_to_menu_should_increase_menu_size_by_1(){
        int initialMenuSize = restaurant.getMenu().size();
        restaurant.addToMenu("Sizzling brownie",319);
        assertEquals(initialMenuSize+1,restaurant.getMenu().size());
    }
    @Test
    public void removing_item_from_menu_should_decrease_menu_size_by_1() throws itemNotFoundException {
        int initialMenuSize = restaurant.getMenu().size();
        restaurant.removeFromMenu("Vegetable lasagne");
        assertEquals(initialMenuSize-1,restaurant.getMenu().size());
    }
    @Test
    public void removing_item_that_does_not_exist_should_throw_exception() {
        assertThrows(itemNotFoundException.class,
                ()->restaurant.removeFromMenu("French fries"));
    }
    //<<<<<<<<<<<<<<<<<<<<<<<MENU>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
*/
    //Failing Test case for orderValue method//
    @Test
    public void select_item_from_list_should_return_order_value(){
        int orderValue;
        List<String> selectedItemNames = Arrays.asList("Sweet corn soup", "Vegetable lasagne" ) ;
        orderValue = restaurant.getOrderValue(selectedItemNames) ;
        assertEquals(388, orderValue);
    }
}