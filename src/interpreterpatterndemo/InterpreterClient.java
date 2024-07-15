/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interpreterpatterndemo;

/**
 *
 * @author User
 */
public class InterpreterClient { 
     private static InterpreterContext InterpreterContext() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
 public InterpreterContext ic;
 public InterpreterClient(InterpreterContext i){
  this.ic=i;
 } 
 
 public String interpret(String str){
  Expression1 exp=null;
  //create rules for expressions
    if(str.contains("Binary")){
    exp=new IntToBinaryExpression(Integer.parseInt(str.substring(0,str.indexOf(" "))));
  }else return str;
   return exp.interpret(ic); 
 
 } 

}
    
 
