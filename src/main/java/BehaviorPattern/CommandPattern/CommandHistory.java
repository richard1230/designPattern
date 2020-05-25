package BehaviorPattern.CommandPattern;

import java.util.Stack;

// 全局命令历史记录就是一个堆桟。
public class CommandHistory {
    private Stack<Command> history = new Stack<>();

    public void push(Command c) {
        history.push(c);
    }

    public Command pop() {
        return history.pop();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }
}
