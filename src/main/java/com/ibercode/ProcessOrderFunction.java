package com.ibercode;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.amazon.awssdk.services.eventbridge.EventBridgeClient;
import software.amazon.awssdk.services.eventbridge.model.EventBridgeRequest;
import software.amazon.awssdk.services.eventbridge.model.PutEventsRequest;
import software.amazon.awssdk.services.eventbridge.model.PutEventsRequestEntry;

import java.util.HashMap;
import java.util.UUID;

public class ProcessOrderFunction implements RequestHandler<OrderRequest, String> {

    Gson gson = new GsonBuilder().disableHtmlEscaping().create();
    Logger logger = LoggerFactory.getLogger(ProcessOrderFunction.class);
    APIGatewayProxyResponseEvent response = new APIGatewayProxyResponseEvent();

    @Override
    public String handleRequest(OrderRequest orderRequest, Context context) {

        logger.info("[ibcd] order in:" + orderRequest);

        return null;
    }
}
