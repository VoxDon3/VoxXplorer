/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

import ax.Sc.e;
import ax.Sc.i;
import ax.c3.d0;
import ax.c3.v;
import com.alphainventor.filemanager.file.n;
import com.alphainventor.filemanager.file.q;
import java.io.IOException;

public class D
extends n {
    private i k0;
    private String l0;
    private String m0;
    private Long n0;
    private Boolean o0;
    private boolean p0;
    private boolean q0;
    private boolean r0;

    public D(q q8, e e8, i i8, String string, boolean bl) {
        super(q8);
        this.k0 = i8;
        this.l0 = string;
        this.q0 = bl;
        if (i8 != null && i8.h()) {
            this.p0 = true;
            this.g0(e8, i8, d0.r(string));
        }
        this.f0();
    }

    public D(q q8, String string, boolean bl) {
        this(q8, null, null, string, false);
        this.o0 = bl;
        this.r0 = bl;
    }

    private void f0() {
        this.m0 = v.e(this, "");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void g0(e e8, i i8, String string) {
        String string2 = i8.a();
        if (string2.endsWith("/")) {
            i8.q(1);
            return;
        }
        try {
            boolean bl = string2.startsWith("/") ? e8.B0(string2) : e8.B0(d0.Q(string, string2));
            if (!bl) return;
            i8.q(1);
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    @Override
    public String C() {
        i i8 = this.k0;
        if (i8 != null) {
            if (this.q0) {
                return i8.b().trim();
            }
            return i8.b();
        }
        return d0.h(this.l0);
    }

    @Override
    public String F() {
        return this.l0;
    }

    @Override
    public String U() {
        return d0.r(this.l0);
    }

    @Override
    public boolean d() {
        i i8 = this.k0;
        if (i8 == null) {
            return false;
        }
        return i8.f(0, 0) || this.k0.f(1, 0) || this.k0.f(2, 0);
        {
        }
    }

    public int e0(n n8) {
        try {
            int n9 = this.l0.compareTo(((D)n8).l0);
            return n9;
        }
        catch (ClassCastException classCastException) {
            return -1;
        }
    }

    @Override
    public boolean h() {
        return this.C().startsWith(".");
    }

    @Override
    public boolean isDirectory() {
        if (this.r0) {
            return true;
        }
        if ("/".equals(this.l0)) {
            return true;
        }
        i i8 = this.k0;
        return i8 != null && i8.g();
    }

    @Override
    public boolean j() {
        i i8 = this.k0;
        if (i8 == null) {
            return false;
        }
        return i8.f(0, 1) || this.k0.f(1, 1) || this.k0.f(2, 1);
        {
        }
    }

    @Override
    public boolean l() {
        return this.p0;
    }

    @Override
    public boolean n() {
        if (this.o0 == null) {
            if ("/".equals(this.l0)) {
                this.o0 = Boolean.TRUE;
            } else {
                boolean bl = this.k0 != null;
                this.o0 = bl;
            }
        }
        return this.o0;
    }

    @Override
    public long p() {
        i i8 = this.k0;
        if (i8 != null) {
            return i8.d();
        }
        return 0L;
    }

    @Override
    public long q() {
        if (this.n0 == null) {
            i i8 = this.k0;
            this.n0 = i8 != null && i8.e() != null ? Long.valueOf(this.k0.e().getTimeInMillis()) : Long.valueOf(-1L);
        }
        return this.n0;
    }

    @Override
    public int r(boolean bl) {
        if (!this.isDirectory()) {
            return -2;
        }
        return this.X();
    }

    @Override
    public String s() {
        return this.m0;
    }

    @Override
    public String t() {
        return this.l0;
    }
}

