package com.spring.student_management.models;

import com.spring.student_management.models.parents.PrimaryModel;
import org.junit.jupiter.api.Test;

/**
 * Created at 11/15/2022 by Darius
 **/
public abstract class AbstractModelTest<T extends PrimaryModel> {

    protected static final String TEST = "TEST";
    protected static final String TEST_CONSTRUCTOR = "Test Constructor";
    protected T model;

    @Test
    protected abstract void testNoArgConstructor();

    @Test
    protected abstract void testAllArgConstructor();
}
