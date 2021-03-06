package mbg.test.ib2j2.generated.hierarchical.dao;

import java.sql.SQLException;
import java.util.List;
import mbg.test.ib2j2.generated.hierarchical.model.AwfulTable;
import mbg.test.ib2j2.generated.hierarchical.model.AwfulTableExample;
import mbg.test.ib2j2.generated.hierarchical.model.AwfulTableKey;

public interface AwfulTableDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    int countByExample(AwfulTableExample example) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    int deleteByExample(AwfulTableExample example) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    int deleteByPrimaryKey(AwfulTableKey _key) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    Integer insert(AwfulTable record) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    Integer insertSelective(AwfulTable record) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    List selectByExample(AwfulTableExample example) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    AwfulTable selectByPrimaryKey(AwfulTableKey _key) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    int updateByExampleSelective(AwfulTable record, AwfulTableExample example) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    int updateByExample(AwfulTable record, AwfulTableExample example) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    int updateByPrimaryKeySelective(AwfulTable record) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    int updateByPrimaryKey(AwfulTable record) throws SQLException;
}