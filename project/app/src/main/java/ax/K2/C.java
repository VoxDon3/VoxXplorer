/*
 * Decompiled with CFR 0.152.
 */
package ax.K2;

import android.net.Uri;
import android.os.Build;
import ax.B2.b;
import ax.B2.j;
import ax.B2.m;
import ax.B2.r;
import ax.Gb.l;
import ax.sb.t;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashSet;
import java.util.Set;

public final class C {
    public static final C a = new C();

    private C() {
    }

    public static final int a(ax.B2.a a8) {
        l.f((Object)a8, "backoffPolicy");
        int n8 = ax.K2.C$a.b[a8.ordinal()];
        if (n8 != 1) {
            if (n8 == 2) {
                return 1;
            }
            throw new ax.sb.l();
        }
        return 0;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Set<b.b> b(byte[] object) {
        Throwable throwable3222;
        block18: {
            Object object2;
            LinkedHashSet<b.b> linkedHashSet;
            block17: {
                IOException iOException2222;
                block15: {
                    l.f(object, "bytes");
                    linkedHashSet = new LinkedHashSet<b.b>();
                    if (((byte[])object).length == 0) {
                        return linkedHashSet;
                    }
                    object = new ByteArrayInputStream((byte[])object);
                    object2 = new ObjectInputStream((InputStream)object);
                    {
                        Throwable throwable22222;
                        block16: {
                            t t8;
                            catch (IOException iOException2222) {
                                break block15;
                            }
                            try {
                                int n8 = ((ObjectInputStream)object2).readInt();
                                for (int i8 = 0; i8 < n8; ++i8) {
                                    t8 = Uri.parse((String)((ObjectInputStream)object2).readUTF());
                                    boolean bl = ((ObjectInputStream)object2).readBoolean();
                                    l.e(t8, "uri");
                                    b.b b8 = new b.b((Uri)t8, bl);
                                    linkedHashSet.add(b8);
                                }
                            }
                            catch (Throwable throwable22222) {
                                break block16;
                            }
                            {
                                t8 = t.a;
                            }
                            try {
                                ax.Db.a.a((Closeable)object2, null);
                                break block17;
                            }
                            catch (Throwable throwable3222) {
                                break block18;
                            }
                        }
                        try {
                            throw throwable22222;
                        }
                        catch (Throwable throwable4) {}
                        {
                            ax.Db.a.a((Closeable)object2, throwable22222);
                            throw throwable4;
                        }
                    }
                }
                iOException2222.printStackTrace();
            }
            object2 = t.a;
            ax.Db.a.a((Closeable)object, null);
            return linkedHashSet;
        }
        try {
            throw throwable3222;
        }
        catch (Throwable throwable5) {
            ax.Db.a.a((Closeable)object, throwable3222);
            throw throwable5;
        }
    }

    public static final ax.B2.a c(int n8) {
        if (n8 != 0) {
            if (n8 == 1) {
                return ax.B2.a.c0;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not convert ");
            stringBuilder.append(n8);
            stringBuilder.append(" to BackoffPolicy");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        return ax.B2.a.q;
    }

    public static final j d(int n8) {
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 4) {
                            if (Build.VERSION.SDK_INT >= 30 && n8 == 5) {
                                return j.g0;
                            }
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Could not convert ");
                            stringBuilder.append(n8);
                            stringBuilder.append(" to NetworkType");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        return j.f0;
                    }
                    return j.e0;
                }
                return j.d0;
            }
            return j.c0;
        }
        return j.q;
    }

    public static final m e(int n8) {
        if (n8 != 0) {
            if (n8 == 1) {
                return m.c0;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not convert ");
            stringBuilder.append(n8);
            stringBuilder.append(" to OutOfQuotaPolicy");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        return m.q;
    }

    public static final r f(int n8) {
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 4) {
                            if (n8 == 5) {
                                return r.g0;
                            }
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Could not convert ");
                            stringBuilder.append(n8);
                            stringBuilder.append(" to State");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        return r.f0;
                    }
                    return r.e0;
                }
                return r.d0;
            }
            return r.c0;
        }
        return r.q;
    }

    public static final int g(j j8) {
        l.f((Object)j8, "networkType");
        int n8 = ax.K2.C$a.c[j8.ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    if (n8 != 4) {
                        if (n8 != 5) {
                            if (Build.VERSION.SDK_INT >= 30 && j8 == j.g0) {
                                return 5;
                            }
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Could not convert ");
                            stringBuilder.append((Object)j8);
                            stringBuilder.append(" to int");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        return 4;
                    }
                    return 3;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    public static final int h(m m8) {
        l.f((Object)m8, "policy");
        int n8 = ax.K2.C$a.d[m8.ordinal()];
        if (n8 != 1) {
            if (n8 == 2) {
                return 1;
            }
            throw new ax.sb.l();
        }
        return 0;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final byte[] i(Set<b.b> object) {
        Throwable throwable3222222;
        ByteArrayOutputStream byteArrayOutputStream;
        block12: {
            l.f(object, "triggers");
            if (object.isEmpty()) {
                return new byte[0];
            }
            byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            {
                Throwable throwable22222222;
                block13: {
                    catch (Throwable throwable3222222) {
                        break block12;
                    }
                    try {
                        objectOutputStream.writeInt(object.size());
                        object = object.iterator();
                        while (object.hasNext()) {
                            b.b b8 = (b.b)object.next();
                            objectOutputStream.writeUTF(b8.a().toString());
                            objectOutputStream.writeBoolean(b8.b());
                        }
                    }
                    catch (Throwable throwable22222222) {
                        break block13;
                    }
                    object = t.a;
                    {
                        ax.Db.a.a(objectOutputStream, null);
                    }
                    ax.Db.a.a(byteArrayOutputStream, null);
                    object = byteArrayOutputStream.toByteArray();
                    l.e(object, "outputStream.toByteArray()");
                    return object;
                }
                try {
                    throw throwable22222222;
                }
                catch (Throwable throwable4) {}
                {
                    ax.Db.a.a(objectOutputStream, throwable22222222);
                    throw throwable4;
                }
            }
        }
        try {
            throw throwable3222222;
        }
        catch (Throwable throwable5) {
            ax.Db.a.a(byteArrayOutputStream, throwable3222222);
            throw throwable5;
        }
    }

    public static final int j(r r8) {
        l.f((Object)r8, "state");
        switch (ax.K2.C$a.a[r8.ordinal()]) {
            default: {
                throw new ax.sb.l();
            }
            case 6: {
                return 5;
            }
            case 5: {
                return 4;
            }
            case 4: {
                return 3;
            }
            case 3: {
                return 2;
            }
            case 2: {
                return 1;
            }
            case 1: 
        }
        return 0;
    }

    public final class a {
        public static final int[] a;
        public static final int[] b;
        public static final int[] c;
        public static final int[] d;

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        static {
            int[] nArray = new int[r.values().length];
            try {
                nArray[r.q.ordinal()] = 1;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                nArray[r.c0.ordinal()] = 2;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                nArray[r.d0.ordinal()] = 3;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                nArray[r.e0.ordinal()] = 4;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                nArray[r.f0.ordinal()] = 5;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                nArray[r.g0.ordinal()] = 6;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            a = nArray;
            nArray = new int[ax.B2.a.values().length];
            try {
                nArray[ax.B2.a.q.ordinal()] = 1;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                nArray[ax.B2.a.c0.ordinal()] = 2;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            b = nArray;
            nArray = new int[j.values().length];
            try {
                nArray[j.q.ordinal()] = 1;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                nArray[j.c0.ordinal()] = 2;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                nArray[j.d0.ordinal()] = 3;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                nArray[j.e0.ordinal()] = 4;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                nArray[j.f0.ordinal()] = 5;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            c = nArray;
            nArray = new int[m.values().length];
            try {
                nArray[m.q.ordinal()] = 1;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                nArray[m.c0.ordinal()] = 2;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            d = nArray;
        }
    }
}

