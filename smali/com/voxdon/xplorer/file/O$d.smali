.class Lcom/voxdon/xplorer/file/O$d;
.super Lax/l3/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/file/O;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private final a:Z

.field private final b:[B

.field private c:I

.field private d:J

.field private final e:Lax/s9/d;


# direct methods
.method constructor <init>(Lax/s9/d;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Lax/l3/a;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/voxdon/xplorer/file/O$d;->a:Z

    .line 6
    .line 7
    const/16 v0, 0x1000

    .line 8
    .line 9
    new-array v0, v0, [B

    .line 10
    .line 11
    iput-object v0, p0, Lcom/voxdon/xplorer/file/O$d;->b:[B

    .line 12
    .line 13
    const/4 v0, -0x1

    .line 14
    iput v0, p0, Lcom/voxdon/xplorer/file/O$d;->c:I

    .line 15
    .line 16
    const-wide/16 v0, -0x1

    .line 17
    .line 18
    iput-wide v0, p0, Lcom/voxdon/xplorer/file/O$d;->d:J

    .line 19
    .line 20
    iput-object p1, p0, Lcom/voxdon/xplorer/file/O$d;->e:Lax/s9/d;

    .line 21
    .line 22
    return-void
.end method

.method private f(J[BII)I
    .registers 8

    .line 1
    iget-wide v0, p0, Lcom/voxdon/xplorer/file/O$d;->d:J

    .line 2
    .line 3
    sub-long/2addr p1, v0

    .line 4
    long-to-int p2, p1

    .line 5
    iget p1, p0, Lcom/voxdon/xplorer/file/O$d;->c:I

    .line 6
    .line 7
    sub-int/2addr p1, p2

    .line 8
    if-le p5, p1, :cond_a

    .line 9
    .line 10
    move p5, p1

    .line 11
    :cond_a
    iget-object p1, p0, Lcom/voxdon/xplorer/file/O$d;->b:[B

    .line 12
    .line 13
    invoke-static {p1, p2, p3, p4, p5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 14
    .line 15
    .line 16
    return p5
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

.method private g(JI)Z
    .registers 8

    .line 1
    iget-wide v0, p0, Lcom/voxdon/xplorer/file/O$d;->d:J

    .line 2
    .line 3
    cmp-long v2, p1, v0

    .line 4
    .line 5
    if-ltz v2, :cond_12

    .line 6
    .line 7
    int-to-long v2, p3

    .line 8
    add-long/2addr p1, v2

    .line 9
    iget p3, p0, Lcom/voxdon/xplorer/file/O$d;->c:I

    .line 10
    .line 11
    int-to-long v2, p3

    .line 12
    add-long/2addr v0, v2

    .line 13
    cmp-long p3, p1, v0

    .line 14
    .line 15
    if-gtz p3, :cond_12

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_12
    const/4 p1, 0x0

    .line 20
    return p1
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

.method private h(I)Z
    .registers 3

    .line 1
    const/16 v0, 0x800

    if-gt p1, v0, :cond_6

    const/4 p1, 0x1

    return p1

    :cond_6
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public a()V
    .registers 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/system/ErrnoException;
        }
    .end annotation

    .line 1
    return-void
.end method

.method public b()J
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/system/ErrnoException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/O$d;->e:Lax/s9/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/s9/b;->q()Lax/N8/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lax/N8/c;->b()Lax/N8/y;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lax/N8/y;->a()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    return-wide v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public c(J[BII)I
    .registers 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/system/ErrnoException;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2, p5}, Lcom/voxdon/xplorer/file/O$d;->g(JI)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_c

    .line 6
    .line 7
    invoke-direct/range {p0 .. p5}, Lcom/voxdon/xplorer/file/O$d;->f(J[BII)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    move-object p2, p0

    .line 12
    return p1

    .line 13
    :cond_c
    move-wide v2, p1

    .line 14
    move-object p2, p0

    .line 15
    :try_start_e
    invoke-direct {p0, p5}, Lcom/voxdon/xplorer/file/O$d;->h(I)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_33

    .line 20
    .line 21
    iget-object v0, p2, Lcom/voxdon/xplorer/file/O$d;->e:Lax/s9/d;

    .line 22
    .line 23
    iget-object v1, p2, Lcom/voxdon/xplorer/file/O$d;->b:[B

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    const/16 v5, 0x1000

    .line 27
    .line 28
    invoke-virtual/range {v0 .. v5}, Lax/s9/d;->L0([BJII)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-gez p1, :cond_22

    .line 33
    .line 34
    return p1

    .line 35
    :cond_22
    iput p1, p2, Lcom/voxdon/xplorer/file/O$d;->c:I

    .line 36
    .line 37
    iput-wide v2, p2, Lcom/voxdon/xplorer/file/O$d;->d:J
    :try_end_26
    .catch Lax/k9/d; {:try_start_e .. :try_end_26} :catch_31

    .line 38
    .line 39
    move-wide p1, v2

    .line 40
    :try_start_27
    invoke-direct/range {p0 .. p5}, Lcom/voxdon/xplorer/file/O$d;->f(J[BII)I

    .line 41
    .line 42
    .line 43
    move-result p1
    :try_end_2b
    .catch Lax/k9/d; {:try_start_27 .. :try_end_2b} :catch_2d

    .line 44
    move-object p2, p0

    .line 45
    return p1

    .line 46
    :catch_2d
    move-exception v0

    .line 47
    move-object p2, p0

    .line 48
    :goto_2f
    move-object p1, v0

    .line 49
    goto :goto_73

    .line 50
    :catch_31
    move-exception v0

    .line 51
    goto :goto_2f

    .line 52
    :cond_33
    move-object v1, p3

    .line 53
    move p1, p4

    .line 54
    move-wide p3, v2

    .line 55
    const/high16 v6, 0x40000

    .line 56
    .line 57
    if-le p5, v6, :cond_69

    .line 58
    .line 59
    const/4 v0, 0x0

    .line 60
    const/4 v7, 0x0

    .line 61
    :goto_3c
    if-lez p5, :cond_68

    .line 62
    .line 63
    :try_start_3e
    invoke-static {p5, v6}, Ljava/lang/Math;->min(II)I

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    iget-object v0, p2, Lcom/voxdon/xplorer/file/O$d;->e:Lax/s9/d;

    .line 68
    .line 69
    int-to-long v2, v7

    .line 70
    add-long/2addr v2, p3

    .line 71
    add-int v4, p1, v7

    .line 72
    .line 73
    invoke-virtual/range {v0 .. v5}, Lax/s9/d;->L0([BJII)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-gez v0, :cond_51

    .line 78
    .line 79
    if-nez v7, :cond_68

    .line 80
    .line 81
    return v0

    .line 82
    :cond_51
    if-nez v0, :cond_65

    .line 83
    .line 84
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    const-string p3, "SMB2 FILE READ LEN 0"

    .line 93
    .line 94
    invoke-virtual {p1, p3}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 99
    .line 100
    .line 101
    return v7

    .line 102
    :cond_65
    add-int/2addr v7, v0

    .line 103
    sub-int/2addr p5, v0

    .line 104
    goto :goto_3c

    .line 105
    :cond_68
    return v7

    .line 106
    :cond_69
    iget-object v0, p2, Lcom/voxdon/xplorer/file/O$d;->e:Lax/s9/d;

    .line 107
    .line 108
    move v4, p1

    .line 109
    move-wide v2, p3

    .line 110
    move v5, p5

    .line 111
    invoke-virtual/range {v0 .. v5}, Lax/s9/d;->L0([BJII)I

    .line 112
    .line 113
    .line 114
    move-result p1
    :try_end_72
    .catch Lax/k9/d; {:try_start_3e .. :try_end_72} :catch_31

    .line 115
    return p1

    .line 116
    :goto_73
    invoke-static {p1}, Lcom/voxdon/xplorer/file/O;->g(Ljava/lang/Exception;)Lax/b3/j;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    const-string p3, "onRead"

    .line 121
    .line 122
    invoke-static {p1, p3}, Lcom/voxdon/xplorer/provider/a;->a(Lax/b3/j;Ljava/lang/String;)Landroid/system/ErrnoException;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    throw p1
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

.method public d()V
    .registers 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/voxdon/xplorer/file/O$d;->e:Lax/s9/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/s9/g;->close()V
    :try_end_5
    .catch Lax/k9/d; {:try_start_0 .. :try_end_5} :catch_6

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catch_6
    move-exception v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 9
    .line 10
    .line 11
    return-void
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

.method public e(J[BII)J
    .registers 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/system/ErrnoException;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/voxdon/xplorer/file/O$d;->e:Lax/s9/d;

    .line 2
    .line 3
    move-wide v2, p1

    .line 4
    move-object v1, p3

    .line 5
    move v4, p4

    .line 6
    move v5, p5

    .line 7
    invoke-virtual/range {v0 .. v5}, Lax/s9/d;->T0([BJII)J

    .line 8
    .line 9
    .line 10
    move-result-wide p1
    :try_end_a
    .catch Lax/k9/d; {:try_start_0 .. :try_end_a} :catch_b

    .line 11
    return-wide p1

    .line 12
    :catch_b
    move-exception v0

    .line 13
    move-object p1, v0

    .line 14
    invoke-static {p1}, Lcom/voxdon/xplorer/file/O;->g(Ljava/lang/Exception;)Lax/b3/j;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const-string p2, "onWrite"

    .line 19
    .line 20
    invoke-static {p1, p2}, Lcom/voxdon/xplorer/provider/a;->a(Lax/b3/j;Ljava/lang/String;)Landroid/system/ErrnoException;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    throw p1
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
