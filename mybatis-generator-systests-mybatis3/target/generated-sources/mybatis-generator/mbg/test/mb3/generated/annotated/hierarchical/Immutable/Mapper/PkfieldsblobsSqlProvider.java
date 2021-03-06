package mbg.test.mb3.generated.annotated.hierarchical.Immutable.Mapper;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.DELETE_FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.ORDER_BY;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT_DISTINCT;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import java.util.List;
import java.util.Map;
import mbg.test.mb3.generated.annotated.hierarchical.Immutable.Model.PkfieldsblobsExample.Criteria;
import mbg.test.mb3.generated.annotated.hierarchical.Immutable.Model.PkfieldsblobsExample.Criterion;
import mbg.test.mb3.generated.annotated.hierarchical.Immutable.Model.PkfieldsblobsExample;
import mbg.test.mb3.generated.annotated.hierarchical.Immutable.Model.PkfieldsblobsWithBLOBs;

public class PkfieldsblobsSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    public String countByExample(PkfieldsblobsExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("PKFIELDSBLOBS A");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    public String deleteByExample(PkfieldsblobsExample example) {
        BEGIN();
        DELETE_FROM("PKFIELDSBLOBS A");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    public String insertSelective(PkfieldsblobsWithBLOBs record) {
        BEGIN();
        INSERT_INTO("PKFIELDSBLOBS");
        
        if (record.getId1() != null) {
            VALUES("ID1", "#{id1,jdbcType=INTEGER}");
        }
        
        if (record.getId2() != null) {
            VALUES("ID2", "#{id2,jdbcType=INTEGER}");
        }
        
        if (record.getFirstname() != null) {
            VALUES("FIRSTNAME", "#{firstname,jdbcType=VARCHAR}");
        }
        
        if (record.getLastname() != null) {
            VALUES("LASTNAME", "#{lastname,jdbcType=VARCHAR}");
        }
        
        if (record.getBlob1() != null) {
            VALUES("BLOB1", "#{blob1,jdbcType=VARBINARY}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    public String selectByExampleWithBLOBs(PkfieldsblobsExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("A.ID1 as A_ID1");
        } else {
            SELECT("A.ID1 as A_ID1");
        }
        SELECT("A.ID2 as A_ID2");
        SELECT("A.FIRSTNAME as A_FIRSTNAME");
        SELECT("A.LASTNAME as A_LASTNAME");
        SELECT("A.BLOB1 as A_BLOB1");
        FROM("PKFIELDSBLOBS A");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    public String selectByExample(PkfieldsblobsExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("A.ID1 as A_ID1");
        } else {
            SELECT("A.ID1 as A_ID1");
        }
        SELECT("A.ID2 as A_ID2");
        SELECT("A.FIRSTNAME as A_FIRSTNAME");
        SELECT("A.LASTNAME as A_LASTNAME");
        FROM("PKFIELDSBLOBS A");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        PkfieldsblobsWithBLOBs record = (PkfieldsblobsWithBLOBs) parameter.get("record");
        PkfieldsblobsExample example = (PkfieldsblobsExample) parameter.get("example");
        
        BEGIN();
        UPDATE("PKFIELDSBLOBS A");
        
        if (record.getId1() != null) {
            SET("A.ID1 = #{record.id1,jdbcType=INTEGER}");
        }
        
        if (record.getId2() != null) {
            SET("A.ID2 = #{record.id2,jdbcType=INTEGER}");
        }
        
        if (record.getFirstname() != null) {
            SET("A.FIRSTNAME = #{record.firstname,jdbcType=VARCHAR}");
        }
        
        if (record.getLastname() != null) {
            SET("A.LASTNAME = #{record.lastname,jdbcType=VARCHAR}");
        }
        
        if (record.getBlob1() != null) {
            SET("A.BLOB1 = #{record.blob1,jdbcType=VARBINARY}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("PKFIELDSBLOBS A");
        
        SET("A.ID1 = #{record.id1,jdbcType=INTEGER}");
        SET("A.ID2 = #{record.id2,jdbcType=INTEGER}");
        SET("A.FIRSTNAME = #{record.firstname,jdbcType=VARCHAR}");
        SET("A.LASTNAME = #{record.lastname,jdbcType=VARCHAR}");
        SET("A.BLOB1 = #{record.blob1,jdbcType=VARBINARY}");
        
        PkfieldsblobsExample example = (PkfieldsblobsExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("PKFIELDSBLOBS A");
        
        SET("A.ID1 = #{record.id1,jdbcType=INTEGER}");
        SET("A.ID2 = #{record.id2,jdbcType=INTEGER}");
        SET("A.FIRSTNAME = #{record.firstname,jdbcType=VARCHAR}");
        SET("A.LASTNAME = #{record.lastname,jdbcType=VARCHAR}");
        
        PkfieldsblobsExample example = (PkfieldsblobsExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    public String updateByPrimaryKeySelective(PkfieldsblobsWithBLOBs record) {
        BEGIN();
        UPDATE("PKFIELDSBLOBS");
        
        if (record.getFirstname() != null) {
            SET("FIRSTNAME = #{firstname,jdbcType=VARCHAR}");
        }
        
        if (record.getLastname() != null) {
            SET("LASTNAME = #{lastname,jdbcType=VARCHAR}");
        }
        
        if (record.getBlob1() != null) {
            SET("BLOB1 = #{blob1,jdbcType=VARBINARY}");
        }
        
        WHERE("ID1 = #{id1,jdbcType=INTEGER}");
        WHERE("ID2 = #{id2,jdbcType=INTEGER}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    protected void applyWhere(PkfieldsblobsExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            WHERE(sb.toString());
        }
    }
}