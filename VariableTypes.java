public class VariableTypes {
    
        // Instance variable
        private int instanceVar;
    
        // Static variable
        private static int staticVar;
    
        public static void main(String[] args) {
            VariableTypes example = new VariableTypes();
            example.localVariableExample();
            example.instanceVariableExample();
            example.staticVariableExample();
        }
    
        // Local variable example
        public void localVariableExample() {
            int localVar = 10; // Local variable
            System.out.println("Local Variable: " + localVar);
            // Note: Local variables must be initialized before use.
        }
    
        // Instance variable example
        public void instanceVariableExample() {
            instanceVar = 20; // Assigning a value to the instance variable
            System.out.println("Instance Variable: " + instanceVar);
            // Instance variables are initialized with default values (e.g., 0 for int) if not explicitly set.
        }
    
        // Static variable example
        public void staticVariableExample() {
            staticVar = 30; // Assigning a value to the static variable
            System.out.println("Static Variable: " + staticVar);
            // Static variables are shared across all instances of the class.
        }
    }
    

