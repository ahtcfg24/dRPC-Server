// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CloudDisk.proto

package cn.iamding.drpc.client.rpc.disk;

public interface RPCUploadFileResponseOrBuilder extends
        // @@protoc_insertion_point(interface_extends:RPCUploadFileResponse)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.RPCUploadFileResponse.UploadResult data = 1;</code>
     */
    boolean hasData();

    /**
     * <code>.RPCUploadFileResponse.UploadResult data = 1;</code>
     */
    RPCUploadFileResponse.UploadResult getData();

    /**
     * <code>.RPCUploadFileResponse.UploadResult data = 1;</code>
     */
    RPCUploadFileResponse.UploadResultOrBuilder getDataOrBuilder();

    /**
     * <code>string code = 2;</code>
     */
    String getCode();

    /**
     * <code>string code = 2;</code>
     */
    com.google.protobuf.ByteString
    getCodeBytes();

    /**
     * <code>string msg = 3;</code>
     */
    String getMsg();

    /**
     * <code>string msg = 3;</code>
     */
    com.google.protobuf.ByteString
    getMsgBytes();

    /**
     * <code>string UploadJsonResponse = 6;</code>
     */
    String getUploadJsonResponse();

    /**
     * <code>string UploadJsonResponse = 6;</code>
     */
    com.google.protobuf.ByteString
    getUploadJsonResponseBytes();
}
