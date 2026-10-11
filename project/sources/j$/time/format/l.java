package j$.time.format;

import java.util.Locale;

/* loaded from: classes2.dex */
public final class l implements e {
    public final j$.time.temporal.a a;
    public final t b;
    public final a c;
    public volatile h d;

    public l(j$.time.temporal.a aVar, t tVar, a aVar2) {
        this.a = aVar;
        this.b = tVar;
        this.c = aVar2;
    }

    @Override // j$.time.format.e
    public final boolean j(o oVar, StringBuilder sb) {
        String b;
        Long a = oVar.a(this.a);
        if (a == null) {
            return false;
        }
        j$.time.chrono.m mVar = (j$.time.chrono.m) oVar.a.J(j$.time.temporal.r.b);
        if (mVar == null || mVar == j$.time.chrono.t.c) {
            a aVar = this.c;
            long longValue = a.longValue();
            t tVar = this.b;
            Locale locale = oVar.b.b;
            b = aVar.a.b(longValue, tVar);
        } else {
            a aVar2 = this.c;
            long longValue2 = a.longValue();
            t tVar2 = this.b;
            Locale locale2 = oVar.b.b;
            b = aVar2.a.b(longValue2, tVar2);
        }
        if (b != null) {
            sb.append(b);
            return true;
        }
        if (this.d == null) {
            this.d = new h(this.a, 1, 19, s.NORMAL);
        }
        return this.d.j(oVar, sb);
    }

    public final String toString() {
        t tVar = t.FULL;
        j$.time.temporal.a aVar = this.a;
        t tVar2 = this.b;
        if (tVar2 == tVar) {
            return "Text(" + aVar + ")";
        }
        return "Text(" + aVar + "," + tVar2 + ")";
    }
}
