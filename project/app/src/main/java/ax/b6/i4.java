/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.S3;
import ax.b6.W3;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class i4<T extends W3> {
    private static String a = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static <T extends W3> T b(Class<T> object) {
        Object object2;
        ClassLoader classLoader = i4.class.getClassLoader();
        if (object.equals(W3.class)) {
            object2 = a;
        } else {
            if (!((Class)object).getPackage().equals(i4.class.getPackage())) {
                throw new IllegalArgumentException(((Class)object).getName());
            }
            object2 = String.format("%s.BlazeGenerated%sLoader", ((Class)object).getPackage().getName(), ((Class)object).getSimpleName());
        }
        try {
            NoSuchMethodException noSuchMethodException2;
            block21: {
                InstantiationException instantiationException2;
                block20: {
                    IllegalAccessException illegalAccessException2;
                    block19: {
                        object2 = Class.forName((String)object2, true, classLoader);
                        try {
                            object2 = (i4)((Class)object2).getConstructor(null).newInstance(null);
                            return (T)((W3)((Class)object).cast(((i4)object2).a()));
                        }
                        catch (InvocationTargetException invocationTargetException) {
                        }
                        catch (IllegalAccessException illegalAccessException2) {
                            break block19;
                        }
                        catch (InstantiationException instantiationException2) {
                            break block20;
                        }
                        catch (NoSuchMethodException noSuchMethodException2) {
                            break block21;
                        }
                        object2 = new IllegalStateException(invocationTargetException);
                        throw object2;
                    }
                    IllegalStateException illegalStateException = new IllegalStateException(illegalAccessException2);
                    throw illegalStateException;
                }
                IllegalStateException illegalStateException = new IllegalStateException(instantiationException2);
                throw illegalStateException;
            }
            IllegalStateException illegalStateException = new IllegalStateException(noSuchMethodException2);
            throw illegalStateException;
        }
        catch (ClassNotFoundException classNotFoundException) {
            Iterator<i4> iterator = ServiceLoader.load(i4.class, classLoader).iterator();
            ArrayList<W3> arrayList = new ArrayList<W3>();
            while (iterator.hasNext()) {
                try {
                    arrayList.add((W3)((Class)object).cast(iterator.next().a()));
                }
                catch (ServiceConfigurationError serviceConfigurationError) {
                    Logger logger = Logger.getLogger(S3.class.getName());
                    Level level = Level.SEVERE;
                    String string = ((Class)object).getSimpleName();
                    StringBuilder stringBuilder = new StringBuilder("Unable to load ");
                    stringBuilder.append(string);
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", stringBuilder.toString(), serviceConfigurationError);
                }
            }
            if (arrayList.size() == 1) {
                return (T)((W3)arrayList.get(0));
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                object = (W3)((Class)object).getMethod("combine", Collection.class).invoke(null, arrayList);
                return (T)object;
            }
            catch (InvocationTargetException invocationTargetException) {
                throw new IllegalStateException(invocationTargetException);
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new IllegalStateException(illegalAccessException);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                throw new IllegalStateException(noSuchMethodException);
            }
        }
    }

    protected abstract T a();
}

