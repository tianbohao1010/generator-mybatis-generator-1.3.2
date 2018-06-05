package mbg.test.mb3.generated.mixed.flat.mapper;

import java.util.List;
import mbg.test.mb3.generated.mixed.flat.model.Pkblobs;
import mbg.test.mb3.generated.mixed.flat.model.PkblobsExample;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

public interface PkblobsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    int countByExample(PkblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    int deleteByExample(PkblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    @Delete({
        "delete from PKBLOBS",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    @Insert({
        "insert into PKBLOBS (ID, BLOB1, ",
        "BLOB2, CHARACTERLOB)",
        "values (#{id,jdbcType=INTEGER}, #{blob1,jdbcType=VARBINARY}, ",
        "#{blob2,jdbcType=VARBINARY}, #{characterlob,jdbcType=CLOB})"
    })
    int insert(Pkblobs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    int insertSelective(Pkblobs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    List<Pkblobs> selectByExampleWithBLOBsWithRowbounds(PkblobsExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    List<Pkblobs> selectByExampleWithBLOBs(PkblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    List<Pkblobs> selectByExampleWithRowbounds(PkblobsExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    List<Pkblobs> selectByExample(PkblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    @Select({
        "select",
        "ID, BLOB1, BLOB2, CHARACTERLOB",
        "from PKBLOBS",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("ResultMapWithBLOBs")
    Pkblobs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    int updateByExampleSelective(@Param("record") Pkblobs record, @Param("example") PkblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    int updateByExampleWithBLOBs(@Param("record") Pkblobs record, @Param("example") PkblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    int updateByExample(@Param("record") Pkblobs record, @Param("example") PkblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    int updateByPrimaryKeySelective(Pkblobs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    @Update({
        "update PKBLOBS",
        "set BLOB1 = #{blob1,jdbcType=VARBINARY},",
          "BLOB2 = #{blob2,jdbcType=VARBINARY},",
          "CHARACTERLOB = #{characterlob,jdbcType=CLOB}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(Pkblobs record);
}