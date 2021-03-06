// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StudentService.proto

package cn.iamding.drpc.server.rpc.student;

/**
 * Protobuf type {@code SubmitResult}
 */
public  final class SubmitResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SubmitResult)
    SubmitResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SubmitResult.newBuilder() to construct.
  private SubmitResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SubmitResult() {
      code_ = 0;
      server_ = "";
  }

    @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SubmitResult(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
        throw new NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
            case 8: {

                code_ = input.readInt32();
            break;
          }
          case 18: {
              String s = input.readStringRequireUtf8();

              server_ = s;
            break;
          }
          case 26: {
              Student.Builder subBuilder = null;
            if (data_ != null) {
              subBuilder = data_.toBuilder();
            }
              data_ = input.readMessage(Student.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(data_);
              data_ = subBuilder.buildPartial();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
      return StudentProto.internal_static_SubmitResult_descriptor;
  }

    protected FieldAccessorTable
      internalGetFieldAccessorTable() {
        return StudentProto.internal_static_SubmitResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
                SubmitResult.class, Builder.class);
  }

  public static final int CODE_FIELD_NUMBER = 1;
    private int code_;
  /**
   * <code>int32 code = 1;</code>
   */
  public int getCode() {
      return code_;
  }

    public static final int SERVER_FIELD_NUMBER = 2;
    private volatile Object server_;
  /**
   * <code>string server = 2;</code>
   */
  public String getServer() {
      Object ref = server_;
      if (ref instanceof String) {
          return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          server_ = s;
      return s;
    }
  }
  /**
   * <code>string server = 2;</code>
   */
  public com.google.protobuf.ByteString
  getServerBytes() {
      Object ref = server_;
      if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          server_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATA_FIELD_NUMBER = 3;
    private Student data_;
  /**
   * <code>.Student data = 3;</code>
   */
  public boolean hasData() {
    return data_ != null;
  }
  /**
   * <code>.Student data = 3;</code>
   */
  public Student getData() {
      return data_ == null ? Student.getDefaultInstance() : data_;
  }
  /**
   * <code>.Student data = 3;</code>
   */
  public StudentOrBuilder getDataOrBuilder() {
    return getData();
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
      if (code_ != 0) {
          output.writeInt32(1, code_);
    }
      if (!getServerBytes().isEmpty()) {
          com.google.protobuf.GeneratedMessageV3.writeString(output, 2, server_);
    }
    if (data_ != null) {
      output.writeMessage(3, getData());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
      if (code_ != 0) {
          size += com.google.protobuf.CodedOutputStream
                  .computeInt32Size(1, code_);
    }
      if (!getServerBytes().isEmpty()) {
          size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, server_);
    }
    if (data_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getData());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

    @Override
    public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
        if (!(obj instanceof SubmitResult)) {
      return super.equals(obj);
    }
        SubmitResult other = (SubmitResult) obj;

    boolean result = true;
        result = result && (getCode()
                == other.getCode());
        result = result && getServer()
                .equals(other.getServer());
    result = result && (hasData() == other.hasData());
    if (hasData()) {
      result = result && getData()
          .equals(other.getData());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

    @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CODE_FIELD_NUMBER;
        hash = (53 * hash) + getCode();
        hash = (37 * hash) + SERVER_FIELD_NUMBER;
        hash = (53 * hash) + getServer().hashCode();
    if (hasData()) {
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getData().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

    public static SubmitResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

    public static SubmitResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

    public static SubmitResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

    public static SubmitResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

    public static SubmitResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

    public static SubmitResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

    public static SubmitResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

    public static SubmitResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

    public static SubmitResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

    public static SubmitResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }

    public static SubmitResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }

    public static SubmitResult parseFrom(
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

    public static Builder newBuilder(SubmitResult prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

    @Override
  protected Builder newBuilderForType(
            BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code SubmitResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SubmitResult)
          SubmitResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
        return StudentProto.internal_static_SubmitResult_descriptor;
    }

      protected FieldAccessorTable
        internalGetFieldAccessorTable() {
          return StudentProto.internal_static_SubmitResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
                  SubmitResult.class, Builder.class);
    }

      // Construct using cn.iamding.drpc.server.rpc.student.SubmitResult.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
            BuilderParent parent) {
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
        code_ = 0;

        server_ = "";

      if (dataBuilder_ == null) {
        data_ = null;
      } else {
        data_ = null;
        dataBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
        return StudentProto.internal_static_SubmitResult_descriptor;
    }

      public SubmitResult getDefaultInstanceForType() {
          return SubmitResult.getDefaultInstance();
    }

      public SubmitResult build() {
          SubmitResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

      public SubmitResult buildPartial() {
          SubmitResult result = new SubmitResult(this);
      result.code_ = code_;
          result.server_ = server_;
      if (dataBuilder_ == null) {
        result.data_ = data_;
      } else {
        result.data_ = dataBuilder_.build();
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
        if (other instanceof SubmitResult) {
            return mergeFrom((SubmitResult) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

      public Builder mergeFrom(SubmitResult other) {
          if (other == SubmitResult.getDefaultInstance()) return this;
          if (other.getCode() != 0) {
              setCode(other.getCode());
      }
          if (!other.getServer().isEmpty()) {
              server_ = other.server_;
        onChanged();
      }
      if (other.hasData()) {
        mergeData(other.getData());
      }
      this.mergeUnknownFields(other.unknownFields);
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
        SubmitResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SubmitResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

      private int code_;
    /**
     * <code>int32 code = 1;</code>
     */
    public int getCode() {
        return code_;
    }
    /**
     * <code>int32 code = 1;</code>
     */
    public Builder setCode(int value) {
      
      code_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 code = 1;</code>
     */
    public Builder clearCode() {

        code_ = 0;
      onChanged();
      return this;
    }

      private Object server_ = "";
    /**
     * <code>string server = 2;</code>
     */
    public String getServer() {
        Object ref = server_;
        if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
            String s = bs.toStringUtf8();
            server_ = s;
        return s;
      } else {
            return (String) ref;
      }
    }
    /**
     * <code>string server = 2;</code>
     */
    public com.google.protobuf.ByteString
    getServerBytes() {
        Object ref = server_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                    (String) ref);
          server_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string server = 2;</code>
     */
    public Builder setServer(
            String value) {
      if (value == null) {
    throw new NullPointerException();
  }

        server_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string server = 2;</code>
     */
    public Builder clearServer() {

        server_ = getDefaultInstance().getServer();
      onChanged();
      return this;
    }
    /**
     * <code>string server = 2;</code>
     */
    public Builder setServerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

        server_ = value;
      onChanged();
      return this;
    }

      private Student data_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
            Student, Student.Builder, StudentOrBuilder> dataBuilder_;
    /**
     * <code>.Student data = 3;</code>
     */
    public boolean hasData() {
      return dataBuilder_ != null || data_ != null;
    }
    /**
     * <code>.Student data = 3;</code>
     */
    public Student getData() {
      if (dataBuilder_ == null) {
          return data_ == null ? Student.getDefaultInstance() : data_;
      } else {
        return dataBuilder_.getMessage();
      }
    }
    /**
     * <code>.Student data = 3;</code>
     */
    public Builder setData(Student value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        data_ = value;
        onChanged();
      } else {
        dataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Student data = 3;</code>
     */
    public Builder setData(
            Student.Builder builderForValue) {
      if (dataBuilder_ == null) {
        data_ = builderForValue.build();
        onChanged();
      } else {
        dataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Student data = 3;</code>
     */
    public Builder mergeData(Student value) {
      if (dataBuilder_ == null) {
        if (data_ != null) {
          data_ =
                  Student.newBuilder(data_).mergeFrom(value).buildPartial();
        } else {
          data_ = value;
        }
        onChanged();
      } else {
        dataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Student data = 3;</code>
     */
    public Builder clearData() {
      if (dataBuilder_ == null) {
        data_ = null;
        onChanged();
      } else {
        data_ = null;
        dataBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Student data = 3;</code>
     */
    public Student.Builder getDataBuilder() {
      
      onChanged();
      return getDataFieldBuilder().getBuilder();
    }
    /**
     * <code>.Student data = 3;</code>
     */
    public StudentOrBuilder getDataOrBuilder() {
      if (dataBuilder_ != null) {
        return dataBuilder_.getMessageOrBuilder();
      } else {
        return data_ == null ?
                Student.getDefaultInstance() : data_;
      }
    }
    /**
     * <code>.Student data = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            Student, Student.Builder, StudentOrBuilder>
        getDataFieldBuilder() {
      if (dataBuilder_ == null) {
        dataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                Student, Student.Builder, StudentOrBuilder>(
                getData(),
                getParentForChildren(),
                isClean());
        data_ = null;
      }
      return dataBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:SubmitResult)
  }

  // @@protoc_insertion_point(class_scope:SubmitResult)
  private static final SubmitResult DEFAULT_INSTANCE;
  static {
      DEFAULT_INSTANCE = new SubmitResult();
  }

    public static SubmitResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubmitResult>
      PARSER = new com.google.protobuf.AbstractParser<SubmitResult>() {
    public SubmitResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SubmitResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SubmitResult> parser() {
    return PARSER;
  }

    @Override
  public com.google.protobuf.Parser<SubmitResult> getParserForType() {
    return PARSER;
  }

    public SubmitResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

