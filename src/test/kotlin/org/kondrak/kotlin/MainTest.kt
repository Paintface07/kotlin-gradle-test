package org.kondrak.kotlin

import org.junit.Test
import kotlin.test.*

/**
 * Created by Administrator on 2/23/2016.
 */
 public class JUnit4MainTest {
    @Test fun testTrue() {
        // Do I know what's real?
        assertEquals(true, true)
    }

    @Test fun testGetter() {
        // Can I test things?
        assertEquals("Hello World!", stringGetter())
    }
}