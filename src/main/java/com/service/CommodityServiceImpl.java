package com.service;

import com.bean.Commodity;
import com.dao.CommodityDao;

import java.util.List;

/**
 * @author 23130
 * @version 1.0
 * @date 2022/11/11 10:48
 **/
public class CommodityServiceImpl implements CommodityService{
    CommodityDao dao=new CommodityDaoImpl();
    @Override
    public List<Commodity> getCommodityList(){

        return dao.getCommodityList();
    }

    @Override
    public Commodity getOne(int id) {
        return dao.getOne(id);
    }

}