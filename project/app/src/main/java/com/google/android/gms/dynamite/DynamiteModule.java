/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import ax.M5.p;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamite.c;
import com.google.android.gms.dynamite.d;
import com.google.android.gms.dynamite.e;
import com.google.android.gms.dynamite.f;
import com.google.android.gms.dynamite.g;
import com.google.android.gms.dynamite.h;
import com.google.android.gms.dynamite.i;
import com.google.android.gms.dynamite.j;
import com.google.android.gms.dynamite.k;
import com.google.android.gms.dynamite.l;
import com.google.android.gms.dynamite.m;
import com.google.android.gms.dynamite.n;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public final class DynamiteModule {
    public static final b b;
    public static final b c;
    public static final b d;
    public static final b e;
    public static final b f;
    public static final b g;
    private static Boolean h;
    private static String i;
    private static boolean j = false;
    private static int k = -1;
    private static Boolean l;
    private static final ThreadLocal m;
    private static final ThreadLocal n;
    private static final b.a o;
    public static final b p;
    private static m q;
    private static n r;
    private final Context a;

    static {
        m = new ThreadLocal();
        n = new com.google.android.gms.dynamite.b();
        o = new c();
        b = new d();
        c = new e();
        d = new f();
        e = new g();
        f = new h();
        g = new i();
        p = new j();
    }

    private DynamiteModule(Context context) {
        ax.M5.p.l(context);
        this.a = context;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int a(Context object, String string) {
        try {
            object = object.getApplicationContext().getClassLoader();
            Object object2 = new StringBuilder();
            ((StringBuilder)object2).append("com.google.android.gms.dynamite.descriptors.");
            ((StringBuilder)object2).append(string);
            ((StringBuilder)object2).append(".ModuleDescriptor");
            object2 = ((ClassLoader)object).loadClass(((StringBuilder)object2).toString());
            object = ((Class)object2).getDeclaredField("MODULE_ID");
            object2 = ((Class)object2).getDeclaredField("MODULE_VERSION");
            if (ax.M5.n.b(((Field)object).get(null), string)) return ((Field)object2).getInt(null);
            object = String.valueOf(((Field)object).get(null));
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Module descriptor id '");
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append("' didn't match expected id '");
            ((StringBuilder)object2).append(string);
            ((StringBuilder)object2).append("'");
            Log.e((String)"DynamiteModule", (String)((StringBuilder)object2).toString());
            return 0;
        }
        catch (Exception exception) {
        }
        catch (ClassNotFoundException classNotFoundException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Local module descriptor class for ");
            stringBuilder.append(string);
            stringBuilder.append(" not found.");
            Log.w((String)"DynamiteModule", (String)stringBuilder.toString());
            return 0;
        }
        Log.e((String)"DynamiteModule", (String)"Failed to load module descriptor class: ".concat(String.valueOf(exception.getMessage())));
        return 0;
    }

    public static int c(Context context, String string) {
        return DynamiteModule.f(context, string, false);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @ResultIgnorabilityUnspecified
    public static DynamiteModule e(Context var0, b var1_4, String var2_5) throws a {
        block52: {
            block46: {
                block48: {
                    block50: {
                        block47: {
                            var11_6 = var0 /* !! */ .getApplicationContext();
                            if (var11_6 == null) throw new a("null application Context", null);
                            var7_7 = DynamiteModule.m;
                            var8_12 = (k)var7_7.get();
                            var10_13 = new k(null);
                            var7_7.set(var10_13);
                            var12_14 = DynamiteModule.n;
                            var9_15 = (Long)var12_14.get();
                            var5_16 = var9_15;
                            var12_14.set(SystemClock.elapsedRealtime());
                            var12_14 = var1_4.a(var0 /* !! */ , var2_5, DynamiteModule.o);
                            var3_17 = var12_14.a;
                            try {
                                block49: {
                                    block51: {
                                        var4_18 = var12_14.b;
                                        var13_19 = new StringBuilder();
                                        var13_19.append("Considering local module ");
                                        var13_19.append(var2_5);
                                        var13_19.append(":");
                                        var13_19.append(var3_17);
                                        var13_19.append(" and remote module ");
                                        var13_19.append(var2_5);
                                        var13_19.append(":");
                                        var13_19.append(var4_18);
                                        Log.i((String)"DynamiteModule", (String)var13_19.toString());
                                        var4_18 = var12_14.c;
                                        if (var4_18 == 0) break block46;
                                        var3_17 = var4_18;
                                        if (var4_18 == -1) {
                                            if (var12_14.a == 0) break block46;
                                            var3_17 = -1;
                                        }
                                        if (var3_17 == 1 && var12_14.b == 0) break block46;
                                        if (var3_17 == -1) {
                                            var0 /* !! */  = DynamiteModule.h(var11_6, var2_5);
                                            break block47;
                                        }
                                        if (var3_17 != 1) break block48;
                                        var4_18 = var12_14.b;
                                        try {
                                            if (!DynamiteModule.k(var0 /* !! */ )) break block49;
                                            var13_19 = DynamiteModule.h;
                                            // MONITOREXIT : com.google.android.gms.dynamite.DynamiteModule.class
                                            if (var13_19 == null) ** GOTO lbl139
                                        }
                                        catch (Throwable var7_10) {}
                                        if (!var13_19.booleanValue()) ** GOTO lbl-1000
                                        var13_19 = new StringBuilder();
                                        var13_19.append("Selected remote version of ");
                                        var13_19.append(var2_5);
                                        var13_19.append(", version >= ");
                                        var13_19.append(var4_18);
                                        Log.i((String)"DynamiteModule", (String)var13_19.toString());
                                        // MONITORENTER : com.google.android.gms.dynamite.DynamiteModule.class
                                        var13_19 = DynamiteModule.r;
                                        // MONITOREXIT : com.google.android.gms.dynamite.DynamiteModule.class
                                        if (var13_19 == null) ** GOTO lbl100
                                        var14_21 = (k)var7_7.get();
                                        if (var14_21 == null || var14_21.a == null) ** GOTO lbl-1000
                                        var7_7 = var0 /* !! */ .getApplicationContext();
                                        var14_21 = var14_21.a;
                                        ax.T5.b.a2(null);
                                        // MONITORENTER : com.google.android.gms.dynamite.DynamiteModule.class
                                        var3_17 = DynamiteModule.k >= 2 ? 1 : 0;
                                        // MONITOREXIT : com.google.android.gms.dynamite.DynamiteModule.class
                                        if (var3_17 == 0) ** GOTO lbl87
                                        Log.v((String)"DynamiteModule", (String)"Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                        var7_7 = var13_19.a2(ax.T5.b.a2(var7_7), var2_5, var4_18, ax.T5.b.a2(var14_21));
                                        break block51;
lbl87:
                                        // 1 sources

                                        Log.w((String)"DynamiteModule", (String)"Dynamite loader version < 2, falling back to loadModule2");
                                        var7_7 = var13_19.B(ax.T5.b.a2(var7_7), var2_5, var4_18, ax.T5.b.a2(var14_21));
                                    }
                                    var13_19 = (Context)ax.T5.b.B((ax.T5.a)var7_7);
                                    if (var13_19 == null) {
                                        var7_7 = new a("Failed to get module context", null);
                                        throw var7_7;
                                    }
                                    var7_7 = new DynamiteModule((Context)var13_19);
                                    var0 /* !! */  = var7_7;
                                    break block47;
lbl-1000:
                                    // 1 sources

                                    {
                                        var7_7 = new a("No result cursor", null);
                                        throw var7_7;
lbl100:
                                        // 1 sources

                                        var7_7 = new a("DynamiteLoaderV2 was not cached.", null);
                                        throw var7_7;
                                    }
lbl-1000:
                                    // 1 sources

                                    {
                                        var13_19 = new StringBuilder();
                                        var13_19.append("Selected remote version of ");
                                        var13_19.append(var2_5);
                                        var13_19.append(", version >= ");
                                        var13_19.append(var4_18);
                                        Log.i((String)"DynamiteModule", (String)var13_19.toString());
                                        var13_19 = DynamiteModule.l(var0 /* !! */ );
                                        if (var13_19 == null) {
                                            var7_7 = new a("Failed to create IDynamiteLoader.", null);
                                            throw var7_7;
                                        }
                                        var3_17 = var13_19.B();
                                        if (var3_17 >= 3) {
                                            if ((var7_7 = (k)var7_7.get()) == null) {
                                                var7_7 = new a("No cached result cursor holder", null);
                                                throw var7_7;
                                            }
                                            var7_7 = var13_19.d2(ax.T5.b.a2(var0 /* !! */ ), var2_5, var4_18, ax.T5.b.a2(var7_7.a));
                                        } else if (var3_17 == 2) {
                                            Log.w((String)"DynamiteModule", (String)"IDynamite loader version = 2");
                                            var7_7 = var13_19.e2(ax.T5.b.a2(var0 /* !! */ ), var2_5, var4_18);
                                        } else {
                                            Log.w((String)"DynamiteModule", (String)"Dynamite loader version < 2, falling back to createModuleContext");
                                            var7_7 = var13_19.c2(ax.T5.b.a2(var0 /* !! */ ), var2_5, var4_18);
                                        }
                                        var7_7 = ax.T5.b.B((ax.T5.a)var7_7);
                                        if (var7_7 == null) {
                                            var7_7 = new a("Failed to load remote module.", null);
                                            throw var7_7;
                                        }
                                        var7_7 = new DynamiteModule((Context)var7_7);
                                        var0 /* !! */  = var7_7;
                                        break block47;
lbl139:
                                        // 1 sources

                                        var7_7 = new a("Failed to determine which loading route to use.", null);
                                        throw var7_7;
                                    }
                                }
                                var7_7 = new a("Remote loading disabled", null);
                                throw var7_7;
                                try {
                                    throw var7_10;
                                }
                                catch (Throwable var13_20) {}
                                catch (a var7_8) {
                                    throw var7_8;
                                }
                                catch (RemoteException var7_9) {}
                                ** finally { 
lbl153:
                                // 2 sources

                                try {
                                    ax.R5.g.a(var0 /* !! */ , var13_20);
                                    var7_7 = new a("Failed to load remote module.", var13_20, null);
                                    throw var7_7;
                                }
                                catch (a var7_11) {}
                            }
                            catch (Throwable var0_1) {}
                            {
                                var13_19 = var7_11.getMessage();
                                var14_21 = new StringBuilder();
                                var14_21.append("Failed to load remote module: ");
                                var14_21.append((String)var13_19);
                                Log.w((String)"DynamiteModule", (String)var14_21.toString());
                                var3_17 = var12_14.a;
                                if (var3_17 == 0) break block50;
                                var12_14 = new l(var3_17, 0);
                                if (var1_4.a((Context)var0 /* !! */ , (String)var2_5, (b.a)var12_14).c != -1) break block50;
                                var0 /* !! */  = DynamiteModule.h(var11_6, var2_5);
                            }
                        }
                        if (var5_16 == 0L) {
                            DynamiteModule.n.remove();
                        } else {
                            DynamiteModule.n.set(var9_15);
                        }
                        var1_4 = var10_13.a;
                        if (var1_4 != null) {
                            var1_4.close();
                        }
                        DynamiteModule.m.set(var8_12);
                        return var0 /* !! */ ;
                    }
                    var0 /* !! */  = new a("Remote load failed. No local fallback found.", var7_11, null);
                    throw var0 /* !! */ ;
                    break block52;
                }
                var1_4 = new StringBuilder();
                var1_4.append("VersionPolicy returned invalid code:");
                var1_4.append(var3_17);
                var0 /* !! */  = new a(var1_4.toString(), null);
                throw var0 /* !! */ ;
            }
            var3_17 = var12_14.a;
            var4_18 = var12_14.b;
            var1_4 = new StringBuilder();
            var1_4.append("No acceptable module ");
            var1_4.append(var2_5);
            var1_4.append(" found. Local version is ");
            var1_4.append(var3_17);
            var1_4.append(" and remote version is ");
            var1_4.append(var4_18);
            var1_4.append(".");
            var0 /* !! */  = new a(var1_4.toString(), null);
            throw var0 /* !! */ ;
            catch (Throwable var0_2) {
                // empty catch block
            }
        }
        if (var5_16 == 0L) {
            DynamiteModule.n.remove();
        } else {
            DynamiteModule.n.set(var9_15);
        }
        var1_4 = var10_13.a;
        if (var1_4 != null) {
            var1_4.close();
        }
        DynamiteModule.m.set(var8_12);
        throw var0_3;
    }

    /*
     * Exception decompiling
     */
    public static int f(Context var0, String var1_1, boolean var2_6) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 4[TRYBLOCK] [8 : 99->122)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static int g(Context var0, String var1_1, boolean var2_9, boolean var3_10) throws a {
        block21: {
            block22: {
                var10_11 /* !! */  = null;
                var11_12 /* !! */  = var0 /* !! */ .getContentResolver();
                var8_13 = (Long)DynamiteModule.n.get();
                var0 /* !! */  = "api_force_staging";
                var7_14 = true;
                if (!var2_9) {
                    var0 /* !! */  = "api";
                }
                if ((var11_12 /* !! */  = var11_12 /* !! */ .query((var12_15 /* !! */  = new Uri.Builder()).scheme("content").authority("com.google.android.gms.chimera").path((String)var0 /* !! */ ).appendPath((String)var1_1).appendQueryParameter("requestStartTime", String.valueOf(var8_13)).build(), null, null, null, null)) == null) ** GOTO lbl54
                var0 /* !! */  = var11_12 /* !! */ ;
                var10_11 /* !! */  = var11_12 /* !! */ ;
                if (!var11_12 /* !! */ .moveToFirst()) ** GOTO lbl54
                var6_16 = false;
                var2_9 = false;
                var0 /* !! */  = var11_12 /* !! */ ;
                var10_11 /* !! */  = var11_12 /* !! */ ;
                var4_17 = var11_12 /* !! */ .getInt(0);
                var1_1 = var11_12 /* !! */ ;
                if (var4_17 <= 0) ** GOTO lbl-1000
                var0 /* !! */  = var11_12 /* !! */ ;
                var10_11 /* !! */  = var11_12 /* !! */ ;
                ** synchronized (DynamiteModule.class)
lbl-1000:
                // 1 sources

                {
                    DynamiteModule.i = var11_12 /* !! */ .getString(2);
                    var5_18 = var11_12 /* !! */ .getColumnIndex("loaderVersion");
                    if (var5_18 >= 0) {
                        DynamiteModule.k = var11_12 /* !! */ .getInt(var5_18);
                    }
                    if ((var5_18 = var11_12 /* !! */ .getColumnIndex("disableStandaloneDynamiteLoader2")) >= 0) {
                        var2_9 = var11_12 /* !! */ .getInt(var5_18) != 0 ? var7_14 : false;
                        DynamiteModule.j = var2_9;
                    }
                    // MONITOREXIT @DISABLED, blocks:[2, 8] lbl32 : MonitorExitStatement: MONITOREXIT : com.google.android.gms.dynamite.DynamiteModule.class
                    var0 /* !! */  = var11_12 /* !! */ ;
                    var10_11 /* !! */  = var11_12 /* !! */ ;
                }
                try {
                    var7_14 = DynamiteModule.j((Cursor)var11_12 /* !! */ );
                    var1_1 = var11_12 /* !! */ ;
                    var6_16 = var2_9;
                    if (!var7_14) ** GOTO lbl-1000
                    var1_1 = null;
                    var6_16 = var2_9;
                }
lbl80:
                // 4 sources

                catch (Throwable var1_3) {
                    break block21;
                }
lbl82:
                // 4 sources

                catch (Exception var1_4) {}
lbl-1000:
                // 3 sources

                {
                    if (var3_10 && var6_16) {
                        var0 /* !! */  = var1_1;
                        var10_11 /* !! */  = var1_1;
                        var0 /* !! */  = var1_1;
                        var10_11 /* !! */  = var1_1;
                        var11_12 /* !! */  = new a("forcing fallback to container DynamiteLoader impl", null);
                        var0 /* !! */  = var1_1;
                        var10_11 /* !! */  = var1_1;
                        throw var11_12 /* !! */ ;
                    }
                    if (var1_1 != null) {
                        var1_1.close();
                    }
                    return var4_17;
lbl54:
                    // 2 sources

                    var0 /* !! */  = var11_12 /* !! */ ;
                    var10_11 /* !! */  = var11_12 /* !! */ ;
                    Log.w((String)"DynamiteModule", (String)"Failed to retrieve remote module version.");
                    var0 /* !! */  = var11_12 /* !! */ ;
                    var10_11 /* !! */  = var11_12 /* !! */ ;
                    var0 /* !! */  = var11_12 /* !! */ ;
                    var10_11 /* !! */  = var11_12 /* !! */ ;
                    var1_1 = new a("Failed to connect to dynamite module ContentResolver.", null);
                    var0 /* !! */  = var11_12 /* !! */ ;
                    var10_11 /* !! */  = var11_12 /* !! */ ;
                    throw var1_1;
                    catch (Throwable var1_5) {
                        var0 /* !! */  = var10_11 /* !! */ ;
                        break block21;
                    }
                    catch (Exception var1_6) {
                        var10_11 /* !! */  = null;
                        break block22;
                    }
                    {
                        catch (Throwable var1_2) {}
                        // MONITOREXIT @DISABLED, blocks:[5, 8] lbl75 : MonitorExitStatement: MONITOREXIT : com.google.android.gms.dynamite.DynamiteModule.class
                        var0 /* !! */  = var11_12 /* !! */ ;
                        var10_11 /* !! */  = var11_12 /* !! */ ;
                        ** try [egrp 5[TRYBLOCK] [20, 19 : 292->338)] { 
lbl79:
                        // 1 sources

                        throw var1_2;
                    }
                }
            }
            var0 /* !! */  = var10_11 /* !! */ ;
            if (var1_7 instanceof a) {
                var0 /* !! */  = var10_11 /* !! */ ;
                throw var1_7;
            }
            var0 /* !! */  = var10_11 /* !! */ ;
            var0 /* !! */  = var10_11 /* !! */ ;
            var12_15 /* !! */  = var1_7.getMessage();
            var0 /* !! */  = var10_11 /* !! */ ;
            var0 /* !! */  = var10_11 /* !! */ ;
            var13_19 = new StringBuilder();
            var0 /* !! */  = var10_11 /* !! */ ;
            var13_19.append("V2 version check failed: ");
            var0 /* !! */  = var10_11 /* !! */ ;
            var13_19.append((String)var12_15 /* !! */ );
            var0 /* !! */  = var10_11 /* !! */ ;
            var11_12 /* !! */  = new a(var13_19.toString(), (Throwable)var1_7, null);
            var0 /* !! */  = var10_11 /* !! */ ;
            throw var11_12 /* !! */ ;
        }
        if (var0 /* !! */  != null) {
            var0 /* !! */ .close();
        }
        throw var1_8;
    }

    private static DynamiteModule h(Context context, String string) {
        Log.i((String)"DynamiteModule", (String)"Selected local version of ".concat(String.valueOf(string)));
        return new DynamiteModule(context);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void i(ClassLoader object) throws a {
        Throwable var0_6;
        try {
            IBinder iBinder = (IBinder)((ClassLoader)object).loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            object = iBinder == null ? null : ((object = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2")) instanceof n ? (n)object : new n(iBinder));
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw new a("Failed to instantiate dynamite loader", (Throwable)var0_6, null);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw new a("Failed to instantiate dynamite loader", (Throwable)var0_6, null);
        }
        catch (InstantiationException instantiationException) {
            throw new a("Failed to instantiate dynamite loader", (Throwable)var0_6, null);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new a("Failed to instantiate dynamite loader", (Throwable)var0_6, null);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new a("Failed to instantiate dynamite loader", (Throwable)var0_6, null);
        }
        r = object;
    }

    private static boolean j(Cursor cursor) {
        k k8 = (k)m.get();
        if (k8 != null && k8.a == null) {
            k8.a = cursor;
            return true;
        }
        return false;
    }

    private static boolean k(Context context) {
        Boolean bl = Boolean.TRUE;
        if (bl.equals(null)) {
            return true;
        }
        if (bl.equals(l)) {
            return true;
        }
        bl = l;
        boolean bl2 = false;
        boolean bl3 = false;
        if (bl == null) {
            bl = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            boolean bl4 = bl3;
            if (ax.J5.i.f().h(context, 10000000) == 0) {
                bl4 = bl3;
                if (bl != null) {
                    bl4 = bl3;
                    if ("com.google.android.gms".equals(((ProviderInfo)bl).packageName)) {
                        bl4 = true;
                    }
                }
            }
            l = bl4;
            bl2 = bl4;
            if (bl4) {
                context = ((ProviderInfo)bl).applicationInfo;
                bl2 = bl4;
                if (context != null) {
                    bl2 = bl4;
                    if ((context.flags & 0x81) == 0) {
                        Log.i((String)"DynamiteModule", (String)"Non-system-image GmsCore APK, forcing V1");
                        j = true;
                        bl2 = bl4;
                    }
                }
            }
        }
        if (!bl2) {
            Log.e((String)"DynamiteModule", (String)"Invalid GmsCore APK, remote loading disabled.");
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static m l(Context object) {
        synchronized (DynamiteModule.class) {
            Throwable throwable2;
            block7: {
                Exception exception2;
                Object object2;
                block8: {
                    try {
                        object2 = q;
                        if (object2 != null) {
                            return object2;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                    try {
                        object = (IBinder)object.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                        if (object == null) {
                            return null;
                        }
                        object2 = object.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                        object = object2 instanceof m ? (m)object2 : new m((IBinder)object);
                    }
                    catch (Exception exception2) {
                        break block8;
                    }
                    if (object == null) return null;
                    q = object;
                    return object;
                }
                String string = exception2.getMessage();
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("Failed to load IDynamiteLoader from GmsCore: ");
                ((StringBuilder)object2).append(string);
                Log.e((String)"DynamiteModule", (String)((StringBuilder)object2).toString());
                return null;
            }
            throw throwable2;
        }
    }

    @ResultIgnorabilityUnspecified
    public Context b() {
        return this.a;
    }

    /*
     * WARNING - void declaration
     */
    public IBinder d(String string) throws a {
        Throwable var2_6;
        try {
            IBinder iBinder = (IBinder)this.a.getClassLoader().loadClass(string).newInstance();
            return iBinder;
        }
        catch (IllegalAccessException illegalAccessException) {
        }
        catch (InstantiationException instantiationException) {
        }
        catch (ClassNotFoundException classNotFoundException) {
            // empty catch block
        }
        throw new a("Failed to instantiate module class: ".concat(String.valueOf(string)), (Throwable)var2_6, null);
    }

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static class a
    extends Exception {
        /* synthetic */ a(String string, ax.U5.f f8) {
            super(string);
        }

        /* synthetic */ a(String string, Throwable throwable, ax.U5.f f8) {
            super(string, throwable);
        }
    }

    public static interface com.google.android.gms.dynamite.DynamiteModule$b {
        public b a(Context var1, String var2, a var3) throws com.google.android.gms.dynamite.DynamiteModule$a;

        public static interface a {
            public int a(Context var1, String var2, boolean var3) throws com.google.android.gms.dynamite.DynamiteModule$a;

            public int b(Context var1, String var2);
        }

        public static class b {
            public int a = 0;
            public int b = 0;
            public int c = 0;
        }
    }
}

