package com.zeidler.test.core;

class demo 
{ 
    // static variable single_instance of type Singleton 
    private static demo single_instance = null; 
  
    // variable of type String 
    public String s; 
  
    // private constructor restricted to this class itself 
    private demo() 
    { 
        s = "Hello I am a string part of Singleton class"; 
    } 
  
    // static method to create instance of Singleton class 
    public static demo getInstance() 
    { 
        if (single_instance == null) 
        {
            single_instance = new demo(); 
        }
  
        return single_instance; 
    } 
} 
  
