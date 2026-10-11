package ax.X2;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.storage.StorageEventListener;
import android.os.storage.StorageManager;
import android.os.storage.VolumeInfo;
import android.util.Log;
import ax.u3.C3184b;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@TargetApi(23)
/* loaded from: classes.dex */
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

    class a extends StorageEventListener {
        final /* synthetic */ C1170p a;

        a(C1170p c1170p) {
            this.a = c1170p;
        }

        public void onVolumeStateChanged(VolumeInfo volumeInfo, int i, int i2) {
            O b = w.b(volumeInfo);
            this.a.a(b, O.a(i), O.a(i2), b != null ? b.l() : false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static O b(Object obj) {
        if (!A) {
            try {
                Class<?> cls = Class.forName("android.os.storage.VolumeInfo");
                Field declaredField = cls.getDeclaredField("disk");
                t = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = cls.getDeclaredField("type");
                s = declaredField2;
                declaredField2.setAccessible(true);
                Class<?> cls2 = Class.forName("android.os.storage.DiskInfo");
                Field declaredField3 = cls2.getDeclaredField("flags");
                u = declaredField3;
                declaredField3.setAccessible(true);
                v = cls.getDeclaredMethod("getPath", null);
                w = cls.getDeclaredMethod("getFsUuid", null);
                y = cls.getDeclaredMethod("getDescription", null);
                z = cls.getDeclaredMethod("getState", null);
                x = cls.getDeclaredMethod("getId", null);
                B = cls2.getDeclaredMethod("getDescription", null);
            } catch (NoSuchMethodException e2) {
                C3184b.e("failed to getDeclaredMethod : " + e2.getMessage());
            } catch (Exception e3) {
                e3.printStackTrace();
                C3184b.e("API is not available on api level " + Build.VERSION.SDK_INT);
            }
            A = true;
        }
        if (u != null && t != null && v != null && w != null) {
            O o2 = new O();
            try {
                o2.a = s.getInt(obj);
                o2.c = (String) w.invoke(obj, null);
                o2.e = (File) v.invoke(obj, null);
                o2.d = (String) x.invoke(obj, null);
                Method method = y;
                if (method != null) {
                    o2.f = (String) method.invoke(obj, null);
                }
                Method method2 = z;
                if (method2 != null) {
                    o2.g = ((Integer) method2.invoke(obj, null)).intValue();
                }
                Object obj2 = t.get(obj);
                if (obj2 == null) {
                    o2.b = 0;
                } else {
                    o2.b = u.getInt(obj2);
                    Method method3 = B;
                    if (method3 != null) {
                        o2.h = (String) method3.invoke(obj2, null);
                    }
                }
                return o2;
            } catch (Exception e4) {
                e4.printStackTrace();
                C3184b.e("API is not available on api level " + Build.VERSION.SDK_INT);
            }
        }
        return null;
    }

    public static String c(Object obj, Context context) {
        if (!j) {
            try {
                Method method = Class.forName("android.os.storage.StorageVolume").getMethod("getDescription", Context.class);
                i = method;
                method.setAccessible(true);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                C3184b.e("Failed to retrieve getDescription method");
            }
            j = true;
        }
        Method method2 = i;
        if (method2 != null) {
            try {
                return (String) method2.invoke(obj, context);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                Log.i("CompatV23", "Failed to invoke getDescription via reflection", e2);
                i = null;
            }
        }
        return null;
    }

    public static String d(StorageManager storageManager, N n2) {
        O i2 = i(storageManager, n2);
        if (i2 != null) {
            return i2.d();
        }
        return null;
    }

    public static int e(StorageManager storageManager, N n2) {
        O i2 = i(storageManager, n2);
        if (i2 != null) {
            return i2.e();
        }
        return 0;
    }

    public static String f(Object obj) {
        if (!h) {
            try {
                Method method = Class.forName("android.os.storage.StorageVolume").getMethod("getPath", null);
                g = method;
                method.setAccessible(true);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                C3184b.e("Failed to retrieve getPath method");
            }
            h = true;
        }
        Method method2 = g;
        if (method2 != null) {
            try {
                return (String) method2.invoke(obj, null);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                Log.i("CompatV23", "Failed to invoke getPath via reflection", e2);
                g = null;
            }
        }
        return null;
    }

    public static String g(Object obj) {
        if (!d) {
            try {
                Method method = Class.forName("android.os.storage.StorageVolume").getMethod("getState", null);
                c = method;
                method.setAccessible(true);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                C3184b.e("Failed to retrieve getState method");
            }
            d = true;
        }
        Method method2 = c;
        if (method2 != null) {
            try {
                return (String) method2.invoke(obj, null);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                Log.i("CompatV23", "Failed to invoke getState via reflection", e2);
                c = null;
            }
        }
        return null;
    }

    public static Object h(StorageManager storageManager, File file) {
        if (!b) {
            try {
                Method method = StorageManager.class.getMethod("getStorageVolume", File.class);
                a = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                C3184b.e("Failed to retrieve getStorageVolume method");
            }
            b = true;
        }
        Method method2 = a;
        if (method2 != null) {
            try {
                return method2.invoke(storageManager, file);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                Log.i("CompatV23", "Failed to invoke getStorageVolume via reflection", e2);
                a = null;
            }
        }
        return null;
    }

    public static O i(StorageManager storageManager, N n2) {
        Q.l(37);
        Object l2 = l(storageManager, n2);
        if (l2 == null) {
            return null;
        }
        return b(l2);
    }

    public static String j(Object obj) {
        if (!l) {
            try {
                Method method = Class.forName("android.os.storage.StorageVolume").getMethod("getUuid", null);
                k = method;
                method.setAccessible(true);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                C3184b.e("Failed to retrieve getUuid method");
            }
            l = true;
        }
        Method method2 = k;
        if (method2 != null) {
            try {
                return (String) method2.invoke(obj, null);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                Log.i("CompatV23", "Failed to invoke getUuid via reflection", e2);
                k = null;
            }
        }
        return null;
    }

    public static String k(Object obj) {
        if (!f) {
            try {
                Method method = Class.forName("android.os.storage.StorageVolume").getMethod("getId", null);
                e = method;
                method.setAccessible(true);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                C3184b.e("Failed to retrieve getVolumeId method");
            }
            f = true;
        }
        Method method2 = e;
        if (method2 != null) {
            try {
                return (String) method2.invoke(obj, null);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                Log.i("CompatV23", "Failed to invoke getVolumeId via reflection", e2);
                e = null;
            }
        }
        return null;
    }

    private static Object l(StorageManager storageManager, N n2) {
        try {
            String l2 = n2.l();
            if (l2 == null) {
                return null;
            }
            return storageManager.getClass().getDeclaredMethod("findVolumeByUuid", String.class).invoke(storageManager, l2);
        } catch (Exception unused) {
            C3184b.e("API is not available on api level " + Build.VERSION.SDK_INT);
            return null;
        }
    }

    static Object[] m(StorageManager storageManager) {
        C3184b.d(Build.VERSION.SDK_INT == 23);
        if (!p) {
            try {
                Method method = StorageManager.class.getMethod("getVolumeList", null);
                o = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                C3184b.e("Failed to retrieve getVolumeList method");
            }
            p = true;
        }
        Method method2 = o;
        if (method2 != null) {
            try {
                return (Object[]) method2.invoke(storageManager, null);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                Log.i("CompatV23", "Failed to invoke getVolumeList via reflection", e2);
                o = null;
            }
        }
        return null;
    }

    public static List<O> n(StorageManager storageManager) {
        try {
            List list = (List) storageManager.getClass().getDeclaredMethod("getVolumes", null).invoke(storageManager, null);
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    O b2 = b(it.next());
                    if (b2 != null && b2.b != 0) {
                        arrayList.add(b2);
                    }
                }
            }
            return arrayList;
        } catch (Exception e2) {
            e2.printStackTrace();
            C3184b.e("API is not available on api level " + Build.VERSION.SDK_INT);
            return null;
        }
    }

    public static boolean o(Object obj) {
        if (!n) {
            try {
                Method method = Class.forName("android.os.storage.StorageVolume").getMethod("isPrimary", null);
                m = method;
                method.setAccessible(true);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                C3184b.e("Failed to retrieve isPrimary method");
            }
            n = true;
        }
        Method method2 = m;
        if (method2 == null) {
            return false;
        }
        try {
            return ((Boolean) method2.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            Log.i("CompatV23", "Failed to invoke isPrimary via reflection", e2);
            m = null;
            return false;
        }
    }

    public static boolean p(Object obj) {
        if (!r) {
            try {
                Method method = Class.forName("android.os.storage.StorageVolume").getMethod("isRemovable", null);
                q = method;
                method.setAccessible(true);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                C3184b.e("Failed to retrieve isRemovable method");
            }
            r = true;
        }
        Method method2 = q;
        if (method2 == null) {
            return false;
        }
        try {
            return ((Boolean) method2.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
            C3184b.e("Failed to invoke isRemovable via reflection");
            q = null;
            return false;
        }
    }

    public static boolean q(StorageManager storageManager, C1170p c1170p) {
        try {
            a aVar = new a(c1170p);
            c1170p.b(aVar);
            storageManager.getClass().getDeclaredMethod("registerListener", StorageEventListener.class).invoke(storageManager, aVar);
            return true;
        } catch (Error | Exception e2) {
            C3184b.e(e2.getMessage());
            e2.printStackTrace();
            return false;
        }
    }
}
