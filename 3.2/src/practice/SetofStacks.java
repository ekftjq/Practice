package practice;

import java.util.ArrayList;

/**
 * Created by Moon on 2016-06-16.
 */
public class SetofStacks extends Stack {
    ArrayList<Stack> SetofStacks = new ArrayList<>();

    public SetofStacks(int capacity) {
        super(capacity);
    }

    public Stack getLastStack() {
        if(SetofStacks.size() == 0) {
            return null;
        }

        for(int i = 0; i < SetofStacks.size(); i++) {
            if(!SetofStacks.get(i).full) {
                return SetofStacks.get(i);
            }
        }

        return SetofStacks.get(SetofStacks.size()-1);
    }

    public void push(int data) {
        Stack last = getLastStack();
        if(last != null && !last.full) {
            last.push(data);
        }
        else {
            System.out.println("reached cap at :" + data);
            Stack newstack = new Stack(capacity);
            newstack.push(data);
            SetofStacks.add(newstack);
        }
    }

    public Object pop() {
        Stack last = getLastStack();
        Object a = last.pop();
        if(last.count == 0) {
            SetofStacks.remove(SetofStacks.size() - 1);
        }
        return a;
    }

    public Object popAt(int index) {
        Stack specfic = SetofStacks.get(index);
        Object result = specfic.pop();
        if(SetofStacks.size()-1 == index) {
            return result;
        }
        return result;
    }

}
