// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CloudDisk.proto

package cn.iamding.drpc.rpc;

/**
 * Protobuf type {@code RPCUploadFileRequest}
 */
public final class RPCUploadFileRequest extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:RPCUploadFileRequest)
        RPCUploadFileRequestOrBuilder {
    // Use RPCUploadFileRequest.newBuilder() to construct.
    private RPCUploadFileRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private RPCUploadFileRequest() {
        content_ = com.google.protobuf.ByteString.EMPTY;
        fileType_ = "";
        shareType_ = "";
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private RPCUploadFileRequest(
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

                        content_ = input.readBytes();
                        break;
                    }
                    case 18: {
                        String s = input.readStringRequireUtf8();

                        fileType_ = s;
                        break;
                    }
                    case 26: {
                        String s = input.readStringRequireUtf8();

                        shareType_ = s;
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
        return CloudDiskProto.internal_static_RPCUploadFileRequest_descriptor;
    }

    protected FieldAccessorTable
    internalGetFieldAccessorTable() {
        return CloudDiskProto.internal_static_RPCUploadFileRequest_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        RPCUploadFileRequest.class, RPCUploadFileRequest.Builder.class);
    }

    public static final int CONTENT_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString content_;

    /**
     * <code>bytes content = 1;</code>
     */
    public com.google.protobuf.ByteString getContent() {
        return content_;
    }

    public static final int FILETYPE_FIELD_NUMBER = 2;
    private volatile Object fileType_;

    /**
     * <code>string fileType = 2;</code>
     */
    public String getFileType() {
        Object ref = fileType_;
        if (ref instanceof String) {
            return (String) ref;
        } else {
            com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
            String s = bs.toStringUtf8();
            fileType_ = s;
            return s;
        }
    }

    /**
     * <code>string fileType = 2;</code>
     */
    public com.google.protobuf.ByteString
    getFileTypeBytes() {
        Object ref = fileType_;
        if (ref instanceof String) {
            com.google.protobuf.ByteString b =
                    com.google.protobuf.ByteString.copyFromUtf8(
                            (String) ref);
            fileType_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    public static final int SHARETYPE_FIELD_NUMBER = 3;
    private volatile Object shareType_;

    /**
     * <code>string shareType = 3;</code>
     */
    public String getShareType() {
        Object ref = shareType_;
        if (ref instanceof String) {
            return (String) ref;
        } else {
            com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
            String s = bs.toStringUtf8();
            shareType_ = s;
            return s;
        }
    }

    /**
     * <code>string shareType = 3;</code>
     */
    public com.google.protobuf.ByteString
    getShareTypeBytes() {
        Object ref = shareType_;
        if (ref instanceof String) {
            com.google.protobuf.ByteString b =
                    com.google.protobuf.ByteString.copyFromUtf8(
                            (String) ref);
            shareType_ = b;
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
        if (!content_.isEmpty()) {
            output.writeBytes(1, content_);
        }
        if (!getFileTypeBytes().isEmpty()) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 2, fileType_);
        }
        if (!getShareTypeBytes().isEmpty()) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 3, shareType_);
        }
    }

    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (!content_.isEmpty()) {
            size += com.google.protobuf.CodedOutputStream
                    .computeBytesSize(1, content_);
        }
        if (!getFileTypeBytes().isEmpty()) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, fileType_);
        }
        if (!getShareTypeBytes().isEmpty()) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, shareType_);
        }
        memoizedSize = size;
        return size;
    }

    private static final long serialVersionUID = 0L;

    @Override
    public boolean equals(final Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RPCUploadFileRequest)) {
            return super.equals(obj);
        }
        RPCUploadFileRequest other = (RPCUploadFileRequest) obj;

        boolean result = true;
        result = result && getContent()
                .equals(other.getContent());
        result = result && getFileType()
                .equals(other.getFileType());
        result = result && getShareType()
                .equals(other.getShareType());
        return result;
    }

    @Override
    public int hashCode() {
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        hash = (37 * hash) + CONTENT_FIELD_NUMBER;
        hash = (53 * hash) + getContent().hashCode();
        hash = (37 * hash) + FILETYPE_FIELD_NUMBER;
        hash = (53 * hash) + getFileType().hashCode();
        hash = (37 * hash) + SHARETYPE_FIELD_NUMBER;
        hash = (53 * hash) + getShareType().hashCode();
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static RPCUploadFileRequest parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static RPCUploadFileRequest parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static RPCUploadFileRequest parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static RPCUploadFileRequest parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static RPCUploadFileRequest parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static RPCUploadFileRequest parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static RPCUploadFileRequest parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static RPCUploadFileRequest parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static RPCUploadFileRequest parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static RPCUploadFileRequest parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static RPCUploadFileRequest parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static RPCUploadFileRequest parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(RPCUploadFileRequest prototype) {
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
     * Protobuf type {@code RPCUploadFileRequest}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:RPCUploadFileRequest)
            RPCUploadFileRequestOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return CloudDiskProto.internal_static_RPCUploadFileRequest_descriptor;
        }

        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return CloudDiskProto.internal_static_RPCUploadFileRequest_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            RPCUploadFileRequest.class, RPCUploadFileRequest.Builder.class);
        }

        // Construct using com.iqiyi.hotchat.cloud.RPCUploadFileRequest.newBuilder()
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
            content_ = com.google.protobuf.ByteString.EMPTY;

            fileType_ = "";

            shareType_ = "";

            return this;
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return CloudDiskProto.internal_static_RPCUploadFileRequest_descriptor;
        }

        public RPCUploadFileRequest getDefaultInstanceForType() {
            return RPCUploadFileRequest.getDefaultInstance();
        }

        public RPCUploadFileRequest build() {
            RPCUploadFileRequest result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public RPCUploadFileRequest buildPartial() {
            RPCUploadFileRequest result = new RPCUploadFileRequest(this);
            result.content_ = content_;
            result.fileType_ = fileType_;
            result.shareType_ = shareType_;
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
            if (other instanceof RPCUploadFileRequest) {
                return mergeFrom((RPCUploadFileRequest) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(RPCUploadFileRequest other) {
            if (other == RPCUploadFileRequest.getDefaultInstance()) return this;
            if (other.getContent() != com.google.protobuf.ByteString.EMPTY) {
                setContent(other.getContent());
            }
            if (!other.getFileType().isEmpty()) {
                fileType_ = other.fileType_;
                onChanged();
            }
            if (!other.getShareType().isEmpty()) {
                shareType_ = other.shareType_;
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
            RPCUploadFileRequest parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (RPCUploadFileRequest) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private com.google.protobuf.ByteString content_ = com.google.protobuf.ByteString.EMPTY;

        /**
         * <code>bytes content = 1;</code>
         */
        public com.google.protobuf.ByteString getContent() {
            return content_;
        }

        /**
         * <code>bytes content = 1;</code>
         */
        public Builder setContent(com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }

            content_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>bytes content = 1;</code>
         */
        public Builder clearContent() {

            content_ = getDefaultInstance().getContent();
            onChanged();
            return this;
        }

        private Object fileType_ = "";

        /**
         * <code>string fileType = 2;</code>
         */
        public String getFileType() {
            Object ref = fileType_;
            if (!(ref instanceof String)) {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                fileType_ = s;
                return s;
            } else {
                return (String) ref;
            }
        }

        /**
         * <code>string fileType = 2;</code>
         */
        public com.google.protobuf.ByteString
        getFileTypeBytes() {
            Object ref = fileType_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                fileType_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string fileType = 2;</code>
         */
        public Builder setFileType(
                String value) {
            if (value == null) {
                throw new NullPointerException();
            }

            fileType_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>string fileType = 2;</code>
         */
        public Builder clearFileType() {

            fileType_ = getDefaultInstance().getFileType();
            onChanged();
            return this;
        }

        /**
         * <code>string fileType = 2;</code>
         */
        public Builder setFileTypeBytes(
                com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);

            fileType_ = value;
            onChanged();
            return this;
        }

        private Object shareType_ = "";

        /**
         * <code>string shareType = 3;</code>
         */
        public String getShareType() {
            Object ref = shareType_;
            if (!(ref instanceof String)) {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                shareType_ = s;
                return s;
            } else {
                return (String) ref;
            }
        }

        /**
         * <code>string shareType = 3;</code>
         */
        public com.google.protobuf.ByteString
        getShareTypeBytes() {
            Object ref = shareType_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                shareType_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string shareType = 3;</code>
         */
        public Builder setShareType(
                String value) {
            if (value == null) {
                throw new NullPointerException();
            }

            shareType_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>string shareType = 3;</code>
         */
        public Builder clearShareType() {

            shareType_ = getDefaultInstance().getShareType();
            onChanged();
            return this;
        }

        /**
         * <code>string shareType = 3;</code>
         */
        public Builder setShareTypeBytes(
                com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);

            shareType_ = value;
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


        // @@protoc_insertion_point(builder_scope:RPCUploadFileRequest)
    }

    // @@protoc_insertion_point(class_scope:RPCUploadFileRequest)
    private static final RPCUploadFileRequest DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new RPCUploadFileRequest();
    }

    public static RPCUploadFileRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RPCUploadFileRequest>
            PARSER = new com.google.protobuf.AbstractParser<RPCUploadFileRequest>() {
        public RPCUploadFileRequest parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return new RPCUploadFileRequest(input, extensionRegistry);
        }
    };

    public static com.google.protobuf.Parser<RPCUploadFileRequest> parser() {
        return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<RPCUploadFileRequest> getParserForType() {
        return PARSER;
    }

    public RPCUploadFileRequest getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}

