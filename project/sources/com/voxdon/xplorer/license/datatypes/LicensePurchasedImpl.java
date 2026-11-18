package com.voxdon.xplorer.license.datatypes;

import androidx.annotation.Keep;
import ax.Da.a;
import ax.Ea.b;
import ax.Fa.c;
import com.socialnmobile.commons.inapppurchase.billing.datatypes.InAppPurchaseData;
import java.io.Serializable;
import java.util.Date;

@Keep
/* loaded from: classes.dex */
public class LicensePurchasedImpl implements c, Serializable {
    private Integer consumptionStateCode;
    private String deviceId;
    private transient Date expiryTimeDate;
    private long expiryTimeMillis;
    private InAppPurchaseData inAppPurchaseDataVerified;
    private Integer licenseStateCode;
    private Integer paymentStateCode;
    private String productId;
    private Integer purchaseStateCode;
    private Integer purchaseTypeCode;

    private String getProductIdPrivate() {
        String str = this.productId;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Unexpected null productId");
    }

    public Integer getConsumptionStateCode() {
        return this.consumptionStateCode;
    }

    public Date getExpiryTime() {
        if (this.expiryTimeDate == null) {
            this.expiryTimeDate = new Date(this.expiryTimeMillis);
        }
        return this.expiryTimeDate;
    }

    public a getLicenseState() {
        Integer num = this.licenseStateCode;
        if (num == null) {
            throw new IllegalStateException("Unexpected null licenseStateCode");
        }
        try {
            return a.h(num.intValue());
        } catch (b e) {
            throw new IllegalStateException(e);
        }
    }

    public String getLicenseeId() {
        String str = this.deviceId;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Unexpected null deviceId");
    }

    public Integer getPaymentStateCode() {
        return this.paymentStateCode;
    }

    public String getProductCategory() {
        try {
            return ProductCatalogImpl.getProductCategoryStatic(getProductIdPrivate());
        } catch (ax.Ea.a e) {
            throw new IllegalStateException(e);
        }
    }

    public ax.Da.b getProductId() {
        return new ax.Da.b(getProductType(), getProductIdPrivate());
    }

    public ax.Da.c getProductType() {
        return ProductCatalogImpl.getProductTypeStatic(getProductIdPrivate());
    }

    public String getProductVariation() {
        try {
            return ProductCatalogImpl.getProductVariationStatic(getProductIdPrivate());
        } catch (ax.Ea.a e) {
            throw new IllegalStateException(e);
        }
    }

    public Integer getPurchaseStateCode() {
        return this.purchaseStateCode;
    }

    public Integer getPurchaseTypeCode() {
        return this.purchaseTypeCode;
    }

    public InAppPurchaseData getVerifiedPurchaseData() {
        InAppPurchaseData inAppPurchaseData = this.inAppPurchaseDataVerified;
        if (inAppPurchaseData != null) {
            return inAppPurchaseData;
        }
        throw new IllegalStateException("Unexpected null inAppPurchaseDataVerified");
    }

    public String toString() {
        return String.format("LicensePurchasedImpl(expiryTimeMillis=%s productId=%s deviceId=%s inAppPurchaseDataVerified=%s licenseStateCode=%s purchaseTypeCode=%s purchaseStateCode=%s paymentStateCode=%s consumptionStateCode=%s)", Long.valueOf(this.expiryTimeMillis), this.productId, this.deviceId, this.inAppPurchaseDataVerified, this.licenseStateCode, this.purchaseStateCode, this.purchaseTypeCode, this.paymentStateCode, this.consumptionStateCode);
    }
}
