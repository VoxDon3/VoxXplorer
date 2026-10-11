/*
 * Decompiled with CFR 0.152.
 */
package com.socialnmobile.commons.inapppurchase.billing.datatypes;

import androidx.annotation.Keep;

@Keep
public class LicenseAPIError {
    public int code;
    public String message;

    public String toString() {
        return String.format("LicenseAPIError(code=%s message=%s)", this.code, this.message);
    }
}

