/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.license.datatypes;

import androidx.annotation.Keep;
import ax.Da.b;
import ax.Da.c;
import ax.Ea.a;
import ax.Fa.d;
import com.voxdon.xplorer.license.datatypes.ProductCategoryPremiumBasic;
import java.io.Serializable;

@Keep
public class ProductCatalogImpl
implements d,
Serializable {
    public static String CATEGORY_PREMIUM_BASIC = "premium_basic";
    private static ax.e3.a sProductIdParser = new ax.e3.a("com.voxdon.xplorer");
    @ax.s8.c(value="premium_basic")
    private ProductCategoryPremiumBasic premiumBasic;

    public static String getProductCategoryStatic(String string) throws a {
        if ((string = sProductIdParser.b(string).get("category")) != null) {
            return string;
        }
        throw new a("category is null");
    }

    public static c getProductTypeStatic(String string) {
        if (string.contains(".onetime")) {
            return c.c0;
        }
        return c.d0;
    }

    public static String getProductVariationStatic(String string) throws a {
        if ((string = sProductIdParser.b(string).get("variation")) != null) {
            return string;
        }
        throw new a("variation is null");
    }

    public b getPremiumBasicOnetime() {
        Object object = this.premiumBasic;
        if (object == null) {
            return null;
        }
        object = ((ProductCategoryPremiumBasic)object).onetime;
        if (object == null) {
            return null;
        }
        object = sProductIdParser.a(CATEGORY_PREMIUM_BASIC, "onetime", (String)object);
        return new b(c.c0, (String)object);
    }

    public b getPremiumBasicOnetimeDiscount() {
        Object object = this.premiumBasic;
        if (object == null) {
            return null;
        }
        object = ((ProductCategoryPremiumBasic)object).onetime_dc;
        if (object == null) {
            return null;
        }
        object = sProductIdParser.a(CATEGORY_PREMIUM_BASIC, "onetime_dc", (String)object);
        return new b(c.c0, (String)object);
    }

    public b getPremiumBasicYearly() {
        Object object = this.premiumBasic;
        if (object == null) {
            return null;
        }
        object = ((ProductCategoryPremiumBasic)object).yearly;
        if (object == null) {
            return null;
        }
        object = sProductIdParser.a(CATEGORY_PREMIUM_BASIC, "yearly", (String)object);
        return new b(c.d0, (String)object);
    }

    public b getPremiumBasicYearlyDiscount() {
        Object object = this.premiumBasic;
        if (object == null) {
            return null;
        }
        object = ((ProductCategoryPremiumBasic)object).yearly_dc;
        if (object == null) {
            return null;
        }
        object = sProductIdParser.a(CATEGORY_PREMIUM_BASIC, "yearly_dc", (String)object);
        return new b(c.d0, (String)object);
    }

    public String getProductCategory(b object) throws ax.Ea.b {
        try {
            object = ProductCatalogImpl.getProductCategoryStatic(((b)object).c0);
            return object;
        }
        catch (a a8) {
            throw new ax.Ea.b(a8);
        }
    }

    public String getProductVariation(b object) throws ax.Ea.b {
        try {
            object = ProductCatalogImpl.getProductVariationStatic(((b)object).c0);
            return object;
        }
        catch (a a8) {
            throw new ax.Ea.b(a8);
        }
    }

    public String toString() {
        return String.format("ProductCatalogImpl(premiumBasic=%s)", this.premiumBasic);
    }
}

