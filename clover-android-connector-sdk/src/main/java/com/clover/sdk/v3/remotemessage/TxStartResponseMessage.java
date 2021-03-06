/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


/*
 * Copyright (C) 2016 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clover.sdk.v3.remotemessage;

import com.clover.sdk.GenericClient;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getSuccess success}</li>
 * <li>{@link #getOrder order}</li>
 * <li>{@link #getExternalPaymentId externalPaymentId}</li>
 * <li>{@link #getResult result}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class TxStartResponseMessage extends com.clover.sdk.v3.remotemessage.Message {

  /**
   * Deprecated
   */
  public java.lang.Boolean getSuccess() {
    return genClient.cacheGet(CacheKey.success);
  }

  /**
   * The order
   */
  public com.clover.sdk.v3.order.Order getOrder() {
    return genClient.cacheGet(CacheKey.order);
  }

  /**
   * The external id provided in the initiating pay intent
   */
  public java.lang.String getExternalPaymentId() {
    return genClient.cacheGet(CacheKey.externalPaymentId);
  }

  public com.clover.sdk.v3.remotemessage.TxStartResponseResult getResult() {
    return genClient.cacheGet(CacheKey.result);
  }

  /**
   * The list of message types
   */
  @Override
  public com.clover.sdk.v3.remotemessage.Method getMethod() {
    return genClient.cacheGet(CacheKey.method);
  }

  /**
   * The version of this message
   */
  @Override
  public java.lang.Integer getVersion() {
    return genClient.cacheGet(CacheKey.version);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<TxStartResponseMessage> {
    success {
      @Override
      public Object extractValue(TxStartResponseMessage instance) {
        return instance.genClient.extractOther("success", java.lang.Boolean.class);
      }
    },
    order {
      @Override
      public Object extractValue(TxStartResponseMessage instance) {
        return instance.genClient.extractRecord("order", com.clover.sdk.v3.order.Order.JSON_CREATOR);
      }
    },
    externalPaymentId {
      @Override
      public Object extractValue(TxStartResponseMessage instance) {
        return instance.genClient.extractOther("externalPaymentId", java.lang.String.class);
      }
    },
    result {
      @Override
      public Object extractValue(TxStartResponseMessage instance) {
        return instance.genClient.extractEnum("result", com.clover.sdk.v3.remotemessage.TxStartResponseResult.class);
      }
    },
    method {
      @Override
      public Object extractValue(TxStartResponseMessage instance) {
        return instance.genClient.extractEnum("method", com.clover.sdk.v3.remotemessage.Method.class);
      }
    },
    version {
      @Override
      public Object extractValue(TxStartResponseMessage instance) {
        return instance.genClient.extractOther("version", java.lang.Integer.class);
      }
    },
      ;
  }

  private GenericClient<TxStartResponseMessage> genClient;

  /**
  * Constructs a new empty instance.
  */
  public TxStartResponseMessage() {
    super(false);
    genClient = new GenericClient<TxStartResponseMessage>(this);
    this.setMethod(com.clover.sdk.v3.remotemessage.Method.TX_START_RESPONSE);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
  * Constructs a new empty instance.
  */
  protected TxStartResponseMessage(boolean noInit) {
    super(false);
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public TxStartResponseMessage(String json) throws IllegalArgumentException {
    this();
    try {
      genClient.setJsonObject(new org.json.JSONObject(json));
    } catch (org.json.JSONException e) {
      throw new IllegalArgumentException("invalid json", e);
    }
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public TxStartResponseMessage(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public TxStartResponseMessage(TxStartResponseMessage src) {
    this();
    if (src.genClient.getJsonObject() != null) {
      genClient.setJsonObject(com.clover.sdk.v3.JsonHelper.deepCopy(src.genClient.getJSONObject()));
    }
  }

  /**
   * Returns the internal JSONObject backing this instance, the return value is not a copy so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public org.json.JSONObject getJSONObject() {
    return genClient.getJSONObject();
  }

  @Override
  public void validate() {
  }

  /** Checks whether the 'success' field is set and is not null */
  public boolean isNotNullSuccess() {
    return genClient.cacheValueIsNotNull(CacheKey.success);
  }

  /** Checks whether the 'order' field is set and is not null */
  public boolean isNotNullOrder() {
    return genClient.cacheValueIsNotNull(CacheKey.order);
  }

  /** Checks whether the 'externalPaymentId' field is set and is not null */
  public boolean isNotNullExternalPaymentId() {
    return genClient.cacheValueIsNotNull(CacheKey.externalPaymentId);
  }

  /** Checks whether the 'result' field is set and is not null */
  public boolean isNotNullResult() {
    return genClient.cacheValueIsNotNull(CacheKey.result);
  }

  /** Checks whether the 'method' field is set and is not null */
  @Override
  public boolean isNotNullMethod() {
    return genClient.cacheValueIsNotNull(CacheKey.method);
  }

  /** Checks whether the 'version' field is set and is not null */
  @Override
  public boolean isNotNullVersion() {
    return genClient.cacheValueIsNotNull(CacheKey.version);
  }



  /** Checks whether the 'success' field has been set, however the value could be null */
  public boolean hasSuccess() {
    return genClient.cacheHasKey(CacheKey.success);
  }

  /** Checks whether the 'order' field has been set, however the value could be null */
  public boolean hasOrder() {
    return genClient.cacheHasKey(CacheKey.order);
  }

  /** Checks whether the 'externalPaymentId' field has been set, however the value could be null */
  public boolean hasExternalPaymentId() {
    return genClient.cacheHasKey(CacheKey.externalPaymentId);
  }

  /** Checks whether the 'result' field has been set, however the value could be null */
  public boolean hasResult() {
    return genClient.cacheHasKey(CacheKey.result);
  }

  /** Checks whether the 'method' field has been set, however the value could be null */
  @Override
  public boolean hasMethod() {
    return genClient.cacheHasKey(CacheKey.method);
  }

  /** Checks whether the 'version' field has been set, however the value could be null */
  @Override
  public boolean hasVersion() {
    return genClient.cacheHasKey(CacheKey.version);
  }


  /**
   * Sets the field 'success'.
   */
  public TxStartResponseMessage setSuccess(java.lang.Boolean success) {
    return genClient.setOther(success, CacheKey.success);
  }

  /**
   * Sets the field 'order'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public TxStartResponseMessage setOrder(com.clover.sdk.v3.order.Order order) {
    return genClient.setRecord(order, CacheKey.order);
  }

  /**
   * Sets the field 'externalPaymentId'.
   */
  public TxStartResponseMessage setExternalPaymentId(java.lang.String externalPaymentId) {
    return genClient.setOther(externalPaymentId, CacheKey.externalPaymentId);
  }

  /**
   * Sets the field 'result'.
   */
  public TxStartResponseMessage setResult(com.clover.sdk.v3.remotemessage.TxStartResponseResult result) {
    return genClient.setOther(result, CacheKey.result);
  }

  /**
   * Sets the field 'method'.
   */
  @Override
  public Message setMethod(com.clover.sdk.v3.remotemessage.Method method) {
    return genClient.setOther(method, CacheKey.method);
  }

  /**
   * Sets the field 'version'.
   */
  @Override
  public Message setVersion(java.lang.Integer version) {
    return genClient.setOther(version, CacheKey.version);
  }


  /** Clears the 'success' field, the 'has' method for this field will now return false */
  public void clearSuccess() {
    genClient.clear(CacheKey.success);
  }
  /** Clears the 'order' field, the 'has' method for this field will now return false */
  public void clearOrder() {
    genClient.clear(CacheKey.order);
  }
  /** Clears the 'externalPaymentId' field, the 'has' method for this field will now return false */
  public void clearExternalPaymentId() {
    genClient.clear(CacheKey.externalPaymentId);
  }
  /** Clears the 'result' field, the 'has' method for this field will now return false */
  public void clearResult() {
    genClient.clear(CacheKey.result);
  }
  /** Clears the 'method' field, the 'has' method for this field will now return false */
  @Override
  public void clearMethod() {
    genClient.clear(CacheKey.method);
  }
  /** Clears the 'version' field, the 'has' method for this field will now return false */
  @Override
  public void clearVersion() {
    genClient.clear(CacheKey.version);
  }


  /**
   * Returns true if this instance has any changes.
   */
  public boolean containsChanges() {
    return genClient.containsChanges();
  }

  /**
   * Reset the log of changes made to this instance, calling copyChanges() after this would return an empty instance.
   */
  public void resetChangeLog() {
    genClient.resetChangeLog();
  }

  /**
   * Create a copy of this instance that contains only fields that were set after the constructor was called.
   */
  public TxStartResponseMessage copyChanges() {
    TxStartResponseMessage copy = new TxStartResponseMessage();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(TxStartResponseMessage src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new TxStartResponseMessage(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<TxStartResponseMessage> CREATOR = new android.os.Parcelable.Creator<TxStartResponseMessage>() {
    @Override
    public TxStartResponseMessage createFromParcel(android.os.Parcel in) {
      TxStartResponseMessage instance = new TxStartResponseMessage(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public TxStartResponseMessage[] newArray(int size) {
      return new TxStartResponseMessage[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<TxStartResponseMessage> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<TxStartResponseMessage>() {
    @Override
    public TxStartResponseMessage create(org.json.JSONObject jsonObject) {
      return new TxStartResponseMessage(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean SUCCESS_IS_REQUIRED = false;
    public static final boolean ORDER_IS_REQUIRED = false;
    public static final boolean EXTERNALPAYMENTID_IS_REQUIRED = false;
    public static final boolean RESULT_IS_REQUIRED = false;
    public static final boolean METHOD_IS_REQUIRED = false;
    public static final boolean VERSION_IS_REQUIRED = false;

  }

}
