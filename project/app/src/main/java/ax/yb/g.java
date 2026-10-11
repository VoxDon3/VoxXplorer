/*
 * Decompiled with CFR 0.152.
 */
package ax.yb;

import ax.Gb.l;
import ax.yb.a;
import ax.yb.f;
import ax.yb.i;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

public final class g {
    private static final void a(int n8, int n9) {
        if (n9 <= n8) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Debug metadata version mismatch. Expected: ");
        stringBuilder.append(n8);
        stringBuilder.append(", got ");
        stringBuilder.append(n9);
        stringBuilder.append(". Please update the Kotlin standard library.");
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    private static final f b(a a8) {
        return a8.getClass().getAnnotation(f.class);
    }

    private static final int c(a object) {
        int n8;
        block4: {
            block3: {
                try {
                    Field field = object.getClass().getDeclaredField("label");
                    ((AccessibleObject)field).setAccessible(true);
                    object = field.get(object);
                    object = object instanceof Integer ? (Integer)object : null;
                    if (object == null) break block3;
                }
                catch (Exception exception) {
                    return -1;
                }
                n8 = (Integer)object;
                break block4;
            }
            n8 = 0;
        }
        return n8 - 1;
    }

    public static final StackTraceElement d(a object) {
        l.f(object, "<this>");
        f f8 = g.b((a)object);
        if (f8 == null) {
            return null;
        }
        g.a(1, f8.v());
        int n8 = g.c((a)object);
        n8 = n8 < 0 ? -1 : f8.l()[n8];
        String string = i.a.b((a)object);
        if (string == null) {
            object = f8.c();
        } else {
            object = new StringBuilder();
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append('/');
            ((StringBuilder)object).append(f8.c());
            object = ((StringBuilder)object).toString();
        }
        return new StackTraceElement((String)object, f8.m(), f8.f(), n8);
    }
}

