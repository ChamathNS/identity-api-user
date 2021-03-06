/*
 *  Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.wso2.carbon.identity.rest.api.user.recovery.v1.impl.core.exceptions;

import org.wso2.carbon.identity.rest.api.user.recovery.v1.impl.core.Constants;
import org.wso2.carbon.identity.rest.api.user.recovery.v1.model.ErrorResponse;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

/**
 * InternalServerErrorException class.
 */
public class InternalServerErrorException extends WebApplicationException {

    /**
     * Exception message.
     */
    private String message;

    public InternalServerErrorException(Throwable e) {
        super(e, Response.Status.INTERNAL_SERVER_ERROR);
    }

    /**
     * Constructs a new exception instance.
     */
    public InternalServerErrorException() {
        super(Response.Status.INTERNAL_SERVER_ERROR);
    }

    public InternalServerErrorException(String message, Throwable e) {
        super(message, e, Response.Status.INTERNAL_SERVER_ERROR);
    }

    public InternalServerErrorException(String message) {
        super(message, Response.Status.INTERNAL_SERVER_ERROR);
    }

    /**
     * Constructs a new exception from the ErrorDTO{@link ErrorResponse} object.
     *
     * @param errorResponse ErrorResponse{@link ErrorResponse} object holding the error code and the message
     */
    public InternalServerErrorException(ErrorResponse errorResponse) {

        super(Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(errorResponse)
                .header(Constants.HEADER_CONTENT_TYPE, Constants.DEFAULT_RESPONSE_CONTENT_TYPE).build());
    }
}
