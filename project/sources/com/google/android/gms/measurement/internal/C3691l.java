package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import ax.M5.C0821p;
import ax.b6.A1;
import ax.b6.AbstractC1599k4;
import ax.b6.B1;
import ax.b6.C1543e2;
import ax.b6.C1561g2;
import ax.b6.C1579i2;
import ax.b6.E1;
import ax.f6.C2068p;
import ax.f6.C2069q;
import ax.f6.C2071s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;

/* renamed from: com.google.android.gms.measurement.internal.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3691l extends AbstractC3690k5 {
    private static final String[] f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    private static final String[] g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;"};
    private static final String[] i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private static final String[] n = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    private static final String[] o = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};
    private final C3723q d;
    private final C3648e5 e;

    C3691l(q5 q5Var) {
        super(q5Var);
        this.e = new C3648e5(b());
        this.d = new C3723q(this, a(), "google_app_measurement.db");
    }

    private final boolean B0(String str, List<Integer> list) {
        C0821p.f(str);
        u();
        n();
        SQLiteDatabase B = B();
        try {
            long y0 = y0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, d().v(str, F.G)));
            if (y0 <= max) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < list.size(); i2++) {
                Integer num = list.get(i2);
                if (num == null) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String str2 = "(" + TextUtils.join(",", arrayList) + ")";
            StringBuilder sb = new StringBuilder("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb.append(str2);
            sb.append(" order by rowid desc limit -1 offset ?)");
            return B.delete("audience_filter_values", sb.toString(), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e) {
            k().G().c("Database error querying filters. appId", V1.v(str), e);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.measurement.internal.C3770y E0(java.lang.String r29, java.lang.String r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3691l.E0(java.lang.String, java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.y");
    }

    private final long G(String str, String[] strArr, long j2) {
        Cursor cursor = null;
        try {
            try {
                cursor = B().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return j2;
                }
                long j3 = cursor.getLong(0);
                cursor.close();
                return j3;
            } catch (SQLiteException e) {
                k().G().c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private final Object M(Cursor cursor, int i2) {
        int type = cursor.getType(i2);
        if (type == 0) {
            k().G().a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i2));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i2));
        }
        if (type == 3) {
            return cursor.getString(i2);
        }
        if (type != 4) {
            k().G().b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        k().G().a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final <T> T N(java.lang.String r3, java.lang.String[] r4, com.google.android.gms.measurement.internal.r<T> r5) {
        /*
            r2 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r2.B()     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L2f
            android.database.Cursor r3 = r1.rawQuery(r3, r4)     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L2f
            boolean r4 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            if (r4 != 0) goto L25
            com.google.android.gms.measurement.internal.V1 r4 = r2.k()     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            com.google.android.gms.measurement.internal.X1 r4 = r4.K()     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            java.lang.String r5 = "No data found"
            r4.a(r5)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            r3.close()
            return r0
        L20:
            r4 = move-exception
            r0 = r3
            goto L44
        L23:
            r4 = move-exception
            goto L31
        L25:
            java.lang.Object r4 = r5.a(r3)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            r3.close()
            return r4
        L2d:
            r4 = move-exception
            goto L44
        L2f:
            r4 = move-exception
            r3 = r0
        L31:
            com.google.android.gms.measurement.internal.V1 r5 = r2.k()     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.measurement.internal.X1 r5 = r5.G()     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = "Error querying database."
            r5.b(r1, r4)     // Catch: java.lang.Throwable -> L20
            if (r3 == 0) goto L43
            r3.close()
        L43:
            return r0
        L44:
            if (r0 == 0) goto L49
            r0.close()
        L49:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3691l.N(java.lang.String, java.lang.String[], com.google.android.gms.measurement.internal.r):java.lang.Object");
    }

    private final String P(String str, String[] strArr, String str2) {
        Cursor cursor = null;
        try {
            try {
                cursor = B().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return str2;
                }
                String string = cursor.getString(0);
                cursor.close();
                return string;
            } catch (SQLiteException e) {
                k().G().c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private final void Q0(String str, String str2) {
        C0821p.f(str2);
        n();
        u();
        try {
            B().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e) {
            k().G().c("Error deleting snapshot. appId", V1.v(str2), e);
        }
    }

    private static void T(ContentValues contentValues, String str, Object obj) {
        C0821p.f(str);
        C0821p.l(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put(str, (Double) obj);
        }
    }

    private final void X(String str, C3770y c3770y) {
        C0821p.l(c3770y);
        n();
        u();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c3770y.a);
        contentValues.put("name", c3770y.b);
        contentValues.put("lifetime_count", Long.valueOf(c3770y.c));
        contentValues.put("current_bundle_count", Long.valueOf(c3770y.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(c3770y.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(c3770y.g));
        contentValues.put("last_bundled_day", c3770y.h);
        contentValues.put("last_sampled_complex_event_id", c3770y.i);
        contentValues.put("last_sampling_rate", c3770y.j);
        contentValues.put("current_session_count", Long.valueOf(c3770y.e));
        Boolean bool = c3770y.k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (B().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                k().G().b("Failed to insert/update event aggregates (got -1). appId", V1.v(c3770y.a));
            }
        } catch (SQLiteException e) {
            k().G().c("Error storing event aggregates. appId", V1.v(c3770y.a), e);
        }
    }

    private final void Z(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase B = B();
            if (contentValues.getAsString(str2) == null) {
                k().H().b("Value of the primary key is not set.", V1.v(str2));
                return;
            }
            if (B.update(str, contentValues, str2 + " = ?", new String[]{r1}) == 0 && B.insertWithOnConflict(str, null, contentValues, 5) == -1) {
                k().G().c("Failed to insert/update table (got -1). key", V1.v(str), V1.v(str2));
            }
        } catch (SQLiteException e) {
            k().G().d("Error storing into table. key", V1.v(str), V1.v(str2), e);
        }
    }

    private final boolean g0(String str, int i2, ax.b6.B1 b1) {
        u();
        n();
        C0821p.f(str);
        C0821p.l(b1);
        if (b1.R().isEmpty()) {
            k().L().d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", V1.v(str), Integer.valueOf(i2), String.valueOf(b1.Y() ? Integer.valueOf(b1.N()) : null));
            return false;
        }
        byte[] l2 = b1.l();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i2));
        contentValues.put("filter_id", b1.Y() ? Integer.valueOf(b1.N()) : null);
        contentValues.put("event_name", b1.R());
        contentValues.put("session_scoped", b1.Z() ? Boolean.valueOf(b1.V()) : null);
        contentValues.put("data", l2);
        try {
            if (B().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                return true;
            }
            k().G().b("Failed to insert event filter (got -1). appId", V1.v(str));
            return true;
        } catch (SQLiteException e) {
            k().G().c("Error storing event filter. appId", V1.v(str), e);
            return false;
        }
    }

    private final boolean h0(String str, int i2, ax.b6.E1 e1) {
        u();
        n();
        C0821p.f(str);
        C0821p.l(e1);
        if (e1.N().isEmpty()) {
            k().L().d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", V1.v(str), Integer.valueOf(i2), String.valueOf(e1.R() ? Integer.valueOf(e1.n()) : null));
            return false;
        }
        byte[] l2 = e1.l();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i2));
        contentValues.put("filter_id", e1.R() ? Integer.valueOf(e1.n()) : null);
        contentValues.put("property_name", e1.N());
        contentValues.put("session_scoped", e1.S() ? Boolean.valueOf(e1.Q()) : null);
        contentValues.put("data", l2);
        try {
            if (B().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            k().G().b("Failed to insert property filter (got -1). appId", V1.v(str));
            return false;
        } catch (SQLiteException e) {
            k().G().c("Error storing property filter. appId", V1.v(str), e);
            return false;
        }
    }

    private final long y0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = B().rawQuery(str, strArr);
                if (!rawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j2 = rawQuery.getLong(0);
                rawQuery.close();
                return j2;
            } catch (SQLiteException e) {
                k().G().c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long A() {
        return G("select max(timestamp) from raw_events", null, 0L);
    }

    public final void A0(String str, C3667h3 c3667h3) {
        C0821p.l(str);
        C0821p.l(c3667h3);
        n();
        u();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", c3667h3.z());
        contentValues.put("consent_source", Integer.valueOf(c3667h3.b()));
        Z("consent_settings", "app_id", contentValues);
    }

    final SQLiteDatabase B() {
        n();
        try {
            return this.d.getWritableDatabase();
        } catch (SQLiteException e) {
            k().L().b("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String C() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.B()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L22 android.database.sqlite.SQLiteException -> L27
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            if (r2 == 0) goto L1e
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            r0.close()
            return r1
        L1a:
            r1 = move-exception
            goto L3c
        L1c:
            r2 = move-exception
            goto L29
        L1e:
            r0.close()
            return r1
        L22:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3c
        L27:
            r2 = move-exception
            r0 = r1
        L29:
            com.google.android.gms.measurement.internal.V1 r3 = r6.k()     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.measurement.internal.X1 r3 = r3.G()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r4, r2)     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L3b
            r0.close()
        L3b:
            return r1
        L3c:
            if (r0 == 0) goto L41
            r0.close()
        L41:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3691l.C():java.lang.String");
    }

    public final long C0(String str) {
        C0821p.f(str);
        return G("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final int D(String str, String str2) {
        C0821p.f(str);
        C0821p.f(str2);
        n();
        u();
        try {
            return B().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            k().G().d("Error deleting conditional property", V1.v(str), g().g(str2), e);
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.C3649f D0(java.lang.String r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3691l.D0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.f");
    }

    public final long E(C1543e2 c1543e2) throws IOException {
        n();
        u();
        C0821p.l(c1543e2);
        C0821p.f(c1543e2.P3());
        byte[] l2 = c1543e2.l();
        long A = o().A(l2);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c1543e2.P3());
        contentValues.put("metadata_fingerprint", Long.valueOf(A));
        contentValues.put("metadata", l2);
        try {
            B().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return A;
        } catch (SQLiteException e) {
            k().G().c("Error storing raw event metadata. appId", V1.v(c1543e2.P3()), e);
            throw e;
        }
    }

    public final long F(String str) {
        C0821p.f(str);
        n();
        u();
        try {
            return B().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, d().v(str, F.q))))});
        } catch (SQLiteException e) {
            k().G().c("Error deleting over the limit events. appId", V1.v(str), e);
            return 0L;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x002d: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:46), block:B:30:0x002d */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle F0(java.lang.String r6) {
        /*
            r5 = this;
            r5.n()
            r5.u()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r5.B()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r2 = "select parameters from default_event_params where app_id=?"
            java.lang.String[] r3 = new java.lang.String[]{r6}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            if (r2 != 0) goto L31
            com.google.android.gms.measurement.internal.V1 r6 = r5.k()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            com.google.android.gms.measurement.internal.X1 r6 = r6.K()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            java.lang.String r2 = "Default event parameters not found"
            r6.a(r2)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            r1.close()
            return r0
        L2c:
            r6 = move-exception
            r0 = r1
            goto L84
        L2f:
            r6 = move-exception
            goto L71
        L31:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            ax.b6.Z1$a r3 = ax.b6.Z1.c0()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            ax.b6.T4 r2 = com.google.android.gms.measurement.internal.x5.G(r3, r2)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            ax.b6.Z1$a r2 = (ax.b6.Z1.a) r2     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            ax.b6.U4 r2 = r2.q()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            ax.b6.k4 r2 = (ax.b6.AbstractC1599k4) r2     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            ax.b6.Z1 r2 = (ax.b6.Z1) r2     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            r5.o()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            java.util.List r6 = r2.f0()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            android.os.Bundle r6 = com.google.android.gms.measurement.internal.x5.B(r6)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            r1.close()
            return r6
        L57:
            r2 = move-exception
            com.google.android.gms.measurement.internal.V1 r3 = r5.k()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            com.google.android.gms.measurement.internal.X1 r3 = r3.G()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.V1.v(r6)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            r3.c(r4, r6, r2)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            r1.close()
            return r0
        L6d:
            r6 = move-exception
            goto L84
        L6f:
            r6 = move-exception
            r1 = r0
        L71:
            com.google.android.gms.measurement.internal.V1 r2 = r5.k()     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.measurement.internal.X1 r2 = r2.G()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = "Error selecting default event parameters"
            r2.b(r3, r6)     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L83
            r1.close()
        L83:
            return r0
        L84:
            if (r0 == 0) goto L89
            r0.close()
        L89:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3691l.F0(java.lang.String):android.os.Bundle");
    }

    public final C3770y G0(String str, String str2) {
        return E0("events", str, str2);
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0031: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:50), block:B:30:0x0031 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair<ax.b6.Z1, java.lang.Long> H(java.lang.String r6, java.lang.Long r7) {
        /*
            r5 = this;
            r5.n()
            r5.u()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r5.B()     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            java.lang.String r3 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            java.lang.String[] r3 = new java.lang.String[]{r6, r3}     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            if (r2 != 0) goto L35
            com.google.android.gms.measurement.internal.V1 r6 = r5.k()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            com.google.android.gms.measurement.internal.X1 r6 = r6.K()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            java.lang.String r7 = "Main event not found"
            r6.a(r7)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r1.close()
            return r0
        L30:
            r6 = move-exception
            r0 = r1
            goto L8a
        L33:
            r6 = move-exception
            goto L77
        L35:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r3 = 1
            long r3 = r1.getLong(r3)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            ax.b6.Z1$a r4 = ax.b6.Z1.c0()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33 java.io.IOException -> L5d
            ax.b6.T4 r2 = com.google.android.gms.measurement.internal.x5.G(r4, r2)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33 java.io.IOException -> L5d
            ax.b6.Z1$a r2 = (ax.b6.Z1.a) r2     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33 java.io.IOException -> L5d
            ax.b6.U4 r2 = r2.q()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33 java.io.IOException -> L5d
            ax.b6.k4 r2 = (ax.b6.AbstractC1599k4) r2     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33 java.io.IOException -> L5d
            ax.b6.Z1 r2 = (ax.b6.Z1) r2     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33 java.io.IOException -> L5d
            android.util.Pair r6 = android.util.Pair.create(r2, r3)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r1.close()
            return r6
        L5d:
            r2 = move-exception
            com.google.android.gms.measurement.internal.V1 r3 = r5.k()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            com.google.android.gms.measurement.internal.X1 r3 = r3.G()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.V1.v(r6)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r3.d(r4, r6, r7, r2)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r1.close()
            return r0
        L73:
            r6 = move-exception
            goto L8a
        L75:
            r6 = move-exception
            r1 = r0
        L77:
            com.google.android.gms.measurement.internal.V1 r7 = r5.k()     // Catch: java.lang.Throwable -> L30
            com.google.android.gms.measurement.internal.X1 r7 = r7.G()     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = "Error selecting main event"
            r7.b(r2, r6)     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L89
            r1.close()
        L89:
            return r0
        L8a:
            if (r0 == 0) goto L8f
            r0.close()
        L8f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3691l.H(java.lang.String, java.lang.Long):android.util.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x034c A[Catch: all -> 0x00b4, SQLiteException -> 0x00b8, TryCatch #0 {SQLiteException -> 0x00b8, blocks: (B:5:0x007d, B:10:0x0087, B:12:0x0099, B:14:0x00a5, B:17:0x00c2, B:19:0x00d0, B:21:0x00dc, B:23:0x00f2, B:25:0x0134, B:29:0x013e, B:32:0x0188, B:34:0x01b7, B:38:0x01c1, B:41:0x01dc, B:43:0x01e7, B:44:0x01f9, B:46:0x01ff, B:48:0x020b, B:50:0x0222, B:52:0x0228, B:54:0x0234, B:56:0x023d, B:58:0x0245, B:61:0x024e, B:63:0x0266, B:65:0x026f, B:67:0x0287, B:69:0x0293, B:70:0x02a5, B:72:0x02ab, B:74:0x02b7, B:76:0x02bf, B:79:0x02c8, B:81:0x02cb, B:84:0x02e0, B:86:0x02fb, B:88:0x0307, B:91:0x0311, B:92:0x0314, B:94:0x0320, B:96:0x0328, B:97:0x0333, B:99:0x033b, B:100:0x0346, B:102:0x034c, B:104:0x0358, B:105:0x0361, B:107:0x036a, B:111:0x02d5, B:114:0x02dc, B:115:0x0219, B:116:0x01d8, B:118:0x0183, B:120:0x00ea, B:121:0x00bb), top: B:4:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x036a A[Catch: all -> 0x00b4, SQLiteException -> 0x00b8, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x00b8, blocks: (B:5:0x007d, B:10:0x0087, B:12:0x0099, B:14:0x00a5, B:17:0x00c2, B:19:0x00d0, B:21:0x00dc, B:23:0x00f2, B:25:0x0134, B:29:0x013e, B:32:0x0188, B:34:0x01b7, B:38:0x01c1, B:41:0x01dc, B:43:0x01e7, B:44:0x01f9, B:46:0x01ff, B:48:0x020b, B:50:0x0222, B:52:0x0228, B:54:0x0234, B:56:0x023d, B:58:0x0245, B:61:0x024e, B:63:0x0266, B:65:0x026f, B:67:0x0287, B:69:0x0293, B:70:0x02a5, B:72:0x02ab, B:74:0x02b7, B:76:0x02bf, B:79:0x02c8, B:81:0x02cb, B:84:0x02e0, B:86:0x02fb, B:88:0x0307, B:91:0x0311, B:92:0x0314, B:94:0x0320, B:96:0x0328, B:97:0x0333, B:99:0x033b, B:100:0x0346, B:102:0x034c, B:104:0x0358, B:105:0x0361, B:107:0x036a, B:111:0x02d5, B:114:0x02dc, B:115:0x0219, B:116:0x01d8, B:118:0x0183, B:120:0x00ea, B:121:0x00bb), top: B:4:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02d5 A[Catch: all -> 0x00b4, SQLiteException -> 0x00b8, TryCatch #0 {SQLiteException -> 0x00b8, blocks: (B:5:0x007d, B:10:0x0087, B:12:0x0099, B:14:0x00a5, B:17:0x00c2, B:19:0x00d0, B:21:0x00dc, B:23:0x00f2, B:25:0x0134, B:29:0x013e, B:32:0x0188, B:34:0x01b7, B:38:0x01c1, B:41:0x01dc, B:43:0x01e7, B:44:0x01f9, B:46:0x01ff, B:48:0x020b, B:50:0x0222, B:52:0x0228, B:54:0x0234, B:56:0x023d, B:58:0x0245, B:61:0x024e, B:63:0x0266, B:65:0x026f, B:67:0x0287, B:69:0x0293, B:70:0x02a5, B:72:0x02ab, B:74:0x02b7, B:76:0x02bf, B:79:0x02c8, B:81:0x02cb, B:84:0x02e0, B:86:0x02fb, B:88:0x0307, B:91:0x0311, B:92:0x0314, B:94:0x0320, B:96:0x0328, B:97:0x0333, B:99:0x033b, B:100:0x0346, B:102:0x034c, B:104:0x0358, B:105:0x0361, B:107:0x036a, B:111:0x02d5, B:114:0x02dc, B:115:0x0219, B:116:0x01d8, B:118:0x0183, B:120:0x00ea, B:121:0x00bb), top: B:4:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01d8 A[Catch: all -> 0x00b4, SQLiteException -> 0x00b8, TryCatch #0 {SQLiteException -> 0x00b8, blocks: (B:5:0x007d, B:10:0x0087, B:12:0x0099, B:14:0x00a5, B:17:0x00c2, B:19:0x00d0, B:21:0x00dc, B:23:0x00f2, B:25:0x0134, B:29:0x013e, B:32:0x0188, B:34:0x01b7, B:38:0x01c1, B:41:0x01dc, B:43:0x01e7, B:44:0x01f9, B:46:0x01ff, B:48:0x020b, B:50:0x0222, B:52:0x0228, B:54:0x0234, B:56:0x023d, B:58:0x0245, B:61:0x024e, B:63:0x0266, B:65:0x026f, B:67:0x0287, B:69:0x0293, B:70:0x02a5, B:72:0x02ab, B:74:0x02b7, B:76:0x02bf, B:79:0x02c8, B:81:0x02cb, B:84:0x02e0, B:86:0x02fb, B:88:0x0307, B:91:0x0311, B:92:0x0314, B:94:0x0320, B:96:0x0328, B:97:0x0333, B:99:0x033b, B:100:0x0346, B:102:0x034c, B:104:0x0358, B:105:0x0361, B:107:0x036a, B:111:0x02d5, B:114:0x02dc, B:115:0x0219, B:116:0x01d8, B:118:0x0183, B:120:0x00ea, B:121:0x00bb), top: B:4:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0183 A[Catch: all -> 0x00b4, SQLiteException -> 0x00b8, TryCatch #0 {SQLiteException -> 0x00b8, blocks: (B:5:0x007d, B:10:0x0087, B:12:0x0099, B:14:0x00a5, B:17:0x00c2, B:19:0x00d0, B:21:0x00dc, B:23:0x00f2, B:25:0x0134, B:29:0x013e, B:32:0x0188, B:34:0x01b7, B:38:0x01c1, B:41:0x01dc, B:43:0x01e7, B:44:0x01f9, B:46:0x01ff, B:48:0x020b, B:50:0x0222, B:52:0x0228, B:54:0x0234, B:56:0x023d, B:58:0x0245, B:61:0x024e, B:63:0x0266, B:65:0x026f, B:67:0x0287, B:69:0x0293, B:70:0x02a5, B:72:0x02ab, B:74:0x02b7, B:76:0x02bf, B:79:0x02c8, B:81:0x02cb, B:84:0x02e0, B:86:0x02fb, B:88:0x0307, B:91:0x0311, B:92:0x0314, B:94:0x0320, B:96:0x0328, B:97:0x0333, B:99:0x033b, B:100:0x0346, B:102:0x034c, B:104:0x0358, B:105:0x0361, B:107:0x036a, B:111:0x02d5, B:114:0x02dc, B:115:0x0219, B:116:0x01d8, B:118:0x0183, B:120:0x00ea, B:121:0x00bb), top: B:4:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01b7 A[Catch: all -> 0x00b4, SQLiteException -> 0x00b8, TryCatch #0 {SQLiteException -> 0x00b8, blocks: (B:5:0x007d, B:10:0x0087, B:12:0x0099, B:14:0x00a5, B:17:0x00c2, B:19:0x00d0, B:21:0x00dc, B:23:0x00f2, B:25:0x0134, B:29:0x013e, B:32:0x0188, B:34:0x01b7, B:38:0x01c1, B:41:0x01dc, B:43:0x01e7, B:44:0x01f9, B:46:0x01ff, B:48:0x020b, B:50:0x0222, B:52:0x0228, B:54:0x0234, B:56:0x023d, B:58:0x0245, B:61:0x024e, B:63:0x0266, B:65:0x026f, B:67:0x0287, B:69:0x0293, B:70:0x02a5, B:72:0x02ab, B:74:0x02b7, B:76:0x02bf, B:79:0x02c8, B:81:0x02cb, B:84:0x02e0, B:86:0x02fb, B:88:0x0307, B:91:0x0311, B:92:0x0314, B:94:0x0320, B:96:0x0328, B:97:0x0333, B:99:0x033b, B:100:0x0346, B:102:0x034c, B:104:0x0358, B:105:0x0361, B:107:0x036a, B:111:0x02d5, B:114:0x02dc, B:115:0x0219, B:116:0x01d8, B:118:0x0183, B:120:0x00ea, B:121:0x00bb), top: B:4:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e7 A[Catch: all -> 0x00b4, SQLiteException -> 0x00b8, TryCatch #0 {SQLiteException -> 0x00b8, blocks: (B:5:0x007d, B:10:0x0087, B:12:0x0099, B:14:0x00a5, B:17:0x00c2, B:19:0x00d0, B:21:0x00dc, B:23:0x00f2, B:25:0x0134, B:29:0x013e, B:32:0x0188, B:34:0x01b7, B:38:0x01c1, B:41:0x01dc, B:43:0x01e7, B:44:0x01f9, B:46:0x01ff, B:48:0x020b, B:50:0x0222, B:52:0x0228, B:54:0x0234, B:56:0x023d, B:58:0x0245, B:61:0x024e, B:63:0x0266, B:65:0x026f, B:67:0x0287, B:69:0x0293, B:70:0x02a5, B:72:0x02ab, B:74:0x02b7, B:76:0x02bf, B:79:0x02c8, B:81:0x02cb, B:84:0x02e0, B:86:0x02fb, B:88:0x0307, B:91:0x0311, B:92:0x0314, B:94:0x0320, B:96:0x0328, B:97:0x0333, B:99:0x033b, B:100:0x0346, B:102:0x034c, B:104:0x0358, B:105:0x0361, B:107:0x036a, B:111:0x02d5, B:114:0x02dc, B:115:0x0219, B:116:0x01d8, B:118:0x0183, B:120:0x00ea, B:121:0x00bb), top: B:4:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ff A[Catch: all -> 0x00b4, SQLiteException -> 0x00b8, TryCatch #0 {SQLiteException -> 0x00b8, blocks: (B:5:0x007d, B:10:0x0087, B:12:0x0099, B:14:0x00a5, B:17:0x00c2, B:19:0x00d0, B:21:0x00dc, B:23:0x00f2, B:25:0x0134, B:29:0x013e, B:32:0x0188, B:34:0x01b7, B:38:0x01c1, B:41:0x01dc, B:43:0x01e7, B:44:0x01f9, B:46:0x01ff, B:48:0x020b, B:50:0x0222, B:52:0x0228, B:54:0x0234, B:56:0x023d, B:58:0x0245, B:61:0x024e, B:63:0x0266, B:65:0x026f, B:67:0x0287, B:69:0x0293, B:70:0x02a5, B:72:0x02ab, B:74:0x02b7, B:76:0x02bf, B:79:0x02c8, B:81:0x02cb, B:84:0x02e0, B:86:0x02fb, B:88:0x0307, B:91:0x0311, B:92:0x0314, B:94:0x0320, B:96:0x0328, B:97:0x0333, B:99:0x033b, B:100:0x0346, B:102:0x034c, B:104:0x0358, B:105:0x0361, B:107:0x036a, B:111:0x02d5, B:114:0x02dc, B:115:0x0219, B:116:0x01d8, B:118:0x0183, B:120:0x00ea, B:121:0x00bb), top: B:4:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0228 A[Catch: all -> 0x00b4, SQLiteException -> 0x00b8, TryCatch #0 {SQLiteException -> 0x00b8, blocks: (B:5:0x007d, B:10:0x0087, B:12:0x0099, B:14:0x00a5, B:17:0x00c2, B:19:0x00d0, B:21:0x00dc, B:23:0x00f2, B:25:0x0134, B:29:0x013e, B:32:0x0188, B:34:0x01b7, B:38:0x01c1, B:41:0x01dc, B:43:0x01e7, B:44:0x01f9, B:46:0x01ff, B:48:0x020b, B:50:0x0222, B:52:0x0228, B:54:0x0234, B:56:0x023d, B:58:0x0245, B:61:0x024e, B:63:0x0266, B:65:0x026f, B:67:0x0287, B:69:0x0293, B:70:0x02a5, B:72:0x02ab, B:74:0x02b7, B:76:0x02bf, B:79:0x02c8, B:81:0x02cb, B:84:0x02e0, B:86:0x02fb, B:88:0x0307, B:91:0x0311, B:92:0x0314, B:94:0x0320, B:96:0x0328, B:97:0x0333, B:99:0x033b, B:100:0x0346, B:102:0x034c, B:104:0x0358, B:105:0x0361, B:107:0x036a, B:111:0x02d5, B:114:0x02dc, B:115:0x0219, B:116:0x01d8, B:118:0x0183, B:120:0x00ea, B:121:0x00bb), top: B:4:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x023d A[Catch: all -> 0x00b4, SQLiteException -> 0x00b8, TryCatch #0 {SQLiteException -> 0x00b8, blocks: (B:5:0x007d, B:10:0x0087, B:12:0x0099, B:14:0x00a5, B:17:0x00c2, B:19:0x00d0, B:21:0x00dc, B:23:0x00f2, B:25:0x0134, B:29:0x013e, B:32:0x0188, B:34:0x01b7, B:38:0x01c1, B:41:0x01dc, B:43:0x01e7, B:44:0x01f9, B:46:0x01ff, B:48:0x020b, B:50:0x0222, B:52:0x0228, B:54:0x0234, B:56:0x023d, B:58:0x0245, B:61:0x024e, B:63:0x0266, B:65:0x026f, B:67:0x0287, B:69:0x0293, B:70:0x02a5, B:72:0x02ab, B:74:0x02b7, B:76:0x02bf, B:79:0x02c8, B:81:0x02cb, B:84:0x02e0, B:86:0x02fb, B:88:0x0307, B:91:0x0311, B:92:0x0314, B:94:0x0320, B:96:0x0328, B:97:0x0333, B:99:0x033b, B:100:0x0346, B:102:0x034c, B:104:0x0358, B:105:0x0361, B:107:0x036a, B:111:0x02d5, B:114:0x02dc, B:115:0x0219, B:116:0x01d8, B:118:0x0183, B:120:0x00ea, B:121:0x00bb), top: B:4:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0287 A[Catch: all -> 0x00b4, SQLiteException -> 0x00b8, TryCatch #0 {SQLiteException -> 0x00b8, blocks: (B:5:0x007d, B:10:0x0087, B:12:0x0099, B:14:0x00a5, B:17:0x00c2, B:19:0x00d0, B:21:0x00dc, B:23:0x00f2, B:25:0x0134, B:29:0x013e, B:32:0x0188, B:34:0x01b7, B:38:0x01c1, B:41:0x01dc, B:43:0x01e7, B:44:0x01f9, B:46:0x01ff, B:48:0x020b, B:50:0x0222, B:52:0x0228, B:54:0x0234, B:56:0x023d, B:58:0x0245, B:61:0x024e, B:63:0x0266, B:65:0x026f, B:67:0x0287, B:69:0x0293, B:70:0x02a5, B:72:0x02ab, B:74:0x02b7, B:76:0x02bf, B:79:0x02c8, B:81:0x02cb, B:84:0x02e0, B:86:0x02fb, B:88:0x0307, B:91:0x0311, B:92:0x0314, B:94:0x0320, B:96:0x0328, B:97:0x0333, B:99:0x033b, B:100:0x0346, B:102:0x034c, B:104:0x0358, B:105:0x0361, B:107:0x036a, B:111:0x02d5, B:114:0x02dc, B:115:0x0219, B:116:0x01d8, B:118:0x0183, B:120:0x00ea, B:121:0x00bb), top: B:4:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02ab A[Catch: all -> 0x00b4, SQLiteException -> 0x00b8, TryCatch #0 {SQLiteException -> 0x00b8, blocks: (B:5:0x007d, B:10:0x0087, B:12:0x0099, B:14:0x00a5, B:17:0x00c2, B:19:0x00d0, B:21:0x00dc, B:23:0x00f2, B:25:0x0134, B:29:0x013e, B:32:0x0188, B:34:0x01b7, B:38:0x01c1, B:41:0x01dc, B:43:0x01e7, B:44:0x01f9, B:46:0x01ff, B:48:0x020b, B:50:0x0222, B:52:0x0228, B:54:0x0234, B:56:0x023d, B:58:0x0245, B:61:0x024e, B:63:0x0266, B:65:0x026f, B:67:0x0287, B:69:0x0293, B:70:0x02a5, B:72:0x02ab, B:74:0x02b7, B:76:0x02bf, B:79:0x02c8, B:81:0x02cb, B:84:0x02e0, B:86:0x02fb, B:88:0x0307, B:91:0x0311, B:92:0x0314, B:94:0x0320, B:96:0x0328, B:97:0x0333, B:99:0x033b, B:100:0x0346, B:102:0x034c, B:104:0x0358, B:105:0x0361, B:107:0x036a, B:111:0x02d5, B:114:0x02dc, B:115:0x0219, B:116:0x01d8, B:118:0x0183, B:120:0x00ea, B:121:0x00bb), top: B:4:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02fb A[Catch: all -> 0x00b4, SQLiteException -> 0x00b8, TryCatch #0 {SQLiteException -> 0x00b8, blocks: (B:5:0x007d, B:10:0x0087, B:12:0x0099, B:14:0x00a5, B:17:0x00c2, B:19:0x00d0, B:21:0x00dc, B:23:0x00f2, B:25:0x0134, B:29:0x013e, B:32:0x0188, B:34:0x01b7, B:38:0x01c1, B:41:0x01dc, B:43:0x01e7, B:44:0x01f9, B:46:0x01ff, B:48:0x020b, B:50:0x0222, B:52:0x0228, B:54:0x0234, B:56:0x023d, B:58:0x0245, B:61:0x024e, B:63:0x0266, B:65:0x026f, B:67:0x0287, B:69:0x0293, B:70:0x02a5, B:72:0x02ab, B:74:0x02b7, B:76:0x02bf, B:79:0x02c8, B:81:0x02cb, B:84:0x02e0, B:86:0x02fb, B:88:0x0307, B:91:0x0311, B:92:0x0314, B:94:0x0320, B:96:0x0328, B:97:0x0333, B:99:0x033b, B:100:0x0346, B:102:0x034c, B:104:0x0358, B:105:0x0361, B:107:0x036a, B:111:0x02d5, B:114:0x02dc, B:115:0x0219, B:116:0x01d8, B:118:0x0183, B:120:0x00ea, B:121:0x00bb), top: B:4:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0320 A[Catch: all -> 0x00b4, SQLiteException -> 0x00b8, TryCatch #0 {SQLiteException -> 0x00b8, blocks: (B:5:0x007d, B:10:0x0087, B:12:0x0099, B:14:0x00a5, B:17:0x00c2, B:19:0x00d0, B:21:0x00dc, B:23:0x00f2, B:25:0x0134, B:29:0x013e, B:32:0x0188, B:34:0x01b7, B:38:0x01c1, B:41:0x01dc, B:43:0x01e7, B:44:0x01f9, B:46:0x01ff, B:48:0x020b, B:50:0x0222, B:52:0x0228, B:54:0x0234, B:56:0x023d, B:58:0x0245, B:61:0x024e, B:63:0x0266, B:65:0x026f, B:67:0x0287, B:69:0x0293, B:70:0x02a5, B:72:0x02ab, B:74:0x02b7, B:76:0x02bf, B:79:0x02c8, B:81:0x02cb, B:84:0x02e0, B:86:0x02fb, B:88:0x0307, B:91:0x0311, B:92:0x0314, B:94:0x0320, B:96:0x0328, B:97:0x0333, B:99:0x033b, B:100:0x0346, B:102:0x034c, B:104:0x0358, B:105:0x0361, B:107:0x036a, B:111:0x02d5, B:114:0x02dc, B:115:0x0219, B:116:0x01d8, B:118:0x0183, B:120:0x00ea, B:121:0x00bb), top: B:4:0x007d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.Z1 H0(java.lang.String r51) {
        /*
            Method dump skipped, instructions count: 928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3691l.H0(java.lang.String):com.google.android.gms.measurement.internal.Z1");
    }

    public final C3717p I(long j2, String str, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        C0821p.f(str);
        n();
        u();
        String[] strArr = {str};
        C3717p c3717p = new C3717p();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase B = B();
                Cursor query = B.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    k().L().b("Not updating daily counts, app is not known. appId", V1.v(str));
                    query.close();
                    return c3717p;
                }
                if (query.getLong(0) == j2) {
                    c3717p.b = query.getLong(1);
                    c3717p.a = query.getLong(2);
                    c3717p.c = query.getLong(3);
                    c3717p.d = query.getLong(4);
                    c3717p.e = query.getLong(5);
                    c3717p.f = query.getLong(6);
                }
                if (z) {
                    c3717p.b += j3;
                }
                if (z2) {
                    c3717p.a += j3;
                }
                if (z3) {
                    c3717p.c += j3;
                }
                if (z4) {
                    c3717p.d += j3;
                }
                if (z5) {
                    c3717p.e += j3;
                }
                if (z6) {
                    c3717p.f += j3;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j2));
                contentValues.put("daily_public_events_count", Long.valueOf(c3717p.a));
                contentValues.put("daily_events_count", Long.valueOf(c3717p.b));
                contentValues.put("daily_conversions_count", Long.valueOf(c3717p.c));
                contentValues.put("daily_error_events_count", Long.valueOf(c3717p.d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(c3717p.e));
                contentValues.put("daily_realtime_dcu_count", Long.valueOf(c3717p.f));
                B.update("apps", contentValues, "app_id=?", strArr);
                query.close();
                return c3717p;
            } catch (SQLiteException e) {
                k().G().c("Error updating daily counts. appId", V1.v(str), e);
                if (0 != 0) {
                    cursor.close();
                }
                return c3717p;
            }
        } finally {
        }
    }

    public final C5 I0(String str, String str2) {
        Throwable th;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursor;
        C0821p.f(str);
        C0821p.f(str2);
        n();
        u();
        Cursor cursor2 = null;
        try {
            cursor = B().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursor.moveToFirst()) {
                        cursor.close();
                        return null;
                    }
                    long j2 = cursor.getLong(0);
                    Object M = M(cursor, 1);
                    if (M == null) {
                        cursor.close();
                        return null;
                    }
                    str3 = str;
                    str4 = str2;
                    try {
                        C5 c5 = new C5(str3, cursor.getString(2), str4, j2, M);
                        if (cursor.moveToNext()) {
                            k().G().b("Got multiple records for user property, expected one. appId", V1.v(str3));
                        }
                        cursor.close();
                        return c5;
                    } catch (SQLiteException e) {
                        e = e;
                        sQLiteException = e;
                        k().G().d("Error querying user property. appId", V1.v(str3), g().g(str4), sQLiteException);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    str3 = str;
                    str4 = str2;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 == null) {
                    throw th;
                }
                cursor2.close();
                throw th;
            }
        } catch (SQLiteException e3) {
            str3 = str;
            str4 = str2;
            sQLiteException = e3;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final C3717p J(long j2, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        return I(j2, str, 1L, false, false, z3, false, z5, z6);
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x005a: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:91), block:B:28:0x0059 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.C3698m J0(java.lang.String r11) {
        /*
            r10 = this;
            ax.M5.C0821p.f(r11)
            r10.n()
            r10.u()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.B()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L70
            java.lang.String r3 = "apps"
            java.lang.String r0 = "remote_config"
            java.lang.String r4 = "config_last_modified_time"
            java.lang.String r5 = "e_tag"
            java.lang.String[] r4 = new java.lang.String[]{r0, r4, r5}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L70
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[]{r11}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L70
            r8 = 0
            r9 = 0
            r7 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L70
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5c
            if (r0 != 0) goto L31
            r2.close()
            return r1
        L31:
            r0 = 0
            byte[] r0 = r2.getBlob(r0)     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5c
            r3 = 1
            java.lang.String r3 = r2.getString(r3)     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5c
            r4 = 2
            java.lang.String r4 = r2.getString(r4)     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5c
            boolean r5 = r2.moveToNext()     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5c
            if (r5 == 0) goto L5e
            com.google.android.gms.measurement.internal.V1 r5 = r10.k()     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5c
            com.google.android.gms.measurement.internal.X1 r5 = r5.G()     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5c
            java.lang.String r6 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.V1.v(r11)     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5c
            r5.b(r6, r7)     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5c
            goto L5e
        L58:
            r0 = move-exception
            r11 = r0
            r1 = r2
            goto L89
        L5c:
            r0 = move-exception
            goto L72
        L5e:
            if (r0 != 0) goto L64
            r2.close()
            return r1
        L64:
            com.google.android.gms.measurement.internal.m r5 = new com.google.android.gms.measurement.internal.m     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5c
            r5.<init>(r0, r3, r4)     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5c
            r2.close()
            return r5
        L6d:
            r0 = move-exception
            r11 = r0
            goto L89
        L70:
            r0 = move-exception
            r2 = r1
        L72:
            com.google.android.gms.measurement.internal.V1 r3 = r10.k()     // Catch: java.lang.Throwable -> L58
            com.google.android.gms.measurement.internal.X1 r3 = r3.G()     // Catch: java.lang.Throwable -> L58
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.V1.v(r11)     // Catch: java.lang.Throwable -> L58
            r3.c(r4, r11, r0)     // Catch: java.lang.Throwable -> L58
            if (r2 == 0) goto L88
            r2.close()
        L88:
            return r1
        L89:
            if (r1 == 0) goto L8e
            r1.close()
        L8e:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3691l.J0(java.lang.String):com.google.android.gms.measurement.internal.m");
    }

    final Map<Integer, List<ax.b6.B1>> K0(String str, String str2) {
        u();
        n();
        C0821p.f(str);
        C0821p.f(str2);
        ax.B.a aVar = new ax.B.a();
        Cursor cursor = null;
        try {
            try {
                Cursor query = B().query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{str, str2}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, List<ax.b6.B1>> map = Collections.EMPTY_MAP;
                    query.close();
                    return map;
                }
                do {
                    try {
                        ax.b6.B1 b1 = (ax.b6.B1) ((AbstractC1599k4) ((B1.a) x5.G(ax.b6.B1.O(), query.getBlob(1))).q());
                        int i2 = query.getInt(0);
                        List list = (List) aVar.get(Integer.valueOf(i2));
                        if (list == null) {
                            list = new ArrayList();
                            aVar.put(Integer.valueOf(i2), list);
                        }
                        list.add(b1);
                    } catch (IOException e) {
                        k().G().c("Failed to merge filter. appId", V1.v(str), e);
                    }
                } while (query.moveToNext());
                query.close();
                return aVar;
            } catch (SQLiteException e2) {
                k().G().c("Database error querying filters. appId", V1.v(str), e2);
                Map<Integer, List<ax.b6.B1>> map2 = Collections.EMPTY_MAP;
                if (0 != 0) {
                    cursor.close();
                }
                return map2;
            }
        } finally {
        }
    }

    public final C3746u L0(String str) {
        C0821p.l(str);
        n();
        u();
        return C3746u.d(P("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, HttpUrl.FRAGMENT_ENCODE_SET));
    }

    final Map<Integer, List<ax.b6.E1>> M0(String str, String str2) {
        u();
        n();
        C0821p.f(str);
        C0821p.f(str2);
        ax.B.a aVar = new ax.B.a();
        Cursor cursor = null;
        try {
            try {
                Cursor query = B().query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{str, str2}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, List<ax.b6.E1>> map = Collections.EMPTY_MAP;
                    query.close();
                    return map;
                }
                do {
                    try {
                        ax.b6.E1 e1 = (ax.b6.E1) ((AbstractC1599k4) ((E1.a) x5.G(ax.b6.E1.L(), query.getBlob(1))).q());
                        int i2 = query.getInt(0);
                        List list = (List) aVar.get(Integer.valueOf(i2));
                        if (list == null) {
                            list = new ArrayList();
                            aVar.put(Integer.valueOf(i2), list);
                        }
                        list.add(e1);
                    } catch (IOException e) {
                        k().G().c("Failed to merge filter", V1.v(str), e);
                    }
                } while (query.moveToNext());
                query.close();
                return aVar;
            } catch (SQLiteException e2) {
                k().G().c("Database error querying filters. appId", V1.v(str), e2);
                Map<Integer, List<ax.b6.E1>> map2 = Collections.EMPTY_MAP;
                if (0 != 0) {
                    cursor.close();
                }
                return map2;
            }
        } finally {
        }
    }

    public final C3667h3 N0(String str) {
        C0821p.l(str);
        n();
        u();
        return C3667h3.q(P("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}, HttpUrl.FRAGMENT_ENCODE_SET));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String O(long r4) {
        /*
            r3 = this;
            r3.n()
            r3.u()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r3.B()     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40
            android.database.Cursor r4 = r1.rawQuery(r2, r4)     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40
            boolean r5 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            if (r5 != 0) goto L35
            com.google.android.gms.measurement.internal.V1 r5 = r3.k()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            com.google.android.gms.measurement.internal.X1 r5 = r5.K()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            java.lang.String r1 = "No expired configs for apps with pending events"
            r5.a(r1)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r4.close()
            return r0
        L30:
            r5 = move-exception
            r0 = r4
            goto L55
        L33:
            r5 = move-exception
            goto L42
        L35:
            r5 = 0
            java.lang.String r5 = r4.getString(r5)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r4.close()
            return r5
        L3e:
            r5 = move-exception
            goto L55
        L40:
            r5 = move-exception
            r4 = r0
        L42:
            com.google.android.gms.measurement.internal.V1 r1 = r3.k()     // Catch: java.lang.Throwable -> L30
            com.google.android.gms.measurement.internal.X1 r1 = r1.G()     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = "Error selecting expired configs"
            r1.b(r2, r5)     // Catch: java.lang.Throwable -> L30
            if (r4 == 0) goto L54
            r4.close()
        L54:
            return r0
        L55:
            if (r0 == 0) goto L5a
            r0.close()
        L5a:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3691l.O(long):java.lang.String");
    }

    public final void O0(String str, String str2) {
        C0821p.f(str);
        C0821p.f(str2);
        n();
        u();
        try {
            B().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            k().G().d("Error deleting user property. appId", V1.v(str), g().g(str2), e);
        }
    }

    public final C3667h3 P0(String str) {
        C0821p.l(str);
        n();
        u();
        C3667h3 c3667h3 = (C3667h3) N("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str}, new r() { // from class: com.google.android.gms.measurement.internal.n
            @Override // com.google.android.gms.measurement.internal.r
            public final Object a(Cursor cursor) {
                C3667h3 i2;
                i2 = C3667h3.i(cursor.getString(0), cursor.getInt(1));
                return i2;
            }
        });
        return c3667h3 == null ? C3667h3.c : c3667h3;
    }

    public final List<Pair<C1543e2, Long>> Q(String str, int i2, int i3) {
        byte[] k0;
        long j2;
        long j3;
        n();
        u();
        int i4 = 1;
        C0821p.a(i2 > 0);
        C0821p.a(i3 > 0);
        C0821p.f(str);
        Cursor cursor = null;
        try {
            try {
                Cursor query = B().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i2));
                if (!query.moveToFirst()) {
                    List<Pair<C1543e2, Long>> list = Collections.EMPTY_LIST;
                    query.close();
                    return list;
                }
                ArrayList arrayList = new ArrayList();
                int i5 = 0;
                while (true) {
                    long j4 = query.getLong(0);
                    try {
                        k0 = o().k0(query.getBlob(i4));
                    } catch (IOException e) {
                        k().G().c("Failed to unzip queued bundle. appId", V1.v(str), e);
                    }
                    if (!arrayList.isEmpty() && k0.length + i5 > i3) {
                        break;
                    }
                    try {
                        C1543e2.a aVar = (C1543e2.a) x5.G(C1543e2.M3(), k0);
                        if (!arrayList.isEmpty()) {
                            C1543e2 c1543e2 = (C1543e2) ((Pair) arrayList.get(0)).first;
                            C1543e2 c1543e22 = (C1543e2) ((AbstractC1599k4) aVar.q());
                            if (!c1543e2.m0().equals(c1543e22.m0()) || !c1543e2.l0().equals(c1543e22.l0()) || c1543e2.C0() != c1543e22.C0() || !c1543e2.n0().equals(c1543e22.n0())) {
                                break;
                            }
                            Iterator<C1579i2> it = c1543e2.A0().iterator();
                            while (true) {
                                j2 = -1;
                                if (!it.hasNext()) {
                                    j3 = -1;
                                    break;
                                }
                                C1579i2 next = it.next();
                                if ("_npa".equals(next.c0())) {
                                    j3 = next.X();
                                    break;
                                }
                            }
                            Iterator<C1579i2> it2 = c1543e22.A0().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                C1579i2 next2 = it2.next();
                                if ("_npa".equals(next2.c0())) {
                                    j2 = next2.X();
                                    break;
                                }
                            }
                            if (j3 != j2) {
                                break;
                            }
                        }
                        if (!query.isNull(2)) {
                            aVar.E0(query.getInt(2));
                        }
                        i5 += k0.length;
                        arrayList.add(Pair.create((C1543e2) ((AbstractC1599k4) aVar.q()), Long.valueOf(j4)));
                    } catch (IOException e2) {
                        k().G().c("Failed to merge queued bundle. appId", V1.v(str), e2);
                    }
                    if (!query.moveToNext() || i5 > i3) {
                        break;
                    }
                    i4 = 1;
                }
                query.close();
                return arrayList;
            } catch (SQLiteException e3) {
                k().G().c("Error querying bundles. appId", V1.v(str), e3);
                List<Pair<C1543e2, Long>> list2 = Collections.EMPTY_LIST;
                if (0 != 0) {
                    cursor.close();
                }
                return list2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final List<C3649f> R(String str, String str2, String str3) {
        C0821p.f(str);
        n();
        u();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3 + "*");
            sb.append(" and name glob ?");
        }
        return S(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final List<C3669h5> R0(String str) {
        C0821p.f(str);
        n();
        u();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = B().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                do {
                    String string = cursor.getString(0);
                    if (string == null) {
                        string = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    arrayList.add(new C3669h5(string, cursor.getLong(1), cursor.getInt(2)));
                } while (cursor.moveToNext());
                cursor.close();
                return arrayList;
            } catch (SQLiteException e) {
                k().G().c("Error querying trigger uris. appId", V1.v(str), e);
                List<C3669h5> list = Collections.EMPTY_LIST;
                if (cursor != null) {
                    cursor.close();
                }
                return list;
            }
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        k().G().b("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.measurement.internal.C3649f> S(java.lang.String r21, java.lang.String[] r22) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3691l.S(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final List<C5> S0(String str) {
        String str2;
        C0821p.f(str);
        n();
        u();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = B().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                while (true) {
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    if (string2 == null) {
                        string2 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    String str3 = string2;
                    long j2 = cursor.getLong(2);
                    Object M = M(cursor, 3);
                    if (M == null) {
                        k().G().b("Read invalid user property value, ignoring it. appId", V1.v(str));
                        str2 = str;
                    } else {
                        str2 = str;
                        try {
                            arrayList.add(new C5(str2, str3, string, j2, M));
                        } catch (SQLiteException e) {
                            e = e;
                            k().G().c("Error querying user properties. appId", V1.v(str2), e);
                            List<C5> list = Collections.EMPTY_LIST;
                            if (cursor != null) {
                                cursor.close();
                            }
                            return list;
                        }
                    }
                    if (!cursor.moveToNext()) {
                        cursor.close();
                        return arrayList;
                    }
                    str = str2;
                }
            } finally {
            }
        } catch (SQLiteException e2) {
            e = e2;
            str2 = str;
        }
    }

    final Map<Integer, C1561g2> T0(String str) {
        u();
        n();
        C0821p.f(str);
        Cursor cursor = null;
        try {
            try {
                Cursor query = B().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, C1561g2> map = Collections.EMPTY_MAP;
                    query.close();
                    return map;
                }
                ax.B.a aVar = new ax.B.a();
                do {
                    int i2 = query.getInt(0);
                    try {
                        aVar.put(Integer.valueOf(i2), (C1561g2) ((AbstractC1599k4) ((C1561g2.a) x5.G(C1561g2.Y(), query.getBlob(1))).q()));
                    } catch (IOException e) {
                        k().G().d("Failed to merge filter results. appId, audienceId, error", V1.v(str), Integer.valueOf(i2), e);
                    }
                } while (query.moveToNext());
                query.close();
                return aVar;
            } catch (SQLiteException e2) {
                k().G().c("Database error querying filter results. appId", V1.v(str), e2);
                Map<Integer, C1561g2> map2 = Collections.EMPTY_MAP;
                if (0 != 0) {
                    cursor.close();
                }
                return map2;
            }
        } finally {
        }
    }

    public final void U(C3770y c3770y) {
        X("events", c3770y);
    }

    final Map<Integer, List<ax.b6.B1>> U0(String str) {
        C0821p.f(str);
        ax.B.a aVar = new ax.B.a();
        Cursor cursor = null;
        try {
            try {
                Cursor query = B().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, List<ax.b6.B1>> map = Collections.EMPTY_MAP;
                    query.close();
                    return map;
                }
                do {
                    try {
                        ax.b6.B1 b1 = (ax.b6.B1) ((AbstractC1599k4) ((B1.a) x5.G(ax.b6.B1.O(), query.getBlob(1))).q());
                        if (b1.X()) {
                            int i2 = query.getInt(0);
                            List list = (List) aVar.get(Integer.valueOf(i2));
                            if (list == null) {
                                list = new ArrayList();
                                aVar.put(Integer.valueOf(i2), list);
                            }
                            list.add(b1);
                        }
                    } catch (IOException e) {
                        k().G().c("Failed to merge filter. appId", V1.v(str), e);
                    }
                } while (query.moveToNext());
                query.close();
                return aVar;
            } catch (SQLiteException e2) {
                k().G().c("Database error querying filters. appId", V1.v(str), e2);
                Map<Integer, List<ax.b6.B1>> map2 = Collections.EMPTY_MAP;
                if (0 != 0) {
                    cursor.close();
                }
                return map2;
            }
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0043, code lost:
    
        if (r7.b.S(r0).m(com.google.android.gms.measurement.internal.C3667h3.a.ANALYTICS_STORAGE) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V(com.google.android.gms.measurement.internal.Z1 r8, boolean r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 881
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3691l.V(com.google.android.gms.measurement.internal.Z1, boolean, boolean):void");
    }

    final Map<Integer, List<Integer>> V0(String str) {
        u();
        n();
        C0821p.f(str);
        ax.B.a aVar = new ax.B.a();
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = B().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str, str});
                if (!rawQuery.moveToFirst()) {
                    Map<Integer, List<Integer>> map = Collections.EMPTY_MAP;
                    rawQuery.close();
                    return map;
                }
                do {
                    int i2 = rawQuery.getInt(0);
                    List list = (List) aVar.get(Integer.valueOf(i2));
                    if (list == null) {
                        list = new ArrayList();
                        aVar.put(Integer.valueOf(i2), list);
                    }
                    list.add(Integer.valueOf(rawQuery.getInt(1)));
                } while (rawQuery.moveToNext());
                rawQuery.close();
                return aVar;
            } catch (SQLiteException e) {
                k().G().c("Database error querying scoped filters. appId", V1.v(str), e);
                Map<Integer, List<Integer>> map2 = Collections.EMPTY_MAP;
                if (0 != 0) {
                    cursor.close();
                }
                return map2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void W(String str, C3746u c3746u) {
        C0821p.l(str);
        C0821p.l(c3746u);
        n();
        u();
        if (d().t(F.K0)) {
            C3667h3 P0 = P0(str);
            C3667h3 c3667h3 = C3667h3.c;
            if (P0 == c3667h3) {
                A0(str, c3667h3);
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", c3746u.j());
        Z("consent_settings", "app_id", contentValues);
    }

    public final void W0(String str) {
        C3770y G0;
        Q0("events_snapshot", str);
        Cursor cursor = null;
        try {
            try {
                cursor = B().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return;
                }
                do {
                    String string = cursor.getString(0);
                    if (string != null && (G0 = G0(str, string)) != null) {
                        X("events_snapshot", G0);
                    }
                } while (cursor.moveToNext());
                cursor.close();
            } catch (SQLiteException e) {
                k().G().c("Error creating snapshot. appId", V1.v(str), e);
                if (cursor != null) {
                    cursor.close();
                }
            }
        } finally {
        }
    }

    public final void X0() {
        u();
        B().beginTransaction();
    }

    public final void Y(String str, C3667h3 c3667h3) {
        C0821p.l(str);
        C0821p.l(c3667h3);
        n();
        u();
        A0(str, P0(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", c3667h3.z());
        Z("consent_settings", "app_id", contentValues);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x009f, code lost:
    
        if ("_v".equals(r0) != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y0(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3691l.Y0(java.lang.String):void");
    }

    public final void Z0() {
        u();
        B().endTransaction();
    }

    final void a0(String str, List<ax.b6.A1> list) {
        boolean z;
        boolean z2;
        C0821p.l(list);
        for (int i2 = 0; i2 < list.size(); i2++) {
            A1.a A = list.get(i2).A();
            if (A.w() != 0) {
                for (int i3 = 0; i3 < A.w(); i3++) {
                    B1.a A2 = A.z(i3).A();
                    B1.a aVar = (B1.a) ((AbstractC1599k4.b) A2.clone());
                    String b = C2069q.b(A2.B());
                    if (b != null) {
                        aVar.y(b);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    for (int i4 = 0; i4 < A2.w(); i4++) {
                        ax.b6.C1 z3 = A2.z(i4);
                        String a = C2068p.a(z3.O());
                        if (a != null) {
                            aVar.x(i4, (ax.b6.C1) ((AbstractC1599k4) z3.A().w(a).q()));
                            z2 = true;
                        }
                    }
                    if (z2) {
                        A1.a x = A.x(i3, aVar);
                        list.set(i2, (ax.b6.A1) ((AbstractC1599k4) x.q()));
                        A = x;
                    }
                }
            }
            if (A.B() != 0) {
                for (int i5 = 0; i5 < A.B(); i5++) {
                    ax.b6.E1 C = A.C(i5);
                    String a2 = C2071s.a(C.N());
                    if (a2 != null) {
                        A = A.y(i5, C.A().w(a2));
                        list.set(i2, (ax.b6.A1) ((AbstractC1599k4) A.q()));
                    }
                }
            }
        }
        u();
        n();
        C0821p.f(str);
        C0821p.l(list);
        SQLiteDatabase B = B();
        B.beginTransaction();
        try {
            u();
            n();
            C0821p.f(str);
            SQLiteDatabase B2 = B();
            B2.delete("property_filters", "app_id=?", new String[]{str});
            B2.delete("event_filters", "app_id=?", new String[]{str});
            for (ax.b6.A1 a1 : list) {
                u();
                n();
                C0821p.f(str);
                C0821p.l(a1);
                if (a1.T()) {
                    int n2 = a1.n();
                    Iterator<ax.b6.B1> it = a1.R().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!it.next().Y()) {
                                k().L().c("Event filter with no ID. Audience definition ignored. appId, audienceId", V1.v(str), Integer.valueOf(n2));
                                break;
                            }
                        } else {
                            Iterator<ax.b6.E1> it2 = a1.S().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (!it2.next().R()) {
                                        k().L().c("Property filter with no ID. Audience definition ignored. appId, audienceId", V1.v(str), Integer.valueOf(n2));
                                        break;
                                    }
                                } else {
                                    Iterator<ax.b6.B1> it3 = a1.R().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (!g0(str, n2, it3.next())) {
                                                z = false;
                                                break;
                                            }
                                        } else {
                                            z = true;
                                            break;
                                        }
                                    }
                                    if (z) {
                                        Iterator<ax.b6.E1> it4 = a1.S().iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                if (!h0(str, n2, it4.next())) {
                                                    z = false;
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                    if (!z) {
                                        u();
                                        n();
                                        C0821p.f(str);
                                        SQLiteDatabase B3 = B();
                                        B3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(n2)});
                                        B3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(n2)});
                                    }
                                }
                            }
                        }
                    }
                } else {
                    k().L().b("Audience with no ID. appId", V1.v(str));
                }
            }
            ArrayList arrayList = new ArrayList();
            for (ax.b6.A1 a12 : list) {
                arrayList.add(a12.T() ? Integer.valueOf(a12.n()) : null);
            }
            B0(str, arrayList);
            B.setTransactionSuccessful();
            B.endTransaction();
        } catch (Throwable th) {
            B.endTransaction();
            throw th;
        }
    }

    final void a1() {
        int delete;
        n();
        u();
        if (l0()) {
            long a = s().e.a();
            long b = b().b();
            if (Math.abs(b - a) > F.z.a(null).longValue()) {
                s().e.b(b);
                n();
                u();
                if (!l0() || (delete = B().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(b().a()), String.valueOf(C3663h.O())})) <= 0) {
                    return;
                }
                k().K().b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
            }
        }
    }

    final void b0(List<Long> list) {
        n();
        u();
        C0821p.l(list);
        C0821p.n(list.size());
        if (l0()) {
            String str = "(" + TextUtils.join(",", list) + ")";
            if (y0("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                k().L().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                B().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e) {
                k().G().b("Error incrementing retry count. error", e);
            }
        }
    }

    public final void b1() {
        u();
        B().setTransactionSuccessful();
    }

    public final boolean c0(C1543e2 c1543e2, boolean z) {
        n();
        u();
        C0821p.l(c1543e2);
        C0821p.f(c1543e2.P3());
        C0821p.o(c1543e2.d1());
        a1();
        long a = b().a();
        if (c1543e2.o3() < a - C3663h.O() || c1543e2.o3() > C3663h.O() + a) {
            k().L().d("Storing bundle outside of the max uploading time span. appId, now, timestamp", V1.v(c1543e2.P3()), Long.valueOf(a), Long.valueOf(c1543e2.o3()));
        }
        try {
            byte[] i0 = o().i0(c1543e2.l());
            k().K().b("Saving bundle, size", Integer.valueOf(i0.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", c1543e2.P3());
            contentValues.put("bundle_end_timestamp", Long.valueOf(c1543e2.o3()));
            contentValues.put("data", i0);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (c1543e2.k1()) {
                contentValues.put("retry_count", Integer.valueOf(c1543e2.v2()));
            }
            try {
                if (B().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                k().G().b("Failed to insert bundle (got -1). appId", V1.v(c1543e2.P3()));
                return false;
            } catch (SQLiteException e) {
                k().G().c("Error storing bundle. appId", V1.v(c1543e2.P3()), e);
                return false;
            }
        } catch (IOException e2) {
            k().G().c("Data loss. Failed to serialize bundle. appId", V1.v(c1543e2.P3()), e2);
            return false;
        }
    }

    public final boolean c1() {
        return y0("select count(1) > 0 from raw_events", null) != 0;
    }

    public final boolean d0(C3649f c3649f) {
        C0821p.l(c3649f);
        n();
        u();
        String str = c3649f.q;
        C0821p.l(str);
        if (I0(str, c3649f.d0.c0) == null && y0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", c3649f.c0);
        contentValues.put("name", c3649f.d0.c0);
        T(contentValues, "value", C0821p.l(c3649f.d0.k()));
        contentValues.put("active", Boolean.valueOf(c3649f.f0));
        contentValues.put("trigger_event_name", c3649f.g0);
        contentValues.put("trigger_timeout", Long.valueOf(c3649f.i0));
        i();
        contentValues.put("timed_out_event", B5.q0(c3649f.h0));
        contentValues.put("creation_timestamp", Long.valueOf(c3649f.e0));
        i();
        contentValues.put("triggered_event", B5.q0(c3649f.j0));
        contentValues.put("triggered_timestamp", Long.valueOf(c3649f.d0.d0));
        contentValues.put("time_to_live", Long.valueOf(c3649f.k0));
        i();
        contentValues.put("expired_event", B5.q0(c3649f.l0));
        try {
            if (B().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            k().G().b("Failed to insert/update conditional user property (got -1)", V1.v(str));
            return true;
        } catch (SQLiteException e) {
            k().G().c("Error storing conditional user property", V1.v(str), e);
            return true;
        }
    }

    public final boolean d1() {
        return y0("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    public final boolean e0(A a, long j2, boolean z) {
        n();
        u();
        C0821p.l(a);
        C0821p.f(a.a);
        byte[] l2 = o().E(a).l();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", a.a);
        contentValues.put("name", a.b);
        contentValues.put("timestamp", Long.valueOf(a.d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j2));
        contentValues.put("data", l2);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (B().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            k().G().b("Failed to insert raw event (got -1). appId", V1.v(a.a));
            return false;
        } catch (SQLiteException e) {
            k().G().c("Error storing raw event. appId", V1.v(a.a), e);
            return false;
        }
    }

    public final boolean e1() {
        return y0("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    public final boolean f0(C5 c5) {
        C0821p.l(c5);
        n();
        u();
        if (I0(c5.a, c5.c) == null) {
            if (B5.L0(c5.c)) {
                if (y0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{c5.a}) >= d().q(c5.a, F.H, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(c5.c) && y0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{c5.a, c5.b}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c5.a);
        contentValues.put("origin", c5.b);
        contentValues.put("name", c5.c);
        contentValues.put("set_timestamp", Long.valueOf(c5.d));
        T(contentValues, "value", c5.e);
        try {
            if (B().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            k().G().b("Failed to insert/update user property (got -1). appId", V1.v(c5.a));
            return true;
        } catch (SQLiteException e) {
            k().G().c("Error storing user property. appId", V1.v(c5.a), e);
            return true;
        }
    }

    final boolean i0(String str, Bundle bundle) {
        n();
        u();
        byte[] l2 = o().E(new A(this.a, HttpUrl.FRAGMENT_ENCODE_SET, str, "dep", 0L, 0L, bundle)).l();
        k().K().c("Saving default event parameters, appId, data size", g().c(str), Integer.valueOf(l2.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", l2);
        try {
            if (B().insertWithOnConflict("default_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            k().G().b("Failed to insert default event parameters (got -1). appId", V1.v(str));
            return false;
        } catch (SQLiteException e) {
            k().G().c("Error storing default event parameters. appId", V1.v(str), e);
            return false;
        }
    }

    public final boolean j0(String str, C3669h5 c3669h5) {
        n();
        u();
        C0821p.l(c3669h5);
        C0821p.f(str);
        long a = b().a();
        if (c3669h5.c0 < a - C3663h.O() || c3669h5.c0 > C3663h.O() + a) {
            k().L().d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", V1.v(str), Long.valueOf(a), Long.valueOf(c3669h5.c0));
        }
        k().K().a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", c3669h5.q);
        contentValues.put("source", Integer.valueOf(c3669h5.d0));
        contentValues.put("timestamp_millis", Long.valueOf(c3669h5.c0));
        try {
            if (B().insert("trigger_uris", null, contentValues) != -1) {
                return true;
            }
            k().G().b("Failed to insert trigger URI (got -1). appId", V1.v(str));
            return false;
        } catch (SQLiteException e) {
            k().G().c("Error storing trigger URI. appId", V1.v(str), e);
            return false;
        }
    }

    public final boolean k0(String str, Long l2, long j2, ax.b6.Z1 z1) {
        n();
        u();
        C0821p.l(z1);
        C0821p.f(str);
        C0821p.l(l2);
        byte[] l3 = z1.l();
        k().K().c("Saving complex main event, appId, data size", g().c(str), Integer.valueOf(l3.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l2);
        contentValues.put("children_to_process", Long.valueOf(j2));
        contentValues.put("main_event", l3);
        try {
            if (B().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            k().G().b("Failed to insert complex main event (got -1). appId", V1.v(str));
            return false;
        } catch (SQLiteException e) {
            k().G().c("Error storing complex main event. appId", V1.v(str), e);
            return false;
        }
    }

    protected final boolean l0() {
        return a().getDatabasePath("google_app_measurement.db").exists();
    }

    public final long w0(String str) {
        C0821p.f(str);
        n();
        u();
        return G("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3690k5
    protected final boolean x() {
        return false;
    }

    protected final long x0(String str, String str2) {
        long G;
        C0821p.f(str);
        C0821p.f(str2);
        n();
        u();
        SQLiteDatabase B = B();
        B.beginTransaction();
        long j2 = 0;
        try {
            try {
                G = G("select " + str2 + " from app2 where app_id=?", new String[]{str}, -1L);
                if (G == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (B.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        k().G().c("Failed to insert column (got -1). appId", V1.v(str), str2);
                        B.endTransaction();
                        return -1L;
                    }
                    G = 0;
                }
            } catch (SQLiteException e) {
                e = e;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str);
                contentValues2.put(str2, Long.valueOf(1 + G));
                if (B.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                    k().G().c("Failed to update column (got 0). appId", V1.v(str), str2);
                    B.endTransaction();
                    return -1L;
                }
                B.setTransactionSuccessful();
                B.endTransaction();
                return G;
            } catch (SQLiteException e2) {
                e = e2;
                j2 = G;
                k().G().d("Error inserting column. appId", V1.v(str), str2, e);
                B.endTransaction();
                return j2;
            }
        } catch (Throwable th) {
            B.endTransaction();
            throw th;
        }
    }

    public final long y() {
        Cursor cursor = null;
        try {
            try {
                cursor = B().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return -1L;
                }
                long j2 = cursor.getLong(0);
                cursor.close();
                return j2;
            } catch (SQLiteException e) {
                k().G().b("Error querying raw events", e);
                if (cursor != null) {
                    cursor.close();
                }
                return -1L;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long z() {
        return G("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x009e, code lost:
    
        k().G().b("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.measurement.internal.C5> z0(java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3691l.z0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }
}
