// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CloudDisk.proto

package cn.iamding.drpc.rpc;

public interface RPCUploadFileRequestOrBuilder extends
        // @@protoc_insertion_point(interface_extends:RPCUploadFileRequest)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bytes content = 1;</code>
     */
    com.google.protobuf.ByteString getContent();

    /**
     * <code>string fileType = 2;</code>
     */
    String getFileType();

    /**
     * <code>string fileType = 2;</code>
     */
    com.google.protobuf.ByteString
    getFileTypeBytes();

    /**
     * <code>string shareType = 3;</code>
     */
    String getShareType();

    /**
     * <code>string shareType = 3;</code>
     */
    com.google.protobuf.ByteString
    getShareTypeBytes();
}
