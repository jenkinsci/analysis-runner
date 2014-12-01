package edu.hm.hafner;

/**
 * Useless class - only for test-cases.
 *
 * @author Christian M&ouml;stl
 */
public class ClassDataAbstractionCoupling {
 private AnnotationUseStyle one = new AnnotationUseStyle();
    
    private AnonInnerLength two = new AnonInnerLength();
    
    private AvoidNestedBlocks three = new AvoidNestedBlocks();
    
    private BooleanExpressionComplexity four = new BooleanExpressionComplexity();
    
    private ClassTypeParameterName<String> five = new ClassTypeParameterName<String>();
    
    private JavadocMethod six = new JavadocMethod();
    
    private CovariantEquals seven = new CovariantEquals();
    
    private DefaultComesLast eight = new DefaultComesLast(2);
    
    private EmptyBlock nine = new EmptyBlock(2);
    

    /**
     * Returns the one.
     * 
     * @return the one
     */
    public AnnotationUseStyle getOne() {
        return one;
    }
    
    /**
     * Returns the two.
     * 
     * @return the two
     */
    public AnonInnerLength getTwo() {
        return two;
    }
    
    /**
     * Returns the three.
     * 
     * @return the three
     */
    public AvoidNestedBlocks getThree() {
        return three;
    }
    
    /**
     * Returns the four.
     * 
     * @return the four
     */
    public BooleanExpressionComplexity getFour() {
        return four;
    }
    
    /**
     * Returns the five.
     * 
     * @return the five
     */
    public ClassTypeParameterName<String> getFive() {
        return five;
    }
    
    /**
     * Returns the six.
     * 
     * @return the six
     */
    public JavadocMethod getSix() {
        return six;
    }
    
    /**
     * Returns the seven.
     * 
     * @return the seven
     */
    public CovariantEquals getSeven() {
        return seven;
    }
    
    /**
     * Returns the eight.
     * 
     * @return the eight
     */
    public DefaultComesLast getEight() {
        return eight;
    }
    
    /**
     * Returns the nine.
     * 
     * @return the nine
     */
    public EmptyBlock getNine() {
        return nine;
    }
}