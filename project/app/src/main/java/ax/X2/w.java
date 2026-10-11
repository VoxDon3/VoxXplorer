/*
 * Decompiled with CFR 0.152.
 */
package ax.X2;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.storage.StorageEventListener;
import android.os.storage.StorageManager;
import android.os.storage.VolumeInfo;
import android.util.Log;
import ax.X2.N;
import ax.X2.O;
import ax.X2.Q;
import ax.X2.p;
import ax.u3.b;
import java.io.File;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@TargetApi(value=23)
public class w {
    private static boolean A;
    private static Method B;
    private static Method a;
    private static boolean b;
    private static Method c;
    private static boolean d;
    private static Method e;
    private static boolean f;
    private static Method g;
    private static boolean h;
    private static Method i;
    private static boolean j;
    private static Method k;
    private static boolean l;
    private static Method m;
    private static boolean n;
    private static Method o;
    private static boolean p;
    private static Method q;
    private static boolean r;
    private static Field s;
    private static Field t;
    private static Field u;
    private static Method v;
    private static Method w;
    private static Method x;
    private static Method y;
    private static Method z;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static O b(Object object) {
        Exception exception3;
        block11: {
            Object object2;
            Object object3;
            block10: {
                block12: {
                    block8: {
                        NoSuchMethodException noSuchMethodException2;
                        block9: {
                            if (A) break block12;
                            try {
                                object3 = Class.forName("android.os.storage.VolumeInfo");
                                t = object2 = ((Class)object3).getDeclaredField("disk");
                                ((AccessibleObject)object2).setAccessible(true);
                                s = object2 = ((Class)object3).getDeclaredField("type");
                                ((AccessibleObject)object2).setAccessible(true);
                                Class<?> clazz = Class.forName("android.os.storage.DiskInfo");
                                u = object2 = clazz.getDeclaredField("flags");
                                ((AccessibleObject)object2).setAccessible(true);
                                v = ((Class)object3).getDeclaredMethod("getPath", null);
                                w = ((Class)object3).getDeclaredMethod("getFsUuid", null);
                                y = ((Class)object3).getDeclaredMethod("getDescription", null);
                                z = ((Class)object3).getDeclaredMethod("getState", null);
                                x = ((Class)object3).getDeclaredMethod("getId", null);
                                B = clazz.getDeclaredMethod("getDescription", null);
                                break block8;
                            }
                            catch (Exception exception2) {
                            }
                            catch (NoSuchMethodException noSuchMethodException2) {
                                break block9;
                            }
                            exception2.printStackTrace();
                            object3 = new StringBuilder();
                            ((StringBuilder)object3).append("API is not available on api level ");
                            ((StringBuilder)object3).append(Build.VERSION.SDK_INT);
                            ax.u3.b.e(((StringBuilder)object3).toString());
                            break block8;
                        }
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("failed to getDeclaredMethod : ");
                        ((StringBuilder)object2).append(noSuchMethodException2.getMessage());
                        ax.u3.b.e(((StringBuilder)object2).toString());
                    }
                    A = true;
                }
                if (u == null) return null;
                if (t == null) return null;
                if (v == null) return null;
                if (w == null) {
                    return null;
                }
                object3 = new O();
                try {
                    ((O)object3).a = s.getInt(object);
                    ((O)object3).c = (String)w.invoke(object, null);
                    ((O)object3).e = (File)v.invoke(object, null);
                    ((O)object3).d = (String)x.invoke(object, null);
                    object2 = y;
                    if (object2 == null) break block10;
                    ((O)object3).f = (String)((Method)object2).invoke(object, null);
                }
                catch (Exception exception3) {
                    break block11;
                }
            }
            if ((object2 = z) != null) {
                ((O)object3).g = (Integer)((Method)object2).invoke(object, null);
            }
            if ((object2 = t.get(object)) == null) {
                ((O)object3).b = 0;
                return object3;
            }
            ((O)object3).b = u.getInt(object2);
            object = B;
            if (object == null) return object3;
            ((O)object3).h = (String)((Method)object).invoke(object2, null);
            return object3;
        }
        exception3.printStackTrace();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("API is not available on api level ");
        stringBuilder.append(Build.VERSION.SDK_INT);
        ax.u3.b.e(stringBuilder.toString());
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public static String c(Object object, Context context) {
        Method method;
        if (!j) {
            try {
                i = method = Class.forName("android.os.storage.StorageVolume").getMethod("getDescription", Context.class);
                ((AccessibleObject)method).setAccessible(true);
            }
            catch (ClassNotFoundException | NoSuchMethodException reflectiveOperationException) {
                ax.u3.b.e("Failed to retrieve getDescription method");
            }
            j = true;
        }
        if ((method = i) != null) {
            Throwable var0_4;
            try {
                object = (String)method.invoke(object, context);
                return object;
            }
            catch (IllegalArgumentException illegalArgumentException) {
            }
            catch (IllegalAccessException illegalAccessException) {
            }
            catch (InvocationTargetException invocationTargetException) {
                // empty catch block
            }
            Log.i((String)"CompatV23", (String)"Failed to invoke getDescription via reflection", (Throwable)var0_4);
            i = null;
        }
        return null;
    }

    public static String d(StorageManager object, N n8) {
        if ((object = ax.X2.w.i((StorageManager)object, n8)) != null) {
            return ((O)object).d();
        }
        return null;
    }

    public static int e(StorageManager object, N n8) {
        if ((object = ax.X2.w.i((StorageManager)object, n8)) != null) {
            return ((O)object).e();
        }
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    public static String f(Object object) {
        Method method;
        if (!h) {
            try {
                g = method = Class.forName("android.os.storage.StorageVolume").getMethod("getPath", null);
                ((AccessibleObject)method).setAccessible(true);
            }
            catch (ClassNotFoundException | NoSuchMethodException reflectiveOperationException) {
                ax.u3.b.e("Failed to retrieve getPath method");
            }
            h = true;
        }
        if ((method = g) != null) {
            Throwable var0_4;
            try {
                object = (String)method.invoke(object, null);
                return object;
            }
            catch (IllegalArgumentException illegalArgumentException) {
            }
            catch (IllegalAccessException illegalAccessException) {
            }
            catch (InvocationTargetException invocationTargetException) {
                // empty catch block
            }
            Log.i((String)"CompatV23", (String)"Failed to invoke getPath via reflection", (Throwable)var0_4);
            g = null;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public static String g(Object object) {
        Method method;
        if (!d) {
            try {
                c = method = Class.forName("android.os.storage.StorageVolume").getMethod("getState", null);
                ((AccessibleObject)method).setAccessible(true);
            }
            catch (ClassNotFoundException | NoSuchMethodException reflectiveOperationException) {
                ax.u3.b.e("Failed to retrieve getState method");
            }
            d = true;
        }
        if ((method = c) != null) {
            Throwable var0_4;
            try {
                object = (String)method.invoke(object, null);
                return object;
            }
            catch (IllegalArgumentException illegalArgumentException) {
            }
            catch (IllegalAccessException illegalAccessException) {
            }
            catch (InvocationTargetException invocationTargetException) {
                // empty catch block
            }
            Log.i((String)"CompatV23", (String)"Failed to invoke getState via reflection", (Throwable)var0_4);
            c = null;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public static Object h(StorageManager object, File file) {
        Method method;
        if (!b) {
            try {
                a = method = StorageManager.class.getMethod("getStorageVolume", File.class);
                ((AccessibleObject)method).setAccessible(true);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                ax.u3.b.e("Failed to retrieve getStorageVolume method");
            }
            b = true;
        }
        if ((method = a) != null) {
            Throwable var0_4;
            try {
                object = method.invoke(object, file);
                return object;
            }
            catch (IllegalArgumentException illegalArgumentException) {
            }
            catch (IllegalAccessException illegalAccessException) {
            }
            catch (InvocationTargetException invocationTargetException) {
                // empty catch block
            }
            Log.i((String)"CompatV23", (String)"Failed to invoke getStorageVolume via reflection", (Throwable)var0_4);
            a = null;
        }
        return null;
    }

    public static O i(StorageManager object, N n8) {
        Q.l(37);
        object = ax.X2.w.l(object, n8);
        if (object == null) {
            return null;
        }
        return ax.X2.w.b(object);
    }

    /*
     * WARNING - void declaration
     */
    public static String j(Object object) {
        Method method;
        if (!l) {
            try {
                k = method = Class.forName("android.os.storage.StorageVolume").getMethod("getUuid", null);
                ((AccessibleObject)method).setAccessible(true);
            }
            catch (ClassNotFoundException | NoSuchMethodException reflectiveOperationException) {
                ax.u3.b.e("Failed to retrieve getUuid method");
            }
            l = true;
        }
        if ((method = k) != null) {
            Throwable var0_4;
            try {
                object = (String)method.invoke(object, null);
                return object;
            }
            catch (IllegalArgumentException illegalArgumentException) {
            }
            catch (IllegalAccessException illegalAccessException) {
            }
            catch (InvocationTargetException invocationTargetException) {
                // empty catch block
            }
            Log.i((String)"CompatV23", (String)"Failed to invoke getUuid via reflection", (Throwable)var0_4);
            k = null;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public static String k(Object object) {
        Method method;
        if (!f) {
            try {
                e = method = Class.forName("android.os.storage.StorageVolume").getMethod("getId", null);
                ((AccessibleObject)method).setAccessible(true);
            }
            catch (ClassNotFoundException | NoSuchMethodException reflectiveOperationException) {
                ax.u3.b.e("Failed to retrieve getVolumeId method");
            }
            f = true;
        }
        if ((method = e) != null) {
            Throwable var0_4;
            try {
                object = (String)method.invoke(object, null);
                return object;
            }
            catch (IllegalArgumentException illegalArgumentException) {
            }
            catch (IllegalAccessException illegalAccessException) {
            }
            catch (InvocationTargetException invocationTargetException) {
                // empty catch block
            }
            Log.i((String)"CompatV23", (String)"Failed to invoke getVolumeId via reflection", (Throwable)var0_4);
            e = null;
        }
        return null;
    }

    private static Object l(StorageManager object, N object2) {
        block3: {
            try {
                object2 = ((N)object2).l();
                if (object2 != null) break block3;
                return null;
            }
            catch (Exception exception) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("API is not available on api level ");
                stringBuilder.append(Build.VERSION.SDK_INT);
                ax.u3.b.e(stringBuilder.toString());
                return null;
            }
        }
        object = object.getClass().getDeclaredMethod("findVolumeByUuid", String.class).invoke(object, object2);
        return object;
    }

    /*
     * WARNING - void declaration
     */
    static Object[] m(StorageManager objectArray) {
        Method method;
        boolean bl = Build.VERSION.SDK_INT == 23;
        ax.u3.b.d(bl);
        if (!p) {
            try {
                o = method = StorageManager.class.getMethod("getVolumeList", null);
                ((AccessibleObject)method).setAccessible(true);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                ax.u3.b.e("Failed to retrieve getVolumeList method");
            }
            p = true;
        }
        if ((method = o) != null) {
            Throwable var0_4;
            try {
                objectArray = (Object[])method.invoke(objectArray, null);
                return objectArray;
            }
            catch (IllegalArgumentException illegalArgumentException) {
            }
            catch (IllegalAccessException illegalAccessException) {
            }
            catch (InvocationTargetException invocationTargetException) {
                // empty catch block
            }
            Log.i((String)"CompatV23", (String)"Failed to invoke getVolumeList via reflection", (Throwable)var0_4);
            o = null;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static List<O> n(StorageManager object) {
        try {
            Object object2 = (List)object.getClass().getDeclaredMethod("getVolumes", null).invoke(object, null);
            object = new ArrayList();
            if (object2 == null) return object;
            object2 = object2.iterator();
            while (object2.hasNext()) {
                O o8 = ax.X2.w.b(object2.next());
                if (o8 == null || o8.b == 0) continue;
                object.add(o8);
            }
            return object;
        }
        catch (Exception exception) {}
        exception.printStackTrace();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("API is not available on api level ");
        stringBuilder.append(Build.VERSION.SDK_INT);
        ax.u3.b.e(stringBuilder.toString());
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean o(Object object) {
        Method method;
        if (!n) {
            try {
                m = method = Class.forName("android.os.storage.StorageVolume").getMethod("isPrimary", null);
                ((AccessibleObject)method).setAccessible(true);
            }
            catch (ClassNotFoundException | NoSuchMethodException reflectiveOperationException) {
                ax.u3.b.e("Failed to retrieve isPrimary method");
            }
            n = true;
        }
        if ((method = m) != null) {
            Throwable var0_4;
            try {
                boolean bl = (Boolean)method.invoke(object, null);
                return bl;
            }
            catch (IllegalArgumentException illegalArgumentException) {
            }
            catch (IllegalAccessException illegalAccessException) {
            }
            catch (InvocationTargetException invocationTargetException) {
                // empty catch block
            }
            Log.i((String)"CompatV23", (String)"Failed to invoke isPrimary via reflection", (Throwable)var0_4);
            m = null;
        }
        return false;
    }

    public static boolean p(Object object) {
        Method method;
        if (!r) {
            try {
                q = method = Class.forName("android.os.storage.StorageVolume").getMethod("isRemovable", null);
                ((AccessibleObject)method).setAccessible(true);
            }
            catch (ClassNotFoundException | NoSuchMethodException reflectiveOperationException) {
                ax.u3.b.e("Failed to retrieve isRemovable method");
            }
            r = true;
        }
        if ((method = q) != null) {
            try {
                boolean bl = (Boolean)method.invoke(object, null);
                return bl;
            }
            catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException exception) {
                ax.u3.b.e("Failed to invoke isRemovable via reflection");
                q = null;
            }
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean q(StorageManager storageManager, p p8) {
        RuntimeException var0_3;
        try {
            StorageEventListener storageEventListener = new StorageEventListener(p8){
                final p a;
                {
                    this.a = p8;
                }

                public void onVolumeStateChanged(VolumeInfo object, int n8, int n9) {
                    boolean bl = (object = ax.X2.w.b(object)) != null ? ((O)object).l() : false;
                    this.a.a((O)object, O.a(n8), O.a(n9), bl);
                }
            };
            p8.b(storageEventListener);
            storageManager.getClass().getDeclaredMethod("registerListener", StorageEventListener.class).invoke(storageManager, storageEventListener);
            return true;
        }
        catch (Exception exception) {
        }
        catch (Error error) {
            // empty catch block
        }
        ax.u3.b.e(var0_3.getMessage());
        var0_3.printStackTrace();
        return false;
    }
}

