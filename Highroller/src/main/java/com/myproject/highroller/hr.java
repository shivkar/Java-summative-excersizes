/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myproject.highroller;

import java.util.Random;

/**
 *
 * @author SHIVALI
 */
public class hr {public static void main(String[] args){
    Random diceRoller = new Random();
    int rollResult = diceRoller.nextInt(6) + 1;
    
        System.out.println("TIME TO ROOOOOOLL THE DICE!");
        System.out.println("I rolled a " + rollResult);
      if(rollResult == 1) {System.out.println("You rolled a critical failure!");}  
      else {System.out.println("You rolled a nice match");}}}
