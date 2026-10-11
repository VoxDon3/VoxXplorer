/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.g0;
import ax.b6.h0;
import ax.b6.l0;
import ax.b6.o0;
import ax.b6.q0;

final class j0
extends o0 {
    private final String b;
    private final boolean c;
    private final boolean d;
    private final q0 e;

    private j0(String string, boolean bl, boolean bl2, h0 h02, g0 g02, q0 q02) {
        this.b = string;
        this.c = bl;
        this.d = bl2;
        this.e = q02;
    }

    /* synthetic */ j0(String string, boolean bl, boolean bl2, h0 h02, g0 g02, q0 q02, l0 l02) {
        this(string, false, false, null, null, q02);
    }

    @Override
    public final h0 a() {
        return null;
    }

    @Override
    public final g0 b() {
        return null;
    }

    @Override
    public final q0 c() {
        return this.e;
    }

    @Override
    public final String d() {
        return this.b;
    }

    @Override
    public final boolean e() {
        return this.c;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof o0 && this.b.equals(((o0)(object = (o0)object)).d()) && this.c == ((o0)object).e() && this.d == ((o0)object).f()) {
            ((o0)object).a();
            ((o0)object).b();
            if (((Object)((Object)this.e)).equals((Object)((o0)object).c())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean f() {
        return this.d;
    }

    public final int hashCode() {
        int n8 = this.b.hashCode();
        boolean bl = this.c;
        int n9 = 1237;
        int n10 = bl ? 1231 : 1237;
        if (this.d) {
            n9 = 1231;
        }
        return (((n8 ^ 0xF4243) * 1000003 ^ n10) * 1000003 ^ n9) * 583896283 ^ ((Object)((Object)this.e)).hashCode();
    }

    public final String toString() {
        String string = this.b;
        boolean bl = this.c;
        boolean bl2 = this.d;
        String string2 = String.valueOf((Object)this.e);
        StringBuilder stringBuilder = new StringBuilder("FileComplianceOptions{fileOwner=");
        stringBuilder.append(string);
        stringBuilder.append(", hasDifferentDmaOwner=");
        stringBuilder.append(bl);
        stringBuilder.append(", skipChecks=");
        stringBuilder.append(bl2);
        stringBuilder.append(", dataForwardingNotAllowedResolver=");
        stringBuilder.append("null");
        stringBuilder.append(", multipleProductIdGroupsResolver=");
        stringBuilder.append("null");
        stringBuilder.append(", filePurpose=");
        stringBuilder.append(string2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

