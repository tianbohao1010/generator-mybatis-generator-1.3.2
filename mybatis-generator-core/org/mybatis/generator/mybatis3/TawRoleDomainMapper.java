package org.mybatis.generator.mybatis3;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.mybatis.generator.mybatis3.TawRoleDomain;
import org.mybatis.generator.mybatis3.TawRoleDomainExample;
import org.mybatis.generator.mybatis3.TawRoleDomainKey;

public interface TawRoleDomainMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TAW_ROLE_DOMAIN
     *
     * @mbggenerated Thu Dec 21 16:47:03 CST 2017
     */
    int countByExample(TawRoleDomainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TAW_ROLE_DOMAIN
     *
     * @mbggenerated Thu Dec 21 16:47:03 CST 2017
     */
    int deleteByExample(TawRoleDomainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TAW_ROLE_DOMAIN
     *
     * @mbggenerated Thu Dec 21 16:47:03 CST 2017
     */
    int deleteByPrimaryKey(TawRoleDomainKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TAW_ROLE_DOMAIN
     *
     * @mbggenerated Thu Dec 21 16:47:03 CST 2017
     */
    int insert(TawRoleDomain record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TAW_ROLE_DOMAIN
     *
     * @mbggenerated Thu Dec 21 16:47:03 CST 2017
     */
    int insertSelective(TawRoleDomain record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TAW_ROLE_DOMAIN
     *
     * @mbggenerated Thu Dec 21 16:47:03 CST 2017
     */
    List<TawRoleDomain> selectByExample(TawRoleDomainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TAW_ROLE_DOMAIN
     *
     * @mbggenerated Thu Dec 21 16:47:03 CST 2017
     */
    TawRoleDomain selectByPrimaryKey(TawRoleDomainKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TAW_ROLE_DOMAIN
     *
     * @mbggenerated Thu Dec 21 16:47:03 CST 2017
     */
    int updateByExampleSelective(@Param("record") TawRoleDomain record, @Param("example") TawRoleDomainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TAW_ROLE_DOMAIN
     *
     * @mbggenerated Thu Dec 21 16:47:03 CST 2017
     */
    int updateByExample(@Param("record") TawRoleDomain record, @Param("example") TawRoleDomainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TAW_ROLE_DOMAIN
     *
     * @mbggenerated Thu Dec 21 16:47:03 CST 2017
     */
    int updateByPrimaryKeySelective(TawRoleDomain record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TAW_ROLE_DOMAIN
     *
     * @mbggenerated Thu Dec 21 16:47:03 CST 2017
     */
    int updateByPrimaryKey(TawRoleDomain record);
}