package com.learning.service;

import org.springframework.stereotype.Service;

import com.learning.employee.BookRequest;
import com.learning.employee.BookResponse;
import com.learning.employee.BookServiceGrpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

@Service
public class BookService {

    public void getBook() {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8090).usePlaintext().build();

        BookServiceGrpc.BookServiceBlockingStub stub = BookServiceGrpc.newBlockingStub(channel);

        BookResponse bookResponse = stub.getBook(BookRequest.newBuilder().setBookId("1").build());

        System.out.println(bookResponse);

        channel.shutdown();
    }
}