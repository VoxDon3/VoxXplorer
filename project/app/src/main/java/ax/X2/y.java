/*
 * Decompiled with CFR 0.152.
 */
package ax.X2;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcelable;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.provider.DocumentsContract;
import ax.Ha.c;
import ax.X2.N;
import ax.X2.Q;
import ax.X2.a;
import ax.X2.d;
import ax.X2.e;
import ax.X2.f;
import ax.X2.k;
import ax.X2.v;
import ax.X2.x;
import ax.b3.j;
import ax.b3.t;
import java.io.File;

@TargetApi(value=24)
public class y {
    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Uri a(ContentResolver var0, Uri var1_8, Uri var2_13, Uri var3_16, long var4_17, long var6_18) throws j {
        block39: {
            var13_19 = var0.acquireUnstableContentProviderClient(var1_8.getAuthority());
            var11_20 = null;
            var12_24 /* !! */  = null;
            var14_25 /* !! */  = new Bundle();
            var14_25 /* !! */ .putParcelable("uri", (Parcelable)var1_8);
            var14_25 /* !! */ .putParcelable("parentUri", (Parcelable)var2_13);
            var14_25 /* !! */ .putParcelable("android.content.extra.TARGET_URI", (Parcelable)var3_16 /* !! */ );
            var2_13 = (Uri)var13_19.call("android:moveDocument", null, var14_25 /* !! */ ).getParcelable("uri");
            try {
                var13_19.release();
                return var2_13;
            }
            catch (Exception var0_3) {
                return var2_13;
            }
            {
                block34: {
                    block38: {
                        block37: {
                            block35: {
                                block36: {
                                    catch (Throwable var1_9) {
                                        var0 = var11_20;
                                        break block34;
                                    }
                                    catch (Exception var11_21) {
                                        var2_13 = null;
                                        break block35;
                                    }
                                    catch (DeadObjectException var2_14) {}
                                    {
                                        var2_13 = var0.acquireContentProviderClient(var1_8.getAuthority());
                                        if (var2_13 == null) ** GOTO lbl-1000
                                    }
                                    var11_20 = var2_13.call("android:moveDocument", null, var14_25 /* !! */ );
                                    c.h().f().c("DeadObjectException RETRY SUCCESS").g("MOVE").h();
                                    var11_20 = (Uri)var11_20.getParcelable("uri");
                                    if (var13_19 == null) break block36;
                                    var13_19.release();
                                }
lbl33:
                                // 2 sources

                                while (true) {
                                    var2_13.release();
                                    return var11_20;
                                    break;
                                }
                                catch (Throwable var1_10) {
                                    var0 = var2_13;
                                    break block34;
                                }
                                catch (Exception var11_22) {
                                    break block35;
                                }
lbl-1000:
                                // 1 sources

                                {
                                    var11_20 = new j("ContentProviderClient for documentFile == null");
                                    throw var11_20;
                                }
                            }
                            var11_23.printStackTrace();
                            var14_25 /* !! */  = v.k((ContentResolver)var0, (Uri)var1_8);
                            if (var14_25 /* !! */ .a != v.b) ** GOTO lbl-1000
                            var1_8 = y.d((Uri)var1_8, var3_16 /* !! */ );
                            var0 = v.k((ContentResolver)var0, (Uri)var1_8);
                            var12_24 /* !! */  = var0;
                            if (var0.a != v.a) ** GOTO lbl-1000
                            if (!Q.E() || !(var10_26 = var11_23 instanceof NullPointerException)) ** GOTO lbl-1000
                            if (var13_19 == null) break block37;
                            try {
                                var13_19.release();
                            }
                            catch (Exception var0_1) {
                                // empty catch block
                            }
                        }
                        if (var2_13 == null) return var1_8;
lbl64:
                        // 2 sources

                        while (true) {
                            var2_13.release();
                            return var1_8;
                            break;
                        }
                        catch (Throwable var1_11) {
                            var0 = var2_13;
                            break block34;
                        }
lbl-1000:
                        // 1 sources

                        {
                            var3_16 /* !! */  = var0.b;
                            var12_24 /* !! */  = var0;
                            if (var3_16 /* !! */  == null) ** GOTO lbl-1000
                            var12_24 /* !! */  = var0;
                            if (var3_16 /* !! */ .e != var4_17) ** GOTO lbl-1000
                            var12_24 /* !! */  = var0;
                            if (var3_16 /* !! */ .d != var6_18) ** GOTO lbl-1000
                            c.h().f().b("Move document target exist").l((Throwable)var11_23).h();
                            if (var13_19 == null) break block38;
                        }
                        try {
                            var13_19.release();
                        }
                        catch (Exception var0_2) {
                            // empty catch block
                        }
                    }
                    if (var2_13 == null) return var1_8;
                    ** continue;
lbl-1000:
                    // 5 sources

                    {
                        if ((var8_27 = var14_25 /* !! */ .a) == (var9_28 = v.b) && var12_24 /* !! */  != null && var12_24 /* !! */ .a == var9_28) {
                            var0 = new StringBuilder();
                            var0.append("move document not exist : ");
                            var0.append(var11_23.getClass().getSimpleName());
                            var0.append(":");
                            var0.append(var11_23.getMessage());
                            var1_8 = new t(var0.toString());
                            throw var1_8;
                        }
                        var1_8 = new StringBuilder();
                        var1_8.append("move document exception : ");
                        var1_8.append(var11_23.getClass().getSimpleName());
                        var1_8.append(":");
                        var1_8.append(var11_23.getMessage());
                        var0 = new j(var1_8.toString());
                        throw var0;
                    }
                }
                if (var13_19 != null) {
                    try {
                        var13_19.release();
                    }
                    catch (Exception var2_15) {
                        // empty catch block
                    }
                }
                if (var0 == null) throw var1_12;
                try {}
                catch (Exception var0_7) {
                    throw var1_12;
                }
                break block39;
                catch (Exception var0_6) {
                    return var1_8;
                }
                catch (Exception var0_4) {
                    ** continue;
                }
                catch (Exception var0_5) {
                    return var11_20;
                }
            }
        }
        var0.release();
        throw var1_12;
    }

    public static Intent b(Context context, String string) {
        if ((context = f.a((StorageManager)context.getSystemService("storage"), new File(string))) == null) {
            return null;
        }
        return x.a((StorageVolume)context, null);
    }

    public static Intent c(Context object, String string) {
        if ((object = (StorageManager)object.getSystemService("storage")) == null) {
            return null;
        }
        object = d.a((StorageManager)object).iterator();
        while (object.hasNext()) {
            StorageVolume storageVolume = e.a(object.next());
            if (string == null || !string.equals(k.a(storageVolume))) continue;
            return x.a(storageVolume, null);
        }
        return null;
    }

    private static Uri d(Uri object, Uri object2) {
        String string = DocumentsContract.getTreeDocumentId((Uri)object);
        string = DocumentsContract.buildTreeDocumentUri((String)object.getAuthority(), (String)string);
        object2 = DocumentsContract.getDocumentId((Uri)object2);
        String string2 = y.e((Uri)object);
        object = new StringBuilder();
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append("/");
        ((StringBuilder)object).append(string2);
        return DocumentsContract.buildDocumentUriUsingTree((Uri)string, (String)((StringBuilder)object).toString());
    }

    private static String e(Uri object) {
        object = DocumentsContract.getDocumentId((Uri)object);
        return ((String)object).substring(Math.max(((String)object).lastIndexOf("/"), ((String)object).lastIndexOf(":")));
    }

    public static N f(Context context, String string) {
        return a.a((StorageManager)context.getSystemService("storage"), new File(string));
    }
}

