package JUnitTestExamplePackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings2 {

	@Test
	void test() {
		jUnitFunction junitstring = new jUnitFunction();
		String result = junitstring.addStrgins("capstone","project");
		assertEquals("capstonproject",result);
		
	}

}
