/*
 * Decompiled with CFR 0.152.
 */
package ax.Sd;

import ax.Sd.b;
import ax.Sd.h;
import ax.Sd.n;
import ax.Vd.d;
import ax.Vd.e;
import ax.Vd.f;
import ax.Vd.g;
import ax.Vd.i;
import ax.Vd.j;
import ax.Vd.k;
import ax.Vd.m;
import ax.Vd.o;
import ax.Vd.p;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class l
extends b {
    private b.a b;
    private List<b> c;
    private b d;
    private int e;

    public l() {
        Object object = new ArrayList<b>();
        this.c = object;
        object.add((b)new n(new o()));
        this.c.add(new n(new g()));
        this.c.add(new n(new i()));
        this.c.add(new n(new k()));
        this.c.add(new n(new f()));
        this.c.add(new n(new e()));
        this.c.add(new n(new j()));
        this.c.add(new n(new p()));
        this.c.add(new n(new ax.Vd.h()));
        this.c.add(new n(new ax.Vd.n()));
        this.c.add(new n(new m()));
        Object object2 = new d();
        object = new h();
        n n8 = new n((ax.Vd.l)object2, false, (b)object);
        object2 = new n((ax.Vd.l)object2, true, (b)object);
        ((h)object).n(n8, (b)object2);
        this.c.add((b)object);
        this.c.add(n8);
        this.c.add((b)object2);
        this.j();
    }

    private boolean m(b b8, b b9) {
        return this.n(b8) && this.n(b9);
    }

    private boolean n(b b8) {
        if (b8 == null) {
            return false;
        }
        if (ax.Rd.b.q.equals(b8.c())) {
            return true;
        }
        return ax.Rd.b.p.equals(b8.c());
    }

    @Override
    public String c() {
        if (this.d == null) {
            this.d();
            if (this.d == null) {
                this.d = this.c.get(0);
            }
        }
        return this.d.c();
    }

    @Override
    public float d() {
        float f8;
        b b8;
        Object object = this.b;
        if (object == b.a.c0) {
            return 0.99f;
        }
        if (object == b.a.d0) {
            return 0.01f;
        }
        object = this.c.iterator();
        float f9 = 0.0f;
        float f10 = 0.0f;
        while (object.hasNext()) {
            b8 = (b)object.next();
            if (!b8.g() || !(f10 < (f8 = b8.d()))) continue;
            this.d = b8;
            f10 = f8;
        }
        object = this.d;
        if (object != null && this.n((b)object)) {
            Iterator<b> iterator = this.c.iterator();
            object = null;
            while (iterator.hasNext()) {
                b8 = iterator.next();
                if (!b8.g() || !this.m(this.d, b8) || !(b8 instanceof n) || !(f9 < (f8 = ((n)b8).l()))) continue;
                object = b8;
                f9 = f8;
            }
            if (object != null) {
                this.d = object;
            }
        }
        return f10;
    }

    @Override
    public b.a e() {
        return this.b;
    }

    @Override
    public b.a f(byte[] object, int n8, int n9) {
        ByteBuffer byteBuffer = this.b((byte[])object, n8, n9);
        if (byteBuffer.position() != 0) {
            object = this.c.iterator();
            while (object.hasNext()) {
                b.a a8;
                b b8 = (b)object.next();
                if (!b8.g()) continue;
                b.a a9 = b8.f(byteBuffer.array(), 0, byteBuffer.position());
                if (a9 != (a8 = b.a.c0) && 0.99f != b8.d()) {
                    a8 = b.a.d0;
                    if (a9 != a8) continue;
                    b8.k(false);
                    this.e = n8 = this.e - 1;
                    if (n8 > 0) continue;
                    this.b = a8;
                    break;
                }
                this.d = b8;
                this.b = a8;
                break;
            }
        }
        return this.b;
    }

    @Override
    public final void j() {
        this.e = 0;
        for (b b8 : this.c) {
            b8.j();
            b8.k(true);
            ++this.e;
        }
        this.d = null;
        this.b = b.a.q;
    }

    public b l() {
        return this.d;
    }
}

