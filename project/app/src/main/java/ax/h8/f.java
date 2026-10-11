/*
 * Decompiled with CFR 0.152.
 */
package ax.h8;

import ax.h8.a;
import com.google.auto.value.AutoValue;

@AutoValue
abstract class f {
    f() {
    }

    static f a(String string, String string2) {
        return new a(string, string2);
    }

    public abstract String b();

    public abstract String c();
}

