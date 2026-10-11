/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.sb.t;
import ax.wb.e;

public interface l<T>
extends e<T> {
    public void k(T var1, ax.Fb.l<? super Throwable, t> var2);

    public Object l(T var1, Object var2, ax.Fb.l<? super Throwable, t> var3);

    public boolean n(Throwable var1);

    public void r(ax.Fb.l<? super Throwable, t> var1);

    public void s(Object var1);

    public static final class a {
        public static /* synthetic */ boolean a(l l8, Throwable throwable, int n8, Object object) {
            if (object == null) {
                if ((n8 & 1) != 0) {
                    throwable = null;
                }
                return l8.n(throwable);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }
    }
}

