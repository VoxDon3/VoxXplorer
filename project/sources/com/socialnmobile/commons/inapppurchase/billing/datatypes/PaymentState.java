package com.socialnmobile.commons.inapppurchase.billing.datatypes;

import androidx.annotation.Keep;
import ax.Ea.b;

@Keep
/* loaded from: classes3.dex */
public enum PaymentState {
    PAYMENT_PENDING(0),
    PAYMENT_RECEIVED(1),
    FREE_TRIAL(2);

    public final int code;

    PaymentState(int i) {
        this.code = i;
    }

    public static PaymentState fromCode(int i) throws b {
        for (PaymentState paymentState : values()) {
            if (paymentState.code == i) {
                return paymentState;
            }
        }
        throw new b("PaymentState: unknown code " + i);
    }
}
