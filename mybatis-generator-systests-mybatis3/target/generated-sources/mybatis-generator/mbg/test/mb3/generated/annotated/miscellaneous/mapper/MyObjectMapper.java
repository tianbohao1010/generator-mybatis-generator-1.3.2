package mbg.test.mb3.generated.annotated.miscellaneous.mapper;

import java.util.List;
import mbg.test.common.BaseInterface;
import mbg.test.mb3.common.FirstNameTypeHandler;
import mbg.test.mb3.common.MyTimeTypeHandler;
import mbg.test.mb3.generated.annotated.miscellaneous.model.MyObject;
import mbg.test.mb3.generated.annotated.miscellaneous.model.MyObjectCriteria;
import mbg.test.mb3.generated.annotated.miscellaneous.model.MyObjectKey;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface MyObjectMapper extends BaseInterface {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbggenerated
     */
    @SelectProvider(type=MyObjectSqlProvider.class, method="countByExample")
    int countByExample(MyObjectCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbggenerated
     */
    @DeleteProvider(type=MyObjectSqlProvider.class, method="deleteByExample")
    int deleteByExample(MyObjectCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbggenerated
     */
    @Delete({
        "delete from PKFIELDS",
        "where ID2 = #{id2,jdbcType=INTEGER}",
          "and ID1 = #{id1,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(MyObjectKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbggenerated
     */
    @Insert({
        "insert into PKFIELDS (ID2, ID1, ",
        "FIRSTNAME, ",
        "LASTNAME, DATEFIELD, ",
        "TIMEFIELD, ",
        "TIMESTAMPFIELD, DECIMAL60FIELD, ",
        "DECIMAL100FIELD, DECIMAL155FIELD, ",
        "\"wierd$Field\", \"birth date\", ",
        "STRINGBOOLEAN)",
        "values (#{id2,jdbcType=INTEGER}, #{id1,jdbcType=INTEGER}, ",
        "#{firstname,jdbcType=VARCHAR,typeHandler=mbg.test.mb3.common.FirstNameTypeHandler}, ",
        "#{lastname,jdbcType=VARCHAR}, #{startDate,jdbcType=DATE}, ",
        "#{timefield,jdbcType=TIME,typeHandler=mbg.test.mb3.common.MyTimeTypeHandler}, ",
        "#{timestampfield,jdbcType=TIMESTAMP}, #{decimal60field,jdbcType=DECIMAL}, ",
        "#{decimal100field,jdbcType=DECIMAL}, #{decimal155field,jdbcType=DECIMAL}, ",
        "#{wierdField,jdbcType=INTEGER}, #{birthDate,jdbcType=DATE}, ",
        "#{stringboolean,jdbcType=CHAR})"
    })
    int insert(MyObject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbggenerated
     */
    @InsertProvider(type=MyObjectSqlProvider.class, method="insertSelective")
    int insertSelective(MyObject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbggenerated
     */
    @SelectProvider(type=MyObjectSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="A_ID2", property="id2", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="A_ID1", property="id1", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="A_FIRSTNAME", property="firstname", typeHandler=FirstNameTypeHandler.class, jdbcType=JdbcType.VARCHAR),
        @Result(column="A_LASTNAME", property="lastname", jdbcType=JdbcType.VARCHAR),
        @Result(column="A_DATEFIELD", property="startDate", jdbcType=JdbcType.DATE),
        @Result(column="A_TIMEFIELD", property="timefield", typeHandler=MyTimeTypeHandler.class, jdbcType=JdbcType.TIME),
        @Result(column="A_TIMESTAMPFIELD", property="timestampfield", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="A_DECIMAL60FIELD", property="decimal60field", jdbcType=JdbcType.DECIMAL),
        @Result(column="A_DECIMAL100FIELD", property="decimal100field", jdbcType=JdbcType.DECIMAL),
        @Result(column="A_DECIMAL155FIELD", property="decimal155field", jdbcType=JdbcType.DECIMAL),
        @Result(column="A_wierd$Field", property="wierdField", jdbcType=JdbcType.INTEGER),
        @Result(column="A_birth date", property="birthDate", jdbcType=JdbcType.DATE),
        @Result(column="A_STRINGBOOLEAN", property="stringboolean", jdbcType=JdbcType.CHAR)
    })
    List<MyObject> selectByExample(MyObjectCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "A.ID2 as A_ID2, A.ID1 as A_ID1, A.FIRSTNAME as A_FIRSTNAME, A.LASTNAME as A_LASTNAME, ",
        "A.DATEFIELD as A_DATEFIELD, A.TIMEFIELD as A_TIMEFIELD, A.TIMESTAMPFIELD as A_TIMESTAMPFIELD, ",
        "A.DECIMAL60FIELD as A_DECIMAL60FIELD, A.DECIMAL100FIELD as A_DECIMAL100FIELD, ",
        "A.DECIMAL155FIELD as A_DECIMAL155FIELD, A.\"wierd$Field\" as \"A_wierd$Field\", ",
        "A.\"birth date\" as \"A_birth date\", A.STRINGBOOLEAN as A_STRINGBOOLEAN",
        "from PKFIELDS A",
        "where A.ID2 = #{id2,jdbcType=INTEGER}",
          "and A.ID1 = #{id1,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="A_ID2", property="id2", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="A_ID1", property="id1", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="A_FIRSTNAME", property="firstname", typeHandler=FirstNameTypeHandler.class, jdbcType=JdbcType.VARCHAR),
        @Result(column="A_LASTNAME", property="lastname", jdbcType=JdbcType.VARCHAR),
        @Result(column="A_DATEFIELD", property="startDate", jdbcType=JdbcType.DATE),
        @Result(column="A_TIMEFIELD", property="timefield", typeHandler=MyTimeTypeHandler.class, jdbcType=JdbcType.TIME),
        @Result(column="A_TIMESTAMPFIELD", property="timestampfield", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="A_DECIMAL60FIELD", property="decimal60field", jdbcType=JdbcType.DECIMAL),
        @Result(column="A_DECIMAL100FIELD", property="decimal100field", jdbcType=JdbcType.DECIMAL),
        @Result(column="A_DECIMAL155FIELD", property="decimal155field", jdbcType=JdbcType.DECIMAL),
        @Result(column="A_wierd$Field", property="wierdField", jdbcType=JdbcType.INTEGER),
        @Result(column="A_birth date", property="birthDate", jdbcType=JdbcType.DATE),
        @Result(column="A_STRINGBOOLEAN", property="stringboolean", jdbcType=JdbcType.CHAR)
    })
    MyObject selectByPrimaryKey(MyObjectKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbggenerated
     */
    @UpdateProvider(type=MyObjectSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") MyObject record, @Param("example") MyObjectCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbggenerated
     */
    @UpdateProvider(type=MyObjectSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") MyObject record, @Param("example") MyObjectCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbggenerated
     */
    @UpdateProvider(type=MyObjectSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MyObject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbggenerated
     */
    @Update({
        "update PKFIELDS",
        "set FIRSTNAME = #{firstname,jdbcType=VARCHAR,typeHandler=mbg.test.mb3.common.FirstNameTypeHandler},",
          "LASTNAME = #{lastname,jdbcType=VARCHAR},",
          "DATEFIELD = #{startDate,jdbcType=DATE},",
          "TIMEFIELD = #{timefield,jdbcType=TIME,typeHandler=mbg.test.mb3.common.MyTimeTypeHandler},",
          "TIMESTAMPFIELD = #{timestampfield,jdbcType=TIMESTAMP},",
          "DECIMAL60FIELD = #{decimal60field,jdbcType=DECIMAL},",
          "DECIMAL100FIELD = #{decimal100field,jdbcType=DECIMAL},",
          "DECIMAL155FIELD = #{decimal155field,jdbcType=DECIMAL},",
          "\"wierd$Field\" = #{wierdField,jdbcType=INTEGER},",
          "\"birth date\" = #{birthDate,jdbcType=DATE},",
          "STRINGBOOLEAN = #{stringboolean,jdbcType=CHAR}",
        "where ID2 = #{id2,jdbcType=INTEGER}",
          "and ID1 = #{id1,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(MyObject record);
}