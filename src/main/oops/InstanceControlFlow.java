package main.oops;


public class InstanceControlFlow {
    int i = 10; 
    {   
        m1();  
        System.out.println("first block"); 
    }

    InstanceControlFlow() {
        System.out.println("CONSTRUCTOR"); 
    }

    public static void main(String[] args) { 
        InstanceControlFlow i = new InstanceControlFlow(); 
        System.out.println("main method"); 
        InstanceControlFlow i2 = new InstanceControlFlow(); 
    }
    public void m1(){  
        System.out.println(j);  
    }
    { 
        System.out.println("second block"); 
    }
    int j = 20;

}
//Rule
// 1. first static , 
// 1. when there is no object creation, main method is alone executed


// 1.  1. identification of instance members from top to bottom[3-8]
//2. execution of instance variable from top to bottom[9-14]
// 3. execution of constructor


// static flow -> one time activity
// instance flow -> for every obj 
// ------------------

//IF we're not creating object, then identification of instance also not happen
//instance members will be created, only when we're creating atleast one object
//for every object creation, instance block will be executed
//first static block, in that for every object creation, instance flow will be performed



