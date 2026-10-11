/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

class E {
    private int a = 0;
    private int b = 0;
    private int c = Integer.MIN_VALUE;
    private int d = Integer.MIN_VALUE;
    private int e = 0;
    private int f = 0;
    private boolean g = false;
    private boolean h = false;

    E() {
    }

    public int a() {
        if (this.g) {
            return this.a;
        }
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        if (this.g) {
            return this.b;
        }
        return this.a;
    }

    public void e(int n8, int n9) {
        this.h = false;
        if (n8 != Integer.MIN_VALUE) {
            this.e = n8;
            this.a = n8;
        }
        if (n9 != Integer.MIN_VALUE) {
            this.f = n9;
            this.b = n9;
        }
    }

    public void f(boolean bl) {
        if (bl == this.g) {
            return;
        }
        this.g = bl;
        if (this.h) {
            if (bl) {
                int n8 = this.d;
                if (n8 == Integer.MIN_VALUE) {
                    n8 = this.e;
                }
                this.a = n8;
                n8 = this.c;
                if (n8 == Integer.MIN_VALUE) {
                    n8 = this.f;
                }
                this.b = n8;
                return;
            }
            int n9 = this.c;
            if (n9 == Integer.MIN_VALUE) {
                n9 = this.e;
            }
            this.a = n9;
            n9 = this.d;
            if (n9 == Integer.MIN_VALUE) {
                n9 = this.f;
            }
            this.b = n9;
            return;
        }
        this.a = this.e;
        this.b = this.f;
    }

    public void g(int n8, int n9) {
        this.c = n8;
        this.d = n9;
        this.h = true;
        if (this.g) {
            if (n9 != Integer.MIN_VALUE) {
                this.a = n9;
            }
            if (n8 != Integer.MIN_VALUE) {
                this.b = n8;
                return;
            }
        } else {
            if (n8 != Integer.MIN_VALUE) {
                this.a = n8;
            }
            if (n9 != Integer.MIN_VALUE) {
                this.b = n9;
            }
        }
    }
}

