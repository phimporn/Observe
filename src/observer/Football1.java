/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author Phimporn
 */
public class Football1 implements MyObserver{
     @Override
    public void update(SourceFootball sourceFootball) {
        System.out.println(
	 "Live result : " + ((Football)sourceFootball).getInputData());
    }
    
}
