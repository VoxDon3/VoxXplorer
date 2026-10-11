/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import android.view.View;

class v {
    final b a;
    a b;

    v(b b8) {
        this.a = b8;
        this.b = new a();
    }

    View a(int n8, int n9, int n10, int n11) {
        int n12 = this.a.c();
        int n13 = this.a.d();
        int n14 = n9 > n8 ? 1 : -1;
        View view = null;
        while (n8 != n9) {
            View view2 = this.a.a(n8);
            int n15 = this.a.b(view2);
            int n16 = this.a.e(view2);
            this.b.e(n12, n13, n15, n16);
            if (n10 != 0) {
                this.b.d();
                this.b.a(n10);
                if (this.b.b()) {
                    return view2;
                }
            }
            View view3 = view;
            if (n11 != 0) {
                this.b.d();
                this.b.a(n11);
                view3 = view;
                if (this.b.b()) {
                    view3 = view2;
                }
            }
            n8 += n14;
            view = view3;
        }
        return view;
    }

    boolean b(View view, int n8) {
        this.b.e(this.a.c(), this.a.d(), this.a.b(view), this.a.e(view));
        if (n8 != 0) {
            this.b.d();
            this.b.a(n8);
            return this.b.b();
        }
        return false;
    }

    static class a {
        int a = 0;
        int b;
        int c;
        int d;
        int e;

        a() {
        }

        void a(int n8) {
            this.a = n8 | this.a;
        }

        boolean b() {
            int n8 = this.a;
            if ((n8 & 7) != 0 && (n8 & this.c(this.d, this.b)) == 0) {
                return false;
            }
            n8 = this.a;
            if ((n8 & 0x70) != 0 && (n8 & this.c(this.d, this.c) << 4) == 0) {
                return false;
            }
            n8 = this.a;
            if ((n8 & 0x700) != 0 && (n8 & this.c(this.e, this.b) << 8) == 0) {
                return false;
            }
            n8 = this.a;
            return (n8 & 0x7000) == 0 || (n8 & this.c(this.e, this.c) << 12) != 0;
        }

        int c(int n8, int n9) {
            if (n8 > n9) {
                return 1;
            }
            if (n8 == n9) {
                return 2;
            }
            return 4;
        }

        void d() {
            this.a = 0;
        }

        void e(int n8, int n9, int n10, int n11) {
            this.b = n8;
            this.c = n9;
            this.d = n10;
            this.e = n11;
        }
    }

    static interface b {
        public View a(int var1);

        public int b(View var1);

        public int c();

        public int d();

        public int e(View var1);
    }
}

