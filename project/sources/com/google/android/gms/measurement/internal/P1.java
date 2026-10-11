package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;

/* loaded from: classes3.dex */
public final class P1 extends AbstractC3623b1 {
    private final S1 c;
    private boolean d;

    P1(E2 e2) {
        super(e2);
        this.c = new S1(this, a(), "google_app_measurement_local.db");
    }

    private static long B(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
            if (!cursor.moveToFirst()) {
                cursor.close();
                return -1L;
            }
            long j = cursor.getLong(0);
            cursor.close();
            return j;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0106 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean D(int r18, byte[] r19) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.P1.D(int, byte[]):boolean");
    }

    private final SQLiteDatabase K() throws SQLiteException {
        if (this.d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.d = true;
        return null;
    }

    private final boolean L() {
        return a().getDatabasePath("google_app_measurement_local.db").exists();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3623b1
    protected final boolean A() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<ax.N5.a> C(int r22) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.P1.C(int):java.util.List");
    }

    public final boolean E(C3649f c3649f) {
        i();
        byte[] q0 = B5.q0(c3649f);
        if (q0.length <= 131072) {
            return D(2, q0);
        }
        k().I().a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean F(D d) {
        Parcel obtain = Parcel.obtain();
        d.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return D(0, marshall);
        }
        k().I().a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean G(A5 a5) {
        Parcel obtain = Parcel.obtain();
        a5.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return D(1, marshall);
        }
        k().I().a("User property too long for local database. Sending directly to service");
        return false;
    }

    public final void H() {
        int delete;
        n();
        try {
            SQLiteDatabase K = K();
            if (K == null || (delete = K.delete("messages", null, null)) <= 0) {
                return;
            }
            k().K().b("Reset local analytics data. records", Integer.valueOf(delete));
        } catch (SQLiteException e) {
            k().G().b("Error resetting local analytics data. error", e);
        }
    }

    public final boolean I() {
        return D(3, new byte[0]);
    }

    public final boolean J() {
        n();
        if (this.d || !L()) {
            return false;
        }
        int i = 5;
        for (int i2 = 0; i2 < 5; i2++) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                try {
                    SQLiteDatabase K = K();
                    if (K == null) {
                        this.d = true;
                        if (K != null) {
                            K.close();
                        }
                        return false;
                    }
                    K.beginTransaction();
                    K.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    K.setTransactionSuccessful();
                    K.endTransaction();
                    K.close();
                    return true;
                } catch (SQLiteFullException e) {
                    k().G().b("Error deleting app launch break from local database", e);
                    this.d = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            } catch (SQLiteDatabaseLockedException unused) {
                SystemClock.sleep(i);
                i += 20;
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            } catch (SQLiteException e2) {
                if (0 != 0) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (Throwable th) {
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                        throw th;
                    }
                }
                k().G().b("Error deleting app launch break from local database", e2);
                this.d = true;
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            }
        }
        k().L().a("Error deleting app launch break from local database in reasonable time");
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3, com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3, com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final /* bridge */ /* synthetic */ ax.R5.e b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ C3663h d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3, com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final /* bridge */ /* synthetic */ C3628c e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ C3758w f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ R1 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ C3659g2 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ B5 i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.C1, com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3, com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final /* bridge */ /* synthetic */ V1 k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3, com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final /* bridge */ /* synthetic */ C3779z2 l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.C1, com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // com.google.android.gms.measurement.internal.C1, com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // com.google.android.gms.measurement.internal.C1
    public final /* bridge */ /* synthetic */ C3776z o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.C1
    public final /* bridge */ /* synthetic */ Q1 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.C1
    public final /* bridge */ /* synthetic */ P1 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.C1
    public final /* bridge */ /* synthetic */ C3688k3 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.C1
    public final /* bridge */ /* synthetic */ C3654f4 s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.C1
    public final /* bridge */ /* synthetic */ C3689k4 t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.C1
    public final /* bridge */ /* synthetic */ V4 u() {
        return super.u();
    }
}
