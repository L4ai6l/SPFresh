/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class NodeDistPair {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected NodeDistPair(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NodeDistPair obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        JAVASPTAGJNI.delete_NodeDistPair(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setNode(int value) {
    JAVASPTAGJNI.NodeDistPair_node_set(swigCPtr, this, value);
  }

  public int getNode() {
    return JAVASPTAGJNI.NodeDistPair_node_get(swigCPtr, this);
  }

  public void setDistance(float value) {
    JAVASPTAGJNI.NodeDistPair_distance_set(swigCPtr, this, value);
  }

  public float getDistance() {
    return JAVASPTAGJNI.NodeDistPair_distance_get(swigCPtr, this);
  }

  public NodeDistPair(int _node, float _distance) {
    this(JAVASPTAGJNI.new_NodeDistPair__SWIG_0(_node, _distance), true);
  }

  public NodeDistPair(int _node) {
    this(JAVASPTAGJNI.new_NodeDistPair__SWIG_1(_node), true);
  }

  public NodeDistPair() {
    this(JAVASPTAGJNI.new_NodeDistPair__SWIG_2(), true);
  }

}