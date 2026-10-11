/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import ax.B.a;
import ax.b6.A1;
import ax.b6.B1;
import ax.b6.C1;
import ax.b6.E1;
import ax.b6.M6;
import ax.b6.e2;
import ax.b6.g2;
import ax.b6.g6;
import ax.b6.i2;
import ax.b6.k4;
import ax.b6.k7;
import ax.b6.m6;
import ax.b6.n6;
import ax.b6.p3;
import ax.b6.q3;
import ax.b6.r7;
import ax.b6.y6;
import ax.f6.s;
import com.google.android.gms.measurement.internal.A;
import com.google.android.gms.measurement.internal.A5;
import com.google.android.gms.measurement.internal.B5;
import com.google.android.gms.measurement.internal.C5;
import com.google.android.gms.measurement.internal.D;
import com.google.android.gms.measurement.internal.F;
import com.google.android.gms.measurement.internal.V1;
import com.google.android.gms.measurement.internal.X1;
import com.google.android.gms.measurement.internal.Z1;
import com.google.android.gms.measurement.internal.e5;
import com.google.android.gms.measurement.internal.f;
import com.google.android.gms.measurement.internal.h;
import com.google.android.gms.measurement.internal.h3;
import com.google.android.gms.measurement.internal.h5;
import com.google.android.gms.measurement.internal.k5;
import com.google.android.gms.measurement.internal.m;
import com.google.android.gms.measurement.internal.n;
import com.google.android.gms.measurement.internal.p;
import com.google.android.gms.measurement.internal.q;
import com.google.android.gms.measurement.internal.q5;
import com.google.android.gms.measurement.internal.r;
import com.google.android.gms.measurement.internal.u;
import com.google.android.gms.measurement.internal.x5;
import com.google.android.gms.measurement.internal.y;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class l
extends k5 {
    private static final String[] f = new String[]{"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    private static final String[] g = new String[]{"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] h = new String[]{"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;"};
    private static final String[] i = new String[]{"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] j = new String[]{"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] k = new String[]{"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] l = new String[]{"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] m = new String[]{"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private static final String[] n = new String[]{"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    private static final String[] o = new String[]{"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};
    private final q d;
    private final e5 e = new e5(this.b());

    l(q5 q52) {
        super(q52);
        this.d = new q(this, this.a(), "google_app_measurement.db");
    }

    private final boolean B0(String string, List<Integer> object) {
        Comparable<Integer> comparable;
        long l8;
        ax.M5.p.f(string);
        this.u();
        this.n();
        SQLiteDatabase sQLiteDatabase = this.B();
        try {
            l8 = this.y0("select count(1) from audience_filter_values where app_id=?", new String[]{string});
        }
        catch (SQLiteException sQLiteException) {
            this.k().G().c("Database error querying filters. appId", V1.v(string), (Object)sQLiteException);
            return false;
        }
        int n8 = Math.max(0, Math.min(2000, this.d().v(string, F.G)));
        if (l8 <= (long)n8) {
            return false;
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i8 = 0; i8 < object.size(); ++i8) {
            comparable = object.get(i8);
            if (comparable == null) {
                return false;
            }
            arrayList.add(Integer.toString((Integer)comparable));
        }
        object = TextUtils.join((CharSequence)",", arrayList);
        comparable = new StringBuilder("(");
        ((StringBuilder)comparable).append((String)object);
        ((StringBuilder)comparable).append(")");
        object = ((StringBuilder)comparable).toString();
        comparable = new StringBuilder("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
        ((StringBuilder)comparable).append((String)object);
        ((StringBuilder)comparable).append(" order by rowid desc limit -1 offset ?)");
        return sQLiteDatabase.delete("audience_filter_values", ((StringBuilder)comparable).toString(), new String[]{string, Integer.toString(n8)}) > 0;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final y E0(String object, String string, String object2) {
        block23: {
            block25: {
                y y8;
                SQLiteDatabase sQLiteDatabase;
                Long l8;
                block22: {
                    boolean bl;
                    boolean bl2;
                    Serializable serializable;
                    block21: {
                        ax.M5.p.f(string);
                        ax.M5.p.f((String)object2);
                        this.n();
                        this.u();
                        serializable = new ArrayList<String>(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count"));
                        l8 = null;
                        sQLiteDatabase = this.B();
                        bl2 = false;
                        sQLiteDatabase = sQLiteDatabase.query((String)object, serializable.toArray(new String[0]), "app_id=? and name=?", new String[]{string, object2}, null, null, null);
                        object = sQLiteDatabase;
                        bl = sQLiteDatabase.moveToFirst();
                        if (bl) break block21;
                        sQLiteDatabase.close();
                        return null;
                    }
                    object = sQLiteDatabase;
                    try {
                        Boolean bl3;
                        Long l9;
                        long l10;
                        long l11 = sQLiteDatabase.getLong(0);
                        object = sQLiteDatabase;
                        long l12 = sQLiteDatabase.getLong(1);
                        object = sQLiteDatabase;
                        long l13 = sQLiteDatabase.getLong(2);
                        object = sQLiteDatabase;
                        bl = sQLiteDatabase.isNull(3);
                        long l14 = 0L;
                        if (bl) {
                            l10 = 0L;
                        } else {
                            object = sQLiteDatabase;
                            l10 = sQLiteDatabase.getLong(3);
                        }
                        object = sQLiteDatabase;
                        if (sQLiteDatabase.isNull(4)) {
                            l8 = null;
                        } else {
                            object = sQLiteDatabase;
                            l8 = sQLiteDatabase.getLong(4);
                        }
                        object = sQLiteDatabase;
                        if (sQLiteDatabase.isNull(5)) {
                            serializable = null;
                        } else {
                            object = sQLiteDatabase;
                            serializable = sQLiteDatabase.getLong(5);
                        }
                        object = sQLiteDatabase;
                        if (sQLiteDatabase.isNull(6)) {
                            l9 = null;
                        } else {
                            object = sQLiteDatabase;
                            l9 = sQLiteDatabase.getLong(6);
                        }
                        object = sQLiteDatabase;
                        if (!sQLiteDatabase.isNull(7)) {
                            object = sQLiteDatabase;
                            if (sQLiteDatabase.getLong(7) == 1L) {
                                bl2 = true;
                            }
                            object = sQLiteDatabase;
                            bl3 = bl2;
                        } else {
                            bl3 = null;
                        }
                        object = sQLiteDatabase;
                        if (!sQLiteDatabase.isNull(8)) {
                            object = sQLiteDatabase;
                            l14 = sQLiteDatabase.getLong(8);
                        }
                        object = sQLiteDatabase;
                        object = sQLiteDatabase;
                        y8 = new y(string, (String)object2, l11, l12, l14, l13, l10, l8, (Long)serializable, l9, bl3);
                        object = sQLiteDatabase;
                        if (!sQLiteDatabase.moveToNext()) break block22;
                        object = sQLiteDatabase;
                        this.k().G().b("Got multiple records for event aggregates, expected one. appId", V1.v(string));
                    }
                    catch (Throwable throwable) {
                        object2 = object;
                        object = throwable;
                        break block23;
                    }
                    catch (SQLiteException sQLiteException) {}
                }
                sQLiteDatabase.close();
                return y8;
                catch (Throwable throwable) {
                    object2 = l8;
                    break block23;
                }
                catch (SQLiteException sQLiteException) {
                    sQLiteDatabase = null;
                }
                object = sQLiteDatabase;
                {
                    Object var17_10;
                    this.k().G().d("Error querying events. appId", V1.v(string), this.g().c((String)object2), var17_10);
                    if (sQLiteDatabase == null) break block25;
                }
                sQLiteDatabase.close();
            }
            return null;
        }
        if (object2 != null) {
            object2.close();
        }
        throw object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final long G(String string, String[] cursor, long l8) {
        Throwable throwable2;
        Cursor cursor2;
        block6: {
            SQLiteException sQLiteException2;
            Cursor cursor3;
            block7: {
                block5: {
                    SQLiteDatabase sQLiteDatabase = this.B();
                    cursor3 = null;
                    cursor2 = null;
                    try {
                        cursor2 = cursor = sQLiteDatabase.rawQuery(string, (String[])cursor);
                        cursor3 = cursor;
                        if (!cursor.moveToFirst()) break block5;
                        cursor2 = cursor;
                        cursor3 = cursor;
                        l8 = cursor.getLong(0);
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    catch (SQLiteException sQLiteException2) {
                        break block7;
                    }
                    cursor.close();
                    return l8;
                }
                cursor.close();
                return l8;
            }
            cursor2 = cursor3;
            {
                this.k().G().c("Database error", string, (Object)sQLiteException2);
                cursor2 = cursor3;
                throw sQLiteException2;
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
        throw throwable2;
    }

    static /* synthetic */ h3 K(Cursor cursor) {
        return h3.i(cursor.getString(0), cursor.getInt(1));
    }

    static /* bridge */ /* synthetic */ e5 L(l l8) {
        return l8.e;
    }

    private final Object M(Cursor cursor, int n8) {
        int n9 = cursor.getType(n8);
        if (n9 != 0) {
            if (n9 != 1) {
                if (n9 != 2) {
                    if (n9 != 3) {
                        if (n9 != 4) {
                            this.k().G().b("Loaded invalid unknown value type, ignoring it", n9);
                            return null;
                        }
                        this.k().G().a("Loaded invalid blob type value, ignoring it");
                        return null;
                    }
                    return cursor.getString(n8);
                }
                return cursor.getDouble(n8);
            }
            return cursor.getLong(n8);
        }
        this.k().G().a("Loaded invalid null value from database");
        return null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final <T> T N(String string, String[] cursor, r<T> r8) {
        RuntimeException var2_5;
        block12: {
            block14: {
                block13: {
                    block11: {
                        Object var4_10 = null;
                        cursor = this.B().rawQuery(string, (String[])cursor);
                        string = cursor;
                        try {}
                        catch (SQLiteException sQLiteException) {}
                        finally {
                            break block11;
                        }
                        catch (Throwable throwable) {
                            string = var4_10;
                            break block12;
                        }
                        catch (SQLiteException sQLiteException) {
                            cursor = null;
                            break block13;
                        }
                    }
                    if (!cursor.moveToFirst()) {
                        string = cursor;
                        this.k().K().a("No data found");
                        cursor.close();
                        return null;
                    }
                    string = cursor;
                    {
                        r8 = r8.a(cursor);
                    }
                    cursor.close();
                    return (T)r8;
                }
                string = cursor;
                {
                    Object var3_9;
                    this.k().G().b("Error querying database.", var3_9);
                    if (cursor == null) break block14;
                }
                cursor.close();
            }
            return null;
        }
        if (string != null) {
            string.close();
        }
        throw var2_5;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final String P(String string, String[] cursor, String string2) {
        Throwable throwable2;
        Cursor cursor2;
        block6: {
            SQLiteException sQLiteException2;
            Cursor cursor3;
            block7: {
                block5: {
                    SQLiteDatabase sQLiteDatabase = this.B();
                    cursor3 = null;
                    cursor2 = null;
                    try {
                        cursor2 = cursor = sQLiteDatabase.rawQuery(string, (String[])cursor);
                        cursor3 = cursor;
                        if (!cursor.moveToFirst()) break block5;
                        cursor2 = cursor;
                        cursor3 = cursor;
                        string2 = cursor.getString(0);
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    catch (SQLiteException sQLiteException2) {
                        break block7;
                    }
                    cursor.close();
                    return string2;
                }
                cursor.close();
                return string2;
            }
            cursor2 = cursor3;
            {
                this.k().G().c("Database error", string, (Object)sQLiteException2);
                cursor2 = cursor3;
                throw sQLiteException2;
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
        throw throwable2;
    }

    private final void Q0(String string, String string2) {
        ax.M5.p.f(string2);
        this.n();
        this.u();
        try {
            this.B().delete(string, "app_id=?", new String[]{string2});
            return;
        }
        catch (SQLiteException sQLiteException) {
            this.k().G().c("Error deleting snapshot. appId", V1.v(string2), (Object)sQLiteException);
            return;
        }
    }

    private static void T(ContentValues contentValues, String string, Object object) {
        ax.M5.p.f(string);
        ax.M5.p.l(object);
        if (object instanceof String) {
            contentValues.put(string, (String)object);
            return;
        }
        if (object instanceof Long) {
            contentValues.put(string, (Long)object);
            return;
        }
        if (object instanceof Double) {
            contentValues.put(string, (Double)object);
            return;
        }
        throw new IllegalArgumentException("Invalid value type");
    }

    private final void X(String string, y y8) {
        SQLiteException sQLiteException2;
        block3: {
            ax.M5.p.l(y8);
            this.n();
            this.u();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", y8.a);
            contentValues.put("name", y8.b);
            contentValues.put("lifetime_count", Long.valueOf(y8.c));
            contentValues.put("current_bundle_count", Long.valueOf(y8.d));
            contentValues.put("last_fire_timestamp", Long.valueOf(y8.f));
            contentValues.put("last_bundled_timestamp", Long.valueOf(y8.g));
            contentValues.put("last_bundled_day", y8.h);
            contentValues.put("last_sampled_complex_event_id", y8.i);
            contentValues.put("last_sampling_rate", y8.j);
            contentValues.put("current_session_count", Long.valueOf(y8.e));
            Comparable<Boolean> comparable = y8.k;
            comparable = comparable != null && comparable != false ? Long.valueOf(1L) : null;
            contentValues.put("last_exempt_from_sampling", (Long)comparable);
            try {
                if (this.B().insertWithOnConflict(string, null, contentValues, 5) == -1L) {
                    this.k().G().b("Failed to insert/update event aggregates (got -1). appId", V1.v(y8.a));
                    return;
                }
            }
            catch (SQLiteException sQLiteException2) {
                break block3;
            }
            return;
        }
        this.k().G().c("Error storing event aggregates. appId", V1.v(y8.a), (Object)sQLiteException2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void Z(String string, String string2, ContentValues contentValues) {
        SQLiteException sQLiteException2;
        block4: {
            String string3;
            SQLiteDatabase sQLiteDatabase;
            try {
                sQLiteDatabase = this.B();
                string3 = contentValues.getAsString(string2);
                if (string3 == null) {
                    this.k().H().b("Value of the primary key is not set.", V1.v(string2));
                    return;
                }
            }
            catch (SQLiteException sQLiteException2) {
                break block4;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append(" = ?");
            if ((long)sQLiteDatabase.update(string, contentValues, stringBuilder.toString(), new String[]{string3}) == 0L && sQLiteDatabase.insertWithOnConflict(string, null, contentValues, 5) == -1L) {
                this.k().G().c("Failed to insert/update table (got -1). key", V1.v(string), V1.v(string2));
            }
            return;
        }
        this.k().G().d("Error storing into table. key", V1.v(string), V1.v(string2), (Object)sQLiteException2);
    }

    private final boolean g0(String object, int n8, B1 object2) {
        SQLiteException sQLiteException2;
        block5: {
            block4: {
                this.u();
                this.n();
                ax.M5.p.f((String)object);
                ax.M5.p.l(object2);
                boolean bl = ((B1)object2).R().isEmpty();
                Integer n9 = null;
                if (bl) {
                    X1 x12 = this.k().L();
                    Object object3 = V1.v((String)object);
                    object = n9;
                    if (((B1)object2).Y()) {
                        object = ((B1)object2).N();
                    }
                    x12.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", object3, n8, String.valueOf(object));
                    return false;
                }
                byte[] byArray = ((q3)object2).l();
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", (String)object);
                contentValues.put("audience_id", Integer.valueOf(n8));
                n9 = ((B1)object2).Y() ? Integer.valueOf(((B1)object2).N()) : null;
                contentValues.put("filter_id", n9);
                contentValues.put("event_name", ((B1)object2).R());
                object2 = ((B1)object2).Z() ? Boolean.valueOf(((B1)object2).V()) : null;
                contentValues.put("session_scoped", (Boolean)object2);
                contentValues.put("data", byArray);
                try {
                    if (this.B().insertWithOnConflict("event_filters", null, contentValues, 5) != -1L) break block4;
                    this.k().G().b("Failed to insert event filter (got -1). appId", V1.v((String)object));
                }
                catch (SQLiteException sQLiteException2) {
                    break block5;
                }
            }
            return true;
        }
        this.k().G().c("Error storing event filter. appId", V1.v((String)object), (Object)sQLiteException2);
        return false;
    }

    private final boolean h0(String object, int n8, E1 object2) {
        SQLiteException sQLiteException2;
        block5: {
            this.u();
            this.n();
            ax.M5.p.f((String)object);
            ax.M5.p.l(object2);
            boolean bl = ((E1)object2).N().isEmpty();
            Integer n9 = null;
            if (bl) {
                X1 x12 = this.k().L();
                Object object3 = V1.v((String)object);
                object = n9;
                if (((E1)object2).R()) {
                    object = ((E1)object2).n();
                }
                x12.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", object3, n8, String.valueOf(object));
                return false;
            }
            byte[] byArray = ((q3)object2).l();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", (String)object);
            contentValues.put("audience_id", Integer.valueOf(n8));
            n9 = ((E1)object2).R() ? Integer.valueOf(((E1)object2).n()) : null;
            contentValues.put("filter_id", n9);
            contentValues.put("property_name", ((E1)object2).N());
            object2 = ((E1)object2).S() ? Boolean.valueOf(((E1)object2).Q()) : null;
            contentValues.put("session_scoped", (Boolean)object2);
            contentValues.put("data", byArray);
            try {
                if (this.B().insertWithOnConflict("property_filters", null, contentValues, 5) == -1L) {
                    this.k().G().b("Failed to insert property filter (got -1). appId", V1.v((String)object));
                    return false;
                }
            }
            catch (SQLiteException sQLiteException2) {
                break block5;
            }
            return true;
        }
        this.k().G().c("Error storing property filter. appId", V1.v((String)object), (Object)sQLiteException2);
        return false;
    }

    static /* bridge */ /* synthetic */ String[] m0() {
        return m;
    }

    static /* bridge */ /* synthetic */ String[] n0() {
        return h;
    }

    static /* bridge */ /* synthetic */ String[] o0() {
        return n;
    }

    static /* bridge */ /* synthetic */ String[] p0() {
        return f;
    }

    static /* bridge */ /* synthetic */ String[] q0() {
        return k;
    }

    static /* bridge */ /* synthetic */ String[] r0() {
        return l;
    }

    static /* bridge */ /* synthetic */ String[] s0() {
        return j;
    }

    static /* bridge */ /* synthetic */ String[] t0() {
        return i;
    }

    static /* bridge */ /* synthetic */ String[] u0() {
        return o;
    }

    static /* bridge */ /* synthetic */ String[] v0() {
        return g;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final long y0(String string, String[] cursor) {
        Throwable throwable2222;
        Cursor cursor2;
        block8: {
            SQLiteException sQLiteException2;
            Cursor cursor3;
            block7: {
                Object object;
                block6: {
                    long l8;
                    object = this.B();
                    cursor3 = null;
                    cursor2 = null;
                    try {
                        cursor2 = cursor = object.rawQuery(string, (String[])cursor);
                        cursor3 = cursor;
                        if (!cursor.moveToFirst()) break block6;
                        cursor2 = cursor;
                        cursor3 = cursor;
                        l8 = cursor.getLong(0);
                    }
                    catch (SQLiteException sQLiteException2) {
                        break block7;
                    }
                    cursor.close();
                    return l8;
                    catch (Throwable throwable2222) {
                        break block8;
                    }
                }
                cursor2 = cursor;
                cursor3 = cursor;
                {
                    cursor2 = cursor;
                    cursor3 = cursor;
                    object = new SQLiteException("Database returned empty set");
                    cursor2 = cursor;
                    cursor3 = cursor;
                    throw object;
                }
            }
            cursor2 = cursor3;
            this.k().G().c("Database error", string, (Object)sQLiteException2);
            cursor2 = cursor3;
            throw sQLiteException2;
        }
        if (cursor2 != null) {
            cursor2.close();
        }
        throw throwable2222;
    }

    public final long A() {
        return this.G("select max(timestamp) from raw_events", null, 0L);
    }

    public final void A0(String string, h3 h32) {
        ax.M5.p.l(string);
        ax.M5.p.l(h32);
        this.n();
        this.u();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", string);
        contentValues.put("consent_state", h32.z());
        contentValues.put("consent_source", Integer.valueOf(h32.b()));
        this.Z("consent_settings", "app_id", contentValues);
    }

    final SQLiteDatabase B() {
        this.n();
        try {
            SQLiteDatabase sQLiteDatabase = this.d.getWritableDatabase();
            return sQLiteDatabase;
        }
        catch (SQLiteException sQLiteException) {
            this.k().L().b("Error opening database", (Object)sQLiteException);
            throw sQLiteException;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String C() {
        RuntimeException var2_5;
        SQLiteDatabase sQLiteDatabase;
        block11: {
            block13: {
                Cursor cursor;
                block12: {
                    block10: {
                        sQLiteDatabase = this.B();
                        cursor = sQLiteDatabase.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                        sQLiteDatabase = cursor;
                        try {}
                        catch (SQLiteException sQLiteException) {}
                        finally {
                            break block10;
                        }
                        catch (Throwable throwable) {
                            sQLiteDatabase = null;
                            break block11;
                        }
                        catch (SQLiteException sQLiteException) {
                            cursor = null;
                            break block12;
                        }
                    }
                    if (cursor.moveToFirst()) {
                        sQLiteDatabase = cursor;
                        String string = cursor.getString(0);
                        cursor.close();
                        return string;
                    }
                    cursor.close();
                    return null;
                }
                sQLiteDatabase = cursor;
                {
                    Object var3_9;
                    this.k().G().b("Database error getting next bundle app id", var3_9);
                    if (cursor == null) break block13;
                }
                cursor.close();
            }
            return null;
        }
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
        }
        throw var2_5;
    }

    public final long C0(String string) {
        ax.M5.p.f(string);
        return this.G("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{string}, 0L);
    }

    public final int D(String string, String string2) {
        ax.M5.p.f(string);
        ax.M5.p.f(string2);
        this.n();
        this.u();
        try {
            int n8 = this.B().delete("conditional_properties", "app_id=? and name=?", new String[]{string, string2});
            return n8;
        }
        catch (SQLiteException sQLiteException) {
            this.k().G().d("Error deleting conditional property", V1.v(string), this.g().g(string2), (Object)sQLiteException);
            return 0;
        }
    }

    /*
     * Exception decompiling
     */
    public final f D0(String var1_1, String var2_5) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [7, 6 : 197->206)] java.lang.Throwable
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

    public final long E(e2 e22) throws IOException {
        this.n();
        this.u();
        ax.M5.p.l(e22);
        ax.M5.p.f(e22.P3());
        byte[] byArray = e22.l();
        long l8 = this.o().A(byArray);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", e22.P3());
        contentValues.put("metadata_fingerprint", Long.valueOf(l8));
        contentValues.put("metadata", byArray);
        try {
            this.B().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return l8;
        }
        catch (SQLiteException sQLiteException) {
            this.k().G().c("Error storing raw event metadata. appId", V1.v(e22.P3()), (Object)sQLiteException);
            throw sQLiteException;
        }
    }

    public final long F(String string) {
        int n8;
        ax.M5.p.f(string);
        this.n();
        this.u();
        try {
            n8 = this.B().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{string, String.valueOf(Math.max(0, Math.min(1000000, this.d().v(string, F.q))))});
        }
        catch (SQLiteException sQLiteException) {
            this.k().G().c("Error deleting over the limit events. appId", V1.v(string), (Object)sQLiteException);
            return 0L;
        }
        return n8;
    }

    /*
     * Exception decompiling
     */
    public final Bundle F0(String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [7, 6 : 77->86)] java.lang.Throwable
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

    public final y G0(String string, String string2) {
        return this.E0("events", string, string2);
    }

    /*
     * Exception decompiling
     */
    public final Pair<ax.b6.Z1, Long> H(String var1_1, Long var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [7, 6 : 96->106)] java.lang.Throwable
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
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Z1 H0(String var1_1) {
        block47: {
            block50: {
                block48: {
                    block49: {
                        ax.M5.p.f(var1_1);
                        this.n();
                        this.u();
                        var6_5 = null;
                        var6_5 = var7_6 = this.B().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info"}, "app_id=?", new String[]{var1_1}, null, null, null);
                        ** try [egrp 1[TRYBLOCK] [3, 2 : 314->323)] { 
lbl-1000:
                        // 1 sources

                        {
                            catch (SQLiteException var8_10) {}
                        }
lbl10:
                        // 1 sources

                        finally {
                            ** GOTO lbl17
                        }
                        {
                            block58: {
                                block57: {
                                    block56: {
                                        block55: {
                                            block54: {
                                                block53: {
                                                    block52: {
                                                        block51: {
                                                            catch (Throwable var1_3) {
                                                                break block47;
                                                            }
                                                            catch (SQLiteException var8_12) {
                                                                var7_6 = null;
                                                                break block48;
                                                            }
lbl17:
                                                            // 1 sources

                                                            var4_7 = var7_6.moveToFirst();
                                                            if (!var4_7) {
                                                                var7_6.close();
                                                                return null;
                                                            }
                                                            var6_5 = var7_6;
                                                            var6_5 = var7_6;
                                                            var10_8 = new Z1(this.b.o0(), var1_1);
                                                            var6_5 = var7_6;
                                                            var4_7 = m6.a();
                                                            var5_9 = false;
                                                            if (!var4_7) break block51;
                                                            var6_5 = var7_6;
                                                            if (!this.d().t(F.W0)) break block51;
                                                            var6_5 = var7_6;
                                                            if (!this.b.S(var1_1).m(h3.a.d0)) break block52;
                                                        }
                                                        var6_5 = var7_6;
                                                        var10_8.J(var7_6.getString(0));
                                                    }
                                                    var6_5 = var7_6;
                                                    var10_8.Z(var7_6.getString(1));
                                                    var6_5 = var7_6;
                                                    if (!m6.a()) break block53;
                                                    var6_5 = var7_6;
                                                    if (!this.d().t(F.W0)) break block53;
                                                    var6_5 = var7_6;
                                                    if (!this.b.S(var1_1).m(h3.a.c0)) break block54;
                                                }
                                                var6_5 = var7_6;
                                                var10_8.f0(var7_6.getString(2));
                                            }
                                            var6_5 = var7_6;
                                            var10_8.A0(var7_6.getLong(3));
                                            var6_5 = var7_6;
                                            var10_8.C0(var7_6.getLong(4));
                                            var6_5 = var7_6;
                                            var10_8.y0(var7_6.getLong(5));
                                            var6_5 = var7_6;
                                            var10_8.S(var7_6.getString(6));
                                            var6_5 = var7_6;
                                            var10_8.O(var7_6.getString(7));
                                            var6_5 = var7_6;
                                            var10_8.u0(var7_6.getLong(8));
                                            var6_5 = var7_6;
                                            var10_8.n0(var7_6.getLong(9));
                                            var6_5 = var7_6;
                                            if (var7_6.isNull(10)) ** GOTO lbl-1000
                                            var6_5 = var7_6;
                                            if (var7_6.getInt(10) == 0) {
                                                var4_7 = false;
                                            } else lbl-1000:
                                            // 2 sources

                                            {
                                                var4_7 = true;
                                            }
                                            var6_5 = var7_6;
                                            var10_8.K(var4_7);
                                            var6_5 = var7_6;
                                            var10_8.k0(var7_6.getLong(11));
                                            var6_5 = var7_6;
                                            var10_8.e0(var7_6.getLong(12));
                                            var6_5 = var7_6;
                                            var10_8.b0(var7_6.getLong(13));
                                            var6_5 = var7_6;
                                            var10_8.V(var7_6.getLong(14));
                                            var6_5 = var7_6;
                                            var10_8.R(var7_6.getLong(15));
                                            var6_5 = var7_6;
                                            var10_8.s0(var7_6.getLong(16));
                                            var6_5 = var7_6;
                                            if (var7_6.isNull(17)) {
                                                var2_14 = -2147483648L;
                                            } else {
                                                var6_5 = var7_6;
                                                var2_14 = var7_6.getInt(17);
                                            }
                                            var6_5 = var7_6;
                                            var10_8.H(var2_14);
                                            var6_5 = var7_6;
                                            var10_8.W(var7_6.getString(18));
                                            var6_5 = var7_6;
                                            var10_8.Y(var7_6.getLong(19));
                                            var6_5 = var7_6;
                                            var10_8.h0(var7_6.getLong(20));
                                            var6_5 = var7_6;
                                            var10_8.c0(var7_6.getString(21));
                                            var6_5 = var7_6;
                                            if (var7_6.isNull(23)) ** GOTO lbl-1000
                                            var6_5 = var7_6;
                                            if (var7_6.getInt(23) == 0) {
                                                var4_7 = false;
                                            } else lbl-1000:
                                            // 2 sources

                                            {
                                                var4_7 = true;
                                            }
                                            var6_5 = var7_6;
                                            var10_8.h(var4_7);
                                            var6_5 = var7_6;
                                            var10_8.f(var7_6.getString(24));
                                            var6_5 = var7_6;
                                            if (var7_6.isNull(25)) {
                                                var2_14 = 0L;
                                            } else {
                                                var6_5 = var7_6;
                                                var2_14 = var7_6.getLong(25);
                                            }
                                            var6_5 = var7_6;
                                            var10_8.q0(var2_14);
                                            var6_5 = var7_6;
                                            if (!var7_6.isNull(26)) {
                                                var6_5 = var7_6;
                                                var10_8.g(Arrays.asList(var7_6.getString(26).split(",", -1)));
                                            }
                                            var6_5 = var7_6;
                                            if (!m6.a()) break block55;
                                            var6_5 = var7_6;
                                            if (!this.d().t(F.W0)) break block55;
                                            var6_5 = var7_6;
                                            if (!this.b.S(var1_1).m(h3.a.d0)) break block56;
                                        }
                                        var6_5 = var7_6;
                                        var10_8.l0(var7_6.getString(28));
                                    }
                                    var6_5 = var7_6;
                                    if (!r7.a()) break block57;
                                    var6_5 = var7_6;
                                    if (!this.d().t(F.t0)) break block57;
                                    var6_5 = var7_6;
                                    this.i();
                                    var6_5 = var7_6;
                                    if (!B5.H0(var1_1)) break block57;
                                    var6_5 = var7_6;
                                    if (var7_6.isNull(29)) ** GOTO lbl-1000
                                    var6_5 = var7_6;
                                    if (var7_6.getInt(29) != 0) {
                                        var4_7 = true;
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        var4_7 = false;
                                    }
                                    var6_5 = var7_6;
                                    var10_8.P(var4_7);
                                    var6_5 = var7_6;
                                    var10_8.w0(var7_6.getLong(39));
                                    var6_5 = var7_6;
                                    if (this.d().t(F.u0)) {
                                        var6_5 = var7_6;
                                        var10_8.o0(var7_6.getString(36));
                                    }
                                }
                                var6_5 = var7_6;
                                var10_8.G0(var7_6.getLong(30));
                                var6_5 = var7_6;
                                var10_8.E0(var7_6.getLong(31));
                                var6_5 = var7_6;
                                if (k7.a()) {
                                    var6_5 = var7_6;
                                    if (this.d().E(var1_1, F.A0)) {
                                        var6_5 = var7_6;
                                        var10_8.b(var7_6.getInt(32));
                                        var6_5 = var7_6;
                                        var10_8.N(var7_6.getLong(35));
                                    }
                                }
                                var6_5 = var7_6;
                                if (!n6.a()) break block58;
                                var6_5 = var7_6;
                                if (!this.d().E(var1_1, F.L0)) break block58;
                                var6_5 = var7_6;
                                if (var7_6.isNull(33)) ** GOTO lbl-1000
                                var6_5 = var7_6;
                                if (var7_6.getInt(33) != 0) {
                                    var4_7 = true;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var4_7 = false;
                                }
                                var6_5 = var7_6;
                                var10_8.T(var4_7);
                            }
                            var6_5 = var7_6;
                            if (var7_6.isNull(34)) {
                                var8_11 = null;
                            } else {
                                var6_5 = var7_6;
                                var4_7 = var5_9;
                                if (var7_6.getInt(34) != 0) {
                                    var4_7 = true;
                                }
                                var6_5 = var7_6;
                                var8_11 = var4_7;
                            }
                            var6_5 = var7_6;
                            var10_8.d((Boolean)var8_11);
                            var6_5 = var7_6;
                            var10_8.M(var7_6.getInt(37));
                            var6_5 = var7_6;
                            var10_8.G(var7_6.getInt(38));
                            var6_5 = var7_6;
                            if (g6.a()) {
                                var6_5 = var7_6;
                                if (this.d().E(var1_1, F.Q0)) {
                                    var6_5 = var7_6;
                                    var9_15 = var7_6.getString(40);
                                    var8_11 = var9_15;
                                    if (var9_15 == null) {
                                        var8_11 = "";
                                    }
                                    var6_5 = var7_6;
                                    var10_8.i0((String)var8_11);
                                }
                            }
                            var6_5 = var7_6;
                            if (this.d().t(F.T0)) {
                                var6_5 = var7_6;
                                if (!var7_6.isNull(41)) {
                                    var6_5 = var7_6;
                                    var10_8.e(var7_6.getLong(41));
                                }
                                var6_5 = var7_6;
                                if (!var7_6.isNull(42)) {
                                    var6_5 = var7_6;
                                    var10_8.I(var7_6.getLong(42));
                                }
                            }
                            var6_5 = var7_6;
                            if (M6.a()) {
                                var6_5 = var7_6;
                                if (this.d().E(var1_1, F.N0)) {
                                    var6_5 = var7_6;
                                    var10_8.i(var7_6.getBlob(43));
                                }
                            }
                            var6_5 = var7_6;
                            var10_8.x();
                            var6_5 = var7_6;
                            if (!var7_6.moveToNext()) break block49;
                            var6_5 = var7_6;
                            this.k().G().b("Got multiple records for app, expected one. appId", V1.v(var1_1));
                        }
                    }
                    var7_6.close();
                    return var10_8;
                }
                var6_5 = var7_6;
                {
                    this.k().G().c("Error querying app. appId", V1.v(var1_1), var8_13);
                    if (var7_6 == null) break block50;
                }
                var7_6.close();
            }
            return null;
        }
        if (var6_5 != null) {
            var6_5.close();
        }
        throw var1_4;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final p I(long l8, String string, long l9, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6) {
        Throwable throwable2;
        Cursor cursor;
        block14: {
            p p8;
            block16: {
                SQLiteException sQLiteException2;
                Cursor cursor2;
                block15: {
                    SQLiteDatabase sQLiteDatabase;
                    Cursor cursor3;
                    Cursor cursor4;
                    block13: {
                        ax.M5.p.f(string);
                        this.n();
                        this.u();
                        p8 = new p();
                        cursor4 = null;
                        cursor = cursor3 = null;
                        cursor2 = cursor4;
                        try {
                            sQLiteDatabase = this.B();
                            cursor = cursor3;
                            cursor2 = cursor4;
                            cursor = cursor3 = sQLiteDatabase.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count"}, "app_id=?", new String[]{string}, null, null, null);
                            cursor2 = cursor3;
                            if (cursor3.moveToFirst()) break block13;
                            cursor = cursor3;
                            cursor2 = cursor3;
                            this.k().L().b("Not updating daily counts, app is not known. appId", V1.v(string));
                        }
                        catch (Throwable throwable2) {
                            break block14;
                        }
                        catch (SQLiteException sQLiteException2) {
                            break block15;
                        }
                        cursor3.close();
                        return p8;
                    }
                    cursor = cursor3;
                    cursor2 = cursor3;
                    {
                        if (cursor3.getLong(0) == l8) {
                            cursor = cursor3;
                            cursor2 = cursor3;
                            p8.b = cursor3.getLong(1);
                            cursor = cursor3;
                            cursor2 = cursor3;
                            p8.a = cursor3.getLong(2);
                            cursor = cursor3;
                            cursor2 = cursor3;
                            p8.c = cursor3.getLong(3);
                            cursor = cursor3;
                            cursor2 = cursor3;
                            p8.d = cursor3.getLong(4);
                            cursor = cursor3;
                            cursor2 = cursor3;
                            p8.e = cursor3.getLong(5);
                            cursor = cursor3;
                            cursor2 = cursor3;
                            p8.f = cursor3.getLong(6);
                        }
                        if (bl) {
                            cursor = cursor3;
                            cursor2 = cursor3;
                            p8.b += l9;
                        }
                        if (bl2) {
                            cursor = cursor3;
                            cursor2 = cursor3;
                            p8.a += l9;
                        }
                        if (bl3) {
                            cursor = cursor3;
                            cursor2 = cursor3;
                            p8.c += l9;
                        }
                        if (bl4) {
                            cursor = cursor3;
                            cursor2 = cursor3;
                            p8.d += l9;
                        }
                        if (bl5) {
                            cursor = cursor3;
                            cursor2 = cursor3;
                            p8.e += l9;
                        }
                        if (bl6) {
                            cursor = cursor3;
                            cursor2 = cursor3;
                            p8.f += l9;
                        }
                        cursor = cursor3;
                        cursor2 = cursor3;
                        cursor = cursor3;
                        cursor2 = cursor3;
                        cursor4 = new ContentValues();
                        cursor = cursor3;
                        cursor2 = cursor3;
                        cursor4.put("day", Long.valueOf(l8));
                        cursor = cursor3;
                        cursor2 = cursor3;
                        cursor4.put("daily_public_events_count", Long.valueOf(p8.a));
                        cursor = cursor3;
                        cursor2 = cursor3;
                        cursor4.put("daily_events_count", Long.valueOf(p8.b));
                        cursor = cursor3;
                        cursor2 = cursor3;
                        cursor4.put("daily_conversions_count", Long.valueOf(p8.c));
                        cursor = cursor3;
                        cursor2 = cursor3;
                        cursor4.put("daily_error_events_count", Long.valueOf(p8.d));
                        cursor = cursor3;
                        cursor2 = cursor3;
                        cursor4.put("daily_realtime_events_count", Long.valueOf(p8.e));
                        cursor = cursor3;
                        cursor2 = cursor3;
                        cursor4.put("daily_realtime_dcu_count", Long.valueOf(p8.f));
                        cursor = cursor3;
                        cursor2 = cursor3;
                        sQLiteDatabase.update("apps", (ContentValues)cursor4, "app_id=?", new String[]{string});
                    }
                    cursor3.close();
                    return p8;
                }
                cursor = cursor2;
                {
                    this.k().G().c("Error updating daily counts. appId", V1.v(string), (Object)sQLiteException2);
                    if (cursor2 == null) break block16;
                }
                cursor2.close();
            }
            return p8;
        }
        if (cursor != null) {
            cursor.close();
        }
        throw throwable2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final C5 I0(String var1_1, String var2_2) {
        block19: {
            block18: {
                block17: {
                    block16: {
                        block15: {
                            ax.M5.p.f(var1_1);
                            ax.M5.p.f(var2_2);
                            this.n();
                            this.u();
                            var6_6 = null;
                            var6_6 = var7_9 = this.B().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{var1_1, var2_2}, null, null, null);
                            var3_10 = var7_9.moveToFirst();
                            if (var3_10) break block15;
                            var7_9.close();
                            return null;
                        }
                        var6_6 = var7_9;
                        var4_11 = var7_9.getLong(0);
                        var6_6 = var7_9;
                        var10_12 = this.M(var7_9, 1);
                        if (var10_12 != null) break block16;
                        var7_9.close();
                        return null;
                    }
                    var6_6 = var7_9;
                    try {
                        var9_13 = var7_9.getString(2);
                        var6_6 = var7_9;
                        var6_6 = var7_9;
                        var8_14 /* !! */  = new C5(var1_1, var9_13, var2_2, var4_11, var10_12);
                        var6_6 = var7_9;
                        if (!var7_9.moveToNext()) break block17;
                        var6_6 = var7_9;
                        this.k().G().b("Got multiple records for user property, expected one. appId", V1.v(var1_1));
                        break block17;
                    }
                    catch (Throwable var2_3) {
                        var1_1 = var6_6;
                    }
lbl40:
                    // 2 sources

                    while (true) {
                        if (var1_1 != null) {
                            var1_1.close();
                        }
                        throw var2_5;
                    }
                    catch (SQLiteException var6_7) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var8_14 /* !! */  = var6_6;
                            break block18;
                            break;
                        }
                    }
                    catch (SQLiteException var6_8) {
                        ** continue;
                    }
                    catch (Throwable var2_4) {
                        var1_1 = var6_6;
                        ** continue;
                    }
                    catch (SQLiteException var8_15) {
                        var7_9 = null;
                        break block18;
                    }
                }
                var7_9.close();
                return var8_14 /* !! */ ;
            }
            var6_6 = var7_9;
            {
                this.k().G().d("Error querying user property. appId", V1.v(var1_1), this.g().g(var2_2), var8_14 /* !! */ );
                if (var7_9 == null) break block19;
            }
            var7_9.close();
        }
        return null;
    }

    public final p J(long l8, String string, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6) {
        return this.I(l8, string, 1L, false, false, bl3, false, bl5, bl6);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final m J0(String string) {
        RuntimeException var1_4;
        Cursor cursor;
        block14: {
            block17: {
                Cursor cursor2;
                block15: {
                    String string2;
                    String string3;
                    Object object;
                    block16: {
                        block13: {
                            ax.M5.p.f(string);
                            this.n();
                            this.u();
                            cursor = null;
                            cursor = cursor2 = this.B().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{string}, null, null, null);
                            try {}
                            catch (SQLiteException sQLiteException) {}
                            finally {
                                break block13;
                            }
                            catch (Throwable throwable) {
                                break block14;
                            }
                            catch (SQLiteException sQLiteException) {
                                cursor2 = null;
                                break block15;
                            }
                        }
                        boolean bl = cursor2.moveToFirst();
                        if (!bl) {
                            cursor2.close();
                            return null;
                        }
                        cursor = cursor2;
                        {
                            object = cursor2.getBlob(0);
                            cursor = cursor2;
                            string3 = cursor2.getString(1);
                            cursor = cursor2;
                            string2 = cursor2.getString(2);
                            cursor = cursor2;
                            if (!cursor2.moveToNext()) break block16;
                            cursor = cursor2;
                            this.k().G().b("Got multiple records for app config, expected one. appId", V1.v(string));
                        }
                    }
                    if (object == null) {
                        cursor2.close();
                        return null;
                    }
                    cursor = cursor2;
                    {
                        object = new m((byte[])object, string3, string2);
                    }
                    cursor2.close();
                    return object;
                }
                cursor = cursor2;
                {
                    Object var5_11;
                    this.k().G().c("Error querying remote config. appId", V1.v(string), var5_11);
                    if (cursor2 == null) break block17;
                }
                cursor2.close();
            }
            return null;
        }
        if (cursor != null) {
            cursor.close();
        }
        throw var1_4;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final Map<Integer, List<B1>> K0(String object, String string) {
        Throwable throwable2;
        String string2;
        block11: {
            block14: {
                SQLiteException sQLiteException2;
                String string3;
                block12: {
                    Object object2;
                    a<Integer, List<B1>> a8;
                    block10: {
                        this.u();
                        this.n();
                        ax.M5.p.f((String)object);
                        ax.M5.p.f(string);
                        a8 = new a<Integer, List<B1>>();
                        object2 = this.B();
                        string3 = null;
                        string2 = null;
                        try {
                            string2 = string = object2.query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{object, string}, null, null, null);
                            string3 = string;
                            if (string.moveToFirst()) break block10;
                            string2 = string;
                            string3 = string;
                            object2 = Collections.EMPTY_MAP;
                        }
                        catch (Throwable throwable2) {
                            break block11;
                        }
                        catch (SQLiteException sQLiteException2) {
                            break block12;
                        }
                        string.close();
                        return object2;
                    }
                    while (true) {
                        string2 = string;
                        string3 = string;
                        {
                            boolean bl;
                            block13: {
                                B1 b12;
                                object2 = string.getBlob(1);
                                string2 = string;
                                string3 = string;
                                try {
                                    b12 = (B1)((k4)x5.G(B1.O(), (byte[])object2).q());
                                    string2 = string;
                                    string3 = string;
                                }
                                catch (IOException iOException) {
                                    string2 = string;
                                    string3 = string;
                                    this.k().G().c("Failed to merge filter. appId", V1.v((String)object), iOException);
                                    break block13;
                                }
                                int n8 = string.getInt(0);
                                string2 = string;
                                string3 = string;
                                List list = (List)a8.get((Object)n8);
                                object2 = list;
                                if (list == null) {
                                    string2 = string;
                                    string3 = string;
                                    string2 = string;
                                    string3 = string;
                                    object2 = new ArrayList();
                                    string2 = string;
                                    string3 = string;
                                    a8.put(n8, (List<B1>)object2);
                                }
                                string2 = string;
                                string3 = string;
                                object2.add(b12);
                            }
                            string2 = string;
                            string3 = string;
                            if (bl = string.moveToNext()) continue;
                        }
                        break;
                    }
                    string.close();
                    return a8;
                }
                string2 = string3;
                {
                    this.k().G().c("Database error querying filters. appId", V1.v((String)object), (Object)sQLiteException2);
                    string2 = string3;
                    object = Collections.EMPTY_MAP;
                    if (string3 == null) break block14;
                }
                string3.close();
            }
            return object;
        }
        if (string2 != null) {
            string2.close();
        }
        throw throwable2;
    }

    public final u L0(String string) {
        ax.M5.p.l(string);
        this.n();
        this.u();
        return u.d(this.P("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{string}, ""));
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final Map<Integer, List<E1>> M0(String object, String string) {
        Throwable throwable2;
        String string2;
        block11: {
            block14: {
                SQLiteException sQLiteException2;
                String string3;
                block12: {
                    Object object2;
                    a<Integer, List<E1>> a8;
                    block10: {
                        this.u();
                        this.n();
                        ax.M5.p.f((String)object);
                        ax.M5.p.f(string);
                        a8 = new a<Integer, List<E1>>();
                        object2 = this.B();
                        string3 = null;
                        string2 = null;
                        try {
                            string2 = string = object2.query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{object, string}, null, null, null);
                            string3 = string;
                            if (string.moveToFirst()) break block10;
                            string2 = string;
                            string3 = string;
                            object2 = Collections.EMPTY_MAP;
                        }
                        catch (Throwable throwable2) {
                            break block11;
                        }
                        catch (SQLiteException sQLiteException2) {
                            break block12;
                        }
                        string.close();
                        return object2;
                    }
                    while (true) {
                        string2 = string;
                        string3 = string;
                        {
                            boolean bl;
                            block13: {
                                E1 e12;
                                object2 = string.getBlob(1);
                                string2 = string;
                                string3 = string;
                                try {
                                    e12 = (E1)((k4)x5.G(E1.L(), (byte[])object2).q());
                                    string2 = string;
                                    string3 = string;
                                }
                                catch (IOException iOException) {
                                    string2 = string;
                                    string3 = string;
                                    this.k().G().c("Failed to merge filter", V1.v((String)object), iOException);
                                    break block13;
                                }
                                int n8 = string.getInt(0);
                                string2 = string;
                                string3 = string;
                                List list = (List)a8.get((Object)n8);
                                object2 = list;
                                if (list == null) {
                                    string2 = string;
                                    string3 = string;
                                    string2 = string;
                                    string3 = string;
                                    object2 = new ArrayList();
                                    string2 = string;
                                    string3 = string;
                                    a8.put(n8, (List<E1>)object2);
                                }
                                string2 = string;
                                string3 = string;
                                object2.add(e12);
                            }
                            string2 = string;
                            string3 = string;
                            if (bl = string.moveToNext()) continue;
                        }
                        break;
                    }
                    string.close();
                    return a8;
                }
                string2 = string3;
                {
                    this.k().G().c("Database error querying filters. appId", V1.v((String)object), (Object)sQLiteException2);
                    string2 = string3;
                    object = Collections.EMPTY_MAP;
                    if (string3 == null) break block14;
                }
                string3.close();
            }
            return object;
        }
        if (string2 != null) {
            string2.close();
        }
        throw throwable2;
    }

    public final h3 N0(String string) {
        ax.M5.p.l(string);
        this.n();
        this.u();
        return h3.q(this.P("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{string}, ""));
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String O(long l8) {
        RuntimeException var4_6;
        Cursor cursor;
        block12: {
            block14: {
                Cursor cursor2;
                block13: {
                    String string;
                    block11: {
                        this.n();
                        this.u();
                        cursor = null;
                        cursor = cursor2 = this.B().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(l8)});
                        try {}
                        catch (SQLiteException sQLiteException) {}
                        finally {
                            break block11;
                        }
                        catch (Throwable throwable) {
                            break block12;
                        }
                        catch (SQLiteException sQLiteException) {
                            cursor2 = null;
                            break block13;
                        }
                    }
                    if (!cursor2.moveToFirst()) {
                        cursor = cursor2;
                        this.k().K().a("No expired configs for apps with pending events");
                        cursor2.close();
                        return null;
                    }
                    cursor = cursor2;
                    {
                        string = cursor2.getString(0);
                    }
                    cursor2.close();
                    return string;
                }
                cursor = cursor2;
                {
                    Object var5_10;
                    this.k().G().b("Error selecting expired configs", var5_10);
                    if (cursor2 == null) break block14;
                }
                cursor2.close();
            }
            return null;
        }
        if (cursor != null) {
            cursor.close();
        }
        throw var4_6;
    }

    public final void O0(String string, String string2) {
        ax.M5.p.f(string);
        ax.M5.p.f(string2);
        this.n();
        this.u();
        try {
            this.B().delete("user_attributes", "app_id=? and name=?", new String[]{string, string2});
            return;
        }
        catch (SQLiteException sQLiteException) {
            this.k().G().d("Error deleting user property. appId", V1.v(string), this.g().g(string2), (Object)sQLiteException);
            return;
        }
    }

    public final h3 P0(String object) {
        ax.M5.p.l(object);
        this.n();
        this.u();
        Object object2 = new n();
        object = object2 = (h3)this.N("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{object}, (r)object2);
        if (object2 == null) {
            object = h3.c;
        }
        return object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List<Pair<e2, Long>> Q(String object, int n8, int n9) {
        Throwable throwable2;
        Cursor cursor;
        block15: {
            block22: {
                SQLiteException sQLiteException2;
                Cursor cursor2;
                block16: {
                    ArrayList<Pair<e2, Long>> arrayList;
                    Cursor cursor3;
                    boolean bl;
                    block14: {
                        List list;
                        this.n();
                        this.u();
                        bl = n8 > 0;
                        ax.M5.p.a(bl);
                        bl = n9 > 0;
                        ax.M5.p.a(bl);
                        ax.M5.p.f((String)object);
                        cursor2 = null;
                        cursor = null;
                        try {
                            cursor = cursor3 = this.B().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{object}, null, null, "rowid", String.valueOf(n8));
                            cursor2 = cursor3;
                            if (cursor3.moveToFirst()) break block14;
                            cursor = cursor3;
                            cursor2 = cursor3;
                            list = Collections.EMPTY_LIST;
                        }
                        catch (Throwable throwable2) {
                            break block15;
                        }
                        catch (SQLiteException sQLiteException2) {
                            break block16;
                        }
                        cursor3.close();
                        return list;
                    }
                    cursor = cursor3;
                    cursor2 = cursor3;
                    {
                        cursor = cursor3;
                        cursor2 = cursor3;
                        arrayList = new ArrayList<Pair<e2, Long>>();
                        n8 = 0;
                        do {
                            block18: {
                                byte[] byArray;
                                Object object2;
                                long l8;
                                block19: {
                                    long l9;
                                    long l10;
                                    block21: {
                                        long l11;
                                        k4 k42;
                                        Iterator<i2> iterator;
                                        block23: {
                                            block20: {
                                                i2 i22;
                                                block17: {
                                                    cursor = cursor3;
                                                    cursor2 = cursor3;
                                                    l8 = cursor3.getLong(0);
                                                    cursor = cursor3;
                                                    cursor2 = cursor3;
                                                    try {
                                                        object2 = cursor3.getBlob(1);
                                                        cursor = cursor3;
                                                        cursor2 = cursor3;
                                                        byArray = this.o().k0((byte[])object2);
                                                        cursor = cursor3;
                                                        cursor2 = cursor3;
                                                        if (arrayList.isEmpty()) break block17;
                                                        cursor = cursor3;
                                                        cursor2 = cursor3;
                                                    }
                                                    catch (IOException iOException) {
                                                        cursor = cursor3;
                                                        cursor2 = cursor3;
                                                        this.k().G().c("Failed to unzip queued bundle. appId", V1.v((String)object), iOException);
                                                        break block18;
                                                    }
                                                    int n10 = byArray.length;
                                                    if (n10 + n8 > n9) break;
                                                }
                                                cursor = cursor3;
                                                cursor2 = cursor3;
                                                try {
                                                    object2 = x5.G(e2.M3(), byArray);
                                                    cursor = cursor3;
                                                    cursor2 = cursor3;
                                                    if (arrayList.isEmpty()) break block19;
                                                    cursor = cursor3;
                                                    cursor2 = cursor3;
                                                }
                                                catch (IOException iOException) {
                                                    cursor = cursor3;
                                                    cursor2 = cursor3;
                                                    this.k().G().c("Failed to merge queued bundle. appId", V1.v((String)object), iOException);
                                                    break block18;
                                                }
                                                iterator = (e2)((Pair)arrayList.get((int)0)).first;
                                                cursor = cursor3;
                                                cursor2 = cursor3;
                                                k42 = (e2)((k4)((k4.b)object2).q());
                                                cursor = cursor3;
                                                cursor2 = cursor3;
                                                if (!((e2)((Object)iterator)).m0().equals(((e2)k42).m0())) break;
                                                cursor = cursor3;
                                                cursor2 = cursor3;
                                                if (!((e2)((Object)iterator)).l0().equals(((e2)k42).l0())) break;
                                                cursor = cursor3;
                                                cursor2 = cursor3;
                                                if (((e2)((Object)iterator)).C0() != ((e2)k42).C0()) break;
                                                cursor = cursor3;
                                                cursor2 = cursor3;
                                                if (!((e2)((Object)iterator)).n0().equals(((e2)k42).n0())) break;
                                                cursor = cursor3;
                                                cursor2 = cursor3;
                                                iterator = ((e2)((Object)iterator)).A0().iterator();
                                                do {
                                                    cursor = cursor3;
                                                    cursor2 = cursor3;
                                                    bl = iterator.hasNext();
                                                    l11 = -1L;
                                                    if (!bl) break block20;
                                                    cursor = cursor3;
                                                    cursor2 = cursor3;
                                                    i22 = (i2)iterator.next();
                                                    cursor = cursor3;
                                                    cursor2 = cursor3;
                                                } while (!"_npa".equals(i22.c0()));
                                                cursor = cursor3;
                                                cursor2 = cursor3;
                                                l10 = i22.X();
                                                break block23;
                                            }
                                            l10 = -1L;
                                        }
                                        cursor = cursor3;
                                        cursor2 = cursor3;
                                        iterator = ((e2)k42).A0().iterator();
                                        do {
                                            cursor = cursor3;
                                            cursor2 = cursor3;
                                            l9 = l11;
                                            if (!iterator.hasNext()) break block21;
                                            cursor = cursor3;
                                            cursor2 = cursor3;
                                            k42 = iterator.next();
                                            cursor = cursor3;
                                            cursor2 = cursor3;
                                        } while (!"_npa".equals(((i2)k42).c0()));
                                        cursor = cursor3;
                                        cursor2 = cursor3;
                                        l9 = ((i2)k42).X();
                                    }
                                    if (l10 != l9) break;
                                }
                                cursor = cursor3;
                                cursor2 = cursor3;
                                if (!cursor3.isNull(2)) {
                                    cursor = cursor3;
                                    cursor2 = cursor3;
                                    ((e2.a)object2).E0(cursor3.getInt(2));
                                }
                                cursor = cursor3;
                                cursor2 = cursor3;
                                n8 += byArray.length;
                                cursor = cursor3;
                                cursor2 = cursor3;
                                arrayList.add((Pair<e2, Long>)Pair.create((Object)((e2)((k4)((k4.b)object2).q())), (Object)l8));
                            }
                            cursor = cursor3;
                            cursor2 = cursor3;
                        } while ((bl = cursor3.moveToNext()) && n8 <= n9);
                    }
                    cursor3.close();
                    return arrayList;
                }
                cursor = cursor2;
                {
                    this.k().G().c("Error querying bundles. appId", V1.v((String)object), (Object)sQLiteException2);
                    cursor = cursor2;
                    object = Collections.EMPTY_LIST;
                    if (cursor2 == null) break block22;
                }
                cursor2.close();
            }
            return object;
        }
        if (cursor != null) {
            cursor.close();
        }
        throw throwable2;
    }

    public final List<f> R(String charSequence, String charSequence2, String string) {
        ax.M5.p.f((String)charSequence);
        this.n();
        this.u();
        ArrayList<String> arrayList = new ArrayList<String>(3);
        arrayList.add((String)charSequence);
        charSequence = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty((CharSequence)charSequence2)) {
            arrayList.add((String)charSequence2);
            ((StringBuilder)charSequence).append(" and origin=?");
        }
        if (!TextUtils.isEmpty((CharSequence)string)) {
            charSequence2 = new StringBuilder();
            ((StringBuilder)charSequence2).append(string);
            ((StringBuilder)charSequence2).append("*");
            arrayList.add(((StringBuilder)charSequence2).toString());
            ((StringBuilder)charSequence).append(" and name glob ?");
        }
        charSequence2 = arrayList.toArray(new String[arrayList.size()]);
        return this.S(((StringBuilder)charSequence).toString(), (String[])charSequence2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List<h5> R0(String object) {
        Throwable throwable2;
        Cursor cursor;
        block9: {
            block11: {
                SQLiteException sQLiteException2;
                Cursor cursor2;
                block10: {
                    boolean bl;
                    Cursor cursor3;
                    ArrayList<h5> arrayList;
                    block8: {
                        ax.M5.p.f((String)object);
                        this.n();
                        this.u();
                        arrayList = new ArrayList<h5>();
                        cursor2 = null;
                        cursor = null;
                        try {
                            cursor = cursor3 = this.B().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{object}, null, null, "rowid", null);
                            cursor2 = cursor3;
                            bl = cursor3.moveToFirst();
                            if (bl) break block8;
                        }
                        catch (Throwable throwable2) {
                            break block9;
                        }
                        catch (SQLiteException sQLiteException2) {
                            break block10;
                        }
                        cursor3.close();
                        return arrayList;
                    }
                    do {
                        cursor = cursor3;
                        cursor2 = cursor3;
                        Object object2 = cursor3.getString(0);
                        String string = object2;
                        if (object2 == null) {
                            string = "";
                        }
                        cursor = cursor3;
                        cursor2 = cursor3;
                        long l8 = cursor3.getLong(1);
                        cursor = cursor3;
                        cursor2 = cursor3;
                        int n8 = cursor3.getInt(2);
                        cursor = cursor3;
                        cursor2 = cursor3;
                        cursor = cursor3;
                        cursor2 = cursor3;
                        object2 = new h5(string, l8, n8);
                        cursor = cursor3;
                        cursor2 = cursor3;
                        arrayList.add((h5)object2);
                        cursor = cursor3;
                        cursor2 = cursor3;
                    } while (bl = cursor3.moveToNext());
                    cursor3.close();
                    return arrayList;
                }
                cursor = cursor2;
                {
                    this.k().G().c("Error querying trigger uris. appId", V1.v((String)object), (Object)sQLiteException2);
                    cursor = cursor2;
                    object = Collections.EMPTY_LIST;
                    if (cursor2 == null) break block11;
                }
                cursor2.close();
            }
            return object;
        }
        if (cursor != null) {
            cursor.close();
        }
        throw throwable2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List<f> S(String string, String[] object) {
        Throwable throwable2;
        String string2;
        block10: {
            List list;
            block12: {
                SQLiteException sQLiteException2;
                String string3;
                block11: {
                    boolean bl;
                    ArrayList<f> arrayList;
                    block9: {
                        this.n();
                        this.u();
                        arrayList = new ArrayList<f>();
                        string3 = null;
                        string2 = null;
                        try {
                            string2 = string = this.B().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, string, object, null, null, "rowid", "1001");
                            string3 = string;
                            bl = string.moveToFirst();
                            if (bl) break block9;
                        }
                        catch (Throwable throwable2) {
                            break block10;
                        }
                        catch (SQLiteException sQLiteException2) {
                            break block11;
                        }
                        string.close();
                        return arrayList;
                    }
                    do {
                        string2 = string;
                        string3 = string;
                        if (arrayList.size() >= 1000) {
                            string2 = string;
                            string3 = string;
                            this.k().G().b("Read more than the max allowed conditional properties, ignoring extra", 1000);
                            break;
                        }
                        bl = false;
                        string2 = string;
                        string3 = string;
                        object = string.getString(0);
                        string2 = string;
                        string3 = string;
                        String string4 = string.getString(1);
                        string2 = string;
                        string3 = string;
                        String string5 = string.getString(2);
                        string2 = string;
                        string3 = string;
                        Object object2 = this.M((Cursor)string, 3);
                        string2 = string;
                        string3 = string;
                        if (string.getInt(4) != 0) {
                            bl = true;
                        }
                        string2 = string;
                        string3 = string;
                        String string6 = string.getString(5);
                        string2 = string;
                        string3 = string;
                        long l8 = string.getLong(6);
                        string2 = string;
                        string3 = string;
                        Object object3 = this.o();
                        string2 = string;
                        string3 = string;
                        Object object4 = string.getBlob(7);
                        string2 = string;
                        string3 = string;
                        Object object5 = D.CREATOR;
                        string2 = string;
                        string3 = string;
                        object4 = ((x5)object3).D((byte[])object4, object5);
                        string2 = string;
                        string3 = string;
                        long l9 = string.getLong(8);
                        string2 = string;
                        string3 = string;
                        object3 = this.o().D(string.getBlob(9), object5);
                        string2 = string;
                        string3 = string;
                        long l10 = string.getLong(10);
                        string2 = string;
                        string3 = string;
                        long l11 = string.getLong(11);
                        string2 = string;
                        string3 = string;
                        object5 = this.o().D(string.getBlob(12), object5);
                        string2 = string;
                        string3 = string;
                        string2 = string;
                        string3 = string;
                        A5 a52 = new A5(string5, l10, object2, string4);
                        string2 = string;
                        string3 = string;
                        string2 = string;
                        string3 = string;
                        object2 = new f((String)object, string4, a52, l9, bl, string6, (D)object4, l8, (D)object3, l11, (D)object5);
                        string2 = string;
                        string3 = string;
                        arrayList.add((f)object2);
                        string2 = string;
                        string3 = string;
                    } while (bl = string.moveToNext());
                    string.close();
                    return arrayList;
                }
                string2 = string3;
                {
                    this.k().G().b("Error querying conditional user property value", (Object)sQLiteException2);
                    string2 = string3;
                    list = Collections.EMPTY_LIST;
                    if (string3 == null) break block12;
                }
                string3.close();
            }
            return list;
        }
        if (string2 != null) {
            string2.close();
        }
        throw throwable2;
    }

    /*
     * Exception decompiling
     */
    public final List<C5> S0(String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 4[TRYBLOCK] [9, 8 : 212->221)] java.lang.Throwable
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
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final Map<Integer, g2> T0(String object) {
        Throwable throwable2;
        SQLiteDatabase sQLiteDatabase;
        block10: {
            block12: {
                SQLiteException sQLiteException2;
                SQLiteDatabase sQLiteDatabase2;
                block11: {
                    a<Integer, g2> a8;
                    SQLiteDatabase sQLiteDatabase3;
                    block9: {
                        Map map;
                        this.u();
                        this.n();
                        ax.M5.p.f((String)object);
                        sQLiteDatabase3 = this.B();
                        sQLiteDatabase2 = null;
                        sQLiteDatabase = null;
                        try {
                            sQLiteDatabase = sQLiteDatabase3 = sQLiteDatabase3.query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{object}, null, null, null);
                            sQLiteDatabase2 = sQLiteDatabase3;
                            if (sQLiteDatabase3.moveToFirst()) break block9;
                            sQLiteDatabase = sQLiteDatabase3;
                            sQLiteDatabase2 = sQLiteDatabase3;
                            map = Collections.EMPTY_MAP;
                        }
                        catch (Throwable throwable2) {
                            break block10;
                        }
                        catch (SQLiteException sQLiteException2) {
                            break block11;
                        }
                        sQLiteDatabase3.close();
                        return map;
                    }
                    sQLiteDatabase = sQLiteDatabase3;
                    sQLiteDatabase2 = sQLiteDatabase3;
                    {
                        boolean bl;
                        sQLiteDatabase = sQLiteDatabase3;
                        sQLiteDatabase2 = sQLiteDatabase3;
                        a8 = new a<Integer, g2>();
                        do {
                            sQLiteDatabase = sQLiteDatabase3;
                            sQLiteDatabase2 = sQLiteDatabase3;
                            int n8 = sQLiteDatabase3.getInt(0);
                            sQLiteDatabase = sQLiteDatabase3;
                            sQLiteDatabase2 = sQLiteDatabase3;
                            Object object2 = sQLiteDatabase3.getBlob(1);
                            sQLiteDatabase = sQLiteDatabase3;
                            sQLiteDatabase2 = sQLiteDatabase3;
                            try {
                                object2 = (g2)((k4)x5.G(g2.Y(), object2).q());
                                sQLiteDatabase = sQLiteDatabase3;
                                sQLiteDatabase2 = sQLiteDatabase3;
                                a8.put(n8, (g2)object2);
                            }
                            catch (IOException iOException) {
                                sQLiteDatabase = sQLiteDatabase3;
                                sQLiteDatabase2 = sQLiteDatabase3;
                                this.k().G().d("Failed to merge filter results. appId, audienceId, error", V1.v((String)object), n8, iOException);
                            }
                            sQLiteDatabase = sQLiteDatabase3;
                            sQLiteDatabase2 = sQLiteDatabase3;
                        } while (bl = sQLiteDatabase3.moveToNext());
                    }
                    sQLiteDatabase3.close();
                    return a8;
                }
                sQLiteDatabase = sQLiteDatabase2;
                {
                    this.k().G().c("Database error querying filter results. appId", V1.v((String)object), (Object)sQLiteException2);
                    sQLiteDatabase = sQLiteDatabase2;
                    object = Collections.EMPTY_MAP;
                    if (sQLiteDatabase2 == null) break block12;
                }
                sQLiteDatabase2.close();
            }
            return object;
        }
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
        }
        throw throwable2;
    }

    public final void U(y y8) {
        this.X("events", y8);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final Map<Integer, List<B1>> U0(String object) {
        Throwable throwable2;
        SQLiteDatabase sQLiteDatabase;
        block11: {
            block14: {
                SQLiteException sQLiteException2;
                SQLiteDatabase sQLiteDatabase2;
                block12: {
                    SQLiteDatabase sQLiteDatabase3;
                    a<Integer, List<B1>> a8;
                    block10: {
                        Map map;
                        ax.M5.p.f((String)object);
                        a8 = new a<Integer, List<B1>>();
                        sQLiteDatabase3 = this.B();
                        sQLiteDatabase2 = null;
                        sQLiteDatabase = null;
                        try {
                            sQLiteDatabase = sQLiteDatabase3 = sQLiteDatabase3.query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{object}, null, null, null);
                            sQLiteDatabase2 = sQLiteDatabase3;
                            if (sQLiteDatabase3.moveToFirst()) break block10;
                            sQLiteDatabase = sQLiteDatabase3;
                            sQLiteDatabase2 = sQLiteDatabase3;
                            map = Collections.EMPTY_MAP;
                        }
                        catch (Throwable throwable2) {
                            break block11;
                        }
                        catch (SQLiteException sQLiteException2) {
                            break block12;
                        }
                        sQLiteDatabase3.close();
                        return map;
                    }
                    while (true) {
                        sQLiteDatabase = sQLiteDatabase3;
                        sQLiteDatabase2 = sQLiteDatabase3;
                        {
                            boolean bl;
                            block13: {
                                B1 b12;
                                Object object2 = sQLiteDatabase3.getBlob(1);
                                sQLiteDatabase = sQLiteDatabase3;
                                sQLiteDatabase2 = sQLiteDatabase3;
                                try {
                                    b12 = (B1)((k4)x5.G(B1.O(), object2).q());
                                    sQLiteDatabase = sQLiteDatabase3;
                                    sQLiteDatabase2 = sQLiteDatabase3;
                                    if (!b12.X()) break block13;
                                    sQLiteDatabase = sQLiteDatabase3;
                                    sQLiteDatabase2 = sQLiteDatabase3;
                                }
                                catch (IOException iOException) {
                                    sQLiteDatabase = sQLiteDatabase3;
                                    sQLiteDatabase2 = sQLiteDatabase3;
                                    this.k().G().c("Failed to merge filter. appId", V1.v((String)object), iOException);
                                    break block13;
                                }
                                int n8 = sQLiteDatabase3.getInt(0);
                                sQLiteDatabase = sQLiteDatabase3;
                                sQLiteDatabase2 = sQLiteDatabase3;
                                List list = (List)a8.get((Object)n8);
                                object2 = list;
                                if (list == null) {
                                    sQLiteDatabase = sQLiteDatabase3;
                                    sQLiteDatabase2 = sQLiteDatabase3;
                                    object2 = new ArrayList;
                                    sQLiteDatabase = sQLiteDatabase3;
                                    sQLiteDatabase2 = sQLiteDatabase3;
                                    object2();
                                    sQLiteDatabase = sQLiteDatabase3;
                                    sQLiteDatabase2 = sQLiteDatabase3;
                                    a8.put(n8, (List<B1>)object2);
                                }
                                sQLiteDatabase = sQLiteDatabase3;
                                sQLiteDatabase2 = sQLiteDatabase3;
                                object2.add(b12);
                            }
                            sQLiteDatabase = sQLiteDatabase3;
                            sQLiteDatabase2 = sQLiteDatabase3;
                            if (bl = sQLiteDatabase3.moveToNext()) continue;
                        }
                        break;
                    }
                    sQLiteDatabase3.close();
                    return a8;
                }
                sQLiteDatabase = sQLiteDatabase2;
                {
                    this.k().G().c("Database error querying filters. appId", V1.v((String)object), (Object)sQLiteException2);
                    sQLiteDatabase = sQLiteDatabase2;
                    object = Collections.EMPTY_MAP;
                    if (sQLiteDatabase2 == null) break block14;
                }
                sQLiteDatabase2.close();
            }
            return object;
        }
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
        }
        throw throwable2;
    }

    public final void V(Z1 z12, boolean bl, boolean bl2) {
        SQLiteException sQLiteException2;
        String string;
        block21: {
            List<String> list;
            ContentValues contentValues;
            block24: {
                block22: {
                    block23: {
                        ax.M5.p.l(z12);
                        this.n();
                        this.u();
                        string = z12.l();
                        ax.M5.p.l(string);
                        contentValues = new ContentValues();
                        contentValues.put("app_id", string);
                        if (!m6.a() || !this.d().t(F.W0)) break block22;
                        if (!bl) break block23;
                        contentValues.put("app_instance_id", null);
                        break block24;
                    }
                    if (!this.b.S(string).m(h3.a.d0)) break block24;
                }
                contentValues.put("app_instance_id", z12.m());
            }
            contentValues.put("gmp_app_id", z12.q());
            if (!m6.a() || !this.d().t(F.W0) || this.b.S(string).m(h3.a.c0)) {
                contentValues.put("resettable_device_id_hash", z12.s());
            }
            contentValues.put("last_bundle_index", Long.valueOf(z12.F0()));
            contentValues.put("last_bundle_start_timestamp", Long.valueOf(z12.H0()));
            contentValues.put("last_bundle_end_timestamp", Long.valueOf(z12.D0()));
            contentValues.put("app_version", z12.o());
            contentValues.put("app_store", z12.n());
            contentValues.put("gmp_version", Long.valueOf(z12.z0()));
            contentValues.put("dev_cert_hash", Long.valueOf(z12.t0()));
            contentValues.put("measurement_enabled", Boolean.valueOf(z12.A()));
            contentValues.put("day", Long.valueOf(z12.r0()));
            contentValues.put("daily_public_events_count", Long.valueOf(z12.m0()));
            contentValues.put("daily_events_count", Long.valueOf(z12.j0()));
            contentValues.put("daily_conversions_count", Long.valueOf(z12.d0()));
            contentValues.put("config_fetched_time", Long.valueOf(z12.a0()));
            contentValues.put("failed_config_fetch_time", Long.valueOf(z12.x0()));
            contentValues.put("app_version_int", Long.valueOf(z12.U()));
            contentValues.put("firebase_instance_id", z12.p());
            contentValues.put("daily_error_events_count", Long.valueOf(z12.g0()));
            contentValues.put("daily_realtime_events_count", Long.valueOf(z12.p0()));
            contentValues.put("health_monitor_sample", z12.r());
            contentValues.put("android_id", Long.valueOf(z12.Q()));
            contentValues.put("adid_reporting_enabled", Boolean.valueOf(z12.z()));
            contentValues.put("admob_app_id", z12.j());
            contentValues.put("dynamite_version", Long.valueOf(z12.v0()));
            if (!m6.a() || !this.d().t(F.W0) || this.b.S(string).m(h3.a.d0)) {
                contentValues.put("session_stitching_token", z12.u());
            }
            contentValues.put("sgtm_upload_enabled", Boolean.valueOf(z12.C()));
            contentValues.put("target_os_version", Long.valueOf(z12.J0()));
            contentValues.put("session_stitching_token_hash", Long.valueOf(z12.I0()));
            if (k7.a() && this.d().E(string, F.A0)) {
                contentValues.put("ad_services_version", Integer.valueOf(z12.a()));
                contentValues.put("attribution_eligibility_status", Long.valueOf(z12.X()));
            }
            if (n6.a() && this.d().E(string, F.L0)) {
                contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(z12.D()));
            }
            contentValues.put("npa_metadata_value", z12.K0());
            if (r7.a() && this.d().E(string, F.t0)) {
                this.i();
                if (B5.H0(string)) {
                    contentValues.put("bundle_delivery_index", Long.valueOf(z12.B0()));
                }
            }
            if (r7.a() && this.d().E(string, F.u0)) {
                contentValues.put("sgtm_preview_key", z12.v());
            }
            contentValues.put("dma_consent_state", Integer.valueOf(z12.L()));
            contentValues.put("daily_realtime_dcu_count", Integer.valueOf(z12.F()));
            if (g6.a() && this.d().E(string, F.Q0)) {
                contentValues.put("serialized_npa_metadata", z12.t());
            }
            if ((list = z12.w()) != null) {
                if (list.isEmpty()) {
                    this.k().L().b("Safelisted events should not be an empty list. appId", string);
                } else {
                    contentValues.put("safelisted_events", TextUtils.join((CharSequence)",", list));
                }
            }
            if (y6.a() && this.d().t(F.q0) && !contentValues.containsKey("safelisted_events")) {
                contentValues.put("safelisted_events", null);
            }
            if (this.d().t(F.T0)) {
                contentValues.put("unmatched_pfo", z12.L0());
                contentValues.put("unmatched_uwa", z12.M0());
            }
            if (M6.a() && this.d().E(string, F.N0)) {
                contentValues.put("ad_campaign_info", z12.E());
            }
            try {
                z12 = this.B();
                if ((long)z12.update("apps", contentValues, "app_id = ?", new String[]{string}) == 0L && z12.insertWithOnConflict("apps", null, contentValues, 5) == -1L) {
                    this.k().G().b("Failed to insert/update app (got -1). appId", V1.v(string));
                    return;
                }
            }
            catch (SQLiteException sQLiteException2) {
                break block21;
            }
            return;
        }
        this.k().G().c("Error storing app. appId", V1.v(string), (Object)sQLiteException2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final Map<Integer, List<Integer>> V0(String object) {
        Throwable throwable2;
        SQLiteDatabase sQLiteDatabase;
        block9: {
            block11: {
                SQLiteException sQLiteException2;
                SQLiteDatabase sQLiteDatabase2;
                block10: {
                    SQLiteDatabase sQLiteDatabase3;
                    a<Integer, List<Integer>> a8;
                    block8: {
                        Map map;
                        this.u();
                        this.n();
                        ax.M5.p.f((String)object);
                        a8 = new a<Integer, List<Integer>>();
                        sQLiteDatabase3 = this.B();
                        sQLiteDatabase2 = null;
                        sQLiteDatabase = null;
                        try {
                            sQLiteDatabase = sQLiteDatabase3 = sQLiteDatabase3.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{object, object});
                            sQLiteDatabase2 = sQLiteDatabase3;
                            if (sQLiteDatabase3.moveToFirst()) break block8;
                            sQLiteDatabase = sQLiteDatabase3;
                            sQLiteDatabase2 = sQLiteDatabase3;
                            map = Collections.EMPTY_MAP;
                        }
                        catch (Throwable throwable2) {
                            break block9;
                        }
                        catch (SQLiteException sQLiteException2) {
                            break block10;
                        }
                        sQLiteDatabase3.close();
                        return map;
                    }
                    while (true) {
                        sQLiteDatabase = sQLiteDatabase3;
                        sQLiteDatabase2 = sQLiteDatabase3;
                        {
                            boolean bl;
                            ArrayList<Integer> arrayList;
                            int n8 = sQLiteDatabase3.getInt(0);
                            sQLiteDatabase = sQLiteDatabase3;
                            sQLiteDatabase2 = sQLiteDatabase3;
                            ArrayList<Integer> arrayList2 = arrayList = (ArrayList<Integer>)a8.get((Object)n8);
                            if (arrayList == null) {
                                sQLiteDatabase = sQLiteDatabase3;
                                sQLiteDatabase2 = sQLiteDatabase3;
                                sQLiteDatabase = sQLiteDatabase3;
                                sQLiteDatabase2 = sQLiteDatabase3;
                                arrayList2 = new ArrayList<Integer>();
                                sQLiteDatabase = sQLiteDatabase3;
                                sQLiteDatabase2 = sQLiteDatabase3;
                                a8.put(n8, arrayList2);
                            }
                            sQLiteDatabase = sQLiteDatabase3;
                            sQLiteDatabase2 = sQLiteDatabase3;
                            arrayList2.add(sQLiteDatabase3.getInt(1));
                            sQLiteDatabase = sQLiteDatabase3;
                            sQLiteDatabase2 = sQLiteDatabase3;
                            if (bl = sQLiteDatabase3.moveToNext()) continue;
                        }
                        break;
                    }
                    sQLiteDatabase3.close();
                    return a8;
                }
                sQLiteDatabase = sQLiteDatabase2;
                {
                    this.k().G().c("Database error querying scoped filters. appId", V1.v((String)object), (Object)sQLiteException2);
                    sQLiteDatabase = sQLiteDatabase2;
                    object = Collections.EMPTY_MAP;
                    if (sQLiteDatabase2 == null) break block11;
                }
                sQLiteDatabase2.close();
            }
            return object;
        }
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
        }
        throw throwable2;
    }

    public final void W(String string, u u8) {
        h3 h32;
        h3 h33;
        ax.M5.p.l(string);
        ax.M5.p.l(u8);
        this.n();
        this.u();
        if (this.d().t(F.K0) && (h33 = this.P0(string)) == (h32 = h3.c)) {
            this.A0(string, h32);
        }
        h33 = new ContentValues();
        h33.put("app_id", string);
        h33.put("dma_consent_settings", u8.j());
        this.Z("consent_settings", "app_id", (ContentValues)h33);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void W0(String string) {
        Throwable throwable2;
        Cursor cursor;
        block10: {
            block12: {
                SQLiteException sQLiteException2;
                Cursor cursor2;
                block11: {
                    boolean bl;
                    Cursor cursor3;
                    block9: {
                        this.Q0("events_snapshot", string);
                        cursor3 = Collections.singletonList("name");
                        cursor2 = null;
                        cursor = null;
                        try {
                            cursor = cursor3 = this.B().query("events", cursor3.toArray(new String[0]), "app_id=?", new String[]{string}, null, null, null);
                            cursor2 = cursor3;
                            bl = cursor3.moveToFirst();
                            if (bl) break block9;
                        }
                        catch (Throwable throwable2) {
                            break block10;
                        }
                        catch (SQLiteException sQLiteException2) {
                            break block11;
                        }
                        cursor3.close();
                        return;
                    }
                    do {
                        cursor = cursor3;
                        cursor2 = cursor3;
                        Object object = cursor3.getString(0);
                        if (object != null) {
                            cursor = cursor3;
                            cursor2 = cursor3;
                            if ((object = this.G0(string, (String)object)) != null) {
                                cursor = cursor3;
                                cursor2 = cursor3;
                                this.X("events_snapshot", (y)object);
                            }
                        }
                        cursor = cursor3;
                        cursor2 = cursor3;
                    } while (bl = cursor3.moveToNext());
                    cursor3.close();
                    return;
                }
                cursor = cursor2;
                {
                    this.k().G().c("Error creating snapshot. appId", V1.v(string), (Object)sQLiteException2);
                    if (cursor2 == null) break block12;
                }
                cursor2.close();
            }
            return;
        }
        if (cursor != null) {
            cursor.close();
        }
        throw throwable2;
    }

    public final void X0() {
        this.u();
        this.B().beginTransaction();
    }

    public final void Y(String string, h3 h32) {
        ax.M5.p.l(string);
        ax.M5.p.l(h32);
        this.n();
        this.u();
        this.A0(string, this.P0(string));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", string);
        contentValues.put("storage_consent_at_bundling", h32.z());
        this.Z("consent_settings", "app_id", contentValues);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void Y0(String var1_1) {
        block31: {
            block36: {
                block32: {
                    block30: {
                        var11_2 = new ArrayList(Arrays.asList(new String[]{"name", "lifetime_count"}));
                        var15_3 = this.G0(var1_1, "_f");
                        var14_4 = this.G0(var1_1, "_v");
                        this.Q0("events", var1_1);
                        var3_5 = false;
                        var2_6 = false;
                        var13_7 = null;
                        var12_12 /* !! */  = null;
                        try {
                            var12_12 /* !! */  = var11_2 = this.B().query("events_snapshot", var11_2.toArray(new String[0]), "app_id=?", new String[]{var1_1}, null, null, null);
                            var13_7 = var11_2;
                            var10_16 = var11_2.moveToFirst();
                            if (var10_16) break block30;
                        }
                        catch (Throwable var13_9) {
                            var6_19 = false;
                            var2_6 = var3_5;
                            var11_2 = var12_12 /* !! */ ;
                            break block31;
                        }
                        catch (SQLiteException var12_14) {
                            var6_19 = false;
                            var11_2 = var13_7;
                            break block32;
                        }
                        var11_2.close();
                        if (var15_3 != null) {
                            this.X("events", var15_3);
                        } else if (var14_4 != null) {
                            this.X("events", var14_4);
                        }
                        this.Q0("events_snapshot", var1_1);
                        return;
                    }
                    var3_5 = false;
                    var2_6 = false;
                    do {
                        block34: {
                            block35: {
                                block33: {
                                    var9_22 = var3_5;
                                    var6_19 = var2_6;
                                    var8_21 = var3_5;
                                    var7_20 = var2_6;
                                    try {
                                        var12_12 /* !! */  = var11_2.getString(0);
                                        var9_22 = var3_5;
                                        var6_19 = var2_6;
                                        var8_21 = var3_5;
                                        var7_20 = var2_6;
                                        if (!this.d().t(F.Y0)) break block33;
                                        var9_22 = var3_5;
                                        var6_19 = var2_6;
                                        var8_21 = var3_5;
                                        var7_20 = var2_6;
                                        var5_18 = var3_5;
                                        var4_17 = var2_6;
                                        if (var11_2.getLong(1) < 1L) break block34;
                                        var9_22 = var3_5;
                                        var6_19 = var2_6;
                                        var8_21 = var3_5;
                                        var7_20 = var2_6;
                                        if ("_f".equals(var12_12 /* !! */ )) {
                                            while (true) {
                                                var5_18 = true;
                                                var4_17 = var2_6;
                                                break block34;
                                                break;
                                            }
                                        }
                                        var9_22 = var3_5;
                                        var6_19 = var2_6;
                                        var8_21 = var3_5;
                                        var7_20 = var2_6;
                                        var5_18 = var3_5;
                                        var4_17 = var2_6;
                                        if (!"_v".equals(var12_12 /* !! */ )) break block34;
                                        break block35;
                                    }
                                    catch (Throwable var13_8) {
                                        var2_6 = var9_22;
                                        break block31;
                                    }
                                    catch (SQLiteException var12_13) {
                                        var2_6 = var8_21;
                                        var6_19 = var7_20;
                                        break block32;
                                    }
                                }
                                var9_22 = var3_5;
                                var6_19 = var2_6;
                                var8_21 = var3_5;
                                var7_20 = var2_6;
                                if ("_f".equals(var12_12 /* !! */ )) ** continue;
                                var9_22 = var3_5;
                                var6_19 = var2_6;
                                var8_21 = var3_5;
                                var7_20 = var2_6;
                                var5_18 = var3_5;
                                var4_17 = var2_6;
                                if (!"_v".equals(var12_12 /* !! */ )) break block34;
                            }
                            var4_17 = true;
                            var5_18 = var3_5;
                        }
                        if (var12_12 /* !! */  != null) {
                            var9_22 = var5_18;
                            var6_19 = var4_17;
                            var8_21 = var5_18;
                            var7_20 = var4_17;
                            if ((var12_12 /* !! */  = this.E0("events_snapshot", var1_1, (String)var12_12 /* !! */ )) != null) {
                                var9_22 = var5_18;
                                var6_19 = var4_17;
                                var8_21 = var5_18;
                                var7_20 = var4_17;
                                this.X("events", (y)var12_12 /* !! */ );
                            }
                        }
                        var9_22 = var5_18;
                        var6_19 = var4_17;
                        var8_21 = var5_18;
                        var7_20 = var4_17;
                        var10_16 = var11_2.moveToNext();
                        var3_5 = var5_18;
                        var2_6 = var4_17;
                    } while (var10_16);
                    var11_2.close();
                    if (!var5_18 && var15_3 != null) {
                        this.X("events", var15_3);
                    } else if (!var4_17 && var14_4 != null) {
                        this.X("events", var14_4);
                    }
                    this.Q0("events_snapshot", var1_1);
                    return;
                }
                try {
                    this.k().G().c("Error querying snapshot. appId", V1.v(var1_1), var12_15);
                    if (var11_2 == null) break block36;
                }
                catch (Throwable var13_10) {
                    // empty catch block
                    break block31;
                }
                var11_2.close();
            }
            if (!var2_6 && var15_3 != null) {
                this.X("events", var15_3);
            } else if (!var6_19 && var14_4 != null) {
                this.X("events", var14_4);
            }
            this.Q0("events_snapshot", var1_1);
            return;
        }
        if (var11_2 != null) {
            var11_2.close();
        }
        if (!var2_6 && var15_3 != null) {
            this.X("events", var15_3);
        } else if (!var6_19 && var14_4 != null) {
            this.X("events", var14_4);
        }
        this.Q0("events_snapshot", var1_1);
        throw var13_11;
    }

    public final void Z0() {
        this.u();
        this.B().endTransaction();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void a0(String string, List<A1> object) {
        int n8;
        Object object2;
        Iterator<k4> iterator;
        int n9;
        ArrayList<Integer> arrayList;
        k4.b b8;
        ax.M5.p.l(object);
        int n10 = 0;
        while (true) {
            block22: {
                block23: {
                    block21: {
                        if (n10 >= object.size()) break block21;
                        b8 = (A1.a)object.get(n10).A();
                        arrayList = b8;
                        if (((A1.a)b8).w() == 0) break block22;
                        break block23;
                    }
                    this.u();
                    this.n();
                    ax.M5.p.f(string);
                    ax.M5.p.l(object);
                    b8 = this.B();
                    b8.beginTransaction();
                    try {
                        this.u();
                        this.n();
                        ax.M5.p.f(string);
                        arrayList = this.B();
                        arrayList.delete("property_filters", "app_id=?", new String[]{string});
                        arrayList.delete("event_filters", "app_id=?", new String[]{string});
                        arrayList = object.iterator();
                        break;
                    }
                    catch (Throwable throwable) {}
                    b8.endTransaction();
                    throw throwable;
                }
                n9 = 0;
                while (true) {
                    arrayList = b8;
                    if (n9 >= ((A1.a)b8).w()) break;
                    arrayList = (B1.a)((A1.a)b8).z(n9).A();
                    iterator = (B1.a)((k4.b)((p3)((Object)arrayList)).clone());
                    object2 = ax.f6.q.b(((B1.a)((Object)arrayList)).B());
                    if (object2 != null) {
                        ((B1.a)((Object)iterator)).y((String)object2);
                        n8 = 1;
                    } else {
                        n8 = 0;
                    }
                    for (int i8 = 0; i8 < ((B1.a)((Object)arrayList)).w(); ++i8) {
                        object2 = ((B1.a)((Object)arrayList)).z(i8);
                        String string2 = ax.f6.p.a(((C1)object2).O());
                        if (string2 == null) continue;
                        ((B1.a)((Object)iterator)).x(i8, (C1)((k4)((C1.a)((k4)object2).A()).w(string2).q()));
                        n8 = 1;
                    }
                    arrayList = b8;
                    if (n8 != 0) {
                        arrayList = ((A1.a)b8).x(n9, (B1.a)((Object)iterator));
                        object.set(n10, (A1)((A1)((k4)((k4.b)((Object)arrayList)).q())));
                    }
                    ++n9;
                    b8 = arrayList;
                }
            }
            if (((A1.a)((Object)arrayList)).B() != 0) {
                for (n8 = 0; n8 < ((A1.a)((Object)arrayList)).B(); ++n8) {
                    object2 = ((A1.a)((Object)arrayList)).C(n8);
                    iterator = s.a(((E1)object2).N());
                    b8 = arrayList;
                    if (iterator != null) {
                        b8 = ((A1.a)((Object)arrayList)).y(n8, ((E1.a)((k4)object2).A()).w((String)((Object)iterator)));
                        object.set(n10, (A1)((A1)((k4)b8.q())));
                    }
                    arrayList = b8;
                }
            }
            ++n10;
        }
        block6: while (arrayList.hasNext()) {
            block20: {
                block19: {
                    iterator = (A1)arrayList.next();
                    this.u();
                    this.n();
                    ax.M5.p.f(string);
                    ax.M5.p.l(iterator);
                    if (!((A1)((Object)iterator)).T()) {
                        this.k().L().b("Audience with no ID. appId", V1.v(string));
                        continue;
                    }
                    n9 = ((A1)((Object)iterator)).n();
                    object2 = ((A1)((Object)iterator)).R().iterator();
                    while (object2.hasNext()) {
                        if (object2.next().Y()) continue;
                        this.k().L().c("Event filter with no ID. Audience definition ignored. appId, audienceId", V1.v(string), n9);
                        continue block6;
                    }
                    object2 = ((A1)((Object)iterator)).S().iterator();
                    while (object2.hasNext()) {
                        if (((E1)object2.next()).R()) continue;
                        this.k().L().c("Property filter with no ID. Audience definition ignored. appId, audienceId", V1.v(string), n9);
                        continue block6;
                    }
                    object2 = ((A1)((Object)iterator)).R().iterator();
                    while (object2.hasNext()) {
                        if (this.g0(string, n9, (B1)object2.next())) continue;
                        n8 = 0;
                        break block19;
                    }
                    n8 = 1;
                }
                n10 = n8;
                if (n8 != 0) {
                    iterator = ((A1)((Object)iterator)).S().iterator();
                    do {
                        n10 = n8;
                        if (!iterator.hasNext()) break block20;
                    } while (this.h0(string, n9, (E1)iterator.next()));
                    n10 = 0;
                }
            }
            if (n10 != 0) continue;
            this.u();
            this.n();
            ax.M5.p.f(string);
            iterator = this.B();
            iterator.delete("property_filters", "app_id=? and audience_id=?", new String[]{string, String.valueOf(n9)});
            iterator.delete("event_filters", "app_id=? and audience_id=?", new String[]{string, String.valueOf(n9)});
        }
        arrayList = new ArrayList<Integer>();
        iterator = object.iterator();
        while (iterator.hasNext()) {
            object = iterator.next();
            object = ((A1)object).T() ? Integer.valueOf(((A1)object).n()) : null;
            arrayList.add((Integer)object);
        }
        this.B0(string, arrayList);
        b8.setTransactionSuccessful();
        b8.endTransaction();
    }

    final void a1() {
        this.n();
        this.u();
        if (this.l0()) {
            long l8 = this.s().e.a();
            long l9 = this.b().b();
            if (Math.abs(l9 - l8) > (Long)F.z.a(null)) {
                int n8;
                this.s().e.b(l9);
                this.n();
                this.u();
                if (this.l0() && (n8 = this.B().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(this.b().a()), String.valueOf(com.google.android.gms.measurement.internal.h.O())})) > 0) {
                    this.k().K().b("Deleted stale rows. rowsDeleted", n8);
                }
            }
        }
    }

    final void b0(List<Long> object) {
        this.n();
        this.u();
        ax.M5.p.l(object);
        ax.M5.p.n(object.size());
        if (!this.l0()) {
            return;
        }
        CharSequence charSequence = TextUtils.join((CharSequence)",", object);
        object = new StringBuilder("(");
        ((StringBuilder)object).append((String)charSequence);
        ((StringBuilder)object).append(")");
        object = ((StringBuilder)object).toString();
        charSequence = new StringBuilder("SELECT COUNT(1) FROM queue WHERE rowid IN ");
        ((StringBuilder)charSequence).append((String)object);
        ((StringBuilder)charSequence).append(" AND retry_count =  2147483647 LIMIT 1");
        if (this.y0(((StringBuilder)charSequence).toString(), null) > 0L) {
            this.k().L().a("The number of upload retries exceeds the limit. Will remain unchanged.");
        }
        try {
            charSequence = this.B();
            StringBuilder stringBuilder = new StringBuilder("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
            stringBuilder.append((String)object);
            stringBuilder.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
            charSequence.execSQL(stringBuilder.toString());
            return;
        }
        catch (SQLiteException sQLiteException) {
            this.k().G().b("Error incrementing retry count. error", (Object)sQLiteException);
            return;
        }
    }

    public final void b1() {
        this.u();
        this.B().setTransactionSuccessful();
    }

    public final boolean c0(e2 e22, boolean bl) {
        SQLiteException sQLiteException2;
        block7: {
            this.n();
            this.u();
            ax.M5.p.l(e22);
            ax.M5.p.f(e22.P3());
            ax.M5.p.o(e22.d1());
            this.a1();
            long l8 = this.b().a();
            if (e22.o3() < l8 - com.google.android.gms.measurement.internal.h.O() || e22.o3() > com.google.android.gms.measurement.internal.h.O() + l8) {
                this.k().L().d("Storing bundle outside of the max uploading time span. appId, now, timestamp", V1.v(e22.P3()), l8, e22.o3());
            }
            byte[] byArray = e22.l();
            try {
                byArray = this.o().i0(byArray);
                this.k().K().b("Saving bundle, size", byArray.length);
            }
            catch (IOException iOException) {
                this.k().G().c("Data loss. Failed to serialize bundle. appId", V1.v(e22.P3()), iOException);
                return false;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", e22.P3());
            contentValues.put("bundle_end_timestamp", Long.valueOf(e22.o3()));
            contentValues.put("data", byArray);
            contentValues.put("has_realtime", Integer.valueOf(bl ? 1 : 0));
            if (e22.k1()) {
                contentValues.put("retry_count", Integer.valueOf(e22.v2()));
            }
            try {
                if (this.B().insert("queue", null, contentValues) == -1L) {
                    this.k().G().b("Failed to insert bundle (got -1). appId", V1.v(e22.P3()));
                    return false;
                }
            }
            catch (SQLiteException sQLiteException2) {
                break block7;
            }
            return true;
        }
        this.k().G().c("Error storing bundle. appId", V1.v(e22.P3()), (Object)sQLiteException2);
        return false;
    }

    public final boolean c1() {
        return this.y0("select count(1) > 0 from raw_events", null) != 0L;
    }

    public final boolean d0(f f8) {
        ax.M5.p.l(f8);
        this.n();
        this.u();
        String string = f8.q;
        ax.M5.p.l(string);
        if (this.I0(string, f8.d0.c0) == null && this.y0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{string}) >= 1000L) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", string);
        contentValues.put("origin", f8.c0);
        contentValues.put("name", f8.d0.c0);
        com.google.android.gms.measurement.internal.l.T(contentValues, "value", ax.M5.p.l(f8.d0.k()));
        contentValues.put("active", Boolean.valueOf(f8.f0));
        contentValues.put("trigger_event_name", f8.g0);
        contentValues.put("trigger_timeout", Long.valueOf(f8.i0));
        this.i();
        contentValues.put("timed_out_event", B5.q0(f8.h0));
        contentValues.put("creation_timestamp", Long.valueOf(f8.e0));
        this.i();
        contentValues.put("triggered_event", B5.q0(f8.j0));
        contentValues.put("triggered_timestamp", Long.valueOf(f8.d0.d0));
        contentValues.put("time_to_live", Long.valueOf(f8.k0));
        this.i();
        contentValues.put("expired_event", B5.q0(f8.l0));
        try {
            if (this.B().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1L) {
                this.k().G().b("Failed to insert/update conditional user property (got -1)", V1.v(string));
            }
        }
        catch (SQLiteException sQLiteException) {
            this.k().G().c("Error storing conditional user property", V1.v(string), (Object)sQLiteException);
        }
        return true;
    }

    public final boolean d1() {
        return this.y0("select count(1) > 0 from queue where has_realtime = 1", null) != 0L;
    }

    public final boolean e0(A a8, long l8, boolean bl) {
        SQLiteException sQLiteException2;
        block3: {
            this.n();
            this.u();
            ax.M5.p.l(a8);
            ax.M5.p.f(a8.a);
            byte[] byArray = this.o().E(a8).l();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", a8.a);
            contentValues.put("name", a8.b);
            contentValues.put("timestamp", Long.valueOf(a8.d));
            contentValues.put("metadata_fingerprint", Long.valueOf(l8));
            contentValues.put("data", byArray);
            contentValues.put("realtime", Integer.valueOf(bl ? 1 : 0));
            try {
                if (this.B().insert("raw_events", null, contentValues) == -1L) {
                    this.k().G().b("Failed to insert raw event (got -1). appId", V1.v(a8.a));
                    return false;
                }
            }
            catch (SQLiteException sQLiteException2) {
                break block3;
            }
            return true;
        }
        this.k().G().c("Error storing raw event. appId", V1.v(a8.a), (Object)sQLiteException2);
        return false;
    }

    public final boolean e1() {
        return this.y0("select count(1) > 0 from raw_events where realtime = 1", null) != 0L;
    }

    public final boolean f0(C5 c52) {
        ax.M5.p.l(c52);
        this.n();
        this.u();
        if (this.I0(c52.a, c52.c) == null && (B5.L0(c52.c) ? this.y0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{c52.a}) >= (long)this.d().q(c52.a, F.H, 25, 100) : !"_npa".equals(c52.c) && this.y0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{c52.a, c52.b}) >= 25L)) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c52.a);
        contentValues.put("origin", c52.b);
        contentValues.put("name", c52.c);
        contentValues.put("set_timestamp", Long.valueOf(c52.d));
        com.google.android.gms.measurement.internal.l.T(contentValues, "value", c52.e);
        try {
            if (this.B().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1L) {
                this.k().G().b("Failed to insert/update user property (got -1). appId", V1.v(c52.a));
            }
        }
        catch (SQLiteException sQLiteException) {
            this.k().G().c("Error storing user property. appId", V1.v(c52.a), (Object)sQLiteException);
        }
        return true;
    }

    final boolean i0(String string, Bundle object) {
        SQLiteException sQLiteException2;
        block3: {
            this.n();
            this.u();
            object = new A(this.a, "", string, "dep", 0L, 0L, (Bundle)object);
            object = this.o().E((A)object).l();
            this.k().K().c("Saving default event parameters, appId, data size", this.g().c(string), ((Bundle)object).length);
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", string);
            contentValues.put("parameters", (byte[])object);
            try {
                if (this.B().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1L) {
                    this.k().G().b("Failed to insert default event parameters (got -1). appId", V1.v(string));
                    return false;
                }
            }
            catch (SQLiteException sQLiteException2) {
                break block3;
            }
            return true;
        }
        this.k().G().c("Error storing default event parameters. appId", V1.v(string), (Object)sQLiteException2);
        return false;
    }

    public final boolean j0(String string, h5 h52) {
        SQLiteException sQLiteException2;
        block4: {
            this.n();
            this.u();
            ax.M5.p.l(h52);
            ax.M5.p.f(string);
            long l8 = this.b().a();
            if (h52.c0 < l8 - com.google.android.gms.measurement.internal.h.O() || h52.c0 > com.google.android.gms.measurement.internal.h.O() + l8) {
                this.k().L().d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", V1.v(string), l8, h52.c0);
            }
            this.k().K().a("Saving trigger URI");
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", string);
            contentValues.put("trigger_uri", h52.q);
            contentValues.put("source", Integer.valueOf(h52.d0));
            contentValues.put("timestamp_millis", Long.valueOf(h52.c0));
            try {
                if (this.B().insert("trigger_uris", null, contentValues) == -1L) {
                    this.k().G().b("Failed to insert trigger URI (got -1). appId", V1.v(string));
                    return false;
                }
            }
            catch (SQLiteException sQLiteException2) {
                break block4;
            }
            return true;
        }
        this.k().G().c("Error storing trigger URI. appId", V1.v(string), (Object)sQLiteException2);
        return false;
    }

    public final boolean k0(String string, Long l8, long l9, ax.b6.Z1 z12) {
        SQLiteException sQLiteException2;
        block3: {
            this.n();
            this.u();
            ax.M5.p.l(z12);
            ax.M5.p.f(string);
            ax.M5.p.l(l8);
            byte[] byArray = z12.l();
            this.k().K().c("Saving complex main event, appId, data size", this.g().c(string), byArray.length);
            z12 = new ContentValues();
            z12.put("app_id", string);
            z12.put("event_id", l8);
            z12.put("children_to_process", l9);
            z12.put("main_event", byArray);
            try {
                if (this.B().insertWithOnConflict("main_event_params", null, (ContentValues)z12, 5) == -1L) {
                    this.k().G().b("Failed to insert complex main event (got -1). appId", V1.v(string));
                    return false;
                }
            }
            catch (SQLiteException sQLiteException2) {
                break block3;
            }
            return true;
        }
        this.k().G().c("Error storing complex main event. appId", V1.v(string), (Object)sQLiteException2);
        return false;
    }

    protected final boolean l0() {
        return this.a().getDatabasePath("google_app_measurement.db").exists();
    }

    public final long w0(String string) {
        ax.M5.p.f(string);
        this.n();
        this.u();
        return this.G("select first_open_count from app2 where app_id=?", new String[]{string}, -1L);
    }

    @Override
    protected final boolean x() {
        return false;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected final long x0(String var1_1, String var2_3) {
        block9: {
            block8: {
                ax.M5.p.f(var1_1);
                ax.M5.p.f(var2_3);
                this.n();
                this.u();
                var10_4 = this.B();
                var10_4.beginTransaction();
                var7_5 = 0L;
                try {
                    var9_6 = new StringBuilder("select ");
                    var9_6.append(var2_3);
                    var9_6.append(" from app2 where app_id=?");
                    var3_11 = var5_10 = this.G(var9_6.toString(), new String[]{var1_1}, -1L);
                    if (var5_10 == -1L) {
                        var9_6 = new ContentValues();
                        var9_6.put("app_id", var1_1);
                        var9_6.put("first_open_count", 0);
                        var9_6.put("previous_install_count", 0);
                        if (var10_4.insertWithOnConflict("app2", null, (ContentValues)var9_6, 5) != -1L) break block8;
                        this.k().G().c("Failed to insert column (got -1). appId", V1.v(var1_1), var2_3);
                    }
                    ** GOTO lbl-1000
                }
                catch (Throwable var1_2) {
                    break block9;
                }
                catch (SQLiteException var9_7) {
                    var3_11 = var7_5;
                    ** GOTO lbl-1000
                }
                var10_4.endTransaction();
                return -1L;
            }
            var3_11 = 0L;
lbl-1000:
            // 2 sources

            {
                var9_6 = new ContentValues();
                var9_6.put("app_id", var1_1);
                var9_6.put(var2_3, 1L + var3_11);
                if ((long)var10_4.update("app2", (ContentValues)var9_6, "app_id = ?", new String[]{var1_1}) != 0L) ** GOTO lbl-1000
                this.k().G().c("Failed to update column (got 0). appId", V1.v(var1_1), var2_3);
            }
            var10_4.endTransaction();
            return -1L;
lbl-1000:
            // 1 sources

            {
                var10_4.setTransactionSuccessful();
            }
            var10_4.endTransaction();
            return var3_11;
lbl-1000:
            // 1 sources

            {
                this.k().G().d("Error inserting column. appId", V1.v(var1_1), var2_3, var9_9);
            }
            var10_4.endTransaction();
            return var3_11;
        }
        var10_4.endTransaction();
        throw var1_2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long y() {
        Throwable throwable2222222;
        Cursor cursor;
        block7: {
            long l8;
            Cursor cursor2;
            Cursor cursor3;
            block6: {
                cursor3 = null;
                cursor = null;
                cursor = cursor2 = this.B().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                cursor3 = cursor2;
                boolean bl = cursor2.moveToFirst();
                if (bl) break block6;
                {
                    block8: {
                        catch (Throwable throwable2222222) {
                            break block7;
                        }
                        catch (SQLiteException sQLiteException) {}
                        cursor = cursor3;
                        {
                            this.k().G().b("Error querying raw events", (Object)sQLiteException);
                            if (cursor3 == null) break block8;
                        }
                        cursor3.close();
                    }
                    return -1L;
                }
                cursor2.close();
                return -1L;
            }
            cursor = cursor2;
            cursor3 = cursor2;
            {
                l8 = cursor2.getLong(0);
            }
            cursor2.close();
            return l8;
        }
        if (cursor != null) {
            cursor.close();
        }
        throw throwable2222222;
    }

    public final long z() {
        return this.G("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List<C5> z0(String var1_1, String var2_5, String var3_6) {
        block15: {
            block20: {
                block16: {
                    block17: {
                        ax.M5.p.f((String)var1_1);
                        this.n();
                        this.u();
                        var13_11 = new ArrayList<C5>();
                        var12_12 = null;
                        var7_13 /* !! */  = null;
                        var9_15 /* !! */  = var11_14 = null;
                        var9_15 /* !! */  = var11_14;
                        var15_16 = new ArrayList(3);
                        var9_15 /* !! */  = var11_14;
                        var15_16.add(var1_1);
                        var9_15 /* !! */  = var11_14;
                        var9_15 /* !! */  = var11_14;
                        var14_17 = new StringBuilder("app_id=?");
                        var9_15 /* !! */  = var11_14;
                        var4_18 = TextUtils.isEmpty((CharSequence)var2_5);
                        if (var4_18) ** GOTO lbl41
                        var8_19 = var2_5;
                        var9_15 /* !! */  = var11_14;
                        var10_20 = var12_12;
                        var7_13 /* !! */  = var8_19;
                        ** GOTO lbl34
                        {
                            catch (Throwable var1_2) {
                                var7_13 /* !! */  = var9_15 /* !! */ ;
                                break block15;
                            }
                            catch (SQLiteException var3_9) {
                                var9_15 /* !! */  = var2_5;
                                var2_5 = var7_13 /* !! */ ;
                                break block16;
                            }
lbl34:
                            // 1 sources

                            var15_16.add(var8_19);
                            var9_15 /* !! */  = var11_14;
                            var10_20 = var12_12;
                            var7_13 /* !! */  = var8_19;
                            var14_17.append(" and origin=?");
lbl41:
                            // 2 sources

                            var8_19 = var2_5;
                            var9_15 /* !! */  = var11_14;
                            var10_20 = var12_12;
                            var7_13 /* !! */  = var8_19;
                            if (!TextUtils.isEmpty((CharSequence)var3_6)) {
                                var9_15 /* !! */  = var11_14;
                                var10_20 = var12_12;
                                var7_13 /* !! */  = var8_19;
                                var9_15 /* !! */  = var11_14;
                                var10_20 = var12_12;
                                var7_13 /* !! */  = var8_19;
                                var2_5 = new StringBuilder();
                                var9_15 /* !! */  = var11_14;
                                var10_20 = var12_12;
                                var7_13 /* !! */  = var8_19;
                                var2_5.append(var3_6);
                                var9_15 /* !! */  = var11_14;
                                var10_20 = var12_12;
                                var7_13 /* !! */  = var8_19;
                                var2_5.append("*");
                                var9_15 /* !! */  = var11_14;
                                var10_20 = var12_12;
                                var7_13 /* !! */  = var8_19;
                                var15_16.add(var2_5.toString());
                                var9_15 /* !! */  = var11_14;
                                var10_20 = var12_12;
                                var7_13 /* !! */  = var8_19;
                                var14_17.append(" and name glob ?");
                            }
                            var9_15 /* !! */  = var11_14;
                            var10_20 = var12_12;
                            var7_13 /* !! */  = var8_19;
                            var15_16 = var15_16.toArray(new String[var15_16.size()]);
                            var9_15 /* !! */  = var11_14;
                            var10_20 = var12_12;
                            var7_13 /* !! */  = var8_19;
                            var2_5 = this.B();
                            var9_15 /* !! */  = var11_14;
                            var10_20 = var12_12;
                            var7_13 /* !! */  = var8_19;
                            var14_17 = var14_17.toString();
                            var9_15 /* !! */  = var11_14;
                            var10_20 = var12_12;
                            var7_13 /* !! */  = var8_19;
                            var2_5 = var2_5.query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, (String)var14_17, var15_16, null, null, "rowid", "1001");
                            var9_15 /* !! */  = var2_5;
                            var10_20 = var2_5;
                            var7_13 /* !! */  = var8_19;
                            var4_18 = var2_5.moveToFirst();
                            if (var4_18) break block17;
                        }
                        var2_5.close();
                        return var13_11;
                    }
                    do {
                        block19: {
                            block18: {
                                var9_15 /* !! */  = var2_5;
                                var10_20 = var2_5;
                                var7_13 /* !! */  = var8_19;
                                {
                                    if (var13_11.size() >= 1000) {
                                        var9_15 /* !! */  = var2_5;
                                        var10_20 = var2_5;
                                        var7_13 /* !! */  = var8_19;
                                        this.k().G().b("Read more than the max allowed user properties, ignoring excess", 1000);
                                        break;
                                    }
                                    var9_15 /* !! */  = var2_5;
                                    var10_20 = var2_5;
                                    var7_13 /* !! */  = var8_19;
                                    var11_14 = var2_5.getString(0);
                                    var9_15 /* !! */  = var2_5;
                                    var10_20 = var2_5;
                                    var7_13 /* !! */  = var8_19;
                                    var5_21 = var2_5.getLong(1);
                                    var7_13 /* !! */  = var2_5;
                                    var9_15 /* !! */  = var8_19;
                                }
                                try {
                                    var10_20 = this.M((Cursor)var2_5, 2);
                                    var7_13 /* !! */  = var2_5;
                                    var9_15 /* !! */  = var8_19;
                                    var8_19 = var2_5.getString(3);
                                    if (var10_20 != null) break block18;
                                    var7_13 /* !! */  = var2_5;
                                    var9_15 /* !! */  = var8_19;
                                    this.k().G().d("(2)Read invalid user property value, ignoring it", V1.v((String)var1_1), var8_19, var3_6);
                                    break block19;
                                }
                                catch (Throwable var1_3) {
                                    break block15;
                                }
                                catch (SQLiteException var3_8) {
                                    break block16;
                                }
                            }
                            var7_13 /* !! */  = var2_5;
                            var9_15 /* !! */  = var8_19;
                            var7_13 /* !! */  = var2_5;
                            var9_15 /* !! */  = var8_19;
                            var12_12 = new C5((String)var1_1, var8_19, var11_14, var5_21, var10_20);
                            var7_13 /* !! */  = var2_5;
                            var9_15 /* !! */  = var8_19;
                            var13_11.add((C5)var12_12);
                        }
                        var7_13 /* !! */  = var2_5;
                        var9_15 /* !! */  = var8_19;
                    } while (var4_18 = var2_5.moveToNext());
                    var2_5.close();
                    return var13_11;
                }
                var7_13 /* !! */  = var2_5;
                {
                    this.k().G().d("(2)Error querying user properties", V1.v((String)var1_1), var9_15 /* !! */ , var3_10);
                    var7_13 /* !! */  = var2_5;
                    var1_1 = Collections.EMPTY_LIST;
                    if (var2_5 == null) break block20;
                }
                var2_5.close();
            }
            return var1_1;
        }
        if (var7_13 /* !! */  != null) {
            var7_13 /* !! */ .close();
        }
        throw var1_4;
    }
}

