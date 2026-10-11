package ax.Z2;

import android.widget.AbsListView;

/* loaded from: classes.dex */
public class q {
    String a;
    int b;
    int c;
    boolean d;

    public q(int i, int i2, String str) {
        if (i > i2) {
            throw new IllegalArgumentException("lower must be less than or equal to upper");
        }
        this.b = i;
        this.c = i2;
        this.a = str;
    }

    public static boolean d(AbsListView absListView, q qVar) {
        for (int c = qVar.c(); c <= qVar.a(); c++) {
            if (!absListView.isItemChecked(c)) {
                return false;
            }
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

    public void f(boolean z) {
        this.d = z;
    }
}
