package ax.k2;

import android.content.Context;
import ax.k2.AbstractC2390u;

/* renamed from: ax.k2.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2389t {
    public static final C2389t a = new C2389t();

    private C2389t() {
    }

    public static final <T extends AbstractC2390u> AbstractC2390u.a<T> a(Context context, Class<T> cls, String str) {
        ax.Gb.l.f(context, "context");
        ax.Gb.l.f(cls, "klass");
        if (str == null || ax.Ob.h.X(str)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new AbstractC2390u.a<>(context, cls, str);
    }

    public static final <T, C> T b(Class<C> cls, String str) {
        String str2;
        ax.Gb.l.f(cls, "klass");
        ax.Gb.l.f(str, "suffix");
        Package r1 = cls.getPackage();
        ax.Gb.l.c(r1);
        String name = r1.getName();
        String canonicalName = cls.getCanonicalName();
        ax.Gb.l.c(canonicalName);
        ax.Gb.l.e(name, "fullPackage");
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            ax.Gb.l.e(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String str3 = ax.Ob.h.C(canonicalName, '.', '_', false, 4, null) + str;
        try {
            if (name.length() == 0) {
                str2 = str3;
            } else {
                str2 = name + '.' + str3;
            }
            Class<?> cls2 = Class.forName(str2, true, cls.getClassLoader());
            ax.Gb.l.d(cls2, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            return (T) cls2.newInstance();
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + str3 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + cls + ".canonicalName");
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + cls + ".canonicalName");
        }
    }

    public static final <T extends AbstractC2390u> AbstractC2390u.a<T> c(Context context, Class<T> cls) {
        ax.Gb.l.f(context, "context");
        ax.Gb.l.f(cls, "klass");
        return new AbstractC2390u.a<>(context, cls, null);
    }
}
