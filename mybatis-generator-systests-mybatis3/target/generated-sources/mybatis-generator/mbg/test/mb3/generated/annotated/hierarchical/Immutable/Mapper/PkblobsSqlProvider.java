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
import mbg.test.mb3.generated.annotated.hierarchical.Immutable.Model.PkblobsExample.Criteria;
import mbg.test.mb3.generated.annotated.hierarchical.Immutable.Model.PkblobsExample.Criterion;
import mbg.test.mb3.generated.annotated.hierarchical.Immutable.Model.PkblobsExample;
import mbg.test.mb3.generated.annotated.hierarchical.Immutable.Model.PkblobsWithBLOBs;

public class PkblobsSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    public String countByExample(PkblobsExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("PKBLOBS");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    public String deleteByExample(PkblobsExample example) {
        BEGIN();
        DELETE_FROM("PKBLOBS");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    public String insertSelective(PkblobsWithBLOBs record) {
        BEGIN();
        INSERT_INTO("PKBLOBS");
        
        if (record.getId() != null) {
            VALUES("ID", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getBlob1() != null) {
            VALUES("BLOB1", "#{blob1,jdbcType=VARBINARY}");
        }
        
        if (record.getBlob2() != null) {
            VALUES("BLOB2", "#{blob2,jdbcType=VARBINARY}");
        }
        
        if (record.getCharacterlob() != null) {
            VALUES("CHARACTERLOB", "#{characterlob,jdbcType=CLOB}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    public String selectByExampleWithBLOBs(PkblobsExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("ID");
        } else {
            SELECT("ID");
        }
        SELECT("BLOB1");
        SELECT("BLOB2");
        SELECT("CHARACTERLOB");
        FROM("PKBLOBS");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    public String selectByExample(PkblobsExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("ID");
        } else {
            SELECT("ID");
        }
        FROM("PKBLOBS");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        PkblobsWithBLOBs record = (PkblobsWithBLOBs) parameter.get("record");
        PkblobsExample example = (PkblobsExample) parameter.get("example");
        
        BEGIN();
        UPDATE("PKBLOBS");
        
        if (record.getId() != null) {
            SET("ID = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getBlob1() != null) {
            SET("BLOB1 = #{record.blob1,jdbcType=VARBINARY}");
        }
        
        if (record.getBlob2() != null) {
            SET("BLOB2 = #{record.blob2,jdbcType=VARBINARY}");
        }
        
        if (record.getCharacterlob() != null) {
            SET("CHARACTERLOB = #{record.characterlob,jdbcType=CLOB}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("PKBLOBS");
        
        SET("ID = #{record.id,jdbcType=INTEGER}");
        SET("BLOB1 = #{record.blob1,jdbcType=VARBINARY}");
        SET("BLOB2 = #{record.blob2,jdbcType=VARBINARY}");
        SET("CHARACTERLOB = #{record.characterlob,jdbcType=CLOB}");
        
        PkblobsExample example = (PkblobsExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("PKBLOBS");
        
        SET("ID = #{record.id,jdbcType=INTEGER}");
        
        PkblobsExample example = (PkblobsExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    public String updateByPrimaryKeySelective(PkblobsWithBLOBs record) {
        BEGIN();
        UPDATE("PKBLOBS");
        
        if (record.getBlob1() != null) {
            SET("BLOB1 = #{blob1,jdbcType=VARBINARY}");
        }
        
        if (record.getBlob2() != null) {
            SET("BLOB2 = #{blob2,jdbcType=VARBINARY}");
        }
        
        if (record.getCharacterlob() != null) {
            SET("CHARACTERLOB = #{characterlob,jdbcType=CLOB}");
        }
        
        WHERE("ID = #{id,jdbcType=INTEGER}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    protected void applyWhere(PkblobsExample example, boolean includeExamplePhrase) {
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