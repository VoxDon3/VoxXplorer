/*
 * Decompiled with CFR 0.152.
 */
package ax.m8;

import ax.m8.c;
import ax.m8.d;
import com.google.auto.value.AutoValue;
import java.util.Set;

@AutoValue
public abstract class e {
    public static e a(Set<d> set) {
        return new c(set);
    }

    public abstract Set<d> b();
}

