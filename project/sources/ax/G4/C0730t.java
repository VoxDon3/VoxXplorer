package ax.G4;

import ax.E4.e;
import ax.G4.C0718m0;
import ax.G4.C0725q;
import ax.G4.C0728s;
import ax.G4.C0733v;
import ax.G4.N;
import ax.v4.C3277d;
import ax.w4.C3344d;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: ax.G4.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0730t extends P {
    protected final String f;
    protected final Date g;
    protected final Date h;
    protected final String i;
    protected final long j;
    protected final N k;
    protected final C0718m0 l;
    protected final C0733v m;
    protected final boolean n;
    protected final C0725q o;
    protected final List<ax.E4.e> p;
    protected final Boolean q;
    protected final String r;
    protected final C0728s s;

    /* renamed from: ax.G4.t$a */
    static class a extends ax.v4.e<C0730t> {
        public static final a b = new a();

        a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
        
            if ("file".equals(r2) != false) goto L6;
         */
        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ax.G4.C0730t s(ax.T4.j r25, boolean r26) throws java.io.IOException, ax.T4.i {
            /*
                Method dump skipped, instructions count: 622
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.G4.C0730t.a.s(ax.T4.j, boolean):ax.G4.t");
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(C0730t c0730t, ax.T4.g gVar, boolean z) throws IOException, ax.T4.f {
            if (!z) {
                gVar.o0();
            }
            r("file", gVar);
            gVar.o("name");
            C3277d.f().k(c0730t.a, gVar);
            gVar.o("id");
            C3277d.f().k(c0730t.f, gVar);
            gVar.o("client_modified");
            C3277d.g().k(c0730t.g, gVar);
            gVar.o("server_modified");
            C3277d.g().k(c0730t.h, gVar);
            gVar.o("rev");
            C3277d.f().k(c0730t.i, gVar);
            gVar.o("size");
            C3277d.i().k(Long.valueOf(c0730t.j), gVar);
            if (c0730t.b != null) {
                gVar.o("path_lower");
                C3277d.d(C3277d.f()).k(c0730t.b, gVar);
            }
            if (c0730t.c != null) {
                gVar.o("path_display");
                C3277d.d(C3277d.f()).k(c0730t.c, gVar);
            }
            if (c0730t.d != null) {
                gVar.o("parent_shared_folder_id");
                C3277d.d(C3277d.f()).k(c0730t.d, gVar);
            }
            if (c0730t.e != null) {
                gVar.o("preview_url");
                C3277d.d(C3277d.f()).k(c0730t.e, gVar);
            }
            if (c0730t.k != null) {
                gVar.o("media_info");
                C3277d.d(N.b.b).k(c0730t.k, gVar);
            }
            if (c0730t.l != null) {
                gVar.o("symlink_info");
                C3277d.e(C0718m0.a.b).k(c0730t.l, gVar);
            }
            if (c0730t.m != null) {
                gVar.o("sharing_info");
                C3277d.e(C0733v.a.b).k(c0730t.m, gVar);
            }
            gVar.o("is_downloadable");
            C3277d.a().k(Boolean.valueOf(c0730t.n), gVar);
            if (c0730t.o != null) {
                gVar.o("export_info");
                C3277d.e(C0725q.a.b).k(c0730t.o, gVar);
            }
            if (c0730t.p != null) {
                gVar.o("property_groups");
                C3277d.d(C3277d.c(e.a.b)).k(c0730t.p, gVar);
            }
            if (c0730t.q != null) {
                gVar.o("has_explicit_shared_members");
                C3277d.d(C3277d.a()).k(c0730t.q, gVar);
            }
            if (c0730t.r != null) {
                gVar.o("content_hash");
                C3277d.d(C3277d.f()).k(c0730t.r, gVar);
            }
            if (c0730t.s != null) {
                gVar.o("file_lock_info");
                C3277d.e(C0728s.a.b).k(c0730t.s, gVar);
            }
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public C0730t(String str, String str2, Date date, Date date2, String str3, long j, String str4, String str5, String str6, String str7, N n, C0718m0 c0718m0, C0733v c0733v, boolean z, C0725q c0725q, List<ax.E4.e> list, Boolean bool, String str8, C0728s c0728s) {
        super(str, str4, str5, str6, str7);
        if (str2 == null) {
            throw new IllegalArgumentException("Required value for 'id' is null");
        }
        if (str2.length() < 1) {
            throw new IllegalArgumentException("String 'id' is shorter than 1");
        }
        this.f = str2;
        if (date == null) {
            throw new IllegalArgumentException("Required value for 'clientModified' is null");
        }
        this.g = C3344d.b(date);
        if (date2 == null) {
            throw new IllegalArgumentException("Required value for 'serverModified' is null");
        }
        this.h = C3344d.b(date2);
        if (str3 == null) {
            throw new IllegalArgumentException("Required value for 'rev' is null");
        }
        if (str3.length() < 9) {
            throw new IllegalArgumentException("String 'rev' is shorter than 9");
        }
        if (!Pattern.matches("[0-9a-f]+", str3)) {
            throw new IllegalArgumentException("String 'rev' does not match pattern");
        }
        this.i = str3;
        this.j = j;
        this.k = n;
        this.l = c0718m0;
        this.m = c0733v;
        this.n = z;
        this.o = c0725q;
        if (list != null) {
            Iterator<ax.E4.e> it = list.iterator();
            while (it.hasNext()) {
                if (it.next() == null) {
                    throw new IllegalArgumentException("An item in list 'propertyGroups' is null");
                }
            }
        }
        this.p = list;
        this.q = bool;
        if (str8 != null) {
            if (str8.length() < 64) {
                throw new IllegalArgumentException("String 'contentHash' is shorter than 64");
            }
            if (str8.length() > 64) {
                throw new IllegalArgumentException("String 'contentHash' is longer than 64");
            }
        }
        this.r = str8;
        this.s = c0728s;
    }

    @Override // ax.G4.P
    public String a() {
        return this.a;
    }

    @Override // ax.G4.P
    public String b() {
        return this.c;
    }

    @Override // ax.G4.P
    public String c() {
        return this.b;
    }

    @Override // ax.G4.P
    public String d() {
        return a.b.j(this, true);
    }

    public Date e() {
        return this.g;
    }

    @Override // ax.G4.P
    public boolean equals(Object obj) {
        C0730t c0730t;
        String str;
        String str2;
        String str3;
        String str4;
        Date date;
        Date date2;
        Date date3;
        Date date4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        N n;
        N n2;
        C0718m0 c0718m0;
        C0718m0 c0718m02;
        C0733v c0733v;
        C0733v c0733v2;
        C0725q c0725q;
        C0725q c0725q2;
        List<ax.E4.e> list;
        List<ax.E4.e> list2;
        Boolean bool;
        Boolean bool2;
        String str15;
        String str16;
        C0728s c0728s;
        C0728s c0728s2;
        if (obj == this) {
            return true;
        }
        return obj != null && obj.getClass().equals(getClass()) && ((str = this.a) == (str2 = (c0730t = (C0730t) obj).a) || str.equals(str2)) && (((str3 = this.f) == (str4 = c0730t.f) || str3.equals(str4)) && (((date = this.g) == (date2 = c0730t.g) || date.equals(date2)) && (((date3 = this.h) == (date4 = c0730t.h) || date3.equals(date4)) && (((str5 = this.i) == (str6 = c0730t.i) || str5.equals(str6)) && this.j == c0730t.j && (((str7 = this.b) == (str8 = c0730t.b) || (str7 != null && str7.equals(str8))) && (((str9 = this.c) == (str10 = c0730t.c) || (str9 != null && str9.equals(str10))) && (((str11 = this.d) == (str12 = c0730t.d) || (str11 != null && str11.equals(str12))) && (((str13 = this.e) == (str14 = c0730t.e) || (str13 != null && str13.equals(str14))) && (((n = this.k) == (n2 = c0730t.k) || (n != null && n.equals(n2))) && (((c0718m0 = this.l) == (c0718m02 = c0730t.l) || (c0718m0 != null && c0718m0.equals(c0718m02))) && (((c0733v = this.m) == (c0733v2 = c0730t.m) || (c0733v != null && c0733v.equals(c0733v2))) && this.n == c0730t.n && (((c0725q = this.o) == (c0725q2 = c0730t.o) || (c0725q != null && c0725q.equals(c0725q2))) && (((list = this.p) == (list2 = c0730t.p) || (list != null && list.equals(list2))) && (((bool = this.q) == (bool2 = c0730t.q) || (bool != null && bool.equals(bool2))) && (((str15 = this.r) == (str16 = c0730t.r) || (str15 != null && str15.equals(str16))) && ((c0728s = this.s) == (c0728s2 = c0730t.s) || (c0728s != null && c0728s.equals(c0728s2))))))))))))))))));
    }

    public long f() {
        return this.j;
    }

    @Override // ax.G4.P
    public int hashCode() {
        return (super.hashCode() * 31) + Arrays.hashCode(new Object[]{this.f, this.g, this.h, this.i, Long.valueOf(this.j), this.k, this.l, this.m, Boolean.valueOf(this.n), this.o, this.p, this.q, this.r, this.s});
    }

    @Override // ax.G4.P
    public String toString() {
        return a.b.j(this, false);
    }
}
