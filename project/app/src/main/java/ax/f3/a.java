/*
 * Decompiled with CFR 0.152.
 */
package ax.f3;

import android.content.Context;
import ax.Q2.g;
import com.voxdon.xplorer.license.datatypes.ProductCatalogImpl;
import java.util.logging.Logger;

public class a {
    private static final Logger b = g.a(a.class);
    public static final String c = ProductCatalogImpl.CATEGORY_PREMIUM_BASIC;
    private static a d;
    private Context a;

    a(Context context) {
        this.a = context;
    }

    public static a b() {
        return d;
    }

    public static void d(Context context) {
        if (d == null) {
            d = new a(context);
        }
    }

    public String a(String string) {
        return "";
    }

    public boolean c(String string) {
        return false;
    }

    public boolean e(String string) {
        return false;
    }
}

