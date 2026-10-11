.class public Lax/n4/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lax/n4/d;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final b:Lax/n4/d;

.field private static final c:[C


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Lax/n4/d;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/n4/d;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/n4/d;->a:Lax/n4/d;

    .line 7
    .line 8
    new-instance v0, Lax/n4/d;

    .line 9
    .line 10
    invoke-direct {v0}, Lax/n4/d;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lax/n4/d;->b:Lax/n4/d;

    .line 14
    .line 15
    const/4 v0, 0x2

    .line 16
    new-array v0, v0, [C

    .line 17
    .line 18
    fill-array-data v0, :array_18

    .line 19
    .line 20
    .line 21
    sput-object v0, Lax/n4/d;->c:[C

    .line 22
    .line 23
    return-void

    .line 24
    nop

    .line 25
    :array_18
    .array-data 2
        0x3bs
        0x2cs
    .end array-data
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

.method private static c(C[C)Z
    .registers 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_10

    .line 3
    .line 4
    array-length v1, p1

    .line 5
    const/4 v2, 0x0

    .line 6
    :goto_5
    if-ge v2, v1, :cond_10

    .line 7
    .line 8
    aget-char v3, p1, v2

    .line 9
    .line 10
    if-ne p0, v3, :cond_d

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    return p0

    .line 14
    :cond_d
    add-int/lit8 v2, v2, 0x1

    .line 15
    .line 16
    goto :goto_5

    .line 17
    :cond_10
    return v0
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


# virtual methods
.method protected a(Ljava/lang/String;Ljava/lang/String;[Lax/n4/k;)Lax/n4/h;
    .registers 5

    .line 1
    new-instance v0, Lax/n4/b;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3}, Lax/n4/b;-><init>(Ljava/lang/String;Ljava/lang/String;[Lax/n4/k;)V

    .line 4
    .line 5
    .line 6
    return-object v0
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

.method protected b(Ljava/lang/String;Ljava/lang/String;)Lax/n4/k;
    .registers 4

    .line 1
    new-instance v0, Lax/n4/e;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lax/n4/e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object v0
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

.method public d(Lax/n4/f;Lax/n4/l;)[Lax/n4/h;
    .registers 6

    .line 1
    const-string v0, "Char array buffer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/n4/a;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const-string v0, "Parser cursor"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lax/n4/a;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    :cond_f
    :goto_f
    invoke-virtual {p2}, Lax/n4/l;->a()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_22

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    new-array p1, p1, [Lax/n4/h;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, [Lax/n4/h;

    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_22
    invoke-virtual {p0, p1, p2}, Lax/n4/d;->e(Lax/n4/f;Lax/n4/l;)Lax/n4/h;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-interface {v1}, Lax/n4/h;->getName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-nez v2, :cond_36

    .line 48
    .line 49
    invoke-interface {v1}, Lax/n4/h;->getValue()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    if-eqz v2, :cond_f

    .line 54
    .line 55
    :cond_36
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    goto :goto_f
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

.method public e(Lax/n4/f;Lax/n4/l;)Lax/n4/h;
    .registers 6

    .line 1
    const-string v0, "Char array buffer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/n4/a;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const-string v0, "Parser cursor"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lax/n4/a;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, p2}, Lax/n4/d;->f(Lax/n4/f;Lax/n4/l;)Lax/n4/k;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p2}, Lax/n4/l;->a()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_27

    .line 20
    .line 21
    invoke-virtual {p2}, Lax/n4/l;->b()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    add-int/lit8 v1, v1, -0x1

    .line 26
    .line 27
    invoke-virtual {p1, v1}, Lax/n4/f;->b(I)C

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    const/16 v2, 0x2c

    .line 32
    .line 33
    if-eq v1, v2, :cond_27

    .line 34
    .line 35
    invoke-virtual {p0, p1, p2}, Lax/n4/d;->h(Lax/n4/f;Lax/n4/l;)[Lax/n4/k;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    goto :goto_28

    .line 40
    :cond_27
    const/4 p1, 0x0

    .line 41
    :goto_28
    invoke-interface {v0}, Lax/n4/k;->getName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-interface {v0}, Lax/n4/k;->getValue()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {p0, p2, v0, p1}, Lax/n4/d;->a(Ljava/lang/String;Ljava/lang/String;[Lax/n4/k;)Lax/n4/h;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    return-object p1
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

.method public f(Lax/n4/f;Lax/n4/l;)Lax/n4/k;
    .registers 4

    .line 1
    sget-object v0, Lax/n4/d;->c:[C

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, v0}, Lax/n4/d;->g(Lax/n4/f;Lax/n4/l;[C)Lax/n4/k;

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

.method public g(Lax/n4/f;Lax/n4/l;[C)Lax/n4/k;
    .registers 16

    .line 1
    const-string v0, "Char array buffer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/n4/a;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const-string v0, "Parser cursor"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lax/n4/a;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Lax/n4/l;->b()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p2}, Lax/n4/l;->b()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {p2}, Lax/n4/l;->c()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    :goto_16
    const/4 v3, 0x1

    .line 24
    const/4 v4, 0x0

    .line 25
    if-ge v0, v2, :cond_2e

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Lax/n4/f;->b(I)C

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    const/16 v6, 0x3d

    .line 32
    .line 33
    if-ne v5, v6, :cond_23

    .line 34
    .line 35
    goto :goto_2e

    .line 36
    :cond_23
    invoke-static {v5, p3}, Lax/n4/d;->c(C[C)Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-eqz v5, :cond_2b

    .line 41
    .line 42
    const/4 v5, 0x1

    .line 43
    goto :goto_2f

    .line 44
    :cond_2b
    add-int/lit8 v0, v0, 0x1

    .line 45
    .line 46
    goto :goto_16

    .line 47
    :cond_2e
    :goto_2e
    const/4 v5, 0x0

    .line 48
    :goto_2f
    if-ne v0, v2, :cond_37

    .line 49
    .line 50
    invoke-virtual {p1, v1, v2}, Lax/n4/f;->e(II)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    const/4 v5, 0x1

    .line 55
    goto :goto_3d

    .line 56
    :cond_37
    invoke-virtual {p1, v1, v0}, Lax/n4/f;->e(II)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    add-int/lit8 v0, v0, 0x1

    .line 61
    .line 62
    :goto_3d
    if-eqz v5, :cond_48

    .line 63
    .line 64
    invoke-virtual {p2, v0}, Lax/n4/l;->d(I)V

    .line 65
    .line 66
    .line 67
    const/4 p1, 0x0

    .line 68
    invoke-virtual {p0, v1, p1}, Lax/n4/d;->b(Ljava/lang/String;Ljava/lang/String;)Lax/n4/k;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    return-object p1

    .line 73
    :cond_48
    move v6, v0

    .line 74
    const/4 v7, 0x0

    .line 75
    const/4 v8, 0x0

    .line 76
    :goto_4b
    const/16 v9, 0x22

    .line 77
    .line 78
    if-ge v6, v2, :cond_72

    .line 79
    .line 80
    invoke-virtual {p1, v6}, Lax/n4/f;->b(I)C

    .line 81
    .line 82
    .line 83
    move-result v10

    .line 84
    if-ne v10, v9, :cond_59

    .line 85
    .line 86
    if-nez v7, :cond_59

    .line 87
    .line 88
    xor-int/lit8 v8, v8, 0x1

    .line 89
    .line 90
    :cond_59
    if-nez v8, :cond_64

    .line 91
    .line 92
    if-nez v7, :cond_64

    .line 93
    .line 94
    invoke-static {v10, p3}, Lax/n4/d;->c(C[C)Z

    .line 95
    .line 96
    .line 97
    move-result v11

    .line 98
    if-eqz v11, :cond_64

    .line 99
    .line 100
    goto :goto_73

    .line 101
    :cond_64
    if-eqz v7, :cond_68

    .line 102
    .line 103
    :cond_66
    const/4 v7, 0x0

    .line 104
    goto :goto_6f

    .line 105
    :cond_68
    if-eqz v8, :cond_66

    .line 106
    .line 107
    const/16 v7, 0x5c

    .line 108
    .line 109
    if-ne v10, v7, :cond_66

    .line 110
    .line 111
    const/4 v7, 0x1

    .line 112
    :goto_6f
    add-int/lit8 v6, v6, 0x1

    .line 113
    .line 114
    goto :goto_4b

    .line 115
    :cond_72
    move v3, v5

    .line 116
    :goto_73
    if-ge v0, v6, :cond_82

    .line 117
    .line 118
    invoke-virtual {p1, v0}, Lax/n4/f;->b(I)C

    .line 119
    .line 120
    .line 121
    move-result p3

    .line 122
    invoke-static {p3}, Lax/n4/g;->a(C)Z

    .line 123
    .line 124
    .line 125
    move-result p3

    .line 126
    if-eqz p3, :cond_82

    .line 127
    .line 128
    add-int/lit8 v0, v0, 0x1

    .line 129
    .line 130
    goto :goto_73

    .line 131
    :cond_82
    move p3, v6

    .line 132
    :goto_83
    if-le p3, v0, :cond_94

    .line 133
    .line 134
    add-int/lit8 v2, p3, -0x1

    .line 135
    .line 136
    invoke-virtual {p1, v2}, Lax/n4/f;->b(I)C

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    invoke-static {v2}, Lax/n4/g;->a(C)Z

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    if-eqz v2, :cond_94

    .line 145
    .line 146
    add-int/lit8 p3, p3, -0x1

    .line 147
    .line 148
    goto :goto_83

    .line 149
    :cond_94
    sub-int v2, p3, v0

    .line 150
    .line 151
    const/4 v4, 0x2

    .line 152
    if-lt v2, v4, :cond_ab

    .line 153
    .line 154
    invoke-virtual {p1, v0}, Lax/n4/f;->b(I)C

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    if-ne v2, v9, :cond_ab

    .line 159
    .line 160
    add-int/lit8 v2, p3, -0x1

    .line 161
    .line 162
    invoke-virtual {p1, v2}, Lax/n4/f;->b(I)C

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    if-ne v2, v9, :cond_ab

    .line 167
    .line 168
    add-int/lit8 v0, v0, 0x1

    .line 169
    .line 170
    add-int/lit8 p3, p3, -0x1

    .line 171
    .line 172
    :cond_ab
    invoke-virtual {p1, v0, p3}, Lax/n4/f;->d(II)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    if-eqz v3, :cond_b3

    .line 177
    .line 178
    add-int/lit8 v6, v6, 0x1

    .line 179
    .line 180
    :cond_b3
    invoke-virtual {p2, v6}, Lax/n4/l;->d(I)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p0, v1, p1}, Lax/n4/d;->b(Ljava/lang/String;Ljava/lang/String;)Lax/n4/k;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    return-object p1
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

.method public h(Lax/n4/f;Lax/n4/l;)[Lax/n4/k;
    .registers 6

    .line 1
    const-string v0, "Char array buffer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/n4/a;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const-string v0, "Parser cursor"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lax/n4/a;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Lax/n4/l;->b()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p2}, Lax/n4/l;->c()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    :goto_12
    if-ge v0, v1, :cond_22

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Lax/n4/f;->b(I)C

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-static {v2}, Lax/n4/g;->a(C)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_1f

    .line 30
    .line 31
    goto :goto_22

    .line 32
    :cond_1f
    add-int/lit8 v0, v0, 0x1

    .line 33
    .line 34
    goto :goto_12

    .line 35
    :cond_22
    :goto_22
    invoke-virtual {p2, v0}, Lax/n4/l;->d(I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p2}, Lax/n4/l;->a()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_2f

    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    new-array p1, p1, [Lax/n4/k;

    .line 46
    .line 47
    return-object p1

    .line 48
    :cond_2f
    new-instance v0, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    :cond_34
    invoke-virtual {p2}, Lax/n4/l;->a()Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-nez v1, :cond_4f

    .line 58
    .line 59
    invoke-virtual {p0, p1, p2}, Lax/n4/d;->f(Lax/n4/f;Lax/n4/l;)Lax/n4/k;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    invoke-virtual {p2}, Lax/n4/l;->b()I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    add-int/lit8 v1, v1, -0x1

    .line 71
    .line 72
    invoke-virtual {p1, v1}, Lax/n4/f;->b(I)C

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    const/16 v2, 0x2c

    .line 77
    .line 78
    if-ne v1, v2, :cond_34

    .line 79
    .line 80
    :cond_4f
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    new-array p1, p1, [Lax/n4/k;

    .line 85
    .line 86
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    check-cast p1, [Lax/n4/k;

    .line 91
    .line 92
    return-object p1
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
