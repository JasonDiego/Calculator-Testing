package testclasses;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestAdditions.class, TestDivisions.class, TestInput.class, TestMultiplications.class,
		TestRemainder.class, TestSubtractions.class })

public class AllTests {

}
