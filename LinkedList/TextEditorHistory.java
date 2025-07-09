package LinkedList;

class TextState {
    String content;
    TextState next;
    TextState prev;

    public TextState(String content) {
        this.content = content;
        this.next = null;
        this.prev = null;
    }
}

public class TextEditorHistory {
    private TextState head;
    private TextState tail;
    private TextState current;
    private int size = 0;
    private final int MAX_HISTORY = 10;

    // Add new state (typing or action)
    public void addState(String content) {
        TextState newState = new TextState(content);

        // Remove all forward history (redo) after current
        if (current != null && current.next != null) {
            current.next.prev = null;
            current.next = null;
        }

        if (head == null) {
            head = newState;
            tail = newState;
            current = newState;
        } else {
            current.next = newState;
            newState.prev = current;
            current = newState;
            tail = current;
        }

        size++;
        enforceHistoryLimit();
    }

    // Enforce max size (10 states)
    private void enforceHistoryLimit() {
        if (size <= MAX_HISTORY) return;

        head = head.next;
        if (head != null) head.prev = null;
        size--;
    }

    // Undo: move to previous state
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("No more undo steps available.");
        }
    }

    // Redo: move to next state
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("No more redo steps available.");
        }
    }

    // Display current content
    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current Text: \"" + current.content + "\"");
        } else {
            System.out.println("Editor is empty.");
        }
    }

    // For debugging: display all history
    public void printAllStates() {
        System.out.println("Full History:");
        TextState temp = head;
        while (temp != null) {
            if (temp == current) {
                System.out.println("-> [CURRENT] \"" + temp.content + "\"");
            } else {
                System.out.println("   \"" + temp.content + "\"");
            }
            temp = temp.next;
        }
    }

    // Main to test
    public static void main(String[] args) {
        TextEditorHistory editor = new TextEditorHistory();

        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");
        editor.addState("Hello, World!");
        editor.displayCurrentState();

        System.out.println("\nUndoing 2 steps...");
        editor.undo();
        editor.displayCurrentState();
        editor.undo();
        editor.displayCurrentState();

        System.out.println("\nRedoing 1 step...");
        editor.redo();
        editor.displayCurrentState();

        System.out.println("\nTyping new content (clears redo history):");
        editor.addState("Hello, New World!");
        editor.displayCurrentState();

        System.out.println("\n--- All History ---");
        editor.printAllStates();
    }
}
