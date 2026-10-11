package ax.I2;

import android.content.Context;

/* loaded from: classes.dex */
public final class o {
    private final h<Boolean> a;
    private final c b;
    private final h<ax.G2.b> c;
    private final h<Boolean> d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(Context context, ax.N2.c cVar) {
        this(context, cVar, null, null, null, null, 60, null);
        ax.Gb.l.f(context, "context");
        ax.Gb.l.f(cVar, "taskExecutor");
    }

    public final h<Boolean> a() {
        return this.a;
    }

    public final c b() {
        return this.b;
    }

    public final h<ax.G2.b> c() {
        return this.c;
    }

    public final h<Boolean> d() {
        return this.d;
    }

    public o(Context context, ax.N2.c cVar, h<Boolean> hVar, c cVar2, h<ax.G2.b> hVar2, h<Boolean> hVar3) {
        ax.Gb.l.f(context, "context");
        ax.Gb.l.f(cVar, "taskExecutor");
        ax.Gb.l.f(hVar, "batteryChargingTracker");
        ax.Gb.l.f(cVar2, "batteryNotLowTracker");
        ax.Gb.l.f(hVar2, "networkStateTracker");
        ax.Gb.l.f(hVar3, "storageNotLowTracker");
        this.a = hVar;
        this.b = cVar2;
        this.c = hVar2;
        this.d = hVar3;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ o(android.content.Context r8, ax.N2.c r9, ax.I2.h r10, ax.I2.c r11, ax.I2.h r12, ax.I2.h r13, int r14, ax.Gb.g r15) {
        /*
            r7 = this;
            r0 = r14 & 4
            java.lang.String r1 = "context.applicationContext"
            if (r0 == 0) goto L14
            ax.I2.a r0 = new ax.I2.a
            android.content.Context r3 = r8.getApplicationContext()
            ax.Gb.l.e(r3, r1)
            r0.<init>(r3, r9)
            r3 = r0
            goto L15
        L14:
            r3 = r10
        L15:
            r0 = r14 & 8
            if (r0 == 0) goto L27
            ax.I2.c r0 = new ax.I2.c
            android.content.Context r4 = r8.getApplicationContext()
            ax.Gb.l.e(r4, r1)
            r0.<init>(r4, r9)
            r4 = r0
            goto L28
        L27:
            r4 = r11
        L28:
            r0 = r14 & 16
            if (r0 == 0) goto L39
            android.content.Context r0 = r8.getApplicationContext()
            ax.Gb.l.e(r0, r1)
            ax.I2.h r0 = ax.I2.k.a(r0, r9)
            r5 = r0
            goto L3a
        L39:
            r5 = r12
        L3a:
            r0 = r14 & 32
            if (r0 == 0) goto L4f
            ax.I2.m r0 = new ax.I2.m
            android.content.Context r6 = r8.getApplicationContext()
            ax.Gb.l.e(r6, r1)
            r0.<init>(r6, r9)
            r6 = r0
            r1 = r8
            r2 = r9
            r0 = r7
            goto L53
        L4f:
            r6 = r13
            r0 = r7
            r1 = r8
            r2 = r9
        L53:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.I2.o.<init>(android.content.Context, ax.N2.c, ax.I2.h, ax.I2.c, ax.I2.h, ax.I2.h, int, ax.Gb.g):void");
    }
}
