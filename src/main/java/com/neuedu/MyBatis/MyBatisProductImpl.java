package com.neuedu.MyBatis;

import com.neuedu.dao.ProductDao;
import com.neuedu.entity.PageModel;
import com.neuedu.entity.Product;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyBatisProductImpl implements ProductDao {
    @Override
    public boolean addProduct(Product product) {
        return false;
    }

    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public boolean deleteProduct(int id) {
        String resource = "MyBatis-config.xml";
        Reader reader = null;
        SqlSession session;
        try {
            reader = Resources.getResourceAsReader(resource);
        } catch (IOException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }

        SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder()
                .build(reader);
        session = sqlMapper.openSession(true);

        Integer result = session.delete("com.neuedu.entity.Product.deleteProduct", id);


        System.out.println(result);

        return false;
    }

    @Override
    public boolean updateProduct(Product product) {


        return false;
    }

    @Override
    public List<Product> findDetailById(int id) {
        return null;
    }

    @Override
    public Product findproductById(int id) {
        return null;
    }

    @Override
    public PageModel<Product> findProductByPage(int pageNo, int pageSize) {

        String resource = "MyBatis-config.xml";
        Reader reader = null;
        SqlSession session;
        try {
            reader = Resources.getResourceAsReader(resource);
        } catch (IOException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }

        SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder()
                .build(reader);
        session = sqlMapper.openSession();

        Integer totalcount = session.selectOne("com.neuedu.entity.Product.findProductPageCount");

        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("offset", (pageNo - 1) * pageSize);
        map.put("pageSize", pageSize);
        List<Product> p = session.selectList("com.neuedu.entity.Product.findProductPageContent", map);

        PageModel<Product> pageModel = new PageModel<Product>();
        pageModel.setTotalPage(totalcount % pageSize == 0 ? totalcount / pageSize : totalcount / pageSize + 1);
        pageModel.setDate(p);


        System.out.println(pageModel);
        session.close();
        return pageModel;


    }
}
