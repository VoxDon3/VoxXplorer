/*
 * Decompiled with CFR 0.152.
 */
package ax.za;

import ax.oa.b;
import ax.oa.d;
import ax.oa.e;
import ax.pa.c;
import ax.pa.g;
import ax.ra.f;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.EnumSet;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class a
implements g {
    private final AtomicInteger a = new AtomicInteger();
    private int b = 16384;
    private int c = 16384;

    public void c(b b8, b object) throws IOException {
        Object object2 = new ax.ra.a(16384, 16384, b8, (b)((Object)object));
        object = new ByteArrayOutputStream();
        ax.pa.d d8 = new ax.pa.d((OutputStream)object);
        ((ax.oa.a)object2).k(this.e());
        ((ax.oa.a)object2).q(EnumSet.of(e.c0, e.d0));
        ((ax.ra.a)object2).a(d8);
        object2 = new byte[this.f()];
        object2 = new c(new ByteArrayInputStream((byte[])object2, 0, this.b(((ByteArrayOutputStream)object).toByteArray(), (byte[])object2)));
        object = new ax.ra.b();
        ((ax.ra.b)object).r((c)object2);
        if (((ax.ra.b)object).u()) {
            this.h(((ax.ra.b)object).t());
            this.g(((ax.ra.b)object).s());
            return;
        }
        throw new IOException(String.format("BIND %s (%s) failed.", b8.l(), b8.n()));
    }

    public <T extends ax.ra.e> T d(ax.ra.d<T> d8) throws IOException {
        Object object = new ByteArrayOutputStream();
        Object object2 = new ax.pa.d((OutputStream)object);
        Object object3 = new ax.ra.c();
        ((ax.oa.a)object3).k(this.e());
        ((ax.oa.a)object3).q(EnumSet.of(e.c0, e.d0));
        ((ax.ra.c)object3).u(d8.b());
        ((ax.ra.c)object3).v(d8.d());
        ((ax.ra.c)object3).a((ax.pa.d)object2);
        object3 = ((ByteArrayOutputStream)object).toByteArray();
        object2 = new byte[this.f()];
        object = new ax.Qc.a();
        ((ax.Qc.a)object).j(this.b((byte[])object3, (byte[])object2));
        Object object4 = new ByteArrayOutputStream();
        object3 = new f();
        while (true) {
            ((f)object3).r(new c(new ByteArrayInputStream((byte[])object2, 0, ((ax.Qc.a)object).h())));
            ((OutputStream)object4).write(((f)object3).s());
            if (((ax.oa.a)object3).i().contains(e.d0)) {
                object2 = new c(new ByteArrayInputStream(((ByteArrayOutputStream)object4).toByteArray()));
                object4 = ((ax.oa.a)object3).h();
                if (object4 != (object = d.e0)) {
                    if (((ax.oa.a)object3).h() != d.f0 && ((ax.oa.a)object3).h() != d.i0) {
                        throw new IOException(String.format("Expected PDU %s but got: %s", object, ((ax.oa.a)object3).h()));
                    }
                    throw ax.Aa.a.c((c)object2);
                }
                d8 = d8.c();
                ((ax.ra.e)((Object)d8)).c((c)object2);
                return (T)d8;
            }
            ((ax.Qc.a)object).j(this.a((byte[])object2));
        }
    }

    protected int e() {
        return this.a.getAndIncrement();
    }

    protected int f() {
        return this.b;
    }

    protected void g(int n8) {
        this.c = n8;
    }

    protected void h(int n8) {
        this.b = n8;
    }
}

