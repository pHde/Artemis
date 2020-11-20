package ${packageName};

import java.net.URISyntaxException;

import org.junit.jupiter.api.DynamicContainer;
import org.junit.jupiter.api.TestFactory;

import de.tum.in.test.api.BlacklistPath;
import de.tum.in.test.api.AddTrustedPackage;
import de.tum.in.test.api.PathType;
import de.tum.in.test.api.StrictTimeout;
import de.tum.in.test.api.WhitelistPath;
import de.tum.in.test.api.jupiter.Public;
import de.tum.in.test.api.structural.ClassTestProvider;

/**
 * @author Stephan Krusche (krusche@in.tum.de)
 * @version 5.0 (11.11.2020)
 * <br><br>
 * This test evaluates the hierarchy of the class, i.e. if the class is abstract or an interface or an enum and also if the class extends another superclass and if
 * it implements the interfaces and annotations, based on its definition in the structure oracle (test.json).
 */
@WhitelistPath("target")
@BlacklistPath(value = "**Test*.{java,class}", type = PathType.GLOB)
@Public
// This disables security but allows all Kotlin libraries to work (AJTS Security Error)
@AddTrustedPackage("**")
public class ClassTest extends ClassTestProvider {

    /**
     * This method collects the classes in the structure oracle file for which at least one class property is specified.
     * These classes are then transformed into JUnit 5 dynamic tests.
     * @return A dynamic test container containing the test for each class which is then executed by JUnit.
     */
    @StrictTimeout(10)
    @TestFactory
    public DynamicContainer generateTestsForAllClasses() throws URISyntaxException {
        structureOracleJSON = retrieveStructureOracleJSON(this.getClass().getResource("test.json"));
        return super.generateTestsForAllClasses();
    }
}
