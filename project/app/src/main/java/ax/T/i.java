/*
 * Decompiled with CFR 0.152.
 */
package ax.T;

import android.graphics.Typeface;
import ax.T.h;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class i
extends h {
    /*
     * WARNING - void declaration
     */
    @Override
    protected Typeface i(Object object) {
        Throwable var1_4;
        try {
            Object object2 = Array.newInstance(this.g, 1);
            Array.set(object2, 0, object);
            object = (Typeface)this.m.invoke(null, object2, "sans-serif", -1, -1);
            return object;
        }
        catch (InvocationTargetException invocationTargetException) {
        }
        catch (IllegalAccessException illegalAccessException) {
            // empty catch block
        }
        throw new RuntimeException((Throwable)var1_4);
    }

    @Override
    protected Method u(Class<?> genericDeclaration) throws NoSuchMethodException {
        Class<?> clazz = Array.newInstance(genericDeclaration, 1).getClass();
        genericDeclaration = Integer.TYPE;
        genericDeclaration = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{clazz, String.class, genericDeclaration, genericDeclaration});
        ((AccessibleObject)((Object)genericDeclaration)).setAccessible(true);
        return genericDeclaration;
    }
}

