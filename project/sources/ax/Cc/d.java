package ax.Cc;

import ax.Dc.L;
import ax.Dc.M;
import ax.Kc.n;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class d extends ax.Ac.b {
    private final byte[] d0;
    private final int e0;
    private final byte[] f0;
    private final int g0;
    private boolean h0;
    private long i0;
    private long j0;
    private final InputStream k0;
    private List<InputStream> l0;
    private int m0;
    private c n0;
    private final L o0;
    final String p0;
    private Map<String, String> q0;
    private final List<g> r0;
    private final boolean s0;

    public d(InputStream inputStream) {
        this(inputStream, 10240, 512);
    }

    private void A() throws IOException {
        ArrayList arrayList = new ArrayList();
        Map<String, String> k = h.k(this, arrayList, this.q0, this.i0);
        if (k.containsKey("GNU.sparse.map")) {
            arrayList = new ArrayList(h.e(k.get("GNU.sparse.map")));
        }
        o();
        if (this.n0 == null) {
            throw new IOException("premature end of tar archive. Didn't find any entry after PAX header.");
        }
        e(k, arrayList);
        if (this.n0.r()) {
            this.n0.J(h.j(this.k0, this.e0));
        }
        f();
    }

    private void F() throws IOException {
        this.q0 = h.k(this, this.r0, this.q0, this.i0);
        o();
        if (this.n0 == null) {
            throw new IOException("Error detected parsing the pax header");
        }
    }

    private void H() throws IOException {
        e eVar;
        if (this.n0.l()) {
            do {
                byte[] q = q();
                if (q == null) {
                    throw new IOException("premature end of tar archive. Didn't find extended_header after header with extended flag.");
                }
                eVar = new e(q);
                this.n0.k().addAll(eVar.a());
            } while (eVar.b());
        }
        f();
    }

    private int W(byte[] bArr, int i, int i2) throws IOException {
        List<InputStream> list = this.l0;
        if (list == null || list.isEmpty()) {
            return this.k0.read(bArr, i, i2);
        }
        if (this.m0 >= this.l0.size()) {
            return -1;
        }
        int read = this.l0.get(this.m0).read(bArr, i, i2);
        if (this.m0 == this.l0.size() - 1) {
            return read;
        }
        if (read == -1) {
            this.m0++;
            return W(bArr, i, i2);
        }
        if (read >= i2) {
            return read;
        }
        this.m0++;
        int W = W(bArr, i + read, i2 - read);
        return W == -1 ? read : read + W;
    }

    private void e(Map<String, String> map, List<g> list) throws IOException {
        this.n0.M(map);
        this.n0.J(list);
    }

    private void f() throws IOException {
        this.m0 = -1;
        this.l0 = new ArrayList();
        List<g> i = this.n0.i();
        f fVar = new f();
        long j = 0;
        for (g gVar : i) {
            long b = gVar.b() - j;
            if (b < 0) {
                throw new IOException("Corrupted struct sparse detected");
            }
            if (b > 0) {
                this.l0.add(new ax.Kc.d(fVar, gVar.b() - j));
            }
            if (gVar.a() > 0) {
                this.l0.add(new ax.Kc.d(this.k0, gVar.a()));
            }
            j = gVar.b() + gVar.a();
        }
        if (this.l0.isEmpty()) {
            return;
        }
        this.m0 = 0;
    }

    private void g() throws IOException {
        long c = c();
        int i = this.g0;
        long j = c % i;
        if (j > 0) {
            b(n.i(this.k0, i - j));
        }
    }

    private boolean isDirectory() {
        c cVar = this.n0;
        return cVar != null && cVar.isDirectory();
    }

    private long j(long j, long j2, long j3) throws IOException {
        if (this.k0 instanceof FileInputStream) {
            j2 = Math.min(j2, j);
        }
        if (j2 == j3) {
            return j2;
        }
        throw new IOException("Truncated TAR archive");
    }

    private void o0() throws IOException {
        if (!isDirectory()) {
            long j = this.i0;
            if (j > 0 && j % this.e0 != 0) {
                long available = this.k0.available();
                long j2 = this.i0;
                int i = this.e0;
                long j3 = (((j2 / i) + 1) * i) - j2;
                b(j(available, n.i(this.k0, j3), j3));
            }
        }
    }

    private byte[] q() throws IOException {
        byte[] L = L();
        d0(v(L));
        if (!u() || L == null) {
            return L;
        }
        u0();
        g();
        return null;
    }

    private long s0(long j) throws IOException {
        List<InputStream> list = this.l0;
        if (list == null || list.isEmpty()) {
            return this.k0.skip(j);
        }
        long j2 = 0;
        while (j2 < j && this.m0 < this.l0.size()) {
            j2 += this.l0.get(this.m0).skip(j - j2);
            if (j2 < j) {
                this.m0++;
            }
        }
        return j2;
    }

    private void u0() throws IOException {
        boolean markSupported = this.k0.markSupported();
        if (markSupported) {
            this.k0.mark(this.e0);
        }
        try {
            if (v(L()) || !markSupported) {
            }
        } finally {
            if (markSupported) {
                d(this.e0);
                this.k0.reset();
            }
        }
    }

    protected byte[] L() throws IOException {
        int d = n.d(this.k0, this.f0);
        a(d);
        if (d != this.e0) {
            return null;
        }
        return this.f0;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (isDirectory()) {
            return 0;
        }
        return this.n0.j() - this.j0 > 2147483647L ? SubsamplingScaleImageView.TILE_SIZE_AUTO : (int) (this.n0.j() - this.j0);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        List<InputStream> list = this.l0;
        if (list != null) {
            Iterator<InputStream> it = list.iterator();
            while (it.hasNext()) {
                it.next().close();
            }
        }
        this.k0.close();
    }

    protected final void d0(boolean z) {
        this.h0 = z;
    }

    protected byte[] m() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = read(this.d0);
            if (read < 0) {
                break;
            }
            byteArrayOutputStream.write(this.d0, 0, read);
        }
        o();
        if (this.n0 == null) {
            return null;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        while (length > 0 && byteArray[length - 1] == 0) {
            length--;
        }
        if (length == byteArray.length) {
            return byteArray;
        }
        byte[] bArr = new byte[length];
        System.arraycopy(byteArray, 0, bArr, 0, length);
        return bArr;
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    public ax.Ac.a o() throws IOException {
        return p();
    }

    public c p() throws IOException {
        if (u()) {
            return null;
        }
        if (this.n0 != null) {
            n.i(this, Long.MAX_VALUE);
            o0();
        }
        byte[] q = q();
        if (q == null) {
            this.n0 = null;
            return null;
        }
        try {
            c cVar = new c(q, this.o0, this.s0);
            this.n0 = cVar;
            this.j0 = 0L;
            this.i0 = cVar.getSize();
            if (this.n0.m()) {
                byte[] m = m();
                if (m == null) {
                    return null;
                }
                this.n0.F(this.o0.a(m));
            }
            if (this.n0.n()) {
                byte[] m2 = m();
                if (m2 == null) {
                    return null;
                }
                String a = this.o0.a(m2);
                this.n0.H(a);
                if (this.n0.isDirectory() && !a.endsWith("/")) {
                    this.n0.H(a + "/");
                }
            }
            if (this.n0.p()) {
                F();
            }
            try {
                if (this.n0.t()) {
                    A();
                } else if (!this.q0.isEmpty()) {
                    e(this.q0, this.r0);
                }
                if (this.n0.q()) {
                    H();
                }
                this.i0 = this.n0.getSize();
                return this.n0;
            } catch (NumberFormatException e) {
                throw new IOException("Error detected parsing the pax header", e);
            }
        } catch (IllegalArgumentException e2) {
            throw new IOException("Error detected parsing the header", e2);
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (u() || isDirectory()) {
            return -1;
        }
        c cVar = this.n0;
        if (cVar == null) {
            throw new IllegalStateException("No current tar entry");
        }
        if (this.j0 >= cVar.j()) {
            return -1;
        }
        int min = Math.min(i2, available());
        int W = this.n0.u() ? W(bArr, i, min) : this.k0.read(bArr, i, min);
        if (W != -1) {
            a(W);
            this.j0 += W;
            return W;
        }
        if (min > 0) {
            throw new IOException("Truncated TAR archive");
        }
        d0(true);
        return W;
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        d dVar;
        long s0;
        if (j <= 0 || isDirectory()) {
            return 0L;
        }
        long available = this.k0.available();
        long min = Math.min(j, this.n0.j() - this.j0);
        if (this.n0.u()) {
            dVar = this;
            s0 = s0(min);
        } else {
            s0 = j(available, n.i(this.k0, min), min);
            dVar = this;
        }
        b(s0);
        dVar.j0 += s0;
        return s0;
    }

    protected final boolean u() {
        return this.h0;
    }

    protected boolean v(byte[] bArr) {
        return bArr == null || ax.Kc.a.a(bArr, this.e0);
    }

    public d(InputStream inputStream, int i, int i2) {
        this(inputStream, i, i2, null);
    }

    public d(InputStream inputStream, int i, int i2, String str) {
        this(inputStream, i, i2, str, false);
    }

    public d(InputStream inputStream, int i, int i2, String str, boolean z) {
        this.d0 = new byte[256];
        this.q0 = new HashMap();
        this.r0 = new ArrayList();
        this.k0 = inputStream;
        this.h0 = false;
        this.p0 = str;
        this.o0 = M.a(str);
        this.e0 = i2;
        this.f0 = new byte[i2];
        this.g0 = i;
        this.s0 = z;
    }
}
