/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import com.google.firebase.concurrent.a;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

class b
implements ThreadFactory {
    private static final ThreadFactory e = Executors.defaultThreadFactory();
    private final AtomicLong a = new AtomicLong();
    private final String b;
    private final int c;
    private final StrictMode.ThreadPolicy d;

    b(String string, int n8, StrictMode.ThreadPolicy threadPolicy) {
        this.b = string;
        this.c = n8;
        this.d = threadPolicy;
    }

    public static /* synthetic */ void a(b b8, Runnable runnable2) {
        Process.setThreadPriority((int)b8.c);
        b8 = b8.d;
        if (b8 != null) {
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)b8);
        }
        runnable2.run();
    }

    @Override
    public Thread newThread(Runnable runnable2) {
        runnable2 = e.newThread(new a(this, runnable2));
        ((Thread)runnable2).setName(String.format(Locale.ROOT, "%s Thread #%d", this.b, this.a.getAndIncrement()));
        return runnable2;
    }
}

