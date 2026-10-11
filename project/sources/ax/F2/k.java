package ax.F2;

import android.annotation.SuppressLint;
import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import ax.B2.b;
import ax.K2.v;
import java.util.Iterator;

@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
class k {
    private static final String b = ax.B2.i.i("SystemJobInfoConverter");
    private final ComponentName a;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ax.B2.j.values().length];
            a = iArr;
            try {
                iArr[ax.B2.j.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ax.B2.j.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ax.B2.j.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ax.B2.j.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ax.B2.j.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    k(Context context) {
        this.a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }

    private static JobInfo.TriggerContentUri b(b.C0054b c0054b) {
        boolean b2 = c0054b.b();
        i.a();
        return h.a(c0054b.a(), b2 ? 1 : 0);
    }

    static int c(ax.B2.j jVar) {
        int i = a.a[jVar.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i != 4) {
            if (i == 5 && Build.VERSION.SDK_INT >= 26) {
                return 4;
            }
        } else if (Build.VERSION.SDK_INT >= 24) {
            return 3;
        }
        ax.B2.i.e().a(b, "API version too low. Cannot convert network type value " + jVar);
        return 1;
    }

    static void d(JobInfo.Builder builder, ax.B2.j jVar) {
        if (Build.VERSION.SDK_INT < 30 || jVar != ax.B2.j.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(c(jVar));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    JobInfo a(v vVar, int i) {
        ax.B2.b bVar = vVar.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", vVar.a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", vVar.d());
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", vVar.h());
        JobInfo.Builder extras = new JobInfo.Builder(i, this.a).setRequiresCharging(bVar.g()).setRequiresDeviceIdle(bVar.h()).setExtras(persistableBundle);
        d(extras, bVar.d());
        if (!bVar.h()) {
            extras.setBackoffCriteria(vVar.m, vVar.l == ax.B2.a.LINEAR ? 0 : 1);
        }
        long max = Math.max(vVar.a() - System.currentTimeMillis(), 0L);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!vVar.q) {
            extras.setImportantWhileForeground(true);
        }
        if (i2 >= 24 && bVar.e()) {
            Iterator<b.C0054b> it = bVar.c().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(b(it.next()));
            }
            extras.setTriggerContentUpdateDelay(bVar.b());
            extras.setTriggerContentMaxDelay(bVar.a());
        }
        extras.setPersisted(false);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            extras.setRequiresBatteryNotLow(bVar.f());
            extras.setRequiresStorageNotLow(bVar.i());
        }
        boolean z = vVar.k > 0;
        boolean z2 = max > 0;
        if (i3 >= 31 && vVar.q && !z && !z2) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
