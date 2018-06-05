package mbg.test.ib2j5.generated.miscellaneous.dao;

import java.sql.SQLException;
import java.util.List;
import mbg.test.common.BaseInterface;
import mbg.test.ib2j5.generated.miscellaneous.model.MyObject;
import mbg.test.ib2j5.generated.miscellaneous.model.MyObjectCriteria;
import mbg.test.ib2j5.generated.miscellaneous.model.MyObjectKey;

public interface MyObjectDAO extends BaseInterface {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbggenerated
     */
    int countMyObjectByExample(MyObjectCriteria example) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbggenerated
     */
    int deleteMyObjectByExample(MyObjectCriteria example) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbggenerated
     */
    int deleteMyObjectByPrimaryKey(MyObjectKey _key) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbggenerated
     */
    void insertMyObject(MyObject record) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbggenerated
     */
    void insertMyObjectSelective(MyObject record) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbggenerated
     */
    List<MyObject> selectMyObjectByExample(MyObjectCriteria example) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbggenerated
     */
    MyObject selectMyObjectByPrimaryKey(MyObjectKey _key) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbggenerated
     */
    int updateMyObjectByExampleSelective(MyObject record, MyObjectCriteria example) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbggenerated
     */
    int updateMyObjectByExample(MyObject record, MyObjectCriteria example) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbggenerated
     */
    int updateMyObjectByPrimaryKeySelective(MyObject record) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbggenerated
     */
    int updateMyObjectByPrimaryKey(MyObject record) throws SQLException;
}