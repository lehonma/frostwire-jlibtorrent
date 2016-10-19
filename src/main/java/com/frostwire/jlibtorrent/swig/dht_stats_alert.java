/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class dht_stats_alert extends alert {
  private transient long swigCPtr;

  protected dht_stats_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.dht_stats_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(dht_stats_alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_dht_stats_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public int type() {
    return libtorrent_jni.dht_stats_alert_type(swigCPtr, this);
  }

  public int category() {
    return libtorrent_jni.dht_stats_alert_category(swigCPtr, this);
  }

  public String what() {
    return libtorrent_jni.dht_stats_alert_what(swigCPtr, this);
  }

  public String message() {
    return libtorrent_jni.dht_stats_alert_message(swigCPtr, this);
  }

  public dht_lookup_vector getActive_requests() {
    long cPtr = libtorrent_jni.dht_stats_alert_active_requests_get(swigCPtr, this);
    return (cPtr == 0) ? null : new dht_lookup_vector(cPtr, false);
  }

  public dht_routing_bucket_vector getRouting_table() {
    long cPtr = libtorrent_jni.dht_stats_alert_routing_table_get(swigCPtr, this);
    return (cPtr == 0) ? null : new dht_routing_bucket_vector(cPtr, false);
  }

  public final static int priority = libtorrent_jni.dht_stats_alert_priority_get();
  public final static int alert_type = libtorrent_jni.dht_stats_alert_alert_type_get();
  public final static int static_category = libtorrent_jni.dht_stats_alert_static_category_get();
}
