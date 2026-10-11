/*
 * Decompiled with CFR 0.152.
 */
package ax.xc;

import ax.Gb.l;
import ax.xc.A;
import ax.xc.C;
import ax.xc.D;
import ax.xc.e;
import ax.xc.f;
import ax.xc.h;
import java.nio.ByteBuffer;

public final class v
implements f,
AutoCloseable {
    public final e c0;
    public boolean d0;
    public final A q;

    public v(A a8) {
        l.f(a8, "sink");
        this.q = a8;
        this.c0 = new e();
    }

    @Override
    public f G() {
        if (!this.d0) {
            long l8 = this.c0.size();
            if (l8 > 0L) {
                this.q.write(this.c0, l8);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override
    public f I0(h h8) {
        l.f(h8, "byteString");
        if (!this.d0) {
            this.c0.f1(h8);
            return this.R();
        }
        throw new IllegalStateException("closed");
    }

    @Override
    public long M(C c8) {
        long l8;
        l.f(c8, "source");
        long l9 = 0L;
        while ((l8 = c8.read(this.c0, 8192L)) != -1L) {
            l9 += l8;
            this.R();
        }
        return l9;
    }

    @Override
    public f Q0(long l8) {
        if (!this.d0) {
            this.c0.k1(l8);
            return this.R();
        }
        throw new IllegalStateException("closed");
    }

    @Override
    public f R() {
        if (!this.d0) {
            long l8 = this.c0.d();
            if (l8 > 0L) {
                this.q.write(this.c0, l8);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override
    public void close() {
        if (!this.d0) {
            Object object;
            block8: {
                e e8;
                block7: {
                    block6: {
                        try {
                            if (this.c0.size() <= 0L) break block6;
                            object = this.q;
                            e8 = this.c0;
                            object.write(e8, e8.size());
                        }
                        catch (Throwable throwable) {
                            break block7;
                        }
                    }
                    e8 = null;
                }
                try {
                    this.q.close();
                    object = e8;
                }
                catch (Throwable throwable) {
                    object = e8;
                    if (e8 != null) break block8;
                    object = throwable;
                }
            }
            this.d0 = true;
            if (object != null) {
                throw object;
            }
        }
    }

    @Override
    public f f0(String string) {
        l.f(string, "string");
        if (!this.d0) {
            this.c0.r1(string);
            return this.R();
        }
        throw new IllegalStateException("closed");
    }

    @Override
    public void flush() {
        if (!this.d0) {
            if (this.c0.size() > 0L) {
                A a8 = this.q;
                e e8 = this.c0;
                a8.write(e8, e8.size());
            }
            this.q.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override
    public boolean isOpen() {
        return this.d0 ^ true;
    }

    @Override
    public e k() {
        return this.c0;
    }

    @Override
    public f l0(long l8) {
        if (!this.d0) {
            this.c0.l1(l8);
            return this.R();
        }
        throw new IllegalStateException("closed");
    }

    @Override
    public D timeout() {
        return this.q.timeout();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("buffer(");
        stringBuilder.append(this.q);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    @Override
    public int write(ByteBuffer byteBuffer) {
        l.f(byteBuffer, "source");
        if (!this.d0) {
            int n8 = this.c0.write(byteBuffer);
            this.R();
            return n8;
        }
        throw new IllegalStateException("closed");
    }

    @Override
    public f write(byte[] byArray) {
        l.f(byArray, "source");
        if (!this.d0) {
            this.c0.h1(byArray);
            return this.R();
        }
        throw new IllegalStateException("closed");
    }

    @Override
    public f write(byte[] byArray, int n8, int n9) {
        l.f(byArray, "source");
        if (!this.d0) {
            this.c0.i1(byArray, n8, n9);
            return this.R();
        }
        throw new IllegalStateException("closed");
    }

    @Override
    public void write(e e8, long l8) {
        l.f(e8, "source");
        if (!this.d0) {
            this.c0.write(e8, l8);
            this.R();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override
    public f writeByte(int n8) {
        if (!this.d0) {
            this.c0.j1(n8);
            return this.R();
        }
        throw new IllegalStateException("closed");
    }

    @Override
    public f writeInt(int n8) {
        if (!this.d0) {
            this.c0.m1(n8);
            return this.R();
        }
        throw new IllegalStateException("closed");
    }

    @Override
    public f writeShort(int n8) {
        if (!this.d0) {
            this.c0.o1(n8);
            return this.R();
        }
        throw new IllegalStateException("closed");
    }
}

