package factorymethod;

public class PDFDocument extends Document {
    @Override
    public void open() {
        System.out.println("Opening a PDF document.");
    }
}
