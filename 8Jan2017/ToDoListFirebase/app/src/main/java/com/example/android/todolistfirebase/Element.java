package com.example.android.todolistfirebase;

/**
 * Created by zeeshanhanif-pc on 1/8/2017.
 */
public class Element {

    private boolean checkedElements;
    private String currentElement;
    private String pushId;

    public Element() {
    }

    public Element(boolean checkedElements, String currentElement, String pushId) {
        this.checkedElements = checkedElements;
        this.currentElement = currentElement;
        this.pushId = pushId;
    }

    public boolean isCheckedElements() {
        return checkedElements;
    }

    public void setCheckedElements(boolean checkedElements) {
        this.checkedElements = checkedElements;
    }

    public String getCurrentElement() {
        return currentElement;
    }

    public void setCurrentElement(String currentElement) {
        this.currentElement = currentElement;
    }

    public String getPushId() {
        return pushId;
    }

    public void setPushId(String pushId) {
        this.pushId = pushId;
    }
}
