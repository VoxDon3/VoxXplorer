/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.license.datatypes;

import androidx.annotation.Keep;
import ax.Da.a;
import ax.Da.b;
import ax.Da.c;
import com.alphainventor.filemanager.license.datatypes.ProductCatalogImpl;
import java.io.Serializable;
import java.util.Date;

@Keep
public class LicenseByCoupon
implements Serializable {
    private String couponCode;
    private String deviceId;
    private transient Date expiryTimeDate;
    private long expiryTimeMillis;
    private String productId;

    private String getProductIdPrivate() {
        String string = this.productId;
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Unexpected null productId");
    }

    public String getCouponCode() {
        String string = this.couponCode;
        if (string != null) {
            return string;
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
        return a.f0;
    }

    public String getLicenseeId() {
        String string = this.deviceId;
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Unexpected null deviceId");
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

    public b getProductId() {
        String string = this.getProductIdPrivate();
        return new b(this.getProductType(), string);
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

    public String toString() {
        return String.format("LicenseByCoupon(productId=%s deviceId=%s expiryTimeMillis=%s couponCode=%s)", this.productId, this.deviceId, this.expiryTimeMillis, this.couponCode);
    }
}

