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

package com.clover.sdk.v3.apps;

import com.clover.sdk.GenericClient;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getId id}</li>
 * <li>{@link #getAmount amount}</li>
 * <li>{@link #getAction action}</li>
 * <li>{@link #getActive active}</li>
 * <li>{@link #getMeteredCountries meteredCountries}</li>
 * <li>{@link #getApp app}</li>
 * <li>{@link #getLabel label}</li>
 * </ul>
 */
@SuppressWarnings("all")
public final class AppMetered implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * Unique identifier
   */
  public java.lang.String getId() {
    return genClient.cacheGet(CacheKey.id);
  }

  /**
   * DEPRECATED: App metered amount. Instead use per country pricing in meteredCountries
   */
  public java.lang.Long getAmount() {
    return genClient.cacheGet(CacheKey.amount);
  }

  /**
   * DEPRECATED: App metered action. Instead use per country pricing in meteredCountries
   */
  public java.lang.String getAction() {
    return genClient.cacheGet(CacheKey.action);
  }

  /**
   * DEPRECATED: App metered active status. Instead use per country pricing in meteredCountries
   */
  public java.lang.Boolean getActive() {
    return genClient.cacheGet(CacheKey.active);
  }

  /**
   * Metered country options for this app metered
   */
  public java.util.List<com.clover.sdk.v3.apps.AppMeteredCountry> getMeteredCountries() {
    return genClient.cacheGet(CacheKey.meteredCountries);
  }

  /**
   * Reference to the app this metered belongs to
   */
  public com.clover.sdk.v3.base.Reference getApp() {
    return genClient.cacheGet(CacheKey.app);
  }

  /**
   * A label used to identify this metered action
   */
  public java.lang.String getLabel() {
    return genClient.cacheGet(CacheKey.label);
  }



  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<AppMetered> {
    id {
      @Override
      public Object extractValue(AppMetered instance) {
        return instance.genClient.extractOther("id", java.lang.String.class);
      }
    },
    amount {
      @Override
      public Object extractValue(AppMetered instance) {
        return instance.genClient.extractOther("amount", java.lang.Long.class);
      }
    },
    action {
      @Override
      public Object extractValue(AppMetered instance) {
        return instance.genClient.extractOther("action", java.lang.String.class);
      }
    },
    active {
      @Override
      public Object extractValue(AppMetered instance) {
        return instance.genClient.extractOther("active", java.lang.Boolean.class);
      }
    },
    meteredCountries {
      @Override
      public Object extractValue(AppMetered instance) {
        return instance.genClient.extractListRecord("meteredCountries", com.clover.sdk.v3.apps.AppMeteredCountry.JSON_CREATOR);
      }
    },
    app {
      @Override
      public Object extractValue(AppMetered instance) {
        return instance.genClient.extractRecord("app", com.clover.sdk.v3.base.Reference.JSON_CREATOR);
      }
    },
    label {
      @Override
      public Object extractValue(AppMetered instance) {
        return instance.genClient.extractOther("label", java.lang.String.class);
      }
    },
    ;
  }

  private GenericClient<AppMetered> genClient = new GenericClient<AppMetered>(this);

  /**
   * Constructs a new empty instance.
   */
  public AppMetered() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public AppMetered(String json) throws IllegalArgumentException {
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
  public AppMetered(org.json.JSONObject jsonObject) {
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public AppMetered(AppMetered src) {
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
    genClient.validateLength(getId(), 13);

    genClient.validateLength(getAction(), 40);

    genClient.validateLength(getLabel(), 20);
  }

  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return genClient.cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'amount' field is set and is not null */
  public boolean isNotNullAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.amount);
  }

  /** Checks whether the 'action' field is set and is not null */
  public boolean isNotNullAction() {
    return genClient.cacheValueIsNotNull(CacheKey.action);
  }

  /** Checks whether the 'active' field is set and is not null */
  public boolean isNotNullActive() {
    return genClient.cacheValueIsNotNull(CacheKey.active);
  }

  /** Checks whether the 'meteredCountries' field is set and is not null */
  public boolean isNotNullMeteredCountries() {
    return genClient.cacheValueIsNotNull(CacheKey.meteredCountries);
  }

  /** Checks whether the 'meteredCountries' field is set and is not null and is not empty */
  public boolean isNotEmptyMeteredCountries() { return isNotNullMeteredCountries() && !getMeteredCountries().isEmpty(); }

  /** Checks whether the 'app' field is set and is not null */
  public boolean isNotNullApp() {
    return genClient.cacheValueIsNotNull(CacheKey.app);
  }

  /** Checks whether the 'label' field is set and is not null */
  public boolean isNotNullLabel() {
    return genClient.cacheValueIsNotNull(CacheKey.label);
  }


  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return genClient.cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'amount' field has been set, however the value could be null */
  public boolean hasAmount() {
    return genClient.cacheHasKey(CacheKey.amount);
  }

  /** Checks whether the 'action' field has been set, however the value could be null */
  public boolean hasAction() {
    return genClient.cacheHasKey(CacheKey.action);
  }

  /** Checks whether the 'active' field has been set, however the value could be null */
  public boolean hasActive() {
    return genClient.cacheHasKey(CacheKey.active);
  }

  /** Checks whether the 'meteredCountries' field has been set, however the value could be null */
  public boolean hasMeteredCountries() {
    return genClient.cacheHasKey(CacheKey.meteredCountries);
  }

  /** Checks whether the 'app' field has been set, however the value could be null */
  public boolean hasApp() {
    return genClient.cacheHasKey(CacheKey.app);
  }

  /** Checks whether the 'label' field has been set, however the value could be null */
  public boolean hasLabel() {
    return genClient.cacheHasKey(CacheKey.label);
  }


  /**
   * Sets the field 'id'.
   */
  public AppMetered setId(java.lang.String id) {
    return genClient.setOther(id, CacheKey.id);
  }

  /**
   * Sets the field 'amount'.
   */
  public AppMetered setAmount(java.lang.Long amount) {
    return genClient.setOther(amount, CacheKey.amount);
  }

  /**
   * Sets the field 'action'.
   */
  public AppMetered setAction(java.lang.String action) {
    return genClient.setOther(action, CacheKey.action);
  }

  /**
   * Sets the field 'active'.
   */
  public AppMetered setActive(java.lang.Boolean active) {
    return genClient.setOther(active, CacheKey.active);
  }

  /**
   * Sets the field 'meteredCountries'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public AppMetered setMeteredCountries(java.util.List<com.clover.sdk.v3.apps.AppMeteredCountry> meteredCountries) {
    return genClient.setArrayRecord(meteredCountries, CacheKey.meteredCountries);
  }

  /**
   * Sets the field 'app'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public AppMetered setApp(com.clover.sdk.v3.base.Reference app) {
    return genClient.setRecord(app, CacheKey.app);
  }

  /**
   * Sets the field 'label'.
   */
  public AppMetered setLabel(java.lang.String label) {
    return genClient.setOther(label, CacheKey.label);
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    genClient.clear(CacheKey.id);
  }
  /** Clears the 'amount' field, the 'has' method for this field will now return false */
  public void clearAmount() {
    genClient.clear(CacheKey.amount);
  }
  /** Clears the 'action' field, the 'has' method for this field will now return false */
  public void clearAction() {
    genClient.clear(CacheKey.action);
  }
  /** Clears the 'active' field, the 'has' method for this field will now return false */
  public void clearActive() {
    genClient.clear(CacheKey.active);
  }
  /** Clears the 'meteredCountries' field, the 'has' method for this field will now return false */
  public void clearMeteredCountries() {
    genClient.clear(CacheKey.meteredCountries);
  }
  /** Clears the 'app' field, the 'has' method for this field will now return false */
  public void clearApp() {
    genClient.clear(CacheKey.app);
  }
  /** Clears the 'label' field, the 'has' method for this field will now return false */
  public void clearLabel() {
    genClient.clear(CacheKey.label);
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
  public AppMetered copyChanges() {
    AppMetered copy = new AppMetered();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(AppMetered src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new AppMetered(src).getJSONObject(), src.genClient);
    }
  }

  /**
   * Gets a Bundle which can be used to get and set data attached to this instance. The attached Bundle will be
   * parcelled but not jsonified.
   */
  public android.os.Bundle getBundle() {
    return genClient.getBundle();
  }

  @Override
  public String toString() {
    return genClient.toString();
  }

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(android.os.Parcel dest, int flags) {
    genClient.writeToParcel(dest, flags);
  }

  public static final android.os.Parcelable.Creator<AppMetered> CREATOR = new android.os.Parcelable.Creator<AppMetered>() {
    @Override
    public AppMetered createFromParcel(android.os.Parcel in) {
      AppMetered instance = new AppMetered(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public AppMetered[] newArray(int size) {
      return new AppMetered[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<AppMetered> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<AppMetered>() {
    @Override
    public AppMetered create(org.json.JSONObject jsonObject) {
      return new AppMetered(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;

    public static final boolean AMOUNT_IS_REQUIRED = false;

    public static final boolean ACTION_IS_REQUIRED = false;
    public static final long ACTION_MAX_LEN = 40;

    public static final boolean ACTIVE_IS_REQUIRED = false;

    public static final boolean METEREDCOUNTRIES_IS_REQUIRED = false;

    public static final boolean APP_IS_REQUIRED = false;

    public static final boolean LABEL_IS_REQUIRED = false;
    public static final long LABEL_MAX_LEN = 20;

  }

}