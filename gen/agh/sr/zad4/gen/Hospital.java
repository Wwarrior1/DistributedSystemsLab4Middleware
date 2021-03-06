// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Hospital.proto

package agh.sr.zad4.gen;

public final class Hospital {
  private Hospital() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hospital_Patient_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hospital_Patient_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hospital_Examination_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hospital_Examination_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hospital_Parameter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hospital_Parameter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hospital_SimpleResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hospital_SimpleResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hospital_Examinations_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hospital_Examinations_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hospital_PatientPESEL_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hospital_PatientPESEL_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hospital_Patients_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hospital_Patients_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hospital_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hospital_Empty_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016Hospital.proto\022\010hospital\"S\n\007Patient\022\r\n" +
      "\005PESEL\030\001 \001(\t\022\014\n\004name\030\002 \001(\t\022+\n\014examinatio" +
      "ns\030\003 \003(\0132\025.hospital.Examination\"\327\001\n\013Exam" +
      "ination\022\r\n\005PESEL\030\001 \001(\t\022\020\n\010doctorId\030\002 \001(\005" +
      "\022\022\n\ndateDoctor\030\003 \001(\t\022\017\n\007dateLab\030\004 \001(\t\022\'\n" +
      "\nparameters\030\005 \003(\0132\023.hospital.Parameter\0224" +
      "\n\nstatusCode\030\006 \001(\0162 .hospital.Examinatio" +
      "n.StatusCode\"#\n\nStatusCode\022\013\n\007PENDING\020\000\022" +
      "\010\n\004DONE\020\001\"Z\n\tParameter\022\014\n\004name\030\001 \001(\t\022\014\n\004" +
      "unit\030\002 \001(\t\022\r\n\005value\030\003 \001(\002\022\020\n\010minValue\030\004 ",
      "\001(\002\022\020\n\010maxValue\030\005 \001(\002\"w\n\016SimpleResponse\022" +
      "7\n\nstatusCode\030\001 \001(\0162#.hospital.SimpleRes" +
      "ponse.StatusCode\022\013\n\003msg\030\002 \001(\t\"\037\n\nStatusC" +
      "ode\022\006\n\002OK\020\000\022\t\n\005ERROR\020\001\"\275\001\n\014Examinations\022" +
      "5\n\nstatusCode\030\001 \001(\0162!.hospital.Examinati" +
      "ons.StatusCode\022\"\n\007patient\030\002 \001(\0132\021.hospit" +
      "al.Patient\022*\n\013examination\030\003 \001(\0132\025.hospit" +
      "al.Examination\"&\n\nStatusCode\022\t\n\005FOUND\020\000\022" +
      "\r\n\tNOT_FOUND\020\001\"\035\n\014PatientPESEL\022\r\n\005PESEL\030" +
      "\001 \001(\t\"\211\001\n\010Patients\0221\n\nstatusCode\030\001 \001(\0162\035",
      ".hospital.Patients.StatusCode\022\"\n\007patient" +
      "\030\002 \001(\0132\021.hospital.Patient\"&\n\nStatusCode\022" +
      "\t\n\005FOUND\020\000\022\r\n\tNOT_FOUND\020\001\"\007\n\005Empty2P\n\rPa" +
      "tientSerice\022?\n\013findPatient\022\026.hospital.Pa" +
      "tientPESEL\032\026.hospital.Examinations0\0012\321\002\n" +
      "\rDoctorService\0225\n\014findPatients\022\017.hospita" +
      "l.Empty\032\022.hospital.Patients0\001\022D\n\020findExa" +
      "minations\022\026.hospital.PatientPESEL\032\026.hosp" +
      "ital.Examinations0\001\022@\n\023findExaminationsA" +
      "ll\022\017.hospital.Empty\032\026.hospital.Examinati",
      "ons0\001\022<\n\rcreatePatient\022\021.hospital.Patien" +
      "t\032\030.hospital.SimpleResponse\022C\n\020orderExam" +
      "ination\022\025.hospital.Examination\032\030.hospita" +
      "l.SimpleResponse2I\n\nLabService\022;\n\016AddExa" +
      "mination\022\017.hospital.Empty\032\030.hospital.Sim" +
      "pleResponseB\023\n\017agh.sr.zad4.genP\001b\006proto3"
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
    internal_static_hospital_Patient_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_hospital_Patient_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hospital_Patient_descriptor,
        new java.lang.String[] { "PESEL", "Name", "Examinations", });
    internal_static_hospital_Examination_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_hospital_Examination_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hospital_Examination_descriptor,
        new java.lang.String[] { "PESEL", "DoctorId", "DateDoctor", "DateLab", "Parameters", "StatusCode", });
    internal_static_hospital_Parameter_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_hospital_Parameter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hospital_Parameter_descriptor,
        new java.lang.String[] { "Name", "Unit", "Value", "MinValue", "MaxValue", });
    internal_static_hospital_SimpleResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_hospital_SimpleResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hospital_SimpleResponse_descriptor,
        new java.lang.String[] { "StatusCode", "Msg", });
    internal_static_hospital_Examinations_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_hospital_Examinations_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hospital_Examinations_descriptor,
        new java.lang.String[] { "StatusCode", "Patient", "Examination", });
    internal_static_hospital_PatientPESEL_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_hospital_PatientPESEL_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hospital_PatientPESEL_descriptor,
        new java.lang.String[] { "PESEL", });
    internal_static_hospital_Patients_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_hospital_Patients_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hospital_Patients_descriptor,
        new java.lang.String[] { "StatusCode", "Patient", });
    internal_static_hospital_Empty_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_hospital_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hospital_Empty_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
