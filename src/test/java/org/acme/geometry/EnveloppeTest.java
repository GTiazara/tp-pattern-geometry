package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class EnveloppeTest {

    @Test
    public void testIsEmpty(){
        Enveloppe env = new Enveloppe();
        Assert.assertTrue(env.isEmpty());
    }

}
