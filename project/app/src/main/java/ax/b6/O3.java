/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.P3;
import ax.b6.R3;
import ax.b6.s4;

final class O3
extends P3 {
    private final byte[] c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h = Integer.MAX_VALUE;

    private O3(byte[] byArray, int n8, int n9, boolean bl) {
        super(null);
        this.c = byArray;
        this.d = n9 + n8;
        this.f = n8;
        this.g = n8;
    }

    /* synthetic */ O3(byte[] byArray, int n8, int n9, boolean bl, R3 r32) {
        this(byArray, 0, n9, false);
    }

    private final void f() {
        int n8;
        this.d = n8 = this.d + this.e;
        int n9 = n8 - this.g;
        int n10 = this.h;
        if (n9 > n10) {
            this.e = n10 = n9 - n10;
            this.d = n8 - n10;
            return;
        }
        this.e = 0;
    }

    @Override
    public final int a(int n8) throws s4 {
        if (n8 >= 0) {
            int n9 = n8 + ((P3)this).d();
            if (n9 >= 0) {
                n8 = this.h;
                if (n9 <= n8) {
                    this.h = n9;
                    this.f();
                    return n8;
                }
                throw s4.f();
            }
            throw s4.e();
        }
        throw s4.d();
    }

    @Override
    public final int d() {
        return this.f - this.g;
    }
}

