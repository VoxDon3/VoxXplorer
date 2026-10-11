/*
 * Decompiled with CFR 0.152.
 */
package ax.K2;

import androidx.work.b;
import ax.K2.q;
import ax.K2.r;
import ax.k2.A;
import ax.k2.i;
import ax.k2.u;
import ax.o2.k;
import java.util.Collections;
import java.util.List;

public final class s
implements r {
    private final u a;
    private final i<q> b;
    private final A c;
    private final A d;

    public s(u u8) {
        this.a = u8;
        this.b = new i<q>(this, u8){
            final s d;
            {
                this.d = s8;
                super(u8);
            }

            @Override
            public String e() {
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            }

            public void k(k k8, q object) {
                if (((q)object).b() == null) {
                    k8.t0(1);
                } else {
                    k8.D(1, ((q)object).b());
                }
                object = androidx.work.b.k(((q)object).a());
                if (object == null) {
                    k8.t0(2);
                    return;
                }
                k8.e0(2, (byte[])object);
            }
        };
        this.c = new A(this, u8){
            final s d;
            {
                this.d = s8;
                super(u8);
            }

            @Override
            public String e() {
                return "DELETE from WorkProgress where work_spec_id=?";
            }
        };
        this.d = new A(this, u8){
            final s d;
            {
                this.d = s8;
                super(u8);
            }

            @Override
            public String e() {
                return "DELETE FROM WorkProgress";
            }
        };
    }

    public static List<Class<?>> b() {
        return Collections.EMPTY_LIST;
    }

    @Override
    public void a() {
        this.a.d();
        k k8 = this.d.b();
        this.a.e();
        try {
            k8.I();
            this.a.A();
            return;
        }
        finally {
            this.a.i();
            this.d.h(k8);
        }
    }

    @Override
    public void h(String string) {
        this.a.d();
        k k8 = this.c.b();
        if (string == null) {
            k8.t0(1);
        } else {
            k8.D(1, string);
        }
        this.a.e();
        try {
            k8.I();
            this.a.A();
            return;
        }
        finally {
            this.a.i();
            this.c.h(k8);
        }
    }
}

