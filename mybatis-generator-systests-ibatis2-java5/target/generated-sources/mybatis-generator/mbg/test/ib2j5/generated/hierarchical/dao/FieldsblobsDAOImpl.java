package mbg.test.ib2j5.generated.hierarchical.dao;

import java.util.List;
import mbg.test.ib2j5.generated.hierarchical.model.Fieldsblobs;
import mbg.test.ib2j5.generated.hierarchical.model.FieldsblobsExample;
import mbg.test.ib2j5.generated.hierarchical.model.FieldsblobsWithBLOBs;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class FieldsblobsDAOImpl extends SqlMapClientDaoSupport implements FieldsblobsDAO {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public FieldsblobsDAOImpl() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public int countByExample(FieldsblobsExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("FIELDSBLOBS.countByExample", example);
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public int deleteByExample(FieldsblobsExample example) {
        int rows = getSqlMapClientTemplate().delete("FIELDSBLOBS.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public void insert(FieldsblobsWithBLOBs record) {
        getSqlMapClientTemplate().insert("FIELDSBLOBS.insert", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public void insertSelective(FieldsblobsWithBLOBs record) {
        getSqlMapClientTemplate().insert("FIELDSBLOBS.insertSelective", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    @SuppressWarnings("unchecked")
    public List<FieldsblobsWithBLOBs> selectByExampleWithBLOBs(FieldsblobsExample example) {
        List<FieldsblobsWithBLOBs> list = getSqlMapClientTemplate().queryForList("FIELDSBLOBS.selectByExampleWithBLOBs", example);
        return list;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    @SuppressWarnings("unchecked")
    public List<Fieldsblobs> selectByExampleWithoutBLOBs(FieldsblobsExample example) {
        List<Fieldsblobs> list = getSqlMapClientTemplate().queryForList("FIELDSBLOBS.selectByExample", example);
        return list;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public int updateByExampleSelective(FieldsblobsWithBLOBs record, FieldsblobsExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("FIELDSBLOBS.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public int updateByExample(FieldsblobsWithBLOBs record, FieldsblobsExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("FIELDSBLOBS.updateByExampleWithBLOBs", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    public int updateByExample(Fieldsblobs record, FieldsblobsExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("FIELDSBLOBS.updateByExample", parms);
        return rows;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table FIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:57 CST 2017
     */
    protected static class UpdateByExampleParms extends FieldsblobsExample {
        private Object record;

        public UpdateByExampleParms(Object record, FieldsblobsExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}