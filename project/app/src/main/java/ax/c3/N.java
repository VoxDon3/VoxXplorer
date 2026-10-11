/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import ax.X2.Q;
import ax.c3.A;
import ax.c3.d0;
import ax.c3.n0;
import ax.c3.z;
import com.alphainventor.filemanager.file.n;
import java.util.ArrayList;
import java.util.List;

public class N {
    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String a(Context object, Uri uri) {
        block6: {
            Object var0_3;
            Cursor cursor;
            block7: {
                try {
                    cursor = object.getContentResolver().query((Uri)cursor, new String[]{"_id", "_data"}, null, null, null);
                    if (cursor == null) break block6;
                }
                catch (Exception exception) {
                    return null;
                }
                if (cursor.moveToFirst()) {
                    String string = cursor.getString(1);
                    break block7;
                }
                Object var0_2 = null;
            }
            cursor.close();
            return var0_3;
        }
        return null;
    }

    public static Uri b(Context context, String string) {
        return N.c(context, string, false);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Uri c(Context context, String string, boolean bl) {
        int n8;
        z z8;
        z z9 = z8 = A.g(d0.k(string));
        if (z8 == null) {
            if (!bl) return null;
            z9 = z.u0;
        }
        if (Q.Y1()) {
            Q.k(37, 36);
        }
        if ((n8 = a.a[z9.ordinal()]) != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    if (!bl) return null;
                    z9 = MediaStore.Files.getContentUri((String)"external");
                } else {
                    z9 = MediaStore.Audio.Media.getContentUri((String)"external");
                }
            } else {
                z9 = MediaStore.Images.Media.getContentUri((String)"external");
            }
        } else {
            z9 = MediaStore.Video.Media.getContentUri((String)"external");
        }
        try {
            context = context.getContentResolver().query((Uri)z9, new String[]{"_id", "_data"}, "_data = ?", new String[]{string}, null);
            if (context == null) return null;
        }
        catch (Exception exception) {
            return null;
        }
        long l8 = context.moveToFirst() ? context.getLong(0) : -1L;
        context.close();
        if (l8 == -1L) {
            return null;
        }
        return ContentUris.withAppendedId((Uri)z9, (long)l8);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static List<String> d(Context var0, n var1_2, String var2_7, boolean var3_8) {
        block22: {
            block25: {
                block23: {
                    block26: {
                        block20: {
                            block21: {
                                var13_9 = new ArrayList<String>();
                                if (TextUtils.isEmpty((CharSequence)var2_7)) {
                                    return var13_9;
                                }
                                var10_10 = null;
                                var11_12 = null;
                                var12_13 = null;
                                try {
                                    var14_14 = var1_2.E();
                                    var15_15 = n0.c("external");
                                    var9_16 = var2_7.contains("*");
                                    if (!var9_16) break block20;
                                    var2_7 = var1_2 = var2_7.replace("*", "%");
                                    if (var1_2.startsWith("%")) break block21;
                                    var2_7 = new StringBuilder();
                                    var2_7.append("%");
                                    var2_7.append((String)var1_2);
                                    var2_7 = var2_7.toString();
                                }
                                catch (Throwable var1_3) {
                                    var0 = var10_10;
                                    break block22;
                                }
                                catch (Exception var0_1) {
                                    var0 = var11_12;
                                    break block23;
                                }
                            }
                            var1_2 = var2_7;
                            if (!var2_7.endsWith("%")) {
                                var1_2 = new StringBuilder();
                                var1_2.append((String)var2_7);
                                var1_2.append("%");
                                var1_2 = var1_2.toString();
                            }
                            break block26;
                        }
                        var1_2 = new StringBuilder();
                        var1_2.append("%");
                        var1_2.append((String)var2_7);
                        var1_2.append("%");
                        var1_2 = var1_2.toString();
                    }
                    var0 = var0.getContentResolver();
                    var2_7 = new StringBuilder();
                    var2_7.append(var14_14);
                    var2_7.append("/%");
                    var2_7 = var2_7.toString();
                    var0 = var0.query(var15_15, new String[]{"_data", "date_added"}, "_display_name LIKE ?1 AND _data LIKE ?2", new String[]{var1_2, var2_7}, "_data asc");
                    if (var0 == null) break block25;
                    var5_17 = 0L;
                    var1_2 = var12_13;
                    block10: while (true) {
                        block24: {
                            try {
                                while (true) {
                                    try {
                                        while (var0.moveToNext()) {
                                            var2_7 = var0.getString(0);
                                            if (var2_7 != null && (var9_16 = var2_7.equals(var14_14))) {
                                                continue;
                                            }
                                            break block24;
                                        }
                                        break block25;
                                    }
                                    catch (Exception var1_5) {
                                        break block10;
                                    }
                                    break;
                                }
                            }
                            catch (Throwable var1_4) {
                                break block22;
                            }
                        }
                        if (var3_8 || var2_7 == null) ** GOTO lbl-1000
                        var10_10 = d0.o(var14_14, (String)var2_7, true);
                        if (var10_10.length() > 1 && (var4_18 = var10_10.indexOf(47, 1)) >= 0) break block25;
lbl-1000:
                        // 3 sources

                        {
                            while (true) {
                                var7_19 = var0.getLong(1);
                                if (var1_2 != null && var1_2.equalsIgnoreCase((String)var2_7)) {
                                    if (var7_19 <= var5_17) ** continue;
                                    var13_9.remove(var1_2);
                                }
                                var13_9.add((String)var2_7);
                                var1_2 = var2_7;
                                var5_17 = var7_19;
                                continue block10;
                                break;
                            }
                        }
                        break;
                    }
                }
                if (var0 == null) return var13_9;
                var0.close();
                return var13_9;
                catch (Exception var10_11) {
                    ** continue;
                }
            }
            if (var0 == null) return var13_9;
            var0.close();
            return var13_9;
        }
        if (var0 == null) throw var1_6;
        var0.close();
        throw var1_6;
    }
}

