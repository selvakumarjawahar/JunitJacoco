package com.dusaneinfotech;
import com.dusaneinfotech.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MyStackUT {
    @Test
    public void test_add_to_stack(){
        //Arrange
        MyStack mstack = new MyStack();

        //Act
        mstack.push(10);

        //Assert
        assertEquals(1,mstack.getCount());
    }
    @Test
    public void test_add_to_stack_overflow(){
        //Arrange
        MyStack mstack = new MyStack();

        //Act
        mstack.push(10);
        mstack.push(10);
        mstack.push(10);

        mstack.push(10);
        mstack.push(10);
        mstack.push(10);

        mstack.push(10);
        mstack.push(10);
        mstack.push(10);

        mstack.push(10);
        mstack.push(10);

        //Assert
        assertEquals(1,mstack.getCount());
    }
}
