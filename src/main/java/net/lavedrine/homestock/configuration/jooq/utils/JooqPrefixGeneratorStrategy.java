package net.lavedrine.homestock.configuration.jooq.utils;

import org.jooq.codegen.DefaultGeneratorStrategy;
import org.jooq.meta.Definition;

public class JooqPrefixGeneratorStrategy extends DefaultGeneratorStrategy {

    @Override
    public String getJavaClassName(final Definition definition, final Mode mode) {
        return "J" + super.getJavaClassName(definition, mode);
    }

}
