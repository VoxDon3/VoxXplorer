package ax.f3;

import android.content.Context;
import ax.Q2.g;
import com.voxdon.xplorer.license.datatypes.ProductCatalogImpl;
import java.util.logging.Logger;
import okhttp3.HttpUrl;

/* renamed from: ax.f3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2044a {
    private static final Logger b = g.a(C2044a.class);
    public static final String c = ProductCatalogImpl.CATEGORY_PREMIUM_BASIC;
    private static C2044a d;
    private Context a;

    C2044a(Context context) {
        this.a = context;
    }

    public static C2044a b() {
        return d;
    }

    public static void d(Context context) {
        if (d == null) {
            d = new C2044a(context);
        }
    }

    public String a(String str) {
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    public boolean c(String str) {
        return false;
    }

    public boolean e(String str) {
        return false;
    }
}
