package org.simpleframework.util;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import java.util.Set;

public class ClassUtilTest {
    @DisplayName("extarctPackageTest")
    @Test
    public void extractPackageClassTest() {
        Set<Class<?>> classSet = ClassUtil.extractPackageClass("com.xiaohuang.entity");
        System.out.println(classSet);
        Assertions.assertEquals(4, classSet.size());
    }

}
