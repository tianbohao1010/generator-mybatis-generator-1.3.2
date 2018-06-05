package mbg.test.ib2j5.generated.flat.dao;

import com.ibatis.sqlmap.client.SqlMapClient;
import java.sql.SQLException;
import java.util.List;
import mbg.test.ib2j5.generated.flat.model.Fieldsonly;
import mbg.test.ib2j5.generated.flat.model.FieldsonlyExample;

public class FieldsonlyDAOImpl implements FieldsonlyDAO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FIELDSONLY
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    private SqlMapClient sqlMapClient;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public FieldsonlyDAOImpl(SqlMapClient sqlMapClient) {
        super();
        this.sqlMapClient = sqlMapClient;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public int countByExample(FieldsonlyExample example) throws SQLException {
        Integer count = (Integer)  sqlMapClient.queryForObject("FIELDSONLY.countByExample", example);
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public int deleteByExample(FieldsonlyExample example) throws SQLException {
        int rows = sqlMapClient.delete("FIELDSONLY.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public void insert(Fieldsonly record) throws SQLException {
        sqlMapClient.insert("FIELDSONLY.insert", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public void insertSelective(Fieldsonly record) throws SQLException {
        sqlMapClient.insert("FIELDSONLY.insertSelective", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    @SuppressWarnings("unchecked")
    public List<Fieldsonly> selectByExample(FieldsonlyExample example) throws SQLException {
        List<Fieldsonly> list = sqlMapClient.queryForList("FIELDSONLY.selectByExample", example);
        return list;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public int updateByExampleSelective(Fieldsonly record, FieldsonlyExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = sqlMapClient.update("FIELDSONLY.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public int updateByExample(Fieldsonly record, FieldsonlyExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = sqlMapClient.update("FIELDSONLY.updateByExample", parms);
        return rows;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table FIELDSONLY
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    protected static class UpdateByExampleParms extends FieldsonlyExample {
        private Object record;

        public UpdateByExampleParms(Object record, FieldsonlyExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}