package ax.P7;

import android.content.Context;
import ax.J7.AbstractC0775u;
import ax.J7.H;
import ax.L7.F;
import ax.M7.j;
import ax.Q7.i;
import ax.j6.AbstractC2327j;
import ax.n5.C2580b;
import ax.n5.g;
import ax.p5.u;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public class b {
    private static final j c = new j();
    private static final String d = d("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    private static final String e = d("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
    private static final g<F, byte[]> f = new g() { // from class: ax.P7.a
        @Override // ax.n5.g
        public final Object apply(Object obj) {
            byte[] bytes;
            bytes = b.c.M((F) obj).getBytes(Charset.forName("UTF-8"));
            return bytes;
        }
    };
    private final e a;
    private final g<F, byte[]> b;

    b(e eVar, g<F, byte[]> gVar) {
        this.a = eVar;
        this.b = gVar;
    }

    public static b b(Context context, i iVar, H h) {
        u.f(context);
        ax.n5.i g = u.c().g(new com.google.android.datatransport.cct.a(d, e));
        C2580b b = C2580b.b("json");
        g<F, byte[]> gVar = f;
        return new b(new e(g.a("FIREBASE_CRASHLYTICS_REPORT", F.class, b, gVar), iVar.b(), h), gVar);
    }

    private static String d(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public AbstractC2327j<AbstractC0775u> c(AbstractC0775u abstractC0775u, boolean z) {
        return this.a.i(abstractC0775u, z).a();
    }
}
