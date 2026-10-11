.class Lax/y0/a$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/y0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "f"
.end annotation


# instance fields
.field public final a:J

.field public final b:J


# direct methods
.method private constructor <init>(JJ)V
    .registers 8

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    cmp-long v2, p3, v0

    if-nez v2, :cond_10

    .line 3
    iput-wide v0, p0, Lax/y0/a$f;->a:J

    const-wide/16 p1, 0x1

    .line 4
    iput-wide p1, p0, Lax/y0/a$f;->b:J

    return-void

    .line 5
    :cond_10
    iput-wide p1, p0, Lax/y0/a$f;->a:J

    .line 6
    iput-wide p3, p0, Lax/y0/a$f;->b:J

    return-void
.end method

.method synthetic constructor <init>(JJLax/y0/a$a;)V
    .registers 6

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lax/y0/a$f;-><init>(JJ)V

    return-void
.end method

.method public static b(D)Lax/y0/a$f;
    .registers 24

    .line 1
    const-wide/high16 v0, 0x43e0000000000000L    # 9.223372036854776E18

    .line 2
    .line 3
    const-wide/16 v4, 0x1

    .line 4
    .line 5
    cmpl-double v6, p0, v0

    .line 6
    .line 7
    if-gez v6, :cond_e

    .line 8
    .line 9
    const-wide/high16 v0, -0x3c20000000000000L    # -9.223372036854776E18

    .line 10
    .line 11
    cmpg-double v6, p0, v0

    .line 12
    .line 13
    if-gtz v6, :cond_11

    .line 14
    .line 15
    :cond_e
    const-wide/16 v16, 0x0

    .line 16
    .line 17
    goto :goto_57

    .line 18
    :cond_11
    invoke-static/range {p0 .. p1}, Ljava/lang/Math;->abs(D)D

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    const-wide v6, 0x3e45798ee2308c3aL    # 1.0E-8

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    mul-double v6, v6, v0

    .line 28
    .line 29
    const-wide/16 v8, 0x0

    .line 30
    .line 31
    move-wide v14, v0

    .line 32
    move-wide v10, v4

    .line 33
    move-wide v12, v8

    .line 34
    :goto_21
    const-wide/high16 v16, 0x3ff0000000000000L    # 1.0

    .line 35
    .line 36
    rem-double v18, v14, v16

    .line 37
    .line 38
    sub-double v14, v14, v18

    .line 39
    .line 40
    double-to-long v14, v14

    .line 41
    mul-long v20, v14, v4

    .line 42
    .line 43
    add-long v12, v20, v12

    .line 44
    .line 45
    mul-long v14, v14, v8

    .line 46
    .line 47
    add-long/2addr v14, v10

    .line 48
    div-double v10, v16, v18

    .line 49
    .line 50
    const-wide/16 v16, 0x0

    .line 51
    .line 52
    long-to-double v2, v12

    .line 53
    move-wide/from16 v18, v0

    .line 54
    .line 55
    long-to-double v0, v14

    .line 56
    div-double/2addr v2, v0

    .line 57
    sub-double v0, v18, v2

    .line 58
    .line 59
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    .line 60
    .line 61
    .line 62
    move-result-wide v0

    .line 63
    cmpl-double v2, v0, v6

    .line 64
    .line 65
    if-gtz v2, :cond_4d

    .line 66
    .line 67
    new-instance v0, Lax/y0/a$f;

    .line 68
    .line 69
    cmpg-double v1, p0, v16

    .line 70
    .line 71
    if-gez v1, :cond_49

    .line 72
    .line 73
    neg-long v12, v12

    .line 74
    :cond_49
    invoke-direct {v0, v12, v13, v14, v15}, Lax/y0/a$f;-><init>(JJ)V

    .line 75
    .line 76
    .line 77
    return-object v0

    .line 78
    :cond_4d
    move-wide v0, v12

    .line 79
    move-wide v12, v4

    .line 80
    move-wide v4, v0

    .line 81
    move-wide v0, v10

    .line 82
    move-wide v10, v8

    .line 83
    move-wide v8, v14

    .line 84
    move-wide v14, v0

    .line 85
    move-wide/from16 v0, v18

    .line 86
    .line 87
    goto :goto_21

    .line 88
    :goto_57
    new-instance v0, Lax/y0/a$f;

    .line 89
    .line 90
    cmpl-double v1, p0, v16

    .line 91
    .line 92
    if-lez v1, :cond_63

    .line 93
    .line 94
    const-wide v1, 0x7fffffffffffffffL

    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    goto :goto_65

    .line 100
    :cond_63
    const-wide/high16 v1, -0x8000000000000000L

    .line 101
    .line 102
    :goto_65
    invoke-direct {v0, v1, v2, v4, v5}, Lax/y0/a$f;-><init>(JJ)V

    .line 103
    .line 104
    .line 105
    return-object v0
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
.end method


# virtual methods
.method public a()D
    .registers 5

    .line 1
    iget-wide v0, p0, Lax/y0/a$f;->a:J

    .line 2
    .line 3
    long-to-double v0, v0

    .line 4
    iget-wide v2, p0, Lax/y0/a$f;->b:J

    .line 5
    .line 6
    long-to-double v2, v2

    .line 7
    div-double/2addr v0, v2

    .line 8
    return-wide v0
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

.method public toString()Ljava/lang/String;
    .registers 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-wide v1, p0, Lax/y0/a$f;->a:J

    .line 7
    .line 8
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, "/"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget-wide v1, p0, Lax/y0/a$f;->b:J

    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
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
.end method
