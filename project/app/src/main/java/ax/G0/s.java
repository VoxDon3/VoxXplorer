/*
 * Decompiled with CFR 0.152.
 */
package ax.G0;

import android.app.Application;
import androidx.lifecycle.p;
import ax.Gb.l;
import ax.tb.i;
import ax.tb.o;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public final class s {
    private static final List<Class<?>> a = o.l(Application.class, androidx.lifecycle.l.class);
    private static final List<Class<?>> b = o.d(androidx.lifecycle.l.class);

    public static final /* synthetic */ List a() {
        return a;
    }

    public static final /* synthetic */ List b() {
        return b;
    }

    public static final <T> Constructor<T> c(Class<T> clazz, List<? extends Class<?>> list) {
        l.f(clazz, "modelClass");
        l.f(list, "signature");
        Constructor<?>[] constructorArray = clazz.getConstructors();
        l.e(constructorArray, "modelClass.constructors");
        for (Constructor<?> object : constructorArray) {
            Object object2 = object.getParameterTypes();
            l.e(object2, "constructor.parameterTypes");
            object2 = i.E(object2);
            if (l.a(list, object2)) {
                l.d(object, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return object;
            }
            if (list.size() != object2.size() || !object2.containsAll((Collection)list)) continue;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Class ");
            stringBuilder.append(clazz.getSimpleName());
            stringBuilder.append(" must have parameters in the proper order: ");
            stringBuilder.append(list);
            throw new UnsupportedOperationException(stringBuilder.toString());
        }
        return null;
    }

    public static final <T extends p> T d(Class<T> clazz, Constructor<T> object, Object ... object2) {
        IllegalAccessException illegalAccessException2;
        block5: {
            InstantiationException instantiationException2;
            block4: {
                l.f(clazz, "modelClass");
                l.f(object, "constructor");
                l.f(object2, "params");
                try {
                    object = (p)((Constructor)object).newInstance(Arrays.copyOf(object2, ((Object[])object2).length));
                }
                catch (InvocationTargetException invocationTargetException) {
                }
                catch (InstantiationException instantiationException2) {
                    break block4;
                }
                catch (IllegalAccessException illegalAccessException2) {
                    break block5;
                }
                return (T)object;
                object = new StringBuilder();
                ((StringBuilder)object).append("An exception happened in constructor of ");
                ((StringBuilder)object).append(clazz);
                throw new RuntimeException(((StringBuilder)object).toString(), invocationTargetException.getCause());
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("A ");
            ((StringBuilder)object2).append(clazz);
            ((StringBuilder)object2).append(" cannot be instantiated.");
            throw new RuntimeException(((StringBuilder)object2).toString(), instantiationException2);
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Failed to access ");
        ((StringBuilder)object2).append(clazz);
        throw new RuntimeException(((StringBuilder)object2).toString(), illegalAccessException2);
    }
}

