package ax.K2;

import android.database.Cursor;
import ax.K2.j;
import ax.k2.AbstractC2367A;
import ax.k2.AbstractC2378i;
import ax.k2.AbstractC2390u;
import ax.k2.C2393x;
import ax.m2.C2511a;
import ax.m2.C2512b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class k implements j {
    private final AbstractC2390u a;
    private final AbstractC2378i<i> b;
    private final AbstractC2367A c;
    private final AbstractC2367A d;

    class a extends AbstractC2378i<i> {
        a(AbstractC2390u abstractC2390u) {
            super(abstractC2390u);
        }

        @Override // ax.k2.AbstractC2367A
        public String e() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
        }

        @Override // ax.k2.AbstractC2378i
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(ax.o2.k kVar, i iVar) {
            String str = iVar.a;
            if (str == null) {
                kVar.t0(1);
            } else {
                kVar.D(1, str);
            }
            kVar.X(2, iVar.a());
            kVar.X(3, iVar.c);
        }
    }

    class b extends AbstractC2367A {
        b(AbstractC2390u abstractC2390u) {
            super(abstractC2390u);
        }

        @Override // ax.k2.AbstractC2367A
        public String e() {
            return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
        }
    }

    class c extends AbstractC2367A {
        c(AbstractC2390u abstractC2390u) {
            super(abstractC2390u);
        }

        @Override // ax.k2.AbstractC2367A
        public String e() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public k(AbstractC2390u abstractC2390u) {
        this.a = abstractC2390u;
        this.b = new a(abstractC2390u);
        this.c = new b(abstractC2390u);
        this.d = new c(abstractC2390u);
    }

    public static List<Class<?>> h() {
        return Collections.EMPTY_LIST;
    }

    @Override // ax.K2.j
    public List<String> a() {
        C2393x c2 = C2393x.c("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.a.d();
        Cursor b2 = C2512b.b(this.a, c2, false, null);
        try {
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                arrayList.add(b2.isNull(0) ? null : b2.getString(0));
            }
            return arrayList;
        } finally {
            b2.close();
            c2.f();
        }
    }

    @Override // ax.K2.j
    public void b(i iVar) {
        this.a.d();
        this.a.e();
        try {
            this.b.j(iVar);
            this.a.A();
        } finally {
            this.a.i();
        }
    }

    @Override // ax.K2.j
    public i c(m mVar) {
        return j.a.a(this, mVar);
    }

    @Override // ax.K2.j
    public void d(String str, int i) {
        this.a.d();
        ax.o2.k b2 = this.c.b();
        if (str == null) {
            b2.t0(1);
        } else {
            b2.D(1, str);
        }
        b2.X(2, i);
        this.a.e();
        try {
            b2.I();
            this.a.A();
        } finally {
            this.a.i();
            this.c.h(b2);
        }
    }

    @Override // ax.K2.j
    public void e(m mVar) {
        j.a.b(this, mVar);
    }

    @Override // ax.K2.j
    public void f(String str) {
        this.a.d();
        ax.o2.k b2 = this.d.b();
        if (str == null) {
            b2.t0(1);
        } else {
            b2.D(1, str);
        }
        this.a.e();
        try {
            b2.I();
            this.a.A();
        } finally {
            this.a.i();
            this.d.h(b2);
        }
    }

    @Override // ax.K2.j
    public i g(String str, int i) {
        C2393x c2 = C2393x.c("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        if (str == null) {
            c2.t0(1);
        } else {
            c2.D(1, str);
        }
        c2.X(2, i);
        this.a.d();
        i iVar = null;
        String string = null;
        Cursor b2 = C2512b.b(this.a, c2, false, null);
        try {
            int e = C2511a.e(b2, "work_spec_id");
            int e2 = C2511a.e(b2, "generation");
            int e3 = C2511a.e(b2, "system_id");
            if (b2.moveToFirst()) {
                if (!b2.isNull(e)) {
                    string = b2.getString(e);
                }
                iVar = new i(string, b2.getInt(e2), b2.getInt(e3));
            }
            return iVar;
        } finally {
            b2.close();
            c2.f();
        }
    }
}
