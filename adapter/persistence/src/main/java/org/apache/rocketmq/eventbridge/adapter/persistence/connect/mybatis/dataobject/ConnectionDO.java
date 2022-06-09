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

package org.apache.rocketmq.eventbridge.adapter.persistence.connect.mybatis.dataobject;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class ConnectionDO implements Serializable {

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table event_connection
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event_connection.auth_parameters
     *
     * @mbggenerated
     */
    private String authParameters;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event_connection.network_parameters
     *
     * @mbggenerated
     */
    private String networkParameters;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event_connection.account_id
     *
     * @mbggenerated
     */
    private String accountId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event_connection.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event_connection.auth_type
     *
     * @mbggenerated
     */
    private String authorizationType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event_connection.network_type
     *
     * @mbggenerated
     */
    private String networkType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event_connection.description
     *
     * @mbggenerated
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event_connection.gmt_create
     *
     * @mbggenerated
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event_connection.gmt_modify
     *
     * @mbggenerated
     */
    private Date gmtModify;



}