package ax.P0;

import android.os.Build;
import android.util.SparseBooleanArray;
import ax.S0.C0968a;

/* loaded from: classes.dex */
public final class r {
    private final SparseBooleanArray a;

    public static final class b {
        private final SparseBooleanArray a = new SparseBooleanArray();
        private boolean b;

        public b a(int i) {
            C0968a.g(!this.b);
            this.a.append(i, true);
            return this;
        }

        public b b(r rVar) {
            for (int i = 0; i < rVar.d(); i++) {
                a(rVar.c(i));
            }
            return this;
        }

        public b c(int... iArr) {
            for (int i : iArr) {
                a(i);
            }
            return this;
        }

        public b d(int i, boolean z) {
            return z ? a(i) : this;
        }

        public r e() {
            C0968a.g(!this.b);
            this.b = true;
            return new r(this.a);
        }
    }

    public boolean a(int i) {
        return this.a.get(i);
    }

    public boolean b(int... iArr) {
        for (int i : iArr) {
            if (a(i)) {
                return true;
            }
        }
        return false;
    }

    public int c(int i) {
        C0968a.c(i, 0, d());
        return this.a.keyAt(i);
    }

    public int d() {
        return this.a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (Build.VERSION.SDK_INT >= 24) {
            return this.a.equals(rVar.a);
        }
        if (d() != rVar.d()) {
            return false;
        }
        for (int i = 0; i < d(); i++) {
            if (c(i) != rVar.c(i)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.a.hashCode();
        }
        int d = d();
        for (int i = 0; i < d(); i++) {
            d = (d * 31) + c(i);
        }
        return d;
    }

    private r(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }
}
