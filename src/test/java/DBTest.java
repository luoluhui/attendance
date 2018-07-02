import com.luolh.mapper.TestMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * created by luolh on 20180702
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:spring/spring-config.xml"})
public class DBTest {

    @Autowired
    TestMapper testMapper;
    @Test
    public void test(){
        System.out.println(testMapper);
        testMapper.insert(new com.luolh.entity.Test(1,"哈哈"));
    }
}
