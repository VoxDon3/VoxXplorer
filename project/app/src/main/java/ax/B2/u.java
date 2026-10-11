/*
 * Decompiled with CFR 0.152.
 */
package ax.B2;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.c;
import ax.B2.i;
import java.io.Serializable;

public abstract class u {
    private static final String a = i.i("WorkerFactory");

    public static u c() {
        return new u(){

            @Override
            public c a(Context context, String string, WorkerParameters workerParameters) {
                return null;
            }
        };
    }

    public abstract c a(Context var1, String var2, WorkerParameters var3);

    public final c b(Context object, String string, WorkerParameters object2) {
        c c8 = this.a((Context)object, string, (WorkerParameters)object2);
        Object object3 = c8;
        if (c8 == null) {
            Serializable serializable;
            try {
                serializable = Class.forName(string).asSubclass(c.class);
            }
            catch (Throwable throwable) {
                object3 = i.e();
                String string2 = a;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid class: ");
                stringBuilder.append(string);
                ((i)object3).d(string2, stringBuilder.toString(), throwable);
                serializable = null;
            }
            object3 = c8;
            if (serializable != null) {
                try {
                    object3 = ((Class)serializable).getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(object, object2);
                }
                catch (Throwable throwable) {
                    object2 = i.e();
                    object3 = a;
                    serializable = new StringBuilder();
                    ((StringBuilder)serializable).append("Could not instantiate ");
                    ((StringBuilder)serializable).append(string);
                    ((i)object2).d((String)object3, ((StringBuilder)serializable).toString(), throwable);
                    object3 = c8;
                }
            }
        }
        if (object3 != null && ((c)object3).j()) {
            object = this.getClass().getName();
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("WorkerFactory (");
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(") returned an instance of a ListenableWorker (");
            ((StringBuilder)object2).append(string);
            ((StringBuilder)object2).append(") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
            throw new IllegalStateException(((StringBuilder)object2).toString());
        }
        return object3;
    }
}

