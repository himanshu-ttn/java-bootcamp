package com.tothenew.java8.ques6;

public class DefautStaticMethodExample implements IDefaultStaticInterface{
    @Override
    public void show() {
        System.out.println("Override Method show of interface");
    }

    static void main(String[] args) {

        DefautStaticMethodExample  defautStaticMethodExample = new DefautStaticMethodExample();

        defautStaticMethodExample.show();

        // :: this is default method ::
        defautStaticMethodExample.display();

        IDefaultStaticInterface.staticMethod();
    }
}
