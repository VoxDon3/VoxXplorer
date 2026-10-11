/*
 * Decompiled with CFR 0.152.
 */
package ax.i8;

import ax.i8.i;

public class k
extends i {
    private final int c0;

    public k(int n8, String string) {
        super(string);
        this.c0 = n8;
    }

    public k(int n8, String string, i.a a8) {
        super(string, a8);
        this.c0 = n8;
    }

    public k(int n8, String string, Throwable throwable) {
        super(string, throwable);
        this.c0 = n8;
    }

    public k(String string, i.a a8) {
        super(string, a8);
        this.c0 = -1;
    }

    public int a() {
        return this.c0;
    }
}

