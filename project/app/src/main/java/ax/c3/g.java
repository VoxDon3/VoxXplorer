/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

import android.content.Context;
import ax.Q2.f;
import ax.c3.F;
import ax.c3.c0;
import ax.u3.b;
import ax.x8.a;
import com.google.gson.Gson;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class g {
    public static String c = "com.voxdon.xplorer";
    public static int d = 3;
    private static g e;
    private boolean a;
    private HashMap<String, String> b = new HashMap();

    g(Context context) {
        this.d(context);
    }

    public static g c(Context context) {
        if (e == null) {
            e = new g(context);
        }
        return e;
    }

    public String a(f f8) {
        HashMap<String, String> hashMap = this.b;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(f8.I());
        stringBuilder.append("_id");
        return hashMap.get(stringBuilder.toString());
    }

    public String b(f f8) {
        HashMap<String, String> hashMap = this.b;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(f8.I());
        stringBuilder.append("_secret");
        return hashMap.get(stringBuilder.toString());
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void d(Context object) {
        Throwable throwable2;
        Object object2;
        block8: {
            Exception exception2;
            Object object3;
            block9: {
                a<HashMap<String, Object>> a8;
                Object object4;
                Object object5;
                block10: {
                    block7: {
                        if (this.a) return;
                        object3 = null;
                        object2 = null;
                        try {
                            object2 = object = object.getResources().openRawResource(2131886080);
                            object3 = object;
                            object5 = F.i((InputStream)object, 512);
                            object2 = object;
                            object3 = object;
                            object2 = object;
                            object3 = object;
                            object4 = f.M0;
                            object2 = object;
                            object3 = object;
                            a8 = new a<HashMap<String, Object>>((f)((Object)object4));
                            object2 = object;
                            object3 = object;
                            object5 = ((c0)((Object)a8)).a(d, ax.Y2.a.a().b((f)((Object)object4)), (String)object5);
                            if (object5 != null) break block7;
                            object2 = object;
                            object3 = object;
                            ax.u3.b.f();
                        }
                        catch (Throwable throwable2) {
                            break block8;
                        }
                        catch (Exception exception2) {
                            break block9;
                        }
                        F.a((AutoCloseable)object);
                        return;
                    }
                    object2 = object;
                    object3 = object;
                    {
                        object2 = object;
                        object3 = object;
                        object4 = new Gson();
                        object2 = object;
                        object3 = object;
                        object2 = object;
                        object3 = object;
                        a8 = new a<HashMap<String, Object>>(this){
                            final g d;
                            {
                                this.d = g8;
                            }
                        };
                        object2 = object;
                        object3 = object;
                        if ((object5 = (Map)((Map)((Gson)object4).l((String)object5, a8.d())).get("android_client")) != null) break block10;
                        object2 = object;
                        object3 = object;
                        ax.u3.b.f();
                    }
                    F.a((AutoCloseable)object);
                    return;
                }
                object2 = object;
                object3 = object;
                {
                    a8 = object5.keySet().iterator();
                    while (true) {
                        object2 = object;
                        object3 = object;
                        if (!a8.hasNext()) break;
                        object2 = object;
                        object3 = object;
                        object4 = (String)a8.next();
                        object2 = object;
                        object3 = object;
                        Object v8 = object5.get(object4);
                        object2 = object;
                        object3 = object;
                        if (!(v8 instanceof String)) continue;
                        object2 = object;
                        object3 = object;
                        this.b.put((String)object4, (String)v8);
                    }
                    object2 = object;
                    object3 = object;
                    this.a = true;
                }
                F.a((AutoCloseable)object);
                return;
            }
            object2 = object3;
            {
                exception2.printStackTrace();
            }
            F.a((AutoCloseable)object3);
            return;
        }
        F.a(object2);
        throw throwable2;
    }
}

