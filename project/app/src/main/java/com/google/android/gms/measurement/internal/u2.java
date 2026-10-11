/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import ax.b6.D7;
import ax.b6.G7;
import com.google.android.gms.measurement.internal.X1;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.q2;
import com.google.android.gms.measurement.internal.x2;
import java.util.List;

final class u2
implements G7 {
    private final q2 a;

    u2(q2 q22) {
        this.a = q22;
    }

    @Override
    public final void a(D7 object, String string, List<String> list, boolean bl, boolean bl2) {
        int n8 = x2.a[((Enum)object).ordinal()];
        object = n8 != 1 ? (n8 != 2 ? (n8 != 3 ? (n8 != 4 ? ((f3)this.a).k().J() : ((f3)this.a).k().K()) : (bl ? ((f3)this.a).k().N() : (!bl2 ? ((f3)this.a).k().M() : ((f3)this.a).k().L()))) : (bl ? ((f3)this.a).k().I() : (!bl2 ? ((f3)this.a).k().H() : ((f3)this.a).k().G()))) : ((f3)this.a).k().F();
        n8 = list.size();
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    ((X1)object).a(string);
                    return;
                }
                ((X1)object).d(string, list.get(0), list.get(1), list.get(2));
                return;
            }
            ((X1)object).c(string, list.get(0), list.get(1));
            return;
        }
        ((X1)object).b(string, list.get(0));
    }
}

