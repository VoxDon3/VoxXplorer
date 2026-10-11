/*
 * Decompiled with CFR 0.152.
 */
package ax.T5;

import android.os.IBinder;
import ax.M5.p;
import ax.T5.a;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

public final class b<T>
extends a.a {
    private final Object e;

    private b(Object object) {
        this.e = object;
    }

    @ResultIgnorabilityUnspecified
    public static <T> T B(a object) {
        if (object instanceof b) {
            return (T)((b)object).e;
        }
        IBinder iBinder = object.asBinder();
        Field[] fieldArray = iBinder.getClass().getDeclaredFields();
        int n8 = fieldArray.length;
        object = null;
        int n9 = 0;
        for (int i8 = 0; i8 < n8; ++i8) {
            Field field = fieldArray[i8];
            int n10 = n9;
            if (!field.isSynthetic()) {
                n10 = n9 + 1;
                object = field;
            }
            n9 = n10;
        }
        if (n9 == 1) {
            p.l(object);
            if (!((AccessibleObject)object).isAccessible()) {
                ((AccessibleObject)object).setAccessible(true);
                try {
                    object = ((Field)object).get(iBinder);
                }
                catch (IllegalAccessException illegalAccessException) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", illegalAccessException);
                }
                catch (NullPointerException nullPointerException) {
                    throw new IllegalArgumentException("Binder object is null.", nullPointerException);
                }
                return (T)object;
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        n9 = fieldArray.length;
        object = new StringBuilder();
        ((StringBuilder)object).append("Unexpected number of IObjectWrapper declared fields: ");
        ((StringBuilder)object).append(n9);
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    public static <T> a a2(T t8) {
        return new b<T>(t8);
    }
}

