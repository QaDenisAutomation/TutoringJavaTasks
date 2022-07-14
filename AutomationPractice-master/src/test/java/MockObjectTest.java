import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;

public class MockObjectTest {


    @Mock
    Math calc;

    @Before
    public void create(){
        MockitoAnnotations.initMocks(this);
        when(calc.add(1,2)).thenReturn(3);
    }

    @Test
    public void mockTest(){

        Assert.assertSame(3, calc.add(1,2));
    }
}
