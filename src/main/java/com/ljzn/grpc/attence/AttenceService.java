// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: attence/attence.service.proto

package com.ljzn.grpc.attence;

public final class AttenceService {
  private AttenceService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AttenceSystem_AttenceUploadDataRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AttenceSystem_AttenceUploadDataRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AttenceSystem_AttenceUploadDataResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AttenceSystem_AttenceUploadDataResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AttenceSystem_EmployeeInfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AttenceSystem_EmployeeInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AttenceSystem_EmployeeInfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AttenceSystem_EmployeeInfoResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AttenceSystem_EmployeeVersionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AttenceSystem_EmployeeVersionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AttenceSystem_EmployeeVersionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AttenceSystem_EmployeeVersionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AttenceSystem_getPhotoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AttenceSystem_getPhotoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AttenceSystem_getPhotoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AttenceSystem_getPhotoResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035attence/attence.service.proto\022\rAttence" +
      "System\032\035attence/attence.message.proto\"J\n" +
      "\030AttenceUploadDataRequest\022.\n\007attence\030\001 \001" +
      "(\0132\035.AttenceSystem.AttenceMessage\":\n\031Att" +
      "enceUploadDataResponse\022\014\n\004code\030\001 \001(\005\022\017\n\007" +
      "message\030\002 \001(\t\"&\n\023EmployeeInfoRequest\022\017\n\007" +
      "version\030\003 \001(\003\"h\n\024EmployeeInfoResponse\022\014\n" +
      "\004code\030\001 \001(\005\022\017\n\007message\030\002 \001(\t\0221\n\014employee" +
      "Info\030\004 \003(\0132\033.AttenceSystem.EmployeeInfo\"" +
      "-\n\026EmployeeVersionRequest\022\023\n\013versionName" +
      "\030\001 \001(\t\"*\n\027EmployeeVersionResponse\022\017\n\007ver" +
      "sion\030\001 \001(\003\"%\n\017getPhotoRequest\022\022\n\nemploye" +
      "eId\030\001 \001(\t\"!\n\020getPhotoResponse\022\r\n\005photo\030\001" +
      " \001(\0142\216\003\n\022AttenceAuthService\022d\n\rAttenceUp" +
      "load\022\'.AttenceSystem.AttenceUploadDataRe" +
      "quest\032(.AttenceSystem.AttenceUploadDataR" +
      "esponse\"\000\022\\\n\017GetEmployeeInfo\022\".AttenceSy" +
      "stem.EmployeeInfoRequest\032#.AttenceSystem" +
      ".EmployeeInfoResponse\"\000\022e\n\022GetEmployeeVe" +
      "rsion\022%.AttenceSystem.EmployeeVersionReq" +
      "uest\032&.AttenceSystem.EmployeeVersionResp" +
      "onse\"\000\022M\n\010GetPhoto\022\036.AttenceSystem.getPh" +
      "otoRequest\032\037.AttenceSystem.getPhotoRespo" +
      "nse\"\000B#\n\025com.ljzn.grpc.attenceP\001\242\002\007ATTEN" +
      "CEb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.ljzn.grpc.attence.AttenceMessageOuterClass.getDescriptor(),
        }, assigner);
    internal_static_AttenceSystem_AttenceUploadDataRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AttenceSystem_AttenceUploadDataRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AttenceSystem_AttenceUploadDataRequest_descriptor,
        new java.lang.String[] { "Attence", });
    internal_static_AttenceSystem_AttenceUploadDataResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_AttenceSystem_AttenceUploadDataResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AttenceSystem_AttenceUploadDataResponse_descriptor,
        new java.lang.String[] { "Code", "Message", });
    internal_static_AttenceSystem_EmployeeInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_AttenceSystem_EmployeeInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AttenceSystem_EmployeeInfoRequest_descriptor,
        new java.lang.String[] { "Version", });
    internal_static_AttenceSystem_EmployeeInfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_AttenceSystem_EmployeeInfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AttenceSystem_EmployeeInfoResponse_descriptor,
        new java.lang.String[] { "Code", "Message", "EmployeeInfo", });
    internal_static_AttenceSystem_EmployeeVersionRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_AttenceSystem_EmployeeVersionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AttenceSystem_EmployeeVersionRequest_descriptor,
        new java.lang.String[] { "VersionName", });
    internal_static_AttenceSystem_EmployeeVersionResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_AttenceSystem_EmployeeVersionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AttenceSystem_EmployeeVersionResponse_descriptor,
        new java.lang.String[] { "Version", });
    internal_static_AttenceSystem_getPhotoRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_AttenceSystem_getPhotoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AttenceSystem_getPhotoRequest_descriptor,
        new java.lang.String[] { "EmployeeId", });
    internal_static_AttenceSystem_getPhotoResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_AttenceSystem_getPhotoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AttenceSystem_getPhotoResponse_descriptor,
        new java.lang.String[] { "Photo", });
    com.ljzn.grpc.attence.AttenceMessageOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}