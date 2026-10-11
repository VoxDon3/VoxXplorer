/*
 * Decompiled with CFR 0.152.
 */
package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import androidx.profileinstaller.f;
import ax.f2.m;

public class ProfileInstallReceiver
extends BroadcastReceiver {
    static void a(int n8, f.c c8) {
        if (Build.VERSION.SDK_INT >= 24) {
            Process.sendSignal((int)n8, (int)10);
            c8.b(12, null);
            return;
        }
        c8.b(13, null);
    }

    static void b(f.c c8) {
        ProfileInstallReceiver.a(Process.myPid(), c8);
    }

    public void onReceive(Context context, Intent object) {
        if (object != null) {
            Object object2 = object.getAction();
            if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(object2)) {
                f.j(context, new m(), new a(this), true);
                return;
            }
            if ("androidx.profileinstaller.action.SKIP_FILE".equals(object2)) {
                if ((object = object.getExtras()) != null) {
                    if ("WRITE_SKIP_FILE".equals(object = object.getString("EXTRA_SKIP_FILE_OPERATION"))) {
                        f.k(context, new m(), new a(this));
                        return;
                    }
                    if ("DELETE_SKIP_FILE".equals(object)) {
                        f.c(context, new m(), new a(this));
                        return;
                    }
                }
            } else {
                Bundle bundle;
                if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(object2)) {
                    ProfileInstallReceiver.b(new a(this));
                    return;
                }
                if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(object2) && (bundle = object.getExtras()) != null) {
                    object = bundle.getString("EXTRA_BENCHMARK_OPERATION");
                    object2 = new a(this);
                    if ("DROP_SHADER_CACHE".equals(object)) {
                        androidx.profileinstaller.a.b(context, (a)object2);
                        return;
                    }
                    if ("SAVE_PROFILE".equals(object)) {
                        ProfileInstallReceiver.a(bundle.getInt("EXTRA_PID", Process.myPid()), (f.c)object2);
                        return;
                    }
                    ((a)object2).b(16, null);
                }
            }
        }
    }

    class a
    implements f.c {
        final ProfileInstallReceiver a;

        a(ProfileInstallReceiver profileInstallReceiver) {
            this.a = profileInstallReceiver;
        }

        @Override
        public void a(int n8, Object object) {
            f.b.a(n8, object);
        }

        @Override
        public void b(int n8, Object object) {
            f.b.b(n8, object);
            this.a.setResultCode(n8);
        }
    }
}

