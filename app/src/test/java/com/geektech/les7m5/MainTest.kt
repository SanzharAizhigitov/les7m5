package com.geektech.les7m5

import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class MainTest {
     var math: Math? = null
    @Before
    fun init(){
        math = Math()
    }
    @Test
    fun simpleTest(){
        assertEquals("4", math?.add("2", "2") )
    }
    @Test
    fun simpleSymbolTest(){
        assertEquals("Напишите целые числа", math?.add("2hrsf", "2") )
    }
    @Test
    fun simpleDoubleTest(){
        assertEquals("Дроби нельзя использовать", math?.add("2.0", "2") )
    }
    @Test
    fun simpleWithPlusTest(){
        assertEquals("4", math?.add("+2", "2") )
    }
    @Test
    fun simpleWithEmptyTest(){
        assertEquals("Напишите целые числа", math?.add("", "2") )
    }
    @Test
    fun simpleWithNegativeTest(){
        assertEquals("0", math?.add("-2", "2") )
    }
    @Test
    fun simpleDivideTest(){
        assertEquals("4", math?.divide("8", "2"))
    }
    @Test
    fun simpleDivideOnZeroTest(){
        assertEquals("На ноль делить нельзя", math?.divide("8", "0"))
    }
    @Test
    fun simpleDivideSymbolTest(){
        assertEquals("Напишите целые числа", math?.divide("8erag", "asdga"))
    }
    @Test
    fun simpleNotNullNumberSymbolTest(){
        assertEquals("1.25", math?.divide("10", "8"))
    }
    @Test
    fun simpleDivideMinusTest(){
        assertEquals("-2", math?.divide("-4", "2"))
    }



    @After
    fun detach(){
        math = null
    }
}