package ax.r4;

import ax.Gb.l;
import ax.Gb.y;
import ax.p4.q;
import ax.p4.z;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: ax.r4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2954e {
    public static final C2954e a = new C2954e();

    private C2954e() {
    }

    public final String a(z zVar, String str, q qVar, String str2) {
        l.f(str2, "pkceManagerCodeChallenge");
        if (zVar == null) {
            throw new IllegalStateException("Extra Query Param should only be used in short live token flow.");
        }
        y yVar = y.a;
        Locale locale = Locale.US;
        String format = String.format(locale, "%s=%s&%s=%s&%s=%s&%s=%s", Arrays.copyOf(new Object[]{"code_challenge", str2, "code_challenge_method", "S256", "token_access_type", zVar.toString(), "response_type", "code"}, 8));
        l.e(format, "format(...)");
        if (str != null) {
            String format2 = String.format(locale, "&%s=%s", Arrays.copyOf(new Object[]{"scope", str}, 2));
            l.e(format2, "format(...)");
            format = format + format2;
        }
        if (qVar == null) {
            return format;
        }
        String format3 = String.format(locale, "&%s=%s", Arrays.copyOf(new Object[]{"include_granted_scopes", qVar.toString()}, 2));
        l.e(format3, "format(...)");
        return format + format3;
    }
}
