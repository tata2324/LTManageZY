// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: client/client.service.proto

package com.ljzn.grpc.client;

public interface LoginRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:VisitorSystem_cq.LoginRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.VisitorSystem_cq.ClientMessage client = 1;</code>
   */
  boolean hasClient();
  /**
   * <code>.VisitorSystem_cq.ClientMessage client = 1;</code>
   */
  com.ljzn.grpc.client.ClientMessage getClient();
  /**
   * <code>.VisitorSystem_cq.ClientMessage client = 1;</code>
   */
  com.ljzn.grpc.client.ClientMessageOrBuilder getClientOrBuilder();

  /**
   * <pre>
   *设备编号的加盐MD5值，盐值由客户端与服务器端约定
   * </pre>
   *
   * <code>string client_secret = 2;</code>
   */
  java.lang.String getClientSecret();
  /**
   * <pre>
   *设备编号的加盐MD5值，盐值由客户端与服务器端约定
   * </pre>
   *
   * <code>string client_secret = 2;</code>
   */
  com.google.protobuf.ByteString
      getClientSecretBytes();

  /**
   * <code>int32 belongId = 3;</code>
   */
  int getBelongId();
}