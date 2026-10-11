package ax.Dc;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

/* renamed from: ax.Dc.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C0678m implements L {
    private static final byte[] c = {63};
    private static final String d = String.valueOf('?');
    private static final char[] e = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private final Charset a;
    private final boolean b;

    C0678m(Charset charset, boolean z) {
        this.a = charset;
        this.b = z;
    }

    private static ByteBuffer d(CharsetEncoder charsetEncoder, CharBuffer charBuffer, ByteBuffer byteBuffer) {
        while (charBuffer.hasRemaining()) {
            if (charsetEncoder.encode(charBuffer, byteBuffer, false).isOverflow()) {
                byteBuffer = M.b(byteBuffer, f(charsetEncoder, charBuffer.remaining()));
            }
        }
        return byteBuffer;
    }

    private static CharBuffer e(CharBuffer charBuffer, char c2) {
        charBuffer.position(0).limit(6);
        charBuffer.put('%');
        charBuffer.put('U');
        char[] cArr = e;
        charBuffer.put(cArr[(c2 >> '\f') & 15]);
        charBuffer.put(cArr[(c2 >> '\b') & 15]);
        charBuffer.put(cArr[(c2 >> 4) & 15]);
        charBuffer.put(cArr[c2 & 15]);
        charBuffer.flip();
        return charBuffer;
    }

    private static int f(CharsetEncoder charsetEncoder, int i) {
        return (int) Math.ceil(i * charsetEncoder.averageBytesPerChar());
    }

    private static int g(CharsetEncoder charsetEncoder, int i) {
        return (int) Math.ceil(charsetEncoder.maxBytesPerChar() + ((i - 1) * charsetEncoder.averageBytesPerChar()));
    }

    private CharsetDecoder h() {
        if (this.b) {
            CharsetDecoder newDecoder = this.a.newDecoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
            return newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).replaceWith(d);
        }
        CharsetDecoder newDecoder2 = this.a.newDecoder();
        CodingErrorAction codingErrorAction2 = CodingErrorAction.REPORT;
        return newDecoder2.onMalformedInput(codingErrorAction2).onUnmappableCharacter(codingErrorAction2);
    }

    private CharsetEncoder i() {
        if (this.b) {
            CharsetEncoder newEncoder = this.a.newEncoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
            return newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).replaceWith(c);
        }
        CharsetEncoder newEncoder2 = this.a.newEncoder();
        CodingErrorAction codingErrorAction2 = CodingErrorAction.REPORT;
        return newEncoder2.onMalformedInput(codingErrorAction2).onUnmappableCharacter(codingErrorAction2);
    }

    @Override // ax.Dc.L
    public String a(byte[] bArr) throws IOException {
        return h().decode(ByteBuffer.wrap(bArr)).toString();
    }

    @Override // ax.Dc.L
    public ByteBuffer b(String str) {
        CharsetEncoder i = i();
        CharBuffer wrap = CharBuffer.wrap(str);
        ByteBuffer allocate = ByteBuffer.allocate(g(i, wrap.remaining()));
        CharBuffer charBuffer = null;
        while (wrap.hasRemaining()) {
            CoderResult encode = i.encode(wrap, allocate, false);
            if (encode.isUnmappable() || encode.isMalformed()) {
                if (f(i, encode.length() * 6) > allocate.remaining()) {
                    int i2 = 0;
                    for (int position = wrap.position(); position < wrap.limit(); position++) {
                        i2 += !i.canEncode(wrap.get(position)) ? 6 : 1;
                    }
                    allocate = M.b(allocate, f(i, i2) - allocate.remaining());
                }
                if (charBuffer == null) {
                    charBuffer = CharBuffer.allocate(6);
                }
                for (int i3 = 0; i3 < encode.length(); i3++) {
                    allocate = d(i, e(charBuffer, wrap.get()), allocate);
                }
            } else if (!encode.isOverflow()) {
                if (encode.isUnderflow() || encode.isError()) {
                    break;
                }
            } else {
                allocate = M.b(allocate, f(i, wrap.remaining()));
            }
        }
        i.encode(wrap, allocate, true);
        allocate.limit(allocate.position());
        allocate.rewind();
        return allocate;
    }

    @Override // ax.Dc.L
    public boolean c(String str) {
        return i().canEncode(str);
    }
}
