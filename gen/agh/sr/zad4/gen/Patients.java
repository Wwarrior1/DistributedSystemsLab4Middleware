// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Hospital.proto

package agh.sr.zad4.gen;

/**
 * Protobuf type {@code hospital.Patients}
 */
public  final class Patients extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:hospital.Patients)
    PatientsOrBuilder {
  // Use Patients.newBuilder() to construct.
  private Patients(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Patients() {
    statusCode_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Patients(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            int rawValue = input.readEnum();

            statusCode_ = rawValue;
            break;
          }
          case 18: {
            agh.sr.zad4.gen.Patient.Builder subBuilder = null;
            if (patient_ != null) {
              subBuilder = patient_.toBuilder();
            }
            patient_ = input.readMessage(agh.sr.zad4.gen.Patient.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(patient_);
              patient_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return agh.sr.zad4.gen.Hospital.internal_static_hospital_Patients_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return agh.sr.zad4.gen.Hospital.internal_static_hospital_Patients_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            agh.sr.zad4.gen.Patients.class, agh.sr.zad4.gen.Patients.Builder.class);
  }

  /**
   * Protobuf enum {@code hospital.Patients.StatusCode}
   */
  public enum StatusCode
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>FOUND = 0;</code>
     */
    FOUND(0),
    /**
     * <code>NOT_FOUND = 1;</code>
     */
    NOT_FOUND(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>FOUND = 0;</code>
     */
    public static final int FOUND_VALUE = 0;
    /**
     * <code>NOT_FOUND = 1;</code>
     */
    public static final int NOT_FOUND_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static StatusCode valueOf(int value) {
      return forNumber(value);
    }

    public static StatusCode forNumber(int value) {
      switch (value) {
        case 0: return FOUND;
        case 1: return NOT_FOUND;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<StatusCode>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        StatusCode> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<StatusCode>() {
            public StatusCode findValueByNumber(int number) {
              return StatusCode.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return agh.sr.zad4.gen.Patients.getDescriptor().getEnumTypes().get(0);
    }

    private static final StatusCode[] VALUES = values();

    public static StatusCode valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private StatusCode(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:hospital.Patients.StatusCode)
  }

  public static final int STATUSCODE_FIELD_NUMBER = 1;
  private int statusCode_;
  /**
   * <code>.hospital.Patients.StatusCode statusCode = 1;</code>
   */
  public int getStatusCodeValue() {
    return statusCode_;
  }
  /**
   * <code>.hospital.Patients.StatusCode statusCode = 1;</code>
   */
  public agh.sr.zad4.gen.Patients.StatusCode getStatusCode() {
    agh.sr.zad4.gen.Patients.StatusCode result = agh.sr.zad4.gen.Patients.StatusCode.valueOf(statusCode_);
    return result == null ? agh.sr.zad4.gen.Patients.StatusCode.UNRECOGNIZED : result;
  }

  public static final int PATIENT_FIELD_NUMBER = 2;
  private agh.sr.zad4.gen.Patient patient_;
  /**
   * <code>.hospital.Patient patient = 2;</code>
   */
  public boolean hasPatient() {
    return patient_ != null;
  }
  /**
   * <code>.hospital.Patient patient = 2;</code>
   */
  public agh.sr.zad4.gen.Patient getPatient() {
    return patient_ == null ? agh.sr.zad4.gen.Patient.getDefaultInstance() : patient_;
  }
  /**
   * <code>.hospital.Patient patient = 2;</code>
   */
  public agh.sr.zad4.gen.PatientOrBuilder getPatientOrBuilder() {
    return getPatient();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (statusCode_ != agh.sr.zad4.gen.Patients.StatusCode.FOUND.getNumber()) {
      output.writeEnum(1, statusCode_);
    }
    if (patient_ != null) {
      output.writeMessage(2, getPatient());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (statusCode_ != agh.sr.zad4.gen.Patients.StatusCode.FOUND.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, statusCode_);
    }
    if (patient_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPatient());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof agh.sr.zad4.gen.Patients)) {
      return super.equals(obj);
    }
    agh.sr.zad4.gen.Patients other = (agh.sr.zad4.gen.Patients) obj;

    boolean result = true;
    result = result && statusCode_ == other.statusCode_;
    result = result && (hasPatient() == other.hasPatient());
    if (hasPatient()) {
      result = result && getPatient()
          .equals(other.getPatient());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + STATUSCODE_FIELD_NUMBER;
    hash = (53 * hash) + statusCode_;
    if (hasPatient()) {
      hash = (37 * hash) + PATIENT_FIELD_NUMBER;
      hash = (53 * hash) + getPatient().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static agh.sr.zad4.gen.Patients parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static agh.sr.zad4.gen.Patients parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static agh.sr.zad4.gen.Patients parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static agh.sr.zad4.gen.Patients parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static agh.sr.zad4.gen.Patients parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static agh.sr.zad4.gen.Patients parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static agh.sr.zad4.gen.Patients parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static agh.sr.zad4.gen.Patients parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static agh.sr.zad4.gen.Patients parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static agh.sr.zad4.gen.Patients parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(agh.sr.zad4.gen.Patients prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code hospital.Patients}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:hospital.Patients)
      agh.sr.zad4.gen.PatientsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return agh.sr.zad4.gen.Hospital.internal_static_hospital_Patients_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return agh.sr.zad4.gen.Hospital.internal_static_hospital_Patients_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              agh.sr.zad4.gen.Patients.class, agh.sr.zad4.gen.Patients.Builder.class);
    }

    // Construct using agh.sr.zad4.gen.Patients.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      statusCode_ = 0;

      if (patientBuilder_ == null) {
        patient_ = null;
      } else {
        patient_ = null;
        patientBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return agh.sr.zad4.gen.Hospital.internal_static_hospital_Patients_descriptor;
    }

    public agh.sr.zad4.gen.Patients getDefaultInstanceForType() {
      return agh.sr.zad4.gen.Patients.getDefaultInstance();
    }

    public agh.sr.zad4.gen.Patients build() {
      agh.sr.zad4.gen.Patients result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public agh.sr.zad4.gen.Patients buildPartial() {
      agh.sr.zad4.gen.Patients result = new agh.sr.zad4.gen.Patients(this);
      result.statusCode_ = statusCode_;
      if (patientBuilder_ == null) {
        result.patient_ = patient_;
      } else {
        result.patient_ = patientBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof agh.sr.zad4.gen.Patients) {
        return mergeFrom((agh.sr.zad4.gen.Patients)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(agh.sr.zad4.gen.Patients other) {
      if (other == agh.sr.zad4.gen.Patients.getDefaultInstance()) return this;
      if (other.statusCode_ != 0) {
        setStatusCodeValue(other.getStatusCodeValue());
      }
      if (other.hasPatient()) {
        mergePatient(other.getPatient());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      agh.sr.zad4.gen.Patients parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (agh.sr.zad4.gen.Patients) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int statusCode_ = 0;
    /**
     * <code>.hospital.Patients.StatusCode statusCode = 1;</code>
     */
    public int getStatusCodeValue() {
      return statusCode_;
    }
    /**
     * <code>.hospital.Patients.StatusCode statusCode = 1;</code>
     */
    public Builder setStatusCodeValue(int value) {
      statusCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.hospital.Patients.StatusCode statusCode = 1;</code>
     */
    public agh.sr.zad4.gen.Patients.StatusCode getStatusCode() {
      agh.sr.zad4.gen.Patients.StatusCode result = agh.sr.zad4.gen.Patients.StatusCode.valueOf(statusCode_);
      return result == null ? agh.sr.zad4.gen.Patients.StatusCode.UNRECOGNIZED : result;
    }
    /**
     * <code>.hospital.Patients.StatusCode statusCode = 1;</code>
     */
    public Builder setStatusCode(agh.sr.zad4.gen.Patients.StatusCode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      statusCode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.hospital.Patients.StatusCode statusCode = 1;</code>
     */
    public Builder clearStatusCode() {
      
      statusCode_ = 0;
      onChanged();
      return this;
    }

    private agh.sr.zad4.gen.Patient patient_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        agh.sr.zad4.gen.Patient, agh.sr.zad4.gen.Patient.Builder, agh.sr.zad4.gen.PatientOrBuilder> patientBuilder_;
    /**
     * <code>.hospital.Patient patient = 2;</code>
     */
    public boolean hasPatient() {
      return patientBuilder_ != null || patient_ != null;
    }
    /**
     * <code>.hospital.Patient patient = 2;</code>
     */
    public agh.sr.zad4.gen.Patient getPatient() {
      if (patientBuilder_ == null) {
        return patient_ == null ? agh.sr.zad4.gen.Patient.getDefaultInstance() : patient_;
      } else {
        return patientBuilder_.getMessage();
      }
    }
    /**
     * <code>.hospital.Patient patient = 2;</code>
     */
    public Builder setPatient(agh.sr.zad4.gen.Patient value) {
      if (patientBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        patient_ = value;
        onChanged();
      } else {
        patientBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.hospital.Patient patient = 2;</code>
     */
    public Builder setPatient(
        agh.sr.zad4.gen.Patient.Builder builderForValue) {
      if (patientBuilder_ == null) {
        patient_ = builderForValue.build();
        onChanged();
      } else {
        patientBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.hospital.Patient patient = 2;</code>
     */
    public Builder mergePatient(agh.sr.zad4.gen.Patient value) {
      if (patientBuilder_ == null) {
        if (patient_ != null) {
          patient_ =
            agh.sr.zad4.gen.Patient.newBuilder(patient_).mergeFrom(value).buildPartial();
        } else {
          patient_ = value;
        }
        onChanged();
      } else {
        patientBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.hospital.Patient patient = 2;</code>
     */
    public Builder clearPatient() {
      if (patientBuilder_ == null) {
        patient_ = null;
        onChanged();
      } else {
        patient_ = null;
        patientBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.hospital.Patient patient = 2;</code>
     */
    public agh.sr.zad4.gen.Patient.Builder getPatientBuilder() {
      
      onChanged();
      return getPatientFieldBuilder().getBuilder();
    }
    /**
     * <code>.hospital.Patient patient = 2;</code>
     */
    public agh.sr.zad4.gen.PatientOrBuilder getPatientOrBuilder() {
      if (patientBuilder_ != null) {
        return patientBuilder_.getMessageOrBuilder();
      } else {
        return patient_ == null ?
            agh.sr.zad4.gen.Patient.getDefaultInstance() : patient_;
      }
    }
    /**
     * <code>.hospital.Patient patient = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        agh.sr.zad4.gen.Patient, agh.sr.zad4.gen.Patient.Builder, agh.sr.zad4.gen.PatientOrBuilder> 
        getPatientFieldBuilder() {
      if (patientBuilder_ == null) {
        patientBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            agh.sr.zad4.gen.Patient, agh.sr.zad4.gen.Patient.Builder, agh.sr.zad4.gen.PatientOrBuilder>(
                getPatient(),
                getParentForChildren(),
                isClean());
        patient_ = null;
      }
      return patientBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:hospital.Patients)
  }

  // @@protoc_insertion_point(class_scope:hospital.Patients)
  private static final agh.sr.zad4.gen.Patients DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new agh.sr.zad4.gen.Patients();
  }

  public static agh.sr.zad4.gen.Patients getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Patients>
      PARSER = new com.google.protobuf.AbstractParser<Patients>() {
    public Patients parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Patients(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Patients> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Patients> getParserForType() {
    return PARSER;
  }

  public agh.sr.zad4.gen.Patients getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
