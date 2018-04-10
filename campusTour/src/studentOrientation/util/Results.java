package studentOrientation.util;

import studentOrientation.activityInterfaces.StdoutDisplayInterface;
import studentOrientation.driver.Driver;

public class Results implements StdoutDisplayInterface {
    @Override
    public void writeToStdout(StringBuilder builder) {
        System.out.println(Driver.builder.toString());
    }
}
