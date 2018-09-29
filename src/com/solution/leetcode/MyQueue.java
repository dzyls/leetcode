package com.solution.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author dzyls
 * @Description 用栈实现队列
 * @Time 2018/9/29 18:06
 **/
public class MyQueue {


    private List list = null;

    /** Initialize your data structure here. */
    public MyQueue() {
        list = new ArrayList();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        if (list == null){
            return;
        }
        list.add(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (!checkList()){
            return -1;
        }
        int result = (int) list.get(0);
        List l = new ArrayList();
        for (int i = 1; i < list.size(); i++) {
            l.add(list.get(i));
        }
        list = l;
        return result;
    }

    /** Get the front element. */
    public int peek() {
        if (!checkList()){
            return -1;
        }
        return (int) list.get(0);
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return list == null || list.size() ==0;
    }

    private boolean checkList(){
        return list != null && list.size() !=0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
