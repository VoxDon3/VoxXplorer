/*
 * Decompiled with CFR 0.152.
 */
package ax.Lb;

import ax.Gb.g;
import ax.Lb.b;
import ax.Lb.c;

public final class e
extends c
implements b<Integer> {
    public static final a f0 = new a(null);
    private static final e g0 = new e(1, 0);

    public e(int n8, int n9) {
        super(n8, n9, 1);
    }

    @Override
    public boolean equals(Object object) {
        int n8;
        return object instanceof e && (this.isEmpty() && ((e)object).isEmpty() || (n8 = this.k()) == ((c)(object = (e)object)).k() && this.l() == ((c)object).l());
    }

    @Override
    public int hashCode() {
        if (this.isEmpty()) {
            return -1;
        }
        return this.k() * 31 + this.l();
    }

    @Override
    public boolean isEmpty() {
        return this.k() > this.l();
    }

    public boolean r(int n8) {
        return this.k() <= n8 && n8 <= this.l();
    }

    public Integer s() {
        return this.l();
    }

    public Integer t() {
        return this.k();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.k());
        stringBuilder.append("..");
        stringBuilder.append(this.l());
        return stringBuilder.toString();
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public final e a() {
            return g0;
        }
    }
}

