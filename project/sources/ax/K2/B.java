package ax.K2;

import android.database.Cursor;
import ax.K2.A;
import ax.k2.AbstractC2367A;
import ax.k2.AbstractC2378i;
import ax.k2.AbstractC2390u;
import ax.k2.C2393x;
import ax.m2.C2512b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class B implements A {
    private final AbstractC2390u a;
    private final AbstractC2378i<z> b;
    private final AbstractC2367A c;

    class a extends AbstractC2378i<z> {
        a(AbstractC2390u abstractC2390u) {
            super(abstractC2390u);
        }

        @Override // ax.k2.AbstractC2367A
        public String e() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // ax.k2.AbstractC2378i
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(ax.o2.k kVar, z zVar) {
            if (zVar.a() == null) {
                kVar.t0(1);
            } else {
                kVar.D(1, zVar.a());
            }
            if (zVar.b() == null) {
                kVar.t0(2);
            } else {
                kVar.D(2, zVar.b());
            }
        }
    }

    class b extends AbstractC2367A {
        b(AbstractC2390u abstractC2390u) {
            super(abstractC2390u);
        }

        @Override // ax.k2.AbstractC2367A
        public String e() {
            return "DELETE FROM worktag WHERE work_spec_id=?";
        }
    }

    public B(AbstractC2390u abstractC2390u) {
        this.a = abstractC2390u;
        this.b = new a(abstractC2390u);
        this.c = new b(abstractC2390u);
    }

    public static List<Class<?>> d() {
        return Collections.EMPTY_LIST;
    }

    @Override // ax.K2.A
    public void a(z zVar) {
        this.a.d();
        this.a.e();
        try {
            this.b.j(zVar);
            this.a.A();
        } finally {
            this.a.i();
        }
    }

    @Override // ax.K2.A
    public List<String> b(String str) {
        C2393x c = C2393x.c("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            c.t0(1);
        } else {
            c.D(1, str);
        }
        this.a.d();
        Cursor b2 = C2512b.b(this.a, c, false, null);
        try {
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                arrayList.add(b2.isNull(0) ? null : b2.getString(0));
            }
            return arrayList;
        } finally {
            b2.close();
            c.f();
        }
    }

    @Override // ax.K2.A
    public void c(String str, Set<String> set) {
        A.a.a(this, str, set);
    }
}
