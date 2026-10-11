/*
 * Decompiled with CFR 0.152.
 */
package ax.Q0;

import ax.Q0.o;
import ax.S0.a;
import ax.r7.z;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class n {
    private final z<o> a;
    private final List<o> b;
    private ByteBuffer[] c;
    private o.a d;
    private o.a e;
    private boolean f;

    public n(z<o> object) {
        this.a = object;
        this.b = new ArrayList<o>();
        this.c = new ByteBuffer[0];
        this.d = object = o.a.e;
        this.e = object;
        this.f = false;
    }

    private int c() {
        return this.c.length - 1;
    }

    private void g(ByteBuffer byteBuffer) {
        boolean bl = true;
        while (bl) {
            bl = false;
            for (int i8 = 0; i8 <= this.c(); ++i8) {
                boolean bl2;
                if (this.c[i8].hasRemaining()) {
                    bl2 = bl;
                } else {
                    o o8 = this.b.get(i8);
                    if (o8.c()) {
                        bl2 = bl;
                        if (!this.c[i8].hasRemaining()) {
                            bl2 = bl;
                            if (i8 < this.c()) {
                                this.b.get(i8 + 1).f();
                                bl2 = bl;
                            }
                        }
                    } else {
                        ByteBuffer byteBuffer2 = i8 > 0 ? this.c[i8 - 1] : (byteBuffer.hasRemaining() ? byteBuffer : o.a);
                        long l8 = byteBuffer2.remaining();
                        o8.d(byteBuffer2);
                        this.c[i8] = o8.b();
                        bl2 = l8 - (long)byteBuffer2.remaining() > 0L || this.c[i8].hasRemaining();
                        bl2 = bl | bl2;
                    }
                }
                bl = bl2;
            }
        }
    }

    public o.a a(o.a a8) throws o.b {
        if (!a8.equals(o.a.e)) {
            for (int i8 = 0; i8 < this.a.size(); ++i8) {
                o o8 = (o)this.a.get(i8);
                o.a a9 = o8.g(a8);
                if (!o8.e()) continue;
                ax.S0.a.g(a9.equals(o.a.e) ^ true);
                a8 = a9;
            }
            this.e = a8;
            return a8;
        }
        throw new o.b(a8);
    }

    public void b() {
        int n8;
        this.b.clear();
        this.d = this.e;
        int n9 = 0;
        this.f = false;
        for (n8 = 0; n8 < this.a.size(); ++n8) {
            o o8 = (o)this.a.get(n8);
            o8.flush();
            if (!o8.e()) continue;
            this.b.add(o8);
        }
        this.c = new ByteBuffer[this.b.size()];
        for (n8 = n9; n8 <= this.c(); ++n8) {
            this.c[n8] = this.b.get(n8).b();
        }
    }

    public ByteBuffer d() {
        if (!this.f()) {
            return o.a;
        }
        ByteBuffer byteBuffer = this.c[this.c()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        this.g(o.a);
        return this.c[this.c()];
    }

    public boolean e() {
        return this.f && this.b.get(this.c()).c() && !this.c[this.c()].hasRemaining();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof n)) {
            return false;
        }
        object = (n)object;
        if (this.a.size() != ((n)object).a.size()) {
            return false;
        }
        for (int i8 = 0; i8 < this.a.size(); ++i8) {
            if (this.a.get(i8) == ((n)object).a.get(i8)) continue;
            return false;
        }
        return true;
    }

    public boolean f() {
        return this.b.isEmpty() ^ true;
    }

    public void h() {
        if (this.f() && !this.f) {
            this.f = true;
            this.b.get(0).f();
        }
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public void i(ByteBuffer byteBuffer) {
        if (this.f() && !this.f) {
            this.g(byteBuffer);
        }
    }

    public void j() {
        Object object;
        for (int i8 = 0; i8 < this.a.size(); ++i8) {
            object = (o)this.a.get(i8);
            object.flush();
            object.a();
        }
        this.c = new ByteBuffer[0];
        this.d = object = o.a.e;
        this.e = object;
        this.f = false;
    }
}

