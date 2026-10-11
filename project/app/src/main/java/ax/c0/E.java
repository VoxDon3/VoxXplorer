/*
 * Decompiled with CFR 0.152.
 */
package ax.c0;

import android.view.View;
import android.view.ViewParent;
import ax.c0.d0;
import ax.c0.l0;

public class E {
    private ViewParent a;
    private ViewParent b;
    private final View c;
    private boolean d;
    private int[] e;

    public E(View view) {
        this.c = view;
    }

    private boolean g(int n8, int n9, int n10, int n11, int[] nArray, int n12, int[] nArray2) {
        if (this.l()) {
            ViewParent viewParent = this.h(n12);
            if (viewParent == null) {
                return false;
            }
            if (n8 == 0 && n9 == 0 && n10 == 0 && n11 == 0) {
                if (nArray != null) {
                    nArray[0] = 0;
                    nArray[1] = 0;
                }
            } else {
                int n13;
                int n14;
                if (nArray != null) {
                    this.c.getLocationInWindow(nArray);
                    n14 = nArray[0];
                    int n15 = nArray[1];
                    n13 = n14;
                    n14 = n15;
                } else {
                    n13 = 0;
                    n14 = 0;
                }
                if (nArray2 == null) {
                    nArray2 = this.i();
                    nArray2[0] = 0;
                    nArray2[1] = 0;
                }
                l0.d(viewParent, this.c, n8, n9, n10, n11, n12, nArray2);
                if (nArray != null) {
                    this.c.getLocationInWindow(nArray);
                    nArray[0] = nArray[0] - n13;
                    nArray[1] = nArray[1] - n14;
                }
                return true;
            }
        }
        return false;
    }

    private ViewParent h(int n8) {
        if (n8 != 0) {
            if (n8 != 1) {
                return null;
            }
            return this.b;
        }
        return this.a;
    }

    private int[] i() {
        if (this.e == null) {
            this.e = new int[2];
        }
        return this.e;
    }

    private void n(int n8, ViewParent viewParent) {
        if (n8 != 0) {
            if (n8 != 1) {
                return;
            }
            this.b = viewParent;
            return;
        }
        this.a = viewParent;
    }

    public boolean a(float f8, float f9, boolean bl) {
        ViewParent viewParent;
        if (this.l() && (viewParent = this.h(0)) != null) {
            return l0.a(viewParent, this.c, f8, f9, bl);
        }
        return false;
    }

    public boolean b(float f8, float f9) {
        ViewParent viewParent;
        if (this.l() && (viewParent = this.h(0)) != null) {
            return l0.b(viewParent, this.c, f8, f9);
        }
        return false;
    }

    public boolean c(int n8, int n9, int[] nArray, int[] nArray2) {
        return this.d(n8, n9, nArray, nArray2, 0);
    }

    public boolean d(int n8, int n9, int[] nArray, int[] nArray2, int n10) {
        if (this.l()) {
            ViewParent viewParent = this.h(n10);
            if (viewParent == null) {
                return false;
            }
            if (n8 == 0 && n9 == 0) {
                if (nArray2 != null) {
                    nArray2[0] = 0;
                    nArray2[1] = 0;
                }
            } else {
                int n11;
                int n12;
                if (nArray2 != null) {
                    this.c.getLocationInWindow(nArray2);
                    n12 = nArray2[0];
                    int n13 = nArray2[1];
                    n11 = n12;
                    n12 = n13;
                } else {
                    n11 = 0;
                    n12 = 0;
                }
                int[] nArray3 = nArray;
                if (nArray == null) {
                    nArray3 = this.i();
                }
                nArray3[0] = 0;
                nArray3[1] = 0;
                l0.c(viewParent, this.c, n8, n9, nArray3, n10);
                if (nArray2 != null) {
                    this.c.getLocationInWindow(nArray2);
                    nArray2[0] = nArray2[0] - n11;
                    nArray2[1] = nArray2[1] - n12;
                }
                return nArray3[0] != 0 || nArray3[1] != 0;
                {
                }
            }
        }
        return false;
    }

    public void e(int n8, int n9, int n10, int n11, int[] nArray, int n12, int[] nArray2) {
        this.g(n8, n9, n10, n11, nArray, n12, nArray2);
    }

    public boolean f(int n8, int n9, int n10, int n11, int[] nArray) {
        return this.g(n8, n9, n10, n11, nArray, 0, null);
    }

    public boolean j() {
        return this.k(0);
    }

    public boolean k(int n8) {
        return this.h(n8) != null;
    }

    public boolean l() {
        return this.d;
    }

    public void m(boolean bl) {
        if (this.d) {
            d0.F0(this.c);
        }
        this.d = bl;
    }

    public boolean o(int n8) {
        return this.p(n8, 0);
    }

    public boolean p(int n8, int n9) {
        if (this.k(n9)) {
            return true;
        }
        if (this.l()) {
            View view = this.c;
            for (ViewParent viewParent = this.c.getParent(); viewParent != null; viewParent = viewParent.getParent()) {
                if (l0.f(viewParent, view, this.c, n8, n9)) {
                    this.n(n9, viewParent);
                    l0.e(viewParent, view, this.c, n8, n9);
                    return true;
                }
                if (!(viewParent instanceof View)) continue;
                view = (View)viewParent;
            }
        }
        return false;
    }

    public void q() {
        this.r(0);
    }

    public void r(int n8) {
        ViewParent viewParent = this.h(n8);
        if (viewParent != null) {
            l0.g(viewParent, this.c, n8);
            this.n(n8, null);
        }
    }
}

