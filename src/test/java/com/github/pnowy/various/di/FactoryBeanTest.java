package com.github.pnowy.various.di;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import com.github.pnowy.various.di.bean.SampleBean;
import com.github.pnowy.various.di.factory.SampleBeanFactory;

//@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class)
//@ContextConfiguration(locations = 'classpath*:/spring/context-tests-config.xml')
public class FactoryBeanTest {

    @Configuration
    static class ContextConfiguration {
        @Bean
        SampleBeanFactory sampleBeanFactory() {
            return new SampleBeanFactory();
        }
    }

    @Autowired
    private SampleBean sampleBean1;
    @Autowired
    private SampleBean sampleBean2;

    @Test
    public void testFactoryBeanCreation() throws Exception {
        System.out.println(sampleBean1);
        System.out.println(sampleBean2);
    }
}
