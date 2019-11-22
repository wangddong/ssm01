import com.huidian.dao.UserMapper;
import com.huidian.domain.User;
import com.huidian.service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestCase {

    @Test
    public void testSpring() {
        ApplicationContext ac = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        UserService us = (UserService) ac.getBean("userService");
        us.getAll();
    }

    @Test
    public void testSpring1() {
        // 加载配置文件
        InputStream inputStream = null; // 创建工厂
        try {
            inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream); // 创建sqlSession对象
        SqlSession session = factory.openSession();

        UserMapper userDao=session.getMapper(UserMapper.class);
        List<User> list=userDao.queryAllUser();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
