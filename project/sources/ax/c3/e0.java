package ax.c3;

import ax.b3.C1486a;
import ax.u3.InterfaceC3185c;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class e0 extends H {
    long c0;
    InputStream d0;
    ax.g3.i e0;
    InterfaceC3185c f0;
    long g0;

    public e0(InputStream inputStream, long j, long j2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) {
        super(inputStream);
        this.c0 = j;
        this.e0 = iVar;
        this.g0 = j2;
        this.f0 = interfaceC3185c;
    }

    @Override // ax.c3.H, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // ax.c3.H, java.io.InputStream
    public int read() throws IOException {
        InterfaceC3185c interfaceC3185c = this.f0;
        if (interfaceC3185c != null && interfaceC3185c.isCancelled()) {
            throw new IOException(new C1486a());
        }
        int read = super.read();
        if (read != -1) {
            long j = this.c0 + 1;
            this.c0 = j;
            ax.g3.i iVar = this.e0;
            if (iVar != null) {
                iVar.a(j, this.g0);
            }
        }
        return read;
    }

    @Override // ax.c3.H, java.io.InputStream
    public long skip(long j) throws IOException {
        InterfaceC3185c interfaceC3185c = this.f0;
        if (interfaceC3185c != null && interfaceC3185c.isCancelled()) {
            throw new IOException(new C1486a());
        }
        long skip = this.d0.skip(j);
        if (skip != -1) {
            long j2 = this.c0 + skip;
            this.c0 = j2;
            ax.g3.i iVar = this.e0;
            if (iVar != null) {
                iVar.a(j2, this.g0);
            }
        }
        return skip;
    }

    @Override // ax.c3.H, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        InterfaceC3185c interfaceC3185c = this.f0;
        if (interfaceC3185c != null && interfaceC3185c.isCancelled()) {
            throw new IOException(new C1486a());
        }
        int read = super.read(bArr);
        if (read != -1) {
            long j = this.c0 + read;
            this.c0 = j;
            ax.g3.i iVar = this.e0;
            if (iVar != null) {
                iVar.a(j, this.g0);
            }
        }
        return read;
    }

    @Override // ax.c3.H, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        InterfaceC3185c interfaceC3185c = this.f0;
        if (interfaceC3185c != null && interfaceC3185c.isCancelled()) {
            throw new IOException(new C1486a());
        }
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            long j = this.c0 + read;
            this.c0 = j;
            ax.g3.i iVar = this.e0;
            if (iVar != null) {
                iVar.a(j, this.g0);
            }
        }
        return read;
    }
}
