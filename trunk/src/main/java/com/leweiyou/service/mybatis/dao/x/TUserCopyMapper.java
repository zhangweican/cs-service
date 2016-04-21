package com.leweiyou.service.mybatis.dao.x;

import com.leweiyou.service.mybatis.entry.x.TUserCopy;
import com.leweiyou.service.mybatis.entry.x.TUserCopyExample;
import com.leweiyou.service.mybatis.entry.x.TUserCopyKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserCopyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_copy
     *
     * @mbggenerated
     */
    int countByExample(TUserCopyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_copy
     *
     * @mbggenerated
     */
    int deleteByExample(TUserCopyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_copy
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(TUserCopyKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_copy
     *
     * @mbggenerated
     */
    int insert(TUserCopy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_copy
     *
     * @mbggenerated
     */
    int insertSelective(TUserCopy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_copy
     *
     * @mbggenerated
     */
    List<TUserCopy> selectByExampleWithBLOBs(TUserCopyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_copy
     *
     * @mbggenerated
     */
    List<TUserCopy> selectByExample(TUserCopyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_copy
     *
     * @mbggenerated
     */
    TUserCopy selectByPrimaryKey(TUserCopyKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_copy
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TUserCopy record, @Param("example") TUserCopyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_copy
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") TUserCopy record, @Param("example") TUserCopyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_copy
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TUserCopy record, @Param("example") TUserCopyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_copy
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TUserCopy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_copy
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(TUserCopy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_copy
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TUserCopy record);
}