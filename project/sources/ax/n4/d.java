package ax.n4;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class d {

    @Deprecated
    public static final d a = new d();
    public static final d b = new d();
    private static final char[] c = {';', ','};

    private static boolean c(char c2, char[] cArr) {
        if (cArr != null) {
            for (char c3 : cArr) {
                if (c2 == c3) {
                    return true;
                }
            }
        }
        return false;
    }

    protected h a(String str, String str2, k[] kVarArr) {
        return new b(str, str2, kVarArr);
    }

    protected k b(String str, String str2) {
        return new e(str, str2);
    }

    public h[] d(f fVar, l lVar) {
        C2578a.a(fVar, "Char array buffer");
        C2578a.a(lVar, "Parser cursor");
        ArrayList arrayList = new ArrayList();
        while (!lVar.a()) {
            h e = e(fVar, lVar);
            if (e.getName().length() != 0 || e.getValue() != null) {
                arrayList.add(e);
            }
        }
        return (h[]) arrayList.toArray(new h[arrayList.size()]);
    }

    public h e(f fVar, l lVar) {
        C2578a.a(fVar, "Char array buffer");
        C2578a.a(lVar, "Parser cursor");
        k f = f(fVar, lVar);
        return a(f.getName(), f.getValue(), (lVar.a() || fVar.b(lVar.b() + (-1)) == ',') ? null : h(fVar, lVar));
    }

    public k f(f fVar, l lVar) {
        return g(fVar, lVar, c);
    }

    public k g(f fVar, l lVar, char[] cArr) {
        boolean z;
        boolean z2;
        String e;
        char b2;
        C2578a.a(fVar, "Char array buffer");
        C2578a.a(lVar, "Parser cursor");
        int b3 = lVar.b();
        int b4 = lVar.b();
        int c2 = lVar.c();
        while (true) {
            z = true;
            if (b3 >= c2 || (b2 = fVar.b(b3)) == '=') {
                break;
            }
            if (c(b2, cArr)) {
                z2 = true;
                break;
            }
            b3++;
        }
        z2 = false;
        if (b3 == c2) {
            e = fVar.e(b4, c2);
            z2 = true;
        } else {
            e = fVar.e(b4, b3);
            b3++;
        }
        if (z2) {
            lVar.d(b3);
            return b(e, null);
        }
        int i = b3;
        boolean z3 = false;
        boolean z4 = false;
        while (true) {
            if (i >= c2) {
                z = z2;
                break;
            }
            char b5 = fVar.b(i);
            if (b5 == '\"' && !z3) {
                z4 = !z4;
            }
            if (!z4 && !z3 && c(b5, cArr)) {
                break;
            }
            z3 = !z3 && z4 && b5 == '\\';
            i++;
        }
        while (b3 < i && g.a(fVar.b(b3))) {
            b3++;
        }
        int i2 = i;
        while (i2 > b3 && g.a(fVar.b(i2 - 1))) {
            i2--;
        }
        if (i2 - b3 >= 2 && fVar.b(b3) == '\"' && fVar.b(i2 - 1) == '\"') {
            b3++;
            i2--;
        }
        String d = fVar.d(b3, i2);
        if (z) {
            i++;
        }
        lVar.d(i);
        return b(e, d);
    }

    public k[] h(f fVar, l lVar) {
        C2578a.a(fVar, "Char array buffer");
        C2578a.a(lVar, "Parser cursor");
        int b2 = lVar.b();
        int c2 = lVar.c();
        while (b2 < c2 && g.a(fVar.b(b2))) {
            b2++;
        }
        lVar.d(b2);
        if (lVar.a()) {
            return new k[0];
        }
        ArrayList arrayList = new ArrayList();
        while (!lVar.a()) {
            arrayList.add(f(fVar, lVar));
            if (fVar.b(lVar.b() - 1) == ',') {
                break;
            }
        }
        return (k[]) arrayList.toArray(new k[arrayList.size()]);
    }
}
