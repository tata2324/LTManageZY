// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blacklist/blacklist.service.proto

package com.ljzn.grpc.blacklist;

public interface BlacklistDataApplyResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:VisitorSystem_cq.BlacklistDataApplyResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 code = 1;</code>
   */
  int getCode();

  /**
   * <code>string message = 2;</code>
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 2;</code>
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>string server_secret = 3;</code>
   */
  java.lang.String getServerSecret();
  /**
   * <code>string server_secret = 3;</code>
   */
  com.google.protobuf.ByteString
      getServerSecretBytes();

  /**
   * <code>int64 serverVersion = 4;</code>
   */
  long getServerVersion();

  /**
   * <pre>
   *返回当前版本下的所有到访事由信息
   * </pre>
   *
   * <code>repeated .VisitorSystem_cq.BlacklistMessage blacklistreasonMessages = 5;</code>
   */
  java.util.List<com.ljzn.grpc.blacklist.BlacklistMessage> 
      getBlacklistreasonMessagesList();
  /**
   * <pre>
   *返回当前版本下的所有到访事由信息
   * </pre>
   *
   * <code>repeated .VisitorSystem_cq.BlacklistMessage blacklistreasonMessages = 5;</code>
   */
  com.ljzn.grpc.blacklist.BlacklistMessage getBlacklistreasonMessages(int index);
  /**
   * <pre>
   *返回当前版本下的所有到访事由信息
   * </pre>
   *
   * <code>repeated .VisitorSystem_cq.BlacklistMessage blacklistreasonMessages = 5;</code>
   */
  int getBlacklistreasonMessagesCount();
  /**
   * <pre>
   *返回当前版本下的所有到访事由信息
   * </pre>
   *
   * <code>repeated .VisitorSystem_cq.BlacklistMessage blacklistreasonMessages = 5;</code>
   */
  java.util.List<? extends com.ljzn.grpc.blacklist.BlacklistMessageOrBuilder> 
      getBlacklistreasonMessagesOrBuilderList();
  /**
   * <pre>
   *返回当前版本下的所有到访事由信息
   * </pre>
   *
   * <code>repeated .VisitorSystem_cq.BlacklistMessage blacklistreasonMessages = 5;</code>
   */
  com.ljzn.grpc.blacklist.BlacklistMessageOrBuilder getBlacklistreasonMessagesOrBuilder(
      int index);
}
