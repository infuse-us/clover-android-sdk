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

package com.clover.sdk.v3.order;

import android.os.Parcelable;
import android.os.Parcel;

/**
 * This is an auto-generated Clover data enum.
 * Symbols beginning with USER_ or REJECT_ are user-initiated.  Others are client- or server-initiated.
 */
@SuppressWarnings("all")
public enum VoidReason implements Parcelable {
  USER_CANCEL, TRANSPORT_ERROR, REJECT_SIGNATURE, REJECT_PARTIAL_AUTH, NOT_APPROVED, FAILED, AUTH_CLOSED_NEW_CARD, DEVELOPER_PAY_PARTIAL_AUTH, REJECT_DUPLICATE, REJECT_OFFLINE;

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(final Parcel dest, final int flags) {
    dest.writeString(name());
  }

  public static final Creator<VoidReason> CREATOR = new Creator<VoidReason>() {
    @Override
    public VoidReason createFromParcel(final Parcel source) {
      return VoidReason.valueOf(source.readString());
    }

    @Override
    public VoidReason[] newArray(final int size) {
      return new VoidReason[size];
    }
  };
}