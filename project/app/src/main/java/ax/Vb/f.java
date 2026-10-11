/*
 * Decompiled with CFR 0.152.
 */
package ax.Vb;

import ax.Qb.J;
import ax.wb.i;

public final class f
implements J {
    private final i q;

    public f(i i8) {
        this.q = i8;
    }

    @Override
    public i h() {
        return this.q;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CoroutineScope(coroutineContext=");
        stringBuilder.append(this.h());
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

