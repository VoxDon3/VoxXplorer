/*
 * Decompiled with CFR 0.152.
 */
package ax.he;

final class g {
    private int a;

    g() {
    }

    int a() {
        return this.a;
    }

    boolean b() {
        return this.a < 7;
    }

    void c() {
        this.a = 0;
    }

    void d(g g8) {
        this.a = g8.a;
    }

    /*
     * Enabled aggressive block sorting
     */
    void e() {
        int n8 = this.a;
        n8 = n8 <= 3 ? 0 : (n8 <= 9 ? (n8 -= 3) : (n8 -= 6));
        this.a = n8;
    }

    void f() {
        int n8 = this.a < 7 ? 8 : 11;
        this.a = n8;
    }

    void g() {
        int n8 = this.a;
        int n9 = 7;
        if (n8 >= 7) {
            n9 = 10;
        }
        this.a = n9;
    }

    void h() {
        int n8 = this.a < 7 ? 9 : 11;
        this.a = n8;
    }
}

