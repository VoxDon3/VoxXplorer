/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

import ax.c3.d0;
import ax.c3.v;
import ax.la.u;
import com.alphainventor.filemanager.file.I;
import com.alphainventor.filemanager.file.n;

public class a0
extends n {
    private String k0;
    private Long l0;
    private boolean m0;
    private String n0;
    private String o0;
    private u p0;
    private Long q0;

    public a0(I i8, a0 a02, String string) {
        this(i8, a02.t(), null, string);
    }

    public a0(I i8, String string) {
        this(i8, null, null, string);
    }

    public a0(I i8, String string, u u8, String string2) {
        super(i8);
        this.o0 = string;
        this.p0 = u8;
        this.k0 = string2;
        if ("/".equals(string2)) {
            this.m0 = true;
            return;
        }
        if (u8 != null) {
            this.m0 = u8.f();
            return;
        }
        this.m0 = false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static long g0(String string) {
        if (string == null) return -1L;
        try {
            if (string.isEmpty()) return -1L;
            return Long.parseLong(string.substring(1));
        }
        catch (Exception exception) {
            return -1L;
        }
    }

    public static String i0(long l8) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("d");
        stringBuilder.append(l8);
        return stringBuilder.toString();
    }

    @Override
    protected String C() {
        u u8 = this.p0;
        if (u8 != null) {
            return u8.a();
        }
        return d0.h(this.k0);
    }

    @Override
    protected String F() {
        return this.k0;
    }

    @Override
    protected String U() {
        return d0.r(this.k0);
    }

    @Override
    public boolean d() {
        if ("/".equals(this.k0)) {
            return true;
        }
        u u8 = this.p0;
        if (u8 != null) {
            return u8.d();
        }
        return false;
    }

    public int e0(n n8) {
        try {
            int n9 = this.t().compareTo(n8.t());
            return n9;
        }
        catch (Exception exception) {
            return -1;
        }
    }

    public u f0() {
        return this.p0;
    }

    @Override
    public boolean h() {
        String string = this.C();
        return string != null && string.startsWith(".");
    }

    public boolean h0() {
        u u8 = this.p0;
        if (u8 != null && u8.o() && (u8 = this.p0) instanceof ax.la.v) {
            return ((ax.la.v)u8).b();
        }
        return false;
    }

    @Override
    public boolean isDirectory() {
        return this.m0;
    }

    @Override
    public boolean j() {
        if ("/".equals(this.k0)) {
            return true;
        }
        u u8 = this.p0;
        if (u8 != null) {
            return u8.i() || this.p0.g();
            {
            }
        }
        return false;
    }

    @Override
    public boolean l() {
        return false;
    }

    @Override
    public boolean n() {
        if (this.p0 == null) {
            return "/".equals(this.k0);
        }
        return true;
    }

    @Override
    public long p() {
        if (this.q0 == null) {
            u u8 = this.p0;
            this.q0 = u8 != null && u8.o() && (u8 = this.p0) instanceof ax.la.v ? Long.valueOf(((ax.la.v)u8).size()) : Long.valueOf(0L);
        }
        return this.q0;
    }

    @Override
    public long q() {
        if (this.l0 == null) {
            u u8 = this.p0;
            this.l0 = u8 != null && u8.h() != null ? Long.valueOf(this.p0.h().getTime()) : Long.valueOf(-1L);
        }
        return this.l0;
    }

    @Override
    public int r(boolean bl) {
        if (!this.m0) {
            return -2;
        }
        return this.X();
    }

    @Override
    public String s() {
        if (this.n0 == null) {
            this.n0 = v.e(this, "application/octet-stream");
        }
        return this.n0;
    }

    @Override
    public String t() {
        if ("/".equals(this.k0)) {
            return a0.i0(0L);
        }
        u u8 = this.p0;
        if (u8 != null) {
            return u8.e();
        }
        return "none";
    }
}

