package com.alvin.dao.mapper;

import com.alvin.dao.entity.Similar;
import com.alvin.dao.entity.example.SimilarExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SimilarMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table similar
     *
     * @mbg.generated Thu Aug 20 14:29:45 CST 2020
     */
    long countByExample(SimilarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table similar
     *
     * @mbg.generated Thu Aug 20 14:29:45 CST 2020
     */
    int deleteByExample(SimilarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table similar
     *
     * @mbg.generated Thu Aug 20 14:29:45 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table similar
     *
     * @mbg.generated Thu Aug 20 14:29:45 CST 2020
     */
    int insert(Similar record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table similar
     *
     * @mbg.generated Thu Aug 20 14:29:45 CST 2020
     */
    int insertSelective(@Param("record") Similar record, @Param("selective") Similar.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table similar
     *
     * @mbg.generated Thu Aug 20 14:29:45 CST 2020
     */
    Similar selectOneByExample(SimilarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table similar
     *
     * @mbg.generated Thu Aug 20 14:29:45 CST 2020
     */
    Similar selectOneByExampleSelective(@Param("example") SimilarExample example, @Param("selective") Similar.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table similar
     *
     * @mbg.generated Thu Aug 20 14:29:45 CST 2020
     */
    List<Similar> selectByExampleSelective(@Param("example") SimilarExample example, @Param("selective") Similar.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table similar
     *
     * @mbg.generated Thu Aug 20 14:29:45 CST 2020
     */
    List<Similar> selectByExample(SimilarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table similar
     *
     * @mbg.generated Thu Aug 20 14:29:45 CST 2020
     */
    Similar selectByPrimaryKeySelective(@Param("id") Long id, @Param("selective") Similar.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table similar
     *
     * @mbg.generated Thu Aug 20 14:29:45 CST 2020
     */
    Similar selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table similar
     *
     * @mbg.generated Thu Aug 20 14:29:45 CST 2020
     */
    int updateByExampleSelective(@Param("record") Similar record, @Param("example") SimilarExample example, @Param("selective") Similar.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table similar
     *
     * @mbg.generated Thu Aug 20 14:29:45 CST 2020
     */
    int updateByExample(@Param("record") Similar record, @Param("example") SimilarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table similar
     *
     * @mbg.generated Thu Aug 20 14:29:45 CST 2020
     */
    int updateByPrimaryKeySelective(@Param("record") Similar record, @Param("selective") Similar.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table similar
     *
     * @mbg.generated Thu Aug 20 14:29:45 CST 2020
     */
    int updateByPrimaryKey(Similar record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table similar
     *
     * @mbg.generated Thu Aug 20 14:29:45 CST 2020
     */
    int batchInsert(@Param("list") List<Similar> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table similar
     *
     * @mbg.generated Thu Aug 20 14:29:45 CST 2020
     */
    int batchInsertSelective(@Param("list") List<Similar> list, @Param("selective") Similar.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table similar
     *
     * @mbg.generated Thu Aug 20 14:29:45 CST 2020
     */
    int upsert(Similar record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table similar
     *
     * @mbg.generated Thu Aug 20 14:29:45 CST 2020
     */
    int upsertSelective(@Param("record") Similar record, @Param("selective") Similar.Column ... selective);
}