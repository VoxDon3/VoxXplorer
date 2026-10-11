.class final Lax/w3/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/w3/g$b;,
        Lax/w3/g$a;
    }
.end annotation


# direct methods
.method private static a(Lax/C3/b$d;JJLjava/lang/String;J)Lax/w3/g$a;
    .registers 12

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    cmp-long v3, p3, v0

    .line 5
    .line 6
    if-lez v3, :cond_1e

    .line 7
    .line 8
    cmp-long v0, p3, p1

    .line 9
    .line 10
    if-lez v0, :cond_c

    .line 11
    .line 12
    goto :goto_1e

    .line 13
    :cond_c
    sub-long/2addr p1, p3

    .line 14
    invoke-static {p0, p1, p2, p3, p4}, Lax/w3/g;->g(Lax/C3/b$d;JJ)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eqz p0, :cond_1e

    .line 19
    .line 20
    new-instance p0, Lax/w3/g$a;

    .line 21
    .line 22
    if-eqz p5, :cond_18

    .line 23
    .line 24
    goto :goto_1a

    .line 25
    :cond_18
    const-string p5, "video/mp4"

    .line 26
    .line 27
    :goto_1a
    invoke-direct/range {p0 .. p7}, Lax/w3/g$a;-><init>(JJLjava/lang/String;J)V

    .line 28
    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_1e
    :goto_1e
    return-object v2
    .line 32
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
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
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

.method static b(Lcom/android/ex/photo/c;Lax/C3/b$d;J)V
    .registers 6

    .line 1
    iget-object v0, p0, Lcom/android/ex/photo/c;->h:Lax/y0/a;

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_c

    .line 7
    :cond_6
    const-string v1, "Xmp"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lax/y0/a;->j(Ljava/lang/String;)[B

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :goto_c
    invoke-static {p0, p1, p2, p3, v0}, Lax/w3/g;->d(Lcom/android/ex/photo/c;Lax/C3/b$d;J[B)V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
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
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method static c(Lcom/android/ex/photo/c;Lax/C3/b$d;JLax/w3/g$b;)V
    .registers 13

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p2, v0

    .line 4
    .line 5
    if-gtz v2, :cond_7

    .line 6
    .line 7
    goto :goto_44

    .line 8
    :cond_7
    iget-boolean v2, p4, Lax/w3/g$b;->b:Z

    .line 9
    .line 10
    if-eqz v2, :cond_c

    .line 11
    .line 12
    goto :goto_44

    .line 13
    :cond_c
    iget-boolean v2, p4, Lax/w3/g$b;->a:Z

    .line 14
    .line 15
    if-eqz v2, :cond_26

    .line 16
    .line 17
    iget-wide v2, p4, Lax/w3/g$b;->d:J

    .line 18
    .line 19
    cmp-long v4, v2, v0

    .line 20
    .line 21
    if-lez v4, :cond_18

    .line 22
    .line 23
    :goto_16
    move-wide v3, v2

    .line 24
    goto :goto_1b

    .line 25
    :cond_18
    iget-wide v2, p4, Lax/w3/g$b;->c:J

    .line 26
    .line 27
    goto :goto_16

    .line 28
    :goto_1b
    iget-object v5, p4, Lax/w3/g$b;->f:Ljava/lang/String;

    .line 29
    .line 30
    iget-wide v6, p4, Lax/w3/g$b;->e:J

    .line 31
    .line 32
    move-object v0, p1

    .line 33
    move-wide v1, p2

    .line 34
    invoke-static/range {v0 .. v7}, Lax/w3/g;->a(Lax/C3/b$d;JJLjava/lang/String;J)Lax/w3/g$a;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    goto :goto_27

    .line 39
    :cond_26
    const/4 v3, 0x0

    .line 40
    :goto_27
    if-nez v3, :cond_2f

    .line 41
    .line 42
    iget-wide v3, p4, Lax/w3/g$b;->e:J

    .line 43
    .line 44
    invoke-static {p1, p2, p3, v3, v4}, Lax/w3/g;->i(Lax/C3/b$d;JJ)Lax/w3/g$a;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    :cond_2f
    if-eqz v3, :cond_44

    .line 49
    .line 50
    const/4 v0, 0x1

    .line 51
    iput-boolean v0, p0, Lcom/android/ex/photo/c;->b:Z

    .line 52
    .line 53
    iget-wide v0, v3, Lax/w3/g$a;->a:J

    .line 54
    .line 55
    iput-wide v0, p0, Lcom/android/ex/photo/c;->c:J

    .line 56
    .line 57
    iget-wide v0, v3, Lax/w3/g$a;->b:J

    .line 58
    .line 59
    iput-wide v0, p0, Lcom/android/ex/photo/c;->d:J

    .line 60
    .line 61
    iget-wide v0, v3, Lax/w3/g$a;->d:J

    .line 62
    .line 63
    iput-wide v0, p0, Lcom/android/ex/photo/c;->e:J

    .line 64
    .line 65
    iget-object v0, v3, Lax/w3/g$a;->c:Ljava/lang/String;

    .line 66
    .line 67
    iput-object v0, p0, Lcom/android/ex/photo/c;->f:Ljava/lang/String;

    .line 68
    .line 69
    :cond_44
    :goto_44
    return-void
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
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
.end method

.method static d(Lcom/android/ex/photo/c;Lax/C3/b$d;J[B)V
    .registers 5

    .line 1
    invoke-static {p4}, Lax/w3/g;->j([B)Lax/w3/g$b;

    .line 2
    .line 3
    .line 4
    move-result-object p4

    .line 5
    invoke-static {p0, p1, p2, p3, p4}, Lax/w3/g;->c(Lcom/android/ex/photo/c;Lax/C3/b$d;JLax/w3/g$b;)V

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
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
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
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
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
.end method

.method private static e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .registers 2

    .line 1
    if-eqz p0, :cond_3

    .line 2
    .line 3
    return-object p0

    .line 4
    :cond_3
    return-object p1
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method private static f(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .registers 4

    .line 1
    invoke-interface {p0, p1, p2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_7

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_7
    const/4 p1, 0x0

    .line 9
    :goto_8
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-ge p1, v0, :cond_20

    .line 14
    .line 15
    invoke-interface {p0, p1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1d

    .line 24
    .line 25
    invoke-interface {p0, p1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :cond_1d
    add-int/lit8 p1, p1, 0x1

    .line 31
    .line 32
    goto :goto_8

    .line 33
    :cond_20
    const/4 p0, 0x0

    .line 34
    return-object p0
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
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method private static g(Lax/C3/b$d;JJ)Z
    .registers 10

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    cmp-long v3, p1, v0

    .line 5
    .line 6
    if-ltz v3, :cond_31

    .line 7
    .line 8
    const-wide/16 v0, 0xc

    .line 9
    .line 10
    cmp-long v3, p3, v0

    .line 11
    .line 12
    if-gez v3, :cond_e

    .line 13
    .line 14
    goto :goto_31

    .line 15
    :cond_e
    const/16 v3, 0xc

    .line 16
    .line 17
    :try_start_10
    invoke-static {p0, p1, p2, v3}, Lax/w3/g;->q(Lax/C3/b$d;JI)[B

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p0, v2}, Lax/w3/g;->l([BI)J

    .line 22
    .line 23
    .line 24
    move-result-wide p1

    .line 25
    const-string v3, "ftyp"

    .line 26
    .line 27
    const/4 v4, 0x4

    .line 28
    invoke-static {p0, v4, v3}, Lax/w3/g;->h([BILjava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result p0
    :try_end_1f
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_1f} :catch_31

    .line 32
    if-eqz p0, :cond_31

    .line 33
    .line 34
    const-wide/16 v3, 0x1

    .line 35
    .line 36
    cmp-long p0, p1, v3

    .line 37
    .line 38
    if-eqz p0, :cond_2f

    .line 39
    .line 40
    cmp-long p0, p1, v0

    .line 41
    .line 42
    if-ltz p0, :cond_31

    .line 43
    .line 44
    cmp-long p0, p1, p3

    .line 45
    .line 46
    if-gtz p0, :cond_31

    .line 47
    .line 48
    :cond_2f
    const/4 p0, 0x1

    .line 49
    return p0

    .line 50
    :catch_31
    :cond_31
    :goto_31
    return v2
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
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method private static h([BILjava/lang/String;)Z
    .registers 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-ltz p1, :cond_25

    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    add-int/2addr v1, p1

    .line 9
    array-length v2, p0

    .line 10
    if-le v1, v2, :cond_c

    .line 11
    .line 12
    goto :goto_25

    .line 13
    :cond_c
    const/4 v1, 0x0

    .line 14
    :goto_d
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-ge v1, v2, :cond_23

    .line 19
    .line 20
    add-int v2, p1, v1

    .line 21
    .line 22
    aget-byte v2, p0, v2

    .line 23
    .line 24
    and-int/lit16 v2, v2, 0xff

    .line 25
    .line 26
    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eq v2, v3, :cond_20

    .line 31
    .line 32
    return v0

    .line 33
    :cond_20
    add-int/lit8 v1, v1, 0x1

    .line 34
    .line 35
    goto :goto_d

    .line 36
    :cond_23
    const/4 p0, 0x1

    .line 37
    return p0

    .line 38
    :cond_25
    :goto_25
    return v0
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
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method private static i(Lax/C3/b$d;JJ)Lax/w3/g$a;
    .registers 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-wide/16 v1, 0x8

    .line 4
    .line 5
    sub-long v3, p1, v1

    .line 6
    .line 7
    const/16 v5, 0x8

    .line 8
    .line 9
    const/4 v6, 0x0

    .line 10
    :try_start_9
    invoke-static {v0, v3, v4, v5}, Lax/w3/g;->q(Lax/C3/b$d;JI)[B

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    const-string v4, "SEFT"

    .line 15
    .line 16
    const/4 v7, 0x4

    .line 17
    invoke-static {v3, v7, v4}, Lax/w3/g;->h([BILjava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-nez v4, :cond_17

    .line 22
    .line 23
    return-object v6

    .line 24
    :cond_17
    const/4 v4, 0x0

    .line 25
    invoke-static {v3, v4}, Lax/w3/g;->o([BI)J

    .line 26
    .line 27
    .line 28
    move-result-wide v8

    .line 29
    const-wide/16 v10, 0xc

    .line 30
    .line 31
    cmp-long v3, v8, v10

    .line 32
    .line 33
    if-ltz v3, :cond_2f

    .line 34
    .line 35
    const-wide/32 v10, 0x100000

    .line 36
    .line 37
    .line 38
    cmp-long v3, v8, v10

    .line 39
    .line 40
    if-gtz v3, :cond_2f

    .line 41
    .line 42
    add-long v10, v8, v1

    .line 43
    .line 44
    cmp-long v3, v10, p1

    .line 45
    .line 46
    if-lez v3, :cond_33

    .line 47
    .line 48
    :cond_2f
    move-object/from16 v19, v6

    .line 49
    .line 50
    goto/16 :goto_e3

    .line 51
    .line 52
    :cond_33
    sub-long v10, p1, v8

    .line 53
    .line 54
    sub-long/2addr v10, v1

    .line 55
    long-to-int v3, v8

    .line 56
    invoke-static {v0, v10, v11, v3}, Lax/w3/g;->q(Lax/C3/b$d;JI)[B

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    const-string v8, "SEFH"

    .line 61
    .line 62
    invoke-static {v3, v4, v8}, Lax/w3/g;->h([BILjava/lang/String;)Z

    .line 63
    .line 64
    .line 65
    move-result v8

    .line 66
    if-nez v8, :cond_44

    .line 67
    .line 68
    return-object v6

    .line 69
    :cond_44
    invoke-static {v3, v5}, Lax/w3/g;->o([BI)J

    .line 70
    .line 71
    .line 72
    move-result-wide v8

    .line 73
    array-length v12, v3

    .line 74
    add-int/lit8 v12, v12, -0xc

    .line 75
    .line 76
    div-int/lit8 v12, v12, 0xc

    .line 77
    .line 78
    int-to-long v12, v12

    .line 79
    cmp-long v14, v8, v12

    .line 80
    .line 81
    if-lez v14, :cond_53

    .line 82
    .line 83
    return-object v6

    .line 84
    :cond_53
    :goto_53
    long-to-int v12, v8

    .line 85
    if-ge v4, v12, :cond_e0

    .line 86
    .line 87
    mul-int/lit8 v12, v4, 0xc

    .line 88
    .line 89
    add-int/lit8 v13, v12, 0xe

    .line 90
    .line 91
    invoke-static {v3, v13}, Lax/w3/g;->p([BI)I

    .line 92
    .line 93
    .line 94
    move-result v13

    .line 95
    add-int/lit8 v14, v12, 0x10

    .line 96
    .line 97
    invoke-static {v3, v14}, Lax/w3/g;->o([BI)J

    .line 98
    .line 99
    .line 100
    move-result-wide v14

    .line 101
    add-int/lit8 v12, v12, 0x14

    .line 102
    .line 103
    invoke-static {v3, v12}, Lax/w3/g;->o([BI)J

    .line 104
    .line 105
    .line 106
    move-result-wide v16

    .line 107
    sub-long v14, v10, v14

    .line 108
    .line 109
    const-wide/16 v18, 0x0

    .line 110
    .line 111
    cmp-long v12, v14, v18

    .line 112
    .line 113
    if-ltz v12, :cond_7c

    .line 114
    .line 115
    cmp-long v12, v16, v1

    .line 116
    .line 117
    if-ltz v12, :cond_7c

    .line 118
    .line 119
    add-long v20, v14, v16

    .line 120
    .line 121
    cmp-long v12, v20, v10

    .line 122
    .line 123
    if-lez v12, :cond_81

    .line 124
    .line 125
    :cond_7c
    move-wide/from16 v20, v1

    .line 126
    .line 127
    :cond_7e
    :goto_7e
    move-object/from16 v19, v6

    .line 128
    .line 129
    goto :goto_d6

    .line 130
    :cond_81
    invoke-static {v0, v14, v15, v5}, Lax/w3/g;->q(Lax/C3/b$d;JI)[B

    .line 131
    .line 132
    .line 133
    move-result-object v12

    .line 134
    move-wide/from16 v20, v1

    .line 135
    .line 136
    const/4 v1, 0x2

    .line 137
    invoke-static {v12, v1}, Lax/w3/g;->p([BI)I

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    if-eq v1, v13, :cond_8f

    .line 142
    .line 143
    :goto_8e
    goto :goto_7e

    .line 144
    :cond_8f
    invoke-static {v12, v7}, Lax/w3/g;->o([BI)J

    .line 145
    .line 146
    .line 147
    move-result-wide v1

    .line 148
    cmp-long v12, v1, v18

    .line 149
    .line 150
    if-lez v12, :cond_7e

    .line 151
    .line 152
    const-wide/16 v12, 0x400

    .line 153
    .line 154
    cmp-long v18, v1, v12

    .line 155
    .line 156
    if-gtz v18, :cond_7e

    .line 157
    .line 158
    add-long v12, v1, v20

    .line 159
    .line 160
    cmp-long v18, v12, v16

    .line 161
    .line 162
    if-ltz v18, :cond_a4

    .line 163
    .line 164
    goto :goto_8e

    .line 165
    :cond_a4
    add-long v14, v14, v20

    .line 166
    .line 167
    long-to-int v12, v1

    .line 168
    invoke-static {v0, v14, v15, v12}, Lax/w3/g;->q(Lax/C3/b$d;JI)[B

    .line 169
    .line 170
    .line 171
    move-result-object v12

    .line 172
    const-string v13, "MotionPhoto_Data"

    .line 173
    .line 174
    new-instance v5, Ljava/lang/String;
    :try_end_af
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_af} :catch_e0
    .catch Ljava/lang/RuntimeException; {:try_start_9 .. :try_end_af} :catch_e0

    .line 175
    .line 176
    move-object/from16 v19, v6

    .line 177
    .line 178
    :try_start_b1
    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 179
    .line 180
    invoke-direct {v5, v12, v6}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v5

    .line 187
    if-nez v5, :cond_bd

    .line 188
    .line 189
    goto :goto_d6

    .line 190
    :cond_bd
    add-long/2addr v14, v1

    .line 191
    sub-long v16, v16, v20

    .line 192
    .line 193
    sub-long v1, v16, v1

    .line 194
    .line 195
    invoke-static {v0, v14, v15, v1, v2}, Lax/w3/g;->g(Lax/C3/b$d;JJ)Z

    .line 196
    .line 197
    .line 198
    move-result v5

    .line 199
    if-eqz v5, :cond_d6

    .line 200
    .line 201
    new-instance v22, Lax/w3/g$a;

    .line 202
    .line 203
    const-string v27, "video/mp4"

    .line 204
    .line 205
    move-wide/from16 v28, p3

    .line 206
    .line 207
    move-wide/from16 v25, v1

    .line 208
    .line 209
    move-wide/from16 v23, v14

    .line 210
    .line 211
    invoke-direct/range {v22 .. v29}, Lax/w3/g$a;-><init>(JJLjava/lang/String;J)V
    :try_end_d5
    .catch Ljava/io/IOException; {:try_start_b1 .. :try_end_d5} :catch_e3
    .catch Ljava/lang/RuntimeException; {:try_start_b1 .. :try_end_d5} :catch_e3

    .line 212
    .line 213
    .line 214
    return-object v22

    .line 215
    :cond_d6
    :goto_d6
    add-int/lit8 v4, v4, 0x1

    .line 216
    .line 217
    move-object/from16 v6, v19

    .line 218
    .line 219
    move-wide/from16 v1, v20

    .line 220
    .line 221
    const/16 v5, 0x8

    .line 222
    .line 223
    goto/16 :goto_53

    .line 224
    .line 225
    :catch_e0
    :cond_e0
    move-object/from16 v19, v6

    .line 226
    .line 227
    nop

    .line 228
    :catch_e3
    :goto_e3
    return-object v19
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
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
.end method

.method static j([B)Lax/w3/g$b;
    .registers 2

    .line 1
    if-eqz p0, :cond_19

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    if-nez v0, :cond_6

    .line 5
    .line 6
    goto :goto_19

    .line 7
    :cond_6
    :try_start_6
    invoke-static {}, Lorg/xmlpull/v1/XmlPullParserFactory;->newInstance()Lorg/xmlpull/v1/XmlPullParserFactory;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lorg/xmlpull/v1/XmlPullParserFactory;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {p0, v0}, Lax/w3/g;->k([BLorg/xmlpull/v1/XmlPullParser;)Lax/w3/g$b;

    .line 16
    .line 17
    .line 18
    move-result-object p0
    :try_end_12
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_6 .. :try_end_12} :catch_13

    .line 19
    return-object p0

    .line 20
    :catch_13
    new-instance p0, Lax/w3/g$b;

    .line 21
    .line 22
    invoke-direct {p0}, Lax/w3/g$b;-><init>()V

    .line 23
    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_19
    :goto_19
    new-instance p0, Lax/w3/g$b;

    .line 27
    .line 28
    invoke-direct {p0}, Lax/w3/g$b;-><init>()V

    .line 29
    .line 30
    .line 31
    return-object p0
    .line 32
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
.end method

.method static k([BLorg/xmlpull/v1/XmlPullParser;)Lax/w3/g$b;
    .registers 9

    .line 1
    new-instance v0, Lax/w3/g$b;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/w3/g$b;-><init>()V

    .line 4
    .line 5
    .line 6
    if-eqz p0, :cond_69

    .line 7
    .line 8
    array-length v1, p0

    .line 9
    if-nez v1, :cond_b

    .line 10
    .line 11
    goto :goto_69

    .line 12
    :cond_b
    array-length v1, p0

    .line 13
    :goto_c
    if-lez v1, :cond_17

    .line 14
    .line 15
    add-int/lit8 v2, v1, -0x1

    .line 16
    .line 17
    aget-byte v2, p0, v2

    .line 18
    .line 19
    if-nez v2, :cond_17

    .line 20
    .line 21
    add-int/lit8 v1, v1, -0x1

    .line 22
    .line 23
    goto :goto_c

    .line 24
    :cond_17
    :try_start_17
    const-string v2, "http://xmlpull.org/v1/doc/features.html#process-namespaces"

    .line 25
    .line 26
    const/4 v3, 0x1

    .line 27
    invoke-interface {p1, v2, v3}, Lorg/xmlpull/v1/XmlPullParser;->setFeature(Ljava/lang/String;Z)V

    .line 28
    .line 29
    .line 30
    new-instance v2, Ljava/io/StringReader;

    .line 31
    .line 32
    new-instance v4, Ljava/lang/String;

    .line 33
    .line 34
    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 35
    .line 36
    const/4 v6, 0x0

    .line 37
    invoke-direct {v4, p0, v6, v1, v5}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 38
    .line 39
    .line 40
    invoke-direct {v2, v4}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-interface {p1, v2}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/Reader;)V

    .line 44
    .line 45
    .line 46
    :cond_2d
    :goto_2d
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-eq p0, v3, :cond_69

    .line 51
    .line 52
    const/4 v1, 0x2

    .line 53
    if-eq p0, v1, :cond_37

    .line 54
    .line 55
    goto :goto_2d

    .line 56
    :cond_37
    const-string p0, "Description"

    .line 57
    .line 58
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-eqz p0, :cond_47

    .line 67
    .line 68
    invoke-static {p1, v0}, Lax/w3/g;->m(Lorg/xmlpull/v1/XmlPullParser;Lax/w3/g$b;)V

    .line 69
    .line 70
    .line 71
    goto :goto_2d

    .line 72
    :cond_47
    const-string p0, "Item"

    .line 73
    .line 74
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    if-eqz p0, :cond_2d

    .line 83
    .line 84
    const-string p0, "http://ns.google.com/photos/1.0/container/"

    .line 85
    .line 86
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result p0

    .line 94
    if-eqz p0, :cond_2d

    .line 95
    .line 96
    invoke-static {p1, v0}, Lax/w3/g;->n(Lorg/xmlpull/v1/XmlPullParser;Lax/w3/g$b;)V
    :try_end_62
    .catch Ljava/io/IOException; {:try_start_17 .. :try_end_62} :catch_63
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_17 .. :try_end_62} :catch_63
    .catch Ljava/lang/NumberFormatException; {:try_start_17 .. :try_end_62} :catch_63

    .line 97
    .line 98
    .line 99
    goto :goto_2d

    .line 100
    :catch_63
    new-instance p0, Lax/w3/g$b;

    .line 101
    .line 102
    invoke-direct {p0}, Lax/w3/g$b;-><init>()V

    .line 103
    .line 104
    .line 105
    return-object p0

    .line 106
    :cond_69
    :goto_69
    return-object v0
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
.end method

.method private static l([BI)J
    .registers 9

    .line 1
    aget-byte v0, p0, p1

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    const-wide/16 v2, 0xff

    .line 5
    .line 6
    and-long/2addr v0, v2

    .line 7
    const/16 v4, 0x18

    .line 8
    .line 9
    shl-long/2addr v0, v4

    .line 10
    add-int/lit8 v4, p1, 0x1

    .line 11
    .line 12
    aget-byte v4, p0, v4

    .line 13
    .line 14
    int-to-long v4, v4

    .line 15
    and-long/2addr v4, v2

    .line 16
    const/16 v6, 0x10

    .line 17
    .line 18
    shl-long/2addr v4, v6

    .line 19
    or-long/2addr v0, v4

    .line 20
    add-int/lit8 v4, p1, 0x2

    .line 21
    .line 22
    aget-byte v4, p0, v4

    .line 23
    .line 24
    int-to-long v4, v4

    .line 25
    and-long/2addr v4, v2

    .line 26
    const/16 v6, 0x8

    .line 27
    .line 28
    shl-long/2addr v4, v6

    .line 29
    or-long/2addr v0, v4

    .line 30
    add-int/lit8 p1, p1, 0x3

    .line 31
    .line 32
    aget-byte p0, p0, p1

    .line 33
    .line 34
    int-to-long p0, p0

    .line 35
    and-long/2addr p0, v2

    .line 36
    or-long/2addr p0, v0

    .line 37
    return-wide p0
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method private static m(Lorg/xmlpull/v1/XmlPullParser;Lax/w3/g$b;)V
    .registers 8

    .line 1
    const-string v0, "MotionPhoto"

    .line 2
    .line 3
    const-string v1, "http://ns.google.com/photos/1.0/camera/"

    .line 4
    .line 5
    invoke-static {p0, v1, v0}, Lax/w3/g;->f(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v2, "MicroVideo"

    .line 10
    .line 11
    invoke-static {p0, v1, v2}, Lax/w3/g;->f(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-static {v0, v2}, Lax/w3/g;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_20

    .line 20
    .line 21
    const-string v2, "1"

    .line 22
    .line 23
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iput-boolean v0, p1, Lax/w3/g$b;->a:Z

    .line 28
    .line 29
    xor-int/lit8 v0, v0, 0x1

    .line 30
    .line 31
    iput-boolean v0, p1, Lax/w3/g$b;->b:Z

    .line 32
    .line 33
    :cond_20
    const-string v0, "MotionPhotoPresentationTimestampUs"

    .line 34
    .line 35
    invoke-static {p0, v1, v0}, Lax/w3/g;->f(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const-string v2, "MicroVideoPresentationTimestampUs"

    .line 40
    .line 41
    invoke-static {p0, v1, v2}, Lax/w3/g;->f(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-static {v0, v2}, Lax/w3/g;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    if-eqz v0, :cond_3e

    .line 50
    .line 51
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 52
    .line 53
    .line 54
    move-result-wide v2

    .line 55
    const-wide/16 v4, 0x0

    .line 56
    .line 57
    cmp-long v0, v2, v4

    .line 58
    .line 59
    if-ltz v0, :cond_3e

    .line 60
    .line 61
    iput-wide v2, p1, Lax/w3/g$b;->e:J

    .line 62
    .line 63
    :cond_3e
    const-string v0, "MicroVideoOffset"

    .line 64
    .line 65
    invoke-static {p0, v1, v0}, Lax/w3/g;->f(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    if-eqz p0, :cond_4c

    .line 70
    .line 71
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 72
    .line 73
    .line 74
    move-result-wide v0

    .line 75
    iput-wide v0, p1, Lax/w3/g$b;->c:J

    .line 76
    .line 77
    :cond_4c
    return-void
    .line 78
    .line 79
    .line 80
    .line 81
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
.end method

.method private static n(Lorg/xmlpull/v1/XmlPullParser;Lax/w3/g$b;)V
    .registers 6

    .line 1
    const-string v0, "Semantic"

    .line 2
    .line 3
    const-string v1, "http://ns.google.com/photos/1.0/container/item/"

    .line 4
    .line 5
    invoke-static {p0, v1, v0}, Lax/w3/g;->f(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v2, "MotionPhoto"

    .line 10
    .line 11
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_11

    .line 16
    .line 17
    goto :goto_27

    .line 18
    :cond_11
    const-string v0, "Length"

    .line 19
    .line 20
    invoke-static {p0, v1, v0}, Lax/w3/g;->f(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_27

    .line 25
    .line 26
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 27
    .line 28
    .line 29
    move-result-wide v2

    .line 30
    iput-wide v2, p1, Lax/w3/g$b;->d:J

    .line 31
    .line 32
    const-string v0, "Mime"

    .line 33
    .line 34
    invoke-static {p0, v1, v0}, Lax/w3/g;->f(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    iput-object p0, p1, Lax/w3/g$b;->f:Ljava/lang/String;

    .line 39
    .line 40
    :cond_27
    :goto_27
    return-void
    .line 41
.end method

.method private static o([BI)J
    .registers 9

    .line 1
    aget-byte v0, p0, p1

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    const-wide/16 v2, 0xff

    .line 5
    .line 6
    and-long/2addr v0, v2

    .line 7
    add-int/lit8 v4, p1, 0x1

    .line 8
    .line 9
    aget-byte v4, p0, v4

    .line 10
    .line 11
    int-to-long v4, v4

    .line 12
    and-long/2addr v4, v2

    .line 13
    const/16 v6, 0x8

    .line 14
    .line 15
    shl-long/2addr v4, v6

    .line 16
    or-long/2addr v0, v4

    .line 17
    add-int/lit8 v4, p1, 0x2

    .line 18
    .line 19
    aget-byte v4, p0, v4

    .line 20
    .line 21
    int-to-long v4, v4

    .line 22
    and-long/2addr v4, v2

    .line 23
    const/16 v6, 0x10

    .line 24
    .line 25
    shl-long/2addr v4, v6

    .line 26
    or-long/2addr v0, v4

    .line 27
    add-int/lit8 p1, p1, 0x3

    .line 28
    .line 29
    aget-byte p0, p0, p1

    .line 30
    .line 31
    int-to-long p0, p0

    .line 32
    and-long/2addr p0, v2

    .line 33
    const/16 v2, 0x18

    .line 34
    .line 35
    shl-long/2addr p0, v2

    .line 36
    or-long/2addr p0, v0

    .line 37
    return-wide p0
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method private static p([BI)I
    .registers 3

    .line 1
    aget-byte v0, p0, p1

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0xff

    .line 4
    .line 5
    add-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    aget-byte p0, p0, p1

    .line 8
    .line 9
    and-int/lit16 p0, p0, 0xff

    .line 10
    .line 11
    shl-int/lit8 p0, p0, 0x8

    .line 12
    .line 13
    or-int/2addr p0, v0

    .line 14
    return p0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method private static q(Lax/C3/b$d;JI)[B
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p1, v0

    .line 4
    .line 5
    if-ltz v2, :cond_4c

    .line 6
    .line 7
    if-ltz p3, :cond_4c

    .line 8
    .line 9
    invoke-interface {p0}, Lax/C3/b$d;->createInputStream()Ljava/io/InputStream;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :try_start_c
    invoke-static {p0, p1, p2}, Lax/w3/g;->r(Ljava/io/InputStream;J)V

    .line 14
    .line 15
    .line 16
    new-array p1, p3, [B

    .line 17
    .line 18
    const/4 p2, 0x0

    .line 19
    :goto_12
    if-ge p2, p3, :cond_3b

    .line 20
    .line 21
    sub-int v0, p3, p2

    .line 22
    .line 23
    invoke-virtual {p0, p1, p2, v0}, Ljava/io/InputStream;->read([BII)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-ltz v0, :cond_35

    .line 28
    .line 29
    if-nez v0, :cond_33

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-ltz v0, :cond_2d

    .line 36
    .line 37
    add-int/lit8 v1, p2, 0x1

    .line 38
    .line 39
    int-to-byte v0, v0

    .line 40
    aput-byte v0, p1, p2

    .line 41
    .line 42
    move p2, v1

    .line 43
    goto :goto_12

    .line 44
    :catchall_2b
    move-exception p1

    .line 45
    goto :goto_41

    .line 46
    :cond_2d
    new-instance p1, Ljava/io/EOFException;

    .line 47
    .line 48
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_33
    add-int/2addr p2, v0

    .line 53
    goto :goto_12

    .line 54
    :cond_35
    new-instance p1, Ljava/io/EOFException;

    .line 55
    .line 56
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 57
    .line 58
    .line 59
    throw p1
    :try_end_3b
    .catchall {:try_start_c .. :try_end_3b} :catchall_2b

    .line 60
    :cond_3b
    if-eqz p0, :cond_40

    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 63
    .line 64
    .line 65
    :cond_40
    return-object p1

    .line 66
    :goto_41
    if-eqz p0, :cond_4b

    .line 67
    .line 68
    :try_start_43
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_46
    .catchall {:try_start_43 .. :try_end_46} :catchall_47

    .line 69
    .line 70
    .line 71
    goto :goto_4b

    .line 72
    :catchall_47
    move-exception p0

    .line 73
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    :cond_4b
    :goto_4b
    throw p1

    .line 77
    :cond_4c
    new-instance p0, Ljava/io/EOFException;

    .line 78
    .line 79
    invoke-direct {p0}, Ljava/io/EOFException;-><init>()V

    .line 80
    .line 81
    .line 82
    throw p0
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method private static r(Ljava/io/InputStream;J)V
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :goto_0
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p1, v0

    .line 4
    .line 5
    if-lez v2, :cond_20

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Ljava/io/InputStream;->skip(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v2

    .line 11
    cmp-long v4, v2, v0

    .line 12
    .line 13
    if-lez v4, :cond_10

    .line 14
    .line 15
    sub-long/2addr p1, v2

    .line 16
    goto :goto_0

    .line 17
    :cond_10
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-ltz v0, :cond_1a

    .line 22
    .line 23
    const-wide/16 v0, 0x1

    .line 24
    .line 25
    sub-long/2addr p1, v0

    .line 26
    goto :goto_0

    .line 27
    :cond_1a
    new-instance p0, Ljava/io/EOFException;

    .line 28
    .line 29
    invoke-direct {p0}, Ljava/io/EOFException;-><init>()V

    .line 30
    .line 31
    .line 32
    throw p0

    .line 33
    :cond_20
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method
