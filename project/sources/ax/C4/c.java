package ax.C4;

import ax.C4.d;
import ax.C4.e;
import ax.T4.f;
import ax.T4.g;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class c {
    protected final String a;
    protected final String b;

    public static class a extends ax.v4.e<c> {
        public static final a b = new a();

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
        
            if (okhttp3.HttpUrl.FRAGMENT_ENCODE_SET.equals(r2) != false) goto L6;
         */
        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ax.C4.c s(ax.T4.j r5, boolean r6) throws java.io.IOException, ax.T4.i {
            /*
                r4 = this;
                java.lang.String r0 = ""
                r1 = 0
                if (r6 != 0) goto L12
                ax.v4.AbstractC3276c.h(r5)
                java.lang.String r2 = ax.v4.AbstractC3274a.q(r5)
                boolean r3 = r0.equals(r2)
                if (r3 == 0) goto L13
            L12:
                r2 = r1
            L13:
                if (r2 != 0) goto L69
                r0 = r1
            L16:
                ax.T4.m r2 = r5.j()
                ax.T4.m r3 = ax.T4.m.FIELD_NAME
                if (r2 != r3) goto L4f
                java.lang.String r2 = r5.g()
                r5.H()
                java.lang.String r3 = "root_namespace_id"
                boolean r3 = r3.equals(r2)
                if (r3 == 0) goto L38
                ax.v4.c r1 = ax.v4.C3277d.f()
                java.lang.Object r1 = r1.a(r5)
                java.lang.String r1 = (java.lang.String) r1
                goto L16
            L38:
                java.lang.String r3 = "home_namespace_id"
                boolean r2 = r3.equals(r2)
                if (r2 == 0) goto L4b
                ax.v4.c r0 = ax.v4.C3277d.f()
                java.lang.Object r0 = r0.a(r5)
                java.lang.String r0 = (java.lang.String) r0
                goto L16
            L4b:
                ax.v4.AbstractC3276c.o(r5)
                goto L16
            L4f:
                if (r1 == 0) goto L61
                if (r0 == 0) goto L59
                ax.C4.c r2 = new ax.C4.c
                r2.<init>(r1, r0)
                goto L94
            L59:
                ax.T4.i r6 = new ax.T4.i
                java.lang.String r0 = "Required field \"home_namespace_id\" missing."
                r6.<init>(r5, r0)
                throw r6
            L61:
                ax.T4.i r6 = new ax.T4.i
                java.lang.String r0 = "Required field \"root_namespace_id\" missing."
                r6.<init>(r5, r0)
                throw r6
            L69:
                boolean r0 = r0.equals(r2)
                r1 = 1
                if (r0 == 0) goto L77
                ax.C4.c$a r0 = ax.C4.c.a.b
                ax.C4.c r2 = r0.s(r5, r1)
                goto L94
            L77:
                java.lang.String r0 = "team"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L86
                ax.C4.d$a r0 = ax.C4.d.a.b
                ax.C4.d r2 = r0.s(r5, r1)
                goto L94
            L86:
                java.lang.String r0 = "user"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto La1
                ax.C4.e$a r0 = ax.C4.e.a.b
                ax.C4.e r2 = r0.s(r5, r1)
            L94:
                if (r6 != 0) goto L99
                ax.v4.AbstractC3276c.e(r5)
            L99:
                java.lang.String r5 = r2.c()
                ax.v4.C3275b.a(r2, r5)
                return r2
            La1:
                ax.T4.i r6 = new ax.T4.i
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "No subtype found that matches tag: \""
                r0.append(r1)
                r0.append(r2)
                java.lang.String r1 = "\""
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r6.<init>(r5, r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.C4.c.a.s(ax.T4.j, boolean):ax.C4.c");
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(c cVar, g gVar, boolean z) throws IOException, f {
            if (cVar instanceof d) {
                d.a.b.t((d) cVar, gVar, z);
                return;
            }
            if (cVar instanceof e) {
                e.a.b.t((e) cVar, gVar, z);
                return;
            }
            if (!z) {
                gVar.o0();
            }
            gVar.o("root_namespace_id");
            C3277d.f().k(cVar.a, gVar);
            gVar.o("home_namespace_id");
            C3277d.f().k(cVar.b, gVar);
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public c(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Required value for 'rootNamespaceId' is null");
        }
        if (!Pattern.matches("[-_0-9a-zA-Z:]+", str)) {
            throw new IllegalArgumentException("String 'rootNamespaceId' does not match pattern");
        }
        this.a = str;
        if (str2 == null) {
            throw new IllegalArgumentException("Required value for 'homeNamespaceId' is null");
        }
        if (!Pattern.matches("[-_0-9a-zA-Z:]+", str2)) {
            throw new IllegalArgumentException("String 'homeNamespaceId' does not match pattern");
        }
        this.b = str2;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return a.b.j(this, true);
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        c cVar = (c) obj;
        String str3 = this.a;
        String str4 = cVar.a;
        return (str3 == str4 || str3.equals(str4)) && ((str = this.b) == (str2 = cVar.b) || str.equals(str2));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return a.b.j(this, false);
    }
}
