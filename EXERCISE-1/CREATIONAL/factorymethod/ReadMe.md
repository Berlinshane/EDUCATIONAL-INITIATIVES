Here is the `README.md` file specifically for the Factory Method pattern example:

```markdown
# Factory Method Pattern Example

This project demonstrates the Factory Method design pattern. The Factory Method pattern defines an interface for creating objects but allows subclasses to alter the type of objects that will be created. This pattern is used to encapsulate the creation logic for objects and promote loose coupling between the client and the object creation.

## Project Overview

### Components

1. **Document**: An abstract class representing the product. It defines the interface for documents.
2. **WordDocument**: A concrete class that represents a Word document.
3. **PDFDocument**: A concrete class that represents a PDF document.
4. **DocumentFactory**: An abstract class defining the factory method for creating documents.
5. **WordDocumentFactory**: A concrete factory that creates `WordDocument` instances.
6. **PDFDocumentFactory**: A concrete factory that creates `PDFDocument` instances.
7. **Main**: The main class to demonstrate the Factory Method pattern by using different factories to create documents.

### Files

- **Document.java**: Abstract class for document products.
- **WordDocument.java**: Concrete class for Word documents.
- **PDFDocument.java**: Concrete class for PDF documents.
- **DocumentFactory.java**: Abstract class with the factory method for creating documents.
- **WordDocumentFactory.java**: Concrete factory for creating `WordDocument` instances.
- **PDFDocumentFactory.java**: Concrete factory for creating `PDFDocument` instances.
- **Main.java**: Main class to demonstrate the use of the factory method to create different types of documents.

## How to Run

1. **Navigate to the `factorymethod` Directory**

   ```bash
   cd <dir>
   ```

2. **Compile the Java Files**

   ```bash
   javac *.java
   ```

3. **Run the Main Class**

   ```bash
   java Main
   ```
This `README.md` provides an overview of the Factory Method pattern implementation, including the components, how to run the example, and the expected output.
