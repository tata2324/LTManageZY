// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: employee/employee.service.proto

package com.ljzn.grpc.employee;

public interface EmployeeDataApplyResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:VisitorSystem_cq.EmployeeDataApplyResponse)
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
   *返回当前版本下的所有员工信息
   * </pre>
   *
   * <code>repeated .VisitorSystem_cq.EmployeeMessage employeeMessages = 5;</code>
   */
  java.util.List<com.ljzn.grpc.employee.EmployeeMessage> 
      getEmployeeMessagesList();
  /**
   * <pre>
   *返回当前版本下的所有员工信息
   * </pre>
   *
   * <code>repeated .VisitorSystem_cq.EmployeeMessage employeeMessages = 5;</code>
   */
  com.ljzn.grpc.employee.EmployeeMessage getEmployeeMessages(int index);
  /**
   * <pre>
   *返回当前版本下的所有员工信息
   * </pre>
   *
   * <code>repeated .VisitorSystem_cq.EmployeeMessage employeeMessages = 5;</code>
   */
  int getEmployeeMessagesCount();
  /**
   * <pre>
   *返回当前版本下的所有员工信息
   * </pre>
   *
   * <code>repeated .VisitorSystem_cq.EmployeeMessage employeeMessages = 5;</code>
   */
  java.util.List<? extends com.ljzn.grpc.employee.EmployeeMessageOrBuilder> 
      getEmployeeMessagesOrBuilderList();
  /**
   * <pre>
   *返回当前版本下的所有员工信息
   * </pre>
   *
   * <code>repeated .VisitorSystem_cq.EmployeeMessage employeeMessages = 5;</code>
   */
  com.ljzn.grpc.employee.EmployeeMessageOrBuilder getEmployeeMessagesOrBuilder(
      int index);
}