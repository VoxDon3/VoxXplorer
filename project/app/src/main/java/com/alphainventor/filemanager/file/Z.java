/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.file;

import android.text.TextUtils;
import ax.Va.e;
import ax.c3.d0;
import ax.c3.v;
import com.alphainventor.filemanager.file.Y;
import com.alphainventor.filemanager.file.n;

public class Z
extends n {
    private final e k0;
    private final String l0;

    Z(Y y8, e e8, String string) {
        super(y8);
        this.k0 = e8;
        if (e8 != null && e8.g() != null) {
            this.l0 = d0.U(e8.g().a());
            return;
        }
        this.l0 = d0.U(string);
    }

    @Override
    protected String C() {
        e e8 = this.k0;
        if (e8 != null && !TextUtils.isEmpty((CharSequence)e8.e())) {
            return this.k0.e();
        }
        return d0.h(this.l0);
    }

    @Override
    protected String F() {
        return this.l0;
    }

    @Override
    protected String U() {
        return d0.r(this.l0);
    }

    @Override
    public boolean d() {
        return this.n();
    }

    public int e0(n n8) {
        return this.l0.compareTo(n8.E());
    }

    public String f0() {
        e e8 = this.k0;
        if (e8 == null) {
            return null;
        }
        return e8.h();
    }

    boolean g0() {
        e e8 = this.k0;
        return e8 != null && !TextUtils.isEmpty((CharSequence)e8.h());
    }

    @Override
    public boolean h() {
        return this.B().startsWith(".");
    }

    @Override
    public boolean isDirectory() {
        e e8;
        return d0.a.equals(this.l0) || (e8 = this.k0) != null && e8.k();
        {
        }
    }

    @Override
    public boolean j() {
        return this.n();
    }

    @Override
    public boolean l() {
        return false;
    }

    @Override
    public boolean n() {
        return d0.a.equals(this.l0) || this.k0 != null;
        {
        }
    }

    @Override
    public long p() {
        if (this.k0 != null && !this.isDirectory()) {
            return this.k0.j();
        }
        return 0L;
    }

    @Override
    public long q() {
        e e8 = this.k0;
        if (e8 != null && e8.d() != null) {
            return this.k0.d().getTime();
        }
        return -1L;
    }

    @Override
    public int r(boolean bl) {
        if (this.isDirectory()) {
            return this.X();
        }
        return -2;
    }

    @Override
    public String s() {
        Object object = this.k0;
        if (object != null && !TextUtils.isEmpty((CharSequence)((e)object).c())) {
            object = this.k0.c();
            if ("text/plain".equals(object) && this.p() == 0L) {
                return v.e(this, (String)object);
            }
            return this.k0.c();
        }
        return v.e(this, "application/octet-stream");
    }

    @Override
    public String t() {
        return this.l0;
    }
}

