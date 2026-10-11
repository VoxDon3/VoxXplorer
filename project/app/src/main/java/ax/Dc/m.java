/*
 * Decompiled with CFR 0.152.
 */
package ax.Dc;

import ax.Dc.L;
import ax.Dc.M;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

class m
implements L {
    private static final byte[] c = new byte[]{63};
    private static final String d = String.valueOf('?');
    private static final char[] e = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private final Charset a;
    private final boolean b;

    m(Charset charset, boolean bl) {
        this.a = charset;
        this.b = bl;
    }

    private static ByteBuffer d(CharsetEncoder charsetEncoder, CharBuffer charBuffer, ByteBuffer byteBuffer) {
        while (charBuffer.hasRemaining()) {
            if (!charsetEncoder.encode(charBuffer, byteBuffer, false).isOverflow()) continue;
            byteBuffer = M.b(byteBuffer, m.f(charsetEncoder, charBuffer.remaining()));
        }
        return byteBuffer;
    }

    private static CharBuffer e(CharBuffer charBuffer, char c8) {
        charBuffer.position(0).limit(6);
        charBuffer.put('%');
        charBuffer.put('U');
        char[] cArray = e;
        charBuffer.put(cArray[c8 >> 12 & 0xF]);
        charBuffer.put(cArray[c8 >> 8 & 0xF]);
        charBuffer.put(cArray[c8 >> 4 & 0xF]);
        charBuffer.put(cArray[c8 & 0xF]);
        charBuffer.flip();
        return charBuffer;
    }

    private static int f(CharsetEncoder charsetEncoder, int n8) {
        return (int)Math.ceil((float)n8 * charsetEncoder.averageBytesPerChar());
    }

    private static int g(CharsetEncoder charsetEncoder, int n8) {
        return (int)Math.ceil(charsetEncoder.maxBytesPerChar() + (float)(n8 - 1) * charsetEncoder.averageBytesPerChar());
    }

    private CharsetDecoder h() {
        if (!this.b) {
            CharsetDecoder charsetDecoder = this.a.newDecoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
            return charsetDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        }
        CharsetDecoder charsetDecoder = this.a.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        return charsetDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).replaceWith(d);
    }

    private CharsetEncoder i() {
        if (this.b) {
            CharsetEncoder charsetEncoder = this.a.newEncoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
            return charsetEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).replaceWith(c);
        }
        CharsetEncoder charsetEncoder = this.a.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        return charsetEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    @Override
    public String a(byte[] byArray) throws IOException {
        return this.h().decode(ByteBuffer.wrap(byArray)).toString();
    }

    @Override
    public ByteBuffer b(String object) {
        CharsetEncoder charsetEncoder = this.i();
        CharBuffer charBuffer = CharBuffer.wrap((CharSequence)object);
        object = ByteBuffer.allocate(m.g(charsetEncoder, charBuffer.remaining()));
        CharBuffer charBuffer2 = null;
        block0: while (charBuffer.hasRemaining()) {
            int n8;
            int n9 = 0;
            CoderResult coderResult = charsetEncoder.encode(charBuffer, (ByteBuffer)object, false);
            if (!coderResult.isUnmappable() && !coderResult.isMalformed()) {
                if (coderResult.isOverflow()) {
                    object = M.b((ByteBuffer)object, m.f(charsetEncoder, charBuffer.remaining()));
                    continue;
                }
                if (!coderResult.isUnderflow() && !coderResult.isError()) continue;
                break;
            }
            Object object2 = object;
            if (m.f(charsetEncoder, coderResult.length() * 6) > ((Buffer)object).remaining()) {
                int n10 = 0;
                for (n8 = charBuffer.position(); n8 < charBuffer.limit(); ++n8) {
                    int n11 = !charsetEncoder.canEncode(charBuffer.get(n8)) ? 6 : 1;
                    n10 += n11;
                }
                object2 = M.b((ByteBuffer)object, m.f(charsetEncoder, n10) - ((Buffer)object).remaining());
            }
            Object object3 = object2;
            CharBuffer charBuffer3 = charBuffer2;
            n8 = n9;
            if (charBuffer2 == null) {
                charBuffer3 = CharBuffer.allocate(6);
                n8 = n9;
                object3 = object2;
            }
            while (true) {
                object = object3;
                charBuffer2 = charBuffer3;
                if (n8 >= coderResult.length()) continue block0;
                object3 = m.d(charsetEncoder, m.e(charBuffer3, charBuffer.get()), (ByteBuffer)object3);
                ++n8;
            }
        }
        charsetEncoder.encode(charBuffer, (ByteBuffer)object, true);
        ((ByteBuffer)object).limit(((Buffer)object).position());
        ((ByteBuffer)object).rewind();
        return object;
    }

    @Override
    public boolean c(String string) {
        return this.i().canEncode(string);
    }
}

