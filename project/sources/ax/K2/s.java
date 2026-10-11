package ax.K2;

import ax.k2.AbstractC2367A;
import ax.k2.AbstractC2378i;
import ax.k2.AbstractC2390u;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class s implements r {
    private final AbstractC2390u a;
    private final AbstractC2378i<q> b;
    private final AbstractC2367A c;
    private final AbstractC2367A d;

    class a extends AbstractC2378i<q> {
        a(AbstractC2390u abstractC2390u) {
            super(abstractC2390u);
        }

        @Override // ax.k2.AbstractC2367A
        public String e() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // ax.k2.AbstractC2378i
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(ax.o2.k kVar, q qVar) {
            if (qVar.b() == null) {
                kVar.t0(1);
            } else {
                kVar.D(1, qVar.b());
            }
            byte[] k = androidx.work.b.k(qVar.a());
            if (k == null) {
                kVar.t0(2);
            } else {
                kVar.e0(2, k);
            }
        }
    }

    class b extends AbstractC2367A {
        b(AbstractC2390u abstractC2390u) {
            super(abstractC2390u);
        }

        @Override // ax.k2.AbstractC2367A
        public String e() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    class c extends AbstractC2367A {
        c(AbstractC2390u abstractC2390u) {
            super(abstractC2390u);
        }

        @Override // ax.k2.AbstractC2367A
        public String e() {
            return "DELETE FROM WorkProgress";
        }
    }

    public s(AbstractC2390u abstractC2390u) {
        this.a = abstractC2390u;
        this.b = new a(abstractC2390u);
        this.c = new b(abstractC2390u);
        this.d = new c(abstractC2390u);
    }

    public static List<Class<?>> b() {
        return Collections.EMPTY_LIST;
    }

    @Override // ax.K2.r
    public void a() {
        this.a.d();
        ax.o2.k b2 = this.d.b();
        this.a.e();
        try {
            b2.I();
            this.a.A();
        } finally {
            this.a.i();
            this.d.h(b2);
        }
    }

    @Override // ax.K2.r
    public void h(String str) {
        this.a.d();
        ax.o2.k b2 = this.c.b();
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
            this.c.h(b2);
        }
    }
}
