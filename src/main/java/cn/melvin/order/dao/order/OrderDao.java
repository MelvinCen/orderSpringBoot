package cn.melvin.order.dao.order;

import cn.melvin.order.domain.order.Order;
import cn.melvin.order.domain.order.OrderItem;
import cn.melvin.order.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.List;

@Repository
public class OrderDao {

    MybatisUtils mybatisUtils = new MybatisUtils();
    SqlSession sqlSession = null;

    public int insertOneOrder(Order order){
        int count = 0;

        try {
            sqlSession = mybatisUtils.getSqlSession();
            IOrder iOrder = sqlSession.getMapper(IOrder.class);
            count = iOrder.insertOneOrder(order);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
        return count;
    }

    public void insertBatchOrderDetail(List<OrderItem> orderItems){
        try {
            sqlSession = mybatisUtils.getSqlSession();
            IOrder iOrder = sqlSession.getMapper(IOrder.class);
            iOrder.insertBatchOrderDetail(orderItems);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (sqlSession != null) {
                sqlSession.close();
            }

        }
    }

}
