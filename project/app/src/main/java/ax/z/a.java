/*
 * Decompiled with CFR 0.152.
 */
package ax.z;

import android.os.Bundle;

public final class a {
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Integer d;

    a(Integer n8, Integer n9, Integer n10, Integer n11) {
        this.a = n8;
        this.b = n9;
        this.c = n10;
        this.d = n11;
    }

    Bundle a() {
        Bundle bundle = new Bundle();
        Integer n8 = this.a;
        if (n8 != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", n8.intValue());
        }
        if ((n8 = this.b) != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", n8.intValue());
        }
        if ((n8 = this.c) != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", n8.intValue());
        }
        if ((n8 = this.d) != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", n8.intValue());
        }
        return bundle;
    }

    public static final class a {
        private Integer a;
        private Integer b;
        private Integer c;
        private Integer d;

        public a a() {
            return new a(this.a, this.b, this.c, this.d);
        }
    }
}

