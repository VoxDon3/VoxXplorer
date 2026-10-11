/*
 * Decompiled with CFR 0.152.
 */
package ax.w4;

import ax.w4.d;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.util.Collection;

public class f {
    public static final Charset a = Charset.forName("UTF-8");
    private static final char[] b = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(byte[] byArray) {
        return f.b("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", byArray);
    }

    public static String b(String charSequence, byte[] object) {
        block3: {
            block4: {
                block5: {
                    Object object2;
                    block8: {
                        StringBuilder stringBuilder;
                        block6: {
                            Object object3;
                            block7: {
                                if (object == null) break block3;
                                if (charSequence == null) break block4;
                                if (((String)charSequence).length() != 64) break block5;
                                stringBuilder = new StringBuilder((((byte[])object).length + 2) / 3 * 4);
                                object2 = 0;
                                while (object2 + 3 <= ((Object)object).length) {
                                    Object object4 = object[object2];
                                    Object object5 = object[object2 + 1];
                                    object3 = object2 + 3;
                                    object2 = object[object2 + 2];
                                    stringBuilder.append(((String)charSequence).charAt((object4 & 0xFF) >>> 2));
                                    stringBuilder.append(((String)charSequence).charAt((object4 & 3) << 4 | (object5 & 0xFF) >>> 4));
                                    stringBuilder.append(((String)charSequence).charAt((object5 & 0xF) << 2 | (object2 & 0xFF) >>> 6));
                                    stringBuilder.append(((String)charSequence).charAt((int)(object2 & 0x3F)));
                                    object2 = object3;
                                }
                                object3 = ((Object)object).length - object2;
                                if (object3 == 0) break block6;
                                if (object3 != 1) break block7;
                                object2 = object[object2];
                                stringBuilder.append(((String)charSequence).charAt((object2 & 0xFF) >>> 2));
                                stringBuilder.append(((String)charSequence).charAt((object2 & 3) << 4));
                                stringBuilder.append("==");
                                break block6;
                            }
                            if (object3 != 2) break block8;
                            object3 = object[object2];
                            object2 = object[object2 + 1];
                            stringBuilder.append(((String)charSequence).charAt((object3 & 0xFF) >>> 2));
                            stringBuilder.append(((String)charSequence).charAt((object3 & 3) << 4 | (object2 & 0xFF) >>> 4));
                            stringBuilder.append(((String)charSequence).charAt((object2 & 0xF) << 2));
                            stringBuilder.append('=');
                        }
                        return stringBuilder.toString();
                    }
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append("data.length: ");
                    ((StringBuilder)charSequence).append(((Object)object).length);
                    ((StringBuilder)charSequence).append(", i: ");
                    ((StringBuilder)charSequence).append((int)object2);
                    throw new AssertionError((Object)((StringBuilder)charSequence).toString());
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("'digits' must be 64 characters long: ");
                ((StringBuilder)object).append(f.f((String)charSequence));
                throw new IllegalArgumentException(((StringBuilder)object).toString());
            }
            throw new IllegalArgumentException("'digits' can't be null");
        }
        throw new IllegalArgumentException("'data' can't be null");
    }

    public static char c(int n8) {
        return b[n8];
    }

    public static String d(String string) {
        StringBuilder stringBuilder = new StringBuilder(string.length() * 2);
        stringBuilder.append('\"');
        for (int i8 = 0; i8 < string.length(); ++i8) {
            char c8 = string.charAt(i8);
            if (c8 != '\u0000') {
                if (c8 != '\r') {
                    if (c8 != '\"') {
                        if (c8 != '\\') {
                            if (c8 != '\t') {
                                if (c8 != '\n') {
                                    if (c8 >= ' ' && c8 <= '~') {
                                        stringBuilder.append(c8);
                                        continue;
                                    }
                                    stringBuilder.append("\\u");
                                    stringBuilder.append(f.c(c8 >> 12 & 0xF));
                                    stringBuilder.append(f.c(c8 >> 8 & 0xF));
                                    stringBuilder.append(f.c(c8 >> 4 & 0xF));
                                    stringBuilder.append(f.c(c8 & 0xF));
                                    continue;
                                }
                                stringBuilder.append("\\n");
                                continue;
                            }
                            stringBuilder.append("\\r");
                            continue;
                        }
                        stringBuilder.append("\\\\");
                        continue;
                    }
                    stringBuilder.append("\\\"");
                    continue;
                }
                stringBuilder.append("\\t");
                continue;
            }
            stringBuilder.append("\\000");
        }
        stringBuilder.append('\"');
        return stringBuilder.toString();
    }

    public static String e(Collection<String> object, String string) {
        StringBuilder stringBuilder = new StringBuilder();
        object = object.iterator();
        int n8 = 0;
        while (object.hasNext()) {
            String string2 = (String)object.next();
            if (n8 > 0) {
                stringBuilder.append(string);
            }
            stringBuilder.append(string2);
            ++n8;
        }
        return stringBuilder.toString();
    }

    public static String f(String string) {
        return f.d(string);
    }

    public static byte[] g(String object) {
        try {
            object = ((String)object).getBytes("UTF-8");
            return object;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw d.a("UTF-8 should always be supported", unsupportedEncodingException);
        }
    }

    public static String h(byte[] byArray) {
        return f.b("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", byArray);
    }

    public static String i(byte[] byArray) throws CharacterCodingException {
        return f.j(byArray, 0, byArray.length);
    }

    public static String j(byte[] byArray, int n8, int n9) throws CharacterCodingException {
        return a.newDecoder().decode(ByteBuffer.wrap(byArray, n8, n9)).toString();
    }
}

