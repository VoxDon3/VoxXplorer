/*
 * Decompiled with CFR 0.152.
 */
package androidx.fragment.app;

import androidx.fragment.app.p;
import ax.Q2.d;

public class q {
    public static void a(Object object) {
        if (object instanceof p) {
            object = (p)object;
            Object object2 = ((p)object).n0;
            if (object2 != null) {
                object2.clear();
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("FRAGMENT_TRANSACTION_TOO_LARGE : ");
                ((StringBuilder)object2).append(((p)object).q);
                d.c("FRAGMENT_TRANSACTION_TOO_LARGE", new Exception(((StringBuilder)object2).toString()));
            }
        }
    }
}

