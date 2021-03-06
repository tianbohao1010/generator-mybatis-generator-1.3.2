package mbg.test.ib2j5.generated.hierarchical.dao;

import java.util.List;
import mbg.test.ib2j5.generated.hierarchical.model.AwfulTable;
import mbg.test.ib2j5.generated.hierarchical.model.AwfulTableExample;
import mbg.test.ib2j5.generated.hierarchical.model.AwfulTableKey;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class AwfulTableDAOImpl extends SqlMapClientDaoSupport implements AwfulTableDAO {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public AwfulTableDAOImpl() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public int countByExample(AwfulTableExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("awful table.countByExample", example);
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public int deleteByExample(AwfulTableExample example) {
        int rows = getSqlMapClientTemplate().delete("awful table.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public int deleteByPrimaryKey(AwfulTableKey _key) {
        int rows = getSqlMapClientTemplate().delete("awful table.deleteByPrimaryKey", _key);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public Integer insert(AwfulTable record) {
        Object newKey = getSqlMapClientTemplate().insert("awful table.insert", record);
        return (Integer) newKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public Integer insertSelective(AwfulTable record) {
        Object newKey = getSqlMapClientTemplate().insert("awful table.insertSelective", record);
        return (Integer) newKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    @SuppressWarnings("unchecked")
    public List<AwfulTable> selectByExample(AwfulTableExample example) {
        List<AwfulTable> list = getSqlMapClientTemplate().queryForList("awful table.selectByExample", example);
        return list;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public AwfulTable selectByPrimaryKey(AwfulTableKey _key) {
        AwfulTable record = (AwfulTable) getSqlMapClientTemplate().queryForObject("awful table.selectByPrimaryKey", _key);
        return record;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public int updateByExampleSelective(AwfulTable record, AwfulTableExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("awful table.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public int updateByExample(AwfulTable record, AwfulTableExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("awful table.updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public int updateByPrimaryKeySelective(AwfulTable record) {
        int rows = getSqlMapClientTemplate().update("awful table.updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public int updateByPrimaryKey(AwfulTable record) {
        int rows = getSqlMapClientTemplate().update("awful table.updateByPrimaryKey", record);
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