/*
 * Decompiled with CFR 0.152.
 */
package ax.Cc;

import ax.Ac.a;
import ax.Ac.b;
import ax.Cc.c;
import ax.Cc.e;
import ax.Cc.f;
import ax.Cc.g;
import ax.Cc.h;
import ax.Dc.L;
import ax.Dc.M;
import ax.Kc.n;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class d
extends b {
    private final byte[] d0 = new byte[256];
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
    private Map<String, String> q0 = new HashMap<String, String>();
    private final List<g> r0 = new ArrayList<g>();
    private final boolean s0;

    public d(InputStream inputStream) {
        this(inputStream, 10240, 512);
    }

    public d(InputStream inputStream, int n8, int n9) {
        this(inputStream, n8, n9, null);
    }

    public d(InputStream inputStream, int n8, int n9, String string) {
        this(inputStream, n8, n9, string, false);
    }

    public d(InputStream inputStream, int n8, int n9, String string, boolean bl) {
        this.k0 = inputStream;
        this.h0 = false;
        this.p0 = string;
        this.o0 = M.a(string);
        this.e0 = n9;
        this.f0 = new byte[n9];
        this.g0 = n8;
        this.s0 = bl;
    }

    private void A() throws IOException {
        List<g> list = new ArrayList<g>();
        Map<String, String> map = h.k(this, list, this.q0, this.i0);
        if (map.containsKey("GNU.sparse.map")) {
            list = new ArrayList<g>(h.e(map.get("GNU.sparse.map")));
        }
        this.o();
        if (this.n0 != null) {
            this.e(map, list);
            if (this.n0.r()) {
                list = h.j(this.k0, this.e0);
                this.n0.J(list);
            }
            this.f();
            return;
        }
        throw new IOException("premature end of tar archive. Didn't find any entry after PAX header.");
    }

    private void F() throws IOException {
        this.q0 = h.k(this, this.r0, this.q0, this.i0);
        this.o();
        if (this.n0 != null) {
            return;
        }
        throw new IOException("Error detected parsing the pax header");
    }

    private void H() throws IOException {
        block2: {
            if (this.n0.l()) {
                Object object;
                while ((object = this.q()) != null) {
                    object = new e((byte[])object);
                    this.n0.k().addAll(((e)object).a());
                    if (((e)object).b()) continue;
                    break block2;
                }
                throw new IOException("premature end of tar archive. Didn't find extended_header after header with extended flag.");
            }
        }
        this.f();
    }

    private int W(byte[] byArray, int n8, int n9) throws IOException {
        List<InputStream> list = this.l0;
        if (list != null && !list.isEmpty()) {
            int n10;
            if (this.m0 >= this.l0.size()) {
                return -1;
            }
            int n11 = this.l0.get(this.m0).read(byArray, n8, n9);
            if (this.m0 == this.l0.size() - 1) {
                n10 = n11;
            } else {
                if (n11 == -1) {
                    ++this.m0;
                    return this.W(byArray, n8, n9);
                }
                n10 = n11;
                if (n11 < n9) {
                    ++this.m0;
                    n10 = (n8 = this.W(byArray, n8 + n11, n9 - n11)) == -1 ? n11 : n11 + n8;
                }
            }
            return n10;
        }
        return this.k0.read(byArray, n8, n9);
    }

    private void e(Map<String, String> map, List<g> list) throws IOException {
        this.n0.M(map);
        this.n0.J(list);
    }

    private void f() throws IOException {
        this.m0 = -1;
        this.l0 = new ArrayList<InputStream>();
        Object object = this.n0.i();
        f f8 = new f();
        object = object.iterator();
        long l8 = 0L;
        while (object.hasNext()) {
            g g8 = (g)object.next();
            long l9 = g8.b() - l8 - 0L;
            long l10 = l9 == 0L ? 0 : (l9 < 0L ? -1 : 1);
            if (l10 >= 0) {
                if (l10 > 0) {
                    this.l0.add(new ax.Kc.d(f8, g8.b() - l8));
                }
                if (g8.a() > 0L) {
                    this.l0.add(new ax.Kc.d(this.k0, g8.a()));
                }
                l8 = g8.b() + g8.a();
                continue;
            }
            throw new IOException("Corrupted struct sparse detected");
        }
        if (!this.l0.isEmpty()) {
            this.m0 = 0;
        }
    }

    private void g() throws IOException {
        long l8 = this.c();
        int n8 = this.g0;
        if ((l8 %= (long)n8) > 0L) {
            this.b(n.i(this.k0, (long)n8 - l8));
        }
    }

    private boolean isDirectory() {
        c c8 = this.n0;
        return c8 != null && c8.isDirectory();
    }

    private long j(long l8, long l9, long l10) throws IOException {
        long l11 = l9;
        if (this.k0 instanceof FileInputStream) {
            l11 = Math.min(l9, l8);
        }
        if (l11 == l10) {
            return l11;
        }
        throw new IOException("Truncated TAR archive");
    }

    private void o0() throws IOException {
        long l8;
        if (!this.isDirectory() && (l8 = this.i0) > 0L && l8 % (long)this.e0 != 0L) {
            l8 = this.k0.available();
            long l9 = this.i0;
            int n8 = this.e0;
            l9 = (l9 / (long)n8 + 1L) * (long)n8 - l9;
            this.b(this.j(l8, n.i(this.k0, l9), l9));
            return;
        }
    }

    private byte[] q() throws IOException {
        byte[] byArray = this.L();
        this.d0(this.v(byArray));
        byte[] byArray2 = byArray;
        if (this.u()) {
            byArray2 = byArray;
            if (byArray != null) {
                this.u0();
                this.g();
                byArray2 = null;
            }
        }
        return byArray2;
    }

    private long s0(long l8) throws IOException {
        List<InputStream> list = this.l0;
        if (list != null && !list.isEmpty()) {
            long l9 = 0L;
            while (l9 < l8 && this.m0 < this.l0.size()) {
                long l10;
                l9 = l10 = l9 + this.l0.get(this.m0).skip(l8 - l9);
                if (l10 >= l8) continue;
                ++this.m0;
                l9 = l10;
            }
            return l9;
        }
        return this.k0.skip(l8);
    }

    private void u0() throws IOException {
        block4: {
            boolean bl = this.k0.markSupported();
            if (bl) {
                this.k0.mark(this.e0);
            }
            try {
                boolean bl2 = this.v(this.L());
                if (bl2 || !bl) break block4;
                this.d(this.e0);
            }
            catch (Throwable throwable) {
                if (bl) {
                    this.d(this.e0);
                    this.k0.reset();
                }
                throw throwable;
            }
            this.k0.reset();
        }
    }

    protected byte[] L() throws IOException {
        int n8 = n.d(this.k0, this.f0);
        this.a(n8);
        if (n8 != this.e0) {
            return null;
        }
        return this.f0;
    }

    @Override
    public int available() throws IOException {
        if (this.isDirectory()) {
            return 0;
        }
        if (this.n0.j() - this.j0 > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return (int)(this.n0.j() - this.j0);
    }

    @Override
    public void close() throws IOException {
        List<InputStream> list = this.l0;
        if (list != null) {
            list = list.iterator();
            while (list.hasNext()) {
                ((InputStream)list.next()).close();
            }
        }
        this.k0.close();
    }

    protected final void d0(boolean bl) {
        this.h0 = bl;
    }

    protected byte[] m() throws IOException {
        int n8;
        Object object = new ByteArrayOutputStream();
        while ((n8 = this.read(this.d0)) >= 0) {
            ((ByteArrayOutputStream)object).write(this.d0, 0, n8);
        }
        this.o();
        if (this.n0 == null) {
            return null;
        }
        object = ((ByteArrayOutputStream)object).toByteArray();
        for (n8 = ((Object)object).length; n8 > 0 && object[n8 - 1] == false; --n8) {
        }
        if (n8 != ((Object)object).length) {
            byte[] byArray = new byte[n8];
            System.arraycopy(object, 0, byArray, 0, n8);
            return byArray;
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public void mark(int n8) {
        // MONITORENTER : this
        // MONITOREXIT : this
    }

    @Override
    public boolean markSupported() {
        return false;
    }

    public a o() throws IOException {
        return this.p();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public c p() throws IOException {
        block16: {
            block15: {
                Object object;
                Object object2;
                if (this.u()) {
                    return null;
                }
                if (this.n0 != null) {
                    n.i(this, Long.MAX_VALUE);
                    this.o0();
                }
                if ((object2 = this.q()) == null) {
                    this.n0 = null;
                    return null;
                }
                try {
                    object = new c((byte[])object2, this.o0, this.s0);
                    this.n0 = object;
                    this.j0 = 0L;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw new IOException("Error detected parsing the header", illegalArgumentException);
                }
                this.i0 = ((c)object).getSize();
                if (this.n0.m()) {
                    object = this.m();
                    if (object == null) {
                        return null;
                    }
                    this.n0.F(this.o0.a((byte[])object));
                }
                if (this.n0.n()) {
                    object = this.m();
                    if (object == null) {
                        return null;
                    }
                    object = this.o0.a((byte[])object);
                    this.n0.H((String)object);
                    if (this.n0.isDirectory() && !((String)object).endsWith("/")) {
                        object2 = this.n0;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append((String)object);
                        stringBuilder.append("/");
                        ((c)object2).H(stringBuilder.toString());
                    }
                }
                if (this.n0.p()) {
                    this.F();
                }
                try {
                    if (!this.n0.t()) break block15;
                    this.A();
                    break block16;
                }
                catch (NumberFormatException numberFormatException) {
                    throw new IOException("Error detected parsing the pax header", numberFormatException);
                }
            }
            if (!this.q0.isEmpty()) {
                this.e(this.q0, this.r0);
            }
        }
        if (this.n0.q()) {
            this.H();
        }
        this.i0 = this.n0.getSize();
        return this.n0;
    }

    @Override
    public int read(byte[] byArray, int n8, int n9) throws IOException {
        if (n9 == 0) {
            return 0;
        }
        if (!this.u() && !this.isDirectory()) {
            c c8 = this.n0;
            if (c8 != null) {
                if (this.j0 >= c8.j()) {
                    return -1;
                }
                n9 = Math.min(n9, this.available());
                n8 = this.n0.u() ? this.W(byArray, n8, n9) : this.k0.read(byArray, n8, n9);
                if (n8 == -1) {
                    if (n9 <= 0) {
                        this.d0(true);
                        return n8;
                    }
                    throw new IOException("Truncated TAR archive");
                }
                this.a(n8);
                this.j0 += (long)n8;
                return n8;
            }
            throw new IllegalStateException("No current tar entry");
        }
        return -1;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public void reset() {
        // MONITORENTER : this
        // MONITOREXIT : this
    }

    @Override
    public long skip(long l8) throws IOException {
        if (l8 > 0L && !this.isDirectory()) {
            long l9 = this.k0.available();
            l8 = Math.min(l8, this.n0.j() - this.j0);
            l8 = !this.n0.u() ? this.j(l9, n.i(this.k0, l8), l8) : this.s0(l8);
            this.b(l8);
            this.j0 += l8;
            return l8;
        }
        return 0L;
    }

    protected final boolean u() {
        return this.h0;
    }

    protected boolean v(byte[] byArray) {
        return byArray == null || ax.Kc.a.a(byArray, this.e0);
        {
        }
    }
}

