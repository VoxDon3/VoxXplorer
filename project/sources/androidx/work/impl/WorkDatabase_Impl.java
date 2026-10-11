package androidx.work.impl;

import ax.K2.A;
import ax.K2.B;
import ax.K2.C0783c;
import ax.K2.InterfaceC0782b;
import ax.K2.e;
import ax.K2.f;
import ax.K2.g;
import ax.K2.j;
import ax.K2.k;
import ax.K2.o;
import ax.K2.p;
import ax.K2.r;
import ax.K2.s;
import ax.K2.w;
import ax.K2.x;
import ax.k2.AbstractC2390u;
import ax.k2.C2375f;
import ax.k2.C2384o;
import ax.k2.C2392w;
import ax.l2.AbstractC2464b;
import ax.l2.InterfaceC2463a;
import ax.m2.C2512b;
import ax.m2.d;
import ax.o2.h;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    private volatile w q;
    private volatile InterfaceC0782b r;
    private volatile A s;
    private volatile j t;
    private volatile o u;
    private volatile r v;
    private volatile e w;

    @Override // androidx.work.impl.WorkDatabase
    public InterfaceC0782b D() {
        InterfaceC0782b interfaceC0782b;
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            try {
                if (this.r == null) {
                    this.r = new C0783c(this);
                }
                interfaceC0782b = this.r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC0782b;
    }

    @Override // androidx.work.impl.WorkDatabase
    public e E() {
        e eVar;
        if (this.w != null) {
            return this.w;
        }
        synchronized (this) {
            try {
                if (this.w == null) {
                    this.w = new f(this);
                }
                eVar = this.w;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public j F() {
        j jVar;
        if (this.t != null) {
            return this.t;
        }
        synchronized (this) {
            try {
                if (this.t == null) {
                    this.t = new k(this);
                }
                jVar = this.t;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public o G() {
        o oVar;
        if (this.u != null) {
            return this.u;
        }
        synchronized (this) {
            try {
                if (this.u == null) {
                    this.u = new p(this);
                }
                oVar = this.u;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public r H() {
        r rVar;
        if (this.v != null) {
            return this.v;
        }
        synchronized (this) {
            try {
                if (this.v == null) {
                    this.v = new s(this);
                }
                rVar = this.v;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public w I() {
        w wVar;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            try {
                if (this.q == null) {
                    this.q = new x(this);
                }
                wVar = this.q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return wVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public A J() {
        A a2;
        if (this.s != null) {
            return this.s;
        }
        synchronized (this) {
            try {
                if (this.s == null) {
                    this.s = new B(this);
                }
                a2 = this.s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return a2;
    }

    @Override // ax.k2.AbstractC2390u
    protected C2384o g() {
        return new C2384o(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // ax.k2.AbstractC2390u
    protected h h(C2375f c2375f) {
        return c2375f.c.a(h.b.a(c2375f.a).d(c2375f.b).c(new C2392w(c2375f, new a(16), "5181942b9ebc31ce68dacb56c16fd79f", "ae2044fb577e65ee8bb576ca48a2f06e")).b());
    }

    @Override // ax.k2.AbstractC2390u
    public List<AbstractC2464b> j(Map<Class<? extends InterfaceC2463a>, InterfaceC2463a> map) {
        return Arrays.asList(new androidx.work.impl.a(), new b());
    }

    @Override // ax.k2.AbstractC2390u
    public Set<Class<? extends InterfaceC2463a>> o() {
        return new HashSet();
    }

    @Override // ax.k2.AbstractC2390u
    protected Map<Class<?>, List<Class<?>>> p() {
        HashMap hashMap = new HashMap();
        hashMap.put(w.class, x.v());
        hashMap.put(InterfaceC0782b.class, C0783c.e());
        hashMap.put(A.class, B.d());
        hashMap.put(j.class, k.h());
        hashMap.put(o.class, p.c());
        hashMap.put(r.class, s.b());
        hashMap.put(e.class, f.c());
        hashMap.put(g.class, ax.K2.h.a());
        return hashMap;
    }

    class a extends C2392w.b {
        a(int i) {
            super(i);
        }

        @Override // ax.k2.C2392w.b
        public void a(ax.o2.g gVar) {
            gVar.C("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.C("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            gVar.C("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            gVar.C("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            gVar.C("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            gVar.C("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
            gVar.C("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.C("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            gVar.C("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.C("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.C("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            gVar.C("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.C("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            gVar.C("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            gVar.C("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
        }

        @Override // ax.k2.C2392w.b
        public void b(ax.o2.g gVar) {
            gVar.C("DROP TABLE IF EXISTS `Dependency`");
            gVar.C("DROP TABLE IF EXISTS `WorkSpec`");
            gVar.C("DROP TABLE IF EXISTS `WorkTag`");
            gVar.C("DROP TABLE IF EXISTS `SystemIdInfo`");
            gVar.C("DROP TABLE IF EXISTS `WorkName`");
            gVar.C("DROP TABLE IF EXISTS `WorkProgress`");
            gVar.C("DROP TABLE IF EXISTS `Preference`");
            if (((AbstractC2390u) WorkDatabase_Impl.this).h != null) {
                int size = ((AbstractC2390u) WorkDatabase_Impl.this).h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC2390u.b) ((AbstractC2390u) WorkDatabase_Impl.this).h.get(i)).b(gVar);
                }
            }
        }

        @Override // ax.k2.C2392w.b
        public void c(ax.o2.g gVar) {
            if (((AbstractC2390u) WorkDatabase_Impl.this).h != null) {
                int size = ((AbstractC2390u) WorkDatabase_Impl.this).h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC2390u.b) ((AbstractC2390u) WorkDatabase_Impl.this).h.get(i)).a(gVar);
                }
            }
        }

        @Override // ax.k2.C2392w.b
        public void d(ax.o2.g gVar) {
            ((AbstractC2390u) WorkDatabase_Impl.this).a = gVar;
            gVar.C("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.u(gVar);
            if (((AbstractC2390u) WorkDatabase_Impl.this).h != null) {
                int size = ((AbstractC2390u) WorkDatabase_Impl.this).h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC2390u.b) ((AbstractC2390u) WorkDatabase_Impl.this).h.get(i)).c(gVar);
                }
            }
        }

        @Override // ax.k2.C2392w.b
        public void f(ax.o2.g gVar) {
            C2512b.a(gVar);
        }

        @Override // ax.k2.C2392w.b
        public C2392w.c g(ax.o2.g gVar) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new d.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap.put("prerequisite_id", new d.a("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new d.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new d.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new d.e("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            hashSet2.add(new d.e("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
            d dVar = new d("Dependency", hashMap, hashSet, hashSet2);
            d a = d.a(gVar, "Dependency");
            if (!dVar.equals(a)) {
                return new C2392w.c(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + dVar + "\n Found:\n" + a);
            }
            HashMap hashMap2 = new HashMap(27);
            hashMap2.put("id", new d.a("id", "TEXT", true, 1, null, 1));
            hashMap2.put("state", new d.a("state", "INTEGER", true, 0, null, 1));
            hashMap2.put("worker_class_name", new d.a("worker_class_name", "TEXT", true, 0, null, 1));
            hashMap2.put("input_merger_class_name", new d.a("input_merger_class_name", "TEXT", false, 0, null, 1));
            hashMap2.put("input", new d.a("input", "BLOB", true, 0, null, 1));
            hashMap2.put("output", new d.a("output", "BLOB", true, 0, null, 1));
            hashMap2.put("initial_delay", new d.a("initial_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("interval_duration", new d.a("interval_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("flex_duration", new d.a("flex_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_attempt_count", new d.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_policy", new d.a("backoff_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_delay_duration", new d.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("last_enqueue_time", new d.a("last_enqueue_time", "INTEGER", true, 0, null, 1));
            hashMap2.put("minimum_retention_duration", new d.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("schedule_requested_at", new d.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_in_foreground", new d.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            hashMap2.put("out_of_quota_policy", new d.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("period_count", new d.a("period_count", "INTEGER", true, 0, "0", 1));
            hashMap2.put("generation", new d.a("generation", "INTEGER", true, 0, "0", 1));
            hashMap2.put("required_network_type", new d.a("required_network_type", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_charging", new d.a("requires_charging", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_device_idle", new d.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_battery_not_low", new d.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_storage_not_low", new d.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_content_update_delay", new d.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_max_content_delay", new d.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("content_uri_triggers", new d.a("content_uri_triggers", "BLOB", true, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new d.e("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
            hashSet4.add(new d.e("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
            d dVar2 = new d("WorkSpec", hashMap2, hashSet3, hashSet4);
            d a2 = d.a(gVar, "WorkSpec");
            if (!dVar2.equals(a2)) {
                return new C2392w.c(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + dVar2 + "\n Found:\n" + a2);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new d.a("tag", "TEXT", true, 1, null, 1));
            hashMap3.put("work_spec_id", new d.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new d.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new d.e("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            d dVar3 = new d("WorkTag", hashMap3, hashSet5, hashSet6);
            d a3 = d.a(gVar, "WorkTag");
            if (!dVar3.equals(a3)) {
                return new C2392w.c(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + dVar3 + "\n Found:\n" + a3);
            }
            HashMap hashMap4 = new HashMap(3);
            hashMap4.put("work_spec_id", new d.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap4.put("generation", new d.a("generation", "INTEGER", true, 2, "0", 1));
            hashMap4.put("system_id", new d.a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new d.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            d dVar4 = new d("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            d a4 = d.a(gVar, "SystemIdInfo");
            if (!dVar4.equals(a4)) {
                return new C2392w.c(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + dVar4 + "\n Found:\n" + a4);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("name", new d.a("name", "TEXT", true, 1, null, 1));
            hashMap5.put("work_spec_id", new d.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new d.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new d.e("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            d dVar5 = new d("WorkName", hashMap5, hashSet8, hashSet9);
            d a5 = d.a(gVar, "WorkName");
            if (!dVar5.equals(a5)) {
                return new C2392w.c(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + dVar5 + "\n Found:\n" + a5);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new d.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap6.put("progress", new d.a("progress", "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new d.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            d dVar6 = new d("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            d a6 = d.a(gVar, "WorkProgress");
            if (!dVar6.equals(a6)) {
                return new C2392w.c(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + dVar6 + "\n Found:\n" + a6);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("key", new d.a("key", "TEXT", true, 1, null, 1));
            hashMap7.put("long_value", new d.a("long_value", "INTEGER", false, 0, null, 1));
            d dVar7 = new d("Preference", hashMap7, new HashSet(0), new HashSet(0));
            d a7 = d.a(gVar, "Preference");
            if (dVar7.equals(a7)) {
                return new C2392w.c(true, null);
            }
            return new C2392w.c(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + dVar7 + "\n Found:\n" + a7);
        }

        @Override // ax.k2.C2392w.b
        public void e(ax.o2.g gVar) {
        }
    }
}
