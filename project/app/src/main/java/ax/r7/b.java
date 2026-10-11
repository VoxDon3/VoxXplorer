/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.q7.n;
import ax.r7.Q;
import ax.r7.j0;
import java.util.NoSuchElementException;

public abstract class b<T>
extends j0<T> {
    private T c0;
    private a q = a.c0;

    protected b() {
    }

    private boolean e() {
        this.q = a.e0;
        this.c0 = this.b();
        if (this.q != a.d0) {
            this.q = a.q;
            return true;
        }
        return false;
    }

    protected abstract T b();

    protected final T c() {
        this.q = a.d0;
        return null;
    }

    @Override
    public final boolean hasNext() {
        boolean bl = this.q != a.e0;
        n.t(bl);
        int n8 = this.q.ordinal();
        if (n8 != 0) {
            if (n8 != 2) {
                return this.e();
            }
            return false;
        }
        return true;
    }

    @Override
    public final T next() {
        if (this.hasNext()) {
            this.q = a.c0;
            T t8 = Q.a(this.c0);
            this.c0 = null;
            return t8;
        }
        throw new NoSuchElementException();
    }

    private static final class a
    extends Enum<a> {
        public static final /* enum */ a c0;
        public static final /* enum */ a d0;
        public static final /* enum */ a e0;
        private static final a[] f0;
        public static final /* enum */ a q;

        static {
            q = new a();
            c0 = new a();
            d0 = new a();
            e0 = new a();
            f0 = a.d();
        }

        private static /* synthetic */ a[] d() {
            return new a[]{q, c0, d0, e0};
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])f0.clone();
        }
    }
}

