/*
 * Decompiled with CFR 0.152.
 */
package androidx.work.impl;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.a;
import androidx.work.impl.b;
import ax.K2.A;
import ax.K2.B;
import ax.K2.c;
import ax.K2.e;
import ax.K2.f;
import ax.K2.g;
import ax.K2.h;
import ax.K2.j;
import ax.K2.k;
import ax.K2.o;
import ax.K2.p;
import ax.K2.r;
import ax.K2.s;
import ax.K2.w;
import ax.K2.x;
import ax.k2.u;
import ax.k2.w;
import ax.m2.d;
import ax.o2.h;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class WorkDatabase_Impl
extends WorkDatabase {
    private volatile w q;
    private volatile ax.K2.b r;
    private volatile A s;
    private volatile j t;
    private volatile o u;
    private volatile r v;
    private volatile e w;

    static /* synthetic */ ax.o2.g R(WorkDatabase_Impl workDatabase_Impl, ax.o2.g g8) {
        workDatabase_Impl.a = g8;
        return g8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public ax.K2.b D() {
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            try {
                if (this.r != null) return this.r;
                ax.K2.b b8 = new c(this);
                this.r = b8;
                return this.r;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public e E() {
        if (this.w != null) {
            return this.w;
        }
        synchronized (this) {
            try {
                if (this.w != null) return this.w;
                e e8 = new f(this);
                this.w = e8;
                return this.w;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public j F() {
        if (this.t != null) {
            return this.t;
        }
        synchronized (this) {
            try {
                if (this.t != null) return this.t;
                j j8 = new k(this);
                this.t = j8;
                return this.t;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public o G() {
        if (this.u != null) {
            return this.u;
        }
        synchronized (this) {
            try {
                if (this.u != null) return this.u;
                o o8 = new p(this);
                this.u = o8;
                return this.u;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public r H() {
        if (this.v != null) {
            return this.v;
        }
        synchronized (this) {
            try {
                if (this.v != null) return this.v;
                r r8 = new s(this);
                this.v = r8;
                return this.v;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public w I() {
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            try {
                if (this.q != null) return this.q;
                w w8 = new x(this);
                this.q = w8;
                return this.q;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public A J() {
        if (this.s != null) {
            return this.s;
        }
        synchronized (this) {
            try {
                if (this.s != null) return this.s;
                A a8 = new B(this);
                this.s = a8;
                return this.s;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    protected ax.k2.o g() {
        return new ax.k2.o(this, new HashMap<String, String>(0), new HashMap<String, Set<String>>(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override
    protected ax.o2.h h(ax.k2.f f8) {
        Object object = new ax.k2.w(f8, new w.b(this, 16){
            final WorkDatabase_Impl b;
            {
                this.b = workDatabase_Impl;
                super(n8);
            }

            @Override
            public void a(ax.o2.g g8) {
                g8.C("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                g8.C("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
                g8.C("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
                g8.C("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                g8.C("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                g8.C("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                g8.C("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                g8.C("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                g8.C("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                g8.C("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                g8.C("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
                g8.C("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                g8.C("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                g8.C("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                g8.C("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
            }

            @Override
            public void b(ax.o2.g g8) {
                g8.C("DROP TABLE IF EXISTS `Dependency`");
                g8.C("DROP TABLE IF EXISTS `WorkSpec`");
                g8.C("DROP TABLE IF EXISTS `WorkTag`");
                g8.C("DROP TABLE IF EXISTS `SystemIdInfo`");
                g8.C("DROP TABLE IF EXISTS `WorkName`");
                g8.C("DROP TABLE IF EXISTS `WorkProgress`");
                g8.C("DROP TABLE IF EXISTS `Preference`");
                if (this.b.h != null) {
                    int n8 = this.b.h.size();
                    for (int i8 = 0; i8 < n8; ++i8) {
                        ((u.b)this.b.h.get(i8)).b(g8);
                    }
                }
            }

            @Override
            public void c(ax.o2.g g8) {
                if (this.b.h != null) {
                    int n8 = this.b.h.size();
                    for (int i8 = 0; i8 < n8; ++i8) {
                        ((u.b)this.b.h.get(i8)).a(g8);
                    }
                }
            }

            @Override
            public void d(ax.o2.g g8) {
                WorkDatabase_Impl.R(this.b, g8);
                g8.C("PRAGMA foreign_keys = ON");
                this.b.u(g8);
                if (this.b.h != null) {
                    int n8 = this.b.h.size();
                    for (int i8 = 0; i8 < n8; ++i8) {
                        ((u.b)this.b.h.get(i8)).c(g8);
                    }
                }
            }

            @Override
            public void e(ax.o2.g g8) {
            }

            @Override
            public void f(ax.o2.g g8) {
                ax.m2.b.a(g8);
            }

            @Override
            public w.c g(ax.o2.g object) {
                Object object2 = new HashMap<String, d.a>(2);
                ((HashMap)object2).put("work_spec_id", new d.a("work_spec_id", "TEXT", true, 1, null, 1));
                ((HashMap)object2).put("prerequisite_id", new d.a("prerequisite_id", "TEXT", true, 2, null, 1));
                HashSet<d.c> hashSet = new HashSet<d.c>(2);
                hashSet.add(new d.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                hashSet.add(new d.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
                Object object3 = new HashSet<d.e>(2);
                ((HashSet)object3).add(new d.e("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
                ((HashSet)object3).add(new d.e("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
                object2 = new d("Dependency", (Map<String, d.a>)object2, (Set<d.c>)hashSet, (Set<d.e>)object3);
                object3 = d.a((ax.o2.g)object, "Dependency");
                if (!((d)object2).equals(object3)) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n");
                    ((StringBuilder)object).append(object2);
                    ((StringBuilder)object).append("\n Found:\n");
                    ((StringBuilder)object).append(object3);
                    return new w.c(false, ((StringBuilder)object).toString());
                }
                object3 = new HashMap<String, d.a>(27);
                ((HashMap)object3).put("id", new d.a("id", "TEXT", true, 1, null, 1));
                ((HashMap)object3).put("state", new d.a("state", "INTEGER", true, 0, null, 1));
                ((HashMap)object3).put("worker_class_name", new d.a("worker_class_name", "TEXT", true, 0, null, 1));
                ((HashMap)object3).put("input_merger_class_name", new d.a("input_merger_class_name", "TEXT", false, 0, null, 1));
                ((HashMap)object3).put("input", new d.a("input", "BLOB", true, 0, null, 1));
                ((HashMap)object3).put("output", new d.a("output", "BLOB", true, 0, null, 1));
                ((HashMap)object3).put("initial_delay", new d.a("initial_delay", "INTEGER", true, 0, null, 1));
                ((HashMap)object3).put("interval_duration", new d.a("interval_duration", "INTEGER", true, 0, null, 1));
                ((HashMap)object3).put("flex_duration", new d.a("flex_duration", "INTEGER", true, 0, null, 1));
                ((HashMap)object3).put("run_attempt_count", new d.a("run_attempt_count", "INTEGER", true, 0, null, 1));
                ((HashMap)object3).put("backoff_policy", new d.a("backoff_policy", "INTEGER", true, 0, null, 1));
                ((HashMap)object3).put("backoff_delay_duration", new d.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
                ((HashMap)object3).put("last_enqueue_time", new d.a("last_enqueue_time", "INTEGER", true, 0, null, 1));
                ((HashMap)object3).put("minimum_retention_duration", new d.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
                ((HashMap)object3).put("schedule_requested_at", new d.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
                ((HashMap)object3).put("run_in_foreground", new d.a("run_in_foreground", "INTEGER", true, 0, null, 1));
                ((HashMap)object3).put("out_of_quota_policy", new d.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
                ((HashMap)object3).put("period_count", new d.a("period_count", "INTEGER", true, 0, "0", 1));
                ((HashMap)object3).put("generation", new d.a("generation", "INTEGER", true, 0, "0", 1));
                ((HashMap)object3).put("required_network_type", new d.a("required_network_type", "INTEGER", true, 0, null, 1));
                ((HashMap)object3).put("requires_charging", new d.a("requires_charging", "INTEGER", true, 0, null, 1));
                ((HashMap)object3).put("requires_device_idle", new d.a("requires_device_idle", "INTEGER", true, 0, null, 1));
                ((HashMap)object3).put("requires_battery_not_low", new d.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
                ((HashMap)object3).put("requires_storage_not_low", new d.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
                ((HashMap)object3).put("trigger_content_update_delay", new d.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
                ((HashMap)object3).put("trigger_max_content_delay", new d.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
                ((HashMap)object3).put("content_uri_triggers", new d.a("content_uri_triggers", "BLOB", true, 0, null, 1));
                object2 = new HashSet<d.c>(0);
                hashSet = new HashSet(2);
                hashSet.add((d.c)((Object)new d.e("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC"))));
                hashSet.add((d.c)((Object)new d.e("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC"))));
                object3 = new d("WorkSpec", (Map<String, d.a>)object3, (Set<d.c>)object2, (Set<d.e>)hashSet);
                object2 = d.a((ax.o2.g)object, "WorkSpec");
                if (!((d)object3).equals(object2)) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n");
                    ((StringBuilder)object).append(object3);
                    ((StringBuilder)object).append("\n Found:\n");
                    ((StringBuilder)object).append(object2);
                    return new w.c(false, ((StringBuilder)object).toString());
                }
                object3 = new HashMap<String, d.a>(2);
                ((HashMap)object3).put("tag", new d.a("tag", "TEXT", true, 1, null, 1));
                ((HashMap)object3).put("work_spec_id", new d.a("work_spec_id", "TEXT", true, 2, null, 1));
                hashSet = new HashSet(1);
                hashSet.add(new d.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                object2 = new HashSet<d.e>(1);
                ((HashSet)object2).add(new d.e("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
                object3 = new d("WorkTag", (Map<String, d.a>)object3, (Set<d.c>)hashSet, (Set<d.e>)object2);
                object2 = d.a((ax.o2.g)object, "WorkTag");
                if (!((d)object3).equals(object2)) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n");
                    ((StringBuilder)object).append(object3);
                    ((StringBuilder)object).append("\n Found:\n");
                    ((StringBuilder)object).append(object2);
                    return new w.c(false, ((StringBuilder)object).toString());
                }
                object2 = new HashMap<String, d.a>(3);
                ((HashMap)object2).put("work_spec_id", new d.a("work_spec_id", "TEXT", true, 1, null, 1));
                ((HashMap)object2).put("generation", new d.a("generation", "INTEGER", true, 2, "0", 1));
                ((HashMap)object2).put("system_id", new d.a("system_id", "INTEGER", true, 0, null, 1));
                object3 = new HashSet<d.c>(1);
                ((HashSet)object3).add(new d.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                object3 = new d("SystemIdInfo", (Map<String, d.a>)object2, (Set<d.c>)object3, (Set<d.e>)new HashSet<d.e>(0));
                object2 = d.a((ax.o2.g)object, "SystemIdInfo");
                if (!((d)object3).equals(object2)) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n");
                    ((StringBuilder)object).append(object3);
                    ((StringBuilder)object).append("\n Found:\n");
                    ((StringBuilder)object).append(object2);
                    return new w.c(false, ((StringBuilder)object).toString());
                }
                object2 = new HashMap<String, d.a>(2);
                ((HashMap)object2).put("name", new d.a("name", "TEXT", true, 1, null, 1));
                ((HashMap)object2).put("work_spec_id", new d.a("work_spec_id", "TEXT", true, 2, null, 1));
                hashSet = new HashSet(1);
                hashSet.add(new d.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                object3 = new HashSet<d.e>(1);
                ((HashSet)object3).add(new d.e("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
                object2 = new d("WorkName", (Map<String, d.a>)object2, (Set<d.c>)hashSet, (Set<d.e>)object3);
                object3 = d.a((ax.o2.g)object, "WorkName");
                if (!((d)object2).equals(object3)) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n");
                    ((StringBuilder)object).append(object2);
                    ((StringBuilder)object).append("\n Found:\n");
                    ((StringBuilder)object).append(object3);
                    return new w.c(false, ((StringBuilder)object).toString());
                }
                object3 = new HashMap<String, d.a>(2);
                ((HashMap)object3).put("work_spec_id", new d.a("work_spec_id", "TEXT", true, 1, null, 1));
                ((HashMap)object3).put("progress", new d.a("progress", "BLOB", true, 0, null, 1));
                object2 = new HashSet<d.c>(1);
                ((HashSet)object2).add(new d.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                object3 = new d("WorkProgress", (Map<String, d.a>)object3, (Set<d.c>)object2, (Set<d.e>)new HashSet<d.e>(0));
                object2 = d.a((ax.o2.g)object, "WorkProgress");
                if (!((d)object3).equals(object2)) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n");
                    ((StringBuilder)object).append(object3);
                    ((StringBuilder)object).append("\n Found:\n");
                    ((StringBuilder)object).append(object2);
                    return new w.c(false, ((StringBuilder)object).toString());
                }
                object2 = new HashMap<String, d.a>(2);
                ((HashMap)object2).put("key", new d.a("key", "TEXT", true, 1, null, 1));
                ((HashMap)object2).put("long_value", new d.a("long_value", "INTEGER", false, 0, null, 1));
                object2 = new d("Preference", (Map<String, d.a>)object2, (Set<d.c>)new HashSet<d.c>(0), (Set<d.e>)new HashSet<d.e>(0));
                object = d.a((ax.o2.g)object, "Preference");
                if (!((d)object2).equals(object)) {
                    object3 = new StringBuilder();
                    ((StringBuilder)object3).append("Preference(androidx.work.impl.model.Preference).\n Expected:\n");
                    ((StringBuilder)object3).append(object2);
                    ((StringBuilder)object3).append("\n Found:\n");
                    ((StringBuilder)object3).append(object);
                    return new w.c(false, ((StringBuilder)object3).toString());
                }
                return new w.c(true, null);
            }
        }, "5181942b9ebc31ce68dacb56c16fd79f", "ae2044fb577e65ee8bb576ca48a2f06e");
        object = h.b.a(f8.a).d(f8.b).c((h.a)object).b();
        return f8.c.a((h.b)object);
    }

    @Override
    public List<ax.l2.b> j(Map<Class<? extends ax.l2.a>, ax.l2.a> map) {
        return Arrays.asList(new a(), new b());
    }

    @Override
    public Set<Class<? extends ax.l2.a>> o() {
        return new HashSet<Class<? extends ax.l2.a>>();
    }

    @Override
    protected Map<Class<?>, List<Class<?>>> p() {
        HashMap hashMap = new HashMap();
        hashMap.put(w.class, x.v());
        hashMap.put(ax.K2.b.class, c.e());
        hashMap.put(A.class, B.d());
        hashMap.put(j.class, k.h());
        hashMap.put(o.class, ax.K2.p.c());
        hashMap.put(r.class, ax.K2.s.b());
        hashMap.put(e.class, f.c());
        hashMap.put(g.class, ax.K2.h.a());
        return hashMap;
    }
}

