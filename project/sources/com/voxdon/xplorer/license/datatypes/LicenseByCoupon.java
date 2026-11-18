package com.voxdon.xplorer.license.datatypes;

import androidx.annotation.Keep;
import ax.Da.a;
import ax.Da.b;
import ax.Da.c;
import java.io.Serializable;
import java.util.Date;

@Keep
/* loaded from: classes.dex */
public class LicenseByCoupon implements Serializable {
    private String couponCode;
    private String deviceId;
    private transient Date expiryTimeDate;
    private long expiryTimeMillis;
    private String productId;

    private String getProductIdPrivate() {
        String str = this.productId;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Unexpected null productId");
    }

    public String getCouponCode() {
        String str = this.couponCode;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Unexpected null couponCode");
    }

    public Date getExpiryTime() {
        if (this.expiryTimeDate == null) {
            this.expiryTimeDate = new Date(this.expiryTimeMillis);
        }
        return this.expiryTimeDate;
    }

    public a getLicenseState() {
        return a.FREE;
    }

    public String getLicenseeId() {
        String str = this.deviceId;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Unexpected null deviceId");
    }

    public String getProductCategory() {
        try {
            return ProductCatalogImpl.getProductCategoryStatic(getProductIdPrivate());
        } catch (ax.Ea.a e) {
            throw new IllegalStateException(e);
        }
    }

    public b getProductId() {
        return new b(getProductType(), getProductIdPrivate());
    }

    public c getProductType() {
        return ProductCatalogImpl.getProductTypeStatic(getProductIdPrivate());
    }

    public String getProductVariation() {
        try {
            return ProductCatalogImpl.getProductVariationStatic(getProductIdPrivate());
        } catch (ax.Ea.a e) {
            throw new IllegalStateException(e);
        }
    }

    public String toString() {
        return String.format("LicenseByCoupon(productId=%s deviceId=%s expiryTimeMillis=%s couponCode=%s)", this.productId, this.deviceId, Long.valueOf(this.expiryTimeMillis), this.couponCode);
    }
}
