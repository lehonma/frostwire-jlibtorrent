/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class web_connection_base extends peer_connection {
  private long swigCPtr;
  private boolean swigCMemOwnDerived;

  protected web_connection_base(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.web_connection_base_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(web_connection_base obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        libtorrent_jni.delete_web_connection_base(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public int timeout() {
    return libtorrent_jni.web_connection_base_timeout(swigCPtr, this);
  }

  public void start() {
    libtorrent_jni.web_connection_base_start(swigCPtr, this);
  }

  public void on_sent(error_code error, long bytes_transferred) {
    libtorrent_jni.web_connection_base_on_sent(swigCPtr, this, error_code.getCPtr(error), error, bytes_transferred);
  }

  public String url() {
    return libtorrent_jni.web_connection_base_url(swigCPtr, this);
  }

  public boolean in_handshake() {
    return libtorrent_jni.web_connection_base_in_handshake(swigCPtr, this);
  }

  public void write_choke() {
    libtorrent_jni.web_connection_base_write_choke(swigCPtr, this);
  }

  public void write_unchoke() {
    libtorrent_jni.web_connection_base_write_unchoke(swigCPtr, this);
  }

  public void write_interested() {
    libtorrent_jni.web_connection_base_write_interested(swigCPtr, this);
  }

  public void write_not_interested() {
    libtorrent_jni.web_connection_base_write_not_interested(swigCPtr, this);
  }

  public void write_request(peer_request arg0) {
    libtorrent_jni.web_connection_base_write_request(swigCPtr, this, peer_request.getCPtr(arg0), arg0);
  }

  public void write_cancel(peer_request arg0) {
    libtorrent_jni.web_connection_base_write_cancel(swigCPtr, this, peer_request.getCPtr(arg0), arg0);
  }

  public void write_have(int arg0) {
    libtorrent_jni.web_connection_base_write_have(swigCPtr, this, arg0);
  }

  public void write_dont_have(int arg0) {
    libtorrent_jni.web_connection_base_write_dont_have(swigCPtr, this, arg0);
  }

  public void write_piece(peer_request arg0, disk_buffer_holder arg1) {
    libtorrent_jni.web_connection_base_write_piece(swigCPtr, this, peer_request.getCPtr(arg0), arg0, disk_buffer_holder.getCPtr(arg1), arg1);
  }

  public void write_keepalive() {
    libtorrent_jni.web_connection_base_write_keepalive(swigCPtr, this);
  }

  public void on_connected() {
    libtorrent_jni.web_connection_base_on_connected(swigCPtr, this);
  }

  public void write_reject_request(peer_request arg0) {
    libtorrent_jni.web_connection_base_write_reject_request(swigCPtr, this, peer_request.getCPtr(arg0), arg0);
  }

  public void write_allow_fast(int arg0) {
    libtorrent_jni.web_connection_base_write_allow_fast(swigCPtr, this, arg0);
  }

  public void write_suggest(int arg0) {
    libtorrent_jni.web_connection_base_write_suggest(swigCPtr, this, arg0);
  }

  public void write_bitfield() {
    libtorrent_jni.web_connection_base_write_bitfield(swigCPtr, this);
  }

  public void get_specific_peer_info(peer_info p) {
    libtorrent_jni.web_connection_base_get_specific_peer_info(swigCPtr, this, peer_info.getCPtr(p), p);
  }

}
