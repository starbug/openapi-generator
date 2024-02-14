package org.openapitools.codegen;

import org.testng.annotations.Test;

import java.util.List;

public class OpenAPIGeneratorTest {
    @Test
    public void test() {
        OpenAPIGenerator.main(List.of("generate", "-g", "typescript-fetch", "-c", "mopl.yaml").toArray(new String[]{}));
    }
}
