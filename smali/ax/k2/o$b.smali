.class public final Lax/k2/o$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/k2/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/k2/o$b$a;
    }
.end annotation


# static fields
.field public static final e:Lax/k2/o$b$a;


# instance fields
.field private final a:[J

.field private final b:[Z

.field private final c:[I

.field private d:Z


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 1
    new-instance v0, Lax/k2/o$b$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lax/k2/o$b$a;-><init>(Lax/Gb/g;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lax/k2/o$b;->e:Lax/k2/o$b$a;

    .line 8
    .line 9
    return-void
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

.method public constructor <init>(I)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-array v0, p1, [J

    .line 5
    .line 6
    iput-object v0, p0, Lax/k2/o$b;->a:[J

    .line 7
    .line 8
    new-array v0, p1, [Z

    .line 9
    .line 10
    iput-object v0, p0, Lax/k2/o$b;->b:[Z

    .line 11
    .line 12
    new-array p1, p1, [I

    .line 13
    .line 14
    iput-object p1, p0, Lax/k2/o$b;->c:[I

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method


# virtual methods
.method public final a()[I
    .registers 13

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-boolean v0, p0, Lax/k2/o$b;->d:Z
    :try_end_3
    .catchall {:try_start_1 .. :try_end_3} :catchall_2d

    .line 3
    .line 4
    if-nez v0, :cond_8

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    :cond_8
    :try_start_8
    iget-object v0, p0, Lax/k2/o$b;->a:[J

    .line 10
    .line 11
    array-length v1, v0

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    :goto_e
    if-ge v3, v1, :cond_39

    .line 16
    .line 17
    aget-wide v5, v0, v3

    .line 18
    .line 19
    add-int/lit8 v7, v4, 0x1

    .line 20
    .line 21
    const-wide/16 v8, 0x0

    .line 22
    .line 23
    const/4 v10, 0x1

    .line 24
    cmp-long v11, v5, v8

    .line 25
    .line 26
    if-lez v11, :cond_1d

    .line 27
    .line 28
    const/4 v5, 0x1

    .line 29
    goto :goto_1e

    .line 30
    :cond_1d
    const/4 v5, 0x0

    .line 31
    :goto_1e
    iget-object v6, p0, Lax/k2/o$b;->b:[Z

    .line 32
    .line 33
    aget-boolean v8, v6, v4

    .line 34
    .line 35
    if-eq v5, v8, :cond_2f

    .line 36
    .line 37
    iget-object v8, p0, Lax/k2/o$b;->c:[I

    .line 38
    .line 39
    if-eqz v5, :cond_29

    .line 40
    .line 41
    goto :goto_2a

    .line 42
    :cond_29
    const/4 v10, 0x2

    .line 43
    :goto_2a
    aput v10, v8, v4

    .line 44
    .line 45
    goto :goto_33

    .line 46
    :catchall_2d
    move-exception v0

    .line 47
    goto :goto_45

    .line 48
    :cond_2f
    iget-object v8, p0, Lax/k2/o$b;->c:[I

    .line 49
    .line 50
    aput v2, v8, v4

    .line 51
    .line 52
    :goto_33
    aput-boolean v5, v6, v4

    .line 53
    .line 54
    add-int/lit8 v3, v3, 0x1

    .line 55
    .line 56
    move v4, v7

    .line 57
    goto :goto_e

    .line 58
    :cond_39
    iput-boolean v2, p0, Lax/k2/o$b;->d:Z

    .line 59
    .line 60
    iget-object v0, p0, Lax/k2/o$b;->c:[I

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, [I
    :try_end_43
    .catchall {:try_start_8 .. :try_end_43} :catchall_2d

    .line 67
    .line 68
    monitor-exit p0

    .line 69
    return-object v0

    .line 70
    :goto_45
    monitor-exit p0

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

.method public final varargs b([I)Z
    .registers 12

    .line 1
    const/4 v0, 0x1

    .line 2
    const-string v1, "tableIds"

    .line 3
    .line 4
    invoke-static {p1, v1}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    monitor-enter p0

    .line 8
    :try_start_7
    array-length v1, p1

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    :goto_a
    if-ge v2, v1, :cond_25

    .line 12
    .line 13
    aget v4, p1, v2

    .line 14
    .line 15
    iget-object v5, p0, Lax/k2/o$b;->a:[J

    .line 16
    .line 17
    aget-wide v6, v5, v4

    .line 18
    .line 19
    const-wide/16 v8, 0x1

    .line 20
    .line 21
    add-long/2addr v8, v6

    .line 22
    aput-wide v8, v5, v4

    .line 23
    .line 24
    const-wide/16 v4, 0x0

    .line 25
    .line 26
    cmp-long v8, v6, v4

    .line 27
    .line 28
    if-nez v8, :cond_23

    .line 29
    .line 30
    iput-boolean v0, p0, Lax/k2/o$b;->d:Z

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    goto :goto_23

    .line 34
    :catchall_21
    move-exception p1

    .line 35
    goto :goto_29

    .line 36
    :cond_23
    :goto_23
    add-int/2addr v2, v0

    .line 37
    goto :goto_a

    .line 38
    :cond_25
    sget-object p1, Lax/sb/t;->a:Lax/sb/t;
    :try_end_27
    .catchall {:try_start_7 .. :try_end_27} :catchall_21

    .line 39
    .line 40
    monitor-exit p0

    .line 41
    return v3

    .line 42
    :goto_29
    monitor-exit p0

    .line 43
    throw p1
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

.method public final varargs c([I)Z
    .registers 14

    .line 1
    const/4 v0, 0x1

    .line 2
    const-string v1, "tableIds"

    .line 3
    .line 4
    invoke-static {p1, v1}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    monitor-enter p0

    .line 8
    :try_start_7
    array-length v1, p1

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    :goto_a
    if-ge v2, v1, :cond_24

    .line 12
    .line 13
    aget v4, p1, v2

    .line 14
    .line 15
    iget-object v5, p0, Lax/k2/o$b;->a:[J

    .line 16
    .line 17
    aget-wide v6, v5, v4

    .line 18
    .line 19
    const-wide/16 v8, 0x1

    .line 20
    .line 21
    sub-long v10, v6, v8

    .line 22
    .line 23
    aput-wide v10, v5, v4

    .line 24
    .line 25
    cmp-long v4, v6, v8

    .line 26
    .line 27
    if-nez v4, :cond_22

    .line 28
    .line 29
    iput-boolean v0, p0, Lax/k2/o$b;->d:Z

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    goto :goto_22

    .line 33
    :catchall_20
    move-exception p1

    .line 34
    goto :goto_28

    .line 35
    :cond_22
    :goto_22
    add-int/2addr v2, v0

    .line 36
    goto :goto_a

    .line 37
    :cond_24
    sget-object p1, Lax/sb/t;->a:Lax/sb/t;
    :try_end_26
    .catchall {:try_start_7 .. :try_end_26} :catchall_20

    .line 38
    .line 39
    monitor-exit p0

    .line 40
    return v3

    .line 41
    :goto_28
    monitor-exit p0

    .line 42
    throw p1
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

.method public final d()V
    .registers 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-object v0, p0, Lax/k2/o$b;->b:[Z

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([ZZ)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lax/k2/o$b;->d:Z

    .line 10
    .line 11
    sget-object v0, Lax/sb/t;->a:Lax/sb/t;
    :try_end_c
    .catchall {:try_start_1 .. :try_end_c} :catchall_e

    .line 12
    .line 13
    monitor-exit p0

    .line 14
    return-void

    .line 15
    :catchall_e
    move-exception v0

    .line 16
    monitor-exit p0

    .line 17
    throw v0
    .line 18
    .line 19
    .line 20
    .line 21
.end method
