package mbg.test.ib2j2.generated.conditional.dao;

import java.util.List;
import mbg.test.ib2j2.generated.conditional.model.PkonlyExample;
import mbg.test.ib2j2.generated.conditional.model.PkonlyKey;

public interface PkonlyDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    int countByExample(PkonlyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    int deleteByExample(PkonlyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    int deleteByPrimaryKey(PkonlyKey _key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    void insert(PkonlyKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    void insertSelective(PkonlyKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    List selectByExample(PkonlyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    int updateByExampleSelective(PkonlyKey record, PkonlyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    int updateByExample(PkonlyKey record, PkonlyExample example);
}