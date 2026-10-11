package ax.t4;

import ax.T4.h;
import ax.T4.k;
import java.io.File;

/* renamed from: ax.t4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3099a extends Exception {
    public final h c0;
    private C0456a d0 = null;
    public final String q;

    /* renamed from: ax.t4.a$a, reason: collision with other inner class name */
    public static final class C0456a {
        public final String a;
        public final C0456a b;

        public C0456a(String str, C0456a c0456a) {
            this.a = str;
            this.b = c0456a;
        }
    }

    public C3099a(String str, h hVar) {
        this.q = str;
        this.c0 = hVar;
    }

    public static C3099a b(k kVar) {
        String message = kVar.getMessage();
        int lastIndexOf = message.lastIndexOf(" at [Source");
        if (lastIndexOf >= 0) {
            message = message.substring(0, lastIndexOf);
        }
        return new C3099a(message, kVar.a());
    }

    public static void c(StringBuilder sb, h hVar) {
        Object d = hVar.d();
        if (d instanceof File) {
            sb.append(((File) d).getPath());
            sb.append(": ");
        }
        sb.append(hVar.c());
        sb.append(".");
        sb.append(hVar.b());
    }

    public C3099a a(String str) {
        this.d0 = new C0456a('\"' + str + '\"', this.d0);
        return this;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder();
        c(sb, this.c0);
        sb.append(": ");
        C0456a c0456a = this.d0;
        if (c0456a != null) {
            sb.append(c0456a.a);
            while (true) {
                c0456a = c0456a.b;
                if (c0456a == null) {
                    break;
                }
                sb.append(".");
                sb.append(c0456a.a);
            }
            sb.append(": ");
        }
        sb.append(this.q);
        return sb.toString();
    }
}
