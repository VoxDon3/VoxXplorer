/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import com.google.firebase.remoteconfig.internal.d;
import java.util.Date;

public class e {
    static final Date e = new Date(-1L);
    static final Date f = new Date(-1L);
    private final SharedPreferences a;
    private final Object b;
    private final Object c;
    private final Object d;

    public e(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
        this.b = new Object();
        this.c = new Object();
        this.d = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    a a() {
        Object object = this.c;
        synchronized (object) {
            int n8 = this.a.getInt("num_failed_fetches", 0);
            Date date = new Date(this.a.getLong("backoff_end_time_in_millis", -1L));
            return new a(n8, date);
        }
    }

    public long b() {
        return this.a.getLong("fetch_timeout_in_seconds", 60L);
    }

    String c() {
        return this.a.getString("last_fetch_etag", null);
    }

    Date d() {
        return new Date(this.a.getLong("last_fetch_time_in_millis", -1L));
    }

    long e() {
        return this.a.getLong("last_template_version", 0L);
    }

    public long f() {
        return this.a.getLong("minimum_fetch_interval_in_seconds", com.google.firebase.remoteconfig.internal.d.j);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public b g() {
        Object object = this.d;
        synchronized (object) {
            int n8 = this.a.getInt("num_failed_realtime_streams", 0);
            Date date = new Date(this.a.getLong("realtime_backoff_end_time_in_millis", -1L));
            return new b(n8, date);
        }
    }

    void h() {
        this.j(0, f);
    }

    void i() {
        this.m(0, f);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void j(int n8, Date date) {
        Object object = this.c;
        synchronized (object) {
            this.a.edit().putInt("num_failed_fetches", n8).putLong("backoff_end_time_in_millis", date.getTime()).apply();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void k(String string) {
        Object object = this.b;
        synchronized (object) {
            this.a.edit().putString("last_fetch_etag", string).apply();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void l(long l8) {
        Object object = this.b;
        synchronized (object) {
            this.a.edit().putLong("last_template_version", l8).apply();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void m(int n8, Date date) {
        Object object = this.d;
        synchronized (object) {
            this.a.edit().putInt("num_failed_realtime_streams", n8).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void n() {
        Object object = this.b;
        synchronized (object) {
            this.a.edit().putInt("last_fetch_status", 1).apply();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void o(Date date) {
        Object object = this.b;
        synchronized (object) {
            this.a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void p() {
        Object object = this.b;
        synchronized (object) {
            this.a.edit().putInt("last_fetch_status", 2).apply();
            return;
        }
    }

    static class a {
        private int a;
        private Date b;

        a(int n8, Date date) {
            this.a = n8;
            this.b = date;
        }

        Date a() {
            return this.b;
        }

        int b() {
            return this.a;
        }
    }

    public static class b {
        private int a;
        private Date b;

        public b(int n8, Date date) {
            this.a = n8;
            this.b = date;
        }

        Date a() {
            return this.b;
        }

        int b() {
            return this.a;
        }
    }
}

