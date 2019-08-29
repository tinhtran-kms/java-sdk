/*
 * (C) Copyright IBM Corp. 2019.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.discovery.v1.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * TrainingDataSet.
 */
public class TrainingDataSet extends GenericModel {

  @SerializedName("environment_id")
  private String environmentId;
  @SerializedName("collection_id")
  private String collectionId;
  private List<TrainingQuery> queries;

  /**
   * Gets the environmentId.
   *
   * The environment id associated with this training data set.
   *
   * @return the environmentId
   */
  public String getEnvironmentId() {
    return environmentId;
  }

  /**
   * Gets the collectionId.
   *
   * The collection id associated with this training data set.
   *
   * @return the collectionId
   */
  public String getCollectionId() {
    return collectionId;
  }

  /**
   * Gets the queries.
   *
   * Array of training queries.
   *
   * @return the queries
   */
  public List<TrainingQuery> getQueries() {
    return queries;
  }
}
