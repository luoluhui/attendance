import com.luolh.attend.entity.Attend;
import com.luolh.attend.mapper.AttendMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * created by luolh on 20180706
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-config.xml"})
public class AttendTest {

    @Autowired
    AttendMapper attendMapper;

    @Test
    public void test(){
        System.out.println(attendMapper);
        List<Attend> list =  attendMapper.findAll();
        for(Attend attend: list){
            System.out.println(attend);
        }
    }
}
