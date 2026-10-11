/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.jzlib;

import com.jcraft.jsch.jzlib.Inflate;
import com.jcraft.jsch.jzlib.JZlib;
import com.jcraft.jsch.jzlib.ZStream;

final class Inflater
extends ZStream {
    private int n = -1;
    private JZlib.WrapperType o = null;
    private boolean p = false;
    private boolean q = false;

    Inflater() {
        this.i();
    }

    int f() {
        this.q = true;
        Inflate inflate = this.k;
        if (inflate == null) {
            return -2;
        }
        return inflate.c();
    }

    boolean g() {
        return this.k.a == 12;
    }

    int h(int n8) {
        Inflate inflate = this.k;
        if (inflate == null) {
            return -2;
        }
        if ((n8 = inflate.b(n8)) == 1) {
            this.q = true;
        }
        return n8;
    }

    int i() {
        return this.j(15);
    }

    int j(int n8) {
        return this.k(n8, false);
    }

    int k(int n8, boolean bl) {
        Inflate inflate;
        this.q = false;
        this.k = inflate = new Inflate(this);
        int n9 = n8;
        if (bl) {
            n9 = -n8;
        }
        return inflate.d(n9);
    }
}

