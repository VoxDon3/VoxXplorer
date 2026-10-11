package ax.F2;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import ax.B2.r;
import ax.C2.D;
import ax.C2.t;
import ax.K2.m;
import ax.K2.v;
import ax.K2.w;
import ax.K2.y;
import ax.b0.InterfaceC1440a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class l implements t {
    private static final String e = ax.B2.i.i("SystemJobScheduler");
    private final Context a;
    private final JobScheduler b;
    private final D c;
    private final k d;

    public l(Context context, D d) {
        this(context, d, (JobScheduler) context.getSystemService("jobscheduler"), new k(context));
    }

    public static void b(Context context) {
        List<JobInfo> g;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (g = g(context, jobScheduler)) == null || g.isEmpty()) {
            return;
        }
        Iterator<JobInfo> it = g.iterator();
        while (it.hasNext()) {
            e(jobScheduler, it.next().getId());
        }
    }

    private static void e(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            ax.B2.i.e().d(e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    private static List<Integer> f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> g = g(context, jobScheduler);
        if (g == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : g) {
            m h = h(jobInfo);
            if (h != null && str.equals(h.b())) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    private static List<JobInfo> g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            ax.B2.i.e().d(e, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    private static m h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new m(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static boolean i(Context context, D d) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> g = g(context, jobScheduler);
        List<String> a = d.o().F().a();
        boolean z = false;
        HashSet hashSet = new HashSet(g != null ? g.size() : 0);
        if (g != null && !g.isEmpty()) {
            for (JobInfo jobInfo : g) {
                m h = h(jobInfo);
                if (h != null) {
                    hashSet.add(h.b());
                } else {
                    e(jobScheduler, jobInfo.getId());
                }
            }
        }
        Iterator<String> it = a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!hashSet.contains(it.next())) {
                ax.B2.i.e().a(e, "Reconciling jobs");
                z = true;
                break;
            }
        }
        if (!z) {
            return z;
        }
        WorkDatabase o = d.o();
        o.e();
        try {
            w I = o.I();
            Iterator<String> it2 = a.iterator();
            while (it2.hasNext()) {
                I.b(it2.next(), -1L);
            }
            o.A();
            o.i();
            return z;
        } catch (Throwable th) {
            o.i();
            throw th;
        }
    }

    @Override // ax.C2.t
    public void a(v... vVarArr) {
        List<Integer> f;
        WorkDatabase o = this.c.o();
        ax.L2.k kVar = new ax.L2.k(o);
        for (v vVar : vVarArr) {
            o.e();
            try {
                v n = o.I().n(vVar.a);
                if (n == null) {
                    ax.B2.i.e().k(e, "Skipping scheduling " + vVar.a + " because it's no longer in the DB");
                    o.A();
                } else if (n.b != r.ENQUEUED) {
                    ax.B2.i.e().k(e, "Skipping scheduling " + vVar.a + " because it is no longer enqueued");
                    o.A();
                } else {
                    m a = y.a(vVar);
                    ax.K2.i c = o.F().c(a);
                    int e2 = c != null ? c.c : kVar.e(this.c.h().i(), this.c.h().g());
                    if (c == null) {
                        this.c.o().F().b(ax.K2.l.a(a, e2));
                    }
                    j(vVar, e2);
                    if (Build.VERSION.SDK_INT == 23 && (f = f(this.a, this.b, vVar.a)) != null) {
                        int indexOf = f.indexOf(Integer.valueOf(e2));
                        if (indexOf >= 0) {
                            f.remove(indexOf);
                        }
                        j(vVar, !f.isEmpty() ? f.get(0).intValue() : kVar.e(this.c.h().i(), this.c.h().g()));
                    }
                    o.A();
                }
            } finally {
                o.i();
            }
        }
    }

    @Override // ax.C2.t
    public boolean c() {
        return true;
    }

    @Override // ax.C2.t
    public void d(String str) {
        List<Integer> f = f(this.a, this.b, str);
        if (f == null || f.isEmpty()) {
            return;
        }
        Iterator<Integer> it = f.iterator();
        while (it.hasNext()) {
            e(this.b, it.next().intValue());
        }
        this.c.o().F().f(str);
    }

    public void j(v vVar, int i) {
        JobInfo a = this.d.a(vVar, i);
        ax.B2.i e2 = ax.B2.i.e();
        String str = e;
        e2.a(str, "Scheduling work ID " + vVar.a + "Job ID " + i);
        try {
            if (this.b.schedule(a) == 0) {
                ax.B2.i.e().k(str, "Unable to schedule work ID " + vVar.a);
                if (vVar.q && vVar.r == ax.B2.m.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    vVar.q = false;
                    ax.B2.i.e().a(str, String.format("Scheduling a non-expedited job (work ID %s)", vVar.a));
                    j(vVar, i);
                }
            }
        } catch (IllegalStateException e3) {
            List<JobInfo> g = g(this.a, this.b);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(g != null ? g.size() : 0), Integer.valueOf(this.c.o().I().f().size()), Integer.valueOf(this.c.h().h()));
            ax.B2.i.e().c(e, format);
            IllegalStateException illegalStateException = new IllegalStateException(format, e3);
            InterfaceC1440a<Throwable> l = this.c.h().l();
            if (l == null) {
                throw illegalStateException;
            }
            l.accept(illegalStateException);
        } catch (Throwable th) {
            ax.B2.i.e().d(e, "Unable to schedule " + vVar, th);
        }
    }

    public l(Context context, D d, JobScheduler jobScheduler, k kVar) {
        this.a = context;
        this.c = d;
        this.b = jobScheduler;
        this.d = kVar;
    }
}
