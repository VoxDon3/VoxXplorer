package ax.G4;

import ax.G4.C0713k;
import ax.G4.C0730t;
import ax.G4.C0735x;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class P {
    protected final String a;
    protected final String b;
    protected final String c;
    protected final String d;
    protected final String e;

    static class a extends ax.v4.e<P> {
        public static final a b = new a();

        a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
        
            if (okhttp3.HttpUrl.FRAGMENT_ENCODE_SET.equals(r2) != false) goto L6;
         */
        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ax.G4.P s(ax.T4.j r10, boolean r11) throws java.io.IOException, ax.T4.i {
            /*
                Method dump skipped, instructions count: 278
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.G4.P.a.s(ax.T4.j, boolean):ax.G4.P");
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(P p, ax.T4.g gVar, boolean z) throws IOException, ax.T4.f {
            if (p instanceof C0730t) {
                C0730t.a.b.t((C0730t) p, gVar, z);
                return;
            }
            if (p instanceof C0735x) {
                C0735x.a.b.t((C0735x) p, gVar, z);
                return;
            }
            if (p instanceof C0713k) {
                C0713k.a.b.t((C0713k) p, gVar, z);
                return;
            }
            if (!z) {
                gVar.o0();
            }
            gVar.o("name");
            C3277d.f().k(p.a, gVar);
            if (p.b != null) {
                gVar.o("path_lower");
                C3277d.d(C3277d.f()).k(p.b, gVar);
            }
            if (p.c != null) {
                gVar.o("path_display");
                C3277d.d(C3277d.f()).k(p.c, gVar);
            }
            if (p.d != null) {
                gVar.o("parent_shared_folder_id");
                C3277d.d(C3277d.f()).k(p.d, gVar);
            }
            if (p.e != null) {
                gVar.o("preview_url");
                C3277d.d(C3277d.f()).k(p.e, gVar);
            }
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public P(String str, String str2, String str3, String str4, String str5) {
        if (str == null) {
            throw new IllegalArgumentException("Required value for 'name' is null");
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        if (str4 != null && !Pattern.matches("[-_0-9a-zA-Z:]+", str4)) {
            throw new IllegalArgumentException("String 'parentSharedFolderId' does not match pattern");
        }
        this.d = str4;
        this.e = str5;
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return a.b.j(this, true);
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        if (obj == this) {
            return true;
        }
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        P p = (P) obj;
        String str9 = this.a;
        String str10 = p.a;
        return (str9 == str10 || str9.equals(str10)) && ((str = this.b) == (str2 = p.b) || (str != null && str.equals(str2))) && (((str3 = this.c) == (str4 = p.c) || (str3 != null && str3.equals(str4))) && (((str5 = this.d) == (str6 = p.d) || (str5 != null && str5.equals(str6))) && ((str7 = this.e) == (str8 = p.e) || (str7 != null && str7.equals(str8)))));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    public String toString() {
        return a.b.j(this, false);
    }
}
