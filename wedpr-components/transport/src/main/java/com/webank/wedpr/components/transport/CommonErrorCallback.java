/*
 * Copyright 2017-2025  [webank-wedpr]
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 */

package com.webank.wedpr.components.transport;

import com.webank.wedpr.sdk.jni.generated.Error;
import com.webank.wedpr.sdk.jni.transport.handlers.MessageErrorCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonErrorCallback extends MessageErrorCallback {
    private static final Logger logger = LoggerFactory.getLogger(CommonErrorCallback.class);
    private final String method;

    public CommonErrorCallback(String method) {
        this.method = method;
    }

    @Override
    public void onErrorResult(Error error) {
        if (error == null || error.errorCode() == 0) {
            return;
        }
        logger.warn("call {} failed for: {}", method, error.errorMessage());
    }
}