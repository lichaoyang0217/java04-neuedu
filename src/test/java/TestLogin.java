import com.neuedu.MyBatis.MyBatisProductImpl;
import com.neuedu.MyBatis.MyBatisloginImpl;
import com.neuedu.dao.ProductDao;
import com.neuedu.dao.UserDao;
import org.junit.Test;

public class TestLogin {


    public void testCheckUser() {

        UserDao userdao = new MyBatisloginImpl();
        userdao.checkUser("zhaosi", "123");

    }

    public void testFindProductByPage() {

        ProductDao productDao = new MyBatisProductImpl();
        productDao.findProductByPage(2, 3);

    }

    @Test
    public void testDeleteProduct() {
        ProductDao productDao = new MyBatisProductImpl();
        productDao.deleteProduct(35);
    }

}
