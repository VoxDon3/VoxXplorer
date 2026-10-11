package ax.xc;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class v implements InterfaceC3488f, AutoCloseable {
    public final C3487e c0;
    public boolean d0;
    public final InterfaceC3482A q;

    public v(InterfaceC3482A interfaceC3482A) {
        ax.Gb.l.f(interfaceC3482A, "sink");
        this.q = interfaceC3482A;
        this.c0 = new C3487e();
    }

    @Override // ax.xc.InterfaceC3488f
    public InterfaceC3488f G() {
        if (this.d0) {
            throw new IllegalStateException("closed");
        }
        long size = this.c0.size();
        if (size > 0) {
            this.q.write(this.c0, size);
        }
        return this;
    }

    @Override // ax.xc.InterfaceC3488f
    public InterfaceC3488f I0(h hVar) {
        ax.Gb.l.f(hVar, "byteString");
        if (this.d0) {
            throw new IllegalStateException("closed");
        }
        this.c0.I0(hVar);
        return R();
    }

    @Override // ax.xc.InterfaceC3488f
    public long M(C c) {
        ax.Gb.l.f(c, "source");
        long j = 0;
        while (true) {
            long read = c.read(this.c0, 8192L);
            if (read == -1) {
                return j;
            }
            j += read;
            R();
        }
    }

    @Override // ax.xc.InterfaceC3488f
    public InterfaceC3488f Q0(long j) {
        if (this.d0) {
            throw new IllegalStateException("closed");
        }
        this.c0.Q0(j);
        return R();
    }

    @Override // ax.xc.InterfaceC3488f
    public InterfaceC3488f R() {
        if (this.d0) {
            throw new IllegalStateException("closed");
        }
        long d = this.c0.d();
        if (d > 0) {
            this.q.write(this.c0, d);
        }
        return this;
    }

    @Override // ax.xc.InterfaceC3482A, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
        if (this.d0) {
            return;
        }
        try {
            if (this.c0.size() > 0) {
                InterfaceC3482A interfaceC3482A = this.q;
                C3487e c3487e = this.c0;
                interfaceC3482A.write(c3487e, c3487e.size());
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.q.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.d0 = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // ax.xc.InterfaceC3488f
    public InterfaceC3488f f0(String str) {
        ax.Gb.l.f(str, "string");
        if (this.d0) {
            throw new IllegalStateException("closed");
        }
        this.c0.f0(str);
        return R();
    }

    @Override // ax.xc.InterfaceC3488f, ax.xc.InterfaceC3482A, java.io.Flushable
    public void flush() {
        if (this.d0) {
            throw new IllegalStateException("closed");
        }
        if (this.c0.size() > 0) {
            InterfaceC3482A interfaceC3482A = this.q;
            C3487e c3487e = this.c0;
            interfaceC3482A.write(c3487e, c3487e.size());
        }
        this.q.flush();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.d0;
    }

    @Override // ax.xc.InterfaceC3488f
    public C3487e k() {
        return this.c0;
    }

    @Override // ax.xc.InterfaceC3488f
    public InterfaceC3488f l0(long j) {
        if (this.d0) {
            throw new IllegalStateException("closed");
        }
        this.c0.l0(j);
        return R();
    }

    @Override // ax.xc.InterfaceC3482A
    public D timeout() {
        return this.q.timeout();
    }

    public String toString() {
        return "buffer(" + this.q + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        ax.Gb.l.f(byteBuffer, "source");
        if (this.d0) {
            throw new IllegalStateException("closed");
        }
        int write = this.c0.write(byteBuffer);
        R();
        return write;
    }

    @Override // ax.xc.InterfaceC3488f
    public InterfaceC3488f writeByte(int i) {
        if (this.d0) {
            throw new IllegalStateException("closed");
        }
        this.c0.writeByte(i);
        return R();
    }

    @Override // ax.xc.InterfaceC3488f
    public InterfaceC3488f writeInt(int i) {
        if (this.d0) {
            throw new IllegalStateException("closed");
        }
        this.c0.writeInt(i);
        return R();
    }

    @Override // ax.xc.InterfaceC3488f
    public InterfaceC3488f writeShort(int i) {
        if (this.d0) {
            throw new IllegalStateException("closed");
        }
        this.c0.writeShort(i);
        return R();
    }

    @Override // ax.xc.InterfaceC3482A
    public void write(C3487e c3487e, long j) {
        ax.Gb.l.f(c3487e, "source");
        if (!this.d0) {
            this.c0.write(c3487e, j);
            R();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // ax.xc.InterfaceC3488f
    public InterfaceC3488f write(byte[] bArr) {
        ax.Gb.l.f(bArr, "source");
        if (!this.d0) {
            this.c0.write(bArr);
            return R();
        }
        throw new IllegalStateException("closed");
    }

    @Override // ax.xc.InterfaceC3488f
    public InterfaceC3488f write(byte[] bArr, int i, int i2) {
        ax.Gb.l.f(bArr, "source");
        if (!this.d0) {
            this.c0.write(bArr, i, i2);
            return R();
        }
        throw new IllegalStateException("closed");
    }
}
