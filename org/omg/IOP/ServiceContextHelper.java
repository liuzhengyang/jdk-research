package org.omg.IOP;


/**
* org/omg/IOP/ServiceContextHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../../src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Thursday, December 18, 2014 4:24:03 PM PST
*/

abstract public class ServiceContextHelper
{
  private static String  _id = "IDL:omg.org/IOP/ServiceContext:1.0";

  public static void insert (org.omg.CORBA.Any a, org.omg.IOP.ServiceContext that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.omg.IOP.ServiceContext extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [2];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_ulong);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (org.omg.IOP.ServiceIdHelper.id (), "ServiceId", _tcOf_members0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "context_id",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_octet);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "context_data",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (org.omg.IOP.ServiceContextHelper.id (), "ServiceContext", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.omg.IOP.ServiceContext read (org.omg.CORBA.portable.InputStream istream)
  {
    org.omg.IOP.ServiceContext value = new org.omg.IOP.ServiceContext ();
    value.context_id = istream.read_ulong ();
    int _len0 = istream.read_long ();
    value.context_data = new byte[_len0];
    istream.read_octet_array (value.context_data, 0, _len0);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.omg.IOP.ServiceContext value)
  {
    ostream.write_ulong (value.context_id);
    ostream.write_long (value.context_data.length);
    ostream.write_octet_array (value.context_data, 0, value.context_data.length);
  }

}