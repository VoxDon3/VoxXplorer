/*
 * Decompiled with CFR 0.152.
 */
package androidx.work;

import android.util.Log;
import ax.B2.i;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class b {
    private static final String b = i.i("Data");
    public static final b c = new a().a();
    Map<String, Object> a;

    b() {
    }

    public b(b b8) {
        this.a = new HashMap<String, Object>(b8.a);
    }

    public b(Map<String, ?> map) {
        this.a = new HashMap(map);
    }

    public static Boolean[] a(boolean[] blArray) {
        Boolean[] booleanArray = new Boolean[blArray.length];
        for (int i8 = 0; i8 < blArray.length; ++i8) {
            booleanArray[i8] = blArray[i8];
        }
        return booleanArray;
    }

    public static Byte[] b(byte[] byArray) {
        Byte[] byteArray = new Byte[byArray.length];
        for (int i8 = 0; i8 < byArray.length; ++i8) {
            byteArray[i8] = byArray[i8];
        }
        return byteArray;
    }

    public static Double[] c(double[] dArray) {
        Double[] doubleArray = new Double[dArray.length];
        for (int i8 = 0; i8 < dArray.length; ++i8) {
            doubleArray[i8] = dArray[i8];
        }
        return doubleArray;
    }

    public static Float[] d(float[] fArray) {
        Float[] floatArray = new Float[fArray.length];
        for (int i8 = 0; i8 < fArray.length; ++i8) {
            floatArray[i8] = Float.valueOf(fArray[i8]);
        }
        return floatArray;
    }

    public static Integer[] e(int[] nArray) {
        Integer[] integerArray = new Integer[nArray.length];
        for (int i8 = 0; i8 < nArray.length; ++i8) {
            integerArray[i8] = nArray[i8];
        }
        return integerArray;
    }

    public static Long[] f(long[] lArray) {
        Long[] longArray = new Long[lArray.length];
        for (int i8 = 0; i8 < lArray.length; ++i8) {
            longArray[i8] = lArray[i8];
        }
        return longArray;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static b g(byte[] var0) {
        block24: {
            block25: {
                if (((byte[])var0).length > 10240) throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                var5_9 = new HashMap<String, Object>();
                var4_10 = new ByteArrayInputStream((byte[])var0);
                var0 = new ObjectInputStream;
                var0(var4_10);
                var2_11 = var0;
                try {
                    for (var1_14 = var0.readInt(); var1_14 > 0; --var1_14) {
                        var2_11 = var0;
                        var5_9.put(var0.readUTF(), var0.readObject());
                    }
                }
                catch (Throwable var0_1) {}
lbl16:
                // 2 sources

                while (true) {
                    if (var2_11 != null) {
                        try {
                            var2_11.close();
                        }
                        catch (IOException var2_12) {
                            Log.e((String)androidx.work.b.b, (String)"Error in Data#fromByteArray: ", (Throwable)var2_12);
                        }
                    }
                    try {
                        var4_10.close();
                        throw var0_8;
                    }
                    catch (IOException var2_13) {
                        Log.e((String)androidx.work.b.b, (String)"Error in Data#fromByteArray: ", (Throwable)var2_13);
                    }
                    throw var0_8;
                }
                catch (ClassNotFoundException var3_15) {
                    break block24;
                }
                catch (IOException var3_16) {
                    break block24;
                }
                try {
                    var0.close();
                }
                catch (IOException var0_2) {
                    Log.e((String)androidx.work.b.b, (String)"Error in Data#fromByteArray: ", (Throwable)var0_2);
                }
                try {}
                catch (IOException var0_3) {
                    Log.e((String)androidx.work.b.b, (String)"Error in Data#fromByteArray: ", (Throwable)var0_3);
                    return new b(var5_9);
                }
                break block25;
                catch (Throwable var0_4) {
                    var2_11 = null;
                    ** continue;
                }
                catch (ClassNotFoundException var0_5) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_11 = null;
                        var3_17 = var0;
                        var0 = var2_11;
                        break;
                    }
                }
            }
            var4_10.close();
            return new b(var5_9);
            catch (IOException var0_6) {
                ** continue;
            }
        }
        var2_11 = var0;
        {
            Log.e((String)androidx.work.b.b, (String)"Error in Data#fromByteArray: ", (Throwable)var3_17);
            if (var0 == null) ** GOTO lbl-1000
        }
        try {
            var0.close();
        }
        catch (IOException var0_7) {
            Log.e((String)androidx.work.b.b, (String)"Error in Data#fromByteArray: ", (Throwable)var0_7);
        }
lbl-1000:
        // 3 sources

        {
            var4_10.close();
        }
        return new b(var5_9);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] k(b entry2) {
        RuntimeException var0_7;
        Iterator<Map.Entry<String, Object>> iterator;
        ByteArrayOutputStream byteArrayOutputStream;
        block21: {
            Object object;
            block23: {
                block22: {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    Object var3_9 = null;
                    b b8 = null;
                    iterator = b8;
                    try {
                        iterator = b8;
                        object = new ObjectOutputStream(byteArrayOutputStream);
                    }
                    catch (Throwable throwable) {
                        break block21;
                    }
                    catch (IOException iOException) {
                        entry2 = var3_9;
                        break block22;
                    }
                    try {
                        ((ObjectOutputStream)object).writeInt(((b)((Object)entry2)).j());
                        for (Map.Entry<String, Object> entry2 : ((b)((Object)entry2)).a.entrySet()) {
                            ((ObjectOutputStream)object).writeUTF(entry2.getKey());
                            ((ObjectOutputStream)object).writeObject(entry2.getValue());
                        }
                    }
                    catch (Throwable throwable) {
                        iterator = object;
                        break block21;
                    }
                    catch (IOException iOException) {
                        entry2 = object;
                        object = iOException;
                        break block22;
                    }
                    try {
                        ((ObjectOutputStream)object).close();
                    }
                    catch (IOException iOException) {
                        Log.e((String)b, (String)"Error in Data#toByteArray: ", (Throwable)iOException);
                    }
                    try {
                        byteArrayOutputStream.close();
                    }
                    catch (IOException iOException) {
                        Log.e((String)b, (String)"Error in Data#toByteArray: ", (Throwable)iOException);
                    }
                    if (byteArrayOutputStream.size() > 10240) throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                    return byteArrayOutputStream.toByteArray();
                }
                iterator = entry2;
                {
                    Log.e((String)b, (String)"Error in Data#toByteArray: ", (Throwable)object);
                    iterator = entry2;
                    object = byteArrayOutputStream.toByteArray();
                    if (entry2 == null) break block23;
                }
                try {
                    ((ObjectOutputStream)((Object)entry2)).close();
                }
                catch (IOException iOException) {
                    Log.e((String)b, (String)"Error in Data#toByteArray: ", (Throwable)iOException);
                }
            }
            try {
                byteArrayOutputStream.close();
                return object;
            }
            catch (IOException iOException) {
                Log.e((String)b, (String)"Error in Data#toByteArray: ", (Throwable)iOException);
            }
            return object;
        }
        if (iterator != null) {
            try {
                ((ObjectOutputStream)((Object)iterator)).close();
            }
            catch (IOException iOException) {
                Log.e((String)b, (String)"Error in Data#toByteArray: ", (Throwable)iOException);
            }
        }
        try {
            byteArrayOutputStream.close();
            throw var0_7;
        }
        catch (IOException iOException) {
            Log.e((String)b, (String)"Error in Data#toByteArray: ", (Throwable)iOException);
        }
        throw var0_7;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && b.class == object.getClass()) {
            object = (b)object;
            Set<String> set = this.a.keySet();
            if (!set.equals(((b)object).a.keySet())) {
                return false;
            }
            for (String string : set) {
                Object object3 = this.a.get(string);
                Object object2 = ((b)object).a.get(string);
                boolean bl = object3 != null && object2 != null ? (object3 instanceof Object[] && object2 instanceof Object[] ? Arrays.deepEquals((Object[])object3, (Object[])object2) : object3.equals(object2)) : object3 == object2;
                if (bl) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public Map<String, Object> h() {
        return java.util.DesugarCollections.unmodifiableMap(this.a);
    }

    public int hashCode() {
        return this.a.hashCode() * 31;
    }

    public String i(String object) {
        if ((object = this.a.get(object)) instanceof String) {
            return (String)object;
        }
        return null;
    }

    public int j() {
        return this.a.size();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Data {");
        if (!this.a.isEmpty()) {
            for (String string : this.a.keySet()) {
                stringBuilder.append(string);
                stringBuilder.append(" : ");
                Object object = this.a.get(string);
                if (object instanceof Object[]) {
                    stringBuilder.append(Arrays.toString((Object[])object));
                } else {
                    stringBuilder.append(object);
                }
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class a {
        private Map<String, Object> a = new HashMap<String, Object>();

        public b a() {
            b b8 = new b(this.a);
            androidx.work.b.k(b8);
            return b8;
        }

        public a b(String string, Object object) {
            if (object == null) {
                this.a.put(string, null);
                return this;
            }
            Class<?> clazz = object.getClass();
            if (clazz != Boolean.class && clazz != Byte.class && clazz != Integer.class && clazz != Long.class && clazz != Float.class && clazz != Double.class && clazz != String.class && clazz != Boolean[].class && clazz != Byte[].class && clazz != Integer[].class && clazz != Long[].class && clazz != Float[].class && clazz != Double[].class && clazz != String[].class) {
                if (clazz == boolean[].class) {
                    this.a.put(string, androidx.work.b.a((boolean[])object));
                    return this;
                }
                if (clazz == byte[].class) {
                    this.a.put(string, androidx.work.b.b((byte[])object));
                    return this;
                }
                if (clazz == int[].class) {
                    this.a.put(string, androidx.work.b.e((int[])object));
                    return this;
                }
                if (clazz == long[].class) {
                    this.a.put(string, androidx.work.b.f((long[])object));
                    return this;
                }
                if (clazz == float[].class) {
                    this.a.put(string, androidx.work.b.d((float[])object));
                    return this;
                }
                if (clazz == double[].class) {
                    this.a.put(string, androidx.work.b.c((double[])object));
                    return this;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("Key ");
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append("has invalid type ");
                ((StringBuilder)object).append(clazz);
                throw new IllegalArgumentException(((StringBuilder)object).toString());
            }
            this.a.put(string, object);
            return this;
        }

        public a c(b b8) {
            this.d(b8.a);
            return this;
        }

        public a d(Map<String, Object> object) {
            for (Map.Entry entry : object.entrySet()) {
                this.b((String)entry.getKey(), entry.getValue());
            }
            return this;
        }

        public a e(String string, String string2) {
            this.a.put(string, string2);
            return this;
        }
    }
}

