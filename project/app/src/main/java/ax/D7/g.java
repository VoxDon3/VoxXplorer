/*
 * Decompiled with CFR 0.152.
 */
package ax.D7;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import ax.D7.f;
import ax.D7.w;
import com.google.firebase.components.ComponentRegistrar;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class g<T> {
    private final T a;
    private final c<T> b;

    g(T t8, c<T> c8) {
        this.a = t8;
        this.b = c8;
    }

    public static /* synthetic */ ComponentRegistrar a(String string) {
        return g.d(string);
    }

    public static g<Context> c(Context context, Class<? extends Service> clazz) {
        return new g<Context>(context, new b(clazz));
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static ComponentRegistrar d(String string) {
        Serializable serializable;
        try {
            serializable = Class.forName(string);
            if (ComponentRegistrar.class.isAssignableFrom((Class<?>)serializable)) {
                return (ComponentRegistrar)serializable.getDeclaredConstructor(null).newInstance(null);
            }
        }
        catch (InvocationTargetException invocationTargetException2) {
            throw new w(String.format("Could not instantiate %s", string), invocationTargetException2);
        }
        catch (NoSuchMethodException noSuchMethodException2) {
            throw new w(String.format("Could not instantiate %s", string), noSuchMethodException2);
        }
        catch (InstantiationException instantiationException2) {
            throw new w(String.format("Could not instantiate %s.", string), instantiationException2);
        }
        catch (IllegalAccessException illegalAccessException2) {
            throw new w(String.format("Could not instantiate %s.", string), illegalAccessException2);
        }
        serializable = new Serializable(String.format("Class %s is not an instance of %s", string, "com.google.firebase.components.ComponentRegistrar"));
        throw serializable;
        catch (ClassNotFoundException classNotFoundException) {
            Log.w((String)"ComponentDiscovery", (String)String.format("Class %s is not an found.", string));
            return null;
        }
    }

    public List<ax.a8.b<ComponentRegistrar>> b() {
        ArrayList<ax.a8.b<ComponentRegistrar>> arrayList = new ArrayList<ax.a8.b<ComponentRegistrar>>();
        Iterator<String> iterator = this.b.a(this.a).iterator();
        while (iterator.hasNext()) {
            arrayList.add(new f(iterator.next()));
        }
        return arrayList;
    }

    private static class b
    implements c<Context> {
        private final Class<? extends Service> a;

        private b(Class<? extends Service> clazz) {
            this.a = clazz;
        }

        private Bundle b(Context object) {
            block7: {
                PackageManager packageManager;
                block6: {
                    try {
                        packageManager = object.getPackageManager();
                        if (packageManager != null) break block6;
                    }
                    catch (PackageManager.NameNotFoundException nameNotFoundException) {
                        Log.w((String)"ComponentDiscovery", (String)"Application info not found.");
                        return null;
                    }
                    Log.w((String)"ComponentDiscovery", (String)"Context has no PackageManager.");
                    return null;
                }
                ComponentName componentName = new ComponentName((Context)object, this.a);
                object = packageManager.getServiceInfo(componentName, 128);
                if (object != null) break block7;
                object = new StringBuilder();
                ((StringBuilder)object).append(this.a);
                ((StringBuilder)object).append(" has no service info.");
                Log.w((String)"ComponentDiscovery", (String)((StringBuilder)object).toString());
                return null;
            }
            object = ((ServiceInfo)object).metaData;
            return object;
        }

        public List<String> c(Context object2) {
            Bundle bundle = this.b((Context)object2);
            if (bundle == null) {
                Log.w((String)"ComponentDiscovery", (String)"Could not retrieve metadata, returning empty list of registrars.");
                return Collections.EMPTY_LIST;
            }
            ArrayList<String> arrayList = new ArrayList<String>();
            for (Object object2 : bundle.keySet()) {
                if (!"com.google.firebase.components.ComponentRegistrar".equals(bundle.get((String)object2)) || !((String)object2).startsWith("com.google.firebase.components:")) continue;
                arrayList.add(((String)object2).substring(31));
            }
            return arrayList;
        }
    }

    static interface c<T> {
        public List<String> a(T var1);
    }
}

