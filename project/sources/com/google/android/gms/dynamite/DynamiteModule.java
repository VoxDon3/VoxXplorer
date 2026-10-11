package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import ax.J5.C0748i;
import ax.M5.C0819n;
import ax.M5.C0821p;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class DynamiteModule {
    private static Boolean h = null;
    private static String i = null;
    private static boolean j = false;
    private static int k = -1;
    private static Boolean l;
    private static m q;
    private static n r;
    private final Context a;
    private static final ThreadLocal m = new ThreadLocal();
    private static final ThreadLocal n = new com.google.android.gms.dynamite.b();
    private static final b.a o = new c();
    public static final b b = new d();
    public static final b c = new e();
    public static final b d = new f();
    public static final b e = new g();
    public static final b f = new h();
    public static final b g = new i();
    public static final b p = new j();

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static class a extends Exception {
        /* synthetic */ a(String str, ax.U5.f fVar) {
            super(str);
        }

        /* synthetic */ a(String str, Throwable th, ax.U5.f fVar) {
            super(str, th);
        }
    }

    public interface b {

        public interface a {
            int a(Context context, String str, boolean z) throws a;

            int b(Context context, String str);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b, reason: collision with other inner class name */
        public static class C0546b {
            public int a = 0;
            public int b = 0;
            public int c = 0;
        }

        C0546b a(Context context, String str, a aVar) throws a;
    }

    private DynamiteModule(Context context) {
        C0821p.l(context);
        this.a = context;
    }

    public static int a(Context context, String str) {
        try {
            Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (C0819n.b(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e2) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage())));
            return 0;
        }
    }

    public static int c(Context context, String str) {
        return f(context, str, false);
    }

    @ResultIgnorabilityUnspecified
    public static DynamiteModule e(Context context, b bVar, String str) throws a {
        long j2;
        DynamiteModule h2;
        Boolean bool;
        ax.T5.a c2;
        DynamiteModule dynamiteModule;
        n nVar;
        boolean z;
        ax.T5.a B;
        Context applicationContext = context.getApplicationContext();
        ax.U5.f fVar = null;
        if (applicationContext == null) {
            throw new a("null application Context", null);
        }
        ThreadLocal threadLocal = m;
        k kVar = (k) threadLocal.get();
        k kVar2 = new k(null);
        threadLocal.set(kVar2);
        ThreadLocal threadLocal2 = n;
        Long l2 = (Long) threadLocal2.get();
        long longValue = l2.longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            b.C0546b a2 = bVar.a(context, str, o);
            int i2 = a2.a;
            j2 = 0;
            try {
                Log.i("DynamiteModule", "Considering local module " + str + ":" + i2 + " and remote module " + str + ":" + a2.b);
                int i3 = a2.c;
                if (i3 != 0) {
                    if (i3 == -1) {
                        if (a2.a != 0) {
                            i3 = -1;
                        }
                    }
                    if (i3 != 1 || a2.b != 0) {
                        if (i3 == -1) {
                            h2 = h(applicationContext, str);
                        } else {
                            if (i3 != 1) {
                                throw new a("VersionPolicy returned invalid code:" + i3, null);
                            }
                            try {
                                int i4 = a2.b;
                                try {
                                    synchronized (DynamiteModule.class) {
                                        if (!k(context)) {
                                            throw new a("Remote loading disabled", null);
                                        }
                                        bool = h;
                                    }
                                    if (bool == null) {
                                        throw new a("Failed to determine which loading route to use.", null);
                                    }
                                    if (bool.booleanValue()) {
                                        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i4);
                                        synchronized (DynamiteModule.class) {
                                            nVar = r;
                                        }
                                        if (nVar == null) {
                                            throw new a("DynamiteLoaderV2 was not cached.", null);
                                        }
                                        k kVar3 = (k) threadLocal.get();
                                        if (kVar3 == null || kVar3.a == null) {
                                            throw new a("No result cursor", null);
                                        }
                                        Context applicationContext2 = context.getApplicationContext();
                                        Cursor cursor = kVar3.a;
                                        ax.T5.b.a2(null);
                                        synchronized (DynamiteModule.class) {
                                            z = k >= 2;
                                        }
                                        if (z) {
                                            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                            B = nVar.a2(ax.T5.b.a2(applicationContext2), str, i4, ax.T5.b.a2(cursor));
                                        } else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                            B = nVar.B(ax.T5.b.a2(applicationContext2), str, i4, ax.T5.b.a2(cursor));
                                        }
                                        Context context2 = (Context) ax.T5.b.B(B);
                                        if (context2 == null) {
                                            throw new a("Failed to get module context", fVar);
                                        }
                                        dynamiteModule = new DynamiteModule(context2);
                                    } else {
                                        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i4);
                                        m l3 = l(context);
                                        if (l3 == null) {
                                            throw new a("Failed to create IDynamiteLoader.", null);
                                        }
                                        int B2 = l3.B();
                                        if (B2 >= 3) {
                                            k kVar4 = (k) threadLocal.get();
                                            if (kVar4 == null) {
                                                throw new a("No cached result cursor holder", null);
                                            }
                                            c2 = l3.d2(ax.T5.b.a2(context), str, i4, ax.T5.b.a2(kVar4.a));
                                        } else if (B2 == 2) {
                                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                                            c2 = l3.e2(ax.T5.b.a2(context), str, i4);
                                        } else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                            c2 = l3.c2(ax.T5.b.a2(context), str, i4);
                                        }
                                        Object B3 = ax.T5.b.B(c2);
                                        if (B3 == null) {
                                            throw new a("Failed to load remote module.", null);
                                        }
                                        dynamiteModule = new DynamiteModule((Context) B3);
                                    }
                                    h2 = dynamiteModule;
                                } catch (RemoteException e2) {
                                    throw new a("Failed to load remote module.", e2, null);
                                } catch (a e3) {
                                    throw e3;
                                } catch (Throwable th) {
                                    ax.R5.g.a(context, th);
                                    throw new a("Failed to load remote module.", th, null);
                                }
                            } catch (a e4) {
                                Log.w("DynamiteModule", "Failed to load remote module: " + e4.getMessage());
                                int i5 = a2.a;
                                if (i5 == 0 || bVar.a(context, str, new l(i5, 0)).c != -1) {
                                    throw new a("Remote load failed. No local fallback found.", e4, null);
                                }
                                h2 = h(applicationContext, str);
                            }
                        }
                        if (longValue == 0) {
                            n.remove();
                        } else {
                            n.set(l2);
                        }
                        Cursor cursor2 = kVar2.a;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        m.set(kVar);
                        return h2;
                    }
                }
                throw new a("No acceptable module " + str + " found. Local version is " + a2.a + " and remote version is " + a2.b + ".", null);
            } catch (Throwable th2) {
                th = th2;
                if (longValue == j2) {
                    n.remove();
                } else {
                    n.set(l2);
                }
                Cursor cursor3 = kVar2.a;
                if (cursor3 != null) {
                    cursor3.close();
                }
                m.set(kVar);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            j2 = 0;
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x01c7 -> B:24:0x01cc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x01c9 -> B:24:0x01cc). Please report as a decompilation issue!!! */
    public static int f(Context context, String str, boolean z) {
        Field declaredField;
        Throwable th;
        RemoteException remoteException;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = h;
                int i2 = 0;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e2.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                i(classLoader);
                            } catch (a unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!k(context)) {
                                return 0;
                            }
                            if (!j) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int g2 = g(context, str, z, true);
                                        String str2 = i;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader a2 = ax.U5.d.a();
                                            if (a2 == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    ax.U5.b.a();
                                                    String str3 = i;
                                                    C0821p.l(str3);
                                                    a2 = ax.U5.a.a(str3, ClassLoader.getSystemClassLoader());
                                                } else {
                                                    String str4 = i;
                                                    C0821p.l(str4);
                                                    a2 = new com.google.android.gms.dynamite.a(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            i(a2);
                                            declaredField.set(null, a2);
                                            h = bool2;
                                            return g2;
                                        }
                                        return g2;
                                    } catch (a unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        h = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return g(context, str, z, false);
                    } catch (a e3) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e3.getMessage());
                        return 0;
                    }
                }
                m l2 = l(context);
                try {
                    if (l2 != null) {
                        try {
                            int B = l2.B();
                            if (B >= 3) {
                                k kVar = (k) m.get();
                                if (kVar == null || (cursor = kVar.a) == null) {
                                    Cursor cursor2 = (Cursor) ax.T5.b.B(l2.f2(ax.T5.b.a2(context), str, z, ((Long) n.get()).longValue()));
                                    if (cursor2 != null) {
                                        try {
                                            if (cursor2.moveToFirst()) {
                                                int i3 = cursor2.getInt(0);
                                                r2 = (i3 <= 0 || !j(cursor2)) ? cursor2 : null;
                                                if (r2 != null) {
                                                    r2.close();
                                                }
                                                i2 = i3;
                                            }
                                        } catch (RemoteException e4) {
                                            remoteException = e4;
                                            r2 = cursor2;
                                            Log.w("DynamiteModule", "Failed to retrieve remote module version: " + remoteException.getMessage());
                                            if (r2 != null) {
                                                r2.close();
                                            }
                                            return i2;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            r2 = cursor2;
                                            if (r2 == null) {
                                                throw th;
                                            }
                                            r2.close();
                                            throw th;
                                        }
                                    }
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                } else {
                                    i2 = cursor.getInt(0);
                                }
                            } else if (B == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                i2 = l2.b2(ax.T5.b.a2(context), str, z);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                i2 = l2.a2(ax.T5.b.a2(context), str, z);
                            }
                        } catch (RemoteException e5) {
                            remoteException = e5;
                        }
                    }
                    return i2;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            ax.R5.g.a(context, th4);
            throw th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a8, code lost:
    
        r9.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int g(android.content.Context r9, java.lang.String r10, boolean r11, boolean r12) throws com.google.android.gms.dynamite.DynamiteModule.a {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.g(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static DynamiteModule h(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }

    private static void i(ClassLoader classLoader) throws a {
        n nVar;
        ax.U5.f fVar = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder == null) {
                nVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                nVar = queryLocalInterface instanceof n ? (n) queryLocalInterface : new n(iBinder);
            }
            r = nVar;
        } catch (ClassNotFoundException e2) {
            e = e2;
            throw new a("Failed to instantiate dynamite loader", e, fVar);
        } catch (IllegalAccessException e3) {
            e = e3;
            throw new a("Failed to instantiate dynamite loader", e, fVar);
        } catch (InstantiationException e4) {
            e = e4;
            throw new a("Failed to instantiate dynamite loader", e, fVar);
        } catch (NoSuchMethodException e5) {
            e = e5;
            throw new a("Failed to instantiate dynamite loader", e, fVar);
        } catch (InvocationTargetException e6) {
            e = e6;
            throw new a("Failed to instantiate dynamite loader", e, fVar);
        }
    }

    private static boolean j(Cursor cursor) {
        k kVar = (k) m.get();
        if (kVar == null || kVar.a != null) {
            return false;
        }
        kVar.a = cursor;
        return true;
    }

    private static boolean k(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(l)) {
            return true;
        }
        boolean z = false;
        if (l == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (C0748i.f().h(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            l = Boolean.valueOf(z);
            if (z && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                j = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    private static m l(Context context) {
        m mVar;
        synchronized (DynamiteModule.class) {
            m mVar2 = q;
            if (mVar2 != null) {
                return mVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    mVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    mVar = queryLocalInterface instanceof m ? (m) queryLocalInterface : new m(iBinder);
                }
                if (mVar != null) {
                    q = mVar;
                    return mVar;
                }
            } catch (Exception e2) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e2.getMessage());
            }
            return null;
        }
    }

    @ResultIgnorabilityUnspecified
    public Context b() {
        return this.a;
    }

    public IBinder d(String str) throws a {
        try {
            return (IBinder) this.a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new a("Failed to instantiate module class: ".concat(String.valueOf(str)), e2, null);
        }
    }
}
