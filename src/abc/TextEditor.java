package abc;

import java.util.logging.*;

public class TextEditor {
    public static void main(String[] args) {
        // Khởi tạo các thành phần của text editor
        Document document = new Document();
        FileHandler fileHandler = new FileHandler();
        TextEditorController controller = new TextEditorController(document, fileHandler);
        TextView view = new TextView(controller);
        
        // Hiển thị giao diện
        view.display();
    }
}