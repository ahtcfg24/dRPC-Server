// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StudentService.proto

package cn.iamding.drpc.client.rpc.student;

public final class StudentProto {
  private StudentProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Student_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Student_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SubmitResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SubmitResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024StudentService.proto\"@\n\007Student\022\014\n\004nam" +
      "e\030\001 \001(\t\022\013\n\003sex\030\002 \001(\t\022\013\n\003age\030\003 \001(\005\022\r\n\005pho" +
      "to\030\004 \001(\t\"A\n\014SubmitResult\022\014\n\004code\030\001 \001(\t\022\013" +
      "\n\003msg\030\002 \001(\t\022\026\n\004data\030\003 \001(\0132\010.Student2<\n\016S" +
      "tudentService\022*\n\rsubmitStudent\022\010.Student" +
      "\032\r.SubmitResult\"\000B>\n\"cn.iamding.drpc.cli" +
      "ent.rpc.studentB\014StudentProtoP\001\242\002\007Studen" +
      "tb\006proto3"
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
        }, assigner);
    internal_static_Student_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Student_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Student_descriptor,
        new java.lang.String[] { "Name", "Sex", "Age", "Photo", });
    internal_static_SubmitResult_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_SubmitResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SubmitResult_descriptor,
        new java.lang.String[] { "Code", "Msg", "Data", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
