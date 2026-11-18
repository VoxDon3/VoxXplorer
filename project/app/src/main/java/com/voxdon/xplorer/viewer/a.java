/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.viewer;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import ax.w3.c;

public class a {
    private int a;
    private float b;
    private final Handler c;
    private final b d;
    private boolean e;
    private boolean f;
    private boolean g;
    private MotionEvent h;
    private MotionEvent i;
    private MotionEvent j;
    private float k;
    private float l;
    private float m;
    private float n;
    private int o;
    private boolean p;

    public a(Context context, float f8, b b8) {
        this(context, b8, null, 0);
        this.o = (int)((float)ViewConfiguration.getLongPressTimeout() * f8);
    }

    public a(Context context, b b8, Handler handler, int n8) {
        this.c = handler != null ? new a(this, handler) : new a(this);
        this.d = b8;
        this.f(context);
    }

    private void b() {
        this.c.removeMessages(2);
        this.e = false;
        this.g = false;
        this.f = false;
    }

    private void c() {
        this.c.removeMessages(2);
        this.g = false;
        this.f = false;
    }

    private void d() {
        this.f = true;
        this.d.a(this.h);
    }

    private int e() {
        return this.o;
    }

    private void f(Context context) {
        if (this.d != null) {
            this.p = true;
            context = ViewConfiguration.get((Context)context);
            int n8 = context.getScaledTouchSlop();
            int n9 = Build.VERSION.SDK_INT;
            this.b = n9 >= 30 ? ax.w3.b.a((ViewConfiguration)context) : (n9 >= 29 ? ax.w3.c.a() : 1.0f);
            this.a = n8 * n8;
            return;
        }
        throw new NullPointerException("OnGestureListener must not be null");
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean g(MotionEvent motionEvent) {
        int n8;
        int n9 = motionEvent.getAction();
        MotionEvent motionEvent2 = this.i;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        this.i = MotionEvent.obtain((MotionEvent)motionEvent);
        int n10 = n9 & 0xFF;
        int n11 = 1;
        n9 = n10 == 6 ? 1 : 0;
        int n12 = n9 != 0 ? motionEvent.getActionIndex() : -1;
        int n13 = motionEvent.getPointerCount();
        float f8 = 0.0f;
        float f9 = 0.0f;
        for (n8 = 0; n8 < n13; ++n8) {
            if (n12 == n8) continue;
            f8 += motionEvent.getX(n8);
            f9 += motionEvent.getY(n8);
        }
        n9 = n9 != 0 ? n13 - 1 : n13;
        float f10 = n9;
        f8 /= f10;
        f9 /= f10;
        if (n10 != 0) {
            if (n10 != 1) {
                if (n10 != 2) {
                    long l8;
                    if (n10 == 3) {
                        this.b();
                        return false;
                    }
                    if (n10 != 5) {
                        if (n10 != 6) {
                            return false;
                        }
                        this.k = f8;
                        this.m = f8;
                        this.l = f9;
                        this.n = f9;
                        if (n13 != 2) return false;
                        this.c();
                        return false;
                    }
                    this.k = f8;
                    this.m = f8;
                    this.l = f9;
                    this.n = f9;
                    if (n13 != 2) {
                        this.c();
                        return false;
                    }
                    if (!this.p) return false;
                    this.c.removeMessages(2);
                    motionEvent = this.h;
                    if (motionEvent != null) {
                        l8 = motionEvent.getDownTime();
                        n9 = this.e();
                    } else {
                        l8 = SystemClock.uptimeMillis();
                        n9 = this.e();
                    }
                    long l9 = n9;
                    motionEvent = this.c;
                    motionEvent.sendMessageAtTime(motionEvent.obtainMessage(2, 0, 0), l8 + l9);
                    return false;
                }
                if (this.f) {
                    return false;
                }
                if (!this.g) return false;
                n12 = (int)(f8 - this.m);
                n9 = (int)(f9 - this.n);
                n13 = n12 * n12 + n9 * n9;
                n9 = n8 = this.a;
                if (Build.VERSION.SDK_INT >= 29) {
                    n9 = ax.w3.a.a(motionEvent);
                    boolean bl = this.c.hasMessages(2);
                    n12 = n9 == 1 ? n11 : 0;
                    n9 = n8;
                    if (bl) {
                        n9 = n8;
                        if (n12 != 0) {
                            if (n13 > n8) {
                                this.c.removeMessages(2);
                                long l10 = this.e();
                                motionEvent2 = this.c;
                                motionEvent2.sendMessageAtTime(motionEvent2.obtainMessage(2, 0, 0), motionEvent.getDownTime() + (long)((float)l10 * this.b));
                            }
                            f10 = n8;
                            float f11 = this.b;
                            n9 = (int)(f10 * (f11 * f11));
                        }
                    }
                }
                if (n13 <= n9) return false;
                this.k = f8;
                this.l = f9;
                this.g = false;
                this.c.removeMessages(2);
                return false;
            }
            this.e = false;
            motionEvent2 = MotionEvent.obtain((MotionEvent)motionEvent);
            if (this.f) {
                this.f = false;
            }
            if ((motionEvent = this.j) != null) {
                motionEvent.recycle();
            }
            this.j = motionEvent2;
            this.c.removeMessages(2);
            return false;
        }
        this.k = f8;
        this.m = f8;
        this.l = f9;
        this.n = f9;
        motionEvent2 = this.h;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        this.h = MotionEvent.obtain((MotionEvent)motionEvent);
        this.g = true;
        this.e = true;
        this.f = false;
        return false;
    }

    private class a
    extends Handler {
        final a a;

        a(a a8) {
            this.a = a8;
        }

        a(a a8, Handler handler) {
            this.a = a8;
            super(handler.getLooper());
        }

        public void handleMessage(Message message) {
            if (message.what == 2) {
                this.a.d();
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown message ");
            stringBuilder.append(message);
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static interface b {
        public void a(MotionEvent var1);
    }
}

