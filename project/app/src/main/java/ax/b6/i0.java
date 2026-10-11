/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.j0;
import ax.b6.o0;
import ax.b6.q0;
import ax.b6.r0;

final class i0
extends r0 {
    private String a;
    private q0 b;
    private byte c;

    i0() {
    }

    @Override
    public final o0 a() {
        if (this.c == 3 && this.a != null && this.b != null) {
            return new j0(this.a, false, false, null, null, this.b, null);
        }
        CharSequence charSequence = new StringBuilder();
        if (this.a == null) {
            charSequence.append(" fileOwner");
        }
        if ((this.c & 1) == 0) {
            charSequence.append(" hasDifferentDmaOwner");
        }
        if ((this.c & 2) == 0) {
            charSequence.append(" skipChecks");
        }
        if (this.b == null) {
            charSequence.append(" filePurpose");
        }
        charSequence = String.valueOf(charSequence);
        StringBuilder stringBuilder = new StringBuilder("Missing required properties:");
        stringBuilder.append((String)charSequence);
        throw new IllegalStateException(stringBuilder.toString());
    }

    @Override
    public final r0 b(q0 q02) {
        if (q02 != null) {
            this.b = q02;
            return this;
        }
        throw new NullPointerException("Null filePurpose");
    }

    @Override
    public final r0 c(boolean bl) {
        this.c = (byte)(this.c | 1);
        return this;
    }

    @Override
    public final r0 d(boolean bl) {
        this.c = (byte)(this.c | 2);
        return this;
    }

    public final r0 e(String string) {
        this.a = string;
        return this;
    }
}

