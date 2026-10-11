/*
 * Decompiled with CFR 0.152.
 */
package ax.x5;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import ax.x5.O;
import ax.x5.P;
import ax.x5.Q;
import ax.x5.S;
import ax.x5.T;
import ax.x5.U;
import ax.x5.V;
import java.util.Arrays;
import java.util.List;

final class W
extends SQLiteOpenHelper {
    private static final String d0;
    static int e0;
    private static final a f0;
    private static final a g0;
    private static final a h0;
    private static final a i0;
    private static final a j0;
    private static final a k0;
    private static final a l0;
    private static final List<a> m0;
    private boolean c0 = false;
    private final int q;

    static {
        Object object = new StringBuilder();
        ((StringBuilder)object).append("INSERT INTO global_log_event_state VALUES (");
        ((StringBuilder)object).append(System.currentTimeMillis());
        ((StringBuilder)object).append(")");
        d0 = ((StringBuilder)object).toString();
        e0 = 7;
        O o8 = new O();
        f0 = o8;
        P p8 = new P();
        g0 = p8;
        Q q8 = new Q();
        h0 = q8;
        S s8 = new S();
        i0 = s8;
        T t8 = new T();
        j0 = t8;
        k0 = object = new U();
        V v8 = new V();
        l0 = v8;
        m0 = Arrays.asList(o8, p8, q8, s8, t8, object, v8);
    }

    W(Context context, String string, int n8) {
        super(context, string, null, n8);
        this.q = n8;
    }

    public static /* synthetic */ void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    public static /* synthetic */ void b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN pseudonymous_id TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_clear_blob BLOB");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_encrypted_blob BLOB");
    }

    public static /* synthetic */ void c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }

    public static /* synthetic */ void d(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(d0);
    }

    public static /* synthetic */ void e(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN product_id INTEGER");
    }

    public static /* synthetic */ void f(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    public static /* synthetic */ void g(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    private void j(SQLiteDatabase sQLiteDatabase) {
        if (!this.c0) {
            this.onConfigure(sQLiteDatabase);
        }
    }

    private void m(SQLiteDatabase sQLiteDatabase, int n8) {
        this.j(sQLiteDatabase);
        this.o(sQLiteDatabase, 0, n8);
    }

    private void o(SQLiteDatabase object, int n8, int n9) {
        List<a> list = m0;
        if (n9 <= list.size()) {
            while (n8 < n9) {
                m0.get(n8).a((SQLiteDatabase)object);
                ++n8;
            }
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Migration from ");
        ((StringBuilder)object).append(n8);
        ((StringBuilder)object).append(" to ");
        ((StringBuilder)object).append(n9);
        ((StringBuilder)object).append(" was requested, but cannot be performed. Only ");
        ((StringBuilder)object).append(list.size());
        ((StringBuilder)object).append(" migrations are provided");
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.c0 = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.m(sQLiteDatabase, this.q);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int n8, int n9) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        this.m(sQLiteDatabase, n9);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        this.j(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int n8, int n9) {
        this.j(sQLiteDatabase);
        this.o(sQLiteDatabase, n8, n9);
    }

    public static interface a {
        public void a(SQLiteDatabase var1);
    }
}

