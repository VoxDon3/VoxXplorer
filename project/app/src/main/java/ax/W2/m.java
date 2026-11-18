/*
 * Decompiled with CFR 0.152.
 */
package ax.W2;

import ax.W2.h;
import ax.W2.j;
import ax.W2.n;
import ax.c3.d0;
import com.voxdon.xplorer.file.o;

public class m
extends h {
    private o d;
    private String e;
    private String f;
    private boolean g;

    public static m n() {
        return new m();
    }

    @Override
    protected j b() {
        return new n(this.f(), this.d, d0.Q(this.e, this.f), this.g);
    }

    public void k(o o8, String string, boolean bl, h.a a8) {
        this.d = o8;
        this.e = string;
        this.g = bl;
        this.i(a8);
        this.j(h.c.c0);
    }

    public String l() {
        return this.f;
    }

    public String m() {
        return this.e;
    }

    public void o(String string) {
        this.f = string;
    }
}

