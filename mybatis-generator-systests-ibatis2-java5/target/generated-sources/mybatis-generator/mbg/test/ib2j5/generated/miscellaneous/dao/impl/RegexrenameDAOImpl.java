package mbg.test.ib2j5.generated.miscellaneous.dao.impl;

import com.ibatis.sqlmap.client.SqlMapClient;
import java.sql.SQLException;
import java.util.List;
import mbg.test.ib2j5.generated.miscellaneous.dao.RegexrenameDAO;
import mbg.test.ib2j5.generated.miscellaneous.model.Regexrename;
import mbg.test.ib2j5.generated.miscellaneous.model.RegexrenameCriteria;

public class RegexrenameDAOImpl implements RegexrenameDAO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table REGEXRENAME
     *
     * @mbggenerated
     */
    private SqlMapClient sqlMapClient;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbggenerated
     */
    public RegexrenameDAOImpl(SqlMapClient sqlMapClient) {
        super();
        this.sqlMapClient = sqlMapClient;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbggenerated
     */
    public int countRegexrenameByExample(RegexrenameCriteria example) throws SQLException {
        Integer count = (Integer)  sqlMapClient.queryForObject("REGEXRENAME.countByExample", example);
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbggenerated
     */
    public int deleteRegexrenameByExample(RegexrenameCriteria example) throws SQLException {
        int rows = sqlMapClient.delete("REGEXRENAME.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbggenerated
     */
    public int deleteRegexrenameByPrimaryKey(Integer id) throws SQLException {
        Regexrename _key = new Regexrename();
        _key.setId(id);
        int rows = sqlMapClient.delete("REGEXRENAME.deleteByPrimaryKey", _key);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbggenerated
     */
    public Integer insertRegexrename(Regexrename record) throws SQLException {
        Object newKey = sqlMapClient.insert("REGEXRENAME.insert", record);
        return (Integer) newKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbggenerated
     */
    public Integer insertRegexrenameSelective(Regexrename record) throws SQLException {
        Object newKey = sqlMapClient.insert("REGEXRENAME.insertSelective", record);
        return (Integer) newKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbggenerated
     */
    @SuppressWarnings("unchecked")
    public List<Regexrename> selectRegexrenameByExample(RegexrenameCriteria example) throws SQLException {
        List<Regexrename> list = sqlMapClient.queryForList("REGEXRENAME.selectByExample", example);
        return list;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbggenerated
     */
    public Regexrename selectRegexrenameByPrimaryKey(Integer id) throws SQLException {
        Regexrename _key = new Regexrename();
        _key.setId(id);
        Regexrename record = (Regexrename) sqlMapClient.queryForObject("REGEXRENAME.selectByPrimaryKey", _key);
        return record;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbggenerated
     */
    public int updateRegexrenameByExampleSelective(Regexrename record, RegexrenameCriteria example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = sqlMapClient.update("REGEXRENAME.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbggenerated
     */
    public int updateRegexrenameByExample(Regexrename record, RegexrenameCriteria example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = sqlMapClient.update("REGEXRENAME.updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbggenerated
     */
    public int updateRegexrenameByPrimaryKeySelective(Regexrename record) throws SQLException {
        int rows = sqlMapClient.update("REGEXRENAME.updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbggenerated
     */
    public int updateRegexrenameByPrimaryKey(Regexrename record) throws SQLException {
        int rows = sqlMapClient.update("REGEXRENAME.updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table REGEXRENAME
     *
     * @mbggenerated
     */
    protected static class UpdateByExampleParms extends RegexrenameCriteria {
        private Object record;

        public UpdateByExampleParms(Object record, RegexrenameCriteria example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}