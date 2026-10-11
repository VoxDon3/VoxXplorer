/*
 * Decompiled with CFR 0.152.
 */
package ax.Gb;

import ax.Gb.a;
import ax.Gb.l;
import java.util.Iterator;

public final class b {
    public static final <T> Iterator<T> a(T[] TArray) {
        l.f(TArray, "array");
        return new a<T>(TArray);
    }
}

