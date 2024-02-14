package org.openapitools.codegen.templating.mustache;

import com.samskivert.mustache.Mustache;
import com.samskivert.mustache.Template;

import java.io.IOException;
import java.io.Writer;

import static org.openapitools.codegen.utils.StringUtils.dashize;

public class KebabCaseLambda implements Mustache.Lambda {
    @Override
    public void execute(Template.Fragment fragment, Writer writer) throws IOException {
        writer.write(dashize(fragment.execute()));
    }
}
