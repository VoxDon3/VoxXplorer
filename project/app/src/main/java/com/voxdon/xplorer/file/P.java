/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.file;

import ax.j9.b;
import ax.pb.r;
import com.voxdon.xplorer.file.Q;

public class P {
    public Q.c a;
    public b b;
    public r c;
    public String d;
    public String e;
    public int f;
    public boolean g;
    public String h;
    public boolean i;

    public P(b b8, String string, int n8) {
        this.b = b8;
        this.e = string;
        this.f = n8;
        this.a = Q.c.d0;
    }

    public P(b b8, String string, int n8, r r8) {
        this.b = b8;
        this.e = string;
        this.f = n8;
        this.a = Q.c.c0;
        this.c = r8;
    }

    public P(r r8) {
        this.c = r8;
        this.a = Q.c.q;
    }

    public void a(String string) {
        this.d = string;
    }
}

