/*
 * Decompiled with CFR 0.152.
 */
package ax.n;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.util.Map;

class D {
    private static Field a;
    private static boolean b;
    private static Class<?> c;
    private static boolean d;
    private static Field e;
    private static boolean f;
    private static Field g;
    private static boolean h;

    static void a(Resources resources) {
        int n8 = Build.VERSION.SDK_INT;
        if (n8 >= 28) {
            return;
        }
        if (n8 >= 24) {
            D.d(resources);
            return;
        }
        if (n8 >= 23) {
            D.c(resources);
            return;
        }
        D.b(resources);
    }

    private static void b(Resources object) {
        Field field;
        if (!b) {
            try {
                a = field = Resources.class.getDeclaredField("mDrawableCache");
                ((AccessibleObject)field).setAccessible(true);
            }
            catch (NoSuchFieldException noSuchFieldException) {
                Log.e((String)"ResourcesFlusher", (String)"Could not retrieve Resources#mDrawableCache field", (Throwable)noSuchFieldException);
            }
            b = true;
        }
        if ((field = a) != null) {
            try {
                object = (Map)field.get(object);
            }
            catch (IllegalAccessException illegalAccessException) {
                Log.e((String)"ResourcesFlusher", (String)"Could not retrieve value from Resources#mDrawableCache", (Throwable)illegalAccessException);
                object = null;
            }
            if (object != null) {
                object.clear();
            }
        }
    }

    private static void c(Resources object) {
        block7: {
            Field field;
            if (!b) {
                try {
                    a = field = Resources.class.getDeclaredField("mDrawableCache");
                    ((AccessibleObject)field).setAccessible(true);
                }
                catch (NoSuchFieldException noSuchFieldException) {
                    Log.e((String)"ResourcesFlusher", (String)"Could not retrieve Resources#mDrawableCache field", (Throwable)noSuchFieldException);
                }
                b = true;
            }
            if ((field = a) != null) {
                try {
                    object = field.get(object);
                    break block7;
                }
                catch (IllegalAccessException illegalAccessException) {
                    Log.e((String)"ResourcesFlusher", (String)"Could not retrieve value from Resources#mDrawableCache", (Throwable)illegalAccessException);
                }
            }
            object = null;
        }
        if (object == null) {
            return;
        }
        D.e(object);
    }

    private static void d(Resources object) {
        Object object2;
        if (!h) {
            try {
                object2 = Resources.class.getDeclaredField("mResourcesImpl");
                g = object2;
                ((AccessibleObject)object2).setAccessible(true);
            }
            catch (NoSuchFieldException noSuchFieldException) {
                Log.e((String)"ResourcesFlusher", (String)"Could not retrieve Resources#mResourcesImpl field", (Throwable)noSuchFieldException);
            }
            h = true;
        }
        if ((object2 = g) != null) {
            Object var2_6 = null;
            try {
                object = ((Field)object2).get(object);
            }
            catch (IllegalAccessException illegalAccessException) {
                Log.e((String)"ResourcesFlusher", (String)"Could not retrieve value from Resources#mResourcesImpl", (Throwable)illegalAccessException);
                object = null;
            }
            if (object != null) {
                if (!b) {
                    try {
                        object2 = object.getClass().getDeclaredField("mDrawableCache");
                        a = object2;
                        ((AccessibleObject)object2).setAccessible(true);
                    }
                    catch (NoSuchFieldException noSuchFieldException) {
                        Log.e((String)"ResourcesFlusher", (String)"Could not retrieve ResourcesImpl#mDrawableCache field", (Throwable)noSuchFieldException);
                    }
                    b = true;
                }
                Field field = a;
                object2 = var2_6;
                if (field != null) {
                    try {
                        object2 = field.get(object);
                    }
                    catch (IllegalAccessException illegalAccessException) {
                        Log.e((String)"ResourcesFlusher", (String)"Could not retrieve value from ResourcesImpl#mDrawableCache", (Throwable)illegalAccessException);
                        object2 = var2_6;
                    }
                }
                if (object2 != null) {
                    D.e(object2);
                }
            }
        }
    }

    private static void e(Object object) {
        AnnotatedElement annotatedElement;
        if (!d) {
            try {
                c = Class.forName("android.content.res.ThemedResourceCache");
            }
            catch (ClassNotFoundException classNotFoundException) {
                Log.e((String)"ResourcesFlusher", (String)"Could not find ThemedResourceCache class", (Throwable)classNotFoundException);
            }
            d = true;
        }
        if ((annotatedElement = c) != null) {
            if (!f) {
                try {
                    annotatedElement = ((Class)annotatedElement).getDeclaredField("mUnthemedEntries");
                    e = annotatedElement;
                    ((AccessibleObject)annotatedElement).setAccessible(true);
                }
                catch (NoSuchFieldException noSuchFieldException) {
                    Log.e((String)"ResourcesFlusher", (String)"Could not retrieve ThemedResourceCache#mUnthemedEntries field", (Throwable)noSuchFieldException);
                }
                f = true;
            }
            if ((annotatedElement = e) != null) {
                try {
                    object = (LongSparseArray)((Field)annotatedElement).get(object);
                }
                catch (IllegalAccessException illegalAccessException) {
                    Log.e((String)"ResourcesFlusher", (String)"Could not retrieve value from ThemedResourceCache#mUnthemedEntries", (Throwable)illegalAccessException);
                    object = null;
                }
                if (object != null) {
                    object.clear();
                }
            }
        }
    }
}

