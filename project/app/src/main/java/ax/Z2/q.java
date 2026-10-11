/*
 * Decompiled with CFR 0.152.
 */
package ax.Z2;

import android.widget.AbsListView;

public class q {
    String a;
    int b;
    int c;
    boolean d;

    public q(int n8, int n9, String string) {
        if (n8 <= n9) {
            this.b = n8;
            this.c = n9;
            this.a = string;
            return;
        }
        throw new IllegalArgumentException("lower must be less than or equal to upper");
    }

    public static boolean d(AbsListView absListView, q q8) {
        for (int i8 = q8.c(); i8 <= q8.a(); ++i8) {
            if (absListView.isItemChecked(i8)) continue;
            return false;
        }
        return true;
    }

    public int a() {
        return this.c;
    }

    public String b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public boolean e() {
        return this.d;
    }

    public void f(boolean bl) {
        this.d = bl;
    }
}

