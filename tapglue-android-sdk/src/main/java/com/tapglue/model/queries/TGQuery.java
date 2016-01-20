/*
 * Copyright (c) 2015 Tapglue (https://www.tapglue.com/). All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.tapglue.model.queries;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TGQuery {

    @Expose
    @SerializedName("type")
    private String type;


    @Expose
    @SerializedName("object")
    private TGQueryObject object;

    /**
     * Set query object
     * @param object
     * @return
     */
    public TGQuery setObject(TGQueryObject object){
        this.object = object;
        return this;
    }

    /**
     * Get query object
     * @return
     */
    public TGQueryObject getObject(){
        return object;
    }

    /**
     * Get query object type
     * @return
     */
    public TGQueryType getType(){
        return TGQueryType.fromString(type);
    }

    /**
     * Set query object type
     * @param type
     * @return
     */
    public TGQuery setType(TGQueryType type){
        this.type = type.getStringRepresentation();
        return this;
    }
}
