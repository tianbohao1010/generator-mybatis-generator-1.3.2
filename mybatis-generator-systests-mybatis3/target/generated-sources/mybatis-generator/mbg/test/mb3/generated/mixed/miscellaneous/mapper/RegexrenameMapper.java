package mbg.test.mb3.generated.mixed.miscellaneous.mapper;

import java.util.List;
import mbg.test.common.BaseInterface;
import mbg.test.mb3.generated.mixed.miscellaneous.model.Regexrename;
import mbg.test.mb3.generated.mixed.miscellaneous.model.RegexrenameCriteria;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface RegexrenameMapper extends BaseInterface {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbggenerated
     */
    int countByExample(RegexrenameCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbggenerated
     */
    int deleteByExample(RegexrenameCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbggenerated
     */
    @Delete({
        "delete from REGEXRENAME",
        "where CUST_ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbggenerated
     */
    @Insert({
        "insert into REGEXRENAME (CUST_ID, CUST_NAME, ",
        "CUST_ADDRESS, ZIP_CODE)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{address,jdbcType=VARCHAR}, #{zipCode,jdbcType=CHAR})"
    })
    @SelectKey(statement="call next value for TestSequence", keyProperty="id", before=true, resultType=Integer.class)
    int insert(Regexrename record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbggenerated
     */
    int insertSelective(Regexrename record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbggenerated
     */
    List<Regexrename> selectByExample(RegexrenameCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "CUST_ID, CUST_NAME, CUST_ADDRESS, ZIP_CODE",
        "from REGEXRENAME",
        "where CUST_ID = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Regexrename selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Regexrename record, @Param("example") RegexrenameCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Regexrename record, @Param("example") RegexrenameCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Regexrename record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbggenerated
     */
    @Update({
        "update REGEXRENAME",
        "set CUST_NAME = #{name,jdbcType=VARCHAR},",
          "CUST_ADDRESS = #{address,jdbcType=VARCHAR},",
          "ZIP_CODE = #{zipCode,jdbcType=CHAR}",
        "where CUST_ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Regexrename record);
}