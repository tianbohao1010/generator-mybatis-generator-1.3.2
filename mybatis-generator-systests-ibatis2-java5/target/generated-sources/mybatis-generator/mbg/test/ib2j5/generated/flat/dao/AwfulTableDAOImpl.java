package mbg.test.ib2j5.generated.flat.dao;

import com.ibatis.sqlmap.client.SqlMapClient;
import java.sql.SQLException;
import java.util.List;
import mbg.test.ib2j5.generated.flat.model.AwfulTable;
import mbg.test.ib2j5.generated.flat.model.AwfulTableExample;

public class AwfulTableDAOImpl implements AwfulTableDAO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    private SqlMapClient sqlMapClient;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public AwfulTableDAOImpl(SqlMapClient sqlMapClient) {
        super();
        this.sqlMapClient = sqlMapClient;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public int countByExample(AwfulTableExample example) throws SQLException {
        Integer count = (Integer)  sqlMapClient.queryForObject("awful table.countByExample", example);
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public int deleteByExample(AwfulTableExample example) throws SQLException {
        int rows = sqlMapClient.delete("awful table.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public int deleteByPrimaryKey(Integer customerId) throws SQLException {
        AwfulTable _key = new AwfulTable();
        _key.setCustomerId(customerId);
        int rows = sqlMapClient.delete("awful table.deleteByPrimaryKey", _key);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public Integer insert(AwfulTable record) throws SQLException {
        Object newKey = sqlMapClient.insert("awful table.insert", record);
        return (Integer) newKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public Integer insertSelective(AwfulTable record) throws SQLException {
        Object newKey = sqlMapClient.insert("awful table.insertSelective", record);
        return (Integer) newKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    @SuppressWarnings("unchecked")
    public List<AwfulTable> selectByExample(AwfulTableExample example) throws SQLException {
        List<AwfulTable> list = sqlMapClient.queryForList("awful table.selectByExample", example);
        return list;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public AwfulTable selectByPrimaryKey(Integer customerId) throws SQLException {
        AwfulTable _key = new AwfulTable();
        _key.setCustomerId(customerId);
        AwfulTable record = (AwfulTable) sqlMapClient.queryForObject("awful table.selectByPrimaryKey", _key);
        return record;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public int updateByExampleSelective(AwfulTable record, AwfulTableExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = sqlMapClient.update("awful table.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public int updateByExample(AwfulTable record, AwfulTableExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = sqlMapClient.update("awful table.updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public int updateByPrimaryKeySelective(AwfulTable record) throws SQLException {
        int rows = sqlMapClient.update("awful table.updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public int updateByPrimaryKey(AwfulTable record) throws SQLException {
        int rows = sqlMapClient.update("awful table.updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    protected static class UpdateByExampleParms extends AwfulTableExample {
        private Object record;

        public UpdateByExampleParms(Object record, AwfulTableExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}