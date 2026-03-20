class Variables {

    int instanceVar = 100;        //  Instance variable make for object level
    static int staticVar = 200;  // Static variable make for the class level

    public static void main(String[] args) {

        int localVar = 50; // there we create Local variable 

        Variables obj = new Variables();
// we can access local variable, instance variable and static variable in main method
        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + obj.instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }
}