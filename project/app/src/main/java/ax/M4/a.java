/*
 * Decompiled with CFR 0.152.
 */
package ax.M4;

import ax.M4.f;
import java.util.Arrays;

public class a {
    protected final String a;
    protected final f b;
    protected final String c;
    protected final boolean d;
    protected final String e;
    protected final boolean f;

    public a(String string, f f8, String string2, boolean bl, boolean bl2, String string3) {
        if (string != null) {
            if (string.length() >= 40) {
                if (string.length() <= 40) {
                    this.a = string;
                    if (f8 != null) {
                        this.b = f8;
                        if (string2 != null) {
                            this.c = string2;
                            this.d = bl;
                            this.e = string3;
                            this.f = bl2;
                            return;
                        }
                        throw new IllegalArgumentException("Required value for 'email' is null");
                    }
                    throw new IllegalArgumentException("Required value for 'name' is null");
                }
                throw new IllegalArgumentException("String 'accountId' is longer than 40");
            }
            throw new IllegalArgumentException("String 'accountId' is shorter than 40");
        }
        throw new IllegalArgumentException("Required value for 'accountId' is null");
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f});
    }
}

