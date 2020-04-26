package com.mockito.Mockito;

//// https://www.vogella.com/tutorials/Mockito/article.html


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

import java.util.LinkedList;
import java.util.List;

import com.mockito.Mockito.service.AddService;
import com.mockito.Mockito.service.CalcService;

import junit.framework.TestCase;

public class MockitoTest extends TestCase {

	CalcService calcService;

	@Mock
	AddService addService;

	@BeforeEach
	public void setup() {
		//// to initialize objects annotated with @Mock, @Spy, @Captor, or @InjectMocks.
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testCal() {

		System.out.println("**--- Test testCalc executed ---**");
		addService = Mockito.mock(AddService.class);
		calcService = new CalcService(addService);

		int num1 = 11;
		int num2 = 12;
		int expected = 23;

		// To add a behavior to the mocked class when() and thenReturn() functions are
		// used. It means that when the mock object (addService) is called for add
		// method with (num1, num2) parameters, then it returns the value stored in the
		// expected variable.

		when(addService.add(num1, num2)).thenReturn(expected);

		int actual = calcService.calc(num1, num2);

		assertEquals(expected, actual);

	}

	@Test
	public void testVerifyMethod() {

		@SuppressWarnings("unchecked")
		List<String> mockList = mock(List.class);
		mockList.add("Pankaj");
		//mockList.add("Jatin");
		mockList.size();
		
		//verify method will pass if add("Pankaj") is called only once on the mocked list object.
		verify(mockList).add("Pankaj");/// Verify the arguments type is same or not.
		// It also check whether method called or not.
		//verify(database).addListener(any(ArticleListener.class));
		//verify(mockList, times(2)).size();
		
		
		/// Spy()
		// this does not work
	    // real method is called so spy.get(0)
	    // throws IndexOutOfBoundsException (list is still empty)
		//List<String> list = new LinkedList<>();
	    //List<String> spy = spy(list);

	    // You have to use doReturn() for stubbing
	    //doReturn("foo").when(spy).get(0);

	    //assertEquals("foo", spy.get(0));

	}

}
