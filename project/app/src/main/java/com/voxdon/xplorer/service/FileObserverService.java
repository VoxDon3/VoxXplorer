/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import ax.Ha.c;
import ax.o3.b;
import com.voxdon.xplorer.file.n;
import java.io.File;
import java.util.logging.Logger;

public class FileObserverService
extends Service {
    private static final Logger b = Logger.getLogger("FileManager.FileObserverService");
    private String a;

    public static void a(Context context, n n8, File file) {
        try {
            Intent intent = new Intent(context, FileObserverService.class);
            intent.putExtra("location_uri", n8.Q());
            intent.putExtra("filepath", file.getAbsolutePath());
            context.startService(intent);
            return;
        }
        catch (IllegalStateException illegalStateException) {
            c.h().f().b("CANNOT START FILE OBSERVER SERVICE").l(illegalStateException).h();
            return;
        }
    }

    public static void b(Context context) {
        try {
            Intent intent = new Intent(context, FileObserverService.class);
            context.stopService(intent);
            return;
        }
        catch (RuntimeException runtimeException) {
            c.h().f().b("FILE OBSERVER SERVICE STOP ERROR").h();
            return;
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public int onStartCommand(Intent object, int n8, int n9) {
        if (object == null) {
            this.stopSelf();
            return 2;
        }
        String string = object.getStringExtra("filepath");
        object = object.getStringExtra("location_uri");
        if (string != null && object != null) {
            if (!new File(string).exists()) {
                this.stopSelf();
                return 2;
            }
            this.a = object;
            ax.o3.b.j().e(string, (String)object);
            return 2;
        }
        this.stopSelf();
        return 2;
    }
}

