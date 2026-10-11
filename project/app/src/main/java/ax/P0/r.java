/*
 * Decompiled with CFR 0.152.
 */
package ax.P0;

import android.os.Build;
import android.util.SparseBooleanArray;
import ax.S0.a;

public final class r {
    private final SparseBooleanArray a;

    private r(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }

    public boolean a(int n8) {
        return this.a.get(n8);
    }

    public boolean b(int ... nArray) {
        int n8 = nArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            if (!this.a(nArray[i8])) continue;
            return true;
        }
        return false;
    }

    public int c(int n8) {
        ax.S0.a.c(n8, 0, this.d());
        return this.a.keyAt(n8);
    }

    public int d() {
        return this.a.size();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof r)) {
            return false;
        }
        object = (r)object;
        if (Build.VERSION.SDK_INT < 24) {
            if (this.d() != ((r)object).d()) {
                return false;
            }
            for (int i8 = 0; i8 < this.d(); ++i8) {
                if (this.c(i8) == ((r)object).c(i8)) continue;
                return false;
            }
            return true;
        }
        return this.a.equals((Object)((r)object).a);
    }

    public int hashCode() {
        if (Build.VERSION.SDK_INT < 24) {
            int n8 = this.d();
            for (int i8 = 0; i8 < this.d(); ++i8) {
                n8 = n8 * 31 + this.c(i8);
            }
            return n8;
        }
        return this.a.hashCode();
    }

    public static final class b {
        private final SparseBooleanArray a = new SparseBooleanArray();
        private boolean b;

        public b a(int n8) {
            ax.S0.a.g(this.b ^ true);
            this.a.append(n8, true);
            return this;
        }

        public b b(r r8) {
            for (int i8 = 0; i8 < r8.d(); ++i8) {
                this.a(r8.c(i8));
            }
            return this;
        }

        public b c(int ... nArray) {
            int n8 = nArray.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                this.a(nArray[i8]);
            }
            return this;
        }

        public b d(int n8, boolean bl) {
            if (bl) {
                return this.a(n8);
            }
            return this;
        }

        public r e() {
            ax.S0.a.g(this.b ^ true);
            this.b = true;
            return new r(this.a);
        }
    }
}

