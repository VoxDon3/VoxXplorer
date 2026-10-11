package ax.a2;

import android.content.res.Resources;
import android.text.TextUtils;
import ax.P0.C0912v;
import ax.S0.C0968a;
import ax.S0.d0;
import java.util.Locale;
import okhttp3.HttpUrl;

/* renamed from: ax.a2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1322f implements InterfaceC1316G {
    private final Resources a;

    public C1322f(Resources resources) {
        this.a = (Resources) C0968a.e(resources);
    }

    private String b(C0912v c0912v) {
        int i = c0912v.G;
        return (i == -1 || i < 1) ? HttpUrl.FRAGMENT_ENCODE_SET : i != 1 ? i != 2 ? (i == 6 || i == 7) ? this.a.getString(C1313D.B) : i != 8 ? this.a.getString(C1313D.A) : this.a.getString(C1313D.C) : this.a.getString(C1313D.z) : this.a.getString(C1313D.q);
    }

    private String c(C0912v c0912v) {
        int i = c0912v.j;
        return i == -1 ? HttpUrl.FRAGMENT_ENCODE_SET : this.a.getString(C1313D.p, Float.valueOf(i / 1000000.0f));
    }

    private String d(C0912v c0912v) {
        return TextUtils.isEmpty(c0912v.b) ? HttpUrl.FRAGMENT_ENCODE_SET : c0912v.b;
    }

    private String e(C0912v c0912v) {
        String j = j(f(c0912v), h(c0912v));
        return TextUtils.isEmpty(j) ? d(c0912v) : j;
    }

    private String f(C0912v c0912v) {
        String str = c0912v.d;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        Locale forLanguageTag = Locale.forLanguageTag(str);
        Locale Y = d0.Y();
        String displayName = forLanguageTag.getDisplayName(Y);
        if (TextUtils.isEmpty(displayName)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        try {
            int offsetByCodePoints = displayName.offsetByCodePoints(0, 1);
            return displayName.substring(0, offsetByCodePoints).toUpperCase(Y) + displayName.substring(offsetByCodePoints);
        } catch (IndexOutOfBoundsException unused) {
            return displayName;
        }
    }

    private String g(C0912v c0912v) {
        int i = c0912v.v;
        int i2 = c0912v.w;
        return (i == -1 || i2 == -1) ? HttpUrl.FRAGMENT_ENCODE_SET : this.a.getString(C1313D.r, Integer.valueOf(i), Integer.valueOf(i2));
    }

    private String h(C0912v c0912v) {
        String string = (c0912v.f & 2) != 0 ? this.a.getString(C1313D.s) : HttpUrl.FRAGMENT_ENCODE_SET;
        if ((c0912v.f & 4) != 0) {
            string = j(string, this.a.getString(C1313D.v));
        }
        if ((c0912v.f & 8) != 0) {
            string = j(string, this.a.getString(C1313D.u));
        }
        return (c0912v.f & 1088) != 0 ? j(string, this.a.getString(C1313D.t)) : string;
    }

    private static int i(C0912v c0912v) {
        int k = ax.P0.D.k(c0912v.o);
        if (k != -1) {
            return k;
        }
        if (ax.P0.D.n(c0912v.k) != null) {
            return 2;
        }
        if (ax.P0.D.c(c0912v.k) != null) {
            return 1;
        }
        if (c0912v.v == -1 && c0912v.w == -1) {
            return (c0912v.G == -1 && c0912v.H == -1) ? -1 : 1;
        }
        return 2;
    }

    private String j(String... strArr) {
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        for (String str2 : strArr) {
            if (!str2.isEmpty()) {
                str = TextUtils.isEmpty(str) ? str2 : this.a.getString(C1313D.o, str, str2);
            }
        }
        return str;
    }

    @Override // ax.a2.InterfaceC1316G
    public String a(C0912v c0912v) {
        int i = i(c0912v);
        String j = i == 2 ? j(h(c0912v), g(c0912v), c(c0912v)) : i == 1 ? j(e(c0912v), b(c0912v), c(c0912v)) : e(c0912v);
        if (!j.isEmpty()) {
            return j;
        }
        String str = c0912v.d;
        return (str == null || str.trim().isEmpty()) ? this.a.getString(C1313D.D) : this.a.getString(C1313D.E, str);
    }
}
