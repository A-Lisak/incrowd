package com.incrowd.incrowd;

import com.incrowd.incrowd.model.FSAAuthority;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IncrowdApplicationTests {
    private JAXBContext jaxbContext;

    @Before
    public void init() throws JAXBException {
        this.jaxbContext = new JAXBContext.newInstance(FSAAuthority.class);
    }

    @Test
    public void contextLoads() {


    }

}
