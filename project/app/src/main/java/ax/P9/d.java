/*
 * Decompiled with CFR 0.152.
 */
package ax.P9;

import ax.M9.f;
import ax.P9.b;
import ax.P9.k;
import ax.P9.o;
import ax.S9.c;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

public abstract class d<T>
implements o {
    private final b a;

    public d(String string, f f8, List<c> list, Class<T> clazz) {
        this.a = new b(this, string, f8, list, clazz){
            final d i;
            {
                this.i = d8;
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

    protected InputStream e() throws ax.M9.d {
        this.a.t(k.q);
        return this.a.m().b().a(this, InputStream.class, null);
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

    protected T l(byte[] byArray) {
        this.a.t(k.f0);
        return (T)this.a.m().b().a(this, this.a.q(), byArray);
    }
}

