package BehaviorPattern.CommandPattern;

// 这里是具体命令。
public class CopyCommand extends Command {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    // 复制命令不会被保存到历史记录中，因为它没有改变编辑器的状态。
    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
