/*
 * Decompiled with CFR 0.152.
 */
package ax.K2;

import android.database.Cursor;
import androidx.work.b;
import ax.B2.a;
import ax.B2.b;
import ax.B2.j;
import ax.B2.m;
import ax.B2.r;
import ax.K2.C;
import ax.K2.v;
import ax.K2.w;
import ax.k2.A;
import ax.k2.h;
import ax.k2.i;
import ax.k2.u;
import ax.o2.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class x
implements w {
    private final u a;
    private final i<v> b;
    private final h<v> c;
    private final A d;
    private final A e;
    private final A f;
    private final A g;
    private final A h;
    private final A i;
    private final A j;
    private final A k;
    private final A l;
    private final A m;
    private final A n;

    public x(u u8) {
        this.a = u8;
        this.b = new i<v>(this, u8){
            final x d;
            {
                this.d = x8;
                super(u8);
            }

            @Override
            public String e() {
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            public void k(k k8, v object) {
                Object object2 = ((v)object).a;
                if (object2 == null) {
                    k8.t0(1);
                } else {
                    k8.D(1, (String)object2);
                }
                object2 = C.a;
                k8.X(2, C.j(((v)object).b));
                object2 = ((v)object).c;
                if (object2 == null) {
                    k8.t0(3);
                } else {
                    k8.D(3, (String)object2);
                }
                object2 = ((v)object).d;
                if (object2 == null) {
                    k8.t0(4);
                } else {
                    k8.D(4, (String)object2);
                }
                object2 = androidx.work.b.k(((v)object).e);
                if (object2 == null) {
                    k8.t0(5);
                } else {
                    k8.e0(5, (byte[])object2);
                }
                object2 = androidx.work.b.k(((v)object).f);
                if (object2 == null) {
                    k8.t0(6);
                } else {
                    k8.e0(6, (byte[])object2);
                }
                k8.X(7, ((v)object).g);
                k8.X(8, ((v)object).h);
                k8.X(9, ((v)object).i);
                k8.X(10, ((v)object).k);
                k8.X(11, C.a(((v)object).l));
                k8.X(12, ((v)object).m);
                k8.X(13, ((v)object).n);
                k8.X(14, ((v)object).o);
                k8.X(15, ((v)object).p);
                k8.X(16, (long)((v)object).q);
                k8.X(17, C.h(((v)object).r));
                k8.X(18, ((v)object).e());
                k8.X(19, ((v)object).d());
                object = ((v)object).j;
                if (object != null) {
                    k8.X(20, C.g(((ax.B2.b)object).d()));
                    k8.X(21, (long)((ax.B2.b)object).g());
                    k8.X(22, (long)((ax.B2.b)object).h());
                    k8.X(23, (long)((ax.B2.b)object).f());
                    k8.X(24, (long)((ax.B2.b)object).i());
                    k8.X(25, ((ax.B2.b)object).b());
                    k8.X(26, ((ax.B2.b)object).a());
                    object = C.i(((ax.B2.b)object).c());
                    if (object == null) {
                        k8.t0(27);
                        return;
                    }
                    k8.e0(27, (byte[])object);
                    return;
                }
                k8.t0(20);
                k8.t0(21);
                k8.t0(22);
                k8.t0(23);
                k8.t0(24);
                k8.t0(25);
                k8.t0(26);
                k8.t0(27);
            }
        };
        this.c = new h<v>(this, u8){
            final x d;
            {
                this.d = x8;
                super(u8);
            }

            @Override
            public String e() {
                return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
            }
        };
        this.d = new A(this, u8){
            final x d;
            {
                this.d = x8;
                super(u8);
            }

            @Override
            public String e() {
                return "DELETE FROM workspec WHERE id=?";
            }
        };
        this.e = new A(this, u8){
            final x d;
            {
                this.d = x8;
                super(u8);
            }

            @Override
            public String e() {
                return "UPDATE workspec SET state=? WHERE id=?";
            }
        };
        this.f = new A(this, u8){
            final x d;
            {
                this.d = x8;
                super(u8);
            }

            @Override
            public String e() {
                return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
            }
        };
        this.g = new A(this, u8){
            final x d;
            {
                this.d = x8;
                super(u8);
            }

            @Override
            public String e() {
                return "UPDATE workspec SET output=? WHERE id=?";
            }
        };
        this.h = new A(this, u8){
            final x d;
            {
                this.d = x8;
                super(u8);
            }

            @Override
            public String e() {
                return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
            }
        };
        this.i = new A(this, u8){
            final x d;
            {
                this.d = x8;
                super(u8);
            }

            @Override
            public String e() {
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
            }
        };
        this.j = new A(this, u8){
            final x d;
            {
                this.d = x8;
                super(u8);
            }

            @Override
            public String e() {
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            }
        };
        this.k = new A(this, u8){
            final x d;
            {
                this.d = x8;
                super(u8);
            }

            @Override
            public String e() {
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            }
        };
        this.l = new A(this, u8){
            final x d;
            {
                this.d = x8;
                super(u8);
            }

            @Override
            public String e() {
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
            }
        };
        this.m = new A(this, u8){
            final x d;
            {
                this.d = x8;
                super(u8);
            }

            @Override
            public String e() {
                return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
            }
        };
        this.n = new A(this, u8){
            final x d;
            {
                this.d = x8;
                super(u8);
            }

            @Override
            public String e() {
                return "UPDATE workspec SET generation=generation+1 WHERE id=?";
            }
        };
    }

    public static List<Class<?>> v() {
        return Collections.EMPTY_LIST;
    }

    @Override
    public void a(String string) {
        this.a.d();
        k k8 = this.f.b();
        if (string == null) {
            k8.t0(1);
        } else {
            k8.D(1, string);
        }
        this.a.e();
        try {
            k8.I();
            this.a.A();
            return;
        }
        finally {
            this.a.i();
            this.f.h(k8);
        }
    }

    @Override
    public int b(String string, long l8) {
        this.a.d();
        k k8 = this.k.b();
        k8.X(1, l8);
        if (string == null) {
            k8.t0(2);
        } else {
            k8.D(2, string);
        }
        this.a.e();
        try {
            int n8 = k8.I();
            this.a.A();
            return n8;
        }
        finally {
            this.a.i();
            this.k.h(k8);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public List<v.b> c(String string) {
        Throwable throwable2;
        Cursor cursor;
        ax.k2.x x8;
        block5: {
            ArrayList<v.b> arrayList;
            x8 = ax.k2.x.c("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
            if (string == null) {
                x8.t0(1);
            } else {
                x8.D(1, string);
            }
            this.a.d();
            cursor = ax.m2.b.b(this.a, x8, false, null);
            try {
                arrayList = new ArrayList<v.b>(cursor.getCount());
                while (cursor.moveToNext()) {
                    string = cursor.isNull(0) ? null : cursor.getString(0);
                    r r8 = C.f(cursor.getInt(1));
                    v.b b8 = new v.b(string, r8);
                    arrayList.add(b8);
                }
            }
            catch (Throwable throwable2) {
                break block5;
            }
            cursor.close();
            x8.f();
            return arrayList;
        }
        cursor.close();
        x8.f();
        throw throwable2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public List<v> d(long l8) {
        RuntimeException var54_51;
        Cursor cursor;
        ax.k2.x x8;
        block5: {
            ArrayList<v> arrayList;
            int n8;
            int n9;
            int n10;
            int n11;
            int n12;
            int n13;
            int n14;
            int n15;
            int n16;
            int n17;
            int n18;
            int n19;
            int n20;
            int n21;
            x8 = ax.k2.x.c("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
            x8.X(1, l8);
            this.a.d();
            cursor = ax.m2.b.b(this.a, x8, false, null);
            try {
                n21 = ax.m2.a.e(cursor, "id");
                n20 = ax.m2.a.e(cursor, "state");
                n19 = ax.m2.a.e(cursor, "worker_class_name");
                n18 = ax.m2.a.e(cursor, "input_merger_class_name");
                n17 = ax.m2.a.e(cursor, "input");
                n16 = ax.m2.a.e(cursor, "output");
                n15 = ax.m2.a.e(cursor, "initial_delay");
                n14 = ax.m2.a.e(cursor, "interval_duration");
                n13 = ax.m2.a.e(cursor, "flex_duration");
                n12 = ax.m2.a.e(cursor, "run_attempt_count");
                n11 = ax.m2.a.e(cursor, "backoff_policy");
                n10 = ax.m2.a.e(cursor, "backoff_delay_duration");
                n9 = ax.m2.a.e(cursor, "last_enqueue_time");
                n8 = ax.m2.a.e(cursor, "minimum_retention_duration");
            }
            catch (Throwable throwable) {
                // empty catch block
                break block5;
            }
            try {
                int n22 = ax.m2.a.e(cursor, "schedule_requested_at");
                int n23 = ax.m2.a.e(cursor, "run_in_foreground");
                int n24 = ax.m2.a.e(cursor, "out_of_quota_policy");
                int n25 = ax.m2.a.e(cursor, "period_count");
                int n26 = ax.m2.a.e(cursor, "generation");
                int n27 = ax.m2.a.e(cursor, "required_network_type");
                int n28 = ax.m2.a.e(cursor, "requires_charging");
                int n29 = ax.m2.a.e(cursor, "requires_device_idle");
                int n30 = ax.m2.a.e(cursor, "requires_battery_not_low");
                int n31 = ax.m2.a.e(cursor, "requires_storage_not_low");
                int n32 = ax.m2.a.e(cursor, "trigger_content_update_delay");
                int n33 = ax.m2.a.e(cursor, "trigger_max_content_delay");
                int n34 = ax.m2.a.e(cursor, "content_uri_triggers");
                arrayList = new ArrayList<v>(cursor.getCount());
                while (cursor.moveToNext()) {
                    String string = cursor.isNull(n21) ? null : cursor.getString(n21);
                    r r8 = C.f(cursor.getInt(n20));
                    String string2 = cursor.isNull(n19) ? null : cursor.getString(n19);
                    String string3 = cursor.isNull(n18) ? null : cursor.getString(n18);
                    Object object = cursor.isNull(n17) ? null : cursor.getBlob(n17);
                    b b8 = androidx.work.b.g(object);
                    object = cursor.isNull(n16) ? null : cursor.getBlob(n16);
                    b b9 = androidx.work.b.g(object);
                    long l9 = cursor.getLong(n15);
                    long l10 = cursor.getLong(n14);
                    long l11 = cursor.getLong(n13);
                    int n35 = cursor.getInt(n12);
                    a a8 = C.c(cursor.getInt(n11));
                    long l12 = cursor.getLong(n10);
                    long l13 = cursor.getLong(n9);
                    long l14 = cursor.getLong(n8);
                    long l15 = cursor.getLong(n22);
                    boolean bl = cursor.getInt(n23) != 0;
                    m m8 = C.e(cursor.getInt(n24));
                    int n36 = cursor.getInt(n25);
                    int n37 = cursor.getInt(n26);
                    Object object2 = C.d(cursor.getInt(n27));
                    boolean bl2 = cursor.getInt(n28) != 0;
                    boolean bl3 = cursor.getInt(n29) != 0;
                    boolean bl4 = cursor.getInt(n30) != 0;
                    boolean bl5 = cursor.getInt(n31) != 0;
                    long l16 = cursor.getLong(n32);
                    l8 = cursor.getLong(n33);
                    object = cursor.isNull(n34) ? null : cursor.getBlob(n34);
                    Set<b.b> set = C.b(object);
                    object = new ax.B2.b;
                    object((j)((Object)object2), bl2, bl3, bl4, bl5, l16, l8, set);
                    object2 = new v(string, r8, string2, string3, b8, b9, l9, l10, l11, (ax.B2.b)object, n35, a8, l12, l13, l14, l15, bl, m8, n36, n37);
                    arrayList.add((v)object2);
                }
            }
            catch (Throwable throwable) {
                break block5;
            }
            cursor.close();
            x8.f();
            return arrayList;
        }
        cursor.close();
        x8.f();
        throw var54_51;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public List<v> e(int n8) {
        RuntimeException var54_51;
        Cursor cursor;
        ax.k2.x x8;
        block5: {
            ArrayList<v> arrayList;
            int n9;
            int n10;
            int n11;
            int n12;
            int n13;
            int n14;
            int n15;
            int n16;
            int n17;
            int n18;
            int n19;
            int n20;
            int n21;
            x8 = ax.k2.x.c("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
            x8.X(1, n8);
            this.a.d();
            cursor = ax.m2.b.b(this.a, x8, false, null);
            try {
                n21 = ax.m2.a.e(cursor, "id");
                n20 = ax.m2.a.e(cursor, "state");
                n19 = ax.m2.a.e(cursor, "worker_class_name");
                n18 = ax.m2.a.e(cursor, "input_merger_class_name");
                n17 = ax.m2.a.e(cursor, "input");
                n16 = ax.m2.a.e(cursor, "output");
                n15 = ax.m2.a.e(cursor, "initial_delay");
                n14 = ax.m2.a.e(cursor, "interval_duration");
                n13 = ax.m2.a.e(cursor, "flex_duration");
                n12 = ax.m2.a.e(cursor, "run_attempt_count");
                n11 = ax.m2.a.e(cursor, "backoff_policy");
                n10 = ax.m2.a.e(cursor, "backoff_delay_duration");
                n9 = ax.m2.a.e(cursor, "last_enqueue_time");
                n8 = ax.m2.a.e(cursor, "minimum_retention_duration");
            }
            catch (Throwable throwable) {
                // empty catch block
                break block5;
            }
            try {
                int n22 = ax.m2.a.e(cursor, "schedule_requested_at");
                int n23 = ax.m2.a.e(cursor, "run_in_foreground");
                int n24 = ax.m2.a.e(cursor, "out_of_quota_policy");
                int n25 = ax.m2.a.e(cursor, "period_count");
                int n26 = ax.m2.a.e(cursor, "generation");
                int n27 = ax.m2.a.e(cursor, "required_network_type");
                int n28 = ax.m2.a.e(cursor, "requires_charging");
                int n29 = ax.m2.a.e(cursor, "requires_device_idle");
                int n30 = ax.m2.a.e(cursor, "requires_battery_not_low");
                int n31 = ax.m2.a.e(cursor, "requires_storage_not_low");
                int n32 = ax.m2.a.e(cursor, "trigger_content_update_delay");
                int n33 = ax.m2.a.e(cursor, "trigger_max_content_delay");
                int n34 = ax.m2.a.e(cursor, "content_uri_triggers");
                arrayList = new ArrayList<v>(cursor.getCount());
                while (cursor.moveToNext()) {
                    String string = cursor.isNull(n21) ? null : cursor.getString(n21);
                    r r8 = C.f(cursor.getInt(n20));
                    String string2 = cursor.isNull(n19) ? null : cursor.getString(n19);
                    String string3 = cursor.isNull(n18) ? null : cursor.getString(n18);
                    Object object = cursor.isNull(n17) ? null : cursor.getBlob(n17);
                    b b8 = androidx.work.b.g(object);
                    object = cursor.isNull(n16) ? null : cursor.getBlob(n16);
                    b b9 = androidx.work.b.g(object);
                    long l8 = cursor.getLong(n15);
                    long l9 = cursor.getLong(n14);
                    long l10 = cursor.getLong(n13);
                    int n35 = cursor.getInt(n12);
                    a a8 = C.c(cursor.getInt(n11));
                    long l11 = cursor.getLong(n10);
                    long l12 = cursor.getLong(n9);
                    long l13 = cursor.getLong(n8);
                    long l14 = cursor.getLong(n22);
                    boolean bl = cursor.getInt(n23) != 0;
                    m m8 = C.e(cursor.getInt(n24));
                    int n36 = cursor.getInt(n25);
                    int n37 = cursor.getInt(n26);
                    Object object2 = C.d(cursor.getInt(n27));
                    boolean bl2 = cursor.getInt(n28) != 0;
                    boolean bl3 = cursor.getInt(n29) != 0;
                    boolean bl4 = cursor.getInt(n30) != 0;
                    boolean bl5 = cursor.getInt(n31) != 0;
                    long l15 = cursor.getLong(n32);
                    long l16 = cursor.getLong(n33);
                    object = cursor.isNull(n34) ? null : cursor.getBlob(n34);
                    Set<b.b> set = C.b(object);
                    object = new ax.B2.b;
                    object((j)((Object)object2), bl2, bl3, bl4, bl5, l15, l16, set);
                    object2 = new v(string, r8, string2, string3, b8, b9, l8, l9, l10, (ax.B2.b)object, n35, a8, l11, l12, l13, l14, bl, m8, n36, n37);
                    arrayList.add((v)object2);
                }
            }
            catch (Throwable throwable) {
                break block5;
            }
            cursor.close();
            x8.f();
            return arrayList;
        }
        cursor.close();
        x8.f();
        throw var54_51;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public List<v> f() {
        RuntimeException var54_51;
        Cursor cursor;
        ax.k2.x x8;
        block5: {
            ArrayList<v> arrayList;
            int n8;
            int n9;
            int n10;
            int n11;
            int n12;
            int n13;
            int n14;
            int n15;
            int n16;
            int n17;
            int n18;
            int n19;
            int n20;
            int n21;
            x8 = ax.k2.x.c("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
            this.a.d();
            cursor = ax.m2.b.b(this.a, x8, false, null);
            try {
                n21 = ax.m2.a.e(cursor, "id");
                n20 = ax.m2.a.e(cursor, "state");
                n19 = ax.m2.a.e(cursor, "worker_class_name");
                n18 = ax.m2.a.e(cursor, "input_merger_class_name");
                n17 = ax.m2.a.e(cursor, "input");
                n16 = ax.m2.a.e(cursor, "output");
                n15 = ax.m2.a.e(cursor, "initial_delay");
                n14 = ax.m2.a.e(cursor, "interval_duration");
                n13 = ax.m2.a.e(cursor, "flex_duration");
                n12 = ax.m2.a.e(cursor, "run_attempt_count");
                n11 = ax.m2.a.e(cursor, "backoff_policy");
                n10 = ax.m2.a.e(cursor, "backoff_delay_duration");
                n9 = ax.m2.a.e(cursor, "last_enqueue_time");
                n8 = ax.m2.a.e(cursor, "minimum_retention_duration");
            }
            catch (Throwable throwable) {
                // empty catch block
                break block5;
            }
            try {
                int n22 = ax.m2.a.e(cursor, "schedule_requested_at");
                int n23 = ax.m2.a.e(cursor, "run_in_foreground");
                int n24 = ax.m2.a.e(cursor, "out_of_quota_policy");
                int n25 = ax.m2.a.e(cursor, "period_count");
                int n26 = ax.m2.a.e(cursor, "generation");
                int n27 = ax.m2.a.e(cursor, "required_network_type");
                int n28 = ax.m2.a.e(cursor, "requires_charging");
                int n29 = ax.m2.a.e(cursor, "requires_device_idle");
                int n30 = ax.m2.a.e(cursor, "requires_battery_not_low");
                int n31 = ax.m2.a.e(cursor, "requires_storage_not_low");
                int n32 = ax.m2.a.e(cursor, "trigger_content_update_delay");
                int n33 = ax.m2.a.e(cursor, "trigger_max_content_delay");
                int n34 = ax.m2.a.e(cursor, "content_uri_triggers");
                arrayList = new ArrayList<v>(cursor.getCount());
                while (cursor.moveToNext()) {
                    String string = cursor.isNull(n21) ? null : cursor.getString(n21);
                    r r8 = C.f(cursor.getInt(n20));
                    String string2 = cursor.isNull(n19) ? null : cursor.getString(n19);
                    String string3 = cursor.isNull(n18) ? null : cursor.getString(n18);
                    Object object = cursor.isNull(n17) ? null : cursor.getBlob(n17);
                    b b8 = androidx.work.b.g(object);
                    object = cursor.isNull(n16) ? null : cursor.getBlob(n16);
                    b b9 = androidx.work.b.g(object);
                    long l8 = cursor.getLong(n15);
                    long l9 = cursor.getLong(n14);
                    long l10 = cursor.getLong(n13);
                    int n35 = cursor.getInt(n12);
                    a a8 = C.c(cursor.getInt(n11));
                    long l11 = cursor.getLong(n10);
                    long l12 = cursor.getLong(n9);
                    long l13 = cursor.getLong(n8);
                    long l14 = cursor.getLong(n22);
                    boolean bl = cursor.getInt(n23) != 0;
                    m m8 = C.e(cursor.getInt(n24));
                    int n36 = cursor.getInt(n25);
                    int n37 = cursor.getInt(n26);
                    Object object2 = C.d(cursor.getInt(n27));
                    boolean bl2 = cursor.getInt(n28) != 0;
                    boolean bl3 = cursor.getInt(n29) != 0;
                    boolean bl4 = cursor.getInt(n30) != 0;
                    boolean bl5 = cursor.getInt(n31) != 0;
                    long l15 = cursor.getLong(n32);
                    long l16 = cursor.getLong(n33);
                    object = cursor.isNull(n34) ? null : cursor.getBlob(n34);
                    Set<b.b> set = C.b(object);
                    object = new ax.B2.b;
                    object((j)((Object)object2), bl2, bl3, bl4, bl5, l15, l16, set);
                    object2 = new v(string, r8, string2, string3, b8, b9, l8, l9, l10, (ax.B2.b)object, n35, a8, l11, l12, l13, l14, bl, m8, n36, n37);
                    arrayList.add((v)object2);
                }
            }
            catch (Throwable throwable) {
                break block5;
            }
            cursor.close();
            x8.f();
            return arrayList;
        }
        cursor.close();
        x8.f();
        throw var54_51;
    }

    @Override
    public void g(String string, b object) {
        this.a.d();
        k k8 = this.g.b();
        object = androidx.work.b.k((b)object);
        if (object == null) {
            k8.t0(1);
        } else {
            k8.e0(1, (byte[])object);
        }
        if (string == null) {
            k8.t0(2);
        } else {
            k8.D(2, string);
        }
        this.a.e();
        try {
            k8.I();
            this.a.A();
            return;
        }
        finally {
            this.a.i();
            this.g.h(k8);
        }
    }

    @Override
    public void h(String string) {
        this.a.d();
        k k8 = this.d.b();
        if (string == null) {
            k8.t0(1);
        } else {
            k8.D(1, string);
        }
        this.a.e();
        try {
            k8.I();
            this.a.A();
            return;
        }
        finally {
            this.a.i();
            this.d.h(k8);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public List<v> i() {
        RuntimeException var54_51;
        Cursor cursor;
        ax.k2.x x8;
        block5: {
            ArrayList<v> arrayList;
            int n8;
            int n9;
            int n10;
            int n11;
            int n12;
            int n13;
            int n14;
            int n15;
            int n16;
            int n17;
            int n18;
            int n19;
            int n20;
            int n21;
            x8 = ax.k2.x.c("SELECT * FROM workspec WHERE state=1", 0);
            this.a.d();
            cursor = ax.m2.b.b(this.a, x8, false, null);
            try {
                n21 = ax.m2.a.e(cursor, "id");
                n20 = ax.m2.a.e(cursor, "state");
                n19 = ax.m2.a.e(cursor, "worker_class_name");
                n18 = ax.m2.a.e(cursor, "input_merger_class_name");
                n17 = ax.m2.a.e(cursor, "input");
                n16 = ax.m2.a.e(cursor, "output");
                n15 = ax.m2.a.e(cursor, "initial_delay");
                n14 = ax.m2.a.e(cursor, "interval_duration");
                n13 = ax.m2.a.e(cursor, "flex_duration");
                n12 = ax.m2.a.e(cursor, "run_attempt_count");
                n11 = ax.m2.a.e(cursor, "backoff_policy");
                n10 = ax.m2.a.e(cursor, "backoff_delay_duration");
                n9 = ax.m2.a.e(cursor, "last_enqueue_time");
                n8 = ax.m2.a.e(cursor, "minimum_retention_duration");
            }
            catch (Throwable throwable) {
                // empty catch block
                break block5;
            }
            try {
                int n22 = ax.m2.a.e(cursor, "schedule_requested_at");
                int n23 = ax.m2.a.e(cursor, "run_in_foreground");
                int n24 = ax.m2.a.e(cursor, "out_of_quota_policy");
                int n25 = ax.m2.a.e(cursor, "period_count");
                int n26 = ax.m2.a.e(cursor, "generation");
                int n27 = ax.m2.a.e(cursor, "required_network_type");
                int n28 = ax.m2.a.e(cursor, "requires_charging");
                int n29 = ax.m2.a.e(cursor, "requires_device_idle");
                int n30 = ax.m2.a.e(cursor, "requires_battery_not_low");
                int n31 = ax.m2.a.e(cursor, "requires_storage_not_low");
                int n32 = ax.m2.a.e(cursor, "trigger_content_update_delay");
                int n33 = ax.m2.a.e(cursor, "trigger_max_content_delay");
                int n34 = ax.m2.a.e(cursor, "content_uri_triggers");
                arrayList = new ArrayList<v>(cursor.getCount());
                while (cursor.moveToNext()) {
                    String string = cursor.isNull(n21) ? null : cursor.getString(n21);
                    r r8 = C.f(cursor.getInt(n20));
                    String string2 = cursor.isNull(n19) ? null : cursor.getString(n19);
                    String string3 = cursor.isNull(n18) ? null : cursor.getString(n18);
                    Object object = cursor.isNull(n17) ? null : cursor.getBlob(n17);
                    b b8 = androidx.work.b.g(object);
                    object = cursor.isNull(n16) ? null : cursor.getBlob(n16);
                    b b9 = androidx.work.b.g(object);
                    long l8 = cursor.getLong(n15);
                    long l9 = cursor.getLong(n14);
                    long l10 = cursor.getLong(n13);
                    int n35 = cursor.getInt(n12);
                    a a8 = C.c(cursor.getInt(n11));
                    long l11 = cursor.getLong(n10);
                    long l12 = cursor.getLong(n9);
                    long l13 = cursor.getLong(n8);
                    long l14 = cursor.getLong(n22);
                    boolean bl = cursor.getInt(n23) != 0;
                    m m8 = C.e(cursor.getInt(n24));
                    int n36 = cursor.getInt(n25);
                    int n37 = cursor.getInt(n26);
                    Object object2 = C.d(cursor.getInt(n27));
                    boolean bl2 = cursor.getInt(n28) != 0;
                    boolean bl3 = cursor.getInt(n29) != 0;
                    boolean bl4 = cursor.getInt(n30) != 0;
                    boolean bl5 = cursor.getInt(n31) != 0;
                    long l15 = cursor.getLong(n32);
                    long l16 = cursor.getLong(n33);
                    object = cursor.isNull(n34) ? null : cursor.getBlob(n34);
                    Set<b.b> set = C.b(object);
                    object = new ax.B2.b;
                    object((j)((Object)object2), bl2, bl3, bl4, bl5, l15, l16, set);
                    object2 = new v(string, r8, string2, string3, b8, b9, l8, l9, l10, (ax.B2.b)object, n35, a8, l11, l12, l13, l14, bl, m8, n36, n37);
                    arrayList.add((v)object2);
                }
            }
            catch (Throwable throwable) {
                break block5;
            }
            cursor.close();
            x8.f();
            return arrayList;
        }
        cursor.close();
        x8.f();
        throw var54_51;
    }

    @Override
    public int j(r r8, String string) {
        this.a.d();
        k k8 = this.e.b();
        k8.X(1, C.j(r8));
        if (string == null) {
            k8.t0(2);
        } else {
            k8.D(2, string);
        }
        this.a.e();
        try {
            int n8 = k8.I();
            this.a.A();
            return n8;
        }
        finally {
            this.a.i();
            this.e.h(k8);
        }
    }

    @Override
    public boolean k() {
        Throwable throwable2;
        Cursor cursor;
        ax.k2.x x8;
        block3: {
            boolean bl;
            block2: {
                boolean bl2 = false;
                x8 = ax.k2.x.c("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
                this.a.d();
                cursor = ax.m2.b.b(this.a, x8, false, null);
                bl = bl2;
                try {
                    if (!cursor.moveToFirst()) break block2;
                    int n8 = cursor.getInt(0);
                    bl = bl2;
                    if (n8 == 0) break block2;
                    bl = true;
                }
                catch (Throwable throwable2) {
                    break block3;
                }
            }
            cursor.close();
            x8.f();
            return bl;
        }
        cursor.close();
        x8.f();
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public List<String> l(String string) {
        Throwable throwable2;
        Cursor cursor;
        ax.k2.x x8;
        block5: {
            ArrayList<String> arrayList;
            x8 = ax.k2.x.c("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
            if (string == null) {
                x8.t0(1);
            } else {
                x8.D(1, string);
            }
            this.a.d();
            cursor = ax.m2.b.b(this.a, x8, false, null);
            try {
                arrayList = new ArrayList<String>(cursor.getCount());
                while (cursor.moveToNext()) {
                    string = cursor.isNull(0) ? null : cursor.getString(0);
                    arrayList.add(string);
                }
            }
            catch (Throwable throwable2) {
                break block5;
            }
            cursor.close();
            x8.f();
            return arrayList;
        }
        cursor.close();
        x8.f();
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public r m(String object) {
        Throwable throwable2222;
        Cursor cursor;
        ax.k2.x x8;
        block7: {
            block6: {
                x8 = ax.k2.x.c("SELECT state FROM workspec WHERE id=?", 1);
                if (object == null) {
                    x8.t0(1);
                } else {
                    x8.D(1, (String)object);
                }
                this.a.d();
                object = this.a;
                C c8 = null;
                cursor = ax.m2.b.b((u)object, x8, false, null);
                object = c8;
                try {
                    if (!cursor.moveToFirst()) break block6;
                    object = cursor.isNull(0) ? null : Integer.valueOf(cursor.getInt(0));
                    if (object == null) {
                        object = c8;
                    } else {
                        c8 = C.a;
                        object = C.f((Integer)object);
                    }
                }
                catch (Throwable throwable2222) {
                    break block7;
                }
            }
            cursor.close();
            x8.f();
            return object;
        }
        cursor.close();
        x8.f();
        throw throwable2222;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public v n(String object) {
        RuntimeException var1_4;
        Cursor cursor;
        ax.k2.x x8;
        block12: {
            block14: {
                block13: {
                    int n8;
                    int n9;
                    int n10;
                    int n11;
                    int n12;
                    int n13;
                    int n14;
                    int n15;
                    int n16;
                    int n17;
                    int n18;
                    int n19;
                    int n20;
                    int n21;
                    x8 = ax.k2.x.c("SELECT * FROM workspec WHERE id=?", 1);
                    if (object == null) {
                        x8.t0(1);
                    } else {
                        x8.D(1, (String)object);
                    }
                    this.a.d();
                    cursor = ax.m2.b.b(this.a, x8, false, null);
                    try {
                        n21 = ax.m2.a.e(cursor, "id");
                        n20 = ax.m2.a.e(cursor, "state");
                        n19 = ax.m2.a.e(cursor, "worker_class_name");
                        n18 = ax.m2.a.e(cursor, "input_merger_class_name");
                        n17 = ax.m2.a.e(cursor, "input");
                        n16 = ax.m2.a.e(cursor, "output");
                        n15 = ax.m2.a.e(cursor, "initial_delay");
                        n14 = ax.m2.a.e(cursor, "interval_duration");
                        n13 = ax.m2.a.e(cursor, "flex_duration");
                        n12 = ax.m2.a.e(cursor, "run_attempt_count");
                        n11 = ax.m2.a.e(cursor, "backoff_policy");
                        n10 = ax.m2.a.e(cursor, "backoff_delay_duration");
                        n9 = ax.m2.a.e(cursor, "last_enqueue_time");
                        n8 = ax.m2.a.e(cursor, "minimum_retention_duration");
                    }
                    catch (Throwable throwable) {
                        // empty catch block
                        break block12;
                    }
                    try {
                        Object var54_45;
                        Object var54_42;
                        Object var54_39;
                        int n22 = ax.m2.a.e(cursor, "schedule_requested_at");
                        int n23 = ax.m2.a.e(cursor, "run_in_foreground");
                        int n24 = ax.m2.a.e(cursor, "out_of_quota_policy");
                        int n25 = ax.m2.a.e(cursor, "period_count");
                        int n26 = ax.m2.a.e(cursor, "generation");
                        int n27 = ax.m2.a.e(cursor, "required_network_type");
                        int n28 = ax.m2.a.e(cursor, "requires_charging");
                        int n29 = ax.m2.a.e(cursor, "requires_device_idle");
                        int n30 = ax.m2.a.e(cursor, "requires_battery_not_low");
                        int n31 = ax.m2.a.e(cursor, "requires_storage_not_low");
                        int n32 = ax.m2.a.e(cursor, "trigger_content_update_delay");
                        int n33 = ax.m2.a.e(cursor, "trigger_max_content_delay");
                        int n34 = ax.m2.a.e(cursor, "content_uri_triggers");
                        if (!cursor.moveToFirst()) break block13;
                        object = cursor.isNull(n21) ? null : cursor.getString(n21);
                        r r8 = C.f(cursor.getInt(n20));
                        String string = cursor.isNull(n19) ? null : cursor.getString(n19);
                        String string2 = cursor.isNull(n18) ? null : cursor.getString(n18);
                        if (cursor.isNull(n17)) {
                            Object var54_37 = null;
                        } else {
                            byte[] byArray = cursor.getBlob(n17);
                        }
                        b b8 = androidx.work.b.g((byte[])var54_39);
                        if (cursor.isNull(n16)) {
                            Object var54_40 = null;
                        } else {
                            byte[] byArray = cursor.getBlob(n16);
                        }
                        b b9 = androidx.work.b.g((byte[])var54_42);
                        long l8 = cursor.getLong(n15);
                        long l9 = cursor.getLong(n14);
                        long l10 = cursor.getLong(n13);
                        n17 = cursor.getInt(n12);
                        a a8 = C.c(cursor.getInt(n11));
                        long l11 = cursor.getLong(n10);
                        long l12 = cursor.getLong(n9);
                        long l13 = cursor.getLong(n8);
                        long l14 = cursor.getLong(n22);
                        boolean bl = cursor.getInt(n23) != 0;
                        m m8 = C.e(cursor.getInt(n24));
                        n24 = cursor.getInt(n25);
                        n26 = cursor.getInt(n26);
                        j j8 = C.d(cursor.getInt(n27));
                        boolean bl2 = cursor.getInt(n28) != 0;
                        boolean bl3 = cursor.getInt(n29) != 0;
                        boolean bl4 = cursor.getInt(n30) != 0;
                        boolean bl5 = cursor.getInt(n31) != 0;
                        long l15 = cursor.getLong(n32);
                        long l16 = cursor.getLong(n33);
                        if (cursor.isNull(n34)) {
                            Object var54_43 = null;
                        } else {
                            byte[] byArray = cursor.getBlob(n34);
                        }
                        Set<b.b> set = C.b((byte[])var54_45);
                        ax.B2.b b10 = new ax.B2.b(j8, bl2, bl3, bl4, bl5, l15, l16, set);
                        object = new v((String)object, r8, string, string2, b8, b9, l8, l9, l10, b10, n17, a8, l11, l12, l13, l14, bl, m8, n24, n26);
                        break block14;
                    }
                    catch (Throwable throwable) {
                        break block12;
                    }
                }
                object = null;
            }
            cursor.close();
            x8.f();
            return object;
        }
        cursor.close();
        x8.f();
        throw var1_4;
    }

    @Override
    public int o(String string) {
        this.a.d();
        k k8 = this.j.b();
        if (string == null) {
            k8.t0(1);
        } else {
            k8.D(1, string);
        }
        this.a.e();
        try {
            int n8 = k8.I();
            this.a.A();
            return n8;
        }
        finally {
            this.a.i();
            this.j.h(k8);
        }
    }

    @Override
    public void p(v v8) {
        this.a.d();
        this.a.e();
        try {
            this.b.j(v8);
            this.a.A();
            return;
        }
        finally {
            this.a.i();
        }
    }

    @Override
    public void q(String string, long l8) {
        this.a.d();
        k k8 = this.h.b();
        k8.X(1, l8);
        if (string == null) {
            k8.t0(2);
        } else {
            k8.D(2, string);
        }
        this.a.e();
        try {
            k8.I();
            this.a.A();
            return;
        }
        finally {
            this.a.i();
            this.h.h(k8);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public List<b> r(String object) {
        Throwable throwable2;
        Cursor cursor;
        ax.k2.x x8;
        block5: {
            ArrayList<b> arrayList;
            x8 = ax.k2.x.c("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
            if (object == null) {
                x8.t0(1);
            } else {
                x8.D(1, (String)object);
            }
            this.a.d();
            cursor = ax.m2.b.b(this.a, x8, false, null);
            try {
                arrayList = new ArrayList<b>(cursor.getCount());
                while (cursor.moveToNext()) {
                    object = cursor.isNull(0) ? null : (Object)cursor.getBlob(0);
                    arrayList.add(androidx.work.b.g((byte[])object));
                }
            }
            catch (Throwable throwable2) {
                break block5;
            }
            cursor.close();
            x8.f();
            return arrayList;
        }
        cursor.close();
        x8.f();
        throw throwable2;
    }

    @Override
    public int s(String string) {
        this.a.d();
        k k8 = this.i.b();
        if (string == null) {
            k8.t0(1);
        } else {
            k8.D(1, string);
        }
        this.a.e();
        try {
            int n8 = k8.I();
            this.a.A();
            return n8;
        }
        finally {
            this.a.i();
            this.i.h(k8);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public List<v> t(int n8) {
        RuntimeException var54_51;
        Cursor cursor;
        ax.k2.x x8;
        block5: {
            ArrayList<v> arrayList;
            int n9;
            int n10;
            int n11;
            int n12;
            int n13;
            int n14;
            int n15;
            int n16;
            int n17;
            int n18;
            int n19;
            int n20;
            int n21;
            x8 = ax.k2.x.c("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
            x8.X(1, n8);
            this.a.d();
            cursor = ax.m2.b.b(this.a, x8, false, null);
            try {
                n21 = ax.m2.a.e(cursor, "id");
                n20 = ax.m2.a.e(cursor, "state");
                n19 = ax.m2.a.e(cursor, "worker_class_name");
                n18 = ax.m2.a.e(cursor, "input_merger_class_name");
                n17 = ax.m2.a.e(cursor, "input");
                n16 = ax.m2.a.e(cursor, "output");
                n15 = ax.m2.a.e(cursor, "initial_delay");
                n14 = ax.m2.a.e(cursor, "interval_duration");
                n13 = ax.m2.a.e(cursor, "flex_duration");
                n12 = ax.m2.a.e(cursor, "run_attempt_count");
                n11 = ax.m2.a.e(cursor, "backoff_policy");
                n10 = ax.m2.a.e(cursor, "backoff_delay_duration");
                n9 = ax.m2.a.e(cursor, "last_enqueue_time");
                n8 = ax.m2.a.e(cursor, "minimum_retention_duration");
            }
            catch (Throwable throwable) {
                // empty catch block
                break block5;
            }
            try {
                int n22 = ax.m2.a.e(cursor, "schedule_requested_at");
                int n23 = ax.m2.a.e(cursor, "run_in_foreground");
                int n24 = ax.m2.a.e(cursor, "out_of_quota_policy");
                int n25 = ax.m2.a.e(cursor, "period_count");
                int n26 = ax.m2.a.e(cursor, "generation");
                int n27 = ax.m2.a.e(cursor, "required_network_type");
                int n28 = ax.m2.a.e(cursor, "requires_charging");
                int n29 = ax.m2.a.e(cursor, "requires_device_idle");
                int n30 = ax.m2.a.e(cursor, "requires_battery_not_low");
                int n31 = ax.m2.a.e(cursor, "requires_storage_not_low");
                int n32 = ax.m2.a.e(cursor, "trigger_content_update_delay");
                int n33 = ax.m2.a.e(cursor, "trigger_max_content_delay");
                int n34 = ax.m2.a.e(cursor, "content_uri_triggers");
                arrayList = new ArrayList<v>(cursor.getCount());
                while (cursor.moveToNext()) {
                    String string = cursor.isNull(n21) ? null : cursor.getString(n21);
                    r r8 = C.f(cursor.getInt(n20));
                    String string2 = cursor.isNull(n19) ? null : cursor.getString(n19);
                    String string3 = cursor.isNull(n18) ? null : cursor.getString(n18);
                    Object object = cursor.isNull(n17) ? null : cursor.getBlob(n17);
                    b b8 = androidx.work.b.g(object);
                    object = cursor.isNull(n16) ? null : cursor.getBlob(n16);
                    b b9 = androidx.work.b.g(object);
                    long l8 = cursor.getLong(n15);
                    long l9 = cursor.getLong(n14);
                    long l10 = cursor.getLong(n13);
                    int n35 = cursor.getInt(n12);
                    a a8 = C.c(cursor.getInt(n11));
                    long l11 = cursor.getLong(n10);
                    long l12 = cursor.getLong(n9);
                    long l13 = cursor.getLong(n8);
                    long l14 = cursor.getLong(n22);
                    boolean bl = cursor.getInt(n23) != 0;
                    m m8 = C.e(cursor.getInt(n24));
                    int n36 = cursor.getInt(n25);
                    int n37 = cursor.getInt(n26);
                    Object object2 = C.d(cursor.getInt(n27));
                    boolean bl2 = cursor.getInt(n28) != 0;
                    boolean bl3 = cursor.getInt(n29) != 0;
                    boolean bl4 = cursor.getInt(n30) != 0;
                    boolean bl5 = cursor.getInt(n31) != 0;
                    long l15 = cursor.getLong(n32);
                    long l16 = cursor.getLong(n33);
                    object = cursor.isNull(n34) ? null : cursor.getBlob(n34);
                    Set<b.b> set = C.b(object);
                    object = new ax.B2.b;
                    object((j)((Object)object2), bl2, bl3, bl4, bl5, l15, l16, set);
                    object2 = new v(string, r8, string2, string3, b8, b9, l8, l9, l10, (ax.B2.b)object, n35, a8, l11, l12, l13, l14, bl, m8, n36, n37);
                    arrayList.add((v)object2);
                }
            }
            catch (Throwable throwable) {
                break block5;
            }
            cursor.close();
            x8.f();
            return arrayList;
        }
        cursor.close();
        x8.f();
        throw var54_51;
    }

    @Override
    public int u() {
        this.a.d();
        k k8 = this.l.b();
        this.a.e();
        try {
            int n8 = k8.I();
            this.a.A();
            return n8;
        }
        finally {
            this.a.i();
            this.l.h(k8);
        }
    }
}

