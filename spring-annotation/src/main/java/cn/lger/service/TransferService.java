package cn.lger.service;

import cn.lger.dao.TransferDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Code that Changed the World
 * Pro said
 * Created by Pro on 2017-09-27.
 */
@Component
public class TransferService {

    @Autowired
    private TransferDao dao;

    /**
     * 转账业务，这里为了方便直接写了张三转给了李四100块钱
     */
    @Transactional
    public void transferMoney(){
        dao.transferMoneyToOne((float) -100, "张三");
//        int i = 1 / 0;
        dao.transferMoneyToOne((float) 100, "李四");
//        throw new RuntimeException("这里突然死机了");
    }

    public TransferDao getDao() {
        return dao;
    }

    public void setDao(TransferDao dao) {
        this.dao = dao;
    }
}
