package ax.D1;

import ax.P0.C;
import ax.q7.C2876c;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a extends ax.z1.c {
    private static final Pattern c = Pattern.compile("(.+?)='(.*?)';", 32);
    private final CharsetDecoder a = StandardCharsets.UTF_8.newDecoder();
    private final CharsetDecoder b = StandardCharsets.ISO_8859_1.newDecoder();

    private String c(ByteBuffer byteBuffer) {
        try {
            return this.a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = this.b.decode(byteBuffer).toString();
                this.b.reset();
                byteBuffer.rewind();
                return charBuffer;
            } catch (CharacterCodingException unused2) {
                this.b.reset();
                byteBuffer.rewind();
                return null;
            } catch (Throwable th) {
                this.b.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            this.a.reset();
            byteBuffer.rewind();
        }
    }

    @Override // ax.z1.c
    protected C b(ax.z1.b bVar, ByteBuffer byteBuffer) {
        String c2 = c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (c2 == null) {
            return new C(new c(bArr, null, null));
        }
        Matcher matcher = c.matcher(c2);
        String str2 = null;
        for (int i = 0; matcher.find(i); i = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String e = C2876c.e(group);
                e.getClass();
                if (e.equals("streamurl")) {
                    str2 = group2;
                } else if (e.equals("streamtitle")) {
                    str = group2;
                }
            }
        }
        return new C(new c(bArr, str, str2));
    }
}
