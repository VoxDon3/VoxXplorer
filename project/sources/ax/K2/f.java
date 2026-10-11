package ax.K2;

import android.database.Cursor;
import ax.k2.AbstractC2378i;
import ax.k2.AbstractC2390u;
import ax.k2.C2393x;
import ax.m2.C2512b;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class f implements e {
    private final AbstractC2390u a;
    private final AbstractC2378i<d> b;

    class a extends AbstractC2378i<d> {
        a(AbstractC2390u abstractC2390u) {
            super(abstractC2390u);
        }

        @Override // ax.k2.AbstractC2367A
        public String e() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // ax.k2.AbstractC2378i
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(ax.o2.k kVar, d dVar) {
            if (dVar.a() == null) {
                kVar.t0(1);
            } else {
                kVar.D(1, dVar.a());
            }
            if (dVar.b() == null) {
                kVar.t0(2);
            } else {
                kVar.X(2, dVar.b().longValue());
            }
        }
    }

    public f(AbstractC2390u abstractC2390u) {
        this.a = abstractC2390u;
        this.b = new a(abstractC2390u);
    }

    public static List<Class<?>> c() {
        return Collections.EMPTY_LIST;
    }

    @Override // ax.K2.e
    public Long a(String str) {
        C2393x c = C2393x.c("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            c.t0(1);
        } else {
            c.D(1, str);
        }
        this.a.d();
        Long l = null;
        Cursor b = C2512b.b(this.a, c, false, null);
        try {
            if (b.moveToFirst() && !b.isNull(0)) {
                l = Long.valueOf(b.getLong(0));
            }
            return l;
        } finally {
            b.close();
            c.f();
        }
    }

    @Override // ax.K2.e
    public void b(d dVar) {
        this.a.d();
        this.a.e();
        try {
            this.b.j(dVar);
            this.a.A();
        } finally {
            this.a.i();
        }
    }
}
