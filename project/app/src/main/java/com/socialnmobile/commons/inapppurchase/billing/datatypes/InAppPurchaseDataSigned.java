/*
 * Decompiled with CFR 0.152.
 */
package com.socialnmobile.commons.inapppurchase.billing.datatypes;

import androidx.annotation.Keep;
import ax.Fa.a;
import ax.Fa.b;
import com.socialnmobile.commons.inapppurchase.billing.datatypes.InAppPurchaseData;
import java.io.Serializable;

@Keep
public class InAppPurchaseDataSigned
implements Serializable {
    public String item;
    public String purchaseData;
    public String signature;

    public InAppPurchaseData getUnverifiedPurchaseData(b b8) throws a {
        return b8.a(this.purchaseData);
    }

    public String toString() {
        return String.format("InAppPurchaseDataSigned(item=%s purchaseData=%s signature=%s)", this.item, this.purchaseData, this.signature);
    }
}

