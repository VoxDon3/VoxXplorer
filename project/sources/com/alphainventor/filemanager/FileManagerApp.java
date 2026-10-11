package com.voxdon.xplorer;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import androidx.work.a;
import ax.Ha.c;
import ax.Q2.d;
import ax.b0.InterfaceC1440a;

/* loaded from: classes.dex */
public class FileManagerApp extends Application implements a.c {

    class a implements InterfaceC1440a<Throwable> {
        a() {
        }

        @Override // ax.b0.InterfaceC1440a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th) {
            d.c("work manager init", th);
        }
    }

    class b implements InterfaceC1440a<Throwable> {
        b() {
        }

        @Override // ax.b0.InterfaceC1440a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th) {
            d.c("work manager scheduleing", th);
        }
    }

    public FileManagerApp() {
        ApplicationReporter.init(null);
    }

    public static void b(String str) {
        Log.e("FileManager", str);
    }

    @Override // androidx.work.a.c
    public androidx.work.a a() {
        a.b bVar = new a.b();
        bVar.c(5000, 7000);
        bVar.b(new a());
        bVar.d(new b());
        return bVar.a();
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        ax.Q2.b.k(this);
        if (ax.Q2.b.i()) {
            c.h().d("ApplicationHolder Alrady Initialized").h();
        }
        ax.Q2.c.a();
    }
}
