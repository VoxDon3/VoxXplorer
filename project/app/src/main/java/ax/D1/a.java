/*
 * Decompiled with CFR 0.152.
 */
package ax.D1;

import ax.D1.c;
import ax.P0.C;
import ax.z1.b;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a
extends ax.z1.c {
    private static final Pattern c = Pattern.compile("(.+?)='(.*?)';", 32);
    private final CharsetDecoder a = StandardCharsets.UTF_8.newDecoder();
    private final CharsetDecoder b = StandardCharsets.ISO_8859_1.newDecoder();

    private String c(ByteBuffer byteBuffer) {
        String string;
        try {
            string = this.a.decode(byteBuffer).toString();
            this.a.reset();
        }
        catch (Throwable throwable) {
            this.a.reset();
            byteBuffer.rewind();
            throw throwable;
        }
        catch (CharacterCodingException characterCodingException) {
            this.a.reset();
            byteBuffer.rewind();
            try {
                String string2 = this.b.decode(byteBuffer).toString();
                return string2;
            }
            catch (CharacterCodingException characterCodingException2) {
                return null;
            }
            finally {
                this.b.reset();
                byteBuffer.rewind();
            }
        }
        byteBuffer.rewind();
        return string;
    }

    @Override
    protected C b(b object, ByteBuffer byteBuffer) {
        Object object2 = this.c(byteBuffer);
        byte[] byArray = new byte[byteBuffer.limit()];
        byteBuffer.get(byArray);
        object = null;
        if (object2 == null) {
            return new C(new c(byArray, null, null));
        }
        Matcher matcher = c.matcher((CharSequence)object2);
        byteBuffer = null;
        int n8 = 0;
        while (matcher.find(n8)) {
            String string = matcher.group(1);
            String string2 = matcher.group(2);
            Object object3 = byteBuffer;
            object2 = object;
            if (string != null) {
                object2 = ax.q7.c.e(string);
                object2.getClass();
                if (!((String)object2).equals("streamurl")) {
                    if (!((String)object2).equals("streamtitle")) {
                        object3 = byteBuffer;
                        object2 = object;
                    } else {
                        object2 = string2;
                        object3 = byteBuffer;
                    }
                } else {
                    object2 = object;
                    object3 = string2;
                }
            }
            n8 = matcher.end();
            byteBuffer = object3;
            object = object2;
        }
        return new C(new c(byArray, (String)object, (String)((Object)byteBuffer)));
    }
}

