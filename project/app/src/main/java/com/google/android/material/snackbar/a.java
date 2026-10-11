/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

class a {
    private static a e;
    private final Object a = new Object();
    private final Handler b = new Handler(Looper.getMainLooper(), new Handler.Callback(this){
        final a q;
        {
            this.q = a8;
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            this.q.d((c)message.obj);
            return true;
        }
    });
    private c c;
    private c d;

    private a() {
    }

    private boolean a(c c8, int n8) {
        b b8 = (b)c8.a.get();
        if (b8 != null) {
            this.b.removeCallbacksAndMessages((Object)c8);
            b8.a(n8);
            return true;
        }
        return false;
    }

    static a c() {
        if (e == null) {
            e = new a();
        }
        return e;
    }

    private boolean g(b b8) {
        c c8 = this.c;
        return c8 != null && c8.a(b8);
    }

    private boolean h(b b8) {
        c c8 = this.d;
        return c8 != null && c8.a(b8);
    }

    private void m(c c8) {
        int n8 = c8.b;
        if (n8 == -2) {
            return;
        }
        if (n8 <= 0) {
            n8 = n8 == -1 ? 1500 : 2750;
        }
        this.b.removeCallbacksAndMessages((Object)c8);
        Handler handler = this.b;
        handler.sendMessageDelayed(Message.obtain((Handler)handler, (int)0, (Object)c8), (long)n8);
    }

    private void o() {
        Object object = this.d;
        if (object != null) {
            this.c = object;
            this.d = null;
            object = (b)((c)object).a.get();
            if (object != null) {
                object.c();
                return;
            }
            this.c = null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(b b8, int n8) {
        Object object = this.a;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                block5: {
                    block4: {
                        try {
                            if (!this.g(b8)) break block4;
                            this.a(this.c, n8);
                            break block5;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                    }
                    if (this.h(b8)) {
                        this.a(this.d, n8);
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void d(c c8) {
        Object object = this.a;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (this.c != c8 && this.d != c8) break block3;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                    this.a(c8, 2);
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean e(b b8) {
        Object object = this.a;
        synchronized (object) {
            return this.g(b8);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean f(b b8) {
        Object object = this.a;
        synchronized (object) {
            try {
                if (this.g(b8)) return true;
                if (!this.h(b8)) return false;
                return true;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void i(b b8) {
        Object object = this.a;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (!this.g(b8)) break block3;
                        this.c = null;
                        if (this.d == null) break block3;
                        this.o();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void j(b b8) {
        Object object = this.a;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (!this.g(b8)) break block3;
                        this.m(this.c);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void k(b object) {
        Object object2 = this.a;
        synchronized (object2) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (!this.g((b)object)) break block3;
                        object = this.c;
                        if (((c)object).c) break block3;
                        ((c)object).c = true;
                        this.b.removeCallbacksAndMessages(object);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void l(b object) {
        Object object2 = this.a;
        synchronized (object2) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (!this.g((b)object)) break block3;
                        object = this.c;
                        if (!((c)object).c) break block3;
                        ((c)object).c = false;
                        this.m((c)object);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void n(int n8, b object) {
        Object object2 = this.a;
        synchronized (object2) {
            Throwable throwable2;
            block7: {
                try {
                    if (this.g((b)object)) {
                        object = this.c;
                        ((c)object).b = n8;
                        this.b.removeCallbacksAndMessages(object);
                        this.m(this.c);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                if (this.h((b)object)) {
                    this.d.b = n8;
                } else {
                    c c8;
                    this.d = c8 = new c(n8, (b)object);
                }
                object = this.c;
                if (object != null && this.a((c)object, 4)) {
                    return;
                }
                this.c = null;
                this.o();
                return;
            }
            throw throwable2;
        }
    }

    static interface b {
        public void a(int var1);

        public void c();
    }

    private static class c {
        final WeakReference<b> a;
        int b;
        boolean c;

        c(int n8, b b8) {
            this.a = new WeakReference<b>(b8);
            this.b = n8;
        }

        boolean a(b b8) {
            return b8 != null && this.a.get() == b8;
        }
    }
}

