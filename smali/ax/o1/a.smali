.class public final Lax/o1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lax/T0/i$e;


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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

.method private a(Lax/T0/i$d;Z)Z
    .registers 7

    .line 1
    iget v0, p1, Lax/T0/i$d;->a:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eq v0, v1, :cond_29

    .line 6
    .line 7
    const/16 v1, 0xf

    .line 8
    .line 9
    if-ne v0, v1, :cond_b

    .line 10
    .line 11
    goto :goto_29

    .line 12
    :cond_b
    const/4 v1, 0x3

    .line 13
    const/4 v3, 0x0

    .line 14
    if-ne v0, v1, :cond_12

    .line 15
    .line 16
    if-nez p2, :cond_12

    .line 17
    .line 18
    return v3

    .line 19
    :cond_12
    const/4 p2, 0x6

    .line 20
    if-eq v0, p2, :cond_17

    .line 21
    .line 22
    if-ne v0, v1, :cond_28

    .line 23
    .line 24
    :cond_17
    iget-object p2, p0, Lax/o1/a;->a:Lax/T0/i$e;

    .line 25
    .line 26
    if-eqz p2, :cond_28

    .line 27
    .line 28
    invoke-static {p2, p1}, Lax/T0/i$b;->b(Lax/T0/i$e;Lax/T0/i$d;)Lax/T0/i$b;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    if-eqz p1, :cond_28

    .line 33
    .line 34
    invoke-virtual {p1}, Lax/T0/i$b;->a()Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-nez p1, :cond_28

    .line 39
    .line 40
    return v2

    .line 41
    :cond_28
    return v3

    .line 42
    :cond_29
    :goto_29
    return v2
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
.end method

.method private e(Ljava/util/List;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/T0/i$d;",
            ">;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_21

    .line 7
    .line 8
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lax/T0/i$d;

    .line 13
    .line 14
    iget v1, v1, Lax/T0/i$d;->a:I

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    if-ne v1, v2, :cond_1e

    .line 18
    .line 19
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lax/T0/i$d;

    .line 24
    .line 25
    invoke-static {v1}, Lax/T0/i$e;->a(Lax/T0/i$d;)Lax/T0/i$e;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iput-object v1, p0, Lax/o1/a;->a:Lax/T0/i$e;

    .line 30
    .line 31
    :cond_1e
    add-int/lit8 v0, v0, 0x1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_21
    return-void
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


# virtual methods
.method public b(Ljava/nio/ByteBuffer;)V
    .registers 2

    .line 1
    invoke-static {p1}, Lax/T0/i;->e(Ljava/nio/ByteBuffer;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-direct {p0, p1}, Lax/o1/a;->e(Ljava/util/List;)V

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

.method public c()V
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lax/o1/a;->a:Lax/T0/i$e;

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

.method public d(Ljava/nio/ByteBuffer;Z)I
    .registers 9

    .line 1
    invoke-static {p1}, Lax/T0/i;->e(Ljava/nio/ByteBuffer;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, v0}, Lax/o1/a;->e(Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x1

    .line 13
    sub-int/2addr v1, v2

    .line 14
    const/4 v3, 0x0

    .line 15
    :goto_e
    if-ltz v1, :cond_37

    .line 16
    .line 17
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    check-cast v4, Lax/T0/i$d;

    .line 22
    .line 23
    invoke-direct {p0, v4, p2}, Lax/o1/a;->a(Lax/T0/i$d;Z)Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-eqz v4, :cond_37

    .line 28
    .line 29
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    check-cast v4, Lax/T0/i$d;

    .line 34
    .line 35
    iget v4, v4, Lax/T0/i$d;->a:I

    .line 36
    .line 37
    const/4 v5, 0x6

    .line 38
    if-eq v4, v5, :cond_32

    .line 39
    .line 40
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    check-cast v4, Lax/T0/i$d;

    .line 45
    .line 46
    iget v4, v4, Lax/T0/i$d;->a:I

    .line 47
    .line 48
    const/4 v5, 0x3

    .line 49
    if-ne v4, v5, :cond_34

    .line 50
    .line 51
    :cond_32
    add-int/lit8 v3, v3, 0x1

    .line 52
    .line 53
    :cond_34
    add-int/lit8 v1, v1, -0x1

    .line 54
    .line 55
    goto :goto_e

    .line 56
    :cond_37
    if-gt v3, v2, :cond_54

    .line 57
    .line 58
    add-int/lit8 p2, v1, 0x1

    .line 59
    .line 60
    const/16 v2, 0x8

    .line 61
    .line 62
    if-lt p2, v2, :cond_40

    .line 63
    .line 64
    goto :goto_54

    .line 65
    :cond_40
    if-ltz v1, :cond_4f

    .line 66
    .line 67
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    check-cast p1, Lax/T0/i$d;

    .line 72
    .line 73
    iget-object p1, p1, Lax/T0/i$d;->b:Ljava/nio/ByteBuffer;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    return p1

    .line 80
    :cond_4f
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    return p1

    .line 85
    :cond_54
    :goto_54
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    return p1
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
