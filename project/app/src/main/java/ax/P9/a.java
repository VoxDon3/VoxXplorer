/*
 * Decompiled with CFR 0.152.
 */
package ax.P9;

import ax.M9.f;
import ax.P9.b;
import ax.P9.k;
import ax.P9.o;
import ax.S9.c;
import ax.S9.d;
import java.net.URL;
import java.util.List;

public abstract class a<T1, T2>
implements o {
    private final b a;
    private final Class<T1> b;
    private final Class<T2> c;

    public a(String string, f f8, List<c> list, Class<T1> clazz, Class<T2> clazz2) {
        this.b = clazz;
        this.c = clazz2;
        this.a = new b(this, string, f8, list, clazz){
            final a i;
            {
                this.i = a8;
                super(string, f8, list, clazz);
            }
        };
    }

    @Override
    public List<ax.S9.b> a() {
        return this.a.a();
    }

    @Override
    public URL d() {
        return this.a.d();
    }

    public void e(ax.S9.a a8) {
        this.a.n().add(a8);
    }

    @Override
    public boolean g() {
        return this.a.g();
    }

    @Override
    public k h() {
        return this.a.h();
    }

    @Override
    public void k(String string, String string2) {
        this.a.k(string, string2);
    }

    public void l(d d8) {
        this.a.p().add(d8);
    }

    protected b m() {
        return this.a;
    }

    protected T1 n() throws ax.M9.d {
        this.a.t(k.q);
        return this.a.m().b().a(this, this.b, null);
    }
}

