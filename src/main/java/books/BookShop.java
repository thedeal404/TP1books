package books;

public class BookShop {

	private final String name;

	/**
	 * Constructor of the class Book shop
	 * 
	 * @param name name of the book shop
	 */
	public BookShop(String name) {
		this.name = name;
	}

	/**
	 * method to compute the cost of a basket
	 * 
	 * @param books array corresponding to the number of each harry potter book the
	 *              client desire to buy (books.length should return 5)
	 * @return the cost in euro with the discount
	 */
	public double cost(int[] books) {
		// TODO complete
		int allBooks = 0;
		int bookCounter = 0;
		double price = 0;

		for (int i = 0; i < 5; i++) {
			if (books[i] > 0) {
				allBooks += books[i];
				bookCounter += 1;
			}
		}

		if (bookCounter == 1) {
			price = allBooks * 8;
		}

		allBooks -= bookCounter;
		if (bookCounter == 2) {
			price = bookCounter * 8 * 0.93 + allBooks * 8;
		}
		if (bookCounter == 3) {
			price = bookCounter * 8 * 0.86 + allBooks * 8;
		}
		if (bookCounter == 4) {
			price = bookCounter * 8 * 0.72 + allBooks * 8;
		}
		if (bookCounter == 5) {
			price = bookCounter * 8 * 0.65 + allBooks * 8;
		}

		return price;
	}
}
