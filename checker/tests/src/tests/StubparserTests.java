package tests;

import java.io.File;
import java.util.List;
import org.checkerframework.framework.test.CheckerFrameworkPerDirectoryTest;
import org.junit.runners.Parameterized;

public class StubparserTests extends CheckerFrameworkPerDirectoryTest {

    public StubparserTests(List<File> testFiles) {
        super(
                testFiles,
                org.checkerframework.checker.nullness.NullnessChecker.class,
                "nullness",
                "-Anomsgtext",
                "-AprintErrorStack",
                "-AstubWarnIfNotFound");
    }

    @Parameterized.Parameters
    public static String[] getTestDirs() {
        return new String[] {"stubparser-tests"};
    }
}
