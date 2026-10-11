/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.a;
import com.google.android.gms.common.api.internal.c;

final class j
implements a.a {
    final c a;

    j(c c8) {
        this.a = c8;
    }

    @Override
    public final void a(boolean bl) {
        c c8 = this.a;
        c.o(c8).sendMessage(c.o(c8).obtainMessage(1, (Object)bl));
    }
}

