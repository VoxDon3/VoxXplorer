/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.file;

import ax.c3.d0;
import ax.c3.v;
import com.alphainventor.filemanager.file.L;
import com.alphainventor.filemanager.file.n;
import com.jcraft.jsch.SftpATTRS;
import com.jcraft.jsch.SftpException;

public class M
extends n {
    private SftpATTRS k0;
    private String l0;
    private String m0;
    private String n0;
    private boolean o0;
    private Long p0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public M(L l8, L.e e8, SftpATTRS sftpATTRS, String string) {
        super(l8);
        this.k0 = sftpATTRS;
        this.l0 = string;
        this.m0 = d0.h(string);
        this.f0();
        if (sftpATTRS == null) return;
        if (!sftpATTRS.l()) return;
        this.o0 = true;
        try {
            this.k0 = e8.o(string);
            return;
        }
        catch (SftpException sftpException) {
            return;
        }
    }

    public M(L l8, String string) {
        this(l8, null, null, string);
    }

    private void f0() {
        this.n0 = v.e(this, "");
    }

    @Override
    public String C() {
        return this.m0;
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
        SftpATTRS sftpATTRS = this.k0;
        return sftpATTRS != null && (sftpATTRS.g() & 4) != 0;
    }

    public int e0(n n8) {
        try {
            int n9 = this.l0.compareTo(((M)n8).l0);
            return n9;
        }
        catch (ClassCastException classCastException) {
            return -1;
        }
    }

    @Override
    public boolean h() {
        String string = this.m0;
        return string != null && string.startsWith(".");
    }

    @Override
    public boolean isDirectory() {
        SftpATTRS sftpATTRS = this.k0;
        return sftpATTRS != null && sftpATTRS.k();
    }

    @Override
    public boolean j() {
        SftpATTRS sftpATTRS = this.k0;
        return sftpATTRS != null && (sftpATTRS.g() & 2) != 0;
    }

    @Override
    public boolean l() {
        return this.o0;
    }

    @Override
    public boolean n() {
        return this.k0 != null;
    }

    @Override
    public long p() {
        SftpATTRS sftpATTRS = this.k0;
        if (sftpATTRS != null) {
            return sftpATTRS.i();
        }
        return 0L;
    }

    @Override
    public long q() {
        if (this.p0 == null) {
            SftpATTRS sftpATTRS = this.k0;
            this.p0 = sftpATTRS != null ? Long.valueOf((long)sftpATTRS.e() * 1000L) : Long.valueOf(-1L);
        }
        return this.p0;
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
        return this.n0;
    }

    @Override
    public String t() {
        return this.l0;
    }
}

