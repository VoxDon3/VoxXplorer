package ax.Ca;

import ax.Ba.b;
import ax.Q8.EnumC0920d;
import ax.Q8.l;
import ax.Q8.u;
import ax.R8.d;
import ax.R8.e;
import ax.R8.h;
import ax.R8.r;
import ax.R8.s;
import ax.o9.C2734a;
import ax.r9.C3016b;
import ax.s9.i;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.util.EnumSet;

/* loaded from: classes3.dex */
public class a extends b implements Closeable, AutoCloseable {
    private static final EnumSet<ax.K8.a> k0;
    private static final EnumSet<ax.K8.a> l0;
    private static final EnumSet<ax.K8.a> m0;
    private final i f0;
    private final ax.Q8.i g0;
    private final int h0;
    private final int i0;
    private final int j0;

    static {
        ax.K8.a aVar = ax.K8.a.STATUS_SUCCESS;
        ax.K8.a aVar2 = ax.K8.a.STATUS_BUFFER_OVERFLOW;
        k0 = EnumSet.of(aVar, aVar2);
        l0 = EnumSet.of(aVar, aVar2, ax.K8.a.STATUS_END_OF_FILE);
        m0 = EnumSet.of(aVar);
    }

    public a(C3016b c3016b, i iVar, String str) throws IOException {
        super(c3016b, iVar.g().b());
        this.f0 = iVar;
        this.g0 = ((e) f(new d(c3016b.j().s0().a(), c3016b.p(), iVar.g().f(), l.Impersonation, EnumSet.of(ax.J8.a.FILE_READ_DATA, ax.J8.a.FILE_WRITE_DATA, ax.J8.a.FILE_APPEND_DATA, ax.J8.a.FILE_READ_EA, ax.J8.a.FILE_WRITE_EA, ax.J8.a.FILE_READ_ATTRIBUTES, ax.J8.a.FILE_WRITE_ATTRIBUTES, ax.J8.a.READ_CONTROL), null, EnumSet.of(u.FILE_SHARE_READ, u.FILE_SHARE_WRITE), EnumC0920d.FILE_OPEN, null, new ax.k9.e(iVar.f(), str)), EnumSet.of(ax.K8.a.STATUS_SUCCESS))).o();
        this.h0 = Math.min(iVar.g().b().P(), c3016b.j().s0().c());
        this.i0 = Math.min(iVar.g().b().I(), c3016b.j().s0().b());
        this.j0 = Math.min(iVar.g().b().S(), c3016b.j().s0().d());
    }

    private ax.R8.i g(byte[] bArr) throws IOException {
        return (ax.R8.i) f(new h(a(), c(), this.f0.g().f(), 1163287L, this.g0, new C2734a(bArr, 0, bArr.length, 0L), true, this.h0), k0);
    }

    private s j() throws IOException {
        return (s) f(new r(a(), this.g0, c(), this.f0.g().f(), 0L, this.i0), l0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f0.a(this.g0);
    }

    public byte[] m() throws IOException {
        s j;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        do {
            j = j();
            try {
                byteArrayOutputStream.write(j.n());
            } catch (IOException e) {
                throw new ax.k9.d(e);
            }
        } while (ax.K8.a.l(j.c().m()).equals(ax.K8.a.STATUS_BUFFER_OVERFLOW));
        return byteArrayOutputStream.toByteArray();
    }

    public byte[] o(byte[] bArr) throws IOException {
        ax.R8.i g = g(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        try {
            byteArrayOutputStream.write(g.n());
            if (ax.K8.a.l(g.c().m()).equals(ax.K8.a.STATUS_BUFFER_OVERFLOW)) {
                byteArrayOutputStream.write(m());
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new ax.k9.d(e);
        }
    }
}
