.class final Lax/i1/i0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/m1/o$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/i1/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation


# instance fields
.field public final a:J

.field public final b:Lax/U0/k;

.field private final c:Lax/U0/y;

.field private d:[B


# direct methods
.method public constructor <init>(Lax/U0/k;Lax/U0/g;)V
    .registers 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lax/i1/y;->a()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    iput-wide v0, p0, Lax/i1/i0$c;->a:J

    .line 9
    .line 10
    iput-object p1, p0, Lax/i1/i0$c;->b:Lax/U0/k;

    .line 11
    .line 12
    new-instance p1, Lax/U0/y;

    .line 13
    .line 14
    invoke-direct {p1, p2}, Lax/U0/y;-><init>(Lax/U0/g;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lax/i1/i0$c;->c:Lax/U0/y;

    .line 18
    .line 19
    return-void
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

.method static synthetic b(Lax/i1/i0$c;)Lax/U0/y;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/i1/i0$c;->c:Lax/U0/y;

    .line 2
    .line 3
    return-object p0
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
    .line 22
.end method

.method static synthetic d(Lax/i1/i0$c;)[B
    .registers 1

    .line 1
    iget-object p0, p0, Lax/i1/i0$c;->d:[B

    .line 2
    .line 3
    return-object p0
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
    .line 22
.end method


# virtual methods
.method public a()V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/i1/i0$c;->c:Lax/U0/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/U0/y;->t()V

    .line 4
    .line 5
    .line 6
    :try_start_5
    iget-object v0, p0, Lax/i1/i0$c;->c:Lax/U0/y;

    .line 7
    .line 8
    iget-object v1, p0, Lax/i1/i0$c;->b:Lax/U0/k;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lax/U0/y;->f(Lax/U0/k;)J

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    :goto_d
    const/4 v1, -0x1

    .line 15
    if-eq v0, v1, :cond_3b

    .line 16
    .line 17
    iget-object v0, p0, Lax/i1/i0$c;->c:Lax/U0/y;

    .line 18
    .line 19
    invoke-virtual {v0}, Lax/U0/y;->q()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    long-to-int v1, v0

    .line 24
    iget-object v0, p0, Lax/i1/i0$c;->d:[B

    .line 25
    .line 26
    if-nez v0, :cond_24

    .line 27
    .line 28
    const/16 v0, 0x400

    .line 29
    .line 30
    new-array v0, v0, [B

    .line 31
    .line 32
    iput-object v0, p0, Lax/i1/i0$c;->d:[B

    .line 33
    .line 34
    goto :goto_30

    .line 35
    :catchall_22
    move-exception v0

    .line 36
    goto :goto_41

    .line 37
    :cond_24
    array-length v2, v0

    .line 38
    if-ne v1, v2, :cond_30

    .line 39
    .line 40
    array-length v2, v0

    .line 41
    mul-int/lit8 v2, v2, 0x2

    .line 42
    .line 43
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, p0, Lax/i1/i0$c;->d:[B

    .line 48
    .line 49
    :cond_30
    :goto_30
    iget-object v0, p0, Lax/i1/i0$c;->c:Lax/U0/y;

    .line 50
    .line 51
    iget-object v2, p0, Lax/i1/i0$c;->d:[B

    .line 52
    .line 53
    array-length v3, v2

    .line 54
    sub-int/2addr v3, v1

    .line 55
    invoke-virtual {v0, v2, v1, v3}, Lax/U0/y;->c([BII)I

    .line 56
    .line 57
    .line 58
    move-result v0
    :try_end_3a
    .catchall {:try_start_5 .. :try_end_3a} :catchall_22

    .line 59
    goto :goto_d

    .line 60
    :cond_3b
    iget-object v0, p0, Lax/i1/i0$c;->c:Lax/U0/y;

    .line 61
    .line 62
    invoke-static {v0}, Lax/U0/j;->a(Lax/U0/g;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :goto_41
    iget-object v1, p0, Lax/i1/i0$c;->c:Lax/U0/y;

    .line 67
    .line 68
    invoke-static {v1}, Lax/U0/j;->a(Lax/U0/g;)V

    .line 69
    .line 70
    .line 71
    throw v0
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
.end method

.method public c()V
    .registers 1

    .line 1
    return-void
    .line 2
    .line 3
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
