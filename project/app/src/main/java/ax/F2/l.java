/*
 * Decompiled with CFR 0.152.
 */
package ax.F2;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import ax.B2.i;
import ax.B2.m;
import ax.B2.r;
import ax.C2.D;
import ax.C2.t;
import ax.F2.k;
import ax.K2.v;
import ax.K2.y;
import ax.k2.u;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

public class l
implements t {
    private static final String e = i.i("SystemJobScheduler");
    private final Context a;
    private final JobScheduler b;
    private final D c;
    private final k d;

    public l(Context context, D d8) {
        this(context, d8, (JobScheduler)context.getSystemService("jobscheduler"), new k(context));
    }

    public l(Context context, D d8, JobScheduler jobScheduler, k k8) {
        this.a = context;
        this.c = d8;
        this.b = jobScheduler;
        this.d = k8;
    }

    public static void b(Context object) {
        JobScheduler jobScheduler = (JobScheduler)object.getSystemService("jobscheduler");
        if (jobScheduler != null && (object = l.g((Context)object, jobScheduler)) != null && !object.isEmpty()) {
            object = object.iterator();
            while (object.hasNext()) {
                l.e(jobScheduler, ((JobInfo)object.next()).getId());
            }
        }
    }

    private static void e(JobScheduler jobScheduler, int n8) {
        try {
            jobScheduler.cancel(n8);
            return;
        }
        catch (Throwable throwable) {
            i.e().d(e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", n8), throwable);
            return;
        }
    }

    private static List<Integer> f(Context object, JobScheduler object2, String string) {
        if ((object2 = l.g((Context)object, (JobScheduler)object2)) == null) {
            return null;
        }
        object = new ArrayList(2);
        object2 = object2.iterator();
        while (object2.hasNext()) {
            JobInfo jobInfo = (JobInfo)object2.next();
            ax.K2.m m8 = l.h(jobInfo);
            if (m8 == null || !string.equals(m8.b())) continue;
            object.add(jobInfo.getId());
        }
        return object;
    }

    private static List<JobInfo> g(Context context, JobScheduler object) {
        try {
            object = object.getAllPendingJobs();
        }
        catch (Throwable throwable) {
            i.e().d(e, "getAllPendingJobs() is not reliable on this device.", throwable);
            object = null;
        }
        if (object == null) {
            return null;
        }
        ArrayList<JobInfo> arrayList = new ArrayList<JobInfo>(object.size());
        context = new ComponentName(context, SystemJobService.class);
        object = object.iterator();
        while (object.hasNext()) {
            JobInfo jobInfo = (JobInfo)object.next();
            if (!context.equals((Object)jobInfo.getService())) continue;
            arrayList.add(jobInfo);
        }
        return arrayList;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static ax.K2.m h(JobInfo object) {
        PersistableBundle persistableBundle = object.getExtras();
        if (persistableBundle == null) return null;
        try {
            if (!persistableBundle.containsKey("EXTRA_WORK_SPEC_ID")) return null;
            int n8 = persistableBundle.getInt("EXTRA_WORK_SPEC_GENERATION", 0);
            return new ax.K2.m(persistableBundle.getString("EXTRA_WORK_SPEC_ID"), n8);
        }
        catch (NullPointerException nullPointerException) {
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean i(Context object, D object2) {
        boolean bl;
        Object object3;
        block9: {
            object3 = (JobScheduler)object.getSystemService("jobscheduler");
            Object object4 = l.g((Context)object, (JobScheduler)object3);
            object = ((D)object2).o().F().a();
            boolean bl2 = false;
            int n8 = object4 != null ? object4.size() : 0;
            HashSet<String> hashSet = new HashSet<String>(n8);
            if (object4 != null && !object4.isEmpty()) {
                object4 = object4.iterator();
                while (object4.hasNext()) {
                    JobInfo jobInfo = (JobInfo)object4.next();
                    ax.K2.m m8 = l.h(jobInfo);
                    if (m8 != null) {
                        hashSet.add(m8.b());
                        continue;
                    }
                    l.e((JobScheduler)object3, jobInfo.getId());
                }
            }
            object3 = object.iterator();
            do {
                bl = bl2;
                if (!object3.hasNext()) break block9;
            } while (hashSet.contains((String)object3.next()));
            i.e().a(e, "Reconciling jobs");
            bl = true;
        }
        if (!bl) {
            return bl;
        }
        object2 = ((D)object2).o();
        ((u)object2).e();
        try {
            object3 = ((WorkDatabase)object2).I();
            object = object.iterator();
            while (true) {
                if (!object.hasNext()) {
                    ((u)object2).A();
                    ((u)object2).i();
                    return bl;
                }
                object3.b((String)object.next(), -1L);
            }
        }
        catch (Throwable throwable) {}
        ((u)object2).i();
        throw throwable;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(v ... vArray) {
        Throwable throwable2;
        WorkDatabase workDatabase = this.c.o();
        ax.L2.k k8 = new ax.L2.k(workDatabase);
        int n8 = vArray.length;
        int n9 = 0;
        while (true) {
            block9: {
                Object object;
                Object object2;
                v v8;
                block10: {
                    if (n9 >= n8) {
                        return;
                    }
                    v8 = vArray[n9];
                    workDatabase.e();
                    try {
                        Object object3;
                        object2 = workDatabase.I().n(v8.a);
                        if (object2 == null) {
                            object2 = i.e();
                            object = e;
                            object3 = new StringBuilder();
                            ((StringBuilder)object3).append("Skipping scheduling ");
                            ((StringBuilder)object3).append(v8.a);
                            ((StringBuilder)object3).append(" because it's no longer in the DB");
                            ((i)object2).k((String)object, ((StringBuilder)object3).toString());
                            workDatabase.A();
                            break block9;
                        }
                        if (((v)object2).b == r.q) break block10;
                        object3 = i.e();
                        object2 = e;
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Skipping scheduling ");
                        ((StringBuilder)object).append(v8.a);
                        ((StringBuilder)object).append(" because it is no longer enqueued");
                        ((i)object3).k((String)object2, ((StringBuilder)object).toString());
                        workDatabase.A();
                        break block9;
                    }
                    catch (Throwable throwable2) {
                        break;
                    }
                }
                object = y.a(v8);
                object2 = workDatabase.F().c((ax.K2.m)object);
                int n10 = object2 != null ? ((ax.K2.i)object2).c : k8.e(this.c.h().i(), this.c.h().g());
                if (object2 == null) {
                    object2 = ax.K2.l.a((ax.K2.m)object, n10);
                    this.c.o().F().b((ax.K2.i)object2);
                }
                this.j(v8, n10);
                if (Build.VERSION.SDK_INT == 23 && (object2 = l.f(this.a, this.b, v8.a)) != null) {
                    if ((n10 = object2.indexOf(n10)) >= 0) {
                        object2.remove(n10);
                    }
                    n10 = !object2.isEmpty() ? object2.get(0).intValue() : k8.e(this.c.h().i(), this.c.h().g());
                    this.j(v8, n10);
                }
                workDatabase.A();
            }
            workDatabase.i();
            ++n9;
        }
        workDatabase.i();
        throw throwable2;
    }

    @Override
    public boolean c() {
        return true;
    }

    @Override
    public void d(String string) {
        List<Integer> list = l.f(this.a, this.b, string);
        if (list != null && !list.isEmpty()) {
            list = list.iterator();
            while (list.hasNext()) {
                int n8 = (Integer)list.next();
                l.e(this.b, n8);
            }
            this.c.o().F().f(string);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void j(v var1_1, int var2_4) {
        var6_5 /* !! */  = this.d.a(var1_1, var2_4);
        var4_6 = i.e();
        var3_7 = l.e;
        var5_8 = new StringBuilder();
        var5_8.append("Scheduling work ID ");
        var5_8.append(var1_1.a);
        var5_8.append("Job ID ");
        var5_8.append(var2_4);
        var4_6.a((String)var3_7, var5_8.toString());
        try {
            if (this.b.schedule(var6_5 /* !! */ ) != 0) return;
            var4_6 = i.e();
            var5_8 = new StringBuilder();
            var5_8.append("Unable to schedule work ID ");
            var5_8.append(var1_1.a);
            var4_6.k((String)var3_7, var5_8.toString());
            if (!var1_1.q || var1_1.r != m.q) return;
            var1_1.q = false;
            var4_6 = String.format("Scheduling a non-expedited job (work ID %s)", new Object[]{var1_1.a});
            i.e().a((String)var3_7, (String)var4_6);
            this.j(var1_1, var2_4);
            return;
        }
        catch (IllegalStateException var1_2) {}
        ** finally { 
lbl31:
        // 1 sources

        var3_7 = i.e();
        var6_5 /* !! */  = l.e;
        var4_6 = new StringBuilder();
        var4_6.append("Unable to schedule ");
        var4_6.append(var1_1);
        var3_7.d((String)var6_5 /* !! */ , var4_6.toString(), var5_9);
    }
}

