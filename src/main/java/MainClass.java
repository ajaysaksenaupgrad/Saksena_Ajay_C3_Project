import java.time.LocalTime;

public class MainClass {
	
	// This is a Main Class for testing purposes
	
	public static void main(String[] args) throws restaurantNotFoundException {
		
		LocalTime openingTime = LocalTime.parse("10:30:00");
        LocalTime closingTime = LocalTime.parse("22:00:00");
        Restaurant restName = new Restaurant("Amelie's cafe","Chennai",openingTime,closingTime);
        restName.addToMenu("Sweet corn soup",119);
        restName.addToMenu("Vegetable lasagne", 269);
        System.out.println(restName.getMenu());
        System.out.println(restName.isRestaurantOpen());
        RestaurantService restaurantService = new RestaurantService();
        Restaurant addRestaurant = restaurantService.addRestaurant("Amelie's cafe","Chennai",openingTime,closingTime);
        addRestaurant.addToMenu("Sweet corn soup",119);
        addRestaurant.addToMenu("Vegetable lasagne", 269);
        System.out.println(restaurantService.findRestaurantByName("Amelie's cafe"));
        System.out.println(restaurantService.findRestaurantByName("Amelie cafe"));

		
	}

}
