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
 * <pre>
 * SERVICES
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.3.0)",
    comments = "Source: Hospital.proto")
public final class PatientSericeGrpc {

  private PatientSericeGrpc() {}

  public static final String SERVICE_NAME = "hospital.PatientSerice";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<agh.sr.zad4.gen.PatientPESEL,
      agh.sr.zad4.gen.Examinations> METHOD_FIND_PATIENT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "hospital.PatientSerice", "findPatient"),
          io.grpc.protobuf.ProtoUtils.marshaller(agh.sr.zad4.gen.PatientPESEL.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(agh.sr.zad4.gen.Examinations.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PatientSericeStub newStub(io.grpc.Channel channel) {
    return new PatientSericeStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PatientSericeBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PatientSericeBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static PatientSericeFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PatientSericeFutureStub(channel);
  }

  /**
   * <pre>
   * SERVICES
   * </pre>
   */
  public static abstract class PatientSericeImplBase implements io.grpc.BindableService {

    /**
     */
    public void findPatient(agh.sr.zad4.gen.PatientPESEL request,
        io.grpc.stub.StreamObserver<agh.sr.zad4.gen.Examinations> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FIND_PATIENT, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_FIND_PATIENT,
            asyncServerStreamingCall(
              new MethodHandlers<
                agh.sr.zad4.gen.PatientPESEL,
                agh.sr.zad4.gen.Examinations>(
                  this, METHODID_FIND_PATIENT)))
          .build();
    }
  }

  /**
   * <pre>
   * SERVICES
   * </pre>
   */
  public static final class PatientSericeStub extends io.grpc.stub.AbstractStub<PatientSericeStub> {
    private PatientSericeStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PatientSericeStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientSericeStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PatientSericeStub(channel, callOptions);
    }

    /**
     */
    public void findPatient(agh.sr.zad4.gen.PatientPESEL request,
        io.grpc.stub.StreamObserver<agh.sr.zad4.gen.Examinations> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_FIND_PATIENT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * SERVICES
   * </pre>
   */
  public static final class PatientSericeBlockingStub extends io.grpc.stub.AbstractStub<PatientSericeBlockingStub> {
    private PatientSericeBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PatientSericeBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientSericeBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PatientSericeBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<agh.sr.zad4.gen.Examinations> findPatient(
        agh.sr.zad4.gen.PatientPESEL request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_FIND_PATIENT, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * SERVICES
   * </pre>
   */
  public static final class PatientSericeFutureStub extends io.grpc.stub.AbstractStub<PatientSericeFutureStub> {
    private PatientSericeFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PatientSericeFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientSericeFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PatientSericeFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_FIND_PATIENT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PatientSericeImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PatientSericeImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_PATIENT:
          serviceImpl.findPatient((agh.sr.zad4.gen.PatientPESEL) request,
              (io.grpc.stub.StreamObserver<agh.sr.zad4.gen.Examinations>) responseObserver);
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

  private static final class PatientSericeDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return agh.sr.zad4.gen.Hospital.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PatientSericeGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PatientSericeDescriptorSupplier())
              .addMethod(METHOD_FIND_PATIENT)
              .build();
        }
      }
    }
    return result;
  }
}
