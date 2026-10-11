/*
 * Decompiled with CFR 0.152.
 */
package ax.n9;

import ax.Xd.f;
import ax.cc.e;
import ax.fc.a;
import ax.fc.d;
import ax.n9.b;

public class c {
    private static final ax.Xd.d b = f.k(c.class);
    private ax.dc.c<b> a;

    public c() {
        this(new e<b>(new a(){

            @Override
            public void a(d d8) {
                if (d8.a() != null) {
                    b.h(d8.toString(), d8.a());
                    return;
                }
                b.f(d8.toString());
            }
        }));
    }

    public c(ax.dc.c<b> c8) {
        this.a = c8;
    }

    public void b(b b8) {
        this.a.a(b8);
    }

    public void c(Object object) {
        this.a.b(object);
    }
}

