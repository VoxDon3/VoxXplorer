/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.license.datatypes;

import androidx.annotation.Keep;
import ax.Da.a;
import ax.Da.c;
import ax.Ea.b;
import com.voxdon.xplorer.license.datatypes.ProductCatalogImpl;
import com.socialnmobile.commons.inapppurchase.billing.datatypes.InAppPurchaseData;
import java.io.Serializable;
import java.util.Date;

@Keep
public class LicensePurchasedImpl
implements ax.Fa.c,
Serializable {
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
        String string = this.productId;
        if (string != null) {
            return string;
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
        Object object = this.licenseStateCode;
        if (object != null) {
            try {
                object = a.h(object);
                return object;
            }
            catch (b b8) {
                throw new IllegalStateException(b8);
            }
        }
        throw new IllegalStateException("Unexpected null licenseStateCode");
    }

    public String getLicenseeId() {
        String string = this.deviceId;
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Unexpected null deviceId");
    }

    public Integer getPaymentStateCode() {
        return this.paymentStateCode;
    }

    public String getProductCategory() {
        String string = this.getProductIdPrivate();
        try {
            string = ProductCatalogImpl.getProductCategoryStatic(string);
            return string;
        }
        catch (ax.Ea.a a8) {
            throw new IllegalStateException(a8);
        }
    }

    public ax.Da.b getProductId() {
        return new ax.Da.b(this.getProductType(), this.getProductIdPrivate());
    }

    public c getProductType() {
        return ProductCatalogImpl.getProductTypeStatic(this.getProductIdPrivate());
    }

    public String getProductVariation() {
        String string = this.getProductIdPrivate();
        try {
            string = ProductCatalogImpl.getProductVariationStatic(string);
            return string;
        }
        catch (ax.Ea.a a8) {
            throw new IllegalStateException(a8);
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
        return String.format("LicensePurchasedImpl(expiryTimeMillis=%s productId=%s deviceId=%s inAppPurchaseDataVerified=%s licenseStateCode=%s purchaseTypeCode=%s purchaseStateCode=%s paymentStateCode=%s consumptionStateCode=%s)", this.expiryTimeMillis, this.productId, this.deviceId, this.inAppPurchaseDataVerified, this.licenseStateCode, this.purchaseStateCode, this.purchaseTypeCode, this.paymentStateCode, this.consumptionStateCode);
    }
}

