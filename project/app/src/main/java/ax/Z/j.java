/*
 * Decompiled with CFR 0.152.
 */
package ax.Z;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import ax.B.k;
import ax.Z.a;
import ax.Z.i;
import ax.Z.k;
import ax.Z.l;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

class j {
    static final ax.B.j<String, Typeface> a = new ax.B.j(16);
    private static final ExecutorService b = l.a("fonts-androidx", 10, 10000);
    static final Object c = new Object();
    static final k<String, ArrayList<ax.b0.a<e>>> d = new k();

    private static String a(i i8, int n8) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(i8.d());
        stringBuilder.append("-");
        stringBuilder.append(n8);
        return stringBuilder.toString();
    }

    @SuppressLint(value={"WrongConstant"})
    private static int b(k.a bArray) {
        int n8 = bArray.c();
        int n9 = 1;
        if (n8 != 0) {
            if (bArray.c() != 1) {
                return -3;
            }
            return -2;
        }
        bArray = bArray.b();
        n8 = n9;
        if (bArray != null) {
            if (bArray.length == 0) {
                n8 = n9;
            } else {
                int n10 = bArray.length;
                int n11 = 0;
                n9 = 0;
                while (true) {
                    n8 = n11;
                    if (n9 >= n10) break;
                    n8 = bArray[n9].b();
                    if (n8 != 0) {
                        if (n8 < 0) {
                            return -3;
                        }
                        return n8;
                    }
                    ++n9;
                }
            }
        }
        return n8;
    }

    static e c(String string, Context context, i object, int n8) {
        ax.B.j<String, Typeface> j8 = a;
        Typeface typeface = j8.c(string);
        if (typeface != null) {
            return new e(typeface);
        }
        try {
            object = ax.Z.e.e(context, (i)object, null);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return new e(-1);
        }
        int n9 = j.b((k.a)object);
        if (n9 != 0) {
            return new e(n9);
        }
        if ((context = ax.T.e.b(context, null, ((k.a)object).b(), n8)) != null) {
            j8.d(string, (Typeface)context);
            return new e((Typeface)context);
        }
        return new e(-3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static Typeface d(Context object, i object2, int n8, Executor executor, a object3) {
        String string = j.a((i)object2, n8);
        Object object4 = a.c(string);
        if (object4 != null) {
            ((a)object3).b(new e((Typeface)object4));
            return object4;
        }
        object4 = new ax.b0.a<e>((a)object3){
            final a a;
            {
                this.a = a8;
            }

            public void a(e e8) {
                e e9 = e8;
                if (e8 == null) {
                    e9 = new e(-3);
                }
                this.a.b(e9);
            }
        };
        object3 = c;
        // MONITORENTER : object3
        k<String, ArrayList<ax.b0.a<e>>> k8 = d;
        ArrayList<Typeface> arrayList = k8.get(string);
        if (arrayList != null) {
            arrayList.add((Typeface)object4);
            // MONITOREXIT : object3
            return null;
        }
        arrayList = new ArrayList<Typeface>();
        arrayList.add((Typeface)object4);
        k8.put(string, arrayList);
        // MONITOREXIT : object3
        object2 = new Callable<e>(){
            final String a;
            final Context b;
            final i c;
            final int d;
            {
                this.a = string;
                this.b = context;
                this.c = i8;
                this.d = n8;
            }

            public e a() {
                try {
                    e e8 = j.c(this.a, this.b, this.c, this.d);
                    return e8;
                }
                catch (Throwable throwable) {
                    return new e(-3);
                }
            }
        };
        object = executor;
        if (executor == null) {
            object = b;
        }
        l.b((Executor)object, object2, new ax.b0.a<e>(string){
            final String a;
            {
                this.a = string;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Converted monitor instructions to comments
             * Lifted jumps to return sites
             */
            public void a(e e8) {
                Object object = c;
                // MONITORENTER : object
                k<String, ArrayList<ax.b0.a<e>>> k8 = d;
                ArrayList<ax.b0.a<e>> arrayList = k8.get(this.a);
                if (arrayList == null) {
                    // MONITOREXIT : object
                    return;
                }
                k8.remove(this.a);
                // MONITOREXIT : object
                int n8 = 0;
                while (n8 < arrayList.size()) {
                    arrayList.get(n8).accept(e8);
                    ++n8;
                }
            }
        });
        return null;
    }

    static Typeface e(Context object, i i8, a a8, int n8, int n9) {
        String string = j.a(i8, n8);
        Typeface typeface = a.c(string);
        if (typeface != null) {
            a8.b(new e(typeface));
            return typeface;
        }
        if (n9 == -1) {
            object = j.c(string, object, i8, n8);
            a8.b((e)object);
            return object.a;
        }
        object = new Callable<e>(){
            final String a;
            final Context b;
            final i c;
            final int d;
            {
                this.a = string;
                this.b = context;
                this.c = i8;
                this.d = n8;
            }

            public e a() {
                return j.c(this.a, this.b, this.c, this.d);
            }
        };
        try {
            object = (e)l.c(b, object, n9);
            a8.b((e)object);
            object = object.a;
            return object;
        }
        catch (InterruptedException interruptedException) {
            a8.b(new e(-3));
            return null;
        }
    }

    static final class e {
        final Typeface a;
        final int b;

        e(int n8) {
            this.a = null;
            this.b = n8;
        }

        @SuppressLint(value={"WrongConstant"})
        e(Typeface typeface) {
            this.a = typeface;
            this.b = 0;
        }

        @SuppressLint(value={"WrongConstant"})
        boolean a() {
            return this.b == 0;
        }
    }
}

