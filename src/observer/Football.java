/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;

/**
 *
 * @author sarun
 */
public class Football implements SourceFootball {
    private final ArrayList<MyObserver> list;
    private String inputData;

    public Football() {
        this.list = new ArrayList<MyObserver>();
    }
    public void setInputData(String inputData) {
	this.inputData = inputData;
	notifyObservers();
    }
    public String getInputData() {
	return inputData;
    }
    @Override
    public void register (MyObserver observer) {
        list.add(observer);
    }
    @Override
    public void notifyObservers() {
        for (int m = 0; m < list.size(); m++) {
            list.get(m).update(this);
        }
    }
}
