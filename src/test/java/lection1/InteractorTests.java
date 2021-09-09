package lection1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InteractorTests {

    @Test
    public void test1() {
        assertEquals(3, Interactor.getFinalVerdict(54,0,3));
        assertEquals(16, Interactor.getFinalVerdict(0,0,16));
    }

    @Test
    public void test2() {
        assertEquals(8, Interactor.getFinalVerdict(54,1,8));
        assertEquals(16, Interactor.getFinalVerdict(0,1,16));
    }

    @Test
    public void test3() {
        assertEquals(3, Interactor.getFinalVerdict(54,4,8));
        assertEquals(4, Interactor.getFinalVerdict(0,4,16));
    }

    @Test
    public void test4() {
        assertEquals(0, Interactor.getFinalVerdict(54,6,8));
        assertEquals(0, Interactor.getFinalVerdict(0,6,16));
    }

    @Test
    public void test5() {
        assertEquals(1, Interactor.getFinalVerdict(54,7,8));
        assertEquals(1, Interactor.getFinalVerdict(0,7,16));
    }

    @Test
    public void test6() {
        assertEquals(2, Interactor.getFinalVerdict(54,2,8));
        assertEquals(3, Interactor.getFinalVerdict(120,3,16));
        assertEquals(5, Interactor.getFinalVerdict(-98,5,16));
    }
}
