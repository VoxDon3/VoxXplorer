/*
 * Decompiled with CFR 0.152.
 */
package ax.J7;

import ax.J7.b;
import ax.L7.F;
import com.google.auto.value.AutoValue;
import java.io.File;

@AutoValue
public abstract class u {
    public static u a(F f8, String string, File file) {
        return new b(f8, string, file);
    }

    public abstract F b();

    public abstract File c();

    public abstract String d();
}

