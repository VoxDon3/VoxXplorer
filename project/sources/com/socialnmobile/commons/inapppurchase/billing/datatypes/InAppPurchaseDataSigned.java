package com.socialnmobile.commons.inapppurchase.billing.datatypes;

import androidx.annotation.Keep;
import ax.Fa.a;
import ax.Fa.b;
import java.io.Serializable;

@Keep
/* loaded from: classes3.dex */
public class InAppPurchaseDataSigned implements Serializable {
    public String item;
    public String purchaseData;
    public String signature;

    public InAppPurchaseData getUnverifiedPurchaseData(b bVar) throws a {
        return bVar.a(this.purchaseData);
    }

    public String toString() {
        return String.format("InAppPurchaseDataSigned(item=%s purchaseData=%s signature=%s)", this.item, this.purchaseData, this.signature);
    }
}
