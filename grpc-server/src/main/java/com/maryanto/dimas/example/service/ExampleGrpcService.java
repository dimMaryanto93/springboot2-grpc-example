package com.maryanto.dimas.example.service;

import com.maryanto.dimas.example.grpc.lib.ExampleServiceGrpc;
import com.maryanto.dimas.example.grpc.lib.RequestData;
import com.maryanto.dimas.example.grpc.lib.ResponseData;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class ExampleGrpcService extends ExampleServiceGrpc.ExampleServiceImplBase {

    @Override
    public void sayHello(RequestData request, StreamObserver<ResponseData> responseObserver) {
        ResponseData reply = ResponseData.newBuilder()
                .setAnsware(request.getQuetion() + ": Bisa")
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
