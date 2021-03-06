package mbg.test.mb3.generated.simpleannotated.mapper;

import java.util.List;
import mbg.test.mb3.generated.simpleannotated.model.Pkblobs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface PkblobsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:44 CST 2017
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
     * @mbggenerated Thu Dec 21 14:43:44 CST 2017
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
     * @mbggenerated Thu Dec 21 14:43:44 CST 2017
     */
    @Select({
        "select",
        "ID, BLOB1, BLOB2, CHARACTERLOB",
        "from PKBLOBS",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="BLOB1", property="blob1", jdbcType=JdbcType.VARBINARY),
        @Result(column="BLOB2", property="blob2", jdbcType=JdbcType.VARBINARY),
        @Result(column="CHARACTERLOB", property="characterlob", jdbcType=JdbcType.CLOB)
    })
    Pkblobs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:44 CST 2017
     */
    @Select({
        "select",
        "ID, BLOB1, BLOB2, CHARACTERLOB",
        "from PKBLOBS"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="BLOB1", property="blob1", jdbcType=JdbcType.VARBINARY),
        @Result(column="BLOB2", property="blob2", jdbcType=JdbcType.VARBINARY),
        @Result(column="CHARACTERLOB", property="characterlob", jdbcType=JdbcType.CLOB)
    })
    List<Pkblobs> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:44 CST 2017
     */
    @Update({
        "update PKBLOBS",
        "set BLOB1 = #{blob1,jdbcType=VARBINARY},",
          "BLOB2 = #{blob2,jdbcType=VARBINARY},",
          "CHARACTERLOB = #{characterlob,jdbcType=CLOB}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Pkblobs record);
}