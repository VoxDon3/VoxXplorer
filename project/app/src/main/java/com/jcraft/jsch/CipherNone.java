/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import ax.y9.a;
import com.jcraft.jsch.Cipher;

class CipherNone
implements Cipher {
    CipherNone() {
    }

    @Override
    public void a(byte[] byArray, int n8, int n9, byte[] byArray2, int n10) throws Exception {
    }

    @Override
    public int d() {
        return 16;
    }

    @Override
    public /* synthetic */ void e(int n8) {
        a.e(this, n8);
    }

    @Override
    public /* synthetic */ void f(byte[] byArray, int n8, int n9) {
        a.f(this, byArray, n8, n9);
    }

    @Override
    public /* synthetic */ int g() {
        return a.b(this);
    }

    @Override
    public /* synthetic */ void h(byte[] byArray, int n8, int n9, byte[] byArray2, int n10) {
        a.a(this, byArray, n8, n9, byArray2, n10);
    }

    @Override
    public boolean i() {
        return false;
    }

    @Override
    public /* synthetic */ boolean j() {
        return a.d(this);
    }

    @Override
    public void k(int n8, byte[] byArray, byte[] byArray2) throws Exception {
    }

    @Override
    public int l() {
        return 8;
    }

    @Override
    public /* synthetic */ boolean m() {
        return a.c(this);
    }
}

