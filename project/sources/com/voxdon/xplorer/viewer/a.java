package com.voxdon.xplorer.viewer;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
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

    public interface b {
        void a(MotionEvent motionEvent);
    }

    public a(Context context, float f, b bVar) {
        this(context, bVar, null, 0);
        this.o = (int) (ViewConfiguration.getLongPressTimeout() * f);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.f = true;
        this.d.a(this.h);
    }

    private int e() {
        return this.o;
    }

    private void f(Context context) {
        float ambiguousGestureMultiplier;
        float scaledAmbiguousGestureMultiplier;
        if (this.d == null) {
            throw new NullPointerException("OnGestureListener must not be null");
        }
        this.p = true;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            scaledAmbiguousGestureMultiplier = viewConfiguration.getScaledAmbiguousGestureMultiplier();
            this.b = scaledAmbiguousGestureMultiplier;
        } else if (i >= 29) {
            ambiguousGestureMultiplier = ViewConfiguration.getAmbiguousGestureMultiplier();
            this.b = ambiguousGestureMultiplier;
        } else {
            this.b = 1.0f;
        }
        this.a = scaledTouchSlop * scaledTouchSlop;
    }

    public boolean g(MotionEvent motionEvent) {
        int classification;
        long uptimeMillis;
        int e;
        int action = motionEvent.getAction();
        MotionEvent motionEvent2 = this.i;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        this.i = MotionEvent.obtain(motionEvent);
        int i = action & 255;
        boolean z = i == 6;
        int actionIndex = z ? motionEvent.getActionIndex() : -1;
        int pointerCount = motionEvent.getPointerCount();
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < pointerCount; i2++) {
            if (actionIndex != i2) {
                f += motionEvent.getX(i2);
                f2 += motionEvent.getY(i2);
            }
        }
        float f3 = z ? pointerCount - 1 : pointerCount;
        float f4 = f / f3;
        float f5 = f2 / f3;
        if (i == 0) {
            this.k = f4;
            this.m = f4;
            this.l = f5;
            this.n = f5;
            MotionEvent motionEvent3 = this.h;
            if (motionEvent3 != null) {
                motionEvent3.recycle();
            }
            this.h = MotionEvent.obtain(motionEvent);
            this.g = true;
            this.e = true;
            this.f = false;
            return false;
        }
        if (i == 1) {
            this.e = false;
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            if (this.f) {
                this.f = false;
            }
            MotionEvent motionEvent4 = this.j;
            if (motionEvent4 != null) {
                motionEvent4.recycle();
            }
            this.j = obtain;
            this.c.removeMessages(2);
            return false;
        }
        if (i != 2) {
            if (i == 3) {
                b();
                return false;
            }
            if (i == 5) {
                this.k = f4;
                this.m = f4;
                this.l = f5;
                this.n = f5;
                if (pointerCount != 2) {
                    c();
                    return false;
                }
                if (this.p) {
                    this.c.removeMessages(2);
                    MotionEvent motionEvent5 = this.h;
                    if (motionEvent5 != null) {
                        uptimeMillis = motionEvent5.getDownTime();
                        e = e();
                    } else {
                        uptimeMillis = SystemClock.uptimeMillis();
                        e = e();
                    }
                    long j = uptimeMillis + e;
                    Handler handler = this.c;
                    handler.sendMessageAtTime(handler.obtainMessage(2, 0, 0), j);
                    return false;
                }
            } else if (i == 6) {
                this.k = f4;
                this.m = f4;
                this.l = f5;
                this.n = f5;
                if (pointerCount == 2) {
                    c();
                    return false;
                }
            }
        } else if (!this.f && this.g) {
            int i3 = (int) (f4 - this.m);
            int i4 = (int) (f5 - this.n);
            int i5 = (i3 * i3) + (i4 * i4);
            int i6 = this.a;
            if (Build.VERSION.SDK_INT >= 29) {
                classification = motionEvent.getClassification();
                boolean hasMessages = this.c.hasMessages(2);
                boolean z2 = classification == 1;
                if (hasMessages && z2) {
                    if (i5 > i6) {
                        this.c.removeMessages(2);
                        long e2 = e();
                        Handler handler2 = this.c;
                        handler2.sendMessageAtTime(handler2.obtainMessage(2, 0, 0), motionEvent.getDownTime() + ((long) (e2 * this.b)));
                    }
                    float f6 = i6;
                    float f7 = this.b;
                    i6 = (int) (f6 * f7 * f7);
                }
            }
            if (i5 > i6) {
                this.k = f4;
                this.l = f5;
                this.g = false;
                this.c.removeMessages(2);
            }
        }
        return false;
    }

    /* renamed from: com.voxdon.xplorer.viewer.a$a, reason: collision with other inner class name */
    private class HandlerC0534a extends Handler {
        HandlerC0534a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 2) {
                a.this.d();
                return;
            }
            throw new RuntimeException("Unknown message " + message);
        }

        HandlerC0534a(Handler handler) {
            super(handler.getLooper());
        }
    }

    public a(Context context, b bVar, Handler handler, int i) {
        if (handler != null) {
            this.c = new HandlerC0534a(handler);
        } else {
            this.c = new HandlerC0534a();
        }
        this.d = bVar;
        f(context);
    }
}
