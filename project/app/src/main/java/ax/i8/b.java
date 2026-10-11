/*
 * Decompiled with CFR 0.152.
 */
package ax.i8;

import ax.i8.a;
import com.google.auto.value.AutoValue;
import java.util.Set;

@AutoValue
public abstract class b {
    public static b a(Set<String> set) {
        return new a(set);
    }

    public abstract Set<String> b();
}

