import com.luolh.user.entity.TbUser;
import com.luolh.user.mapper.TbUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * created by luolh on
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-config.xml"})
public class TbUserTest {

    @Autowired
    TbUserMapper tbUserMapper;
    @Test
    public void test(){
        System.out.println(tbUserMapper);
        TbUser tbUser = tbUserMapper.findByUsername("1");
        System.out.println(tbUser);
    }
}
