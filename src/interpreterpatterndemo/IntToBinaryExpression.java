/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interpreterpatterndemo;

/**
 *
 * @author User
 */
public class IntToBinaryExpression implements Expression1 {
 private int i;
 public IntToBinaryExpression(int c){
  this.i=c;
 }
 @Override
 public String interpret(InterpreterContext ic) {
  return ic.getBinaryFormat(this.i);
 }
}
