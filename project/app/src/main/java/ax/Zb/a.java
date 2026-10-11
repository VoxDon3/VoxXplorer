/*
 * Decompiled with CFR 0.152.
 */
package ax.Zb;

import ax.sb.t;
import ax.wb.e;

public interface a {
    public Object a(Object var1, e<? super t> var2);

    public boolean b();

    public void c(Object var1);

    public static final class a {
        public static /* synthetic */ void a(a a8, Object object, int n8, Object object2) {
            if (object2 == null) {
                if ((n8 & 1) != 0) {
                    object = null;
                }
                a8.c(object);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
        }
    }
}

