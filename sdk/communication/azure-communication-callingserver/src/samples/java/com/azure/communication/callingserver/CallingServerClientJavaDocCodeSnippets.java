// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.callingserver;

import com.azure.communication.callingserver.models.CallMediaType;
import com.azure.communication.callingserver.models.CallingEventSubscriptionType;
import com.azure.communication.callingserver.models.CreateCallOptions;
import com.azure.communication.common.CommunicationIdentifier;
import com.azure.communication.common.CommunicationUserIdentifier;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

public class CallingServerClientJavaDocCodeSnippets {
    public CallingServerClient createCallingServerClientWithPipeline() {

        String connectionString = getConnectionString();
        // BEGIN: com.azure.communication.callingserver.CallingServerClient.pipeline.instantiation
        HttpPipeline pipeline = new HttpPipelineBuilder()
            .policies(/* add policies */)
            .build();

        CallingServerClient callingServerClient = new CallingServerClientBuilder()
            .pipeline(pipeline)
            .connectionString(connectionString)
            .buildClient();
        // END: com.azure.communication.callingserver.CallingServerClient.pipeline.instantiation
        return callingServerClient;
    }

    private String getConnectionString() {
        return "endpoint=https://<resource-name>.communication.azure.com/;accesskey=<access-key>";
    }

    /**
     * Sample code for creating a call connection using the sync call client.
     */
    public void createCallConnection() {
        CallingServerClient callingServerClient = createCallingServerClientWithPipeline();

        CommunicationIdentifier source = new CommunicationUserIdentifier("<acs-user-identity>");
        CommunicationIdentifier firstCallee = new CommunicationUserIdentifier("<acs-user-identity-1>");
        CommunicationIdentifier secondCallee = new CommunicationUserIdentifier("<acs-user-identity-2>");
        String callbackUri = "<callback-uri-for-notification>";

        // BEGIN: com.azure.communication.callingserver.CallingServerClient.create.call.connection
        List<CommunicationIdentifier> targets = Arrays.asList(firstCallee, secondCallee);
        List<CallMediaType> requestedMediaTypes = Arrays.asList(CallMediaType.AUDIO, CallMediaType.VIDEO);
        List<CallingEventSubscriptionType> requestedCallEvents = Arrays.asList(
            CallingEventSubscriptionType.TONE_RECEIVED,
            CallingEventSubscriptionType.PARTICIPANTS_UPDATED);
        CreateCallOptions createCallOptions = new CreateCallOptions(
            URI.create(callbackUri),
            requestedMediaTypes,
            requestedCallEvents);
        CallConnection callConnection = callingServerClient.createCallConnection(source, targets, createCallOptions);
        // END: com.azure.communication.callingserver.CallingServerClient.create.call.connection
    }

}
