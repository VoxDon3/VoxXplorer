package ax.G0;

import android.app.Application;
import ax.tb.C3133i;
import ax.tb.C3139o;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class s {
    private static final List<Class<?>> a = C3139o.l(Application.class, androidx.lifecycle.l.class);
    private static final List<Class<?>> b = C3139o.d(androidx.lifecycle.l.class);

    public static final <T> Constructor<T> c(Class<T> cls, List<? extends Class<?>> list) {
        ax.Gb.l.f(cls, "modelClass");
        ax.Gb.l.f(list, "signature");
        Object[] constructors = cls.getConstructors();
        ax.Gb.l.e(constructors, "modelClass.constructors");
        for (Object obj : constructors) {
            Constructor<T> constructor = (Constructor<T>) obj;
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            ax.Gb.l.e(parameterTypes, "constructor.parameterTypes");
            List E = C3133i.E(parameterTypes);
            if (ax.Gb.l.a(list, E)) {
                ax.Gb.l.d(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor;
            }
            if (list.size() == E.size() && E.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final <T extends androidx.lifecycle.p> T d(Class<T> cls, Constructor<T> constructor, Object... objArr) {
        ax.Gb.l.f(cls, "modelClass");
        ax.Gb.l.f(constructor, "constructor");
        ax.Gb.l.f(objArr, "params");
        try {
            return constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }
}
