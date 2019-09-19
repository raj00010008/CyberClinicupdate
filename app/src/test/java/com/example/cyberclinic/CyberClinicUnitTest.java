package com.example.cyberclinic;

import com.example.cyberclinic.VIEWfragment.LoginFragment;
import com.example.cyberclinic.VIEWfragment.RegisterAccountFragment;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */@RunWith(JUnit4.class)

public class CyberClinicUnitTest {

     private LoginFragment loginFragment;
     private RegisterAccountFragment registerAccountFragment;


     @Before
     public void setUpEnvironment()
     {

     }

     @Test
     public void validation()
     {


     }



    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
}

