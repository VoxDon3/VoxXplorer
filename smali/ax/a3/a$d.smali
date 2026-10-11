.class public Lax/a3/a$d;
.super Lax/u3/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/a3/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/u3/q<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Lax/U2/a;",
        ">;"
    }
.end annotation


# instance fields
.field private h:Lax/U2/f;

.field final synthetic i:Lax/a3/a;


# direct methods
.method constructor <init>(Lax/a3/a;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/a3/a$d;->i:Lax/a3/a;

    .line 2
    .line 3
    sget-object p1, Lax/u3/q$e;->e0:Lax/u3/q$e;

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lax/u3/q;-><init>(Lax/u3/q$e;)V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method


# virtual methods
.method protected bridge synthetic g([Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 1
    check-cast p1, [Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/a3/a$d;->w([Ljava/lang/Void;)Lax/U2/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method protected bridge synthetic q(Ljava/lang/Object;)V
    .registers 2

    .line 1
    check-cast p1, Lax/U2/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/a3/a$d;->x(Lax/U2/a;)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method protected r()V
    .registers 3

    .line 1
    invoke-super {p0}, Lax/u3/q;->r()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/a3/a$d;->i:Lax/a3/a;

    .line 5
    .line 6
    invoke-static {v0}, Lax/a3/a;->k3(Lax/a3/a;)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 12
    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method protected varargs w([Ljava/lang/Void;)Lax/U2/a;
    .registers 4

    .line 1
    iget-object p1, p0, Lax/a3/a$d;->i:Lax/a3/a;

    .line 2
    .line 3
    invoke-static {p1}, Lax/a3/a;->j3(Lax/a3/a;)Lax/c3/k;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    instance-of p1, p1, Lcom/voxdon/xplorer/file/y;

    .line 8
    .line 9
    if-nez p1, :cond_f

    .line 10
    .line 11
    invoke-static {}, Lax/u3/b;->f()V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    return-object p1

    .line 16
    :cond_f
    iget-object p1, p0, Lax/a3/a$d;->i:Lax/a3/a;

    .line 17
    .line 18
    invoke-static {p1}, Lax/a3/a;->l3(Lax/a3/a;)Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget-object v0, p0, Lax/a3/a$d;->i:Lax/a3/a;

    .line 23
    .line 24
    invoke-static {v0}, Lax/a3/a;->j3(Lax/a3/a;)Lax/c3/k;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lcom/voxdon/xplorer/file/y;

    .line 29
    .line 30
    invoke-static {p1, v0}, Lax/U2/d;->q(Landroid/content/Context;Lcom/voxdon/xplorer/file/y;)Lax/U2/a;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    if-eqz p1, :cond_35

    .line 35
    .line 36
    iget-object v0, p0, Lax/a3/a$d;->i:Lax/a3/a;

    .line 37
    .line 38
    invoke-static {v0}, Lax/a3/a;->l3(Lax/a3/a;)Landroid/content/Context;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0}, Lax/U2/d;->F(Landroid/content/Context;)Lax/U2/d;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-object v1, p1, Lax/U2/a;->c:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Lax/U2/d;->x(Ljava/lang/String;)Lax/U2/f;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p0, Lax/a3/a$d;->h:Lax/U2/f;

    .line 53
    .line 54
    :cond_35
    return-object p1
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method protected x(Lax/U2/a;)V
    .registers 9

    .line 1
    iget-object v0, p0, Lax/a3/a$d;->i:Lax/a3/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_9

    .line 8
    .line 9
    return-void

    .line 10
    :cond_9
    iget-object v0, p0, Lax/a3/a$d;->i:Lax/a3/a;

    .line 11
    .line 12
    invoke-static {v0}, Lax/a3/a;->k3(Lax/a3/a;)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/16 v1, 0x8

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lax/a3/a$d;->i:Lax/a3/a;

    .line 22
    .line 23
    invoke-static {v0, p1}, Lax/a3/a;->n3(Lax/a3/a;Lax/U2/a;)Lax/U2/a;

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lax/a3/a$d;->i:Lax/a3/a;

    .line 27
    .line 28
    invoke-static {p1}, Lax/a3/a;->m3(Lax/a3/a;)Lax/U2/a;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const/4 v0, 0x1

    .line 33
    if-eqz p1, :cond_17e

    .line 34
    .line 35
    new-instance p1, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    iget-object v2, p0, Lax/a3/a$d;->i:Lax/a3/a;

    .line 41
    .line 42
    invoke-static {v2}, Lax/a3/a;->m3(Lax/a3/a;)Lax/U2/a;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    iget-object v2, v2, Lax/U2/a;->c:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v2, "\n"

    .line 52
    .line 53
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    iget-object v2, p0, Lax/a3/a$d;->i:Lax/a3/a;

    .line 57
    .line 58
    invoke-static {v2}, Lax/a3/a;->m3(Lax/a3/a;)Lax/U2/a;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    iget-object v2, v2, Lax/U2/a;->b:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v2, " ("

    .line 68
    .line 69
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    iget-object v3, p0, Lax/a3/a$d;->i:Lax/a3/a;

    .line 73
    .line 74
    invoke-static {v3}, Lax/a3/a;->m3(Lax/a3/a;)Lax/U2/a;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    iget-wide v3, v3, Lax/U2/a;->d:J

    .line 79
    .line 80
    invoke-virtual {p1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v3, ")"

    .line 84
    .line 85
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    iget-object v4, p0, Lax/a3/a$d;->i:Lax/a3/a;

    .line 93
    .line 94
    invoke-static {v4}, Lax/a3/a;->o3(Lax/a3/a;)Landroid/view/View;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    const v5, 0x7f0a01d3

    .line 99
    .line 100
    .line 101
    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    check-cast v4, Landroid/widget/TextView;

    .line 106
    .line 107
    invoke-virtual {v4, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 108
    .line 109
    .line 110
    iget-object p1, p0, Lax/a3/a$d;->i:Lax/a3/a;

    .line 111
    .line 112
    invoke-static {p1}, Lax/a3/a;->o3(Lax/a3/a;)Landroid/view/View;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    const v4, 0x7f0a0065

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    check-cast p1, Landroid/widget/TextView;

    .line 124
    .line 125
    iget-object v4, p0, Lax/a3/a$d;->i:Lax/a3/a;

    .line 126
    .line 127
    invoke-static {v4}, Lax/a3/a;->m3(Lax/a3/a;)Lax/U2/a;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    iget-object v4, v4, Lax/U2/a;->a:Ljava/lang/String;

    .line 132
    .line 133
    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 134
    .line 135
    .line 136
    iget-object p1, p0, Lax/a3/a$d;->h:Lax/U2/f;

    .line 137
    .line 138
    if-eqz p1, :cond_152

    .line 139
    .line 140
    iget-object p1, p0, Lax/a3/a$d;->i:Lax/a3/a;

    .line 141
    .line 142
    invoke-static {p1}, Lax/a3/a;->o3(Lax/a3/a;)Landroid/view/View;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    const v4, 0x7f0a026c

    .line 147
    .line 148
    .line 149
    invoke-virtual {p1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    check-cast p1, Landroid/widget/TextView;

    .line 154
    .line 155
    new-instance v4, Ljava/lang/StringBuilder;

    .line 156
    .line 157
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 158
    .line 159
    .line 160
    iget-object v5, p0, Lax/a3/a$d;->h:Lax/U2/f;

    .line 161
    .line 162
    invoke-virtual {v5}, Lax/U2/f;->x()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    iget-object v2, p0, Lax/a3/a$d;->h:Lax/U2/f;

    .line 173
    .line 174
    invoke-virtual {v2}, Lax/U2/f;->y()J

    .line 175
    .line 176
    .line 177
    move-result-wide v5

    .line 178
    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 189
    .line 190
    .line 191
    iget-object p1, p0, Lax/a3/a$d;->h:Lax/U2/f;

    .line 192
    .line 193
    invoke-virtual {p1}, Lax/U2/f;->y()J

    .line 194
    .line 195
    .line 196
    move-result-wide v2

    .line 197
    iget-object p1, p0, Lax/a3/a$d;->i:Lax/a3/a;

    .line 198
    .line 199
    invoke-static {p1}, Lax/a3/a;->m3(Lax/a3/a;)Lax/U2/a;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    iget-wide v4, p1, Lax/U2/a;->d:J

    .line 204
    .line 205
    cmp-long p1, v2, v4

    .line 206
    .line 207
    if-ltz p1, :cond_12a

    .line 208
    .line 209
    iget-object p1, p0, Lax/a3/a$d;->i:Lax/a3/a;

    .line 210
    .line 211
    invoke-static {p1}, Lax/a3/a;->p3(Lax/a3/a;)Landroid/widget/TextView;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    const/4 v1, 0x0

    .line 216
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 217
    .line 218
    .line 219
    iget-object p1, p0, Lax/a3/a$d;->h:Lax/U2/f;

    .line 220
    .line 221
    invoke-virtual {p1}, Lax/U2/f;->y()J

    .line 222
    .line 223
    .line 224
    move-result-wide v2

    .line 225
    iget-object p1, p0, Lax/a3/a$d;->i:Lax/a3/a;

    .line 226
    .line 227
    invoke-static {p1}, Lax/a3/a;->m3(Lax/a3/a;)Lax/U2/a;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    iget-wide v4, p1, Lax/U2/a;->d:J

    .line 232
    .line 233
    cmp-long p1, v2, v4

    .line 234
    .line 235
    if-lez p1, :cond_10b

    .line 236
    .line 237
    iget-object p1, p0, Lax/a3/a$d;->i:Lax/a3/a;

    .line 238
    .line 239
    invoke-static {p1}, Lax/a3/a;->p3(Lax/a3/a;)Landroid/widget/TextView;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    const v2, 0x7f1302e1

    .line 244
    .line 245
    .line 246
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 247
    .line 248
    .line 249
    iget-object p1, p0, Lax/a3/a$d;->i:Lax/a3/a;

    .line 250
    .line 251
    invoke-static {p1}, Lax/a3/a;->q3(Lax/a3/a;)Landroid/widget/TextView;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 256
    .line 257
    .line 258
    iget-object p1, p0, Lax/a3/a$d;->i:Lax/a3/a;

    .line 259
    .line 260
    invoke-static {p1}, Lax/a3/a;->r3(Lax/a3/a;)Landroid/view/View;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 265
    .line 266
    .line 267
    goto :goto_145

    .line 268
    :cond_10b
    iget-object p1, p0, Lax/a3/a$d;->i:Lax/a3/a;

    .line 269
    .line 270
    invoke-static {p1}, Lax/a3/a;->p3(Lax/a3/a;)Landroid/widget/TextView;

    .line 271
    .line 272
    .line 273
    move-result-object p1

    .line 274
    const v1, 0x7f1302bd

    .line 275
    .line 276
    .line 277
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(I)V

    .line 278
    .line 279
    .line 280
    iget-object p1, p0, Lax/a3/a$d;->i:Lax/a3/a;

    .line 281
    .line 282
    invoke-static {p1}, Lax/a3/a;->q3(Lax/a3/a;)Landroid/widget/TextView;

    .line 283
    .line 284
    .line 285
    move-result-object p1

    .line 286
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 287
    .line 288
    .line 289
    iget-object p1, p0, Lax/a3/a$d;->i:Lax/a3/a;

    .line 290
    .line 291
    invoke-static {p1}, Lax/a3/a;->q3(Lax/a3/a;)Landroid/widget/TextView;

    .line 292
    .line 293
    .line 294
    move-result-object p1

    .line 295
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 296
    .line 297
    .line 298
    goto :goto_145

    .line 299
    :cond_12a
    iget-object p1, p0, Lax/a3/a$d;->i:Lax/a3/a;

    .line 300
    .line 301
    invoke-static {p1}, Lax/a3/a;->p3(Lax/a3/a;)Landroid/widget/TextView;

    .line 302
    .line 303
    .line 304
    move-result-object p1

    .line 305
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 306
    .line 307
    .line 308
    iget-object p1, p0, Lax/a3/a$d;->i:Lax/a3/a;

    .line 309
    .line 310
    invoke-static {p1}, Lax/a3/a;->q3(Lax/a3/a;)Landroid/widget/TextView;

    .line 311
    .line 312
    .line 313
    move-result-object p1

    .line 314
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 315
    .line 316
    .line 317
    iget-object p1, p0, Lax/a3/a$d;->i:Lax/a3/a;

    .line 318
    .line 319
    invoke-static {p1}, Lax/a3/a;->q3(Lax/a3/a;)Landroid/widget/TextView;

    .line 320
    .line 321
    .line 322
    move-result-object p1

    .line 323
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 324
    .line 325
    .line 326
    :goto_145
    iget-object p1, p0, Lax/a3/a$d;->i:Lax/a3/a;

    .line 327
    .line 328
    invoke-static {p1}, Lax/a3/a;->q3(Lax/a3/a;)Landroid/widget/TextView;

    .line 329
    .line 330
    .line 331
    move-result-object p1

    .line 332
    const v1, 0x7f1302ba

    .line 333
    .line 334
    .line 335
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(I)V

    .line 336
    .line 337
    .line 338
    goto :goto_190

    .line 339
    :cond_152
    iget-object p1, p0, Lax/a3/a$d;->i:Lax/a3/a;

    .line 340
    .line 341
    invoke-static {p1}, Lax/a3/a;->o3(Lax/a3/a;)Landroid/view/View;

    .line 342
    .line 343
    .line 344
    move-result-object p1

    .line 345
    const v2, 0x7f0a026b

    .line 346
    .line 347
    .line 348
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 349
    .line 350
    .line 351
    move-result-object p1

    .line 352
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 353
    .line 354
    .line 355
    iget-object p1, p0, Lax/a3/a$d;->i:Lax/a3/a;

    .line 356
    .line 357
    invoke-static {p1}, Lax/a3/a;->p3(Lax/a3/a;)Landroid/widget/TextView;

    .line 358
    .line 359
    .line 360
    move-result-object p1

    .line 361
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 362
    .line 363
    .line 364
    iget-object p1, p0, Lax/a3/a$d;->i:Lax/a3/a;

    .line 365
    .line 366
    invoke-static {p1}, Lax/a3/a;->q3(Lax/a3/a;)Landroid/widget/TextView;

    .line 367
    .line 368
    .line 369
    move-result-object p1

    .line 370
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 371
    .line 372
    .line 373
    iget-object p1, p0, Lax/a3/a$d;->i:Lax/a3/a;

    .line 374
    .line 375
    invoke-static {p1}, Lax/a3/a;->q3(Lax/a3/a;)Landroid/widget/TextView;

    .line 376
    .line 377
    .line 378
    move-result-object p1

    .line 379
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 380
    .line 381
    .line 382
    goto :goto_190

    .line 383
    :cond_17e
    iget-object p1, p0, Lax/a3/a$d;->i:Lax/a3/a;

    .line 384
    .line 385
    invoke-static {p1}, Lax/a3/a;->q3(Lax/a3/a;)Landroid/widget/TextView;

    .line 386
    .line 387
    .line 388
    move-result-object p1

    .line 389
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 390
    .line 391
    .line 392
    iget-object p1, p0, Lax/a3/a$d;->i:Lax/a3/a;

    .line 393
    .line 394
    invoke-static {p1}, Lax/a3/a;->q3(Lax/a3/a;)Landroid/widget/TextView;

    .line 395
    .line 396
    .line 397
    move-result-object p1

    .line 398
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 399
    .line 400
    .line 401
    :goto_190
    iget-object p1, p0, Lax/a3/a$d;->i:Lax/a3/a;

    .line 402
    .line 403
    invoke-static {p1}, Lax/a3/a;->r3(Lax/a3/a;)Landroid/view/View;

    .line 404
    .line 405
    .line 406
    move-result-object p1

    .line 407
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 408
    .line 409
    .line 410
    return-void
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
.end method
