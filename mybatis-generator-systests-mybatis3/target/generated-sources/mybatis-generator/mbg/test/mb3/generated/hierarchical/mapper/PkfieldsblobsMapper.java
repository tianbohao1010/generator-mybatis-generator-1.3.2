package mbg.test.mb3.generated.hierarchical.mapper;

import java.util.List;
import mbg.test.mb3.generated.hierarchical.model.Pkfieldsblobs;
import mbg.test.mb3.generated.hierarchical.model.PkfieldsblobsExample;
import mbg.test.mb3.generated.hierarchical.model.PkfieldsblobsKey;
import mbg.test.mb3.generated.hierarchical.model.PkfieldsblobsWithBLOBs;
import org.apache.ibatis.annotations.Param;

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
    int deleteByPrimaryKey(PkfieldsblobsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
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
    int updateByPrimaryKeyWithBLOBs(PkfieldsblobsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbggenerated Thu Dec 21 14:43:43 CST 2017
     */
    int updateByPrimaryKey(Pkfieldsblobs record);
}