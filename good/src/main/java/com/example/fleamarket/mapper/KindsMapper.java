package com.example.fleamarket.mapper;

import com.example.fleamarket.pojo.Kinds;
import com.example.fleamarket.pojo.KindsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface KindsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kinds
     *
     * @mbg.generated Tue Sep 21 16:07:32 CST 2021
     */
    long countByExample(KindsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kinds
     *
     * @mbg.generated Tue Sep 21 16:07:32 CST 2021
     */
    int deleteByExample(KindsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kinds
     *
     * @mbg.generated Tue Sep 21 16:07:32 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kinds
     *
     * @mbg.generated Tue Sep 21 16:07:32 CST 2021
     */
    int insert(Kinds record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kinds
     *
     * @mbg.generated Tue Sep 21 16:07:32 CST 2021
     */
    int insertSelective(Kinds record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kinds
     *
     * @mbg.generated Tue Sep 21 16:07:32 CST 2021
     */
    List<Kinds> selectByExample(KindsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kinds
     *
     * @mbg.generated Tue Sep 21 16:07:32 CST 2021
     */
    Kinds selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kinds
     *
     * @mbg.generated Tue Sep 21 16:07:32 CST 2021
     */
    int updateByExampleSelective(@Param("record") Kinds record, @Param("example") KindsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kinds
     *
     * @mbg.generated Tue Sep 21 16:07:32 CST 2021
     */
    int updateByExample(@Param("record") Kinds record, @Param("example") KindsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kinds
     *
     * @mbg.generated Tue Sep 21 16:07:32 CST 2021
     */
    int updateByPrimaryKeySelective(Kinds record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kinds
     *
     * @mbg.generated Tue Sep 21 16:07:32 CST 2021
     */
    int updateByPrimaryKey(Kinds record);
}