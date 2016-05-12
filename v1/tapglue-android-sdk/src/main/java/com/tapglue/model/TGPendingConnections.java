/*
 * Copyright (c) 2015-2016 Tapglue (https://www.tapglue.com/). All rights reserved.
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

package com.tapglue.model;

import android.support.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tapglue.networking.TGCustomCacheObject;

import java.util.List;

public class TGPendingConnections extends TGBaseObject<TGPendingConnections> {
    @Expose
    @SerializedName("incoming")
    private List<TGConnection> incomingConnections;

    @Expose
    @SerializedName("incoming_connections_count")
    private Long incomingConnectionsCount;

    @Expose
    @SerializedName("outgoing")
    private List<TGConnection> outgoingConnections;

    @Expose
    @SerializedName("outgoing_connections_count")
    private Long outgoingConnectionsCount;

    @Expose
    @SerializedName("users")
    private List<TGUser> users;

    @Expose
    @SerializedName("users_count")
    private Long usersCount;

    public TGPendingConnections() {
        super(TGCustomCacheObject.TGCacheObjectType.PendingConnections);
    }

    /**
     * Get all incoming pending connections
     *
     * @return List of incoming pending connections
     */
    public List<TGConnection> getIncoming() {
        return incomingConnections;
    }

    /**
     * Get amount of incoming pending connections
     *
     * @return Count of incoming pending connections
     */
    public Long getIncomingCount() {
        return incomingConnectionsCount;
    }

    /**
     * Get all send connections that are still pending
     *
     * @return List of outgoing pending connections
     */
    public List<TGConnection> getOutgoing() {
        return outgoingConnections;
    }

    /**
     * Get amount of outgoing pending connections
     *
     * @return Count of outgoing pending connections
     */
    public Long getOutgoingCount() {
        return outgoingConnectionsCount;
    }

    @NonNull
    @Override
    protected TGPendingConnections getThis() {
        return this;
    }

    /**
     * Get users
     *
     * @return users
     */
    public List<TGUser> getUsers() {
        return users;
    }

    /**
     * Get amount of users
     *
     * @return Count of users
     */
    public Long getUsersCount() {
        return usersCount;
    }
}
