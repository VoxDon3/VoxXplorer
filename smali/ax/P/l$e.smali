.class public Lax/P/l$e;
.super Lax/P/l$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/P/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/P/l$e$c;,
        Lax/P/l$e$b;,
        Lax/P/l$e$d;,
        Lax/P/l$e$a;
    }
.end annotation


# instance fields
.field private e:I

.field private f:Lax/P/s;

.field private g:Landroid/app/PendingIntent;

.field private h:Landroid/app/PendingIntent;

.field private i:Landroid/app/PendingIntent;

.field private j:Z

.field private k:Ljava/lang/Integer;

.field private l:Ljava/lang/Integer;

.field private m:Landroidx/core/graphics/drawable/IconCompat;

.field private n:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/P/l$f;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
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
.end method

.method private i()Ljava/lang/String;
    .registers 3

    .line 1
    iget v0, p0, Lax/P/l$e;->e:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_2b

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    if-eq v0, v1, :cond_1c

    .line 8
    .line 9
    const/4 v1, 0x3

    .line 10
    if-eq v0, v1, :cond_d

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    return-object v0

    .line 14
    :cond_d
    iget-object v0, p0, Lax/P/l$f;->a:Lax/P/l$d;

    .line 15
    .line 16
    iget-object v0, v0, Lax/P/l$d;->a:Landroid/content/Context;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sget v1, Lax/O/f;->g:I

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    return-object v0

    .line 29
    :cond_1c
    iget-object v0, p0, Lax/P/l$f;->a:Lax/P/l$d;

    .line 30
    .line 31
    iget-object v0, v0, Lax/P/l$d;->a:Landroid/content/Context;

    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sget v1, Lax/O/f;->f:I

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    return-object v0

    .line 44
    :cond_2b
    iget-object v0, p0, Lax/P/l$f;->a:Lax/P/l$d;

    .line 45
    .line 46
    iget-object v0, v0, Lax/P/l$d;->a:Landroid/content/Context;

    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    sget v1, Lax/O/f;->e:I

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    return-object v0
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method private j(Lax/P/l$a;)Z
    .registers 3

    .line 1
    if-eqz p1, :cond_10

    .line 2
    .line 3
    invoke-virtual {p1}, Lax/P/l$a;->c()Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v0, "key_action_priority"

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_10

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    return p1

    .line 17
    :cond_10
    const/4 p1, 0x0

    .line 18
    return p1
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private k(IILjava/lang/Integer;ILandroid/app/PendingIntent;)Lax/P/l$a;
    .registers 8

    .line 1
    if-nez p3, :cond_e

    .line 2
    .line 3
    iget-object p3, p0, Lax/P/l$f;->a:Lax/P/l$d;

    .line 4
    .line 5
    iget-object p3, p3, Lax/P/l$d;->a:Landroid/content/Context;

    .line 6
    .line 7
    invoke-static {p3, p4}, Lax/Q/b;->c(Landroid/content/Context;I)I

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    :cond_e
    new-instance p4, Landroid/text/SpannableStringBuilder;

    .line 16
    .line 17
    invoke-direct {p4}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lax/P/l$f;->a:Lax/P/l$d;

    .line 21
    .line 22
    iget-object v0, v0, Lax/P/l$d;->a:Landroid/content/Context;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    invoke-virtual {p4, p2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 33
    .line 34
    .line 35
    new-instance p2, Landroid/text/style/ForegroundColorSpan;

    .line 36
    .line 37
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result p3

    .line 41
    invoke-direct {p2, p3}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p4}, Landroid/text/SpannableStringBuilder;->length()I

    .line 45
    .line 46
    .line 47
    move-result p3

    .line 48
    const/16 v0, 0x12

    .line 49
    .line 50
    const/4 v1, 0x0

    .line 51
    invoke-virtual {p4, p2, v1, p3, v0}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 52
    .line 53
    .line 54
    new-instance p2, Lax/P/l$a$a;

    .line 55
    .line 56
    iget-object p3, p0, Lax/P/l$f;->a:Lax/P/l$d;

    .line 57
    .line 58
    iget-object p3, p3, Lax/P/l$d;->a:Landroid/content/Context;

    .line 59
    .line 60
    invoke-static {p3, p1}, Landroidx/core/graphics/drawable/IconCompat;->l(Landroid/content/Context;I)Landroidx/core/graphics/drawable/IconCompat;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-direct {p2, p1, p4, p5}, Lax/P/l$a$a;-><init>(Landroidx/core/graphics/drawable/IconCompat;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2}, Lax/P/l$a$a;->a()Lax/P/l$a;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p1}, Lax/P/l$a;->c()Landroid/os/Bundle;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    const-string p3, "key_action_priority"

    .line 76
    .line 77
    const/4 p4, 0x1

    .line 78
    invoke-virtual {p2, p3, p4}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 79
    .line 80
    .line 81
    return-object p1
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
.end method

.method private l()Lax/P/l$a;
    .registers 9

    .line 1
    sget v0, Lax/O/d;->b:I

    .line 2
    .line 3
    sget v1, Lax/O/d;->a:I

    .line 4
    .line 5
    iget-object v7, p0, Lax/P/l$e;->g:Landroid/app/PendingIntent;

    .line 6
    .line 7
    if-nez v7, :cond_a

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return-object v0

    .line 11
    :cond_a
    iget-boolean v2, p0, Lax/P/l$e;->j:Z

    .line 12
    .line 13
    if-eqz v2, :cond_10

    .line 14
    .line 15
    move v3, v0

    .line 16
    goto :goto_11

    .line 17
    :cond_10
    move v3, v1

    .line 18
    :goto_11
    if-eqz v2, :cond_17

    .line 19
    .line 20
    sget v0, Lax/O/f;->b:I

    .line 21
    .line 22
    :goto_15
    move v4, v0

    .line 23
    goto :goto_1a

    .line 24
    :cond_17
    sget v0, Lax/O/f;->a:I

    .line 25
    .line 26
    goto :goto_15

    .line 27
    :goto_1a
    iget-object v5, p0, Lax/P/l$e;->k:Ljava/lang/Integer;

    .line 28
    .line 29
    sget v6, Lax/O/b;->a:I

    .line 30
    .line 31
    move-object v2, p0

    .line 32
    invoke-direct/range {v2 .. v7}, Lax/P/l$e;->k(IILjava/lang/Integer;ILandroid/app/PendingIntent;)Lax/P/l$a;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    return-object v0
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method private m()Lax/P/l$a;
    .registers 7

    .line 1
    sget v1, Lax/O/d;->c:I

    .line 2
    .line 3
    iget-object v5, p0, Lax/P/l$e;->h:Landroid/app/PendingIntent;

    .line 4
    .line 5
    if-nez v5, :cond_14

    .line 6
    .line 7
    sget v2, Lax/O/f;->d:I

    .line 8
    .line 9
    iget-object v3, p0, Lax/P/l$e;->l:Ljava/lang/Integer;

    .line 10
    .line 11
    sget v4, Lax/O/b;->b:I

    .line 12
    .line 13
    iget-object v5, p0, Lax/P/l$e;->i:Landroid/app/PendingIntent;

    .line 14
    .line 15
    move-object v0, p0

    .line 16
    invoke-direct/range {v0 .. v5}, Lax/P/l$e;->k(IILjava/lang/Integer;ILandroid/app/PendingIntent;)Lax/P/l$a;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    return-object v1

    .line 21
    :cond_14
    move-object v0, p0

    .line 22
    sget v2, Lax/O/f;->c:I

    .line 23
    .line 24
    iget-object v3, v0, Lax/P/l$e;->l:Ljava/lang/Integer;

    .line 25
    .line 26
    sget v4, Lax/O/b;->b:I

    .line 27
    .line 28
    invoke-direct/range {v0 .. v5}, Lax/P/l$e;->k(IILjava/lang/Integer;ILandroid/app/PendingIntent;)Lax/P/l$a;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    return-object v1
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method


# virtual methods
.method public a(Landroid/os/Bundle;)V
    .registers 5

    .line 1
    invoke-super {p0, p1}, Lax/P/l$f;->a(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "android.callType"

    .line 5
    .line 6
    iget v1, p0, Lax/P/l$e;->e:I

    .line 7
    .line 8
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    const-string v0, "android.callIsVideo"

    .line 12
    .line 13
    iget-boolean v1, p0, Lax/P/l$e;->j:Z

    .line 14
    .line 15
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lax/P/l$e;->f:Lax/P/s;

    .line 19
    .line 20
    if-eqz v0, :cond_32

    .line 21
    .line 22
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 23
    .line 24
    const/16 v2, 0x1c

    .line 25
    .line 26
    if-lt v1, v2, :cond_29

    .line 27
    .line 28
    invoke-virtual {v0}, Lax/P/s;->h()Landroid/app/Person;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0}, Lax/P/l$e$c;->b(Landroid/app/Person;)Landroid/os/Parcelable;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-string v1, "android.callPerson"

    .line 37
    .line 38
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 39
    .line 40
    .line 41
    goto :goto_32

    .line 42
    :cond_29
    const-string v1, "android.callPersonCompat"

    .line 43
    .line 44
    invoke-virtual {v0}, Lax/P/s;->i()Landroid/os/Bundle;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 49
    .line 50
    .line 51
    :cond_32
    :goto_32
    iget-object v0, p0, Lax/P/l$e;->m:Landroidx/core/graphics/drawable/IconCompat;

    .line 52
    .line 53
    if-eqz v0, :cond_57

    .line 54
    .line 55
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 56
    .line 57
    const/16 v2, 0x17

    .line 58
    .line 59
    if-lt v1, v2, :cond_4e

    .line 60
    .line 61
    iget-object v1, p0, Lax/P/l$f;->a:Lax/P/l$d;

    .line 62
    .line 63
    iget-object v1, v1, Lax/P/l$d;->a:Landroid/content/Context;

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Landroidx/core/graphics/drawable/IconCompat;->y(Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-static {v0}, Lax/P/l$e$b;->a(Landroid/graphics/drawable/Icon;)Landroid/os/Parcelable;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    const-string v1, "android.verificationIcon"

    .line 74
    .line 75
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 76
    .line 77
    .line 78
    goto :goto_57

    .line 79
    :cond_4e
    const-string v1, "android.verificationIconCompat"

    .line 80
    .line 81
    invoke-virtual {v0}, Landroidx/core/graphics/drawable/IconCompat;->w()Landroid/os/Bundle;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 86
    .line 87
    .line 88
    :cond_57
    :goto_57
    const-string v0, "android.verificationText"

    .line 89
    .line 90
    iget-object v1, p0, Lax/P/l$e;->n:Ljava/lang/CharSequence;

    .line 91
    .line 92
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 93
    .line 94
    .line 95
    const-string v0, "android.answerIntent"

    .line 96
    .line 97
    iget-object v1, p0, Lax/P/l$e;->g:Landroid/app/PendingIntent;

    .line 98
    .line 99
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 100
    .line 101
    .line 102
    const-string v0, "android.declineIntent"

    .line 103
    .line 104
    iget-object v1, p0, Lax/P/l$e;->h:Landroid/app/PendingIntent;

    .line 105
    .line 106
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 107
    .line 108
    .line 109
    const-string v0, "android.hangUpIntent"

    .line 110
    .line 111
    iget-object v1, p0, Lax/P/l$e;->i:Landroid/app/PendingIntent;

    .line 112
    .line 113
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 114
    .line 115
    .line 116
    iget-object v0, p0, Lax/P/l$e;->k:Ljava/lang/Integer;

    .line 117
    .line 118
    if-eqz v0, :cond_80

    .line 119
    .line 120
    const-string v1, "android.answerColor"

    .line 121
    .line 122
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 127
    .line 128
    .line 129
    :cond_80
    iget-object v0, p0, Lax/P/l$e;->l:Ljava/lang/Integer;

    .line 130
    .line 131
    if-eqz v0, :cond_8d

    .line 132
    .line 133
    const-string v1, "android.declineColor"

    .line 134
    .line 135
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 140
    .line 141
    .line 142
    :cond_8d
    return-void
    .line 143
.end method

.method public b(Lax/P/k;)V
    .registers 6

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-lt v0, v1, :cond_98

    .line 7
    .line 8
    iget v0, p0, Lax/P/l$e;->e:I

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    if-eq v0, v1, :cond_51

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    if-eq v0, v1, :cond_44

    .line 15
    .line 16
    const/4 v1, 0x3

    .line 17
    if-eq v0, v1, :cond_35

    .line 18
    .line 19
    const-string v0, "NotifCompat"

    .line 20
    .line 21
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_5f

    .line 26
    .line 27
    new-instance v1, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    const-string v3, "Unrecognized call type in CallStyle: "

    .line 33
    .line 34
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    iget v3, p0, Lax/P/l$e;->e:I

    .line 38
    .line 39
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    goto :goto_5f

    .line 54
    :cond_35
    iget-object v0, p0, Lax/P/l$e;->f:Lax/P/s;

    .line 55
    .line 56
    invoke-virtual {v0}, Lax/P/s;->h()Landroid/app/Person;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iget-object v1, p0, Lax/P/l$e;->i:Landroid/app/PendingIntent;

    .line 61
    .line 62
    iget-object v2, p0, Lax/P/l$e;->g:Landroid/app/PendingIntent;

    .line 63
    .line 64
    invoke-static {v0, v1, v2}, Lax/P/l$e$d;->c(Landroid/app/Person;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)Landroid/app/Notification$CallStyle;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    goto :goto_5f

    .line 69
    :cond_44
    iget-object v0, p0, Lax/P/l$e;->f:Lax/P/s;

    .line 70
    .line 71
    invoke-virtual {v0}, Lax/P/s;->h()Landroid/app/Person;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iget-object v1, p0, Lax/P/l$e;->i:Landroid/app/PendingIntent;

    .line 76
    .line 77
    invoke-static {v0, v1}, Lax/P/l$e$d;->b(Landroid/app/Person;Landroid/app/PendingIntent;)Landroid/app/Notification$CallStyle;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    goto :goto_5f

    .line 82
    :cond_51
    iget-object v0, p0, Lax/P/l$e;->f:Lax/P/s;

    .line 83
    .line 84
    invoke-virtual {v0}, Lax/P/s;->h()Landroid/app/Person;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    iget-object v1, p0, Lax/P/l$e;->h:Landroid/app/PendingIntent;

    .line 89
    .line 90
    iget-object v2, p0, Lax/P/l$e;->g:Landroid/app/PendingIntent;

    .line 91
    .line 92
    invoke-static {v0, v1, v2}, Lax/P/l$e$d;->a(Landroid/app/Person;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)Landroid/app/Notification$CallStyle;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    :cond_5f
    :goto_5f
    if-eqz v2, :cond_97

    .line 97
    .line 98
    invoke-interface {p1}, Lax/P/k;->a()Landroid/app/Notification$Builder;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-static {v2, p1}, Lax/P/m;->a(Landroid/app/Notification$CallStyle;Landroid/app/Notification$Builder;)V

    .line 103
    .line 104
    .line 105
    iget-object p1, p0, Lax/P/l$e;->k:Ljava/lang/Integer;

    .line 106
    .line 107
    if-eqz p1, :cond_73

    .line 108
    .line 109
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    invoke-static {v2, p1}, Lax/P/l$e$d;->d(Landroid/app/Notification$CallStyle;I)Landroid/app/Notification$CallStyle;

    .line 114
    .line 115
    .line 116
    :cond_73
    iget-object p1, p0, Lax/P/l$e;->l:Ljava/lang/Integer;

    .line 117
    .line 118
    if-eqz p1, :cond_7e

    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    invoke-static {v2, p1}, Lax/P/l$e$d;->f(Landroid/app/Notification$CallStyle;I)Landroid/app/Notification$CallStyle;

    .line 125
    .line 126
    .line 127
    :cond_7e
    iget-object p1, p0, Lax/P/l$e;->n:Ljava/lang/CharSequence;

    .line 128
    .line 129
    invoke-static {v2, p1}, Lax/P/l$e$d;->i(Landroid/app/Notification$CallStyle;Ljava/lang/CharSequence;)Landroid/app/Notification$CallStyle;

    .line 130
    .line 131
    .line 132
    iget-object p1, p0, Lax/P/l$e;->m:Landroidx/core/graphics/drawable/IconCompat;

    .line 133
    .line 134
    if-eqz p1, :cond_92

    .line 135
    .line 136
    iget-object v0, p0, Lax/P/l$f;->a:Lax/P/l$d;

    .line 137
    .line 138
    iget-object v0, v0, Lax/P/l$d;->a:Landroid/content/Context;

    .line 139
    .line 140
    invoke-virtual {p1, v0}, Landroidx/core/graphics/drawable/IconCompat;->y(Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-static {v2, p1}, Lax/P/l$e$d;->h(Landroid/app/Notification$CallStyle;Landroid/graphics/drawable/Icon;)Landroid/app/Notification$CallStyle;

    .line 145
    .line 146
    .line 147
    :cond_92
    iget-boolean p1, p0, Lax/P/l$e;->j:Z

    .line 148
    .line 149
    invoke-static {v2, p1}, Lax/P/l$e$d;->g(Landroid/app/Notification$CallStyle;Z)Landroid/app/Notification$CallStyle;

    .line 150
    .line 151
    .line 152
    :cond_97
    return-void

    .line 153
    :cond_98
    invoke-interface {p1}, Lax/P/k;->a()Landroid/app/Notification$Builder;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    iget-object v1, p0, Lax/P/l$e;->f:Lax/P/s;

    .line 158
    .line 159
    if-eqz v1, :cond_a5

    .line 160
    .line 161
    invoke-virtual {v1}, Lax/P/s;->c()Ljava/lang/CharSequence;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    goto :goto_a6

    .line 166
    :cond_a5
    move-object v1, v2

    .line 167
    :goto_a6
    invoke-virtual {p1, v1}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 168
    .line 169
    .line 170
    iget-object v1, p0, Lax/P/l$f;->a:Lax/P/l$d;

    .line 171
    .line 172
    iget-object v1, v1, Lax/P/l$d;->D:Landroid/os/Bundle;

    .line 173
    .line 174
    if-eqz v1, :cond_bf

    .line 175
    .line 176
    const-string v3, "android.text"

    .line 177
    .line 178
    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    if-eqz v1, :cond_bf

    .line 183
    .line 184
    iget-object v1, p0, Lax/P/l$f;->a:Lax/P/l$d;

    .line 185
    .line 186
    iget-object v1, v1, Lax/P/l$d;->D:Landroid/os/Bundle;

    .line 187
    .line 188
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    :cond_bf
    if-nez v2, :cond_c5

    .line 193
    .line 194
    invoke-direct {p0}, Lax/P/l$e;->i()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    :cond_c5
    invoke-virtual {p1, v2}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 199
    .line 200
    .line 201
    iget-object v1, p0, Lax/P/l$e;->f:Lax/P/s;

    .line 202
    .line 203
    if-eqz v1, :cond_fe

    .line 204
    .line 205
    const/16 v2, 0x17

    .line 206
    .line 207
    if-lt v0, v2, :cond_e7

    .line 208
    .line 209
    invoke-virtual {v1}, Lax/P/s;->a()Landroidx/core/graphics/drawable/IconCompat;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    if-eqz v1, :cond_e7

    .line 214
    .line 215
    iget-object v1, p0, Lax/P/l$e;->f:Lax/P/s;

    .line 216
    .line 217
    invoke-virtual {v1}, Lax/P/s;->a()Landroidx/core/graphics/drawable/IconCompat;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    iget-object v2, p0, Lax/P/l$f;->a:Lax/P/l$d;

    .line 222
    .line 223
    iget-object v2, v2, Lax/P/l$d;->a:Landroid/content/Context;

    .line 224
    .line 225
    invoke-virtual {v1, v2}, Landroidx/core/graphics/drawable/IconCompat;->y(Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    invoke-static {p1, v1}, Lax/P/l$e$b;->c(Landroid/app/Notification$Builder;Landroid/graphics/drawable/Icon;)V

    .line 230
    .line 231
    .line 232
    :cond_e7
    const/16 v1, 0x1c

    .line 233
    .line 234
    if-lt v0, v1, :cond_f5

    .line 235
    .line 236
    iget-object v0, p0, Lax/P/l$e;->f:Lax/P/s;

    .line 237
    .line 238
    invoke-virtual {v0}, Lax/P/s;->h()Landroid/app/Person;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    invoke-static {p1, v0}, Lax/P/l$e$c;->a(Landroid/app/Notification$Builder;Landroid/app/Person;)Landroid/app/Notification$Builder;

    .line 243
    .line 244
    .line 245
    goto :goto_fe

    .line 246
    :cond_f5
    iget-object v0, p0, Lax/P/l$e;->f:Lax/P/s;

    .line 247
    .line 248
    invoke-virtual {v0}, Lax/P/s;->d()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-static {p1, v0}, Lax/P/l$e$a;->a(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 253
    .line 254
    .line 255
    :cond_fe
    :goto_fe
    const-string v0, "call"

    .line 256
    .line 257
    invoke-static {p1, v0}, Lax/P/l$e$a;->b(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 258
    .line 259
    .line 260
    return-void
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
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

.method protected c()Ljava/lang/String;
    .registers 2

    .line 1
    const-string v0, "androidx.core.app.NotificationCompat$CallStyle"

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public h()Ljava/util/ArrayList;
    .registers 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lax/P/l$a;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lax/P/l$e;->m()Lax/P/l$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0}, Lax/P/l$e;->l()Lax/P/l$a;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Ljava/util/ArrayList;

    .line 10
    .line 11
    const/4 v3, 0x3

    .line 12
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lax/P/l$f;->a:Lax/P/l$d;

    .line 19
    .line 20
    iget-object v0, v0, Lax/P/l$d;->b:Ljava/util/ArrayList;

    .line 21
    .line 22
    const/4 v3, 0x1

    .line 23
    const/4 v4, 0x2

    .line 24
    if-eqz v0, :cond_4a

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    const/4 v6, 0x0

    .line 31
    :cond_1e
    :goto_1e
    if-ge v6, v5, :cond_4a

    .line 32
    .line 33
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v7

    .line 37
    add-int/lit8 v6, v6, 0x1

    .line 38
    .line 39
    check-cast v7, Lax/P/l$a;

    .line 40
    .line 41
    invoke-virtual {v7}, Lax/P/l$a;->j()Z

    .line 42
    .line 43
    .line 44
    move-result v8

    .line 45
    if-eqz v8, :cond_32

    .line 46
    .line 47
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    goto :goto_40

    .line 51
    :cond_32
    invoke-direct {p0, v7}, Lax/P/l$e;->j(Lax/P/l$a;)Z

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    if-eqz v8, :cond_39

    .line 56
    .line 57
    goto :goto_40

    .line 58
    :cond_39
    if-le v4, v3, :cond_40

    .line 59
    .line 60
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    add-int/lit8 v4, v4, -0x1

    .line 64
    .line 65
    :cond_40
    :goto_40
    if-eqz v1, :cond_1e

    .line 66
    .line 67
    if-ne v4, v3, :cond_1e

    .line 68
    .line 69
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    add-int/lit8 v4, v4, -0x1

    .line 73
    .line 74
    goto :goto_1e

    .line 75
    :cond_4a
    if-eqz v1, :cond_51

    .line 76
    .line 77
    if-lt v4, v3, :cond_51

    .line 78
    .line 79
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    :cond_51
    return-object v2
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
.end method
