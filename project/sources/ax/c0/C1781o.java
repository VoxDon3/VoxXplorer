package ax.c0;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* renamed from: ax.c0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1781o {
    private final Context a;
    private final InterfaceC1783p b;
    private final b c;
    private final a d;
    private VelocityTracker e;
    private float f;
    private int g;
    private int h;
    private int i;
    private final int[] j;

    /* renamed from: ax.c0.o$a */
    interface a {
        float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i);
    }

    /* renamed from: ax.c0.o$b */
    interface b {
        void a(Context context, int[] iArr, MotionEvent motionEvent, int i);
    }

    public C1781o(Context context, InterfaceC1783p interfaceC1783p) {
        this(context, interfaceC1783p, new b() { // from class: ax.c0.m
            @Override // ax.c0.C1781o.b
            public final void a(Context context2, int[] iArr, MotionEvent motionEvent, int i) {
                C1781o.c(context2, iArr, motionEvent, i);
            }
        }, new a() { // from class: ax.c0.n
            @Override // ax.c0.C1781o.a
            public final float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i) {
                float f;
                f = C1781o.f(velocityTracker, motionEvent, i);
                return f;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = C1768h0.i(context, viewConfiguration, motionEvent.getDeviceId(), i, motionEvent.getSource());
        iArr[1] = C1768h0.h(context, viewConfiguration, motionEvent.getDeviceId(), i, motionEvent.getSource());
    }

    private boolean d(MotionEvent motionEvent, int i) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.h == source && this.i == deviceId && this.g == i) {
            return false;
        }
        this.c.a(this.a, this.j, motionEvent, i);
        this.h = source;
        this.i = deviceId;
        this.g = i;
        return true;
    }

    private float e(MotionEvent motionEvent, int i) {
        if (this.e == null) {
            this.e = VelocityTracker.obtain();
        }
        return this.d.a(this.e, motionEvent, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i) {
        Z.a(velocityTracker, motionEvent);
        Z.b(velocityTracker, 1000);
        return Z.d(velocityTracker, i);
    }

    public void g(MotionEvent motionEvent, int i) {
        boolean d = d(motionEvent, i);
        if (this.j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.e = null;
                return;
            }
            return;
        }
        float e = e(motionEvent, i) * this.b.b();
        float signum = Math.signum(e);
        if (d || (signum != Math.signum(this.f) && signum != 0.0f)) {
            this.b.c();
        }
        float abs = Math.abs(e);
        int[] iArr = this.j;
        if (abs < iArr[0]) {
            return;
        }
        float max = Math.max(-r6, Math.min(e, iArr[1]));
        this.f = this.b.a(max) ? max : 0.0f;
    }

    C1781o(Context context, InterfaceC1783p interfaceC1783p, b bVar, a aVar) {
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = new int[]{SubsamplingScaleImageView.TILE_SIZE_AUTO, 0};
        this.a = context;
        this.b = interfaceC1783p;
        this.c = bVar;
        this.d = aVar;
    }
}
