import org.junit.*;

import static org.junit.Assert.assertEquals;

public class TestsJUnit {

    private static Cat cat;
    private static Bird bird;
    private static Dog dog;

    @BeforeClass
    public static void initTestCatClass(){
        cat=new Cat();
        System.out.println("The beginning of testing the Cat class");
    }
    @AfterClass
    public static void testMessageCatClass(){
        System.out.println("Cat Class Test Completed");
    }

    @Test
    public void checkMultiply() throws ArithmeticException{
        int result=cat.countAnimals(5,3);
        try {
            assertEquals("5 x 3 must be 15", 15, result);
        }catch (ArithmeticException e){
            return ;
        }
    }

    @BeforeClass
    public static void initTestBirdClass(){
        bird=new Bird();
        System.out.println("The beginning of testing the Bird class");
    }
    @AfterClass
    public static void testMessageBirdClass(){
        System.out.println("Bird Class Test Completed");
    }

    @Test
    public void checkAdd(){
        int result = bird.countAnimals(3,7);
        assertEquals(10,result);
    }

    @Test
    public void checkAddTwo(){
        bird.countAnimals(4,7);
        assertEquals("Expected result must be 10, but actual result is 11",10,11);
    }


    @BeforeClass
    public static void initTestDogClass(){
        dog=new Dog();
        System.out.println("The beginning of testing the Dog class");
    }
    @AfterClass
    public static void testMessageDogClass(){
        System.out.println("Dog Class Test Completed");
    }

    @Test
    public void checkDivision(){
        double result=dog.countAnimals(20,10);
        Assert.assertEquals("20 / 10 must be 2",2,result,0.0);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionException(){
        int x=20,y=0;
        if(!(dog.countAnimals(x,y)==x&&y==0)) throw new ArithmeticException();
    }

    @Ignore
    @Test(timeout =100 )
    public void testNElements(){
        for (int i=0;i<1000;i++){
            System.out.println(i);
        }
    }

}
