package com.maryanto.dimas.example.service;

import com.maryanto.dimas.example.grpc.lib.ExampleServiceGrpc;
import com.maryanto.dimas.example.grpc.lib.RequestData;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class LoggingService {

    @GrpcClient("loggingSub")
    private ExampleServiceGrpc.ExampleServiceBlockingStub serviceStub;

    public String receiveGreeting(String question) {
        RequestData request = RequestData.newBuilder()
                .setQuetion(question)
                .build();
        return serviceStub.sayHello(request).getAnsware();
    }
}
