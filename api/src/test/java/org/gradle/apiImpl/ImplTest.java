package org.gradle.apiImpl;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ajo on 5/5/17.
 */
public class ImplTest {
    @Test
    public void implMethod2() throws Exception {
        assertEquals(16.0, new Impl().implMethod2(), 0.001);
    }

}