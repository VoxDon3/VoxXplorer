/*
 * Decompiled with CFR 0.152.
 */
package ax.f6;

import ax.M5.p;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public final class z {
    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Object a(Object object) {
        RuntimeException var0_4;
        ObjectInputStream objectInputStream;
        ObjectOutputStream objectOutputStream;
        block12: {
            if (object == null) {
                return null;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(object);
            objectOutputStream.flush();
            object = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            objectInputStream = new ObjectInputStream((InputStream)object);
            try {
                object = objectInputStream.readObject();
            }
            catch (Throwable throwable) {
                break block12;
            }
            objectOutputStream.close();
            objectInputStream.close();
            return object;
            catch (Throwable throwable) {
                objectInputStream = null;
            }
            break block12;
            catch (Throwable throwable) {
                objectInputStream = null;
                objectOutputStream = null;
            }
        }
        if (objectOutputStream != null) {
            objectOutputStream.close();
        }
        if (objectInputStream == null) throw var0_4;
        try {
            objectInputStream.close();
            throw var0_4;
        }
        catch (IOException | ClassNotFoundException exception) {
            return null;
        }
    }

    public static String b(String string, String[] stringArray, String[] stringArray2) {
        p.l(stringArray);
        p.l(stringArray2);
        int n8 = Math.min(stringArray.length, stringArray2.length);
        for (int i8 = 0; i8 < n8; ++i8) {
            String string2 = stringArray[i8];
            boolean bl = string == null && string2 == null ? true : (string == null ? false : string.equals(string2));
            if (!bl) continue;
            return stringArray2[i8];
        }
        return null;
    }
}

