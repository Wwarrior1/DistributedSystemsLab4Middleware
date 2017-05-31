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
public final class DoctorServiceGrpc {

  private DoctorServiceGrpc() {}

  public static final String SERVICE_NAME = "hospital.DoctorService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<agh.sr.zad4.gen.Empty,
      agh.sr.zad4.gen.Patients> METHOD_FIND_PATIENTS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "hospital.DoctorService", "findPatients"),
          io.grpc.protobuf.ProtoUtils.marshaller(agh.sr.zad4.gen.Empty.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(agh.sr.zad4.gen.Patients.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<agh.sr.zad4.gen.PatientPESEL,
      agh.sr.zad4.gen.Examinations> METHOD_FIND_EXAMINATIONS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "hospital.DoctorService", "findExaminations"),
          io.grpc.protobuf.ProtoUtils.marshaller(agh.sr.zad4.gen.PatientPESEL.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(agh.sr.zad4.gen.Examinations.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<agh.sr.zad4.gen.Empty,
      agh.sr.zad4.gen.Examinations> METHOD_FIND_EXAMINATIONS_ALL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "hospital.DoctorService", "findExaminationsAll"),
          io.grpc.protobuf.ProtoUtils.marshaller(agh.sr.zad4.gen.Empty.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(agh.sr.zad4.gen.Examinations.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<agh.sr.zad4.gen.Patient,
      agh.sr.zad4.gen.SimpleResponse> METHOD_CREATE_PATIENT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "hospital.DoctorService", "createPatient"),
          io.grpc.protobuf.ProtoUtils.marshaller(agh.sr.zad4.gen.Patient.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(agh.sr.zad4.gen.SimpleResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<agh.sr.zad4.gen.Examination,
      agh.sr.zad4.gen.SimpleResponse> METHOD_ORDER_EXAMINATION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "hospital.DoctorService", "orderExamination"),
          io.grpc.protobuf.ProtoUtils.marshaller(agh.sr.zad4.gen.Examination.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(agh.sr.zad4.gen.SimpleResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DoctorServiceStub newStub(io.grpc.Channel channel) {
    return new DoctorServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DoctorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DoctorServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static DoctorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DoctorServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class DoctorServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void findPatients(agh.sr.zad4.gen.Empty request,
        io.grpc.stub.StreamObserver<agh.sr.zad4.gen.Patients> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FIND_PATIENTS, responseObserver);
    }

    /**
     */
    public void findExaminations(agh.sr.zad4.gen.PatientPESEL request,
        io.grpc.stub.StreamObserver<agh.sr.zad4.gen.Examinations> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FIND_EXAMINATIONS, responseObserver);
    }

    /**
     */
    public void findExaminationsAll(agh.sr.zad4.gen.Empty request,
        io.grpc.stub.StreamObserver<agh.sr.zad4.gen.Examinations> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FIND_EXAMINATIONS_ALL, responseObserver);
    }

    /**
     */
    public void createPatient(agh.sr.zad4.gen.Patient request,
        io.grpc.stub.StreamObserver<agh.sr.zad4.gen.SimpleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_PATIENT, responseObserver);
    }

    /**
     */
    public void orderExamination(agh.sr.zad4.gen.Examination request,
        io.grpc.stub.StreamObserver<agh.sr.zad4.gen.SimpleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ORDER_EXAMINATION, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_FIND_PATIENTS,
            asyncServerStreamingCall(
              new MethodHandlers<
                agh.sr.zad4.gen.Empty,
                agh.sr.zad4.gen.Patients>(
                  this, METHODID_FIND_PATIENTS)))
          .addMethod(
            METHOD_FIND_EXAMINATIONS,
            asyncServerStreamingCall(
              new MethodHandlers<
                agh.sr.zad4.gen.PatientPESEL,
                agh.sr.zad4.gen.Examinations>(
                  this, METHODID_FIND_EXAMINATIONS)))
          .addMethod(
            METHOD_FIND_EXAMINATIONS_ALL,
            asyncServerStreamingCall(
              new MethodHandlers<
                agh.sr.zad4.gen.Empty,
                agh.sr.zad4.gen.Examinations>(
                  this, METHODID_FIND_EXAMINATIONS_ALL)))
          .addMethod(
            METHOD_CREATE_PATIENT,
            asyncUnaryCall(
              new MethodHandlers<
                agh.sr.zad4.gen.Patient,
                agh.sr.zad4.gen.SimpleResponse>(
                  this, METHODID_CREATE_PATIENT)))
          .addMethod(
            METHOD_ORDER_EXAMINATION,
            asyncUnaryCall(
              new MethodHandlers<
                agh.sr.zad4.gen.Examination,
                agh.sr.zad4.gen.SimpleResponse>(
                  this, METHODID_ORDER_EXAMINATION)))
          .build();
    }
  }

  /**
   */
  public static final class DoctorServiceStub extends io.grpc.stub.AbstractStub<DoctorServiceStub> {
    private DoctorServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DoctorServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DoctorServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DoctorServiceStub(channel, callOptions);
    }

    /**
     */
    public void findPatients(agh.sr.zad4.gen.Empty request,
        io.grpc.stub.StreamObserver<agh.sr.zad4.gen.Patients> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_FIND_PATIENTS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findExaminations(agh.sr.zad4.gen.PatientPESEL request,
        io.grpc.stub.StreamObserver<agh.sr.zad4.gen.Examinations> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_FIND_EXAMINATIONS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findExaminationsAll(agh.sr.zad4.gen.Empty request,
        io.grpc.stub.StreamObserver<agh.sr.zad4.gen.Examinations> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_FIND_EXAMINATIONS_ALL, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createPatient(agh.sr.zad4.gen.Patient request,
        io.grpc.stub.StreamObserver<agh.sr.zad4.gen.SimpleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_PATIENT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void orderExamination(agh.sr.zad4.gen.Examination request,
        io.grpc.stub.StreamObserver<agh.sr.zad4.gen.SimpleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ORDER_EXAMINATION, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DoctorServiceBlockingStub extends io.grpc.stub.AbstractStub<DoctorServiceBlockingStub> {
    private DoctorServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DoctorServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DoctorServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DoctorServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<agh.sr.zad4.gen.Patients> findPatients(
        agh.sr.zad4.gen.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_FIND_PATIENTS, getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<agh.sr.zad4.gen.Examinations> findExaminations(
        agh.sr.zad4.gen.PatientPESEL request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_FIND_EXAMINATIONS, getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<agh.sr.zad4.gen.Examinations> findExaminationsAll(
        agh.sr.zad4.gen.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_FIND_EXAMINATIONS_ALL, getCallOptions(), request);
    }

    /**
     */
    public agh.sr.zad4.gen.SimpleResponse createPatient(agh.sr.zad4.gen.Patient request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_PATIENT, getCallOptions(), request);
    }

    /**
     */
    public agh.sr.zad4.gen.SimpleResponse orderExamination(agh.sr.zad4.gen.Examination request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ORDER_EXAMINATION, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DoctorServiceFutureStub extends io.grpc.stub.AbstractStub<DoctorServiceFutureStub> {
    private DoctorServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DoctorServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DoctorServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DoctorServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<agh.sr.zad4.gen.SimpleResponse> createPatient(
        agh.sr.zad4.gen.Patient request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_PATIENT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<agh.sr.zad4.gen.SimpleResponse> orderExamination(
        agh.sr.zad4.gen.Examination request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ORDER_EXAMINATION, getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_PATIENTS = 0;
  private static final int METHODID_FIND_EXAMINATIONS = 1;
  private static final int METHODID_FIND_EXAMINATIONS_ALL = 2;
  private static final int METHODID_CREATE_PATIENT = 3;
  private static final int METHODID_ORDER_EXAMINATION = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DoctorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DoctorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_PATIENTS:
          serviceImpl.findPatients((agh.sr.zad4.gen.Empty) request,
              (io.grpc.stub.StreamObserver<agh.sr.zad4.gen.Patients>) responseObserver);
          break;
        case METHODID_FIND_EXAMINATIONS:
          serviceImpl.findExaminations((agh.sr.zad4.gen.PatientPESEL) request,
              (io.grpc.stub.StreamObserver<agh.sr.zad4.gen.Examinations>) responseObserver);
          break;
        case METHODID_FIND_EXAMINATIONS_ALL:
          serviceImpl.findExaminationsAll((agh.sr.zad4.gen.Empty) request,
              (io.grpc.stub.StreamObserver<agh.sr.zad4.gen.Examinations>) responseObserver);
          break;
        case METHODID_CREATE_PATIENT:
          serviceImpl.createPatient((agh.sr.zad4.gen.Patient) request,
              (io.grpc.stub.StreamObserver<agh.sr.zad4.gen.SimpleResponse>) responseObserver);
          break;
        case METHODID_ORDER_EXAMINATION:
          serviceImpl.orderExamination((agh.sr.zad4.gen.Examination) request,
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

  private static final class DoctorServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return agh.sr.zad4.gen.Hospital.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DoctorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DoctorServiceDescriptorSupplier())
              .addMethod(METHOD_FIND_PATIENTS)
              .addMethod(METHOD_FIND_EXAMINATIONS)
              .addMethod(METHOD_FIND_EXAMINATIONS_ALL)
              .addMethod(METHOD_CREATE_PATIENT)
              .addMethod(METHOD_ORDER_EXAMINATION)
              .build();
        }
      }
    }
    return result;
  }
}
