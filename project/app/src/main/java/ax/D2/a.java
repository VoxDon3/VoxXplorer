/*
 * Decompiled with CFR 0.152.
 */
package ax.D2;

import ax.B2.i;
import ax.B2.p;
import ax.D2.b;
import ax.K2.v;
import java.util.HashMap;
import java.util.Map;

public class a {
    static final String d = i.i("DelayedWorkTracker");
    final b a;
    private final p b;
    private final Map<String, Runnable> c;

    public a(b b8, p p8) {
        this.a = b8;
        this.b = p8;
        this.c = new HashMap<String, Runnable>();
    }

    public void a(v v8) {
        Runnable runnable2 = this.c.remove(v8.a);
        if (runnable2 != null) {
            this.b.b(runnable2);
        }
        runnable2 = new Runnable(){
            final a c0;
            final v q;
            {
                this.c0 = a8;
                this.q = v8;
            }

            @Override
            public void run() {
                i i8 = i.e();
                String string = d;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Scheduling work ");
                stringBuilder.append(this.q.a);
                i8.a(string, stringBuilder.toString());
                this.c0.a.a(this.q);
            }
        };
        this.c.put(v8.a, runnable2);
        long l8 = System.currentTimeMillis();
        long l9 = v8.a();
        this.b.a(l9 - l8, runnable2);
    }

    public void b(String object) {
        if ((object = this.c.remove(object)) != null) {
            this.b.b((Runnable)object);
        }
    }
}

