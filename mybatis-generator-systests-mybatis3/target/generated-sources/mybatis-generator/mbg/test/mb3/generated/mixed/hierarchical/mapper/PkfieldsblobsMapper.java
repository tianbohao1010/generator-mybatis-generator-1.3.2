package mbg.test.mb3.generated.mixed.hierarchical.mapper;

import java.util.List;
import mbg.test.mb3.generated.mixed.hierarchical.model.Pkfieldsblobs;
import mbg.test.mb3.generated.mixed.hierarchical.model.PkfieldsblobsExample;
import mbg.test.mb3.generated.mixed.hierarchical.model.PkfieldsblobsKey;
import mbg.test.mb3.generated.mixed.hierarchical.model.PkfieldsblobsWithBLOBs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface PkfieldsblobsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    int countByExample(PkfieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    int deleteByExample(PkfieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    @Delete({
        "delete from PKFIELDSBLOBS",
        "where ID1 = #{id1,jdbcType=INTEGER}",
          "and ID2 = #{id2,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(PkfieldsblobsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    @Insert({
        "insert into PKFIELDSBLOBS (ID1, ID2, ",
        "FIRSTNAME, LASTNAME, ",
        "BLOB1)",
        "values (#{id1,jdbcType=INTEGER}, #{id2,jdbcType=INTEGER}, ",
        "#{firstname,jdbcType=VARCHAR}, #{lastname,jdbcType=VARCHAR}, ",
        "#{blob1,jdbcType=VARBINARY})"
    })
    int insert(PkfieldsblobsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    int insertSelective(PkfieldsblobsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    List<PkfieldsblobsWithBLOBs> selectByExampleWithBLOBs(PkfieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    List<Pkfieldsblobs> selectByExample(PkfieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    @Select({
        "select",
        "ID1, ID2, FIRSTNAME, LASTNAME, BLOB1",
        "from PKFIELDSBLOBS",
        "where ID1 = #{id1,jdbcType=INTEGER}",
          "and ID2 = #{id2,jdbcType=INTEGER}"
    })
    @ResultMap("ResultMapWithBLOBs")
    PkfieldsblobsWithBLOBs selectByPrimaryKey(PkfieldsblobsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    int updateByExampleSelective(@Param("record") PkfieldsblobsWithBLOBs record, @Param("example") PkfieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    int updateByExampleWithBLOBs(@Param("record") PkfieldsblobsWithBLOBs record, @Param("example") PkfieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    int updateByExample(@Param("record") Pkfieldsblobs record, @Param("example") PkfieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    int updateByPrimaryKeySelective(PkfieldsblobsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    @Update({
        "update PKFIELDSBLOBS",
        "set FIRSTNAME = #{firstname,jdbcType=VARCHAR},",
          "LASTNAME = #{lastname,jdbcType=VARCHAR},",
          "BLOB1 = #{blob1,jdbcType=VARBINARY}",
        "where ID1 = #{id1,jdbcType=INTEGER}",
          "and ID2 = #{id2,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(PkfieldsblobsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    @Update({
        "update PKFIELDSBLOBS",
        "set FIRSTNAME = #{firstname,jdbcType=VARCHAR},",
          "LASTNAME = #{lastname,jdbcType=VARCHAR}",
        "where ID1 = #{id1,jdbcType=INTEGER}",
          "and ID2 = #{id2,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Pkfieldsblobs record);
}