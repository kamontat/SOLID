package com.kamontat.liskov_substitution.good.spec;

import com.kamontat.liskov_substitution.good.src.PenthouseSuite;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mrk on 4/8/14.
 */
public class PenthouseSuiteTest {
    @Test
    public void testInitializedWithFourBedrooms() {
        PenthouseSuite penthouse = new PenthouseSuite();
        assertEquals(4, penthouse.numberOfBedrooms);
    }
    
    @Test
    public void testSetsSquareFootage() {
        PenthouseSuite penthouse = new PenthouseSuite();
        penthouse.setSquareFootage(1600);
        
        assertEquals(1600, penthouse.squareFootage);
    }
}
