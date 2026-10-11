package ax.u4;

import ax.T4.h;
import ax.T4.j;
import ax.T4.m;
import ax.t4.AbstractC3100b;
import ax.t4.C3099a;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ax.u4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3207b {
    public static final Set<String> c = new HashSet(Arrays.asList("invalid_request", "invalid_grant", "unsupported_grant_type"));
    public static final AbstractC3100b<C3207b> d = new a();
    private final String a;
    private final String b;

    /* renamed from: ax.u4.b$a */
    class a extends AbstractC3100b<C3207b> {
        a() {
        }

        @Override // ax.t4.AbstractC3100b
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public final C3207b d(j jVar) throws IOException, C3099a {
            h b = AbstractC3100b.b(jVar);
            String str = null;
            String str2 = null;
            while (jVar.j() == m.FIELD_NAME) {
                String g = jVar.g();
                jVar.H();
                try {
                    if (g.equals("error")) {
                        str = AbstractC3100b.h.f(jVar, g, str);
                    } else if (g.equals("error_description")) {
                        str2 = AbstractC3100b.h.f(jVar, g, str2);
                    } else {
                        AbstractC3100b.k(jVar);
                    }
                } catch (C3099a e) {
                    throw e.a(g);
                }
            }
            AbstractC3100b.a(jVar);
            if (str != null) {
                return new C3207b(str, str2);
            }
            throw new C3099a("missing field \"error\"", b);
        }
    }

    public C3207b(String str, String str2) {
        if (c.contains(str)) {
            this.a = str;
        } else {
            this.a = "unknown";
        }
        this.b = str2;
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }
}
