/*
 * Decompiled with CFR 0.152.
 */
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
import ax.F2.b;
import ax.F2.c;
import ax.F2.d;
import ax.F2.e;
import ax.F2.f;
import ax.F2.g;
import ax.F2.h;
import ax.F2.i;
import ax.F2.j;
import ax.K2.v;
import java.util.Iterator;

@SuppressLint(value={"ClassVerificationFailure"})
class k {
    private static final String b = ax.B2.i.i("SystemJobInfoConverter");
    private final ComponentName a;

    k(Context context) {
        this.a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    private static JobInfo.TriggerContentUri b(b.b b8) {
        int n8 = b8.b();
        i.a();
        return h.a(b8.a(), n8);
    }

    static int c(ax.B2.j j8) {
        int n8 = ax.F2.k$a.a[j8.ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    if (n8 != 4) {
                        if (n8 == 5 && Build.VERSION.SDK_INT >= 26) {
                            return 4;
                        }
                    } else if (Build.VERSION.SDK_INT >= 24) {
                        return 3;
                    }
                    ax.B2.i i8 = ax.B2.i.e();
                    String string = b;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("API version too low. Cannot convert network type value ");
                    stringBuilder.append((Object)j8);
                    i8.a(string, stringBuilder.toString());
                    return 1;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    static void d(JobInfo.Builder builder, ax.B2.j j8) {
        if (Build.VERSION.SDK_INT >= 30 && j8 == ax.B2.j.g0) {
            j.a(builder, new NetworkRequest.Builder().addCapability(25).build());
            return;
        }
        builder.setRequiredNetworkType(k.c(j8));
    }

    JobInfo a(v v8, int n8) {
        ax.B2.b b8 = v8.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", v8.a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", v8.d());
        ax.R.h.a(persistableBundle, "EXTRA_IS_PERIODIC", v8.h());
        persistableBundle = new JobInfo.Builder(n8, this.a).setRequiresCharging(b8.g()).setRequiresDeviceIdle(b8.h()).setExtras(persistableBundle);
        k.d((JobInfo.Builder)persistableBundle, b8.d());
        boolean bl = b8.h();
        boolean bl2 = false;
        if (!bl) {
            n8 = v8.l == ax.B2.a.c0 ? 0 : 1;
            persistableBundle.setBackoffCriteria(v8.m, n8);
        }
        long l8 = Math.max(v8.a() - System.currentTimeMillis(), 0L);
        n8 = Build.VERSION.SDK_INT;
        if (n8 <= 28) {
            persistableBundle.setMinimumLatency(l8);
        } else if (l8 > 0L) {
            persistableBundle.setMinimumLatency(l8);
        } else if (!v8.q) {
            ax.F2.a.a((JobInfo.Builder)persistableBundle, true);
        }
        if (n8 >= 24 && b8.e()) {
            Iterator<b.b> iterator = b8.c().iterator();
            while (iterator.hasNext()) {
                ax.F2.b.a((JobInfo.Builder)persistableBundle, k.b(iterator.next()));
            }
            c.a((JobInfo.Builder)persistableBundle, b8.b());
            d.a((JobInfo.Builder)persistableBundle, b8.a());
        }
        persistableBundle.setPersisted(false);
        int n9 = Build.VERSION.SDK_INT;
        if (n9 >= 26) {
            e.a((JobInfo.Builder)persistableBundle, b8.f());
            f.a((JobInfo.Builder)persistableBundle, b8.i());
        }
        n8 = v8.k > 0 ? 1 : 0;
        if (l8 > 0L) {
            bl2 = true;
        }
        if (n9 >= 31 && v8.q && n8 == 0 && !bl2) {
            g.a((JobInfo.Builder)persistableBundle, true);
        }
        return persistableBundle.build();
    }
}

