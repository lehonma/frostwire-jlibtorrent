/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class external_ip_alert extends alert {
  private transient long swigCPtr;

  protected external_ip_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.external_ip_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(external_ip_alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_external_ip_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public int type() {
    return libtorrent_jni.external_ip_alert_type(swigCPtr, this);
  }

  public int category() {
    return libtorrent_jni.external_ip_alert_category(swigCPtr, this);
  }

  public String what() {
    return libtorrent_jni.external_ip_alert_what(swigCPtr, this);
  }

  public String message() {
    return libtorrent_jni.external_ip_alert_message(swigCPtr, this);
  }

  public address getExternal_address() {
    long cPtr = libtorrent_jni.external_ip_alert_external_address_get(swigCPtr, this);
    return (cPtr == 0) ? null : new address(cPtr, false);
  }

  public final static int priority = libtorrent_jni.external_ip_alert_priority_get();
  public final static int alert_type = libtorrent_jni.external_ip_alert_alert_type_get();
  public final static int static_category = libtorrent_jni.external_ip_alert_static_category_get();
}
