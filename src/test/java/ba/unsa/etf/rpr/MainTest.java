package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Unit test for simple App.
 */
public class MainTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    void illegalDayTestOne() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Date(31, 9,2001);
        });
    }

    @Test
    void illegalDayTestTwo(){
        assertThrows(IllegalArgumentException.class, () ->{
            new Date(29,2,2001);
        });
    }

    @Test
    void successfullyCreatedDayTestOne(){
        assertEquals("1.1.1",new Date(1,1,1).toString());
    }
    @Test
    void successfullyCreatedDayTestTwo(){
        assertEquals("29.2.2004",new Date(29,2,2004).toString());
    }

    @Test
    void yesterdayTestOne(){
        assertEquals("1.1.2001",new Date(2,1,2001).yesterday().toString());
    }

    @Test
    void yesterdayTestTwo(){
        assertEquals("31.1.2001",new Date(1,2,2001).yesterday().toString());
    }

    @Test
    void yesterdayTestTree(){
        assertEquals("31.12.2000",new Date(1,1,2001).yesterday().toString());
    }
    @Test
    void yesterdayTestFour(){
        assertEquals("29.2.2000",new Date(1,3,2000).yesterday().toString());
    }

    @Test
    void tomorrowTestOne(){
        assertEquals("1.12.1999",new Date(30,11,1999).tomorrow().toString());
    }
    @Test
    void tomorrowTestTwo(){
        assertEquals("31.12.1999",new Date(30,12,1999).tomorrow().toString());
    }
    @Test
    void tomorrowTestTree(){
        assertEquals("1.1.2000",new Date(31,12,1999).tomorrow().toString());
    }
    @Test
    void tomorrowTestFour(){
        assertEquals("29.2.2000",new Date(28,2,2000).tomorrow().toString());
    }
    @Test
    void compareToTestOne(){
        assertTrue(new Date(2,2,2).compareTo(new Date(2,2,2))==0);
    }
    @Test
    void compareToTestTwo(){
        assertTrue(new Date(2,2,2).compareTo(new Date(2,2,1))>0);
    }
    @Test
    void compareToTestTree(){
        assertTrue(new Date(2,2,2).compareTo(new Date(2,1,2))>0);
    }
    @Test
    void compareToTestFour(){
        assertTrue(new Date(2,2,2).compareTo(new Date(3,2,2))<0);
    }
    @Test
    void daysInBetweenTest1(){
        assertEquals(10,Date.getNumberOfDaysBetween(new Date(1,1,1),
                                                            new Date(11,1,1)));
    }
    @Test
    void daysInBetweenTest2(){
        assertEquals(3870,Date.getNumberOfDaysBetween(new Date(1,10,1999),
                new Date(6,5,2010)));
    }
    @Test
    void daysInBetweenTest3(){
        assertEquals(6517,Date.getNumberOfDaysBetween(new Date(1,1,2005),
                new Date(5,11,2022)));
    }
}
