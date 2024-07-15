/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interpreterpatterndemo;

/**
 *
 * @author User
 */
public class InterpreterPatternDemo {

            public static Expression getMaleExpression(){
      Expression robert = new TerminalExpression("Robert");
      Expression john = new TerminalExpression("John");
      return new OrExpression(robert, john);		
   }

   //Rule: Julie is a married women
   public static Expression getMarriedWomanExpression(){
      Expression julie = new TerminalExpression("Julie");
      Expression married = new TerminalExpression("Married");
      return new AndExpression(julie, married);		
   } 
   
    public static void main(String[] args) {
        // TODO code application logic here 
        Expression isMale = getMaleExpression();
      Expression isMarriedWoman = getMarriedWomanExpression(); 
       
      System.out.println("John is male? " + isMale.interpret("John"));
      System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie")); 
      
      String str1 = "20 in Binary ";
      InterpreterClient ec = new InterpreterClient(new InterpreterContext());   
  System.out.println(str1+"= "+ec.interpret(str1));
   }
   }    
     
    
 
