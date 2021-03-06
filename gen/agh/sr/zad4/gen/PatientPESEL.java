// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Hospital.proto

package agh.sr.zad4.gen;

/**
 * <pre>
 * OTHER
 * </pre>
 *
 * Protobuf type {@code hospital.PatientPESEL}
 */
public  final class PatientPESEL extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:hospital.PatientPESEL)
    PatientPESELOrBuilder {
  // Use PatientPESEL.newBuilder() to construct.
  private PatientPESEL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PatientPESEL() {
    pESEL_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private PatientPESEL(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            pESEL_ = s;
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
    return agh.sr.zad4.gen.Hospital.internal_static_hospital_PatientPESEL_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return agh.sr.zad4.gen.Hospital.internal_static_hospital_PatientPESEL_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            agh.sr.zad4.gen.PatientPESEL.class, agh.sr.zad4.gen.PatientPESEL.Builder.class);
  }

  public static final int PESEL_FIELD_NUMBER = 1;
  private volatile java.lang.Object pESEL_;
  /**
   * <code>string PESEL = 1;</code>
   */
  public java.lang.String getPESEL() {
    java.lang.Object ref = pESEL_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pESEL_ = s;
      return s;
    }
  }
  /**
   * <code>string PESEL = 1;</code>
   */
  public com.google.protobuf.ByteString
      getPESELBytes() {
    java.lang.Object ref = pESEL_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pESEL_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getPESELBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, pESEL_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPESELBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, pESEL_);
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
    if (!(obj instanceof agh.sr.zad4.gen.PatientPESEL)) {
      return super.equals(obj);
    }
    agh.sr.zad4.gen.PatientPESEL other = (agh.sr.zad4.gen.PatientPESEL) obj;

    boolean result = true;
    result = result && getPESEL()
        .equals(other.getPESEL());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PESEL_FIELD_NUMBER;
    hash = (53 * hash) + getPESEL().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static agh.sr.zad4.gen.PatientPESEL parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static agh.sr.zad4.gen.PatientPESEL parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static agh.sr.zad4.gen.PatientPESEL parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static agh.sr.zad4.gen.PatientPESEL parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static agh.sr.zad4.gen.PatientPESEL parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static agh.sr.zad4.gen.PatientPESEL parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static agh.sr.zad4.gen.PatientPESEL parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static agh.sr.zad4.gen.PatientPESEL parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static agh.sr.zad4.gen.PatientPESEL parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static agh.sr.zad4.gen.PatientPESEL parseFrom(
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
  public static Builder newBuilder(agh.sr.zad4.gen.PatientPESEL prototype) {
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
   * <pre>
   * OTHER
   * </pre>
   *
   * Protobuf type {@code hospital.PatientPESEL}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:hospital.PatientPESEL)
      agh.sr.zad4.gen.PatientPESELOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return agh.sr.zad4.gen.Hospital.internal_static_hospital_PatientPESEL_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return agh.sr.zad4.gen.Hospital.internal_static_hospital_PatientPESEL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              agh.sr.zad4.gen.PatientPESEL.class, agh.sr.zad4.gen.PatientPESEL.Builder.class);
    }

    // Construct using agh.sr.zad4.gen.PatientPESEL.newBuilder()
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
      pESEL_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return agh.sr.zad4.gen.Hospital.internal_static_hospital_PatientPESEL_descriptor;
    }

    public agh.sr.zad4.gen.PatientPESEL getDefaultInstanceForType() {
      return agh.sr.zad4.gen.PatientPESEL.getDefaultInstance();
    }

    public agh.sr.zad4.gen.PatientPESEL build() {
      agh.sr.zad4.gen.PatientPESEL result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public agh.sr.zad4.gen.PatientPESEL buildPartial() {
      agh.sr.zad4.gen.PatientPESEL result = new agh.sr.zad4.gen.PatientPESEL(this);
      result.pESEL_ = pESEL_;
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
      if (other instanceof agh.sr.zad4.gen.PatientPESEL) {
        return mergeFrom((agh.sr.zad4.gen.PatientPESEL)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(agh.sr.zad4.gen.PatientPESEL other) {
      if (other == agh.sr.zad4.gen.PatientPESEL.getDefaultInstance()) return this;
      if (!other.getPESEL().isEmpty()) {
        pESEL_ = other.pESEL_;
        onChanged();
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
      agh.sr.zad4.gen.PatientPESEL parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (agh.sr.zad4.gen.PatientPESEL) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object pESEL_ = "";
    /**
     * <code>string PESEL = 1;</code>
     */
    public java.lang.String getPESEL() {
      java.lang.Object ref = pESEL_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pESEL_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string PESEL = 1;</code>
     */
    public com.google.protobuf.ByteString
        getPESELBytes() {
      java.lang.Object ref = pESEL_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pESEL_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string PESEL = 1;</code>
     */
    public Builder setPESEL(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pESEL_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string PESEL = 1;</code>
     */
    public Builder clearPESEL() {
      
      pESEL_ = getDefaultInstance().getPESEL();
      onChanged();
      return this;
    }
    /**
     * <code>string PESEL = 1;</code>
     */
    public Builder setPESELBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      pESEL_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:hospital.PatientPESEL)
  }

  // @@protoc_insertion_point(class_scope:hospital.PatientPESEL)
  private static final agh.sr.zad4.gen.PatientPESEL DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new agh.sr.zad4.gen.PatientPESEL();
  }

  public static agh.sr.zad4.gen.PatientPESEL getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PatientPESEL>
      PARSER = new com.google.protobuf.AbstractParser<PatientPESEL>() {
    public PatientPESEL parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new PatientPESEL(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PatientPESEL> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PatientPESEL> getParserForType() {
    return PARSER;
  }

  public agh.sr.zad4.gen.PatientPESEL getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

