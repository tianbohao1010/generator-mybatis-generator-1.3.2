package mbg.test.mb3.generated.flat.mapper;

import java.util.List;
import mbg.test.mb3.generated.flat.model.Fieldsonly;
import mbg.test.mb3.generated.flat.model.FieldsonlyExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface FieldsonlyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    int countByExample(FieldsonlyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    int deleteByExample(FieldsonlyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    int insert(Fieldsonly record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    int insertSelective(Fieldsonly record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    List<Fieldsonly> selectByExampleWithRowbounds(FieldsonlyExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    List<Fieldsonly> selectByExample(FieldsonlyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    int updateByExampleSelective(@Param("record") Fieldsonly record, @Param("example") FieldsonlyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    int updateByExample(@Param("record") Fieldsonly record, @Param("example") FieldsonlyExample example);
}