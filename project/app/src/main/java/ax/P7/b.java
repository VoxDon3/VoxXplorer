/*
 * Decompiled with CFR 0.152.
 */
package ax.P7;

import android.content.Context;
import ax.J7.H;
import ax.J7.u;
import ax.L7.F;
import ax.P7.a;
import ax.P7.e;
import ax.j6.j;
import ax.n5.g;
import ax.n5.i;
import java.nio.charset.Charset;

public class b {
    private static final ax.M7.j c = new ax.M7.j();
    private static final String d = ax.P7.b.d("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    private static final String e = ax.P7.b.d("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
    private static final g<F, byte[]> f = new a();
    private final e a;
    private final g<F, byte[]> b;

    b(e e8, g<F, byte[]> g8) {
        this.a = e8;
        this.b = g8;
    }

    public static /* synthetic */ byte[] a(F f8) {
        return c.M(f8).getBytes(Charset.forName("UTF-8"));
    }

    public static b b(Context object, ax.Q7.i i8, H h8) {
        ax.p5.u.f(object);
        i i9 = ax.p5.u.c().g(new com.google.android.datatransport.cct.a(d, e));
        ax.n5.b b8 = ax.n5.b.b("json");
        object = f;
        return new b(new e(i9.a("FIREBASE_CRASHLYTICS_REPORT", F.class, b8, object), i8.b(), h8), (g<F, byte[]>)object);
    }

    private static String d(String string, String string2) {
        int n8 = string.length() - string2.length();
        if (n8 >= 0 && n8 <= 1) {
            StringBuilder stringBuilder = new StringBuilder(string.length() + string2.length());
            for (n8 = 0; n8 < string.length(); ++n8) {
                stringBuilder.append(string.charAt(n8));
                if (string2.length() <= n8) continue;
                stringBuilder.append(string2.charAt(n8));
            }
            return stringBuilder.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }

    public j<u> c(u u8, boolean bl) {
        return this.a.i(u8, bl).a();
    }
}

