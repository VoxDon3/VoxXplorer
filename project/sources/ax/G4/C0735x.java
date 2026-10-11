package ax.G4;

import ax.E4.e;
import ax.G4.C0736y;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: ax.G4.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0735x extends P {
    protected final String f;
    protected final String g;
    protected final C0736y h;
    protected final List<ax.E4.e> i;

    /* renamed from: ax.G4.x$a */
    static class a extends ax.v4.e<C0735x> {
        public static final a b = new a();

        a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
        
            if ("folder".equals(r1) != false) goto L6;
         */
        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ax.G4.C0735x s(ax.T4.j r13, boolean r14) throws java.io.IOException, ax.T4.i {
            /*
                Method dump skipped, instructions count: 328
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.G4.C0735x.a.s(ax.T4.j, boolean):ax.G4.x");
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(C0735x c0735x, ax.T4.g gVar, boolean z) throws IOException, ax.T4.f {
            if (!z) {
                gVar.o0();
            }
            r("folder", gVar);
            gVar.o("name");
            C3277d.f().k(c0735x.a, gVar);
            gVar.o("id");
            C3277d.f().k(c0735x.f, gVar);
            if (c0735x.b != null) {
                gVar.o("path_lower");
                C3277d.d(C3277d.f()).k(c0735x.b, gVar);
            }
            if (c0735x.c != null) {
                gVar.o("path_display");
                C3277d.d(C3277d.f()).k(c0735x.c, gVar);
            }
            if (c0735x.d != null) {
                gVar.o("parent_shared_folder_id");
                C3277d.d(C3277d.f()).k(c0735x.d, gVar);
            }
            if (c0735x.e != null) {
                gVar.o("preview_url");
                C3277d.d(C3277d.f()).k(c0735x.e, gVar);
            }
            if (c0735x.g != null) {
                gVar.o("shared_folder_id");
                C3277d.d(C3277d.f()).k(c0735x.g, gVar);
            }
            if (c0735x.h != null) {
                gVar.o("sharing_info");
                C3277d.e(C0736y.a.b).k(c0735x.h, gVar);
            }
            if (c0735x.i != null) {
                gVar.o("property_groups");
                C3277d.d(C3277d.c(e.a.b)).k(c0735x.i, gVar);
            }
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public C0735x(String str, String str2, String str3, String str4, String str5, String str6, String str7, C0736y c0736y, List<ax.E4.e> list) {
        super(str, str3, str4, str5, str6);
        if (str2 == null) {
            throw new IllegalArgumentException("Required value for 'id' is null");
        }
        if (str2.length() < 1) {
            throw new IllegalArgumentException("String 'id' is shorter than 1");
        }
        this.f = str2;
        if (str7 != null && !Pattern.matches("[-_0-9a-zA-Z:]+", str7)) {
            throw new IllegalArgumentException("String 'sharedFolderId' does not match pattern");
        }
        this.g = str7;
        this.h = c0736y;
        if (list != null) {
            Iterator<ax.E4.e> it = list.iterator();
            while (it.hasNext()) {
                if (it.next() == null) {
                    throw new IllegalArgumentException("An item in list 'propertyGroups' is null");
                }
            }
        }
        this.i = list;
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

    @Override // ax.G4.P
    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        C0736y c0736y;
        C0736y c0736y2;
        List<ax.E4.e> list;
        List<ax.E4.e> list2;
        if (obj == this) {
            return true;
        }
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        C0735x c0735x = (C0735x) obj;
        String str13 = this.a;
        String str14 = c0735x.a;
        return (str13 == str14 || str13.equals(str14)) && ((str = this.f) == (str2 = c0735x.f) || str.equals(str2)) && (((str3 = this.b) == (str4 = c0735x.b) || (str3 != null && str3.equals(str4))) && (((str5 = this.c) == (str6 = c0735x.c) || (str5 != null && str5.equals(str6))) && (((str7 = this.d) == (str8 = c0735x.d) || (str7 != null && str7.equals(str8))) && (((str9 = this.e) == (str10 = c0735x.e) || (str9 != null && str9.equals(str10))) && (((str11 = this.g) == (str12 = c0735x.g) || (str11 != null && str11.equals(str12))) && (((c0736y = this.h) == (c0736y2 = c0735x.h) || (c0736y != null && c0736y.equals(c0736y2))) && ((list = this.i) == (list2 = c0735x.i) || (list != null && list.equals(list2)))))))));
    }

    @Override // ax.G4.P
    public int hashCode() {
        return (super.hashCode() * 31) + Arrays.hashCode(new Object[]{this.f, this.g, this.h, this.i});
    }

    @Override // ax.G4.P
    public String toString() {
        return a.b.j(this, false);
    }
}
