package agh.sr.zad4.gen;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.3.0)",
    comments = "Source: Hospital.proto")
public final class LabServiceGrpc {

  private LabServiceGrpc() {}

  public static final String SERVICE_NAME = "hospital.LabService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<agh.sr.zad4.gen.Empty,
      agh.sr.zad4.gen.SimpleResponse> METHOD_ADD_EXAMINATION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "hospital.LabService", "AddExamination"),
          io.grpc.protobuf.ProtoUtils.marshaller(agh.sr.zad4.gen.Empty.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(agh.sr.zad4.gen.SimpleResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LabServiceStub newStub(io.grpc.Channel channel) {
    return new LabServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LabServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LabServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static LabServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LabServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class LabServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addExamination(agh.sr.zad4.gen.Empty request,
        io.grpc.stub.StreamObserver<agh.sr.zad4.gen.SimpleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADD_EXAMINATION, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_ADD_EXAMINATION,
            asyncUnaryCall(
              new MethodHandlers<
                agh.sr.zad4.gen.Empty,
                agh.sr.zad4.gen.SimpleResponse>(
                  this, METHODID_ADD_EXAMINATION)))
          .build();
    }
  }

  /**
   */
  public static final class LabServiceStub extends io.grpc.stub.AbstractStub<LabServiceStub> {
    private LabServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LabServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LabServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LabServiceStub(channel, callOptions);
    }

    /**
     */
    public void addExamination(agh.sr.zad4.gen.Empty request,
        io.grpc.stub.StreamObserver<agh.sr.zad4.gen.SimpleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADD_EXAMINATION, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LabServiceBlockingStub extends io.grpc.stub.AbstractStub<LabServiceBlockingStub> {
    private LabServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LabServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LabServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LabServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public agh.sr.zad4.gen.SimpleResponse addExamination(agh.sr.zad4.gen.Empty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADD_EXAMINATION, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LabServiceFutureStub extends io.grpc.stub.AbstractStub<LabServiceFutureStub> {
    private LabServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LabServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LabServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LabServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<agh.sr.zad4.gen.SimpleResponse> addExamination(
        agh.sr.zad4.gen.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADD_EXAMINATION, getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_EXAMINATION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LabServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LabServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_EXAMINATION:
          serviceImpl.addExamination((agh.sr.zad4.gen.Empty) request,
              (io.grpc.stub.StreamObserver<agh.sr.zad4.gen.SimpleResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class LabServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return agh.sr.zad4.gen.Hospital.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (LabServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LabServiceDescriptorSupplier())
              .addMethod(METHOD_ADD_EXAMINATION)
              .build();
        }
      }
    }
    return result;
  }
}
