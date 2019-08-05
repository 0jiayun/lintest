package dao;

import pojo.Tbook3;

public interface Tbook3Dao {
    int deleteByPrimaryKey(Integer id);

    int insert(Tbook3 record);

    int insertSelective(Tbook3 record);

    Tbook3 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tbook3 record);

    int updateByPrimaryKey(Tbook3 record);
}