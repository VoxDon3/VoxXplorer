/*
 * Decompiled with CFR 0.152.
 */
package ax.i2;

import android.util.Log;
import ax.i2.C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class x {
    private final List<b> a = new ArrayList<b>();
    private final C b = new C(this){
        final x a;
        {
            this.a = x8;
        }

        @Override
        public void a() {
            this.a.e();
        }

        @Override
        public boolean d() {
            return this.a.b();
        }
    };
    private int c = 0;
    private final Object d = new Object();

    private void d() {
        Iterator<b> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().a();
        }
    }

    C a() {
        return this.b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    boolean b() {
        Object object = this.d;
        synchronized (object) {
            return this.c();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean c() {
        Object object = this.d;
        synchronized (object) {
            if (this.c <= 0) return false;
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void e() {
        Object object = this.d;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (this.c <= 0) break block3;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Resetting OperationMonitor with ");
                        stringBuilder.append(this.c);
                        stringBuilder.append(" active operations.");
                        Log.w((String)"OperationMonitor", (String)stringBuilder.toString());
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                this.c = 0;
                this.d();
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
    void f() {
        Object object = this.d;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        int n8;
                        this.c = n8 = this.c + 1;
                        if (n8 != 1) break block3;
                        this.d();
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
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void g() {
        Object object = this.d;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                int n8;
                try {
                    n8 = this.c;
                    if (n8 == 0) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                {
                    this.c = --n8;
                    if (n8 == 0) {
                        this.d();
                    }
                    return;
                }
            }
            throw throwable2;
        }
    }

    public static interface b {
        public void a();
    }
}

