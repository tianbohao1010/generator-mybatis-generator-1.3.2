package mbg.test.mb3.generated.conditional.mapper;

import java.util.List;
import mbg.test.mb3.generated.conditional.model.AwfulTable;
import mbg.test.mb3.generated.conditional.model.AwfulTableExample;
import org.apache.ibatis.annotations.Param;

public interface AwfulTableMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    int countByExample(AwfulTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    int deleteByExample(AwfulTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    int deleteByPrimaryKey(Integer customerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    int insert(AwfulTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    int insertSelective(AwfulTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    List<AwfulTable> selectByExample(AwfulTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    AwfulTable selectByPrimaryKey(Integer customerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    int updateByExampleSelective(@Param("record") AwfulTable record, @Param("example") AwfulTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    int updateByExample(@Param("record") AwfulTable record, @Param("example") AwfulTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    int updateByPrimaryKeySelective(AwfulTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    int updateByPrimaryKey(AwfulTable record);
}