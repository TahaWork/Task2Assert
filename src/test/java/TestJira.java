
import JiraSteps.jiraAuth;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class TestJira {
    @Test
    public void jiraTest() throws IOException {
        jiraAuth.auth();
    }
}
