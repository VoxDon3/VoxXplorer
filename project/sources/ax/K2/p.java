package ax.K2;

import android.database.Cursor;
import ax.k2.AbstractC2378i;
import ax.k2.AbstractC2390u;
import ax.k2.C2393x;
import ax.m2.C2512b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class p implements o {
    private final AbstractC2390u a;
    private final AbstractC2378i<n> b;

    class a extends AbstractC2378i<n> {
        a(AbstractC2390u abstractC2390u) {
            super(abstractC2390u);
        }

        @Override // ax.k2.AbstractC2367A
        public String e() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // ax.k2.AbstractC2378i
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(ax.o2.k kVar, n nVar) {
            if (nVar.a() == null) {
                kVar.t0(1);
            } else {
                kVar.D(1, nVar.a());
            }
            if (nVar.b() == null) {
                kVar.t0(2);
            } else {
                kVar.D(2, nVar.b());
            }
        }
    }

    public p(AbstractC2390u abstractC2390u) {
        this.a = abstractC2390u;
        this.b = new a(abstractC2390u);
    }

    public static List<Class<?>> c() {
        return Collections.EMPTY_LIST;
    }

    @Override // ax.K2.o
    public void a(n nVar) {
        this.a.d();
        this.a.e();
        try {
            this.b.j(nVar);
            this.a.A();
        } finally {
            this.a.i();
        }
    }

    @Override // ax.K2.o
    public List<String> b(String str) {
        C2393x c = C2393x.c("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            c.t0(1);
        } else {
            c.D(1, str);
        }
        this.a.d();
        Cursor b = C2512b.b(this.a, c, false, null);
        try {
            ArrayList arrayList = new ArrayList(b.getCount());
            while (b.moveToNext()) {
                arrayList.add(b.isNull(0) ? null : b.getString(0));
            }
            return arrayList;
        } finally {
            b.close();
            c.f();
        }
    }
}
