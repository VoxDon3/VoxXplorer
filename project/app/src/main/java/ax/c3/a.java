/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

import ax.Dc.D;
import ax.Dc.I;
import ax.Dc.U;
import ax.Dc.W;
import ax.c3.d0;
import ax.c3.v;
import ax.u3.b;
import com.alphainventor.filemanager.file.n;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a
extends n {
    private I k0;
    private String l0;
    private List<a> m0;
    private File n0;
    private a o0;
    private String p0;
    private String q0;
    private boolean r0;

    public a(com.alphainventor.filemanager.file.b b8, I i8, a a8) {
        super(b8);
        if (a8 == null) {
            b.c("/".equals(i8.getName()));
        }
        this.o0 = a8;
        this.k0 = i8;
        this.p0 = d0.h(d0.U(i8.getName()));
        if (i8.isDirectory()) {
            this.m0 = new ArrayList<a>();
        }
        this.g0();
        this.r0 = b8.D0();
    }

    public a(com.alphainventor.filemanager.file.b b8, a a8, I i8, List<a> list, String string) {
        super(b8);
        if (a8 == null) {
            b.c("/".equals(i8.getName()));
        }
        this.o0 = a8;
        this.k0 = i8;
        this.p0 = string;
        this.m0 = list;
        this.g0();
        this.r0 = b8.D0();
    }

    public a(com.alphainventor.filemanager.file.b b8, String string) {
        super(b8);
        this.q0 = string;
        this.g0();
        this.r0 = b8.D0();
    }

    private void g0() {
        this.l0 = v.e(this, "");
    }

    @Override
    public String C() {
        return d0.h(this.F());
    }

    @Override
    public String F() {
        if (this.n()) {
            a a8 = this.o0;
            if (a8 == null) {
                return d0.Q(d0.a, this.p0);
            }
            return d0.Q(a8.E(), this.p0);
        }
        return this.q0;
    }

    @Override
    public String U() {
        return d0.r(this.F());
    }

    @Override
    public boolean d() {
        return this.n();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void e0(a a8) {
        if (this.m0 == null) {
            this.m0 = new ArrayList<a>();
        }
        List<a> list = this.m0;
        synchronized (list) {
            try {
                Iterator<a> iterator = this.m0.iterator();
                while (true) {
                    if (!iterator.hasNext()) {
                        this.m0.add(a8);
                        return;
                    }
                    if (!iterator.next().E().equals(a8.E())) continue;
                    iterator.remove();
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public int f0(n n8) {
        return this.E().compareTo(n8.E());
    }

    @Override
    public boolean h() {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public a h0(String object) {
        List<a> list = this.m0;
        if (list == null) return null;
        synchronized (list) {
            try {
                n n8;
                Iterator<a> iterator = this.m0.iterator();
                do {
                    if (!iterator.hasNext()) return null;
                } while (!((String)object).equals((n8 = (n)iterator.next()).B()));
                return (a)n8;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public List<a> i0() {
        return this.m0;
    }

    @Override
    public boolean isDirectory() {
        return this.m0 != null;
    }

    @Override
    public boolean j() {
        if (this.r0) {
            return this.n();
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List<n> j0() {
        List<a> list = this.m0;
        if (list == null) {
            return new ArrayList<n>();
        }
        synchronized (list) {
            return new ArrayList<n>(this.m0);
        }
    }

    public String k0() {
        return this.p0;
    }

    @Override
    public boolean l() {
        return false;
    }

    public I l0() {
        return this.k0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void m0(a a8) {
        List<a> list = this.m0;
        if (list == null) {
            return;
        }
        synchronized (list) {
            this.m0.remove(a8);
            return;
        }
    }

    @Override
    public boolean n() {
        return this.k0 != null;
    }

    public void n0() {
        b.a(this.n());
        this.m0 = new ArrayList<a>();
    }

    public void o0(File file) {
        this.n0 = file;
    }

    @Override
    public long p() {
        I i8 = this.k0;
        if (i8 == null) {
            return 0L;
        }
        File file = this.n0;
        if (file != null) {
            return file.length();
        }
        return i8.getSize();
    }

    public void p0(a a8) {
        this.o0 = a8;
    }

    @Override
    public long q() {
        Object object = this.n0;
        if (object != null) {
            return ((File)object).lastModified();
        }
        object = this.k0;
        if (object != null) {
            if ((object = ((I)object).n(new W(21589))) instanceof D && (object = ((D)object).n()) != null) {
                return (long)((U)object).d() * 1000L;
            }
            return this.k0.getTime();
        }
        return -1L;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void q0() {
        List<a> list = this.m0;
        if (list == null) {
            return;
        }
        synchronized (list) {
            try {
                Iterator<a> iterator = this.m0.iterator();
                while (true) {
                    if (!iterator.hasNext()) {
                        return;
                    }
                    iterator.next().p0(this);
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public int r(boolean bl) {
        if (!this.isDirectory()) {
            return -2;
        }
        List<a> list = this.m0;
        if (list != null) {
            return list.size();
        }
        return -1;
    }

    @Override
    public String s() {
        return this.l0;
    }

    @Override
    public String t() {
        return com.alphainventor.filemanager.file.b.g1(this.F(), this.isDirectory());
    }
}

