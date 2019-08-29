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
package com.ibm.watson.natural_language_understanding.v1.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The general concepts referenced or alluded to in the analyzed text.
 */
public class ConceptsResult extends GenericModel {

  private String text;
  private Double relevance;
  @SerializedName("dbpedia_resource")
  private String dbpediaResource;

  /**
   * Gets the text.
   *
   * Name of the concept.
   *
   * @return the text
   */
  public String getText() {
    return text;
  }

  /**
   * Gets the relevance.
   *
   * Relevance score between 0 and 1. Higher scores indicate greater relevance.
   *
   * @return the relevance
   */
  public Double getRelevance() {
    return relevance;
  }

  /**
   * Gets the dbpediaResource.
   *
   * Link to the corresponding DBpedia resource.
   *
   * @return the dbpediaResource
   */
  public String getDbpediaResource() {
    return dbpediaResource;
  }
}
