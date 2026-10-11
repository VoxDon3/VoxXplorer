/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import ax.N5.a;
import com.google.android.gms.measurement.internal.A5;
import com.google.android.gms.measurement.internal.B5;
import com.google.android.gms.measurement.internal.D;
import com.google.android.gms.measurement.internal.E2;
import com.google.android.gms.measurement.internal.S1;
import com.google.android.gms.measurement.internal.b1;
import com.google.android.gms.measurement.internal.f;
import com.google.android.gms.measurement.internal.f3;
import java.util.List;

public final class P1
extends b1 {
    private final S1 c = new S1(this, ((f3)this).a(), "google_app_measurement_local.db");
    private boolean d;

    P1(E2 e22) {
        super(e22);
    }

    private static long B(SQLiteDatabase sQLiteDatabase) {
        Throwable throwable2;
        SQLiteDatabase sQLiteDatabase2;
        block6: {
            block5: {
                sQLiteDatabase2 = null;
                try {
                    sQLiteDatabase2 = sQLiteDatabase = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                if (!sQLiteDatabase.moveToFirst()) break block5;
                sQLiteDatabase2 = sQLiteDatabase;
                long l8 = sQLiteDatabase.getLong(0);
                sQLiteDatabase.close();
                return l8;
            }
            sQLiteDatabase.close();
            return -1L;
        }
        if (sQLiteDatabase2 != null) {
            sQLiteDatabase2.close();
        }
        throw throwable2;
    }

    /*
     * Exception decompiling
     */
    private final boolean D(int var1_1, byte[] var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [11, 9, 10, 8 : 155->159)] java.lang.Throwable
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

    private final SQLiteDatabase K() throws SQLiteException {
        if (this.d) {
            return null;
        }
        SQLiteDatabase sQLiteDatabase = this.c.getWritableDatabase();
        if (sQLiteDatabase == null) {
            this.d = true;
            return null;
        }
        return sQLiteDatabase;
    }

    private final boolean L() {
        return ((f3)this).a().getDatabasePath("google_app_measurement_local.db").exists();
    }

    @Override
    protected final boolean A() {
        return false;
    }

    /*
     * Exception decompiling
     */
    public final List<a> C(int var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [11, 10, 8, 9 : 101->113)] java.lang.Throwable
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

    public final boolean E(f object) {
        ((f3)this).i();
        object = B5.q0((Parcelable)object);
        if (((Object)object).length > 131072) {
            ((f3)this).k().I().a("Conditional user property too long for local database. Sending directly to service");
            return false;
        }
        return this.D(2, (byte[])object);
    }

    public final boolean F(D object) {
        Parcel parcel = Parcel.obtain();
        ((D)object).writeToParcel(parcel, 0);
        object = parcel.marshall();
        parcel.recycle();
        if (((Object)object).length > 131072) {
            ((f3)this).k().I().a("Event is too long for local database. Sending event directly to service");
            return false;
        }
        return this.D(0, (byte[])object);
    }

    public final boolean G(A5 object) {
        Parcel parcel = Parcel.obtain();
        ((A5)object).writeToParcel(parcel, 0);
        object = parcel.marshall();
        parcel.recycle();
        if (((Object)object).length > 131072) {
            ((f3)this).k().I().a("User property too long for local database. Sending directly to service");
            return false;
        }
        return this.D(1, (byte[])object);
    }

    public final void H() {
        SQLiteException sQLiteException2;
        block5: {
            block4: {
                SQLiteDatabase sQLiteDatabase;
                ((f3)this).n();
                try {
                    sQLiteDatabase = this.K();
                    if (sQLiteDatabase == null) break block4;
                }
                catch (SQLiteException sQLiteException2) {}
                int n8 = sQLiteDatabase.delete("messages", null, null);
                if (n8 <= 0) break block4;
                ((f3)this).k().K().b("Reset local analytics data. records", n8);
                return;
                break block5;
            }
            return;
        }
        ((f3)this).k().G().b("Error resetting local analytics data. error", (Object)sQLiteException2);
    }

    public final boolean I() {
        return this.D(3, new byte[0]);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean J() {
        this.n();
        if (this.d) {
            return false;
        }
        if (!this.L()) {
            return false;
        }
        var3_1 = 0;
        var2_2 = 5;
        while (true) {
            block21: {
                block20: {
                    block19: {
                        block17: {
                            block18: {
                                if (var3_1 >= 5) {
                                    this.k().L().a("Error deleting app launch break from local database in reasonable time");
                                    return false;
                                }
                                var8_11 = null;
                                var9_12 = null;
                                var10_13 = null;
                                var6_5 = null;
                                var7_7 = this.K();
                                if (var7_7 != null) break block17;
                                var6_5 = var7_7;
                                var8_11 = var7_7;
                                var9_12 = var7_7;
                                var10_13 = var7_7;
                                this.d = true;
                                if (var7_7 == null) break block18;
                                {
                                    catch (Throwable var7_8) {
                                        break;
                                    }
                                    catch (SQLiteException var7_9) {
                                        break block19;
                                    }
                                    catch (SQLiteFullException var7_10) {
                                        break block20;
                                    }
                                    catch (SQLiteDatabaseLockedException var6_6) {}
                                    var4_4 = var2_2;
                                    var6_5 = var10_13;
                                    {
                                        SystemClock.sleep((long)var4_4);
                                        var1_3 = var2_2 += 20;
                                        ** if (var10_13 == null) goto lbl-1000
                                    }
lbl-1000:
                                    // 1 sources

                                    {
                                        var10_13.close();
                                        var1_3 = var2_2;
                                    }
lbl-1000:
                                    // 2 sources

                                    {
                                        break block21;
                                    }
                                }
                                var7_7.close();
                            }
                            return false;
                        }
                        var6_5 = var7_7;
                        var8_11 = var7_7;
                        var9_12 = var7_7;
                        var10_13 = var7_7;
                        {
                            var7_7.beginTransaction();
                            var6_5 = var7_7;
                            var8_11 = var7_7;
                            var9_12 = var7_7;
                            var10_13 = var7_7;
                            var7_7.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                            var6_5 = var7_7;
                            var8_11 = var7_7;
                            var9_12 = var7_7;
                            var10_13 = var7_7;
                            var7_7.setTransactionSuccessful();
                            var6_5 = var7_7;
                            var8_11 = var7_7;
                            var9_12 = var7_7;
                            var10_13 = var7_7;
                            var7_7.endTransaction();
                        }
                        var7_7.close();
                        return true;
                    }
                    if (var8_11 == null) ** GOTO lbl74
                    var6_5 = var8_11;
                    {
                        if (var8_11.inTransaction()) {
                            var6_5 = var8_11;
                            var8_11.endTransaction();
                        }
lbl74:
                        // 4 sources

                        var6_5 = var8_11;
                        this.k().G().b("Error deleting app launch break from local database", (Object)var7_9);
                        var6_5 = var8_11;
                        this.d = true;
                        var1_3 = var2_2;
                        ** if (var8_11 == null) goto lbl-1000
                    }
lbl-1000:
                    // 1 sources

                    {
                        var8_11.close();
                        var1_3 = var2_2;
                    }
lbl-1000:
                    // 2 sources

                    {
                        break block21;
                    }
                }
                var6_5 = var9_12;
                {
                    this.k().G().b("Error deleting app launch break from local database", (Object)var7_10);
                    var6_5 = var9_12;
                    this.d = true;
                    var1_3 = var2_2;
                    if (var9_12 == null) break block21;
                }
                var9_12.close();
                var1_3 = var2_2;
            }
            ++var3_1;
            var2_2 = var1_3;
        }
        if (var6_5 != null) {
            var6_5.close();
        }
        throw var7_8;
    }
}

