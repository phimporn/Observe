/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;


import java.util.Scanner;


/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        
        while(true){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Football Score Ex Thai 2-0 UAE \n Exit program Please Enter");
        String text = sc.nextLine();
        if("".equals(text)){
            System.out.println("No Text");
            return; //System.exit(0)
        }else{
        Football1 football1 = new Football1();
	Football2 football2 = new Football2();
	Football football = new Football(); 
        football.register(football1);              
	football.register(football2);              
	football.setInputData(text);
//        football.setInputData(text);
        }
    }
 }
}
