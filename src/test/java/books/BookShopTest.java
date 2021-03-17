package books;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * TODO : Add your import here
 */

public class BookShopTest {

    /**
     * TODO : Put your test here
     */
	BookShop bookShop = new BookShop("Test");

    @Test
    public void myFirstTest(){
    	assertEquals(8 * 0, bookShop.cost(new int[] {0,0,0,0,0}));
    }
    
    @Test
    public void mySecondTest(){
        assertEquals(8 * 1, bookShop.cost(new int[] {1,0,0,0,0}));
    }
    @Test
    public void myThirdTest(){
        assertEquals(8 * 2, bookShop.cost(new int[] {0,0,0,2,0}));
    }
    @Test
    public void myFourthTest(){
        assertEquals(8 * 2 * 0.93, bookShop.cost(new int[] {0,0,1,1,0}));
    }
}