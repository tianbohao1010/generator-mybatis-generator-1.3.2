package mbg.test.ib2j5.generated.flat.dao;

import com.ibatis.sqlmap.client.SqlMapClient;
import java.sql.SQLException;
import java.util.List;
import mbg.test.ib2j5.generated.flat.model.Pkblobs;
import mbg.test.ib2j5.generated.flat.model.PkblobsExample;

public class PkblobsDAOImpl implements PkblobsDAO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PKBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    private SqlMapClient sqlMapClient;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public PkblobsDAOImpl(SqlMapClient sqlMapClient) {
        super();
        this.sqlMapClient = sqlMapClient;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public int countByExample(PkblobsExample example) throws SQLException {
        Integer count = (Integer)  sqlMapClient.queryForObject("PKBLOBS.countByExample", example);
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public int deleteByExample(PkblobsExample example) throws SQLException {
        int rows = sqlMapClient.delete("PKBLOBS.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public int deleteByPrimaryKey(Integer id) throws SQLException {
        Pkblobs _key = new Pkblobs();
        _key.setId(id);
        int rows = sqlMapClient.delete("PKBLOBS.deleteByPrimaryKey", _key);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public void insert(Pkblobs record) throws SQLException {
        sqlMapClient.insert("PKBLOBS.insert", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public void insertSelective(Pkblobs record) throws SQLException {
        sqlMapClient.insert("PKBLOBS.insertSelective", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    @SuppressWarnings("unchecked")
    public List<Pkblobs> selectByExampleWithBLOBs(PkblobsExample example) throws SQLException {
        List<Pkblobs> list = sqlMapClient.queryForList("PKBLOBS.selectByExampleWithBLOBs", example);
        return list;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    @SuppressWarnings("unchecked")
    public List<Pkblobs> selectByExampleWithoutBLOBs(PkblobsExample example) throws SQLException {
        List<Pkblobs> list = sqlMapClient.queryForList("PKBLOBS.selectByExample", example);
        return list;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public Pkblobs selectByPrimaryKey(Integer id) throws SQLException {
        Pkblobs _key = new Pkblobs();
        _key.setId(id);
        Pkblobs record = (Pkblobs) sqlMapClient.queryForObject("PKBLOBS.selectByPrimaryKey", _key);
        return record;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public int updateByExampleSelective(Pkblobs record, PkblobsExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = sqlMapClient.update("PKBLOBS.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public int updateByExampleWithBLOBs(Pkblobs record, PkblobsExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = sqlMapClient.update("PKBLOBS.updateByExampleWithBLOBs", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public int updateByExampleWithoutBLOBs(Pkblobs record, PkblobsExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = sqlMapClient.update("PKBLOBS.updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public int updateByPrimaryKeySelective(Pkblobs record) throws SQLException {
        int rows = sqlMapClient.update("PKBLOBS.updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public int updateByPrimaryKey(Pkblobs record) throws SQLException {
        int rows = sqlMapClient.update("PKBLOBS.updateByPrimaryKeyWithBLOBs", record);
        return rows;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PKBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    protected static class UpdateByExampleParms extends PkblobsExample {
        private Object record;

        public UpdateByExampleParms(Object record, PkblobsExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}