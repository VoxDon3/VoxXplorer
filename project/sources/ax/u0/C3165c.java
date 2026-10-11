package ax.u0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;

/* renamed from: ax.u0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3165c {
    private static final ThreadLocal<C3165c> j = new ThreadLocal<>();
    private InterfaceC3172j e;
    public e i;
    private final ax.B.k<InterfaceC0466c, Long> a = new ax.B.k<>();
    final ArrayList<InterfaceC0466c> b = new ArrayList<>();
    private final b c = new b();
    private final Runnable d = new Runnable() { // from class: ax.u0.b
        @Override // java.lang.Runnable
        public final void run() {
            C3165c.this.c.a();
        }
    };
    long f = 0;
    private boolean g = false;
    public float h = 1.0f;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ax.u0.c$b */
    class b {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a() {
            C3165c.this.f = SystemClock.uptimeMillis();
            C3165c c3165c = C3165c.this;
            c3165c.f(c3165c.f);
            if (C3165c.this.b.size() > 0) {
                C3165c.this.e.a(C3165c.this.d);
            }
        }
    }

    /* renamed from: ax.u0.c$c, reason: collision with other inner class name */
    interface InterfaceC0466c {
        boolean a(long j);
    }

    /* renamed from: ax.u0.c$d */
    public class d implements e {
        ValueAnimator.DurationScaleChangeListener a;

        public d() {
        }

        @Override // ax.u0.C3165c.e
        public boolean a() {
            boolean registerDurationScaleChangeListener;
            if (this.a != null) {
                return true;
            }
            ValueAnimator.DurationScaleChangeListener durationScaleChangeListener = new ValueAnimator.DurationScaleChangeListener() { // from class: ax.u0.f
                @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                public final void onChanged(float f) {
                    C3165c.this.h = f;
                }
            };
            this.a = durationScaleChangeListener;
            registerDurationScaleChangeListener = ValueAnimator.registerDurationScaleChangeListener(durationScaleChangeListener);
            return registerDurationScaleChangeListener;
        }

        @Override // ax.u0.C3165c.e
        public boolean b() {
            boolean unregisterDurationScaleChangeListener;
            unregisterDurationScaleChangeListener = ValueAnimator.unregisterDurationScaleChangeListener(this.a);
            this.a = null;
            return unregisterDurationScaleChangeListener;
        }
    }

    /* renamed from: ax.u0.c$e */
    public interface e {
        boolean a();

        boolean b();
    }

    /* renamed from: ax.u0.c$f */
    static final class f implements InterfaceC3172j {
        private final Choreographer a = Choreographer.getInstance();
        private final Looper b = Looper.myLooper();

        f() {
        }

        @Override // ax.u0.InterfaceC3172j
        public void a(final Runnable runnable) {
            this.a.postFrameCallback(new Choreographer.FrameCallback() { // from class: ax.u0.g
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    runnable.run();
                }
            });
        }

        @Override // ax.u0.InterfaceC3172j
        public boolean b() {
            return Thread.currentThread() == this.b.getThread();
        }
    }

    public C3165c(InterfaceC3172j interfaceC3172j) {
        this.e = interfaceC3172j;
    }

    private void e() {
        if (this.g) {
            for (int size = this.b.size() - 1; size >= 0; size--) {
                if (this.b.get(size) == null) {
                    this.b.remove(size);
                }
            }
            if (this.b.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                this.i.b();
            }
            this.g = false;
        }
    }

    static C3165c h() {
        ThreadLocal<C3165c> threadLocal = j;
        if (threadLocal.get() == null) {
            threadLocal.set(new C3165c(new f()));
        }
        return threadLocal.get();
    }

    private boolean i(InterfaceC0466c interfaceC0466c, long j2) {
        Long l = this.a.get(interfaceC0466c);
        if (l == null) {
            return true;
        }
        if (l.longValue() >= j2) {
            return false;
        }
        this.a.remove(interfaceC0466c);
        return true;
    }

    void d(InterfaceC0466c interfaceC0466c, long j2) {
        float durationScale;
        if (this.b.size() == 0) {
            this.e.a(this.d);
            if (Build.VERSION.SDK_INT >= 33) {
                durationScale = ValueAnimator.getDurationScale();
                this.h = durationScale;
                if (this.i == null) {
                    this.i = new d();
                }
                this.i.a();
            }
        }
        if (!this.b.contains(interfaceC0466c)) {
            this.b.add(interfaceC0466c);
        }
        if (j2 > 0) {
            this.a.put(interfaceC0466c, Long.valueOf(SystemClock.uptimeMillis() + j2));
        }
    }

    void f(long j2) {
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i = 0; i < this.b.size(); i++) {
            InterfaceC0466c interfaceC0466c = this.b.get(i);
            if (interfaceC0466c != null && i(interfaceC0466c, uptimeMillis)) {
                interfaceC0466c.a(j2);
            }
        }
        e();
    }

    public float g() {
        return this.h;
    }

    boolean j() {
        return this.e.b();
    }

    void k(InterfaceC0466c interfaceC0466c) {
        this.a.remove(interfaceC0466c);
        int indexOf = this.b.indexOf(interfaceC0466c);
        if (indexOf >= 0) {
            this.b.set(indexOf, null);
            this.g = true;
        }
    }
}
