package mbg.test.ib2j2.generated.conditional.dao;

import java.util.List;
import mbg.test.ib2j2.generated.conditional.model.Fieldsonly;
import mbg.test.ib2j2.generated.conditional.model.FieldsonlyExample;

public interface FieldsonlyDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    int countByExample(FieldsonlyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    int deleteByExample(FieldsonlyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    void insert(Fieldsonly record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    void insertSelective(Fieldsonly record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    List selectByExample(FieldsonlyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    int updateByExampleSelective(Fieldsonly record, FieldsonlyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    int updateByExample(Fieldsonly record, FieldsonlyExample example);
}