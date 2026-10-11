/*
 * Decompiled with CFR 0.152.
 */
package ax.a1;

import ax.Q0.o;
import ax.Q0.q;
import ax.S0.a;
import ax.S0.d0;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class G
extends q {
    private int[] i;
    private int[] j;

    /*
     * Unable to fully structure code
     */
    @Override
    public void d(ByteBuffer var1_1) {
        var8_2 = a.e(this.j);
        var4_4 = var1_1.limit();
        var9_5 = this.m((var4_4 - var2_3) / this.b.d * this.c.d);
        for (var2_3 = var1_1.position(); var2_3 < var4_4; var2_3 += this.b.d) {
            for (int var6_8 : var8_2) {
                block4: {
                    block5: {
                        block6: {
                            block7: {
                                block8: {
                                    var6_8 = d0.Q(this.b.c) * var6_8 + var2_3;
                                    var7_9 = this.b.c;
                                    if (var7_9 == 2) break block4;
                                    if (var7_9 == 3) break block5;
                                    if (var7_9 == 4) break block6;
                                    if (var7_9 == 21) break block7;
                                    if (var7_9 == 22) break block8;
                                    if (var7_9 == 0x10000000) break block4;
                                    if (var7_9 != 0x50000000) {
                                        if (var7_9 != 0x60000000) {
                                            var1_1 = new StringBuilder();
                                            var1_1.append("Unexpected encoding: ");
                                            var1_1.append(this.b.c);
                                            throw new IllegalStateException(var1_1.toString());
                                        } else {
                                            ** GOTO lbl23
                                        }
                                    }
                                    break block7;
                                }
                                var9_5.putInt(var1_1.getInt(var6_8));
                                continue;
                            }
                            d0.k1(var9_5, d0.e0((ByteBuffer)var1_1, var6_8));
                            continue;
                        }
                        var9_5.putFloat(var1_1.getFloat(var6_8));
                        continue;
                    }
                    var9_5.put(var1_1.get(var6_8));
                    continue;
                }
                var9_5.putShort(var1_1.getShort(var6_8));
            }
        }
        var1_1.position(var4_4);
        var9_5.flip();
    }

    @Override
    public o.a i(o.a a8) throws o.b {
        int[] nArray = this.i;
        if (nArray == null) {
            return o.a.e;
        }
        if (d0.L0(a8.c)) {
            int n8 = a8.b != nArray.length ? 1 : 0;
            for (int i8 = 0; i8 < nArray.length; ++i8) {
                int n9 = nArray[i8];
                if (n9 < a8.b) {
                    n9 = n9 != i8 ? 1 : 0;
                    n8 |= n9;
                    continue;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Channel map (");
                stringBuilder.append(Arrays.toString(nArray));
                stringBuilder.append(") trying to access non-existent input channel.");
                throw new o.b(stringBuilder.toString(), a8);
            }
            if (n8 != 0) {
                return new o.a(a8.a, nArray.length, a8.c);
            }
            return o.a.e;
        }
        throw new o.b(a8);
    }

    @Override
    protected void j() {
        this.j = this.i;
    }

    @Override
    protected void l() {
        this.j = null;
        this.i = null;
    }

    public void n(int[] nArray) {
        this.i = nArray;
    }
}

