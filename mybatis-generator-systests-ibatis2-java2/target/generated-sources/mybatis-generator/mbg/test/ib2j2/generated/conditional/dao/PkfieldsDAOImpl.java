package mbg.test.ib2j2.generated.conditional.dao;

import java.util.List;
import mbg.test.ib2j2.generated.conditional.model.Pkfields;
import mbg.test.ib2j2.generated.conditional.model.PkfieldsExample;
import mbg.test.ib2j2.generated.conditional.model.PkfieldsKey;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class PkfieldsDAOImpl extends SqlMapClientDaoSupport implements PkfieldsDAO {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    public PkfieldsDAOImpl() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    public int countByExample(PkfieldsExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("PKFIELDS.countByExample", example);
        return count.intValue();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    public int deleteByExample(PkfieldsExample example) {
        int rows = getSqlMapClientTemplate().delete("PKFIELDS.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    public int deleteByPrimaryKey(PkfieldsKey _key) {
        int rows = getSqlMapClientTemplate().delete("PKFIELDS.deleteByPrimaryKey", _key);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    public void insert(Pkfields record) {
        getSqlMapClientTemplate().insert("PKFIELDS.insert", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    public void insertSelective(Pkfields record) {
        getSqlMapClientTemplate().insert("PKFIELDS.insertSelective", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    public List selectByExample(PkfieldsExample example) {
        List list = getSqlMapClientTemplate().queryForList("PKFIELDS.selectByExample", example);
        return list;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    public Pkfields selectByPrimaryKey(PkfieldsKey _key) {
        Pkfields record = (Pkfields) getSqlMapClientTemplate().queryForObject("PKFIELDS.selectByPrimaryKey", _key);
        return record;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    public int updateByExampleSelective(Pkfields record, PkfieldsExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("PKFIELDS.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    public int updateByExample(Pkfields record, PkfieldsExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("PKFIELDS.updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    public int updateByPrimaryKeySelective(Pkfields record) {
        int rows = getSqlMapClientTemplate().update("PKFIELDS.updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    public int updateByPrimaryKey(Pkfields record) {
        int rows = getSqlMapClientTemplate().update("PKFIELDS.updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PKFIELDS
     *
     * @mbggenerated Thu Dec 21 14:43:53 CST 2017
     */
    protected static class UpdateByExampleParms extends PkfieldsExample {
        private Object record;

        public UpdateByExampleParms(Object record, PkfieldsExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}