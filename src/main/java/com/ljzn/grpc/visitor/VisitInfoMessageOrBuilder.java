// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: visitor/visitor.message.proto

package com.ljzn.grpc.visitor;

public interface VisitInfoMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:VisitorSystem_cq.VisitInfoMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string visitId = 1;</code>
   */
  java.lang.String getVisitId();
  /**
   * <code>string visitId = 1;</code>
   */
  com.google.protobuf.ByteString
      getVisitIdBytes();

  /**
   * <code>int32 employeeId = 2;</code>
   */
  int getEmployeeId();

  /**
   * <code>string visitorId = 3;</code>
   */
  java.lang.String getVisitorId();
  /**
   * <code>string visitorId = 3;</code>
   */
  com.google.protobuf.ByteString
      getVisitorIdBytes();

  /**
   * <code>string visitorName = 4;</code>
   */
  java.lang.String getVisitorName();
  /**
   * <code>string visitorName = 4;</code>
   */
  com.google.protobuf.ByteString
      getVisitorNameBytes();

  /**
   * <code>int32 reasonId = 5;</code>
   */
  int getReasonId();

  /**
   * <code>bytes cameraPhoto = 6;</code>
   */
  com.google.protobuf.ByteString getCameraPhoto();

  /**
   * <code>string checkInDeviceId = 7;</code>
   */
  java.lang.String getCheckInDeviceId();
  /**
   * <code>string checkInDeviceId = 7;</code>
   */
  com.google.protobuf.ByteString
      getCheckInDeviceIdBytes();

  /**
   * <code>int64 checkInTime = 8;</code>
   */
  long getCheckInTime();

  /**
   * <code>string checkOutDeviceId = 9;</code>
   */
  java.lang.String getCheckOutDeviceId();
  /**
   * <code>string checkOutDeviceId = 9;</code>
   */
  com.google.protobuf.ByteString
      getCheckOutDeviceIdBytes();

  /**
   * <code>int64 checkOutTime = 10;</code>
   */
  long getCheckOutTime();

  /**
   * <code>int32 state = 11;</code>
   */
  int getState();

  /**
   * <code>string comment = 12;</code>
   */
  java.lang.String getComment();
  /**
   * <code>string comment = 12;</code>
   */
  com.google.protobuf.ByteString
      getCommentBytes();

  /**
   * <code>int32 action = 15;</code>
   */
  int getAction();

  /**
   * <code>int64 version = 16;</code>
   */
  long getVersion();

  /**
   * <code>int32 belongId = 17;</code>
   */
  int getBelongId();
}
