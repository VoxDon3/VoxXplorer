/*
 * Decompiled with CFR 0.152.
 */
package ax.ke;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;

public final class w {
    public static /* bridge */ /* synthetic */ MethodHandle a(MethodHandles.Lookup lookup, Method method, Class clazz) {
        return lookup.unreflectSpecial(method, clazz);
    }
}

