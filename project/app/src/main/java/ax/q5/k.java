/*
 * Decompiled with CFR 0.152.
 */
package ax.q5;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import ax.q5.d;
import ax.q5.e;
import ax.q5.i;
import ax.q5.m;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class k
implements e {
    private final a a;
    private final i b;
    private final Map<String, m> c = new HashMap<String, m>();

    k(Context context, i i8) {
        this(new a(context), i8);
    }

    k(a a8, i i8) {
        this.a = a8;
        this.b = i8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public m i(String object) {
        synchronized (this) {
            Throwable throwable2;
            Object object2;
            block5: {
                try {
                    if (this.c.containsKey(object)) {
                        return this.c.get(object);
                    }
                    object2 = this.a.b((String)object);
                    if (object2 != null) break block5;
                }
                catch (Throwable throwable2) {}
                return null;
            }
            object2 = object2.create(this.b.a((String)object));
            this.c.put((String)object, (m)object2);
            return object2;
            throw throwable2;
        }
    }

    static class a {
        private final Context a;
        private Map<String, String> b = null;

        a(Context context) {
            this.a = context;
        }

        private Map<String, String> a(Context object) {
            Bundle bundle = ax.q5.k$a.d((Context)object);
            if (bundle == null) {
                Log.w((String)"BackendRegistry", (String)"Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.EMPTY_MAP;
            }
            HashMap<String, String> hashMap = new HashMap<String, String>();
            for (String string : bundle.keySet()) {
                Object object2 = bundle.get(string);
                if (!(object2 instanceof String) || !string.startsWith("backend:")) continue;
                String[] stringArray = ((String)object2).split(",", -1);
                int n8 = stringArray.length;
                for (int i8 = 0; i8 < n8; ++i8) {
                    object2 = stringArray[i8].trim();
                    if (((String)object2).isEmpty()) continue;
                    hashMap.put((String)object2, string.substring(8));
                }
            }
            return hashMap;
        }

        private Map<String, String> c() {
            if (this.b == null) {
                this.b = this.a(this.a);
            }
            return this.b;
        }

        private static Bundle d(Context context) {
            block7: {
                PackageManager packageManager;
                block6: {
                    try {
                        packageManager = context.getPackageManager();
                        if (packageManager != null) break block6;
                    }
                    catch (PackageManager.NameNotFoundException nameNotFoundException) {
                        Log.w((String)"BackendRegistry", (String)"Application info not found.");
                        return null;
                    }
                    Log.w((String)"BackendRegistry", (String)"Context has no PackageManager.");
                    return null;
                }
                ComponentName componentName = new ComponentName(context, TransportBackendDiscovery.class);
                context = packageManager.getServiceInfo(componentName, 128);
                if (context != null) break block7;
                Log.w((String)"BackendRegistry", (String)"TransportBackendDiscovery has no service info.");
                return null;
            }
            context = context.metaData;
            return context;
        }

        d b(String string) {
            block11: {
                ClassNotFoundException classNotFoundException2;
                block10: {
                    IllegalAccessException illegalAccessException2;
                    block9: {
                        InstantiationException instantiationException2;
                        block8: {
                            NoSuchMethodException noSuchMethodException2;
                            block7: {
                                string = this.c().get(string);
                                if (string == null) {
                                    return null;
                                }
                                try {
                                    d d8 = Class.forName(string).asSubclass(d.class).getDeclaredConstructor(null).newInstance(null);
                                    return d8;
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                }
                                catch (NoSuchMethodException noSuchMethodException2) {
                                    break block7;
                                }
                                catch (InstantiationException instantiationException2) {
                                    break block8;
                                }
                                catch (IllegalAccessException illegalAccessException2) {
                                    break block9;
                                }
                                catch (ClassNotFoundException classNotFoundException2) {
                                    break block10;
                                }
                                Log.w((String)"BackendRegistry", (String)String.format("Could not instantiate %s", string), (Throwable)invocationTargetException);
                                break block11;
                            }
                            Log.w((String)"BackendRegistry", (String)String.format("Could not instantiate %s", string), (Throwable)noSuchMethodException2);
                            break block11;
                        }
                        Log.w((String)"BackendRegistry", (String)String.format("Could not instantiate %s.", string), (Throwable)instantiationException2);
                        break block11;
                    }
                    Log.w((String)"BackendRegistry", (String)String.format("Could not instantiate %s.", string), (Throwable)illegalAccessException2);
                    break block11;
                }
                Log.w((String)"BackendRegistry", (String)String.format("Class %s is not found.", string), (Throwable)classNotFoundException2);
            }
            return null;
        }
    }
}

