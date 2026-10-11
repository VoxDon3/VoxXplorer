/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.file;

import android.text.TextUtils;
import ax.Ha.c;
import ax.Q2.o;
import ax.c3.d0;
import ax.c3.v;
import ax.h5.e;
import com.alphainventor.filemanager.file.U;
import com.alphainventor.filemanager.file.n;
import java.io.File;
import java.io.IOException;

public class V
extends n {
    private String k0;
    private String l0;
    private boolean m0;
    private boolean n0;
    private boolean o0;
    private long p0;
    private long q0;
    private e r0;

    public V(U u8, String string, e e8) {
        super(u8);
        this.l0 = this.g0(string);
        this.n0 = true;
        this.o0 = true;
        this.f0();
        this.p0 = 0L;
        this.q0 = 0L;
        if (e8 != null) {
            this.r0 = e8;
            this.m0 = e8.isDirectory();
            if (!d0.D(this.R(), string)) {
                this.p0 = e8.h();
                if (!this.r0.isDirectory()) {
                    this.q0 = e8.getLength();
                }
            }
        }
    }

    private void f0() {
        this.k0 = v.e(this, "");
    }

    private String g0(String string) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            return File.separator;
        }
        return d0.U(string.substring(string.indexOf("/")));
    }

    @Override
    public String C() {
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
        return this.n0;
    }

    public int e0(n n8) {
        try {
            int n9 = this.l0.compareTo(((V)n8).l0);
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
        return this.m0;
    }

    @Override
    public boolean j() {
        return this.o0;
    }

    @Override
    public boolean l() {
        return false;
    }

    @Override
    public boolean n() {
        return this.r0 != null;
    }

    @Override
    public long p() {
        return this.q0;
    }

    @Override
    public long q() {
        return this.p0;
    }

    @Override
    public int r(boolean bl) {
        int n8;
        String[] stringArray;
        block9: {
            stringArray = this.r0;
            if (stringArray == null) {
                return -1000;
            }
            if (!stringArray.isDirectory()) {
                return -2;
            }
            int n9 = this.X();
            n8 = -1;
            if (n9 != -1) {
                return this.X();
            }
            try {
                stringArray = this.r0.c0();
                break block9;
            }
            catch (IllegalArgumentException illegalArgumentException) {
            }
            catch (IOException iOException) {
                // empty catch block
            }
            stringArray.printStackTrace();
            if (o.i().m()) {
                o.i().b(this.x());
                if (o.i().m()) {
                    c.h().f().d("!!USB NUM CHILDREN!!").l((Throwable)stringArray).h();
                }
            }
            stringArray = null;
        }
        if (stringArray != null) {
            n8 = stringArray.length;
        }
        return n8;
    }

    @Override
    public String s() {
        return this.k0;
    }

    @Override
    public String t() {
        return this.l0;
    }
}

