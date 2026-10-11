/*
 * Decompiled with CFR 0.152.
 */
package ax.k2;

import android.content.Context;
import ax.Gb.l;
import ax.Ob.h;
import ax.k2.u;

public final class t {
    public static final t a = new t();

    private t() {
    }

    public static final <T extends u> u.a<T> a(Context context, Class<T> clazz, String string) {
        l.f(context, "context");
        l.f(clazz, "klass");
        boolean bl = string == null || h.X(string);
        if (!bl) {
            return new u.a<T>(context, clazz, string);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final <T, C> T b(Class<C> clazz, String object) {
        l.f(clazz, "klass");
        l.f(object, "suffix");
        Object object2 = clazz.getPackage();
        l.c(object2);
        String string = ((Package)object2).getName();
        object2 = clazz.getCanonicalName();
        l.c(object2);
        l.e(string, "fullPackage");
        if (string.length() != 0) {
            object2 = ((String)object2).substring(string.length() + 1);
            l.e(object2, "this as java.lang.String).substring(startIndex)");
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(h.C((String)object2, '.', '_', false, 4, null));
        stringBuilder.append((String)object);
        object2 = stringBuilder.toString();
        try {
            if (string.length() == 0) {
                object = object2;
            } else {
                object = new StringBuilder();
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append('.');
                ((StringBuilder)object).append((String)object2);
                object = ((StringBuilder)object).toString();
            }
            object = Class.forName((String)object, true, clazz.getClassLoader());
            l.d(object, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            object = ((Class)object).newInstance();
            return (T)object;
        }
        catch (InstantiationException instantiationException) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Failed to create an instance of ");
            stringBuilder2.append(clazz);
            stringBuilder2.append(".canonicalName");
            throw new RuntimeException(stringBuilder2.toString());
        }
        catch (IllegalAccessException illegalAccessException) {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("Cannot access the constructor ");
            stringBuilder3.append(clazz);
            stringBuilder3.append(".canonicalName");
            throw new RuntimeException(stringBuilder3.toString());
        }
        catch (ClassNotFoundException classNotFoundException) {
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append("Cannot find implementation for ");
            stringBuilder4.append(clazz.getCanonicalName());
            stringBuilder4.append(". ");
            stringBuilder4.append((String)object2);
            stringBuilder4.append(" does not exist");
            throw new RuntimeException(stringBuilder4.toString());
        }
    }

    public static final <T extends u> u.a<T> c(Context context, Class<T> clazz) {
        l.f(context, "context");
        l.f(clazz, "klass");
        return new u.a<T>(context, clazz, null);
    }
}

