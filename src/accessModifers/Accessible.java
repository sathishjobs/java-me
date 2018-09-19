package accessModifers;

// Challange:
// In the following interface declaration , what is the visibility of:
//
// 1. the accessible interface?
// 2. teh int variable SOME_CONSTANT?
// 3. methodA?
// 4. methodB and methodC?


interface Accessible { // interface visibility is package private
    int SOME_CONSTANT = 100; // visibility is public static final
    public void methodA();
    void methodB(); // visibility public
    boolean methodC(); // visibility public
}
