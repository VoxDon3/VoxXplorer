package com.voxdon.xplorer.license.datatypes;

import androidx.annotation.Keep;
import ax.Da.b;
import ax.Da.c;
import ax.Ea.a;
import ax.Fa.d;
import ax.e3.C1974a;
import ax.s8.InterfaceC3061c;
import java.io.Serializable;

@Keep
/* loaded from: classes.dex */
public class ProductCatalogImpl implements d, Serializable {
    public static String CATEGORY_PREMIUM_BASIC = "premium_basic";
    private static C1974a sProductIdParser = new C1974a("com.voxdon.xplorer");

    @InterfaceC3061c("premium_basic")
    private ProductCategoryPremiumBasic premiumBasic;

    public static String getProductCategoryStatic(String str) throws a {
        String str2 = sProductIdParser.b(str).get("category");
        if (str2 != null) {
            return str2;
        }
        throw new a("category is null");
    }

    public static c getProductTypeStatic(String str) {
        return str.contains(".onetime") ? c.MANAGED : c.SUBSCRIPTION;
    }

    public static String getProductVariationStatic(String str) throws a {
        String str2 = sProductIdParser.b(str).get("variation");
        if (str2 != null) {
            return str2;
        }
        throw new a("variation is null");
    }

    public b getPremiumBasicOnetime() {
        String str;
        ProductCategoryPremiumBasic productCategoryPremiumBasic = this.premiumBasic;
        if (productCategoryPremiumBasic == null || (str = productCategoryPremiumBasic.onetime) == null) {
            return null;
        }
        return new b(c.MANAGED, sProductIdParser.a(CATEGORY_PREMIUM_BASIC, "onetime", str));
    }

    public b getPremiumBasicOnetimeDiscount() {
        String str;
        ProductCategoryPremiumBasic productCategoryPremiumBasic = this.premiumBasic;
        if (productCategoryPremiumBasic == null || (str = productCategoryPremiumBasic.onetime_dc) == null) {
            return null;
        }
        return new b(c.MANAGED, sProductIdParser.a(CATEGORY_PREMIUM_BASIC, "onetime_dc", str));
    }

    public b getPremiumBasicYearly() {
        String str;
        ProductCategoryPremiumBasic productCategoryPremiumBasic = this.premiumBasic;
        if (productCategoryPremiumBasic == null || (str = productCategoryPremiumBasic.yearly) == null) {
            return null;
        }
        return new b(c.SUBSCRIPTION, sProductIdParser.a(CATEGORY_PREMIUM_BASIC, "yearly", str));
    }

    public b getPremiumBasicYearlyDiscount() {
        String str;
        ProductCategoryPremiumBasic productCategoryPremiumBasic = this.premiumBasic;
        if (productCategoryPremiumBasic == null || (str = productCategoryPremiumBasic.yearly_dc) == null) {
            return null;
        }
        return new b(c.SUBSCRIPTION, sProductIdParser.a(CATEGORY_PREMIUM_BASIC, "yearly_dc", str));
    }

    public String getProductCategory(b bVar) throws ax.Ea.b {
        try {
            return getProductCategoryStatic(bVar.c0);
        } catch (a e) {
            throw new ax.Ea.b(e);
        }
    }

    public String getProductVariation(b bVar) throws ax.Ea.b {
        try {
            return getProductVariationStatic(bVar.c0);
        } catch (a e) {
            throw new ax.Ea.b(e);
        }
    }

    public String toString() {
        return String.format("ProductCatalogImpl(premiumBasic=%s)", this.premiumBasic);
    }
}
