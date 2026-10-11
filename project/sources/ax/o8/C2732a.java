package ax.o8;

import android.util.Log;
import ax.Gb.g;
import ax.Gb.l;
import ax.Zb.a;
import ax.Zb.c;
import ax.m.j;
import ax.o8.InterfaceC2733b;
import ax.wb.e;
import ax.yb.AbstractC3523d;
import ax.yb.f;
import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: ax.o8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2732a {
    public static final C2732a a = new C2732a();
    private static final Map<InterfaceC2733b.a, C0406a> b = DesugarCollections.synchronizedMap(new LinkedHashMap());

    /* renamed from: ax.o8.a$a, reason: collision with other inner class name */
    private static final class C0406a {
        private final ax.Zb.a a;
        private InterfaceC2733b b;

        public C0406a(ax.Zb.a aVar, InterfaceC2733b interfaceC2733b) {
            l.f(aVar, "mutex");
            this.a = aVar;
            this.b = interfaceC2733b;
        }

        public final ax.Zb.a a() {
            return this.a;
        }

        public final InterfaceC2733b b() {
            return this.b;
        }

        public final void c(InterfaceC2733b interfaceC2733b) {
            this.b = interfaceC2733b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0406a)) {
                return false;
            }
            C0406a c0406a = (C0406a) obj;
            return l.a(this.a, c0406a.a) && l.a(this.b, c0406a.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            InterfaceC2733b interfaceC2733b = this.b;
            return hashCode + (interfaceC2733b == null ? 0 : interfaceC2733b.hashCode());
        }

        public String toString() {
            return "Dependency(mutex=" + this.a + ", subscriber=" + this.b + ')';
        }

        public /* synthetic */ C0406a(ax.Zb.a aVar, InterfaceC2733b interfaceC2733b, int i, g gVar) {
            this(aVar, (i & 2) != 0 ? null : interfaceC2733b);
        }
    }

    @f(c = "com.google.firebase.sessions.api.FirebaseSessionsDependencies", f = "FirebaseSessionsDependencies.kt", l = {j.K0}, m = "getRegisteredSubscribers$com_google_firebase_firebase_sessions")
    /* renamed from: ax.o8.a$b */
    static final class b extends AbstractC3523d {
        Object e0;
        Object f0;
        Object g0;
        Object h0;
        Object i0;
        Object j0;
        /* synthetic */ Object k0;
        int m0;

        b(e<? super b> eVar) {
            super(eVar);
        }

        @Override // ax.yb.AbstractC3520a
        public final Object p(Object obj) {
            this.k0 = obj;
            this.m0 |= Integer.MIN_VALUE;
            return C2732a.this.c(this);
        }
    }

    private C2732a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(InterfaceC2733b.a aVar) {
        l.f(aVar, "subscriberName");
        if (aVar == InterfaceC2733b.a.PERFORMANCE) {
            throw new IllegalArgumentException("Incompatible versions of Firebase Perf and Firebase Sessions.\nA safe combination would be:\n  firebase-sessions:1.1.0\n  firebase-crashlytics:18.5.0\n  firebase-perf:20.5.0\nFor more information contact Firebase Support.");
        }
        Map<InterfaceC2733b.a, C0406a> map = b;
        if (map.containsKey(aVar)) {
            Log.d("SessionsDependencies", "Dependency " + aVar + " already added.");
            return;
        }
        l.e(map, "dependencies");
        map.put(aVar, new C0406a(c.a(true), null, 2, 0 == true ? 1 : 0));
        Log.d("SessionsDependencies", "Dependency to " + aVar + " added.");
    }

    private final C0406a b(InterfaceC2733b.a aVar) {
        Map<InterfaceC2733b.a, C0406a> map = b;
        l.e(map, "dependencies");
        C0406a c0406a = map.get(aVar);
        if (c0406a != null) {
            l.e(c0406a, "dependencies.getOrElse(s…load time.\"\n      )\n    }");
            return c0406a;
        }
        throw new IllegalStateException("Cannot get dependency " + aVar + ". Dependencies should be added at class load time.");
    }

    public static final void e(InterfaceC2733b interfaceC2733b) {
        l.f(interfaceC2733b, "subscriber");
        InterfaceC2733b.a b2 = interfaceC2733b.b();
        C0406a b3 = a.b(b2);
        if (b3.b() != null) {
            Log.d("SessionsDependencies", "Subscriber " + b2 + " already registered.");
            return;
        }
        b3.c(interfaceC2733b);
        Log.d("SessionsDependencies", "Subscriber " + b2 + " registered.");
        a.C0236a.a(b3.a(), null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x009f -> B:10:0x00a0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(ax.wb.e<? super java.util.Map<ax.o8.InterfaceC2733b.a, ? extends ax.o8.InterfaceC2733b>> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof ax.o8.C2732a.b
            if (r0 == 0) goto L13
            r0 = r11
            ax.o8.a$b r0 = (ax.o8.C2732a.b) r0
            int r1 = r0.m0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m0 = r1
            goto L18
        L13:
            ax.o8.a$b r0 = new ax.o8.a$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.k0
            java.lang.Object r1 = ax.xb.C3479b.c()
            int r2 = r0.m0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r2 = r0.j0
            java.lang.Object r5 = r0.i0
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.h0
            ax.Zb.a r6 = (ax.Zb.a) r6
            java.lang.Object r7 = r0.g0
            ax.o8.b$a r7 = (ax.o8.InterfaceC2733b.a) r7
            java.lang.Object r8 = r0.f0
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r0.e0
            java.util.Map r9 = (java.util.Map) r9
            ax.sb.C3083o.b(r11)
            goto La0
        L40:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L48:
            ax.sb.C3083o.b(r11)
            java.util.Map<ax.o8.b$a, ax.o8.a$a> r11 = ax.o8.C2732a.b
            java.lang.String r2 = "dependencies"
            ax.Gb.l.e(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r5 = r11.size()
            int r5 = ax.tb.C3115F.d(r5)
            r2.<init>(r5)
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
            r8 = r11
            r5 = r2
        L69:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto Lb3
            java.lang.Object r11 = r8.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r6 = r11.getKey()
            r7 = r6
            ax.o8.b$a r7 = (ax.o8.InterfaceC2733b.a) r7
            java.lang.Object r11 = r11.getValue()
            ax.o8.a$a r11 = (ax.o8.C2732a.C0406a) r11
            ax.Zb.a r6 = r11.a()
            r0.e0 = r5
            r0.f0 = r8
            r0.g0 = r7
            r0.h0 = r6
            r0.i0 = r5
            r0.j0 = r2
            r0.m0 = r3
            java.lang.Object r11 = r6.a(r4, r0)
            if (r11 != r1) goto L9f
            return r1
        L9f:
            r9 = r5
        La0:
            ax.o8.a r11 = ax.o8.C2732a.a     // Catch: java.lang.Throwable -> Lae
            ax.o8.b r11 = r11.d(r7)     // Catch: java.lang.Throwable -> Lae
            r6.c(r4)
            r5.put(r2, r11)
            r5 = r9
            goto L69
        Lae:
            r11 = move-exception
            r6.c(r4)
            throw r11
        Lb3:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.o8.C2732a.c(ax.wb.e):java.lang.Object");
    }

    public final InterfaceC2733b d(InterfaceC2733b.a aVar) {
        l.f(aVar, "subscriberName");
        InterfaceC2733b b2 = b(aVar).b();
        if (b2 != null) {
            return b2;
        }
        throw new IllegalStateException("Subscriber " + aVar + " has not been registered.");
    }
}
