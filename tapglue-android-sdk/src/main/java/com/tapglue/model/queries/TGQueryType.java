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

public enum TGQueryType {

    EQUALS("eq"),IN("in");

    private String stringRepresentation;

    TGQueryType(String representation) {
        stringRepresentation = representation;
    }

    public String getStringRepresentation() {
        return stringRepresentation;
    }

    /**
     * Get object by representing string
     * @param rep String name
     * @return Object or null when not correct
     */
    public static TGQueryType fromString(String rep) {
        if (rep == null)
            return null;
        for (TGQueryType val : values()) {
            if (val.getStringRepresentation().equalsIgnoreCase(rep))
                return val;
        }
        return null;
    }
}
