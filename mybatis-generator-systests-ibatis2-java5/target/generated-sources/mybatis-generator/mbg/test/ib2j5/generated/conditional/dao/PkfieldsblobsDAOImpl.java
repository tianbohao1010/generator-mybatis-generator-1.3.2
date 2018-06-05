package mbg.test.ib2j5.generated.conditional.dao;

import com.ibatis.sqlmap.client.SqlMapClient;
import java.sql.SQLException;
import java.util.List;
import mbg.test.ib2j5.generated.conditional.model.Pkfieldsblobs;
import mbg.test.ib2j5.generated.conditional.model.PkfieldsblobsExample;
import mbg.test.ib2j5.generated.conditional.model.PkfieldsblobsKey;

public class PkfieldsblobsDAOImpl implements PkfieldsblobsDAO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    private SqlMapClient sqlMapClient;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public PkfieldsblobsDAOImpl() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public void setSqlMapClient(SqlMapClient sqlMapClient) {
        this.sqlMapClient = sqlMapClient;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public SqlMapClient getSqlMapClient() {
        return sqlMapClient;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public int countByExample(PkfieldsblobsExample example) throws SQLException {
        Integer count = (Integer)  sqlMapClient.queryForObject("PKFIELDSBLOBS.countByExample", example);
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public int deleteByExample(PkfieldsblobsExample example) throws SQLException {
        int rows = sqlMapClient.delete("PKFIELDSBLOBS.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public int deleteByPrimaryKey(PkfieldsblobsKey _key) throws SQLException {
        int rows = sqlMapClient.delete("PKFIELDSBLOBS.deleteByPrimaryKey", _key);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public void insert(Pkfieldsblobs record) throws SQLException {
        sqlMapClient.insert("PKFIELDSBLOBS.insert", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public void insertSelective(Pkfieldsblobs record) throws SQLException {
        sqlMapClient.insert("PKFIELDSBLOBS.insertSelective", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    @SuppressWarnings("unchecked")
    public List<Pkfieldsblobs> selectByExampleWithBLOBs(PkfieldsblobsExample example) throws SQLException {
        List<Pkfieldsblobs> list = sqlMapClient.queryForList("PKFIELDSBLOBS.selectByExampleWithBLOBs", example);
        return list;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    @SuppressWarnings("unchecked")
    public List<Pkfieldsblobs> selectByExampleWithoutBLOBs(PkfieldsblobsExample example) throws SQLException {
        List<Pkfieldsblobs> list = sqlMapClient.queryForList("PKFIELDSBLOBS.selectByExample", example);
        return list;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public Pkfieldsblobs selectByPrimaryKey(PkfieldsblobsKey _key) throws SQLException {
        Pkfieldsblobs record = (Pkfieldsblobs) sqlMapClient.queryForObject("PKFIELDSBLOBS.selectByPrimaryKey", _key);
        return record;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public int updateByExampleSelective(Pkfieldsblobs record, PkfieldsblobsExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = sqlMapClient.update("PKFIELDSBLOBS.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public int updateByExampleWithBLOBs(Pkfieldsblobs record, PkfieldsblobsExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = sqlMapClient.update("PKFIELDSBLOBS.updateByExampleWithBLOBs", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public int updateByExampleWithoutBLOBs(Pkfieldsblobs record, PkfieldsblobsExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = sqlMapClient.update("PKFIELDSBLOBS.updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public int updateByPrimaryKeySelective(Pkfieldsblobs record) throws SQLException {
        int rows = sqlMapClient.update("PKFIELDSBLOBS.updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public int updateByPrimaryKeyWithBLOBs(Pkfieldsblobs record) throws SQLException {
        int rows = sqlMapClient.update("PKFIELDSBLOBS.updateByPrimaryKeyWithBLOBs", record);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public int updateByPrimaryKeyWithoutBLOBs(Pkfieldsblobs record) throws SQLException {
        int rows = sqlMapClient.update("PKFIELDSBLOBS.updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    protected static class UpdateByExampleParms extends PkfieldsblobsExample {
        private Object record;

        public UpdateByExampleParms(Object record, PkfieldsblobsExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}