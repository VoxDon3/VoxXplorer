package ax.K2;

import android.database.Cursor;
import ax.k2.AbstractC2378i;
import ax.k2.AbstractC2390u;
import ax.k2.C2393x;
import ax.m2.C2512b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ax.K2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0783c implements InterfaceC0782b {
    private final AbstractC2390u a;
    private final AbstractC2378i<C0781a> b;

    /* renamed from: ax.K2.c$a */
    class a extends AbstractC2378i<C0781a> {
        a(AbstractC2390u abstractC2390u) {
            super(abstractC2390u);
        }

        @Override // ax.k2.AbstractC2367A
        public String e() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // ax.k2.AbstractC2378i
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(ax.o2.k kVar, C0781a c0781a) {
            if (c0781a.b() == null) {
                kVar.t0(1);
            } else {
                kVar.D(1, c0781a.b());
            }
            if (c0781a.a() == null) {
                kVar.t0(2);
            } else {
                kVar.D(2, c0781a.a());
            }
        }
    }

    public C0783c(AbstractC2390u abstractC2390u) {
        this.a = abstractC2390u;
        this.b = new a(abstractC2390u);
    }

    public static List<Class<?>> e() {
        return Collections.EMPTY_LIST;
    }

    @Override // ax.K2.InterfaceC0782b
    public List<String> a(String str) {
        C2393x c = C2393x.c("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
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

    @Override // ax.K2.InterfaceC0782b
    public void b(C0781a c0781a) {
        this.a.d();
        this.a.e();
        try {
            this.b.j(c0781a);
            this.a.A();
        } finally {
            this.a.i();
        }
    }

    @Override // ax.K2.InterfaceC0782b
    public boolean c(String str) {
        C2393x c = C2393x.c("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            c.t0(1);
        } else {
            c.D(1, str);
        }
        this.a.d();
        boolean z = false;
        Cursor b = C2512b.b(this.a, c, false, null);
        try {
            if (b.moveToFirst()) {
                z = b.getInt(0) != 0;
            }
            return z;
        } finally {
            b.close();
            c.f();
        }
    }

    @Override // ax.K2.InterfaceC0782b
    public boolean d(String str) {
        C2393x c = C2393x.c("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            c.t0(1);
        } else {
            c.D(1, str);
        }
        this.a.d();
        boolean z = false;
        Cursor b = C2512b.b(this.a, c, false, null);
        try {
            if (b.moveToFirst()) {
                z = b.getInt(0) != 0;
            }
            return z;
        } finally {
            b.close();
            c.f();
        }
    }
}
