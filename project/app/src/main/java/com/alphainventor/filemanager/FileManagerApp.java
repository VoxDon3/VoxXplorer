/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import androidx.work.a;
import ax.Q2.b;
import ax.Q2.c;
import ax.Q2.d;
import ax.b0.a;
import com.alphainventor.filemanager.ApplicationReporter;

public class FileManagerApp
extends Application
implements a.c {
    public FileManagerApp() {
        ApplicationReporter.init(null);
    }

    public static void b(String string) {
        Log.e((String)"FileManager", (String)string);
    }

    @Override
    public androidx.work.a a() {
        a.b b8 = new a.b();
        b8.c(5000, 7000);
        b8.b(new a<Throwable>(this){
            final FileManagerApp a;
            {
                this.a = fileManagerApp;
            }

            public void a(Throwable throwable) {
                d.c("work manager init", throwable);
            }
        });
        b8.d(new a<Throwable>(this){
            final FileManagerApp a;
            {
                this.a = fileManagerApp;
            }

            public void a(Throwable throwable) {
                d.c("work manager scheduleing", throwable);
            }
        });
        return b8.a();
    }

    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public void onCreate() {
        super.onCreate();
        b.k((Context)this);
        if (b.i()) {
            ax.Ha.c.h().d("ApplicationHolder Alrady Initialized").h();
        }
        c.a();
    }
}

