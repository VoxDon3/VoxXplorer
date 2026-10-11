/*
 * Decompiled with CFR 0.152.
 */
package com.socialnmobile.commons.inapppurchase.billing.datatypes;

import androidx.annotation.Keep;
import ax.Ea.b;

@Keep
public enum PaymentState {
    PAYMENT_PENDING(0),
    PAYMENT_RECEIVED(1),
    FREE_TRIAL(2);

    public final int code;

    private PaymentState(int n9) {
        this.code = n9;
    }

    public static PaymentState fromCode(int n8) throws b {
        for (PaymentState object2 : PaymentState.values()) {
            if (object2.code != n8) continue;
            return object2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PaymentState: unknown code ");
        stringBuilder.append(n8);
        throw new b(stringBuilder.toString());
    }
}

