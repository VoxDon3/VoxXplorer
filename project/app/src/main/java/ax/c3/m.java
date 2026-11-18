/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

import ax.G4.P;
import ax.G4.k;
import ax.G4.t;
import ax.G4.x;
import ax.c3.d0;
import ax.c3.v;
import com.voxdon.xplorer.file.n;
import java.io.File;

public class m
extends n {
    private P k0;
    private String l0;
    private Long m0;
    private String n0;
    private t o0;
    private x p0;
    private boolean q0;
    private String r0;

    public m(com.voxdon.xplorer.file.k k8, P p8) {
        super(k8);
        this.k0 = p8;
        this.l0 = p8.b();
        this.n0 = p8.c();
        if (p8 instanceof t) {
            this.q0 = false;
            this.o0 = (t)p8;
            return;
        }
        if (p8 instanceof x) {
            this.q0 = true;
            this.p0 = (x)p8;
            return;
        }
        this.q0 = false;
    }

    public m(com.voxdon.xplorer.file.k k8, String string) {
        super(k8);
        this.l0 = string;
        if ("/".equals(string)) {
            this.q0 = true;
            return;
        }
        this.q0 = false;
    }

    @Override
    public String C() {
        Object object = this.k0;
        if (object != null) {
            return ((P)object).a();
        }
        object = this.l0;
        return ((String)object).substring(((String)object).lastIndexOf(File.separator) + 1);
    }

    @Override
    public String F() {
        String string = this.l0;
        if (string != null) {
            return string;
        }
        return this.n0;
    }

    @Override
    public String U() {
        return d0.r(this.l0);
    }

    @Override
    public boolean d() {
        return true;
    }

    public int e0(n n8) {
        try {
            int n9 = this.l0.compareTo(((m)n8).l0);
            return n9;
        }
        catch (ClassCastException classCastException) {
            return -1;
        }
    }

    @Override
    public boolean h() {
        return false;
    }

    public int hashCode() {
        P p8 = this.k0;
        if (p8 != null) {
            return p8.hashCode();
        }
        return this.l0.hashCode();
    }

    @Override
    public boolean isDirectory() {
        return this.q0;
    }

    @Override
    public boolean j() {
        return true;
    }

    @Override
    public boolean l() {
        return false;
    }

    @Override
    public boolean n() {
        if ("/".equals(this.l0)) {
            return true;
        }
        P p8 = this.k0;
        if (p8 == null) {
            return false;
        }
        return p8 instanceof k ^ true;
    }

    @Override
    public long p() {
        t t8 = this.o0;
        if (t8 != null) {
            return t8.f();
        }
        return 0L;
    }

    @Override
    public long q() {
        if (this.m0 == null) {
            t t8;
            this.m0 = this.isDirectory() ? Long.valueOf(0L) : ((t8 = this.o0) != null ? Long.valueOf(t8.e().getTime()) : Long.valueOf(-1L));
        }
        return this.m0;
    }

    @Override
    public int r(boolean bl) {
        if (!this.q0) {
            return -2;
        }
        return this.X();
    }

    @Override
    public String s() {
        if (this.r0 == null) {
            this.r0 = v.e(this, "application/octet-stream");
        }
        return this.r0;
    }

    @Override
    public String t() {
        return this.l0;
    }
}

