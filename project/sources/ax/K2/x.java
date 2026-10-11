package ax.K2;

import android.database.Cursor;
import ax.K2.v;
import ax.k2.AbstractC2367A;
import ax.k2.AbstractC2377h;
import ax.k2.AbstractC2378i;
import ax.k2.AbstractC2390u;
import ax.k2.C2393x;
import ax.m2.C2511a;
import ax.m2.C2512b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class x implements w {
    private final AbstractC2390u a;
    private final AbstractC2378i<v> b;
    private final AbstractC2377h<v> c;
    private final AbstractC2367A d;
    private final AbstractC2367A e;
    private final AbstractC2367A f;
    private final AbstractC2367A g;
    private final AbstractC2367A h;
    private final AbstractC2367A i;
    private final AbstractC2367A j;
    private final AbstractC2367A k;
    private final AbstractC2367A l;
    private final AbstractC2367A m;
    private final AbstractC2367A n;

    class a extends AbstractC2367A {
        a(AbstractC2390u abstractC2390u) {
            super(abstractC2390u);
        }

        @Override // ax.k2.AbstractC2367A
        public String e() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    class b extends AbstractC2367A {
        b(AbstractC2390u abstractC2390u) {
            super(abstractC2390u);
        }

        @Override // ax.k2.AbstractC2367A
        public String e() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    class c extends AbstractC2367A {
        c(AbstractC2390u abstractC2390u) {
            super(abstractC2390u);
        }

        @Override // ax.k2.AbstractC2367A
        public String e() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    class d extends AbstractC2367A {
        d(AbstractC2390u abstractC2390u) {
            super(abstractC2390u);
        }

        @Override // ax.k2.AbstractC2367A
        public String e() {
            return "UPDATE workspec SET generation=generation+1 WHERE id=?";
        }
    }

    class e extends AbstractC2378i<v> {
        e(AbstractC2390u abstractC2390u) {
            super(abstractC2390u);
        }

        @Override // ax.k2.AbstractC2367A
        public String e() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // ax.k2.AbstractC2378i
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(ax.o2.k kVar, v vVar) {
            String str = vVar.a;
            if (str == null) {
                kVar.t0(1);
            } else {
                kVar.D(1, str);
            }
            C c = C.a;
            kVar.X(2, C.j(vVar.b));
            String str2 = vVar.c;
            if (str2 == null) {
                kVar.t0(3);
            } else {
                kVar.D(3, str2);
            }
            String str3 = vVar.d;
            if (str3 == null) {
                kVar.t0(4);
            } else {
                kVar.D(4, str3);
            }
            byte[] k = androidx.work.b.k(vVar.e);
            if (k == null) {
                kVar.t0(5);
            } else {
                kVar.e0(5, k);
            }
            byte[] k2 = androidx.work.b.k(vVar.f);
            if (k2 == null) {
                kVar.t0(6);
            } else {
                kVar.e0(6, k2);
            }
            kVar.X(7, vVar.g);
            kVar.X(8, vVar.h);
            kVar.X(9, vVar.i);
            kVar.X(10, vVar.k);
            kVar.X(11, C.a(vVar.l));
            kVar.X(12, vVar.m);
            kVar.X(13, vVar.n);
            kVar.X(14, vVar.o);
            kVar.X(15, vVar.p);
            kVar.X(16, vVar.q ? 1L : 0L);
            kVar.X(17, C.h(vVar.r));
            kVar.X(18, vVar.e());
            kVar.X(19, vVar.d());
            ax.B2.b bVar = vVar.j;
            if (bVar == null) {
                kVar.t0(20);
                kVar.t0(21);
                kVar.t0(22);
                kVar.t0(23);
                kVar.t0(24);
                kVar.t0(25);
                kVar.t0(26);
                kVar.t0(27);
                return;
            }
            kVar.X(20, C.g(bVar.d()));
            kVar.X(21, bVar.g() ? 1L : 0L);
            kVar.X(22, bVar.h() ? 1L : 0L);
            kVar.X(23, bVar.f() ? 1L : 0L);
            kVar.X(24, bVar.i() ? 1L : 0L);
            kVar.X(25, bVar.b());
            kVar.X(26, bVar.a());
            byte[] i = C.i(bVar.c());
            if (i == null) {
                kVar.t0(27);
            } else {
                kVar.e0(27, i);
            }
        }
    }

    class f extends AbstractC2377h<v> {
        f(AbstractC2390u abstractC2390u) {
            super(abstractC2390u);
        }

        @Override // ax.k2.AbstractC2367A
        public String e() {
            return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }
    }

    class g extends AbstractC2367A {
        g(AbstractC2390u abstractC2390u) {
            super(abstractC2390u);
        }

        @Override // ax.k2.AbstractC2367A
        public String e() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    class h extends AbstractC2367A {
        h(AbstractC2390u abstractC2390u) {
            super(abstractC2390u);
        }

        @Override // ax.k2.AbstractC2367A
        public String e() {
            return "UPDATE workspec SET state=? WHERE id=?";
        }
    }

    class i extends AbstractC2367A {
        i(AbstractC2390u abstractC2390u) {
            super(abstractC2390u);
        }

        @Override // ax.k2.AbstractC2367A
        public String e() {
            return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        }
    }

    class j extends AbstractC2367A {
        j(AbstractC2390u abstractC2390u) {
            super(abstractC2390u);
        }

        @Override // ax.k2.AbstractC2367A
        public String e() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    class k extends AbstractC2367A {
        k(AbstractC2390u abstractC2390u) {
            super(abstractC2390u);
        }

        @Override // ax.k2.AbstractC2367A
        public String e() {
            return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        }
    }

    class l extends AbstractC2367A {
        l(AbstractC2390u abstractC2390u) {
            super(abstractC2390u);
        }

        @Override // ax.k2.AbstractC2367A
        public String e() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    class m extends AbstractC2367A {
        m(AbstractC2390u abstractC2390u) {
            super(abstractC2390u);
        }

        @Override // ax.k2.AbstractC2367A
        public String e() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    public x(AbstractC2390u abstractC2390u) {
        this.a = abstractC2390u;
        this.b = new e(abstractC2390u);
        this.c = new f(abstractC2390u);
        this.d = new g(abstractC2390u);
        this.e = new h(abstractC2390u);
        this.f = new i(abstractC2390u);
        this.g = new j(abstractC2390u);
        this.h = new k(abstractC2390u);
        this.i = new l(abstractC2390u);
        this.j = new m(abstractC2390u);
        this.k = new a(abstractC2390u);
        this.l = new b(abstractC2390u);
        this.m = new c(abstractC2390u);
        this.n = new d(abstractC2390u);
    }

    public static List<Class<?>> v() {
        return Collections.EMPTY_LIST;
    }

    @Override // ax.K2.w
    public void a(String str) {
        this.a.d();
        ax.o2.k b2 = this.f.b();
        if (str == null) {
            b2.t0(1);
        } else {
            b2.D(1, str);
        }
        this.a.e();
        try {
            b2.I();
            this.a.A();
        } finally {
            this.a.i();
            this.f.h(b2);
        }
    }

    @Override // ax.K2.w
    public int b(String str, long j2) {
        this.a.d();
        ax.o2.k b2 = this.k.b();
        b2.X(1, j2);
        if (str == null) {
            b2.t0(2);
        } else {
            b2.D(2, str);
        }
        this.a.e();
        try {
            int I = b2.I();
            this.a.A();
            return I;
        } finally {
            this.a.i();
            this.k.h(b2);
        }
    }

    @Override // ax.K2.w
    public List<v.b> c(String str) {
        C2393x c2 = C2393x.c("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            c2.t0(1);
        } else {
            c2.D(1, str);
        }
        this.a.d();
        Cursor b2 = C2512b.b(this.a, c2, false, null);
        try {
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                arrayList.add(new v.b(b2.isNull(0) ? null : b2.getString(0), C.f(b2.getInt(1))));
            }
            return arrayList;
        } finally {
            b2.close();
            c2.f();
        }
    }

    @Override // ax.K2.w
    public List<v> d(long j2) {
        C2393x c2393x;
        C2393x c2 = C2393x.c("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        c2.X(1, j2);
        this.a.d();
        Cursor b2 = C2512b.b(this.a, c2, false, null);
        try {
            int e2 = C2511a.e(b2, "id");
            int e3 = C2511a.e(b2, "state");
            int e4 = C2511a.e(b2, "worker_class_name");
            int e5 = C2511a.e(b2, "input_merger_class_name");
            int e6 = C2511a.e(b2, "input");
            int e7 = C2511a.e(b2, "output");
            int e8 = C2511a.e(b2, "initial_delay");
            int e9 = C2511a.e(b2, "interval_duration");
            int e10 = C2511a.e(b2, "flex_duration");
            int e11 = C2511a.e(b2, "run_attempt_count");
            int e12 = C2511a.e(b2, "backoff_policy");
            int e13 = C2511a.e(b2, "backoff_delay_duration");
            int e14 = C2511a.e(b2, "last_enqueue_time");
            int e15 = C2511a.e(b2, "minimum_retention_duration");
            c2393x = c2;
            try {
                int e16 = C2511a.e(b2, "schedule_requested_at");
                int e17 = C2511a.e(b2, "run_in_foreground");
                int e18 = C2511a.e(b2, "out_of_quota_policy");
                int e19 = C2511a.e(b2, "period_count");
                int e20 = C2511a.e(b2, "generation");
                int e21 = C2511a.e(b2, "required_network_type");
                int e22 = C2511a.e(b2, "requires_charging");
                int e23 = C2511a.e(b2, "requires_device_idle");
                int e24 = C2511a.e(b2, "requires_battery_not_low");
                int e25 = C2511a.e(b2, "requires_storage_not_low");
                int e26 = C2511a.e(b2, "trigger_content_update_delay");
                int e27 = C2511a.e(b2, "trigger_max_content_delay");
                int e28 = C2511a.e(b2, "content_uri_triggers");
                int i2 = e15;
                ArrayList arrayList = new ArrayList(b2.getCount());
                while (b2.moveToNext()) {
                    String string = b2.isNull(e2) ? null : b2.getString(e2);
                    ax.B2.r f2 = C.f(b2.getInt(e3));
                    String string2 = b2.isNull(e4) ? null : b2.getString(e4);
                    String string3 = b2.isNull(e5) ? null : b2.getString(e5);
                    androidx.work.b g2 = androidx.work.b.g(b2.isNull(e6) ? null : b2.getBlob(e6));
                    androidx.work.b g3 = androidx.work.b.g(b2.isNull(e7) ? null : b2.getBlob(e7));
                    long j3 = b2.getLong(e8);
                    long j4 = b2.getLong(e9);
                    long j5 = b2.getLong(e10);
                    int i3 = b2.getInt(e11);
                    ax.B2.a c3 = C.c(b2.getInt(e12));
                    long j6 = b2.getLong(e13);
                    long j7 = b2.getLong(e14);
                    int i4 = i2;
                    long j8 = b2.getLong(i4);
                    int i5 = e2;
                    int i6 = e16;
                    long j9 = b2.getLong(i6);
                    e16 = i6;
                    int i7 = e17;
                    boolean z = b2.getInt(i7) != 0;
                    e17 = i7;
                    int i8 = e18;
                    ax.B2.m e29 = C.e(b2.getInt(i8));
                    e18 = i8;
                    int i9 = e19;
                    int i10 = b2.getInt(i9);
                    e19 = i9;
                    int i11 = e20;
                    int i12 = b2.getInt(i11);
                    e20 = i11;
                    int i13 = e21;
                    ax.B2.j d2 = C.d(b2.getInt(i13));
                    e21 = i13;
                    int i14 = e22;
                    boolean z2 = b2.getInt(i14) != 0;
                    e22 = i14;
                    int i15 = e23;
                    boolean z3 = b2.getInt(i15) != 0;
                    e23 = i15;
                    int i16 = e24;
                    boolean z4 = b2.getInt(i16) != 0;
                    e24 = i16;
                    int i17 = e25;
                    boolean z5 = b2.getInt(i17) != 0;
                    e25 = i17;
                    int i18 = e26;
                    long j10 = b2.getLong(i18);
                    e26 = i18;
                    int i19 = e27;
                    long j11 = b2.getLong(i19);
                    e27 = i19;
                    int i20 = e28;
                    e28 = i20;
                    arrayList.add(new v(string, f2, string2, string3, g2, g3, j3, j4, j5, new ax.B2.b(d2, z2, z3, z4, z5, j10, j11, C.b(b2.isNull(i20) ? null : b2.getBlob(i20))), i3, c3, j6, j7, j8, j9, z, e29, i10, i12));
                    e2 = i5;
                    i2 = i4;
                }
                b2.close();
                c2393x.f();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b2.close();
                c2393x.f();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c2393x = c2;
        }
    }

    @Override // ax.K2.w
    public List<v> e(int i2) {
        C2393x c2393x;
        C2393x c2 = C2393x.c("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        c2.X(1, i2);
        this.a.d();
        Cursor b2 = C2512b.b(this.a, c2, false, null);
        try {
            int e2 = C2511a.e(b2, "id");
            int e3 = C2511a.e(b2, "state");
            int e4 = C2511a.e(b2, "worker_class_name");
            int e5 = C2511a.e(b2, "input_merger_class_name");
            int e6 = C2511a.e(b2, "input");
            int e7 = C2511a.e(b2, "output");
            int e8 = C2511a.e(b2, "initial_delay");
            int e9 = C2511a.e(b2, "interval_duration");
            int e10 = C2511a.e(b2, "flex_duration");
            int e11 = C2511a.e(b2, "run_attempt_count");
            int e12 = C2511a.e(b2, "backoff_policy");
            int e13 = C2511a.e(b2, "backoff_delay_duration");
            int e14 = C2511a.e(b2, "last_enqueue_time");
            int e15 = C2511a.e(b2, "minimum_retention_duration");
            c2393x = c2;
            try {
                int e16 = C2511a.e(b2, "schedule_requested_at");
                int e17 = C2511a.e(b2, "run_in_foreground");
                int e18 = C2511a.e(b2, "out_of_quota_policy");
                int e19 = C2511a.e(b2, "period_count");
                int e20 = C2511a.e(b2, "generation");
                int e21 = C2511a.e(b2, "required_network_type");
                int e22 = C2511a.e(b2, "requires_charging");
                int e23 = C2511a.e(b2, "requires_device_idle");
                int e24 = C2511a.e(b2, "requires_battery_not_low");
                int e25 = C2511a.e(b2, "requires_storage_not_low");
                int e26 = C2511a.e(b2, "trigger_content_update_delay");
                int e27 = C2511a.e(b2, "trigger_max_content_delay");
                int e28 = C2511a.e(b2, "content_uri_triggers");
                int i3 = e15;
                ArrayList arrayList = new ArrayList(b2.getCount());
                while (b2.moveToNext()) {
                    String string = b2.isNull(e2) ? null : b2.getString(e2);
                    ax.B2.r f2 = C.f(b2.getInt(e3));
                    String string2 = b2.isNull(e4) ? null : b2.getString(e4);
                    String string3 = b2.isNull(e5) ? null : b2.getString(e5);
                    androidx.work.b g2 = androidx.work.b.g(b2.isNull(e6) ? null : b2.getBlob(e6));
                    androidx.work.b g3 = androidx.work.b.g(b2.isNull(e7) ? null : b2.getBlob(e7));
                    long j2 = b2.getLong(e8);
                    long j3 = b2.getLong(e9);
                    long j4 = b2.getLong(e10);
                    int i4 = b2.getInt(e11);
                    ax.B2.a c3 = C.c(b2.getInt(e12));
                    long j5 = b2.getLong(e13);
                    long j6 = b2.getLong(e14);
                    int i5 = i3;
                    long j7 = b2.getLong(i5);
                    int i6 = e2;
                    int i7 = e16;
                    long j8 = b2.getLong(i7);
                    e16 = i7;
                    int i8 = e17;
                    boolean z = b2.getInt(i8) != 0;
                    e17 = i8;
                    int i9 = e18;
                    ax.B2.m e29 = C.e(b2.getInt(i9));
                    e18 = i9;
                    int i10 = e19;
                    int i11 = b2.getInt(i10);
                    e19 = i10;
                    int i12 = e20;
                    int i13 = b2.getInt(i12);
                    e20 = i12;
                    int i14 = e21;
                    ax.B2.j d2 = C.d(b2.getInt(i14));
                    e21 = i14;
                    int i15 = e22;
                    boolean z2 = b2.getInt(i15) != 0;
                    e22 = i15;
                    int i16 = e23;
                    boolean z3 = b2.getInt(i16) != 0;
                    e23 = i16;
                    int i17 = e24;
                    boolean z4 = b2.getInt(i17) != 0;
                    e24 = i17;
                    int i18 = e25;
                    boolean z5 = b2.getInt(i18) != 0;
                    e25 = i18;
                    int i19 = e26;
                    long j9 = b2.getLong(i19);
                    e26 = i19;
                    int i20 = e27;
                    long j10 = b2.getLong(i20);
                    e27 = i20;
                    int i21 = e28;
                    e28 = i21;
                    arrayList.add(new v(string, f2, string2, string3, g2, g3, j2, j3, j4, new ax.B2.b(d2, z2, z3, z4, z5, j9, j10, C.b(b2.isNull(i21) ? null : b2.getBlob(i21))), i4, c3, j5, j6, j7, j8, z, e29, i11, i13));
                    e2 = i6;
                    i3 = i5;
                }
                b2.close();
                c2393x.f();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b2.close();
                c2393x.f();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c2393x = c2;
        }
    }

    @Override // ax.K2.w
    public List<v> f() {
        C2393x c2393x;
        int e2;
        int e3;
        int e4;
        int e5;
        int e6;
        int e7;
        int e8;
        int e9;
        int e10;
        int e11;
        int e12;
        int e13;
        int e14;
        int e15;
        C2393x c2 = C2393x.c("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.a.d();
        Cursor b2 = C2512b.b(this.a, c2, false, null);
        try {
            e2 = C2511a.e(b2, "id");
            e3 = C2511a.e(b2, "state");
            e4 = C2511a.e(b2, "worker_class_name");
            e5 = C2511a.e(b2, "input_merger_class_name");
            e6 = C2511a.e(b2, "input");
            e7 = C2511a.e(b2, "output");
            e8 = C2511a.e(b2, "initial_delay");
            e9 = C2511a.e(b2, "interval_duration");
            e10 = C2511a.e(b2, "flex_duration");
            e11 = C2511a.e(b2, "run_attempt_count");
            e12 = C2511a.e(b2, "backoff_policy");
            e13 = C2511a.e(b2, "backoff_delay_duration");
            e14 = C2511a.e(b2, "last_enqueue_time");
            e15 = C2511a.e(b2, "minimum_retention_duration");
            c2393x = c2;
        } catch (Throwable th) {
            th = th;
            c2393x = c2;
        }
        try {
            int e16 = C2511a.e(b2, "schedule_requested_at");
            int e17 = C2511a.e(b2, "run_in_foreground");
            int e18 = C2511a.e(b2, "out_of_quota_policy");
            int e19 = C2511a.e(b2, "period_count");
            int e20 = C2511a.e(b2, "generation");
            int e21 = C2511a.e(b2, "required_network_type");
            int e22 = C2511a.e(b2, "requires_charging");
            int e23 = C2511a.e(b2, "requires_device_idle");
            int e24 = C2511a.e(b2, "requires_battery_not_low");
            int e25 = C2511a.e(b2, "requires_storage_not_low");
            int e26 = C2511a.e(b2, "trigger_content_update_delay");
            int e27 = C2511a.e(b2, "trigger_max_content_delay");
            int e28 = C2511a.e(b2, "content_uri_triggers");
            int i2 = e15;
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                String string = b2.isNull(e2) ? null : b2.getString(e2);
                ax.B2.r f2 = C.f(b2.getInt(e3));
                String string2 = b2.isNull(e4) ? null : b2.getString(e4);
                String string3 = b2.isNull(e5) ? null : b2.getString(e5);
                androidx.work.b g2 = androidx.work.b.g(b2.isNull(e6) ? null : b2.getBlob(e6));
                androidx.work.b g3 = androidx.work.b.g(b2.isNull(e7) ? null : b2.getBlob(e7));
                long j2 = b2.getLong(e8);
                long j3 = b2.getLong(e9);
                long j4 = b2.getLong(e10);
                int i3 = b2.getInt(e11);
                ax.B2.a c3 = C.c(b2.getInt(e12));
                long j5 = b2.getLong(e13);
                long j6 = b2.getLong(e14);
                int i4 = i2;
                long j7 = b2.getLong(i4);
                int i5 = e2;
                int i6 = e16;
                long j8 = b2.getLong(i6);
                e16 = i6;
                int i7 = e17;
                boolean z = b2.getInt(i7) != 0;
                e17 = i7;
                int i8 = e18;
                ax.B2.m e29 = C.e(b2.getInt(i8));
                e18 = i8;
                int i9 = e19;
                int i10 = b2.getInt(i9);
                e19 = i9;
                int i11 = e20;
                int i12 = b2.getInt(i11);
                e20 = i11;
                int i13 = e21;
                ax.B2.j d2 = C.d(b2.getInt(i13));
                e21 = i13;
                int i14 = e22;
                boolean z2 = b2.getInt(i14) != 0;
                e22 = i14;
                int i15 = e23;
                boolean z3 = b2.getInt(i15) != 0;
                e23 = i15;
                int i16 = e24;
                boolean z4 = b2.getInt(i16) != 0;
                e24 = i16;
                int i17 = e25;
                boolean z5 = b2.getInt(i17) != 0;
                e25 = i17;
                int i18 = e26;
                long j9 = b2.getLong(i18);
                e26 = i18;
                int i19 = e27;
                long j10 = b2.getLong(i19);
                e27 = i19;
                int i20 = e28;
                e28 = i20;
                arrayList.add(new v(string, f2, string2, string3, g2, g3, j2, j3, j4, new ax.B2.b(d2, z2, z3, z4, z5, j9, j10, C.b(b2.isNull(i20) ? null : b2.getBlob(i20))), i3, c3, j5, j6, j7, j8, z, e29, i10, i12));
                e2 = i5;
                i2 = i4;
            }
            b2.close();
            c2393x.f();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            b2.close();
            c2393x.f();
            throw th;
        }
    }

    @Override // ax.K2.w
    public void g(String str, androidx.work.b bVar) {
        this.a.d();
        ax.o2.k b2 = this.g.b();
        byte[] k2 = androidx.work.b.k(bVar);
        if (k2 == null) {
            b2.t0(1);
        } else {
            b2.e0(1, k2);
        }
        if (str == null) {
            b2.t0(2);
        } else {
            b2.D(2, str);
        }
        this.a.e();
        try {
            b2.I();
            this.a.A();
        } finally {
            this.a.i();
            this.g.h(b2);
        }
    }

    @Override // ax.K2.w
    public void h(String str) {
        this.a.d();
        ax.o2.k b2 = this.d.b();
        if (str == null) {
            b2.t0(1);
        } else {
            b2.D(1, str);
        }
        this.a.e();
        try {
            b2.I();
            this.a.A();
        } finally {
            this.a.i();
            this.d.h(b2);
        }
    }

    @Override // ax.K2.w
    public List<v> i() {
        C2393x c2393x;
        int e2;
        int e3;
        int e4;
        int e5;
        int e6;
        int e7;
        int e8;
        int e9;
        int e10;
        int e11;
        int e12;
        int e13;
        int e14;
        int e15;
        C2393x c2 = C2393x.c("SELECT * FROM workspec WHERE state=1", 0);
        this.a.d();
        Cursor b2 = C2512b.b(this.a, c2, false, null);
        try {
            e2 = C2511a.e(b2, "id");
            e3 = C2511a.e(b2, "state");
            e4 = C2511a.e(b2, "worker_class_name");
            e5 = C2511a.e(b2, "input_merger_class_name");
            e6 = C2511a.e(b2, "input");
            e7 = C2511a.e(b2, "output");
            e8 = C2511a.e(b2, "initial_delay");
            e9 = C2511a.e(b2, "interval_duration");
            e10 = C2511a.e(b2, "flex_duration");
            e11 = C2511a.e(b2, "run_attempt_count");
            e12 = C2511a.e(b2, "backoff_policy");
            e13 = C2511a.e(b2, "backoff_delay_duration");
            e14 = C2511a.e(b2, "last_enqueue_time");
            e15 = C2511a.e(b2, "minimum_retention_duration");
            c2393x = c2;
        } catch (Throwable th) {
            th = th;
            c2393x = c2;
        }
        try {
            int e16 = C2511a.e(b2, "schedule_requested_at");
            int e17 = C2511a.e(b2, "run_in_foreground");
            int e18 = C2511a.e(b2, "out_of_quota_policy");
            int e19 = C2511a.e(b2, "period_count");
            int e20 = C2511a.e(b2, "generation");
            int e21 = C2511a.e(b2, "required_network_type");
            int e22 = C2511a.e(b2, "requires_charging");
            int e23 = C2511a.e(b2, "requires_device_idle");
            int e24 = C2511a.e(b2, "requires_battery_not_low");
            int e25 = C2511a.e(b2, "requires_storage_not_low");
            int e26 = C2511a.e(b2, "trigger_content_update_delay");
            int e27 = C2511a.e(b2, "trigger_max_content_delay");
            int e28 = C2511a.e(b2, "content_uri_triggers");
            int i2 = e15;
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                String string = b2.isNull(e2) ? null : b2.getString(e2);
                ax.B2.r f2 = C.f(b2.getInt(e3));
                String string2 = b2.isNull(e4) ? null : b2.getString(e4);
                String string3 = b2.isNull(e5) ? null : b2.getString(e5);
                androidx.work.b g2 = androidx.work.b.g(b2.isNull(e6) ? null : b2.getBlob(e6));
                androidx.work.b g3 = androidx.work.b.g(b2.isNull(e7) ? null : b2.getBlob(e7));
                long j2 = b2.getLong(e8);
                long j3 = b2.getLong(e9);
                long j4 = b2.getLong(e10);
                int i3 = b2.getInt(e11);
                ax.B2.a c3 = C.c(b2.getInt(e12));
                long j5 = b2.getLong(e13);
                long j6 = b2.getLong(e14);
                int i4 = i2;
                long j7 = b2.getLong(i4);
                int i5 = e2;
                int i6 = e16;
                long j8 = b2.getLong(i6);
                e16 = i6;
                int i7 = e17;
                boolean z = b2.getInt(i7) != 0;
                e17 = i7;
                int i8 = e18;
                ax.B2.m e29 = C.e(b2.getInt(i8));
                e18 = i8;
                int i9 = e19;
                int i10 = b2.getInt(i9);
                e19 = i9;
                int i11 = e20;
                int i12 = b2.getInt(i11);
                e20 = i11;
                int i13 = e21;
                ax.B2.j d2 = C.d(b2.getInt(i13));
                e21 = i13;
                int i14 = e22;
                boolean z2 = b2.getInt(i14) != 0;
                e22 = i14;
                int i15 = e23;
                boolean z3 = b2.getInt(i15) != 0;
                e23 = i15;
                int i16 = e24;
                boolean z4 = b2.getInt(i16) != 0;
                e24 = i16;
                int i17 = e25;
                boolean z5 = b2.getInt(i17) != 0;
                e25 = i17;
                int i18 = e26;
                long j9 = b2.getLong(i18);
                e26 = i18;
                int i19 = e27;
                long j10 = b2.getLong(i19);
                e27 = i19;
                int i20 = e28;
                e28 = i20;
                arrayList.add(new v(string, f2, string2, string3, g2, g3, j2, j3, j4, new ax.B2.b(d2, z2, z3, z4, z5, j9, j10, C.b(b2.isNull(i20) ? null : b2.getBlob(i20))), i3, c3, j5, j6, j7, j8, z, e29, i10, i12));
                e2 = i5;
                i2 = i4;
            }
            b2.close();
            c2393x.f();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            b2.close();
            c2393x.f();
            throw th;
        }
    }

    @Override // ax.K2.w
    public int j(ax.B2.r rVar, String str) {
        this.a.d();
        ax.o2.k b2 = this.e.b();
        b2.X(1, C.j(rVar));
        if (str == null) {
            b2.t0(2);
        } else {
            b2.D(2, str);
        }
        this.a.e();
        try {
            int I = b2.I();
            this.a.A();
            return I;
        } finally {
            this.a.i();
            this.e.h(b2);
        }
    }

    @Override // ax.K2.w
    public boolean k() {
        boolean z = false;
        C2393x c2 = C2393x.c("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.a.d();
        Cursor b2 = C2512b.b(this.a, c2, false, null);
        try {
            if (b2.moveToFirst()) {
                if (b2.getInt(0) != 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            b2.close();
            c2.f();
        }
    }

    @Override // ax.K2.w
    public List<String> l(String str) {
        C2393x c2 = C2393x.c("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            c2.t0(1);
        } else {
            c2.D(1, str);
        }
        this.a.d();
        Cursor b2 = C2512b.b(this.a, c2, false, null);
        try {
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                arrayList.add(b2.isNull(0) ? null : b2.getString(0));
            }
            return arrayList;
        } finally {
            b2.close();
            c2.f();
        }
    }

    @Override // ax.K2.w
    public ax.B2.r m(String str) {
        C2393x c2 = C2393x.c("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            c2.t0(1);
        } else {
            c2.D(1, str);
        }
        this.a.d();
        ax.B2.r rVar = null;
        Cursor b2 = C2512b.b(this.a, c2, false, null);
        try {
            if (b2.moveToFirst()) {
                Integer valueOf = b2.isNull(0) ? null : Integer.valueOf(b2.getInt(0));
                if (valueOf != null) {
                    C c3 = C.a;
                    rVar = C.f(valueOf.intValue());
                }
            }
            return rVar;
        } finally {
            b2.close();
            c2.f();
        }
    }

    @Override // ax.K2.w
    public v n(String str) {
        C2393x c2393x;
        v vVar;
        C2393x c2 = C2393x.c("SELECT * FROM workspec WHERE id=?", 1);
        if (str == null) {
            c2.t0(1);
        } else {
            c2.D(1, str);
        }
        this.a.d();
        Cursor b2 = C2512b.b(this.a, c2, false, null);
        try {
            int e2 = C2511a.e(b2, "id");
            int e3 = C2511a.e(b2, "state");
            int e4 = C2511a.e(b2, "worker_class_name");
            int e5 = C2511a.e(b2, "input_merger_class_name");
            int e6 = C2511a.e(b2, "input");
            int e7 = C2511a.e(b2, "output");
            int e8 = C2511a.e(b2, "initial_delay");
            int e9 = C2511a.e(b2, "interval_duration");
            int e10 = C2511a.e(b2, "flex_duration");
            int e11 = C2511a.e(b2, "run_attempt_count");
            int e12 = C2511a.e(b2, "backoff_policy");
            int e13 = C2511a.e(b2, "backoff_delay_duration");
            int e14 = C2511a.e(b2, "last_enqueue_time");
            int e15 = C2511a.e(b2, "minimum_retention_duration");
            c2393x = c2;
            try {
                int e16 = C2511a.e(b2, "schedule_requested_at");
                int e17 = C2511a.e(b2, "run_in_foreground");
                int e18 = C2511a.e(b2, "out_of_quota_policy");
                int e19 = C2511a.e(b2, "period_count");
                int e20 = C2511a.e(b2, "generation");
                int e21 = C2511a.e(b2, "required_network_type");
                int e22 = C2511a.e(b2, "requires_charging");
                int e23 = C2511a.e(b2, "requires_device_idle");
                int e24 = C2511a.e(b2, "requires_battery_not_low");
                int e25 = C2511a.e(b2, "requires_storage_not_low");
                int e26 = C2511a.e(b2, "trigger_content_update_delay");
                int e27 = C2511a.e(b2, "trigger_max_content_delay");
                int e28 = C2511a.e(b2, "content_uri_triggers");
                if (b2.moveToFirst()) {
                    vVar = new v(b2.isNull(e2) ? null : b2.getString(e2), C.f(b2.getInt(e3)), b2.isNull(e4) ? null : b2.getString(e4), b2.isNull(e5) ? null : b2.getString(e5), androidx.work.b.g(b2.isNull(e6) ? null : b2.getBlob(e6)), androidx.work.b.g(b2.isNull(e7) ? null : b2.getBlob(e7)), b2.getLong(e8), b2.getLong(e9), b2.getLong(e10), new ax.B2.b(C.d(b2.getInt(e21)), b2.getInt(e22) != 0, b2.getInt(e23) != 0, b2.getInt(e24) != 0, b2.getInt(e25) != 0, b2.getLong(e26), b2.getLong(e27), C.b(b2.isNull(e28) ? null : b2.getBlob(e28))), b2.getInt(e11), C.c(b2.getInt(e12)), b2.getLong(e13), b2.getLong(e14), b2.getLong(e15), b2.getLong(e16), b2.getInt(e17) != 0, C.e(b2.getInt(e18)), b2.getInt(e19), b2.getInt(e20));
                } else {
                    vVar = null;
                }
                b2.close();
                c2393x.f();
                return vVar;
            } catch (Throwable th) {
                th = th;
                b2.close();
                c2393x.f();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c2393x = c2;
        }
    }

    @Override // ax.K2.w
    public int o(String str) {
        this.a.d();
        ax.o2.k b2 = this.j.b();
        if (str == null) {
            b2.t0(1);
        } else {
            b2.D(1, str);
        }
        this.a.e();
        try {
            int I = b2.I();
            this.a.A();
            return I;
        } finally {
            this.a.i();
            this.j.h(b2);
        }
    }

    @Override // ax.K2.w
    public void p(v vVar) {
        this.a.d();
        this.a.e();
        try {
            this.b.j(vVar);
            this.a.A();
        } finally {
            this.a.i();
        }
    }

    @Override // ax.K2.w
    public void q(String str, long j2) {
        this.a.d();
        ax.o2.k b2 = this.h.b();
        b2.X(1, j2);
        if (str == null) {
            b2.t0(2);
        } else {
            b2.D(2, str);
        }
        this.a.e();
        try {
            b2.I();
            this.a.A();
        } finally {
            this.a.i();
            this.h.h(b2);
        }
    }

    @Override // ax.K2.w
    public List<androidx.work.b> r(String str) {
        C2393x c2 = C2393x.c("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            c2.t0(1);
        } else {
            c2.D(1, str);
        }
        this.a.d();
        Cursor b2 = C2512b.b(this.a, c2, false, null);
        try {
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                arrayList.add(androidx.work.b.g(b2.isNull(0) ? null : b2.getBlob(0)));
            }
            return arrayList;
        } finally {
            b2.close();
            c2.f();
        }
    }

    @Override // ax.K2.w
    public int s(String str) {
        this.a.d();
        ax.o2.k b2 = this.i.b();
        if (str == null) {
            b2.t0(1);
        } else {
            b2.D(1, str);
        }
        this.a.e();
        try {
            int I = b2.I();
            this.a.A();
            return I;
        } finally {
            this.a.i();
            this.i.h(b2);
        }
    }

    @Override // ax.K2.w
    public List<v> t(int i2) {
        C2393x c2393x;
        C2393x c2 = C2393x.c("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        c2.X(1, i2);
        this.a.d();
        Cursor b2 = C2512b.b(this.a, c2, false, null);
        try {
            int e2 = C2511a.e(b2, "id");
            int e3 = C2511a.e(b2, "state");
            int e4 = C2511a.e(b2, "worker_class_name");
            int e5 = C2511a.e(b2, "input_merger_class_name");
            int e6 = C2511a.e(b2, "input");
            int e7 = C2511a.e(b2, "output");
            int e8 = C2511a.e(b2, "initial_delay");
            int e9 = C2511a.e(b2, "interval_duration");
            int e10 = C2511a.e(b2, "flex_duration");
            int e11 = C2511a.e(b2, "run_attempt_count");
            int e12 = C2511a.e(b2, "backoff_policy");
            int e13 = C2511a.e(b2, "backoff_delay_duration");
            int e14 = C2511a.e(b2, "last_enqueue_time");
            int e15 = C2511a.e(b2, "minimum_retention_duration");
            c2393x = c2;
            try {
                int e16 = C2511a.e(b2, "schedule_requested_at");
                int e17 = C2511a.e(b2, "run_in_foreground");
                int e18 = C2511a.e(b2, "out_of_quota_policy");
                int e19 = C2511a.e(b2, "period_count");
                int e20 = C2511a.e(b2, "generation");
                int e21 = C2511a.e(b2, "required_network_type");
                int e22 = C2511a.e(b2, "requires_charging");
                int e23 = C2511a.e(b2, "requires_device_idle");
                int e24 = C2511a.e(b2, "requires_battery_not_low");
                int e25 = C2511a.e(b2, "requires_storage_not_low");
                int e26 = C2511a.e(b2, "trigger_content_update_delay");
                int e27 = C2511a.e(b2, "trigger_max_content_delay");
                int e28 = C2511a.e(b2, "content_uri_triggers");
                int i3 = e15;
                ArrayList arrayList = new ArrayList(b2.getCount());
                while (b2.moveToNext()) {
                    String string = b2.isNull(e2) ? null : b2.getString(e2);
                    ax.B2.r f2 = C.f(b2.getInt(e3));
                    String string2 = b2.isNull(e4) ? null : b2.getString(e4);
                    String string3 = b2.isNull(e5) ? null : b2.getString(e5);
                    androidx.work.b g2 = androidx.work.b.g(b2.isNull(e6) ? null : b2.getBlob(e6));
                    androidx.work.b g3 = androidx.work.b.g(b2.isNull(e7) ? null : b2.getBlob(e7));
                    long j2 = b2.getLong(e8);
                    long j3 = b2.getLong(e9);
                    long j4 = b2.getLong(e10);
                    int i4 = b2.getInt(e11);
                    ax.B2.a c3 = C.c(b2.getInt(e12));
                    long j5 = b2.getLong(e13);
                    long j6 = b2.getLong(e14);
                    int i5 = i3;
                    long j7 = b2.getLong(i5);
                    int i6 = e2;
                    int i7 = e16;
                    long j8 = b2.getLong(i7);
                    e16 = i7;
                    int i8 = e17;
                    boolean z = b2.getInt(i8) != 0;
                    e17 = i8;
                    int i9 = e18;
                    ax.B2.m e29 = C.e(b2.getInt(i9));
                    e18 = i9;
                    int i10 = e19;
                    int i11 = b2.getInt(i10);
                    e19 = i10;
                    int i12 = e20;
                    int i13 = b2.getInt(i12);
                    e20 = i12;
                    int i14 = e21;
                    ax.B2.j d2 = C.d(b2.getInt(i14));
                    e21 = i14;
                    int i15 = e22;
                    boolean z2 = b2.getInt(i15) != 0;
                    e22 = i15;
                    int i16 = e23;
                    boolean z3 = b2.getInt(i16) != 0;
                    e23 = i16;
                    int i17 = e24;
                    boolean z4 = b2.getInt(i17) != 0;
                    e24 = i17;
                    int i18 = e25;
                    boolean z5 = b2.getInt(i18) != 0;
                    e25 = i18;
                    int i19 = e26;
                    long j9 = b2.getLong(i19);
                    e26 = i19;
                    int i20 = e27;
                    long j10 = b2.getLong(i20);
                    e27 = i20;
                    int i21 = e28;
                    e28 = i21;
                    arrayList.add(new v(string, f2, string2, string3, g2, g3, j2, j3, j4, new ax.B2.b(d2, z2, z3, z4, z5, j9, j10, C.b(b2.isNull(i21) ? null : b2.getBlob(i21))), i4, c3, j5, j6, j7, j8, z, e29, i11, i13));
                    e2 = i6;
                    i3 = i5;
                }
                b2.close();
                c2393x.f();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b2.close();
                c2393x.f();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c2393x = c2;
        }
    }

    @Override // ax.K2.w
    public int u() {
        this.a.d();
        ax.o2.k b2 = this.l.b();
        this.a.e();
        try {
            int I = b2.I();
            this.a.A();
            return I;
        } finally {
            this.a.i();
            this.l.h(b2);
        }
    }
}
