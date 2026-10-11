/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.os.UserHandle;
import android.util.Log;
import ax.h0.k;
import ax.q7.n;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@TargetApi(value=24)
public final class s0 {
    private static final Method b = s0.e();
    private static final Method c = s0.d();
    private final JobScheduler a;

    private s0(JobScheduler jobScheduler) {
        this.a = jobScheduler;
    }

    /*
     * WARNING - void declaration
     */
    private static int a() {
        block6: {
            block7: {
                block5: {
                    Object object = c;
                    if (object == null) break block6;
                    object = (Integer)((Method)object).invoke(UserHandle.class, null);
                    if (object == null) break block5;
                    try {
                        int n8 = (Integer)object;
                        return n8;
                    }
                    catch (InvocationTargetException invocationTargetException) {
                    }
                    catch (IllegalAccessException illegalAccessException) {}
                    break block7;
                }
                return 0;
            }
            if (Log.isLoggable((String)"JobSchedulerCompat", (int)6)) {
                Throwable var1_3;
                Log.e((String)"JobSchedulerCompat", (String)"myUserId invocation illegal", (Throwable)var1_3);
            }
        }
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    private final int b(JobInfo jobInfo, String object, int n8, String string) {
        block5: {
            Throwable var2_5;
            block6: {
                block4: {
                    Method method = b;
                    if (method == null) break block5;
                    object = (Integer)method.invoke(this.a, jobInfo, object, n8, string);
                    if (object == null) break block4;
                    try {
                        n8 = (Integer)object;
                        return n8;
                    }
                    catch (InvocationTargetException invocationTargetException) {
                    }
                    catch (IllegalAccessException illegalAccessException) {}
                    break block6;
                }
                return 0;
            }
            Log.e((String)string, (String)"error calling scheduleAsPackage", (Throwable)var2_5);
        }
        return this.a.schedule(jobInfo);
    }

    public static int c(Context context, JobInfo jobInfo, String string, String string2) {
        JobScheduler jobScheduler = n.n((JobScheduler)context.getSystemService("jobscheduler"));
        if (b != null && k.a(context, "android.permission.UPDATE_DEVICE_STATS") == 0) {
            return new s0(jobScheduler).b(jobInfo, string, s0.a(), string2);
        }
        return jobScheduler.schedule(jobInfo);
    }

    private static Method d() {
        block3: {
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    Method method = UserHandle.class.getDeclaredMethod("myUserId", null);
                    return method;
                }
                catch (NoSuchMethodException noSuchMethodException) {
                    if (!Log.isLoggable((String)"JobSchedulerCompat", (int)6)) break block3;
                    Log.e((String)"JobSchedulerCompat", (String)"No myUserId method available");
                }
            }
        }
        return null;
    }

    private static Method e() {
        block3: {
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    Method method = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
                    return method;
                }
                catch (NoSuchMethodException noSuchMethodException) {
                    if (!Log.isLoggable((String)"JobSchedulerCompat", (int)6)) break block3;
                    Log.e((String)"JobSchedulerCompat", (String)"No scheduleAsPackage method available, falling back to schedule");
                }
            }
        }
        return null;
    }
}

