/*
 * Decompiled with CFR 0.152.
 */
package ax.u;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import ax.t.e;
import ax.u.q;

public abstract class s
implements View.OnTouchListener,
View.OnAttachStateChangeListener {
    private final float a;
    private final int b;
    private final int c;
    final View d;
    private Runnable e;
    private Runnable f;
    private boolean g;
    private int h;
    private final int[] i = new int[2];

    public s(View view) {
        int n8;
        this.d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
        this.a = ViewConfiguration.get((Context)view.getContext()).getScaledTouchSlop();
        this.b = n8 = ViewConfiguration.getTapTimeout();
        this.c = (n8 + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        Runnable runnable2 = this.f;
        if (runnable2 != null) {
            this.d.removeCallbacks(runnable2);
        }
        if ((runnable2 = this.e) != null) {
            this.d.removeCallbacks(runnable2);
        }
    }

    private boolean f(MotionEvent motionEvent) {
        View view = this.d;
        Object object = this.b();
        if (object != null && object.b() && (object = (q)object.j()) != null && object.isShown()) {
            MotionEvent motionEvent2 = MotionEvent.obtainNoHistory((MotionEvent)motionEvent);
            this.i(view, motionEvent2);
            this.j((View)object, motionEvent2);
            boolean bl = ((q)((Object)object)).e(motionEvent2, this.h);
            motionEvent2.recycle();
            int n8 = motionEvent.getActionMasked();
            n8 = n8 != 1 && n8 != 3 ? 1 : 0;
            if (bl && n8 != 0) {
                return true;
            }
        }
        return false;
    }

    private boolean g(MotionEvent motionEvent) {
        block7: {
            View view;
            block4: {
                block5: {
                    int n8;
                    block6: {
                        view = this.d;
                        if (!view.isEnabled()) {
                            return false;
                        }
                        n8 = motionEvent.getActionMasked();
                        if (n8 == 0) break block4;
                        if (n8 == 1) break block5;
                        if (n8 == 2) break block6;
                        if (n8 == 3) break block5;
                        break block7;
                    }
                    n8 = motionEvent.findPointerIndex(this.h);
                    if (n8 >= 0 && !s.h(view, motionEvent.getX(n8), motionEvent.getY(n8), this.a)) {
                        this.a();
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                        return true;
                    }
                    break block7;
                }
                this.a();
                break block7;
            }
            this.h = motionEvent.getPointerId(0);
            if (this.e == null) {
                this.e = new a(this);
            }
            view.postDelayed(this.e, (long)this.b);
            if (this.f == null) {
                this.f = new b(this);
            }
            view.postDelayed(this.f, (long)this.c);
        }
        return false;
    }

    private static boolean h(View view, float f8, float f9, float f10) {
        float f11 = -f10;
        return f8 >= f11 && f9 >= f11 && f8 < (float)(view.getRight() - view.getLeft()) + f10 && f9 < (float)(view.getBottom() - view.getTop()) + f10;
    }

    private boolean i(View view, MotionEvent motionEvent) {
        int[] nArray = this.i;
        view.getLocationOnScreen(nArray);
        motionEvent.offsetLocation((float)nArray[0], (float)nArray[1]);
        return true;
    }

    private boolean j(View view, MotionEvent motionEvent) {
        int[] nArray = this.i;
        view.getLocationOnScreen(nArray);
        motionEvent.offsetLocation((float)(-nArray[0]), (float)(-nArray[1]));
        return true;
    }

    public abstract e b();

    protected abstract boolean c();

    protected boolean d() {
        e e8 = this.b();
        if (e8 != null && e8.b()) {
            e8.dismiss();
        }
        return true;
    }

    void e() {
        this.a();
        View view = this.d;
        if (view.isEnabled() && !view.isLongClickable() && this.c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long l8 = SystemClock.uptimeMillis();
            MotionEvent motionEvent = MotionEvent.obtain((long)l8, (long)l8, (int)3, (float)0.0f, (float)0.0f, (int)0);
            view.onTouchEvent(motionEvent);
            motionEvent.recycle();
            this.g = true;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean bl;
        boolean bl2 = this.g;
        if (bl2) {
            bl = this.f(motionEvent) || !this.d();
        } else {
            boolean bl3 = this.g(motionEvent) && this.c();
            bl = bl3;
            if (bl3) {
                long l8 = SystemClock.uptimeMillis();
                view = MotionEvent.obtain((long)l8, (long)l8, (int)3, (float)0.0f, (float)0.0f, (int)0);
                this.d.onTouchEvent((MotionEvent)view);
                view.recycle();
                bl = bl3;
            }
        }
        this.g = bl;
        return bl || bl2;
        {
        }
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View object) {
        this.g = false;
        this.h = -1;
        object = this.e;
        if (object != null) {
            this.d.removeCallbacks((Runnable)object);
        }
    }

    private class a
    implements Runnable {
        final s q;

        a(s s8) {
            this.q = s8;
        }

        @Override
        public void run() {
            ViewParent viewParent = this.q.d.getParent();
            if (viewParent != null) {
                viewParent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    private class b
    implements Runnable {
        final s q;

        b(s s8) {
            this.q = s8;
        }

        @Override
        public void run() {
            this.q.e();
        }
    }
}

