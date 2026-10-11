package com.socialnmobile.commons.inapppurchase.billing.datatypes;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes3.dex */
public class LicenseAPIError {
    public int code;
    public String message;

    public String toString() {
        return String.format("LicenseAPIError(code=%s message=%s)", Integer.valueOf(this.code), this.message);
    }
}
