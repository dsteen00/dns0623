package dns0623;

import static org.junit.jupiter.api.Assertions.*;

import java.io.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RentalStoreTest1 {
	private final static InputStream systemIn = System.in;
	private final static PrintStream systemOut = System.out;
	private static ByteArrayOutputStream typeOut;

	
	@BeforeEach
	 void setUp() throws Exception {
	  typeOut = new ByteArrayOutputStream();
	        System.setOut(new PrintStream(typeOut));
	 }
	@AfterEach
	 void tearDown() {
	  System.setIn(systemIn);
	        System.setOut(systemOut);
	 }
	
	
	@Test
	void testRunStoreNegative() {
		
		String simulatedUserInput = "JAKR" + System.getProperty("line.separator") +
		       "2015" + System.getProperty("line.separator") +
		       "9" + System.getProperty("line.separator") +			       
		       "3" + System.getProperty("line.separator") +
		       "5" + System.getProperty("line.separator") +
		       "101" + System.getProperty("line.separator");
			    
		System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));
		
		RentalStore TestStore = new RentalStore();
		assertFalse(TestStore.runStore());
		

	}
	
	@Test
	void testRunStorePositive1() {
		
		String simulatedUserInput = "LADW" + System.getProperty("line.separator") +
			       "2020" + System.getProperty("line.separator") +
			       "7" + System.getProperty("line.separator") +			       
			       "2" + System.getProperty("line.separator") +
			       "3" + System.getProperty("line.separator") +
			       "10" + System.getProperty("line.separator");
				    
			System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));
			
			RentalStore TestStore = new RentalStore();
			assertTrue(TestStore.runStore());
		
	}
	
	@Test
	void testRunStorePositive2() {
		
		String simulatedUserInput = "CHNS" + System.getProperty("line.separator") +
			       "2015" + System.getProperty("line.separator") +
			       "7" + System.getProperty("line.separator") +			       
			       "2" + System.getProperty("line.separator") +
			       "5" + System.getProperty("line.separator") +
			       "25" + System.getProperty("line.separator");
				    
			System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));
			
			RentalStore TestStore = new RentalStore();
			assertTrue(TestStore.runStore());
		
	}
	
	@Test
	void testRunStorePositive3() {
		
		String simulatedUserInput = "JAKD" + System.getProperty("line.separator") +
			       "2015" + System.getProperty("line.separator") +
			       "9" + System.getProperty("line.separator") +			       
			       "3" + System.getProperty("line.separator") +
			       "6" + System.getProperty("line.separator") +
			       "0" + System.getProperty("line.separator");
				    
			System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));
			
			RentalStore TestStore = new RentalStore();
			assertTrue(TestStore.runStore());
		
	}
	
	@Test
	void testRunStorePositive4() {
		
		String simulatedUserInput = "JAKR" + System.getProperty("line.separator") +
			       "2015" + System.getProperty("line.separator") +
			       "7" + System.getProperty("line.separator") +			       
			       "2" + System.getProperty("line.separator") +
			       "9" + System.getProperty("line.separator") +
			       "0" + System.getProperty("line.separator");
				    
			System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));
			
			RentalStore TestStore = new RentalStore();
			assertTrue(TestStore.runStore());
		
	}
	
	@Test
	void testRunStorePositive5() {
		
		String simulatedUserInput = "JAKR" + System.getProperty("line.separator") +
			       "2020" + System.getProperty("line.separator") +
			       "7" + System.getProperty("line.separator") +			       
			       "2" + System.getProperty("line.separator") +
			       "4" + System.getProperty("line.separator") +
			       "50" + System.getProperty("line.separator");
				    
			System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));
			
			RentalStore TestStore = new RentalStore();
			assertTrue(TestStore.runStore());
		
	}

}
