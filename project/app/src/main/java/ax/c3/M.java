/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import android.text.TextUtils;
import ax.Ha.c;
import ax.Q2.g;
import ax.X2.J;
import ax.X2.Q;
import ax.c3.A;
import ax.c3.B;
import ax.c3.d0;
import ax.c3.n0;
import ax.c3.v;
import ax.g3.i;
import ax.o3.f;
import ax.r3.d;
import ax.u3.b;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

public class M {
    private static final Logger a = g.a(M.class);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean a(Context context, String string, boolean bl) {
        Exception exception2;
        block8: {
            String string2;
            if (TextUtils.isEmpty((CharSequence)string)) {
                return false;
            }
            if (!new File(string).exists()) {
                a.severe("Scan requested file not found");
                return false;
            }
            Q.k(37, 36);
            try {
                string2 = Q.c2() ? n0.a(string) : "external";
            }
            catch (Exception exception2) {
                break block8;
            }
            ContentResolver contentResolver = context.getContentResolver();
            ContentValues contentValues = new ContentValues();
            if (bl) {
                if (Q.x()) {
                    context = n0.b(string2);
                } else {
                    context = n0.c(string2);
                    contentValues.put("format", Integer.valueOf(12289));
                }
            } else {
                context = n0.c(string2);
            }
            contentValues.put("_data", string);
            context = contentResolver.insert((Uri)context, contentValues);
            return context != null;
        }
        exception2.printStackTrace();
        return bl && exception2 instanceof SQLiteConstraintException && exception2.getMessage() != null && exception2.getMessage().contains("UNIQUE constraint failed");
    }

    /*
     * Unable to fully structure code
     */
    public static void b(Context var0, List<f> var1_1, i var2_2) {
        block44: {
            block42: {
                var17_3 = var1_1.iterator();
                var18_13 = new ArrayList<ContentProviderOperation>();
                var19_14 = new ArrayList<a>();
                while (var17_3.hasNext()) {
                    var20_15 = var17_3.next();
                    if (!var20_15.q && !var20_15.b(var0) || var20_15.m0) continue;
                    if (Q.T() && !var20_15.b(var0)) {
                        if (var20_15.d0) {
                            var18_13.add(M.g(var20_15.c0, false, var20_15.h0));
                            var19_14.add(new a(var20_15.c0, false, var20_15.h0));
                        }
                    } else {
                        if (var20_15.d0) {
                            var18_13.add(M.g(var20_15.c0, true, var20_15.h0));
                            var19_14.add(new a(var20_15.c0, true, var20_15.h0));
                        }
                        var18_13.add(M.g(var20_15.c0, false, var20_15.h0));
                        var19_14.add(new a(var20_15.c0, false, var20_15.h0));
                    }
                    if ((var1_1 = var20_15.j0) != null) {
                        d.B(var0, B.Z(var20_15.c0, (String)var1_1, var20_15.k0, var20_15.l0, null));
                    }
                    if (!var20_15.q) continue;
                    var17_3.remove();
                }
                if (var18_13.size() <= 0) break block42;
                var20_15 = var0.getContentResolver();
                var21_16 = new ArrayList<ContentProviderOperation>();
                var22_17 = new ArrayList<a>();
                var1_1 = null;
                var13_18 = 0;
                var3_19 = 0;
                while (var13_18 < var18_13.size()) {
                    block41: {
                        block40: {
                            block39: {
                                block38: {
                                    block43: {
                                        block37: {
                                            block36: {
                                                block35: {
                                                    block34: {
                                                        block31: {
                                                            block33: {
                                                                var21_16.clear();
                                                                var22_17.clear();
                                                                for (var4_20 = 0; var4_20 < 50 && (var5_21 = var13_18 + var4_20) < var18_13.size(); ++var4_20) {
                                                                    var21_16.add((ContentProviderOperation)var18_13.get(var5_21));
                                                                    var22_17.add((a)var19_14.get(var5_21));
                                                                }
                                                                if (var2_2 != null) {
                                                                    var2_2.a(var3_19, var18_13.size());
                                                                }
                                                                var10_26 = var3_19;
                                                                var7_23 = var3_19;
                                                                var4_20 = var3_19;
                                                                var9_25 = var3_19;
                                                                var5_21 = var3_19;
                                                                var12_28 = var3_19;
                                                                var8_24 = var3_19;
                                                                var11_27 = var3_19;
                                                                var6_22 = var3_19;
                                                                var24_33 = var20_15.applyBatch("media", var21_16);
                                                                var4_20 = var3_19;
                                                                if (var24_33 == null) break block31;
                                                                var10_26 = var3_19;
                                                                var7_23 = var3_19;
                                                                var4_20 = var3_19;
                                                                var9_25 = var3_19;
                                                                var5_21 = var3_19;
                                                                var12_28 = var3_19;
                                                                var8_24 = var3_19;
                                                                var11_27 = var3_19;
                                                                var6_22 = var3_19;
                                                                ** try [egrp 1[TRYBLOCK] [17, 16, 15, 14, 13, 12, 11, 10, 9 : 512->517)] { 
lbl69:
                                                                // 2 sources

                                                                for (ContentProviderResult var17_3 : var24_33) {
                                                                    block32: {
                                                                        var10_26 = var3_19;
                                                                        var7_23 = var3_19;
                                                                        var4_20 = var3_19;
                                                                        var9_25 = var3_19;
                                                                        var5_21 = var3_19;
                                                                        var12_28 = var3_19;
                                                                        var8_24 = var3_19;
                                                                        var11_27 = var3_19;
                                                                        var6_22 = var3_19;
                                                                        var23_32 = var17_3.count;
                                                                        var4_20 = var3_19;
                                                                        if (var23_32 == null) break block32;
                                                                        var10_26 = var3_19;
                                                                        var7_23 = var3_19;
                                                                        var4_20 = var3_19;
                                                                        var9_25 = var3_19;
                                                                        var5_21 = var3_19;
                                                                        var12_28 = var3_19;
                                                                        var8_24 = var3_19;
                                                                        var11_27 = var3_19;
                                                                        var6_22 = var3_19;
                                                                        if (var23_32 == 0) {
                                                                            var4_20 = var3_19;
                                                                            break block32;
                                                                        }
                                                                        var10_26 = var3_19;
                                                                        var7_23 = var3_19;
                                                                        var4_20 = var3_19;
                                                                        var9_25 = var3_19;
                                                                        var5_21 = var3_19;
                                                                        var12_28 = var3_19;
                                                                        var8_24 = var3_19;
                                                                        var11_27 = var3_19;
                                                                        var6_22 = var3_19;
                                                                        try {
                                                                            var16_31 = var17_3.count;
                                                                            var4_20 = var3_19 + var16_31;
                                                                        }
lbl109:
                                                                        // 5 sources

                                                                        catch (NullPointerException var17_4) {
                                                                            break block33;
                                                                        }
lbl111:
                                                                        // 5 sources

                                                                        catch (SecurityException var17_5) {
                                                                            break block34;
                                                                        }
lbl113:
                                                                        // 5 sources

                                                                        catch (SQLiteException var17_6) {
                                                                            break block35;
                                                                        }
lbl115:
                                                                        // 5 sources

                                                                        catch (UnsupportedOperationException var17_7) {
                                                                            break block36;
                                                                        }
lbl117:
                                                                        // 5 sources

                                                                        catch (IllegalArgumentException var17_8) {
                                                                            break block37;
                                                                        }
lbl119:
                                                                        // 5 sources

                                                                        catch (IllegalStateException var17_9) {
                                                                            var4_20 = var12_28;
                                                                            break block31;
                                                                        }
lbl122:
                                                                        // 5 sources

                                                                        catch (RemoteException var17_10) {
                                                                            break block38;
                                                                        }
lbl124:
                                                                        // 5 sources

                                                                        catch (OperationApplicationException var17_11) {
                                                                            break block39;
                                                                        }
lbl126:
                                                                        // 5 sources

                                                                        catch (TransactionTooLargeException var17_12) {
                                                                            break block40;
                                                                        }
                                                                    }
                                                                    var3_19 = var4_20;
                                                                }
                                                                var5_21 = 1;
                                                                break block41;
                                                            }
                                                            var17_4.printStackTrace();
                                                            var4_20 = var10_26;
                                                        }
lbl137:
                                                        // 9 sources

                                                        while (true) {
                                                            var5_21 = 0;
                                                            var3_19 = var4_20;
                                                            break block41;
                                                            break;
                                                        }
                                                    }
                                                    var17_5.printStackTrace();
                                                    c.h().f().d("MED4:").l(var17_5).h();
                                                    var4_20 = var7_23;
                                                    ** GOTO lbl137
                                                }
                                                var17_6.printStackTrace();
                                                c.h().f().d("MED3:").l(var17_6).h();
                                                ** GOTO lbl137
                                            }
                                            var17_7.printStackTrace();
                                            c.h().f().d("MED2:").l(var17_7).h();
                                            var4_20 = var9_25;
                                            ** GOTO lbl137
                                        }
                                        b.e("What case is this? : media");
                                        var17_8.printStackTrace();
                                        if (var17_8.getMessage() == null || !var17_8.getMessage().startsWith("Too many")) break block43;
                                        var4_20 = var5_21;
                                        if (!J.B()) {
                                            c.h().f().b("MED1-1:").g(var17_8.getMessage()).h();
                                            var4_20 = var5_21;
                                        }
                                        ** GOTO lbl137
                                    }
                                    c.h().f().d("MED1:").g(var17_8.getMessage()).h();
                                    var4_20 = var5_21;
                                    ** GOTO lbl137
                                }
                                c.h().f().b("BATCH DELETE 2 :").l(var17_10).h();
                                var4_20 = var8_24;
                                ** GOTO lbl137
                            }
                            c.h().f().b("BATCH DELETE 1 :").l(var17_11).h();
                            var4_20 = var11_27;
                            ** GOTO lbl137
                        }
                        c.h().f().b("BATCH DELETE TRAN :").l(var17_12).h();
                        var4_20 = var6_22;
                        ** continue;
                    }
                    var13_18 += var21_16.size();
                    var17_3 = var1_1;
                    if (var5_21 == 0) {
                        var17_3 = var1_1;
                        if (var1_1 == null) {
                            var17_3 = new ArrayList();
                        }
                        var17_3.addAll(var22_17);
                    }
                    var1_1 = var17_3;
                }
                if (var1_1 != null) {
                    var3_19 += M.i(var0, (List<a>)var1_1);
                }
                break block44;
            }
            var3_19 = 0;
        }
        if (var2_2 != null) {
            var2_2.a(var3_19, var18_13.size());
        }
    }

    public static int c(Context context, List<f> list, boolean bl, i i8) {
        ArrayList<ContentProviderOperation> arrayList = new ArrayList<ContentProviderOperation>();
        ArrayList<f> arrayList2 = new ArrayList<f>();
        ArrayList<ContentProviderOperation> arrayList3 = new ArrayList<ContentProviderOperation>();
        ArrayList<f> arrayList4 = new ArrayList<f>();
        Iterator<f> iterator = list.iterator();
        while (iterator.hasNext()) {
            f f8 = iterator.next();
            if (f8.q || f8.m0) continue;
            String string = v.g(d0.k(f8.c0), "application/octet-stream");
            boolean bl2 = !f8.d0 && A.P(string);
            if (bl2 && !bl) {
                f8.m0 = true;
                continue;
            }
            if ((Q.V() && f8.g0 || Q.U()) && !f8.d0 && !f8.b(context)) {
                if (bl2) {
                    f8.m0 = true;
                    continue;
                }
                iterator.remove();
                continue;
            }
            string = M.h(f8.c0, f8.d0, bl2);
            if (string == null) {
                f8.m0 = true;
                continue;
            }
            if (f8.d0) {
                arrayList3.add((ContentProviderOperation)string);
                arrayList4.add(f8);
            } else {
                arrayList.add((ContentProviderOperation)string);
                arrayList2.add(f8);
            }
            if (!bl2) continue;
            f8.m0 = true;
        }
        int n8 = arrayList3.size() + arrayList.size();
        return M.d(context, list, arrayList, arrayList2, M.d(context, list, arrayList3, arrayList4, 0, n8, i8), n8, i8);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static int d(Context var0, List<f> var1_1, ArrayList<ContentProviderOperation> var2_2, ArrayList<f> var3_3, int var4_4, int var5_5, i var6_6) {
        block25: {
            if (var2_2.size() <= 0) break block25;
            var18_7 = var0.getContentResolver();
            var16_8 = new ArrayList<ContentProviderOperation>();
            var17_9 = new ArrayList<f>();
            var14_10 /* !! */  = null;
            var10_11 = 0;
            while (var10_11 < var2_2.size()) {
                block21: {
                    block24: {
                        block23: {
                            block22: {
                                block20: {
                                    var16_8.clear();
                                    var17_9.clear();
                                    if (var6_6 != null) {
                                        var6_6.a(var4_4, var5_5);
                                    }
                                    for (var7_12 = 0; var7_12 < 50 && (var8_13 = var10_11 + var7_12) < var2_2.size(); ++var7_12) {
                                        var16_8.add(var2_2.get(var8_13));
                                        var17_9.add(var3_3.get(var8_13));
                                    }
                                    var8_13 = var4_4;
                                    var9_14 = var4_4;
                                    var7_12 = var4_4;
                                    try {
                                        var15_18 /* !! */  = var18_7.applyBatch("media", var16_8);
                                        if (var15_18 /* !! */  == null) break block20;
                                        var11_15 = 0;
lbl25:
                                        // 2 sources

                                        while (true) {
                                            var8_13 = var4_4;
                                            var9_14 = var4_4;
                                            var7_12 = var4_4;
                                            var12_16 = var15_18 /* !! */ .length;
                                            var8_13 = 1;
                                            var7_12 = var4_4;
                                            if (var11_15 >= var12_16) break block21;
                                            break;
                                        }
                                    }
                                    catch (Exception var15_19) {
                                        var4_4 = var8_13;
                                        break block22;
                                    }
                                    catch (RemoteException var15_20) {
                                        var4_4 = var9_14;
                                        break block23;
                                    }
                                    catch (TransactionTooLargeException var15_21) {
                                        var4_4 = var7_12;
                                        break block24;
                                    }
                                    var19_25 = var15_18 /* !! */ [var11_15];
                                    var8_13 = var4_4;
                                    var9_14 = var4_4;
                                    var7_12 = var4_4;
                                    var20_26 = var3_3.get(var10_11 + var11_15);
                                    var8_13 = var4_4;
                                    var9_14 = var4_4;
                                    var7_12 = var4_4;
                                    if (var19_25.uri == null) {
                                        var8_13 = var4_4;
                                        var9_14 = var4_4;
                                        var7_12 = var4_4;
                                        var20_26.m0 = true;
                                    } else {
                                        var8_13 = var4_4;
                                        var9_14 = var4_4;
                                        var7_12 = var4_4;
                                        var13_17 = var20_26.m0;
                                        if (!var13_17) {
                                            try {
                                                var1_1.remove(var20_26);
                                            }
                                            catch (Exception var15_22) {
                                                break block22;
                                            }
                                            catch (RemoteException var15_23) {
                                                break block23;
                                            }
                                            catch (TransactionTooLargeException var15_24) {
                                                break block24;
                                            }
                                        }
                                        ++var4_4;
                                    }
                                    ++var11_15;
                                    ** continue;
                                }
                                var8_13 = 0;
                                var7_12 = var4_4;
                                break block21;
                            }
                            var15_18 /* !! */ .printStackTrace();
                            var13_17 = var15_18 /* !! */  instanceof OperationApplicationException;
lbl82:
                            // 3 sources

                            while (true) {
                                var8_13 = 0;
                                var7_12 = var4_4;
                                break block21;
                                break;
                            }
                        }
                        var15_18 /* !! */ .printStackTrace();
                        c.h().f().b("BATCH INSERT 2 :").l((Throwable)var15_18 /* !! */ ).h();
                        ** GOTO lbl82
                    }
                    c.h().f().b("BATCH INSERT TRAN :").l((Throwable)var15_18 /* !! */ ).h();
                    ** continue;
                }
                var9_14 = var10_11 + var16_8.size();
                var4_4 = var7_12;
                var10_11 = var9_14;
                if (var8_13 != 0) continue;
                var15_18 /* !! */  = var14_10 /* !! */ ;
                if (var14_10 /* !! */  == null) {
                    var15_18 /* !! */  = new ArrayList<E>();
                }
                var15_18 /* !! */ .addAll(var17_9);
                var4_4 = var7_12;
                var14_10 /* !! */  = var15_18 /* !! */ ;
                var10_11 = var9_14;
            }
            if (var14_10 /* !! */  != null) {
                var4_4 = M.k((Context)var0, (List<f>)var1_1, var14_10 /* !! */ , var4_4, var5_5, var6_6) + var4_4;
            }
        }
        if (var6_6 != null) {
            var6_6.a(var4_4, var5_5);
        }
        var0 = M.a;
        var1_1 = new StringBuilder();
        var1_1.append("Media Scanner insert total :");
        var1_1.append(var4_4);
        var1_1.append(" / ");
        var1_1.append(var5_5);
        var1_1.append("(");
        var1_1.append(var2_2.size());
        var1_1.append(")");
        var0.fine(var1_1.toString());
        return var4_4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean e(Context context, String string) {
        block4: {
            Uri uri = n0.c("external");
            if ((context = context.getContentResolver().query(uri, null, "_data = ?", new String[]{string}, null)) != null) {
                try {
                    int n8 = context.getCount();
                    if (n8 <= 0) break block4;
                }
                catch (Throwable throwable) {
                    context.close();
                    throw throwable;
                }
                context.close();
                return true;
            }
        }
        if (context != null) {
            context.close();
        }
        return false;
    }

    public static void f(Context context, List<f> object) {
        Iterator<f> iterator = object.iterator();
        while (iterator.hasNext()) {
            String string;
            object = iterator.next();
            if (((f)object).m0 || ((f)object).b(context) || ((f)object).d0) continue;
            if (((f)object).q) {
                if (!Q.T()) continue;
                string = ((f)object).j0;
                if (string != null) {
                    d.B(context, B.Z(((f)object).c0, string, ((f)object).k0, ((f)object).l0, null));
                }
                iterator.remove();
                continue;
            }
            if (!Q.U()) continue;
            string = v.g(d0.k(((f)object).c0), "application/octet-stream");
            if (!((f)object).d0 && A.P(string)) continue;
            iterator.remove();
        }
    }

    private static ContentProviderOperation g(String charSequence, boolean bl, boolean bl2) {
        Q.k(37, 36);
        Object object = n0.c("external");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(object.toString());
        stringBuilder.append("?");
        stringBuilder.append("deletedata");
        stringBuilder.append("=false");
        stringBuilder = ContentProviderOperation.newDelete((Uri)Uri.parse((String)stringBuilder.toString()));
        if (bl2) {
            if (bl) {
                object = new StringBuilder();
                ((StringBuilder)object).append((String)charSequence);
                ((StringBuilder)object).append("/");
                charSequence = ((StringBuilder)object).toString();
                object = new StringBuilder();
                ((StringBuilder)object).append((String)charSequence);
                ((StringBuilder)object).append("%");
                stringBuilder.withSelection("_data LIKE ?1 AND substr(_data,1,?2)=?3", new String[]{((StringBuilder)object).toString(), Integer.toString(((String)charSequence).length()), charSequence});
            } else {
                stringBuilder.withSelection("_data LIKE ?1 AND _data=?2", new String[]{charSequence, charSequence});
            }
        } else if (bl) {
            object = new StringBuilder();
            ((StringBuilder)object).append((String)charSequence);
            ((StringBuilder)object).append("/");
            object = ((StringBuilder)object).toString();
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((String)object);
            ((StringBuilder)charSequence).append("%");
            stringBuilder.withSelection("_data LIKE ?1 AND lower(substr(_data,1,?2))=lower(?3)", new String[]{((StringBuilder)charSequence).toString(), Integer.toString(((String)object).length()), object});
        } else {
            stringBuilder.withSelection("_data LIKE ?1 AND lower(_data)=lower(?2)", new String[]{charSequence, charSequence});
        }
        return stringBuilder.build();
    }

    private static ContentProviderOperation h(String string, boolean bl, boolean bl2) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            return null;
        }
        if (!new File(string).exists()) {
            a.severe("Scan requested file not found");
            return null;
        }
        Q.k(37, 36);
        ContentValues contentValues = new ContentValues();
        String string2 = Q.c2() ? n0.a(string) : "external";
        if (bl) {
            if (Q.x()) {
                string2 = n0.b(string2);
            } else {
                string2 = n0.c(string2);
                contentValues.put("format", Integer.valueOf(12289));
            }
        } else {
            string2 = n0.c(string2);
        }
        string2 = ContentProviderOperation.newInsert((Uri)string2);
        contentValues.put("_data", string);
        if (Q.w() && bl2) {
            contentValues.put("mime_type", "application/octet-stream");
        }
        string2.withValues(contentValues);
        return string2.build();
    }

    private static int i(Context object, List<a> list) {
        Object object2 = list.iterator();
        int n8 = 0;
        while (object2.hasNext()) {
            a a8 = object2.next();
            n8 += M.j((Context)object, a8.a, a8.b, a8.c);
        }
        object2 = a;
        object = new StringBuilder();
        ((StringBuilder)object).append("Media Scanner delete using single operation : ");
        ((StringBuilder)object).append(n8);
        ((StringBuilder)object).append(" of  ");
        ((StringBuilder)object).append(list.size());
        ((Logger)object2).fine(((StringBuilder)object).toString());
        return n8;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int j(Context context, String string, boolean bl, boolean bl2) {
        IllegalArgumentException illegalArgumentException2222;
        Q.k(37, 36);
        Object object = n0.c("external");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(object.toString());
        stringBuilder.append("?");
        stringBuilder.append("deletedata");
        stringBuilder.append("=false");
        stringBuilder = Uri.parse((String)stringBuilder.toString());
        context = context.getContentResolver();
        if (bl2) {
            if (!bl) return context.delete((Uri)stringBuilder, "_data LIKE ?1 AND _data=?2", new String[]{string, string});
            try {
                object = new StringBuilder();
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append("/");
                String string2 = ((StringBuilder)object).toString();
                object = new StringBuilder();
                ((StringBuilder)object).append(string2);
                ((StringBuilder)object).append("%");
                return context.delete((Uri)stringBuilder, "_data LIKE ?1 AND substr(_data,1,?2)=?3", new String[]{((StringBuilder)object).toString(), Integer.toString(string2.length()), string2});
            }
            catch (IllegalArgumentException illegalArgumentException2222) {
            }
        }
        if (!bl) return context.delete((Uri)stringBuilder, "_data LIKE ?1 AND lower(_data)=lower(?2)", new String[]{string, string});
        object = new StringBuilder();
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append("/");
        object = ((StringBuilder)object).toString();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append((String)object);
        stringBuilder2.append("%");
        return context.delete((Uri)stringBuilder, "_data LIKE ?1 AND lower(substr(_data,1,?2))=lower(?3)", new String[]{stringBuilder2.toString(), Integer.toString(((String)object).length()), object});
        catch (NullPointerException nullPointerException) {
            nullPointerException.printStackTrace();
            return 0;
        }
        catch (SecurityException securityException) {
            securityException.printStackTrace();
            c.h().f().d("MED4:").l(securityException).h();
            return 0;
        }
        catch (SQLiteException sQLiteException) {
            sQLiteException.printStackTrace();
            c.h().f().d("MED3:").l(sQLiteException).h();
            return 0;
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            unsupportedOperationException.printStackTrace();
            c.h().f().d("MED2:").l(unsupportedOperationException).h();
            return 0;
        }
        catch (IllegalStateException illegalStateException) {
            c.h().f().d("MED0:").g(illegalStateException.getMessage()).h();
            return 0;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("What case is this? : ");
        stringBuilder.append(string);
        b.e(stringBuilder.toString());
        illegalArgumentException2222.printStackTrace();
        if (illegalArgumentException2222.getMessage() != null && illegalArgumentException2222.getMessage().startsWith("Too many")) {
            if (J.B()) return 0;
            c.h().f().b("MED1-1:").g(illegalArgumentException2222.getMessage()).h();
            return 0;
        }
        c.h().f().d("MED1:").g(illegalArgumentException2222.getMessage()).h();
        return 0;
    }

    private static int k(Context object, List<f> object2, List<f> list, int n8, int n9, i i8) {
        Iterator<f> iterator = list.iterator();
        int n10 = 0;
        int n11 = n8;
        while (iterator.hasNext()) {
            int n12;
            f f8 = iterator.next();
            if (f8.q) {
                b.f();
                continue;
            }
            if (!M.a((Context)object, f8.c0, f8.d0)) {
                f8.m0 = true;
                n12 = n10;
                n8 = n11;
            } else {
                n12 = ++n10;
                n8 = ++n11;
                if (!f8.m0) {
                    object2.remove(f8);
                    n8 = n11;
                    n12 = n10;
                }
            }
            n10 = n12;
            n11 = n8;
            if (i8 == null) continue;
            i8.a(n8, n9);
            n10 = n12;
            n11 = n8;
        }
        object = a;
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Media Scanner insert using single operation :");
        ((StringBuilder)object2).append(n10);
        ((StringBuilder)object2).append(" of ");
        ((StringBuilder)object2).append(list.size());
        ((Logger)object).fine(((StringBuilder)object2).toString());
        return n10;
    }

    public static void l(Context context, Uri uri) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("format", Integer.valueOf(12289));
        context.getContentResolver().update(uri, contentValues, "format = 12288", null);
    }

    static class a {
        String a;
        boolean b;
        boolean c;

        a(String string, boolean bl, boolean bl2) {
            this.a = string;
            this.b = bl;
            this.c = bl2;
        }
    }
}

