package com.voxdon.xplorer.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import ax.Ha.c;
import ax.o3.C2685b;
import com.voxdon.xplorer.file.AbstractC3595n;
import java.io.File;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class FileObserverService extends Service {
    private static final Logger b = Logger.getLogger("FileManager.FileObserverService");
    private String a;

    public static void a(Context context, AbstractC3595n abstractC3595n, File file) {
        try {
            Intent intent = new Intent(context, (Class<?>) FileObserverService.class);
            intent.putExtra("location_uri", abstractC3595n.Q());
            intent.putExtra("filepath", file.getAbsolutePath());
            context.startService(intent);
        } catch (IllegalStateException e) {
            c.h().f().b("CANNOT START FILE OBSERVER SERVICE").l(e).h();
        }
    }

    public static void b(Context context) {
        try {
            context.stopService(new Intent(context, (Class<?>) FileObserverService.class));
        } catch (RuntimeException unused) {
            c.h().f().b("FILE OBSERVER SERVICE STOP ERROR").h();
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            stopSelf();
            return 2;
        }
        String stringExtra = intent.getStringExtra("filepath");
        String stringExtra2 = intent.getStringExtra("location_uri");
        if (stringExtra == null || stringExtra2 == null) {
            stopSelf();
            return 2;
        }
        if (!new File(stringExtra).exists()) {
            stopSelf();
            return 2;
        }
        this.a = stringExtra2;
        C2685b.j().e(stringExtra, stringExtra2);
        return 2;
    }
}
