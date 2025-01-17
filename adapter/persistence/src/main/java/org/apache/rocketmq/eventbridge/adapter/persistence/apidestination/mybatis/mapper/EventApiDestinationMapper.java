/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.rocketmq.eventbridge.adapter.persistence.apidestination.mybatis.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.rocketmq.eventbridge.adapter.persistence.apidestination.mybatis.dataobject.ApiDestinationDO;
import org.apache.rocketmq.eventbridge.domain.model.apidestination.ApiDestinationDTO;

import java.util.List;

public interface EventApiDestinationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_api_destination
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_api_destination
     *
     * @mbggenerated
     */
    int insert(ApiDestinationDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_api_destination
     *
     * @mbggenerated
     */
    int insertSelective(ApiDestinationDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_api_destination
     *
     * @mbggenerated
     */
    ApiDestinationDO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_api_destination
     *
     * @mbggenerated
     */
    List<ApiDestinationDO> listApiDestinations(@Param("accountId") String accountId, @Param("name") String name,
                                                @Param("nextToken") int nextToken, @Param("maxResults") int maxResults);

    /**
     * 通过用户id和名称查询
     * @param accountId
     * @param name
     * @return
     */
    ApiDestinationDO selectByAccountIdAndName(@Param("accountId") String accountId, @Param("name") String name);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_api_destination
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ApiDestinationDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_api_destination
     *
     * @mbggenerated
     */
    int updateByNameAndAccountId(ApiDestinationDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_api_destination
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(ApiDestinationDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_api_destination
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ApiDestinationDO record);

    /**
     * 根据用户Id和名称删除数据
     * @param accountId
     * @param name
     * @return
     */
    int deleteByAccountIdAndName(@Param("accountId") String accountId, @Param("name") String name);

    /**
     *
     * @param accountId
     * @return
     */
    int getApiDestinationCount(@Param("accountId") String accountId);
}