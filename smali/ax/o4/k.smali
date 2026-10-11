.class Lax/o4/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/o4/k$i;,
        Lax/o4/k$f;,
        Lax/o4/k$j;,
        Lax/o4/k$b;,
        Lax/o4/k$e;,
        Lax/o4/k$d;,
        Lax/o4/k$c;,
        Lax/o4/k$g;,
        Lax/o4/k$h;
    }
.end annotation


# instance fields
.field private a:Lax/o4/g;

.field private b:Lax/o4/g$J;

.field private c:Z

.field private d:I

.field private e:Z

.field private f:Lax/o4/k$h;

.field private g:Ljava/lang/StringBuilder;

.field private h:Z

.field private i:Ljava/lang/StringBuilder;


# direct methods
.method constructor <init>()V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lax/o4/k;->a:Lax/o4/g;

    .line 6
    .line 7
    iput-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    iput-boolean v1, p0, Lax/o4/k;->c:Z

    .line 11
    .line 12
    iput-boolean v1, p0, Lax/o4/k;->e:Z

    .line 13
    .line 14
    iput-object v0, p0, Lax/o4/k;->f:Lax/o4/k$h;

    .line 15
    .line 16
    iput-object v0, p0, Lax/o4/k;->g:Ljava/lang/StringBuilder;

    .line 17
    .line 18
    iput-boolean v1, p0, Lax/o4/k;->h:Z

    .line 19
    .line 20
    iput-object v0, p0, Lax/o4/k;->i:Ljava/lang/StringBuilder;

    .line 21
    .line 22
    return-void
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
.end method

.method private A(Lax/o4/g$d;Lorg/xml/sax/Attributes;)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_1
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_48

    .line 7
    .line 8
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sget-object v2, Lax/o4/k$a;->b:[I

    .line 17
    .line 18
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-static {v3}, Lax/o4/k$g;->d(Ljava/lang/String;)Lax/o4/k$g;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    aget v2, v2, v3

    .line 31
    .line 32
    packed-switch v2, :pswitch_data_4a

    .line 33
    .line 34
    .line 35
    goto :goto_45

    .line 36
    :pswitch_23
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iput-object v1, p1, Lax/o4/g$d;->q:Lax/o4/g$p;

    .line 41
    .line 42
    invoke-virtual {v1}, Lax/o4/g$p;->j()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-nez v1, :cond_30

    .line 47
    .line 48
    goto :goto_45

    .line 49
    :cond_30
    new-instance p1, Lax/o4/j;

    .line 50
    .line 51
    const-string p2, "Invalid <circle> element. r cannot be negative"

    .line 52
    .line 53
    invoke-direct {p1, p2}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1

    .line 57
    :pswitch_38
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    iput-object v1, p1, Lax/o4/g$d;->p:Lax/o4/g$p;

    .line 62
    .line 63
    goto :goto_45

    .line 64
    :pswitch_3f
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    iput-object v1, p1, Lax/o4/g$d;->o:Lax/o4/g$p;

    .line 69
    .line 70
    :goto_45
    add-int/lit8 v0, v0, 0x1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_48
    return-void

    .line 74
    nop

    .line 75
    :pswitch_data_4a
    .packed-switch 0xc
        :pswitch_3f
        :pswitch_38
        :pswitch_23
    .end packed-switch
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

.method private static A0(Ljava/lang/String;)Ljava/util/Set;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lax/o4/k$i;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lax/o4/k$i;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p0, Ljava/util/HashSet;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 9
    .line 10
    .line 11
    :goto_a
    invoke-virtual {v0}, Lax/o4/k$i;->h()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_1b

    .line 16
    .line 17
    invoke-virtual {v0}, Lax/o4/k$i;->r()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {p0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lax/o4/k$i;->A()V

    .line 25
    .line 26
    .line 27
    goto :goto_a

    .line 28
    :cond_1b
    return-object p0
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
.end method

.method private B(Lax/o4/g$e;Lorg/xml/sax/Attributes;)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_1
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_48

    .line 7
    .line 8
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sget-object v2, Lax/o4/k$a;->b:[I

    .line 17
    .line 18
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-static {v3}, Lax/o4/k$g;->d(Ljava/lang/String;)Lax/o4/k$g;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    aget v2, v2, v3

    .line 31
    .line 32
    const/16 v3, 0x26

    .line 33
    .line 34
    if-eq v2, v3, :cond_24

    .line 35
    .line 36
    goto :goto_3d

    .line 37
    :cond_24
    const-string v2, "objectBoundingBox"

    .line 38
    .line 39
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_31

    .line 44
    .line 45
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 46
    .line 47
    iput-object v1, p1, Lax/o4/g$e;->p:Ljava/lang/Boolean;

    .line 48
    .line 49
    goto :goto_3d

    .line 50
    :cond_31
    const-string v2, "userSpaceOnUse"

    .line 51
    .line 52
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_40

    .line 57
    .line 58
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 59
    .line 60
    iput-object v1, p1, Lax/o4/g$e;->p:Ljava/lang/Boolean;

    .line 61
    .line 62
    :goto_3d
    add-int/lit8 v0, v0, 0x1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_40
    new-instance p1, Lax/o4/j;

    .line 66
    .line 67
    const-string p2, "Invalid value for attribute clipPathUnits"

    .line 68
    .line 69
    invoke-direct {p1, p2}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw p1

    .line 73
    :cond_48
    return-void
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

.method private static B0(Ljava/lang/String;)[Lax/o4/g$p;
    .registers 6

    .line 1
    new-instance v0, Lax/o4/k$i;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lax/o4/k$i;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lax/o4/k$i;->A()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lax/o4/k$i;->h()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz p0, :cond_10

    .line 15
    .line 16
    return-object v1

    .line 17
    :cond_10
    invoke-virtual {v0}, Lax/o4/k$i;->p()Lax/o4/g$p;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    if-nez p0, :cond_17

    .line 22
    .line 23
    return-object v1

    .line 24
    :cond_17
    invoke-virtual {p0}, Lax/o4/g$p;->j()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_1e

    .line 29
    .line 30
    return-object v1

    .line 31
    :cond_1e
    invoke-virtual {p0}, Lax/o4/g$p;->b()F

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    new-instance v3, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-interface {v3, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    :goto_2a
    invoke-virtual {v0}, Lax/o4/k$i;->h()Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-nez p0, :cond_4a

    .line 48
    .line 49
    invoke-virtual {v0}, Lax/o4/k$i;->z()Z

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Lax/o4/k$i;->p()Lax/o4/g$p;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    if-nez p0, :cond_3a

    .line 57
    .line 58
    return-object v1

    .line 59
    :cond_3a
    invoke-virtual {p0}, Lax/o4/g$p;->j()Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_41

    .line 64
    .line 65
    return-object v1

    .line 66
    :cond_41
    invoke-interface {v3, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Lax/o4/g$p;->b()F

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    add-float/2addr v2, p0

    .line 74
    goto :goto_2a

    .line 75
    :cond_4a
    const/4 p0, 0x0

    .line 76
    cmpl-float p0, v2, p0

    .line 77
    .line 78
    if-nez p0, :cond_50

    .line 79
    .line 80
    return-object v1

    .line 81
    :cond_50
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    new-array p0, p0, [Lax/o4/g$p;

    .line 86
    .line 87
    invoke-interface {v3, p0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    check-cast p0, [Lax/o4/g$p;

    .line 92
    .line 93
    return-object p0
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
.end method

.method private C(Lax/o4/g$G;Lorg/xml/sax/Attributes;)V
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_2
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-ge v1, v2, :cond_55

    .line 8
    .line 9
    invoke-interface {p2, v1}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    sget-object v3, Lax/o4/k$a;->b:[I

    .line 18
    .line 19
    invoke-interface {p2, v1}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-static {v4}, Lax/o4/k$g;->d(Ljava/lang/String;)Lax/o4/k$g;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    aget v3, v3, v4

    .line 32
    .line 33
    packed-switch v3, :pswitch_data_56

    .line 34
    .line 35
    .line 36
    goto :goto_52

    .line 37
    :pswitch_24
    invoke-static {v2}, Lax/o4/k;->i0(Ljava/lang/String;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    new-instance v3, Ljava/util/HashSet;

    .line 42
    .line 43
    if-eqz v2, :cond_30

    .line 44
    .line 45
    invoke-direct {v3, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 46
    .line 47
    .line 48
    goto :goto_33

    .line 49
    :cond_30
    invoke-direct {v3, v0}, Ljava/util/HashSet;-><init>(I)V

    .line 50
    .line 51
    .line 52
    :goto_33
    invoke-interface {p1, v3}, Lax/o4/g$G;->e(Ljava/util/Set;)V

    .line 53
    .line 54
    .line 55
    goto :goto_52

    .line 56
    :pswitch_37
    invoke-static {v2}, Lax/o4/k;->A0(Ljava/lang/String;)Ljava/util/Set;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-interface {p1, v2}, Lax/o4/g$G;->c(Ljava/util/Set;)V

    .line 61
    .line 62
    .line 63
    goto :goto_52

    .line 64
    :pswitch_3f
    invoke-static {v2}, Lax/o4/k;->F0(Ljava/lang/String;)Ljava/util/Set;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-interface {p1, v2}, Lax/o4/g$G;->k(Ljava/util/Set;)V

    .line 69
    .line 70
    .line 71
    goto :goto_52

    .line 72
    :pswitch_47
    invoke-interface {p1, v2}, Lax/o4/g$G;->i(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    goto :goto_52

    .line 76
    :pswitch_4b
    invoke-static {v2}, Lax/o4/k;->z0(Ljava/lang/String;)Ljava/util/Set;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-interface {p1, v2}, Lax/o4/g$G;->g(Ljava/util/Set;)V

    .line 81
    .line 82
    .line 83
    :goto_52
    add-int/lit8 v1, v1, 0x1

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_55
    return-void

    .line 87
    :pswitch_data_56
    .packed-switch 0x15
        :pswitch_4b
        :pswitch_47
        :pswitch_3f
        :pswitch_37
        :pswitch_24
    .end packed-switch
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

.method private static C0(Ljava/lang/String;)Lax/o4/g$E$c;
    .registers 2

    .line 1
    const-string v0, "butt"

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_b

    .line 8
    .line 9
    sget-object p0, Lax/o4/g$E$c;->q:Lax/o4/g$E$c;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_b
    const-string v0, "round"

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_16

    .line 19
    .line 20
    sget-object p0, Lax/o4/g$E$c;->c0:Lax/o4/g$E$c;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_16
    const-string v0, "square"

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_21

    .line 30
    .line 31
    sget-object p0, Lax/o4/g$E$c;->d0:Lax/o4/g$E$c;

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_21
    const/4 p0, 0x0

    .line 35
    return-object p0
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

.method private D(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_1
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_6a

    .line 7
    .line 8
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getQName(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, "id"

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_60

    .line 19
    .line 20
    const-string v2, "xml:id"

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_1c

    .line 27
    .line 28
    goto :goto_60

    .line 29
    :cond_1c
    const-string v2, "xml:space"

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_5d

    .line 36
    .line 37
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    const-string v0, "default"

    .line 46
    .line 47
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_39

    .line 52
    .line 53
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 54
    .line 55
    iput-object p2, p1, Lax/o4/g$L;->d:Ljava/lang/Boolean;

    .line 56
    .line 57
    return-void

    .line 58
    :cond_39
    const-string v0, "preserve"

    .line 59
    .line 60
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_46

    .line 65
    .line 66
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 67
    .line 68
    iput-object p2, p1, Lax/o4/g$L;->d:Ljava/lang/Boolean;

    .line 69
    .line 70
    return-void

    .line 71
    :cond_46
    new-instance p1, Lax/o4/j;

    .line 72
    .line 73
    new-instance v0, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 76
    .line 77
    .line 78
    const-string v1, "Invalid value for \"xml:space\" attribute: "

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    invoke-direct {p1, p2}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw p1

    .line 94
    :cond_5d
    add-int/lit8 v0, v0, 0x1

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_60
    :goto_60
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    iput-object p2, p1, Lax/o4/g$L;->c:Ljava/lang/String;

    .line 106
    .line 107
    :cond_6a
    return-void
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

.method private static D0(Ljava/lang/String;)Lax/o4/g$E$d;
    .registers 2

    .line 1
    const-string v0, "miter"

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_b

    .line 8
    .line 9
    sget-object p0, Lax/o4/g$E$d;->q:Lax/o4/g$E$d;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_b
    const-string v0, "round"

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_16

    .line 19
    .line 20
    sget-object p0, Lax/o4/g$E$d;->c0:Lax/o4/g$E$d;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_16
    const-string v0, "bevel"

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_21

    .line 30
    .line 31
    sget-object p0, Lax/o4/g$E$d;->d0:Lax/o4/g$E$d;

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_21
    const/4 p0, 0x0

    .line 35
    return-object p0
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

.method private E(Lax/o4/g$i;Lorg/xml/sax/Attributes;)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_1
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_5d

    .line 7
    .line 8
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sget-object v2, Lax/o4/k$a;->b:[I

    .line 17
    .line 18
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-static {v3}, Lax/o4/k$g;->d(Ljava/lang/String;)Lax/o4/k$g;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    aget v2, v2, v3

    .line 31
    .line 32
    packed-switch v2, :pswitch_data_5e

    .line 33
    .line 34
    .line 35
    goto :goto_52

    .line 36
    :pswitch_23
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iput-object v1, p1, Lax/o4/g$i;->p:Lax/o4/g$p;

    .line 41
    .line 42
    goto :goto_52

    .line 43
    :pswitch_2a
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    iput-object v1, p1, Lax/o4/g$i;->o:Lax/o4/g$p;

    .line 48
    .line 49
    goto :goto_52

    .line 50
    :pswitch_31
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    iput-object v1, p1, Lax/o4/g$i;->r:Lax/o4/g$p;

    .line 55
    .line 56
    invoke-virtual {v1}, Lax/o4/g$p;->j()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-nez v1, :cond_3e

    .line 61
    .line 62
    goto :goto_52

    .line 63
    :cond_3e
    new-instance p1, Lax/o4/j;

    .line 64
    .line 65
    const-string p2, "Invalid <ellipse> element. ry cannot be negative"

    .line 66
    .line 67
    invoke-direct {p1, p2}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw p1

    .line 71
    :pswitch_46
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    iput-object v1, p1, Lax/o4/g$i;->q:Lax/o4/g$p;

    .line 76
    .line 77
    invoke-virtual {v1}, Lax/o4/g$p;->j()Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-nez v1, :cond_55

    .line 82
    .line 83
    :goto_52
    add-int/lit8 v0, v0, 0x1

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_55
    new-instance p1, Lax/o4/j;

    .line 87
    .line 88
    const-string p2, "Invalid <ellipse> element. rx cannot be negative"

    .line 89
    .line 90
    invoke-direct {p1, p2}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw p1

    .line 94
    :cond_5d
    return-void

    .line 95
    :pswitch_data_5e
    .packed-switch 0xa
        :pswitch_46
        :pswitch_31
        :pswitch_2a
        :pswitch_23
    .end packed-switch
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

.method private static E0(Lax/o4/g$L;Ljava/lang/String;)V
    .registers 6

    .line 1
    new-instance v0, Lax/o4/k$i;

    .line 2
    .line 3
    const-string v1, "/\\*.*?\\*/"

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {v0, p1}, Lax/o4/k$i;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_d
    :goto_d
    const/16 p1, 0x3a

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lax/o4/k$i;->s(C)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0}, Lax/o4/k$i;->A()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lax/o4/k$i;->f(C)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-nez p1, :cond_1d

    .line 28
    .line 29
    goto :goto_28

    .line 30
    :cond_1d
    invoke-virtual {v0}, Lax/o4/k$i;->A()V

    .line 31
    .line 32
    .line 33
    const/16 p1, 0x3b

    .line 34
    .line 35
    invoke-virtual {v0, p1}, Lax/o4/k$i;->u(C)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    if-nez v2, :cond_29

    .line 40
    .line 41
    :goto_28
    return-void

    .line 42
    :cond_29
    invoke-virtual {v0}, Lax/o4/k$i;->A()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lax/o4/k$i;->h()Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-nez v3, :cond_38

    .line 50
    .line 51
    invoke-virtual {v0, p1}, Lax/o4/k$i;->f(C)Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-eqz p1, :cond_d

    .line 56
    .line 57
    :cond_38
    iget-object p1, p0, Lax/o4/g$L;->f:Lax/o4/g$E;

    .line 58
    .line 59
    if-nez p1, :cond_43

    .line 60
    .line 61
    new-instance p1, Lax/o4/g$E;

    .line 62
    .line 63
    invoke-direct {p1}, Lax/o4/g$E;-><init>()V

    .line 64
    .line 65
    .line 66
    iput-object p1, p0, Lax/o4/g$L;->f:Lax/o4/g$E;

    .line 67
    .line 68
    :cond_43
    iget-object p1, p0, Lax/o4/g$L;->f:Lax/o4/g$E;

    .line 69
    .line 70
    invoke-static {p1, v1, v2}, Lax/o4/k;->S0(Lax/o4/g$E;Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Lax/o4/k$i;->A()V

    .line 74
    .line 75
    .line 76
    goto :goto_d
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

.method private F(Lax/o4/g$j;Lorg/xml/sax/Attributes;)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_1
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_90

    .line 7
    .line 8
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sget-object v2, Lax/o4/k$a;->b:[I

    .line 17
    .line 18
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-static {v3}, Lax/o4/k$g;->d(Ljava/lang/String;)Lax/o4/k$g;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    aget v2, v2, v3

    .line 31
    .line 32
    const/4 v3, 0x6

    .line 33
    if-eq v2, v3, :cond_72

    .line 34
    .line 35
    packed-switch v2, :pswitch_data_92

    .line 36
    .line 37
    .line 38
    goto :goto_8c

    .line 39
    :pswitch_26
    :try_start_26
    invoke-static {v1}, Lax/o4/g$k;->valueOf(Ljava/lang/String;)Lax/o4/g$k;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    iput-object v2, p1, Lax/o4/g$j;->k:Lax/o4/g$k;
    :try_end_2c
    .catch Ljava/lang/IllegalArgumentException; {:try_start_26 .. :try_end_2c} :catch_2d

    .line 44
    .line 45
    goto :goto_8c

    .line 46
    :catch_2d
    new-instance p1, Lax/o4/j;

    .line 47
    .line 48
    new-instance p2, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 51
    .line 52
    .line 53
    const-string v0, "Invalid spreadMethod attribute. \""

    .line 54
    .line 55
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v0, "\" is not a valid value."

    .line 62
    .line 63
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-direct {p1, p2}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p1

    .line 74
    :pswitch_49
    invoke-direct {p0, v1}, Lax/o4/k;->J0(Ljava/lang/String;)Landroid/graphics/Matrix;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    iput-object v1, p1, Lax/o4/g$j;->j:Landroid/graphics/Matrix;

    .line 79
    .line 80
    goto :goto_8c

    .line 81
    :pswitch_50
    const-string v2, "objectBoundingBox"

    .line 82
    .line 83
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-eqz v2, :cond_5d

    .line 88
    .line 89
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 90
    .line 91
    iput-object v1, p1, Lax/o4/g$j;->i:Ljava/lang/Boolean;

    .line 92
    .line 93
    goto :goto_8c

    .line 94
    :cond_5d
    const-string v2, "userSpaceOnUse"

    .line 95
    .line 96
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-eqz v1, :cond_6a

    .line 101
    .line 102
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 103
    .line 104
    iput-object v1, p1, Lax/o4/g$j;->i:Ljava/lang/Boolean;

    .line 105
    .line 106
    goto :goto_8c

    .line 107
    :cond_6a
    new-instance p1, Lax/o4/j;

    .line 108
    .line 109
    const-string p2, "Invalid value for attribute gradientUnits"

    .line 110
    .line 111
    invoke-direct {p1, p2}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw p1

    .line 115
    :cond_72
    const-string v2, ""

    .line 116
    .line 117
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    if-nez v2, :cond_8a

    .line 126
    .line 127
    const-string v2, "http://www.w3.org/1999/xlink"

    .line 128
    .line 129
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    if-eqz v2, :cond_8c

    .line 138
    .line 139
    :cond_8a
    iput-object v1, p1, Lax/o4/g$j;->l:Ljava/lang/String;

    .line 140
    .line 141
    :cond_8c
    :goto_8c
    add-int/lit8 v0, v0, 0x1

    .line 142
    .line 143
    goto/16 :goto_1

    .line 144
    .line 145
    :cond_90
    return-void

    .line 146
    nop

    .line 147
    :pswitch_data_92
    .packed-switch 0x20
        :pswitch_50
        :pswitch_49
        :pswitch_26
    .end packed-switch
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
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
.end method

.method private static F0(Ljava/lang/String;)Ljava/util/Set;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lax/o4/k$i;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lax/o4/k$i;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p0, Ljava/util/HashSet;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 9
    .line 10
    .line 11
    :goto_a
    invoke-virtual {v0}, Lax/o4/k$i;->h()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_34

    .line 16
    .line 17
    invoke-virtual {v0}, Lax/o4/k$i;->r()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const/16 v2, 0x2d

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(I)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/4 v3, -0x1

    .line 28
    if-eq v2, v3, :cond_22

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-virtual {v1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    :cond_22
    new-instance v2, Ljava/util/Locale;

    .line 36
    .line 37
    const-string v3, ""

    .line 38
    .line 39
    invoke-direct {v2, v1, v3, v3}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {p0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Lax/o4/k$i;->A()V

    .line 50
    .line 51
    .line 52
    goto :goto_a

    .line 53
    :cond_34
    return-object p0
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private G(Lax/o4/g$o;Lorg/xml/sax/Attributes;)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_1
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_8c

    .line 7
    .line 8
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sget-object v2, Lax/o4/k$a;->b:[I

    .line 17
    .line 18
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-static {v3}, Lax/o4/k$g;->d(Ljava/lang/String;)Lax/o4/k$g;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    aget v2, v2, v3

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    if-eq v2, v3, :cond_82

    .line 34
    .line 35
    const/4 v3, 0x2

    .line 36
    if-eq v2, v3, :cond_7b

    .line 37
    .line 38
    const/4 v3, 0x3

    .line 39
    if-eq v2, v3, :cond_66

    .line 40
    .line 41
    const/4 v3, 0x4

    .line 42
    if-eq v2, v3, :cond_51

    .line 43
    .line 44
    const/4 v3, 0x6

    .line 45
    if-eq v2, v3, :cond_36

    .line 46
    .line 47
    const/4 v3, 0x7

    .line 48
    if-eq v2, v3, :cond_32

    .line 49
    .line 50
    goto :goto_88

    .line 51
    :cond_32
    invoke-static {p1, v1}, Lax/o4/k;->w0(Lax/o4/g$P;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    goto :goto_88

    .line 55
    :cond_36
    const-string v2, ""

    .line 56
    .line 57
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-nez v2, :cond_4e

    .line 66
    .line 67
    const-string v2, "http://www.w3.org/1999/xlink"

    .line 68
    .line 69
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_88

    .line 78
    .line 79
    :cond_4e
    iput-object v1, p1, Lax/o4/g$o;->p:Ljava/lang/String;

    .line 80
    .line 81
    goto :goto_88

    .line 82
    :cond_51
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    iput-object v1, p1, Lax/o4/g$o;->t:Lax/o4/g$p;

    .line 87
    .line 88
    invoke-virtual {v1}, Lax/o4/g$p;->j()Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-nez v1, :cond_5e

    .line 93
    .line 94
    goto :goto_88

    .line 95
    :cond_5e
    new-instance p1, Lax/o4/j;

    .line 96
    .line 97
    const-string p2, "Invalid <use> element. height cannot be negative"

    .line 98
    .line 99
    invoke-direct {p1, p2}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw p1

    .line 103
    :cond_66
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    iput-object v1, p1, Lax/o4/g$o;->s:Lax/o4/g$p;

    .line 108
    .line 109
    invoke-virtual {v1}, Lax/o4/g$p;->j()Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-nez v1, :cond_73

    .line 114
    .line 115
    goto :goto_88

    .line 116
    :cond_73
    new-instance p1, Lax/o4/j;

    .line 117
    .line 118
    const-string p2, "Invalid <use> element. width cannot be negative"

    .line 119
    .line 120
    invoke-direct {p1, p2}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    throw p1

    .line 124
    :cond_7b
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    iput-object v1, p1, Lax/o4/g$o;->r:Lax/o4/g$p;

    .line 129
    .line 130
    goto :goto_88

    .line 131
    :cond_82
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    iput-object v1, p1, Lax/o4/g$o;->q:Lax/o4/g$p;

    .line 136
    .line 137
    :cond_88
    :goto_88
    add-int/lit8 v0, v0, 0x1

    .line 138
    .line 139
    goto/16 :goto_1

    .line 140
    .line 141
    :cond_8c
    return-void
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
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
.end method

.method private static G0(Ljava/lang/String;)Lax/o4/g$E$f;
    .registers 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sparse-switch v1, :sswitch_data_3a

    .line 10
    .line 11
    .line 12
    goto :goto_2c

    .line 13
    :sswitch_c
    const-string v1, "start"

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-nez p0, :cond_15

    .line 20
    .line 21
    goto :goto_2c

    .line 22
    :cond_15
    const/4 v0, 0x2

    .line 23
    goto :goto_2c

    .line 24
    :sswitch_17
    const-string v1, "end"

    .line 25
    .line 26
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-nez p0, :cond_20

    .line 31
    .line 32
    goto :goto_2c

    .line 33
    :cond_20
    const/4 v0, 0x1

    .line 34
    goto :goto_2c

    .line 35
    :sswitch_22
    const-string v1, "middle"

    .line 36
    .line 37
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-nez p0, :cond_2b

    .line 42
    .line 43
    goto :goto_2c

    .line 44
    :cond_2b
    const/4 v0, 0x0

    .line 45
    :goto_2c
    packed-switch v0, :pswitch_data_48

    .line 46
    .line 47
    .line 48
    const/4 p0, 0x0

    .line 49
    return-object p0

    .line 50
    :pswitch_31
    sget-object p0, Lax/o4/g$E$f;->q:Lax/o4/g$E$f;

    .line 51
    .line 52
    return-object p0

    .line 53
    :pswitch_34
    sget-object p0, Lax/o4/g$E$f;->d0:Lax/o4/g$E$f;

    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_37
    sget-object p0, Lax/o4/g$E$f;->c0:Lax/o4/g$E$f;

    .line 57
    .line 58
    return-object p0

    .line 59
    :sswitch_data_3a
    .sparse-switch
        -0x4009266b -> :sswitch_22
        0x188db -> :sswitch_17
        0x68ac462 -> :sswitch_c
    .end sparse-switch

    .line 60
    .line 61
    :pswitch_data_48
    .packed-switch 0x0
        :pswitch_37
        :pswitch_34
        :pswitch_31
    .end packed-switch
.end method

.method private H(Lax/o4/g$q;Lorg/xml/sax/Attributes;)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_1
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_41

    .line 7
    .line 8
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sget-object v2, Lax/o4/k$a;->b:[I

    .line 17
    .line 18
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-static {v3}, Lax/o4/k$g;->d(Ljava/lang/String;)Lax/o4/k$g;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    aget v2, v2, v3

    .line 31
    .line 32
    packed-switch v2, :pswitch_data_42

    .line 33
    .line 34
    .line 35
    goto :goto_3e

    .line 36
    :pswitch_23
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iput-object v1, p1, Lax/o4/g$q;->r:Lax/o4/g$p;

    .line 41
    .line 42
    goto :goto_3e

    .line 43
    :pswitch_2a
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    iput-object v1, p1, Lax/o4/g$q;->q:Lax/o4/g$p;

    .line 48
    .line 49
    goto :goto_3e

    .line 50
    :pswitch_31
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    iput-object v1, p1, Lax/o4/g$q;->p:Lax/o4/g$p;

    .line 55
    .line 56
    goto :goto_3e

    .line 57
    :pswitch_38
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    iput-object v1, p1, Lax/o4/g$q;->o:Lax/o4/g$p;

    .line 62
    .line 63
    :goto_3e
    add-int/lit8 v0, v0, 0x1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_41
    return-void

    .line 67
    :pswitch_data_42
    .packed-switch 0xf
        :pswitch_38
        :pswitch_31
        :pswitch_2a
        :pswitch_23
    .end packed-switch
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

.method private static H0(Ljava/lang/String;)Lax/o4/g$E$g;
    .registers 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sparse-switch v1, :sswitch_data_56

    .line 10
    .line 11
    .line 12
    goto :goto_42

    .line 13
    :sswitch_c
    const-string v1, "overline"

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-nez p0, :cond_15

    .line 20
    .line 21
    goto :goto_42

    .line 22
    :cond_15
    const/4 v0, 0x4

    .line 23
    goto :goto_42

    .line 24
    :sswitch_17
    const-string v1, "blink"

    .line 25
    .line 26
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-nez p0, :cond_20

    .line 31
    .line 32
    goto :goto_42

    .line 33
    :cond_20
    const/4 v0, 0x3

    .line 34
    goto :goto_42

    .line 35
    :sswitch_22
    const-string v1, "none"

    .line 36
    .line 37
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-nez p0, :cond_2b

    .line 42
    .line 43
    goto :goto_42

    .line 44
    :cond_2b
    const/4 v0, 0x2

    .line 45
    goto :goto_42

    .line 46
    :sswitch_2d
    const-string v1, "underline"

    .line 47
    .line 48
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-nez p0, :cond_36

    .line 53
    .line 54
    goto :goto_42

    .line 55
    :cond_36
    const/4 v0, 0x1

    .line 56
    goto :goto_42

    .line 57
    :sswitch_38
    const-string v1, "line-through"

    .line 58
    .line 59
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-nez p0, :cond_41

    .line 64
    .line 65
    goto :goto_42

    .line 66
    :cond_41
    const/4 v0, 0x0

    .line 67
    :goto_42
    packed-switch v0, :pswitch_data_6c

    .line 68
    .line 69
    .line 70
    const/4 p0, 0x0

    .line 71
    return-object p0

    .line 72
    :pswitch_47
    sget-object p0, Lax/o4/g$E$g;->d0:Lax/o4/g$E$g;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_4a
    sget-object p0, Lax/o4/g$E$g;->f0:Lax/o4/g$E$g;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_4d
    sget-object p0, Lax/o4/g$E$g;->q:Lax/o4/g$E$g;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_50
    sget-object p0, Lax/o4/g$E$g;->c0:Lax/o4/g$E$g;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_53
    sget-object p0, Lax/o4/g$E$g;->e0:Lax/o4/g$E$g;

    .line 85
    .line 86
    return-object p0

    .line 87
    :sswitch_data_56
    .sparse-switch
        -0x45d81614 -> :sswitch_38
        -0x3d363934 -> :sswitch_2d
        0x33af38 -> :sswitch_22
        0x597af5c -> :sswitch_17
        0x1f9462c8 -> :sswitch_c
    .end sparse-switch

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
    :pswitch_data_6c
    .packed-switch 0x0
        :pswitch_53
        :pswitch_50
        :pswitch_4d
        :pswitch_4a
        :pswitch_47
    .end packed-switch
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

.method private I(Lax/o4/g$M;Lorg/xml/sax/Attributes;)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_1
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_41

    .line 7
    .line 8
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sget-object v2, Lax/o4/k$a;->b:[I

    .line 17
    .line 18
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-static {v3}, Lax/o4/k$g;->d(Ljava/lang/String;)Lax/o4/k$g;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    aget v2, v2, v3

    .line 31
    .line 32
    packed-switch v2, :pswitch_data_42

    .line 33
    .line 34
    .line 35
    goto :goto_3e

    .line 36
    :pswitch_23
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iput-object v1, p1, Lax/o4/g$M;->p:Lax/o4/g$p;

    .line 41
    .line 42
    goto :goto_3e

    .line 43
    :pswitch_2a
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    iput-object v1, p1, Lax/o4/g$M;->o:Lax/o4/g$p;

    .line 48
    .line 49
    goto :goto_3e

    .line 50
    :pswitch_31
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    iput-object v1, p1, Lax/o4/g$M;->n:Lax/o4/g$p;

    .line 55
    .line 56
    goto :goto_3e

    .line 57
    :pswitch_38
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    iput-object v1, p1, Lax/o4/g$M;->m:Lax/o4/g$p;

    .line 62
    .line 63
    :goto_3e
    add-int/lit8 v0, v0, 0x1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_41
    return-void

    .line 67
    :pswitch_data_42
    .packed-switch 0xf
        :pswitch_38
        :pswitch_31
        :pswitch_2a
        :pswitch_23
    .end packed-switch
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

.method private static I0(Ljava/lang/String;)Lax/o4/g$E$h;
    .registers 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "ltr"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_18

    .line 11
    .line 12
    const-string v0, "rtl"

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-nez p0, :cond_15

    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    return-object p0

    .line 22
    :cond_15
    sget-object p0, Lax/o4/g$E$h;->c0:Lax/o4/g$E$h;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_18
    sget-object p0, Lax/o4/g$E$h;->q:Lax/o4/g$E$h;

    .line 26
    .line 27
    return-object p0
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
.end method

.method private J(Lax/o4/g$r;Lorg/xml/sax/Attributes;)V
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_2
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-ge v1, v2, :cond_9b

    .line 8
    .line 9
    invoke-interface {p2, v1}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    sget-object v3, Lax/o4/k$a;->b:[I

    .line 18
    .line 19
    invoke-interface {p2, v1}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-static {v4}, Lax/o4/k$g;->d(Ljava/lang/String;)Lax/o4/k$g;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    aget v3, v3, v4

    .line 32
    .line 33
    packed-switch v3, :pswitch_data_9c

    .line 34
    .line 35
    .line 36
    goto/16 :goto_97

    .line 37
    .line 38
    :pswitch_25
    const-string v3, "auto"

    .line 39
    .line 40
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_36

    .line 45
    .line 46
    const/high16 v2, 0x7fc00000    # Float.NaN

    .line 47
    .line 48
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    iput-object v2, p1, Lax/o4/g$r;->v:Ljava/lang/Float;

    .line 53
    .line 54
    goto :goto_97

    .line 55
    :cond_36
    invoke-static {v2}, Lax/o4/k;->f0(Ljava/lang/String;)F

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    iput-object v2, p1, Lax/o4/g$r;->v:Ljava/lang/Float;

    .line 64
    .line 65
    goto :goto_97

    .line 66
    :pswitch_41
    const-string v3, "strokeWidth"

    .line 67
    .line 68
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-eqz v3, :cond_4c

    .line 73
    .line 74
    iput-boolean v0, p1, Lax/o4/g$r;->q:Z

    .line 75
    .line 76
    goto :goto_97

    .line 77
    :cond_4c
    const-string v3, "userSpaceOnUse"

    .line 78
    .line 79
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-eqz v2, :cond_58

    .line 84
    .line 85
    const/4 v2, 0x1

    .line 86
    iput-boolean v2, p1, Lax/o4/g$r;->q:Z

    .line 87
    .line 88
    goto :goto_97

    .line 89
    :cond_58
    new-instance p1, Lax/o4/j;

    .line 90
    .line 91
    const-string p2, "Invalid value for attribute markerUnits"

    .line 92
    .line 93
    invoke-direct {p1, p2}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw p1

    .line 97
    :pswitch_60
    invoke-static {v2}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    iput-object v2, p1, Lax/o4/g$r;->u:Lax/o4/g$p;

    .line 102
    .line 103
    invoke-virtual {v2}, Lax/o4/g$p;->j()Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-nez v2, :cond_6d

    .line 108
    .line 109
    goto :goto_97

    .line 110
    :cond_6d
    new-instance p1, Lax/o4/j;

    .line 111
    .line 112
    const-string p2, "Invalid <marker> element. markerHeight cannot be negative"

    .line 113
    .line 114
    invoke-direct {p1, p2}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw p1

    .line 118
    :pswitch_75
    invoke-static {v2}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    iput-object v2, p1, Lax/o4/g$r;->t:Lax/o4/g$p;

    .line 123
    .line 124
    invoke-virtual {v2}, Lax/o4/g$p;->j()Z

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    if-nez v2, :cond_82

    .line 129
    .line 130
    goto :goto_97

    .line 131
    :cond_82
    new-instance p1, Lax/o4/j;

    .line 132
    .line 133
    const-string p2, "Invalid <marker> element. markerWidth cannot be negative"

    .line 134
    .line 135
    invoke-direct {p1, p2}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw p1

    .line 139
    :pswitch_8a
    invoke-static {v2}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    iput-object v2, p1, Lax/o4/g$r;->s:Lax/o4/g$p;

    .line 144
    .line 145
    goto :goto_97

    .line 146
    :pswitch_91
    invoke-static {v2}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    iput-object v2, p1, Lax/o4/g$r;->r:Lax/o4/g$p;

    .line 151
    .line 152
    :goto_97
    add-int/lit8 v1, v1, 0x1

    .line 153
    .line 154
    goto/16 :goto_2

    .line 155
    .line 156
    :cond_9b
    return-void

    .line 157
    :pswitch_data_9c
    .packed-switch 0x1a
        :pswitch_91
        :pswitch_8a
        :pswitch_75
        :pswitch_60
        :pswitch_41
        :pswitch_25
    .end packed-switch
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
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
.end method

.method private J0(Ljava/lang/String;)Landroid/graphics/Matrix;
    .registers 21
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    const/4 v2, 0x4

    .line 5
    const/4 v3, 0x3

    .line 6
    const/4 v4, 0x2

    .line 7
    const/4 v5, 0x1

    .line 8
    const/4 v6, 0x0

    .line 9
    const/4 v7, 0x0

    .line 10
    new-instance v8, Landroid/graphics/Matrix;

    .line 11
    .line 12
    invoke-direct {v8}, Landroid/graphics/Matrix;-><init>()V

    .line 13
    .line 14
    .line 15
    new-instance v9, Lax/o4/k$i;

    .line 16
    .line 17
    invoke-direct {v9, v0}, Lax/o4/k$i;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v9}, Lax/o4/k$i;->A()V

    .line 21
    .line 22
    .line 23
    :goto_16
    invoke-virtual {v9}, Lax/o4/k$i;->h()Z

    .line 24
    .line 25
    .line 26
    move-result v10

    .line 27
    if-nez v10, :cond_277

    .line 28
    .line 29
    invoke-virtual {v9}, Lax/o4/k$i;->o()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v10

    .line 33
    if-eqz v10, :cond_260

    .line 34
    .line 35
    const/16 v11, 0x29

    .line 36
    .line 37
    const-string v12, "Invalid transform list: "

    .line 38
    .line 39
    const/4 v13, -0x1

    .line 40
    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    .line 41
    .line 42
    .line 43
    move-result v14

    .line 44
    sparse-switch v14, :sswitch_data_278

    .line 45
    .line 46
    .line 47
    goto :goto_70

    .line 48
    :sswitch_2f
    const-string v14, "translate"

    .line 49
    .line 50
    invoke-virtual {v10, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v14

    .line 54
    if-nez v14, :cond_38

    .line 55
    .line 56
    goto :goto_70

    .line 57
    :cond_38
    const/4 v13, 0x5

    .line 58
    goto :goto_70

    .line 59
    :sswitch_3a
    const-string v14, "skewY"

    .line 60
    .line 61
    invoke-virtual {v10, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v14

    .line 65
    if-nez v14, :cond_43

    .line 66
    .line 67
    goto :goto_70

    .line 68
    :cond_43
    const/4 v13, 0x4

    .line 69
    goto :goto_70

    .line 70
    :sswitch_45
    const-string v14, "skewX"

    .line 71
    .line 72
    invoke-virtual {v10, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v14

    .line 76
    if-nez v14, :cond_4e

    .line 77
    .line 78
    goto :goto_70

    .line 79
    :cond_4e
    const/4 v13, 0x3

    .line 80
    goto :goto_70

    .line 81
    :sswitch_50
    const-string v14, "scale"

    .line 82
    .line 83
    invoke-virtual {v10, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v14

    .line 87
    if-nez v14, :cond_59

    .line 88
    .line 89
    goto :goto_70

    .line 90
    :cond_59
    const/4 v13, 0x2

    .line 91
    goto :goto_70

    .line 92
    :sswitch_5b
    const-string v14, "rotate"

    .line 93
    .line 94
    invoke-virtual {v10, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v14

    .line 98
    if-nez v14, :cond_64

    .line 99
    .line 100
    goto :goto_70

    .line 101
    :cond_64
    const/4 v13, 0x1

    .line 102
    goto :goto_70

    .line 103
    :sswitch_66
    const-string v14, "matrix"

    .line 104
    .line 105
    invoke-virtual {v10, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v14

    .line 109
    if-nez v14, :cond_6f

    .line 110
    .line 111
    goto :goto_70

    .line 112
    :cond_6f
    const/4 v13, 0x0

    .line 113
    :goto_70
    packed-switch v13, :pswitch_data_292

    .line 114
    .line 115
    .line 116
    new-instance v0, Lax/o4/j;

    .line 117
    .line 118
    new-instance v1, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 121
    .line 122
    .line 123
    const-string v2, "Invalid transform list fn: "

    .line 124
    .line 125
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    const-string v2, ")"

    .line 132
    .line 133
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-direct {v0, v1}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    throw v0

    .line 144
    :pswitch_8f
    invoke-virtual {v9}, Lax/o4/k$i;->A()V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v9}, Lax/o4/k$i;->n()F

    .line 148
    .line 149
    .line 150
    move-result v10

    .line 151
    invoke-virtual {v9}, Lax/o4/k$i;->x()F

    .line 152
    .line 153
    .line 154
    move-result v13

    .line 155
    invoke-virtual {v9}, Lax/o4/k$i;->A()V

    .line 156
    .line 157
    .line 158
    invoke-static {v10}, Ljava/lang/Float;->isNaN(F)Z

    .line 159
    .line 160
    .line 161
    move-result v14

    .line 162
    if-nez v14, :cond_b9

    .line 163
    .line 164
    invoke-virtual {v9, v11}, Lax/o4/k$i;->f(C)Z

    .line 165
    .line 166
    .line 167
    move-result v11

    .line 168
    if-eqz v11, :cond_b9

    .line 169
    .line 170
    invoke-static {v13}, Ljava/lang/Float;->isNaN(F)Z

    .line 171
    .line 172
    .line 173
    move-result v11

    .line 174
    if-eqz v11, :cond_b4

    .line 175
    .line 176
    invoke-virtual {v8, v10, v7}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 177
    .line 178
    .line 179
    goto/16 :goto_23f

    .line 180
    .line 181
    :cond_b4
    invoke-virtual {v8, v10, v13}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 182
    .line 183
    .line 184
    goto/16 :goto_23f

    .line 185
    .line 186
    :cond_b9
    new-instance v1, Lax/o4/j;

    .line 187
    .line 188
    new-instance v2, Ljava/lang/StringBuilder;

    .line 189
    .line 190
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-direct {v1, v0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    throw v1

    .line 207
    :pswitch_ce
    invoke-virtual {v9}, Lax/o4/k$i;->A()V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v9}, Lax/o4/k$i;->n()F

    .line 211
    .line 212
    .line 213
    move-result v10

    .line 214
    invoke-virtual {v9}, Lax/o4/k$i;->A()V

    .line 215
    .line 216
    .line 217
    invoke-static {v10}, Ljava/lang/Float;->isNaN(F)Z

    .line 218
    .line 219
    .line 220
    move-result v13

    .line 221
    if-nez v13, :cond_f3

    .line 222
    .line 223
    invoke-virtual {v9, v11}, Lax/o4/k$i;->f(C)Z

    .line 224
    .line 225
    .line 226
    move-result v11

    .line 227
    if-eqz v11, :cond_f3

    .line 228
    .line 229
    float-to-double v10, v10

    .line 230
    invoke-static {v10, v11}, Ljava/lang/Math;->toRadians(D)D

    .line 231
    .line 232
    .line 233
    move-result-wide v10

    .line 234
    invoke-static {v10, v11}, Ljava/lang/Math;->tan(D)D

    .line 235
    .line 236
    .line 237
    move-result-wide v10

    .line 238
    double-to-float v10, v10

    .line 239
    invoke-virtual {v8, v7, v10}, Landroid/graphics/Matrix;->preSkew(FF)Z

    .line 240
    .line 241
    .line 242
    goto/16 :goto_23f

    .line 243
    .line 244
    :cond_f3
    new-instance v1, Lax/o4/j;

    .line 245
    .line 246
    new-instance v2, Ljava/lang/StringBuilder;

    .line 247
    .line 248
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    invoke-direct {v1, v0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    throw v1

    .line 265
    :pswitch_108
    invoke-virtual {v9}, Lax/o4/k$i;->A()V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v9}, Lax/o4/k$i;->n()F

    .line 269
    .line 270
    .line 271
    move-result v10

    .line 272
    invoke-virtual {v9}, Lax/o4/k$i;->A()V

    .line 273
    .line 274
    .line 275
    invoke-static {v10}, Ljava/lang/Float;->isNaN(F)Z

    .line 276
    .line 277
    .line 278
    move-result v13

    .line 279
    if-nez v13, :cond_12d

    .line 280
    .line 281
    invoke-virtual {v9, v11}, Lax/o4/k$i;->f(C)Z

    .line 282
    .line 283
    .line 284
    move-result v11

    .line 285
    if-eqz v11, :cond_12d

    .line 286
    .line 287
    float-to-double v10, v10

    .line 288
    invoke-static {v10, v11}, Ljava/lang/Math;->toRadians(D)D

    .line 289
    .line 290
    .line 291
    move-result-wide v10

    .line 292
    invoke-static {v10, v11}, Ljava/lang/Math;->tan(D)D

    .line 293
    .line 294
    .line 295
    move-result-wide v10

    .line 296
    double-to-float v10, v10

    .line 297
    invoke-virtual {v8, v10, v7}, Landroid/graphics/Matrix;->preSkew(FF)Z

    .line 298
    .line 299
    .line 300
    goto/16 :goto_23f

    .line 301
    .line 302
    :cond_12d
    new-instance v1, Lax/o4/j;

    .line 303
    .line 304
    new-instance v2, Ljava/lang/StringBuilder;

    .line 305
    .line 306
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    invoke-direct {v1, v0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    throw v1

    .line 323
    :pswitch_142
    invoke-virtual {v9}, Lax/o4/k$i;->A()V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v9}, Lax/o4/k$i;->n()F

    .line 327
    .line 328
    .line 329
    move-result v10

    .line 330
    invoke-virtual {v9}, Lax/o4/k$i;->x()F

    .line 331
    .line 332
    .line 333
    move-result v13

    .line 334
    invoke-virtual {v9}, Lax/o4/k$i;->A()V

    .line 335
    .line 336
    .line 337
    invoke-static {v10}, Ljava/lang/Float;->isNaN(F)Z

    .line 338
    .line 339
    .line 340
    move-result v14

    .line 341
    if-nez v14, :cond_16c

    .line 342
    .line 343
    invoke-virtual {v9, v11}, Lax/o4/k$i;->f(C)Z

    .line 344
    .line 345
    .line 346
    move-result v11

    .line 347
    if-eqz v11, :cond_16c

    .line 348
    .line 349
    invoke-static {v13}, Ljava/lang/Float;->isNaN(F)Z

    .line 350
    .line 351
    .line 352
    move-result v11

    .line 353
    if-eqz v11, :cond_167

    .line 354
    .line 355
    invoke-virtual {v8, v10, v10}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 356
    .line 357
    .line 358
    goto/16 :goto_23f

    .line 359
    .line 360
    :cond_167
    invoke-virtual {v8, v10, v13}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 361
    .line 362
    .line 363
    goto/16 :goto_23f

    .line 364
    .line 365
    :cond_16c
    new-instance v1, Lax/o4/j;

    .line 366
    .line 367
    new-instance v2, Ljava/lang/StringBuilder;

    .line 368
    .line 369
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    invoke-direct {v1, v0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    throw v1

    .line 386
    :pswitch_181
    invoke-virtual {v9}, Lax/o4/k$i;->A()V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v9}, Lax/o4/k$i;->n()F

    .line 390
    .line 391
    .line 392
    move-result v10

    .line 393
    invoke-virtual {v9}, Lax/o4/k$i;->x()F

    .line 394
    .line 395
    .line 396
    move-result v13

    .line 397
    invoke-virtual {v9}, Lax/o4/k$i;->x()F

    .line 398
    .line 399
    .line 400
    move-result v14

    .line 401
    invoke-virtual {v9}, Lax/o4/k$i;->A()V

    .line 402
    .line 403
    .line 404
    invoke-static {v10}, Ljava/lang/Float;->isNaN(F)Z

    .line 405
    .line 406
    .line 407
    move-result v15

    .line 408
    if-nez v15, :cond_1ca

    .line 409
    .line 410
    invoke-virtual {v9, v11}, Lax/o4/k$i;->f(C)Z

    .line 411
    .line 412
    .line 413
    move-result v11

    .line 414
    if-eqz v11, :cond_1ca

    .line 415
    .line 416
    invoke-static {v13}, Ljava/lang/Float;->isNaN(F)Z

    .line 417
    .line 418
    .line 419
    move-result v11

    .line 420
    if-eqz v11, :cond_1aa

    .line 421
    .line 422
    invoke-virtual {v8, v10}, Landroid/graphics/Matrix;->preRotate(F)Z

    .line 423
    .line 424
    .line 425
    goto/16 :goto_23f

    .line 426
    .line 427
    :cond_1aa
    invoke-static {v14}, Ljava/lang/Float;->isNaN(F)Z

    .line 428
    .line 429
    .line 430
    move-result v11

    .line 431
    if-nez v11, :cond_1b5

    .line 432
    .line 433
    invoke-virtual {v8, v10, v13, v14}, Landroid/graphics/Matrix;->preRotate(FFF)Z

    .line 434
    .line 435
    .line 436
    goto/16 :goto_23f

    .line 437
    .line 438
    :cond_1b5
    new-instance v1, Lax/o4/j;

    .line 439
    .line 440
    new-instance v2, Ljava/lang/StringBuilder;

    .line 441
    .line 442
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 446
    .line 447
    .line 448
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    invoke-direct {v1, v0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 456
    .line 457
    .line 458
    throw v1

    .line 459
    :cond_1ca
    new-instance v1, Lax/o4/j;

    .line 460
    .line 461
    new-instance v2, Ljava/lang/StringBuilder;

    .line 462
    .line 463
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 470
    .line 471
    .line 472
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v0

    .line 476
    invoke-direct {v1, v0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 477
    .line 478
    .line 479
    throw v1

    .line 480
    :pswitch_1df
    invoke-virtual {v9}, Lax/o4/k$i;->A()V

    .line 481
    .line 482
    .line 483
    invoke-virtual {v9}, Lax/o4/k$i;->n()F

    .line 484
    .line 485
    .line 486
    move-result v10

    .line 487
    invoke-virtual {v9}, Lax/o4/k$i;->z()Z

    .line 488
    .line 489
    .line 490
    invoke-virtual {v9}, Lax/o4/k$i;->n()F

    .line 491
    .line 492
    .line 493
    move-result v13

    .line 494
    invoke-virtual {v9}, Lax/o4/k$i;->z()Z

    .line 495
    .line 496
    .line 497
    invoke-virtual {v9}, Lax/o4/k$i;->n()F

    .line 498
    .line 499
    .line 500
    move-result v14

    .line 501
    invoke-virtual {v9}, Lax/o4/k$i;->z()Z

    .line 502
    .line 503
    .line 504
    invoke-virtual {v9}, Lax/o4/k$i;->n()F

    .line 505
    .line 506
    .line 507
    move-result v15

    .line 508
    invoke-virtual {v9}, Lax/o4/k$i;->z()Z

    .line 509
    .line 510
    .line 511
    invoke-virtual {v9}, Lax/o4/k$i;->n()F

    .line 512
    .line 513
    .line 514
    move-result v16

    .line 515
    invoke-virtual {v9}, Lax/o4/k$i;->z()Z

    .line 516
    .line 517
    .line 518
    invoke-virtual {v9}, Lax/o4/k$i;->n()F

    .line 519
    .line 520
    .line 521
    move-result v17

    .line 522
    invoke-virtual {v9}, Lax/o4/k$i;->A()V

    .line 523
    .line 524
    .line 525
    invoke-static/range {v17 .. v17}, Ljava/lang/Float;->isNaN(F)Z

    .line 526
    .line 527
    .line 528
    move-result v18

    .line 529
    if-nez v18, :cond_24b

    .line 530
    .line 531
    invoke-virtual {v9, v11}, Lax/o4/k$i;->f(C)Z

    .line 532
    .line 533
    .line 534
    move-result v11

    .line 535
    if-eqz v11, :cond_24b

    .line 536
    .line 537
    new-instance v11, Landroid/graphics/Matrix;

    .line 538
    .line 539
    invoke-direct {v11}, Landroid/graphics/Matrix;-><init>()V

    .line 540
    .line 541
    .line 542
    const/16 v12, 0x9

    .line 543
    .line 544
    new-array v12, v12, [F

    .line 545
    .line 546
    aput v10, v12, v6

    .line 547
    .line 548
    aput v14, v12, v5

    .line 549
    .line 550
    aput v16, v12, v4

    .line 551
    .line 552
    aput v13, v12, v3

    .line 553
    .line 554
    aput v15, v12, v2

    .line 555
    .line 556
    aput v17, v12, v1

    .line 557
    .line 558
    const/4 v10, 0x6

    .line 559
    aput v7, v12, v10

    .line 560
    .line 561
    const/4 v10, 0x7

    .line 562
    aput v7, v12, v10

    .line 563
    .line 564
    const/high16 v10, 0x3f800000    # 1.0f

    .line 565
    .line 566
    const/16 v13, 0x8

    .line 567
    .line 568
    aput v10, v12, v13

    .line 569
    .line 570
    invoke-virtual {v11, v12}, Landroid/graphics/Matrix;->setValues([F)V

    .line 571
    .line 572
    .line 573
    invoke-virtual {v8, v11}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 574
    .line 575
    .line 576
    :goto_23f
    invoke-virtual {v9}, Lax/o4/k$i;->h()Z

    .line 577
    .line 578
    .line 579
    move-result v10

    .line 580
    if-eqz v10, :cond_246

    .line 581
    .line 582
    goto :goto_277

    .line 583
    :cond_246
    invoke-virtual {v9}, Lax/o4/k$i;->z()Z

    .line 584
    .line 585
    .line 586
    goto/16 :goto_16

    .line 587
    .line 588
    :cond_24b
    new-instance v1, Lax/o4/j;

    .line 589
    .line 590
    new-instance v2, Ljava/lang/StringBuilder;

    .line 591
    .line 592
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 593
    .line 594
    .line 595
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 596
    .line 597
    .line 598
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 599
    .line 600
    .line 601
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 602
    .line 603
    .line 604
    move-result-object v0

    .line 605
    invoke-direct {v1, v0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 606
    .line 607
    .line 608
    throw v1

    .line 609
    :cond_260
    new-instance v1, Lax/o4/j;

    .line 610
    .line 611
    new-instance v2, Ljava/lang/StringBuilder;

    .line 612
    .line 613
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 614
    .line 615
    .line 616
    const-string v3, "Bad transform function encountered in transform list: "

    .line 617
    .line 618
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 619
    .line 620
    .line 621
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 622
    .line 623
    .line 624
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object v0

    .line 628
    invoke-direct {v1, v0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 629
    .line 630
    .line 631
    throw v1

    .line 632
    :cond_277
    :goto_277
    return-object v8

    .line 633
    :sswitch_data_278
    .sparse-switch
        -0x4072683f -> :sswitch_66
        -0x372522a5 -> :sswitch_5b
        0x683094a -> :sswitch_50
        0x686bc8e -> :sswitch_45
        0x686bc8f -> :sswitch_3a
        0x3ec0f14e -> :sswitch_2f
    .end sparse-switch

    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    :pswitch_data_292
    .packed-switch 0x0
        :pswitch_1df
        :pswitch_181
        :pswitch_142
        :pswitch_108
        :pswitch_ce
        :pswitch_8f
    .end packed-switch
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
.end method

.method private K(Lax/o4/g$s;Lorg/xml/sax/Attributes;)V
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_1
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_b0

    .line 7
    .line 8
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sget-object v2, Lax/o4/k$a;->b:[I

    .line 17
    .line 18
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-static {v3}, Lax/o4/k$g;->d(Ljava/lang/String;)Lax/o4/k$g;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    aget v2, v2, v3

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    if-eq v2, v3, :cond_a6

    .line 34
    .line 35
    const/4 v3, 0x2

    .line 36
    if-eq v2, v3, :cond_9f

    .line 37
    .line 38
    const/4 v3, 0x3

    .line 39
    if-eq v2, v3, :cond_8a

    .line 40
    .line 41
    const/4 v3, 0x4

    .line 42
    if-eq v2, v3, :cond_75

    .line 43
    .line 44
    const/16 v3, 0x2b

    .line 45
    .line 46
    const-string v4, "userSpaceOnUse"

    .line 47
    .line 48
    const-string v5, "objectBoundingBox"

    .line 49
    .line 50
    if-eq v2, v3, :cond_57

    .line 51
    .line 52
    const/16 v3, 0x2c

    .line 53
    .line 54
    if-eq v2, v3, :cond_39

    .line 55
    .line 56
    goto/16 :goto_ac

    .line 57
    .line 58
    :cond_39
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_44

    .line 63
    .line 64
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 65
    .line 66
    iput-object v1, p1, Lax/o4/g$s;->p:Ljava/lang/Boolean;

    .line 67
    .line 68
    goto :goto_ac

    .line 69
    :cond_44
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_4f

    .line 74
    .line 75
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 76
    .line 77
    iput-object v1, p1, Lax/o4/g$s;->p:Ljava/lang/Boolean;

    .line 78
    .line 79
    goto :goto_ac

    .line 80
    :cond_4f
    new-instance p1, Lax/o4/j;

    .line 81
    .line 82
    const-string p2, "Invalid value for attribute maskContentUnits"

    .line 83
    .line 84
    invoke-direct {p1, p2}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw p1

    .line 88
    :cond_57
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-eqz v2, :cond_62

    .line 93
    .line 94
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 95
    .line 96
    iput-object v1, p1, Lax/o4/g$s;->o:Ljava/lang/Boolean;

    .line 97
    .line 98
    goto :goto_ac

    .line 99
    :cond_62
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-eqz v1, :cond_6d

    .line 104
    .line 105
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 106
    .line 107
    iput-object v1, p1, Lax/o4/g$s;->o:Ljava/lang/Boolean;

    .line 108
    .line 109
    goto :goto_ac

    .line 110
    :cond_6d
    new-instance p1, Lax/o4/j;

    .line 111
    .line 112
    const-string p2, "Invalid value for attribute maskUnits"

    .line 113
    .line 114
    invoke-direct {p1, p2}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw p1

    .line 118
    :cond_75
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    iput-object v1, p1, Lax/o4/g$s;->t:Lax/o4/g$p;

    .line 123
    .line 124
    invoke-virtual {v1}, Lax/o4/g$p;->j()Z

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    if-nez v1, :cond_82

    .line 129
    .line 130
    goto :goto_ac

    .line 131
    :cond_82
    new-instance p1, Lax/o4/j;

    .line 132
    .line 133
    const-string p2, "Invalid <mask> element. height cannot be negative"

    .line 134
    .line 135
    invoke-direct {p1, p2}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw p1

    .line 139
    :cond_8a
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    iput-object v1, p1, Lax/o4/g$s;->s:Lax/o4/g$p;

    .line 144
    .line 145
    invoke-virtual {v1}, Lax/o4/g$p;->j()Z

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    if-nez v1, :cond_97

    .line 150
    .line 151
    goto :goto_ac

    .line 152
    :cond_97
    new-instance p1, Lax/o4/j;

    .line 153
    .line 154
    const-string p2, "Invalid <mask> element. width cannot be negative"

    .line 155
    .line 156
    invoke-direct {p1, p2}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    throw p1

    .line 160
    :cond_9f
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    iput-object v1, p1, Lax/o4/g$s;->r:Lax/o4/g$p;

    .line 165
    .line 166
    goto :goto_ac

    .line 167
    :cond_a6
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    iput-object v1, p1, Lax/o4/g$s;->q:Lax/o4/g$p;

    .line 172
    .line 173
    :goto_ac
    add-int/lit8 v0, v0, 0x1

    .line 174
    .line 175
    goto/16 :goto_1

    .line 176
    .line 177
    :cond_b0
    return-void
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
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
.end method

.method private K0(Ljava/io/InputStream;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const-string v0, "SVGParser"

    .line 2
    .line 3
    const-string v1, "Falling back to SAX parser"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    :try_start_7
    invoke-static {}, Ljavax/xml/parsers/SAXParserFactory;->newInstance()Ljavax/xml/parsers/SAXParserFactory;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "http://xml.org/sax/features/external-general-entities"

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-virtual {v0, v1, v2}, Ljavax/xml/parsers/SAXParserFactory;->setFeature(Ljava/lang/String;Z)V

    .line 16
    .line 17
    .line 18
    const-string v1, "http://xml.org/sax/features/external-parameter-entities"

    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, Ljavax/xml/parsers/SAXParserFactory;->setFeature(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljavax/xml/parsers/SAXParserFactory;->newSAXParser()Ljavax/xml/parsers/SAXParser;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Ljavax/xml/parsers/SAXParser;->getXMLReader()Lorg/xml/sax/XMLReader;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    new-instance v1, Lax/o4/k$f;

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-direct {v1, p0, v2}, Lax/o4/k$f;-><init>(Lax/o4/k;Lax/o4/k$a;)V

    .line 35
    .line 36
    .line 37
    invoke-interface {v0, v1}, Lorg/xml/sax/XMLReader;->setContentHandler(Lorg/xml/sax/ContentHandler;)V

    .line 38
    .line 39
    .line 40
    const-string v2, "http://xml.org/sax/properties/lexical-handler"

    .line 41
    .line 42
    invoke-interface {v0, v2, v1}, Lorg/xml/sax/XMLReader;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    new-instance v1, Lorg/xml/sax/InputSource;

    .line 46
    .line 47
    invoke-direct {v1, p1}, Lorg/xml/sax/InputSource;-><init>(Ljava/io/InputStream;)V

    .line 48
    .line 49
    .line 50
    invoke-interface {v0, v1}, Lorg/xml/sax/XMLReader;->parse(Lorg/xml/sax/InputSource;)V
    :try_end_34
    .catch Ljavax/xml/parsers/ParserConfigurationException; {:try_start_7 .. :try_end_34} :catch_39
    .catch Lorg/xml/sax/SAXException; {:try_start_7 .. :try_end_34} :catch_37
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_34} :catch_35

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :catch_35
    move-exception p1

    .line 55
    goto :goto_3b

    .line 56
    :catch_37
    move-exception p1

    .line 57
    goto :goto_43

    .line 58
    :catch_39
    move-exception p1

    .line 59
    goto :goto_4b

    .line 60
    :goto_3b
    new-instance v0, Lax/o4/j;

    .line 61
    .line 62
    const-string v1, "Stream error"

    .line 63
    .line 64
    invoke-direct {v0, v1, p1}, Lax/o4/j;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 65
    .line 66
    .line 67
    throw v0

    .line 68
    :goto_43
    new-instance v0, Lax/o4/j;

    .line 69
    .line 70
    const-string v1, "SVG parse error"

    .line 71
    .line 72
    invoke-direct {v0, v1, p1}, Lax/o4/j;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 73
    .line 74
    .line 75
    throw v0

    .line 76
    :goto_4b
    new-instance v0, Lax/o4/j;

    .line 77
    .line 78
    const-string v1, "XML parser problem"

    .line 79
    .line 80
    invoke-direct {v0, v1, p1}, Lax/o4/j;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 81
    .line 82
    .line 83
    throw v0
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
.end method

.method private L(Lax/o4/g$v;Lorg/xml/sax/Attributes;)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_1
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_4d

    .line 7
    .line 8
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sget-object v2, Lax/o4/k$a;->b:[I

    .line 17
    .line 18
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-static {v3}, Lax/o4/k$g;->d(Ljava/lang/String;)Lax/o4/k$g;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    aget v2, v2, v3

    .line 31
    .line 32
    const/16 v3, 0x8

    .line 33
    .line 34
    if-eq v2, v3, :cond_44

    .line 35
    .line 36
    const/16 v3, 0x9

    .line 37
    .line 38
    if-eq v2, v3, :cond_28

    .line 39
    .line 40
    goto :goto_4a

    .line 41
    :cond_28
    invoke-static {v1}, Lax/o4/k;->f0(Ljava/lang/String;)F

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    iput-object v1, p1, Lax/o4/g$v;->p:Ljava/lang/Float;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    const/4 v2, 0x0

    .line 56
    cmpg-float v1, v1, v2

    .line 57
    .line 58
    if-ltz v1, :cond_3c

    .line 59
    .line 60
    goto :goto_4a

    .line 61
    :cond_3c
    new-instance p1, Lax/o4/j;

    .line 62
    .line 63
    const-string p2, "Invalid <path> element. pathLength cannot be negative"

    .line 64
    .line 65
    invoke-direct {p1, p2}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :cond_44
    invoke-static {v1}, Lax/o4/k;->u0(Ljava/lang/String;)Lax/o4/g$w;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    iput-object v1, p1, Lax/o4/g$v;->o:Lax/o4/g$w;

    .line 74
    .line 75
    :goto_4a
    add-int/lit8 v0, v0, 0x1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_4d
    return-void
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

.method private L0(Ljava/io/InputStream;Z)V
    .registers 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-static {}, Landroid/util/Xml;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lax/o4/k$j;

    .line 6
    .line 7
    invoke-direct {v1, p0, v0}, Lax/o4/k$j;-><init>(Lax/o4/k;Lorg/xmlpull/v1/XmlPullParser;)V

    .line 8
    .line 9
    .line 10
    const-string v2, "http://xmlpull.org/v1/doc/features.html#process-docdecl"

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-interface {v0, v2, v3}, Lorg/xmlpull/v1/XmlPullParser;->setFeature(Ljava/lang/String;Z)V

    .line 14
    .line 15
    .line 16
    const-string v2, "http://xmlpull.org/v1/doc/features.html#process-namespaces"

    .line 17
    .line 18
    const/4 v4, 0x1

    .line 19
    invoke-interface {v0, v2, v4}, Lorg/xmlpull/v1/XmlPullParser;->setFeature(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-interface {v0, p1, v2}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 27
    .line 28
    .line 29
    move-result v2
    :try_end_1d
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_1d} :catch_47
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_1d} :catch_44

    .line 30
    :goto_1d
    if-eq v2, v4, :cond_110

    .line 31
    .line 32
    if-eqz v2, :cond_107

    .line 33
    .line 34
    const/16 v5, 0x8

    .line 35
    .line 36
    const-string v6, "SVGParser"

    .line 37
    .line 38
    if-eq v2, v5, :cond_da

    .line 39
    .line 40
    const/16 v5, 0xa

    .line 41
    .line 42
    if-eq v2, v5, :cond_b2

    .line 43
    .line 44
    const/16 v5, 0x3a

    .line 45
    .line 46
    const/4 v6, 0x2

    .line 47
    if-eq v2, v6, :cond_86

    .line 48
    .line 49
    const/4 v7, 0x3

    .line 50
    if-eq v2, v7, :cond_59

    .line 51
    .line 52
    const/4 v5, 0x4

    .line 53
    if-eq v2, v5, :cond_4a

    .line 54
    .line 55
    const/4 v5, 0x5

    .line 56
    if-eq v2, v5, :cond_3b

    .line 57
    .line 58
    goto/16 :goto_10a

    .line 59
    .line 60
    :cond_3b
    :try_start_3b
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-direct {p0, v2}, Lax/o4/k;->c1(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    goto/16 :goto_10a

    .line 68
    .line 69
    :catch_44
    move-exception p1

    .line 70
    goto/16 :goto_114

    .line 71
    .line 72
    :catch_47
    move-exception p1

    .line 73
    goto/16 :goto_11c

    .line 74
    .line 75
    :cond_4a
    new-array v2, v6, [I

    .line 76
    .line 77
    invoke-interface {v0, v2}, Lorg/xmlpull/v1/XmlPullParser;->getTextCharacters([I)[C

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    aget v6, v2, v3

    .line 82
    .line 83
    aget v2, v2, v4

    .line 84
    .line 85
    invoke-direct {p0, v5, v6, v2}, Lax/o4/k;->e1([CII)V

    .line 86
    .line 87
    .line 88
    goto/16 :goto_10a

    .line 89
    .line 90
    :cond_59
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getPrefix()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    if-eqz v6, :cond_79

    .line 99
    .line 100
    new-instance v6, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 103
    .line 104
    .line 105
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getPrefix()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    :cond_79
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    invoke-direct {p0, v5, v6, v2}, Lax/o4/k;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    goto/16 :goto_10a

    .line 134
    .line 135
    :cond_86
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getPrefix()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v6

    .line 143
    if-eqz v6, :cond_a6

    .line 144
    .line 145
    new-instance v6, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 148
    .line 149
    .line 150
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getPrefix()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v7

    .line 154
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    :cond_a6
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v5

    .line 171
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v6

    .line 175
    invoke-direct {p0, v5, v6, v2, v1}, Lax/o4/k;->X0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V

    .line 176
    .line 177
    .line 178
    goto :goto_10a

    .line 179
    :cond_b2
    if-eqz p2, :cond_10a

    .line 180
    .line 181
    iget-object v2, p0, Lax/o4/k;->a:Lax/o4/g;

    .line 182
    .line 183
    invoke-virtual {v2}, Lax/o4/g;->m()Lax/o4/g$F;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    if-nez v2, :cond_10a

    .line 188
    .line 189
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    const-string v5, "<!ENTITY "

    .line 194
    .line 195
    invoke-virtual {v2, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 196
    .line 197
    .line 198
    move-result v2
    :try_end_c6
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_3b .. :try_end_c6} :catch_47
    .catch Ljava/io/IOException; {:try_start_3b .. :try_end_c6} :catch_44

    .line 199
    if-eqz v2, :cond_10a

    .line 200
    .line 201
    :try_start_c8
    const-string p2, "Switching to SAX parser to process entities"

    .line 202
    .line 203
    invoke-static {v6, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 204
    .line 205
    .line 206
    invoke-virtual {p1}, Ljava/io/InputStream;->reset()V

    .line 207
    .line 208
    .line 209
    invoke-direct {p0, p1}, Lax/o4/k;->K0(Ljava/io/InputStream;)V
    :try_end_d3
    .catch Ljava/io/IOException; {:try_start_c8 .. :try_end_d3} :catch_d4
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_c8 .. :try_end_d3} :catch_47

    .line 210
    .line 211
    .line 212
    return-void

    .line 213
    :catch_d4
    :try_start_d4
    const-string p1, "Detected internal entity definitions, but could not parse them."

    .line 214
    .line 215
    invoke-static {v6, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 216
    .line 217
    .line 218
    return-void

    .line 219
    :cond_da
    new-instance v2, Ljava/lang/StringBuilder;

    .line 220
    .line 221
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 222
    .line 223
    .line 224
    const-string v5, "PROC INSTR: "

    .line 225
    .line 226
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v5

    .line 233
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    invoke-static {v6, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 241
    .line 242
    .line 243
    new-instance v2, Lax/o4/k$i;

    .line 244
    .line 245
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v5

    .line 249
    invoke-direct {v2, v5}, Lax/o4/k$i;-><init>(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v2}, Lax/o4/k$i;->r()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v5

    .line 256
    invoke-direct {p0, v2}, Lax/o4/k;->x0(Lax/o4/k$i;)Ljava/util/Map;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    invoke-direct {p0, v5, v2}, Lax/o4/k;->r(Ljava/lang/String;Ljava/util/Map;)V

    .line 261
    .line 262
    .line 263
    goto :goto_10a

    .line 264
    :cond_107
    invoke-direct {p0}, Lax/o4/k;->W0()V

    .line 265
    .line 266
    .line 267
    :cond_10a
    :goto_10a
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->nextToken()I

    .line 268
    .line 269
    .line 270
    move-result v2

    .line 271
    goto/16 :goto_1d

    .line 272
    .line 273
    :cond_110
    invoke-direct {p0}, Lax/o4/k;->o()V
    :try_end_113
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_d4 .. :try_end_113} :catch_47
    .catch Ljava/io/IOException; {:try_start_d4 .. :try_end_113} :catch_44

    .line 274
    .line 275
    .line 276
    return-void

    .line 277
    :goto_114
    new-instance p2, Lax/o4/j;

    .line 278
    .line 279
    const-string v0, "Stream error"

    .line 280
    .line 281
    invoke-direct {p2, v0, p1}, Lax/o4/j;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 282
    .line 283
    .line 284
    throw p2

    .line 285
    :goto_11c
    new-instance p2, Lax/o4/j;

    .line 286
    .line 287
    const-string v0, "XML parser problem"

    .line 288
    .line 289
    invoke-direct {p2, v0, p1}, Lax/o4/j;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 290
    .line 291
    .line 292
    throw p2
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
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
.end method

.method private M(Lax/o4/g$y;Lorg/xml/sax/Attributes;)V
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_1
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_d3

    .line 7
    .line 8
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sget-object v2, Lax/o4/k$a;->b:[I

    .line 17
    .line 18
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-static {v3}, Lax/o4/k$g;->d(Ljava/lang/String;)Lax/o4/k$g;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    aget v2, v2, v3

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    if-eq v2, v3, :cond_c9

    .line 34
    .line 35
    const/4 v3, 0x2

    .line 36
    if-eq v2, v3, :cond_c2

    .line 37
    .line 38
    const/4 v3, 0x3

    .line 39
    if-eq v2, v3, :cond_ad

    .line 40
    .line 41
    const/4 v3, 0x4

    .line 42
    if-eq v2, v3, :cond_98

    .line 43
    .line 44
    const/4 v3, 0x6

    .line 45
    if-eq v2, v3, :cond_7d

    .line 46
    .line 47
    const-string v3, "userSpaceOnUse"

    .line 48
    .line 49
    const-string v4, "objectBoundingBox"

    .line 50
    .line 51
    packed-switch v2, :pswitch_data_d4

    .line 52
    .line 53
    .line 54
    goto/16 :goto_cf

    .line 55
    .line 56
    :pswitch_37
    invoke-direct {p0, v1}, Lax/o4/k;->J0(Ljava/lang/String;)Landroid/graphics/Matrix;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    iput-object v1, p1, Lax/o4/g$y;->s:Landroid/graphics/Matrix;

    .line 61
    .line 62
    goto/16 :goto_cf

    .line 63
    .line 64
    :pswitch_3f
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eqz v2, :cond_4b

    .line 69
    .line 70
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 71
    .line 72
    iput-object v1, p1, Lax/o4/g$y;->r:Ljava/lang/Boolean;

    .line 73
    .line 74
    goto/16 :goto_cf

    .line 75
    .line 76
    :cond_4b
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-eqz v1, :cond_57

    .line 81
    .line 82
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 83
    .line 84
    iput-object v1, p1, Lax/o4/g$y;->r:Ljava/lang/Boolean;

    .line 85
    .line 86
    goto/16 :goto_cf

    .line 87
    .line 88
    :cond_57
    new-instance p1, Lax/o4/j;

    .line 89
    .line 90
    const-string p2, "Invalid value for attribute patternContentUnits"

    .line 91
    .line 92
    invoke-direct {p1, p2}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw p1

    .line 96
    :pswitch_5f
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-eqz v2, :cond_6a

    .line 101
    .line 102
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 103
    .line 104
    iput-object v1, p1, Lax/o4/g$y;->q:Ljava/lang/Boolean;

    .line 105
    .line 106
    goto :goto_cf

    .line 107
    :cond_6a
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-eqz v1, :cond_75

    .line 112
    .line 113
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 114
    .line 115
    iput-object v1, p1, Lax/o4/g$y;->q:Ljava/lang/Boolean;

    .line 116
    .line 117
    goto :goto_cf

    .line 118
    :cond_75
    new-instance p1, Lax/o4/j;

    .line 119
    .line 120
    const-string p2, "Invalid value for attribute patternUnits"

    .line 121
    .line 122
    invoke-direct {p1, p2}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw p1

    .line 126
    :cond_7d
    const-string v2, ""

    .line 127
    .line 128
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    if-nez v2, :cond_95

    .line 137
    .line 138
    const-string v2, "http://www.w3.org/1999/xlink"

    .line 139
    .line 140
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    if-eqz v2, :cond_cf

    .line 149
    .line 150
    :cond_95
    iput-object v1, p1, Lax/o4/g$y;->x:Ljava/lang/String;

    .line 151
    .line 152
    goto :goto_cf

    .line 153
    :cond_98
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    iput-object v1, p1, Lax/o4/g$y;->w:Lax/o4/g$p;

    .line 158
    .line 159
    invoke-virtual {v1}, Lax/o4/g$p;->j()Z

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    if-nez v1, :cond_a5

    .line 164
    .line 165
    goto :goto_cf

    .line 166
    :cond_a5
    new-instance p1, Lax/o4/j;

    .line 167
    .line 168
    const-string p2, "Invalid <pattern> element. height cannot be negative"

    .line 169
    .line 170
    invoke-direct {p1, p2}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    throw p1

    .line 174
    :cond_ad
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    iput-object v1, p1, Lax/o4/g$y;->v:Lax/o4/g$p;

    .line 179
    .line 180
    invoke-virtual {v1}, Lax/o4/g$p;->j()Z

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    if-nez v1, :cond_ba

    .line 185
    .line 186
    goto :goto_cf

    .line 187
    :cond_ba
    new-instance p1, Lax/o4/j;

    .line 188
    .line 189
    const-string p2, "Invalid <pattern> element. width cannot be negative"

    .line 190
    .line 191
    invoke-direct {p1, p2}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    throw p1

    .line 195
    :cond_c2
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    iput-object v1, p1, Lax/o4/g$y;->u:Lax/o4/g$p;

    .line 200
    .line 201
    goto :goto_cf

    .line 202
    :cond_c9
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    iput-object v1, p1, Lax/o4/g$y;->t:Lax/o4/g$p;

    .line 207
    .line 208
    :cond_cf
    :goto_cf
    add-int/lit8 v0, v0, 0x1

    .line 209
    .line 210
    goto/16 :goto_1

    .line 211
    .line 212
    :cond_d3
    return-void

    .line 213
    :pswitch_data_d4
    .packed-switch 0x28
        :pswitch_5f
        :pswitch_3f
        :pswitch_37
    .end packed-switch
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
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
.end method

.method private static M0(Ljava/lang/String;)Lax/o4/g$E$i;
    .registers 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "none"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_18

    .line 11
    .line 12
    const-string v0, "non-scaling-stroke"

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-nez p0, :cond_15

    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    return-object p0

    .line 22
    :cond_15
    sget-object p0, Lax/o4/g$E$i;->c0:Lax/o4/g$E$i;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_18
    sget-object p0, Lax/o4/g$E$i;->q:Lax/o4/g$E$i;

    .line 26
    .line 27
    return-object p0
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
.end method

.method private N(Lax/o4/g$z;Lorg/xml/sax/Attributes;Ljava/lang/String;)V
    .registers 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_2
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-ge v1, v2, :cond_b2

    .line 8
    .line 9
    invoke-interface {p2, v1}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-static {v2}, Lax/o4/k$g;->d(Ljava/lang/String;)Lax/o4/k$g;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    sget-object v3, Lax/o4/k$g;->W0:Lax/o4/k$g;

    .line 18
    .line 19
    if-ne v2, v3, :cond_ae

    .line 20
    .line 21
    new-instance v2, Lax/o4/k$i;

    .line 22
    .line 23
    invoke-interface {p2, v1}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-direct {v2, v3}, Lax/o4/k$i;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    new-instance v3, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Lax/o4/k$i;->A()V

    .line 36
    .line 37
    .line 38
    :goto_25
    invoke-virtual {v2}, Lax/o4/k$i;->h()Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-nez v4, :cond_8a

    .line 43
    .line 44
    invoke-virtual {v2}, Lax/o4/k$i;->n()F

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    const-string v6, "Invalid <"

    .line 53
    .line 54
    if-nez v5, :cond_70

    .line 55
    .line 56
    invoke-virtual {v2}, Lax/o4/k$i;->z()Z

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2}, Lax/o4/k$i;->n()F

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    if-nez v7, :cond_56

    .line 68
    .line 69
    invoke-virtual {v2}, Lax/o4/k$i;->z()Z

    .line 70
    .line 71
    .line 72
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    goto :goto_25

    .line 87
    :cond_56
    new-instance p1, Lax/o4/j;

    .line 88
    .line 89
    new-instance p2, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string p3, "> points attribute. There should be an even number of coordinates."

    .line 101
    .line 102
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    invoke-direct {p1, p2}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw p1

    .line 113
    :cond_70
    new-instance p1, Lax/o4/j;

    .line 114
    .line 115
    new-instance p2, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    const-string p3, "> points attribute. Non-coordinate content found in list."

    .line 127
    .line 128
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    invoke-direct {p1, p2}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw p1

    .line 139
    :cond_8a
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    new-array v2, v2, [F

    .line 144
    .line 145
    iput-object v2, p1, Lax/o4/g$z;->o:[F

    .line 146
    .line 147
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    const/4 v4, 0x0

    .line 152
    const/4 v5, 0x0

    .line 153
    :goto_98
    if-ge v5, v2, :cond_ae

    .line 154
    .line 155
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v6

    .line 159
    add-int/lit8 v5, v5, 0x1

    .line 160
    .line 161
    check-cast v6, Ljava/lang/Float;

    .line 162
    .line 163
    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    .line 164
    .line 165
    .line 166
    move-result v6

    .line 167
    iget-object v7, p1, Lax/o4/g$z;->o:[F

    .line 168
    .line 169
    add-int/lit8 v8, v4, 0x1

    .line 170
    .line 171
    aput v6, v7, v4

    .line 172
    .line 173
    move v4, v8

    .line 174
    goto :goto_98

    .line 175
    :cond_ae
    add-int/lit8 v1, v1, 0x1

    .line 176
    .line 177
    goto/16 :goto_2

    .line 178
    .line 179
    :cond_b2
    return-void
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

.method private static N0(Ljava/lang/String;)Lax/o4/g$b;
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    new-instance v0, Lax/o4/k$i;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lax/o4/k$i;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lax/o4/k$i;->A()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lax/o4/k$i;->n()F

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    invoke-virtual {v0}, Lax/o4/k$i;->z()Z

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lax/o4/k$i;->n()F

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {v0}, Lax/o4/k$i;->z()Z

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lax/o4/k$i;->n()F

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-virtual {v0}, Lax/o4/k$i;->z()Z

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lax/o4/k$i;->n()F

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-nez v3, :cond_58

    .line 39
    .line 40
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-nez v3, :cond_58

    .line 45
    .line 46
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-nez v3, :cond_58

    .line 51
    .line 52
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-nez v3, :cond_58

    .line 57
    .line 58
    const/4 v3, 0x0

    .line 59
    cmpg-float v4, v2, v3

    .line 60
    .line 61
    if-ltz v4, :cond_50

    .line 62
    .line 63
    cmpg-float v3, v0, v3

    .line 64
    .line 65
    if-ltz v3, :cond_48

    .line 66
    .line 67
    new-instance v3, Lax/o4/g$b;

    .line 68
    .line 69
    invoke-direct {v3, p0, v1, v2, v0}, Lax/o4/g$b;-><init>(FFFF)V

    .line 70
    .line 71
    .line 72
    return-object v3

    .line 73
    :cond_48
    new-instance p0, Lax/o4/j;

    .line 74
    .line 75
    const-string v0, "Invalid viewBox. height cannot be negative"

    .line 76
    .line 77
    invoke-direct {p0, v0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw p0

    .line 81
    :cond_50
    new-instance p0, Lax/o4/j;

    .line 82
    .line 83
    const-string v0, "Invalid viewBox. width cannot be negative"

    .line 84
    .line 85
    invoke-direct {p0, v0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw p0

    .line 89
    :cond_58
    new-instance p0, Lax/o4/j;

    .line 90
    .line 91
    const-string v0, "Invalid viewBox definition - should have four numbers"

    .line 92
    .line 93
    invoke-direct {p0, v0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw p0
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
.end method

.method private O(Lax/o4/g$Q;Lorg/xml/sax/Attributes;)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_1
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_5e

    .line 7
    .line 8
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sget-object v2, Lax/o4/k$a;->b:[I

    .line 17
    .line 18
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-static {v3}, Lax/o4/k$g;->d(Ljava/lang/String;)Lax/o4/k$g;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    aget v2, v2, v3

    .line 31
    .line 32
    const/16 v3, 0x23

    .line 33
    .line 34
    if-eq v2, v3, :cond_55

    .line 35
    .line 36
    const/16 v3, 0x24

    .line 37
    .line 38
    if-eq v2, v3, :cond_4e

    .line 39
    .line 40
    packed-switch v2, :pswitch_data_60

    .line 41
    .line 42
    .line 43
    goto :goto_5b

    .line 44
    :pswitch_2b
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iput-object v1, p1, Lax/o4/g$Q;->o:Lax/o4/g$p;

    .line 49
    .line 50
    invoke-virtual {v1}, Lax/o4/g$p;->j()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_38

    .line 55
    .line 56
    goto :goto_5b

    .line 57
    :cond_38
    new-instance p1, Lax/o4/j;

    .line 58
    .line 59
    const-string p2, "Invalid <radialGradient> element. r cannot be negative"

    .line 60
    .line 61
    invoke-direct {p1, p2}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p1

    .line 65
    :pswitch_40
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    iput-object v1, p1, Lax/o4/g$Q;->n:Lax/o4/g$p;

    .line 70
    .line 71
    goto :goto_5b

    .line 72
    :pswitch_47
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    iput-object v1, p1, Lax/o4/g$Q;->m:Lax/o4/g$p;

    .line 77
    .line 78
    goto :goto_5b

    .line 79
    :cond_4e
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    iput-object v1, p1, Lax/o4/g$Q;->q:Lax/o4/g$p;

    .line 84
    .line 85
    goto :goto_5b

    .line 86
    :cond_55
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    iput-object v1, p1, Lax/o4/g$Q;->p:Lax/o4/g$p;

    .line 91
    .line 92
    :goto_5b
    add-int/lit8 v0, v0, 0x1

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_5e
    return-void

    .line 96
    nop

    .line 97
    :pswitch_data_60
    .packed-switch 0xc
        :pswitch_47
        :pswitch_40
        :pswitch_2b
    .end packed-switch
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

.method private O0(Lorg/xml/sax/Attributes;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v1, "<path>"

    .line 5
    .line 6
    invoke-direct {p0, v1, v0}, Lax/o4/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 10
    .line 11
    if-eqz v0, :cond_2e

    .line 12
    .line 13
    new-instance v0, Lax/o4/g$v;

    .line 14
    .line 15
    invoke-direct {v0}, Lax/o4/g$v;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lax/o4/k;->a:Lax/o4/g;

    .line 19
    .line 20
    iput-object v1, v0, Lax/o4/g$N;->a:Lax/o4/g;

    .line 21
    .line 22
    iget-object v1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 23
    .line 24
    iput-object v1, v0, Lax/o4/g$N;->b:Lax/o4/g$J;

    .line 25
    .line 26
    invoke-direct {p0, v0, p1}, Lax/o4/k;->D(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, v0, p1}, Lax/o4/k;->S(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0, v0, p1}, Lax/o4/k;->W(Lax/o4/g$n;Lorg/xml/sax/Attributes;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p0, v0, p1}, Lax/o4/k;->C(Lax/o4/g$G;Lorg/xml/sax/Attributes;)V

    .line 36
    .line 37
    .line 38
    invoke-direct {p0, v0, p1}, Lax/o4/k;->L(Lax/o4/g$v;Lorg/xml/sax/Attributes;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 42
    .line 43
    invoke-interface {p1, v0}, Lax/o4/g$J;->m(Lax/o4/g$N;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_2e
    new-instance p1, Lax/o4/j;

    .line 48
    .line 49
    const-string v0, "Invalid document. Root element must be <svg>"

    .line 50
    .line 51
    invoke-direct {p1, v0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private P(Lax/o4/g$B;Lorg/xml/sax/Attributes;)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_1
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_99

    .line 7
    .line 8
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sget-object v2, Lax/o4/k$a;->b:[I

    .line 17
    .line 18
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-static {v3}, Lax/o4/k$g;->d(Ljava/lang/String;)Lax/o4/k$g;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    aget v2, v2, v3

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    if-eq v2, v3, :cond_8f

    .line 34
    .line 35
    const/4 v3, 0x2

    .line 36
    if-eq v2, v3, :cond_88

    .line 37
    .line 38
    const/4 v3, 0x3

    .line 39
    if-eq v2, v3, :cond_73

    .line 40
    .line 41
    const/4 v3, 0x4

    .line 42
    if-eq v2, v3, :cond_5e

    .line 43
    .line 44
    const/16 v3, 0xa

    .line 45
    .line 46
    if-eq v2, v3, :cond_49

    .line 47
    .line 48
    const/16 v3, 0xb

    .line 49
    .line 50
    if-eq v2, v3, :cond_34

    .line 51
    .line 52
    goto :goto_95

    .line 53
    :cond_34
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iput-object v1, p1, Lax/o4/g$B;->t:Lax/o4/g$p;

    .line 58
    .line 59
    invoke-virtual {v1}, Lax/o4/g$p;->j()Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-nez v1, :cond_41

    .line 64
    .line 65
    goto :goto_95

    .line 66
    :cond_41
    new-instance p1, Lax/o4/j;

    .line 67
    .line 68
    const-string p2, "Invalid <rect> element. ry cannot be negative"

    .line 69
    .line 70
    invoke-direct {p1, p2}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p1

    .line 74
    :cond_49
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    iput-object v1, p1, Lax/o4/g$B;->s:Lax/o4/g$p;

    .line 79
    .line 80
    invoke-virtual {v1}, Lax/o4/g$p;->j()Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-nez v1, :cond_56

    .line 85
    .line 86
    goto :goto_95

    .line 87
    :cond_56
    new-instance p1, Lax/o4/j;

    .line 88
    .line 89
    const-string p2, "Invalid <rect> element. rx cannot be negative"

    .line 90
    .line 91
    invoke-direct {p1, p2}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw p1

    .line 95
    :cond_5e
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    iput-object v1, p1, Lax/o4/g$B;->r:Lax/o4/g$p;

    .line 100
    .line 101
    invoke-virtual {v1}, Lax/o4/g$p;->j()Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-nez v1, :cond_6b

    .line 106
    .line 107
    goto :goto_95

    .line 108
    :cond_6b
    new-instance p1, Lax/o4/j;

    .line 109
    .line 110
    const-string p2, "Invalid <rect> element. height cannot be negative"

    .line 111
    .line 112
    invoke-direct {p1, p2}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw p1

    .line 116
    :cond_73
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    iput-object v1, p1, Lax/o4/g$B;->q:Lax/o4/g$p;

    .line 121
    .line 122
    invoke-virtual {v1}, Lax/o4/g$p;->j()Z

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    if-nez v1, :cond_80

    .line 127
    .line 128
    goto :goto_95

    .line 129
    :cond_80
    new-instance p1, Lax/o4/j;

    .line 130
    .line 131
    const-string p2, "Invalid <rect> element. width cannot be negative"

    .line 132
    .line 133
    invoke-direct {p1, p2}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    throw p1

    .line 137
    :cond_88
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    iput-object v1, p1, Lax/o4/g$B;->p:Lax/o4/g$p;

    .line 142
    .line 143
    goto :goto_95

    .line 144
    :cond_8f
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    iput-object v1, p1, Lax/o4/g$B;->o:Lax/o4/g$p;

    .line 149
    .line 150
    :goto_95
    add-int/lit8 v0, v0, 0x1

    .line 151
    .line 152
    goto/16 :goto_1

    .line 153
    .line 154
    :cond_99
    return-void
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
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
.end method

.method private P0(Lorg/xml/sax/Attributes;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v1, "<pattern>"

    .line 5
    .line 6
    invoke-direct {p0, v1, v0}, Lax/o4/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 10
    .line 11
    if-eqz v0, :cond_30

    .line 12
    .line 13
    new-instance v0, Lax/o4/g$y;

    .line 14
    .line 15
    invoke-direct {v0}, Lax/o4/g$y;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lax/o4/k;->a:Lax/o4/g;

    .line 19
    .line 20
    iput-object v1, v0, Lax/o4/g$N;->a:Lax/o4/g;

    .line 21
    .line 22
    iget-object v1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 23
    .line 24
    iput-object v1, v0, Lax/o4/g$N;->b:Lax/o4/g$J;

    .line 25
    .line 26
    invoke-direct {p0, v0, p1}, Lax/o4/k;->D(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, v0, p1}, Lax/o4/k;->S(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0, v0, p1}, Lax/o4/k;->C(Lax/o4/g$G;Lorg/xml/sax/Attributes;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p0, v0, p1}, Lax/o4/k;->Y(Lax/o4/g$R;Lorg/xml/sax/Attributes;)V

    .line 36
    .line 37
    .line 38
    invoke-direct {p0, v0, p1}, Lax/o4/k;->M(Lax/o4/g$y;Lorg/xml/sax/Attributes;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 42
    .line 43
    invoke-interface {p1, v0}, Lax/o4/g$J;->m(Lax/o4/g$N;)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 47
    .line 48
    return-void

    .line 49
    :cond_30
    new-instance p1, Lax/o4/j;

    .line 50
    .line 51
    const-string v0, "Invalid document. Root element must be <svg>"

    .line 52
    .line 53
    invoke-direct {p1, v0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private Q(Lax/o4/g$F;Lorg/xml/sax/Attributes;)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_1
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_6c

    .line 7
    .line 8
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sget-object v2, Lax/o4/k$a;->b:[I

    .line 17
    .line 18
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-static {v3}, Lax/o4/k$g;->d(Ljava/lang/String;)Lax/o4/k$g;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    aget v2, v2, v3

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    if-eq v2, v3, :cond_63

    .line 34
    .line 35
    const/4 v3, 0x2

    .line 36
    if-eq v2, v3, :cond_5c

    .line 37
    .line 38
    const/4 v3, 0x3

    .line 39
    if-eq v2, v3, :cond_47

    .line 40
    .line 41
    const/4 v3, 0x4

    .line 42
    if-eq v2, v3, :cond_32

    .line 43
    .line 44
    const/4 v3, 0x5

    .line 45
    if-eq v2, v3, :cond_2f

    .line 46
    .line 47
    goto :goto_69

    .line 48
    :cond_2f
    iput-object v1, p1, Lax/o4/g$F;->u:Ljava/lang/String;

    .line 49
    .line 50
    goto :goto_69

    .line 51
    :cond_32
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    iput-object v1, p1, Lax/o4/g$F;->t:Lax/o4/g$p;

    .line 56
    .line 57
    invoke-virtual {v1}, Lax/o4/g$p;->j()Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-nez v1, :cond_3f

    .line 62
    .line 63
    goto :goto_69

    .line 64
    :cond_3f
    new-instance p1, Lax/o4/j;

    .line 65
    .line 66
    const-string p2, "Invalid <svg> element. height cannot be negative"

    .line 67
    .line 68
    invoke-direct {p1, p2}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw p1

    .line 72
    :cond_47
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    iput-object v1, p1, Lax/o4/g$F;->s:Lax/o4/g$p;

    .line 77
    .line 78
    invoke-virtual {v1}, Lax/o4/g$p;->j()Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-nez v1, :cond_54

    .line 83
    .line 84
    goto :goto_69

    .line 85
    :cond_54
    new-instance p1, Lax/o4/j;

    .line 86
    .line 87
    const-string p2, "Invalid <svg> element. width cannot be negative"

    .line 88
    .line 89
    invoke-direct {p1, p2}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw p1

    .line 93
    :cond_5c
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    iput-object v1, p1, Lax/o4/g$F;->r:Lax/o4/g$p;

    .line 98
    .line 99
    goto :goto_69

    .line 100
    :cond_63
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    iput-object v1, p1, Lax/o4/g$F;->q:Lax/o4/g$p;

    .line 105
    .line 106
    :goto_69
    add-int/lit8 v0, v0, 0x1

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_6c
    return-void
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

.method private Q0(Lorg/xml/sax/Attributes;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v1, "<polygon>"

    .line 5
    .line 6
    invoke-direct {p0, v1, v0}, Lax/o4/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 10
    .line 11
    if-eqz v0, :cond_30

    .line 12
    .line 13
    new-instance v0, Lax/o4/g$A;

    .line 14
    .line 15
    invoke-direct {v0}, Lax/o4/g$A;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lax/o4/k;->a:Lax/o4/g;

    .line 19
    .line 20
    iput-object v1, v0, Lax/o4/g$N;->a:Lax/o4/g;

    .line 21
    .line 22
    iget-object v1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 23
    .line 24
    iput-object v1, v0, Lax/o4/g$N;->b:Lax/o4/g$J;

    .line 25
    .line 26
    invoke-direct {p0, v0, p1}, Lax/o4/k;->D(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, v0, p1}, Lax/o4/k;->S(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0, v0, p1}, Lax/o4/k;->W(Lax/o4/g$n;Lorg/xml/sax/Attributes;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p0, v0, p1}, Lax/o4/k;->C(Lax/o4/g$G;Lorg/xml/sax/Attributes;)V

    .line 36
    .line 37
    .line 38
    const-string v1, "polygon"

    .line 39
    .line 40
    invoke-direct {p0, v0, p1, v1}, Lax/o4/k;->N(Lax/o4/g$z;Lorg/xml/sax/Attributes;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 44
    .line 45
    invoke-interface {p1, v0}, Lax/o4/g$J;->m(Lax/o4/g$N;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_30
    new-instance p1, Lax/o4/j;

    .line 50
    .line 51
    const-string v0, "Invalid document. Root element must be <svg>"

    .line 52
    .line 53
    invoke-direct {p1, v0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private R(Lax/o4/g$D;Lorg/xml/sax/Attributes;)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_1
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_2d

    .line 7
    .line 8
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sget-object v2, Lax/o4/k$a;->b:[I

    .line 17
    .line 18
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-static {v3}, Lax/o4/k$g;->d(Ljava/lang/String;)Lax/o4/k$g;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    aget v2, v2, v3

    .line 31
    .line 32
    const/16 v3, 0x25

    .line 33
    .line 34
    if-eq v2, v3, :cond_24

    .line 35
    .line 36
    goto :goto_2a

    .line 37
    :cond_24
    invoke-direct {p0, v1}, Lax/o4/k;->n0(Ljava/lang/String;)Ljava/lang/Float;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iput-object v1, p1, Lax/o4/g$D;->h:Ljava/lang/Float;

    .line 42
    .line 43
    :goto_2a
    add-int/lit8 v0, v0, 0x1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2d
    return-void
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

.method private R0(Lorg/xml/sax/Attributes;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v1, "<polyline>"

    .line 5
    .line 6
    invoke-direct {p0, v1, v0}, Lax/o4/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 10
    .line 11
    if-eqz v0, :cond_30

    .line 12
    .line 13
    new-instance v0, Lax/o4/g$z;

    .line 14
    .line 15
    invoke-direct {v0}, Lax/o4/g$z;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lax/o4/k;->a:Lax/o4/g;

    .line 19
    .line 20
    iput-object v1, v0, Lax/o4/g$N;->a:Lax/o4/g;

    .line 21
    .line 22
    iget-object v1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 23
    .line 24
    iput-object v1, v0, Lax/o4/g$N;->b:Lax/o4/g$J;

    .line 25
    .line 26
    invoke-direct {p0, v0, p1}, Lax/o4/k;->D(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, v0, p1}, Lax/o4/k;->S(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0, v0, p1}, Lax/o4/k;->W(Lax/o4/g$n;Lorg/xml/sax/Attributes;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p0, v0, p1}, Lax/o4/k;->C(Lax/o4/g$G;Lorg/xml/sax/Attributes;)V

    .line 36
    .line 37
    .line 38
    const-string v1, "polyline"

    .line 39
    .line 40
    invoke-direct {p0, v0, p1, v1}, Lax/o4/k;->N(Lax/o4/g$z;Lorg/xml/sax/Attributes;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 44
    .line 45
    invoke-interface {p1, v0}, Lax/o4/g$J;->m(Lax/o4/g$N;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_30
    new-instance p1, Lax/o4/j;

    .line 50
    .line 51
    const-string v0, "Invalid document. Root element must be <svg>"

    .line 52
    .line 53
    invoke-direct {p1, v0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private S(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_1
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_58

    .line 7
    .line 8
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-nez v2, :cond_16

    .line 21
    .line 22
    goto :goto_55

    .line 23
    :cond_16
    sget-object v2, Lax/o4/k$a;->b:[I

    .line 24
    .line 25
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-static {v3}, Lax/o4/k$g;->d(Ljava/lang/String;)Lax/o4/k$g;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    aget v2, v2, v3

    .line 38
    .line 39
    const/16 v3, 0x2d

    .line 40
    .line 41
    if-eq v2, v3, :cond_52

    .line 42
    .line 43
    const/16 v3, 0x2e

    .line 44
    .line 45
    if-eq v2, v3, :cond_4b

    .line 46
    .line 47
    iget-object v1, p1, Lax/o4/g$L;->e:Lax/o4/g$E;

    .line 48
    .line 49
    if-nez v1, :cond_39

    .line 50
    .line 51
    new-instance v1, Lax/o4/g$E;

    .line 52
    .line 53
    invoke-direct {v1}, Lax/o4/g$E;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v1, p1, Lax/o4/g$L;->e:Lax/o4/g$E;

    .line 57
    .line 58
    :cond_39
    iget-object v1, p1, Lax/o4/g$L;->e:Lax/o4/g$E;

    .line 59
    .line 60
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-static {v1, v2, v3}, Lax/o4/k;->S0(Lax/o4/g$E;Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    goto :goto_55

    .line 76
    :cond_4b
    invoke-static {v1}, Lax/o4/b;->f(Ljava/lang/String;)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    iput-object v1, p1, Lax/o4/g$L;->g:Ljava/util/List;

    .line 81
    .line 82
    goto :goto_55

    .line 83
    :cond_52
    invoke-static {p1, v1}, Lax/o4/k;->E0(Lax/o4/g$L;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    :goto_55
    add-int/lit8 v0, v0, 0x1

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_58
    return-void
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

.method static S0(Lax/o4/g$E;Ljava/lang/String;Ljava/lang/String;)V
    .registers 8

    .line 1
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_8

    .line 6
    .line 7
    goto/16 :goto_348

    .line 8
    .line 9
    :cond_8
    const-string v0, "inherit"

    .line 10
    .line 11
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_12

    .line 16
    .line 17
    goto/16 :goto_348

    .line 18
    .line 19
    :cond_12
    sget-object v0, Lax/o4/k$a;->b:[I

    .line 20
    .line 21
    invoke-static {p1}, Lax/o4/k$g;->d(Ljava/lang/String;)Lax/o4/k$g;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    aget v0, v0, v1

    .line 30
    .line 31
    const-string v1, "none"

    .line 32
    .line 33
    const-string v2, "SVGParser"

    .line 34
    .line 35
    const-string v3, "currentColor"

    .line 36
    .line 37
    const/16 v4, 0x7c

    .line 38
    .line 39
    packed-switch v0, :pswitch_data_34a

    .line 40
    .line 41
    .line 42
    goto/16 :goto_348

    .line 43
    .line 44
    :pswitch_2b
    invoke-static {p2}, Lax/o4/k;->y0(Ljava/lang/String;)Lax/o4/g$E$e;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iput-object p1, p0, Lax/o4/g$E;->N0:Lax/o4/g$E$e;

    .line 49
    .line 50
    if-eqz p1, :cond_348

    .line 51
    .line 52
    iget-wide p1, p0, Lax/o4/g$E;->q:J

    .line 53
    .line 54
    const-wide v0, 0x2000000000L

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    or-long/2addr p1, v0

    .line 60
    iput-wide p1, p0, Lax/o4/g$E;->q:J

    .line 61
    .line 62
    return-void

    .line 63
    :pswitch_3e
    invoke-static {p2}, Lax/o4/k;->M0(Ljava/lang/String;)Lax/o4/g$E$i;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    iput-object p1, p0, Lax/o4/g$E;->M0:Lax/o4/g$E$i;

    .line 68
    .line 69
    if-eqz p1, :cond_348

    .line 70
    .line 71
    iget-wide p1, p0, Lax/o4/g$E;->q:J

    .line 72
    .line 73
    const-wide v0, 0x800000000L

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    or-long/2addr p1, v0

    .line 79
    iput-wide p1, p0, Lax/o4/g$E;->q:J

    .line 80
    .line 81
    return-void

    .line 82
    :pswitch_51
    invoke-static {p2}, Lax/o4/k;->r0(Ljava/lang/String;)Ljava/lang/Float;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    iput-object p1, p0, Lax/o4/g$E;->L0:Ljava/lang/Float;

    .line 87
    .line 88
    iget-wide p1, p0, Lax/o4/g$E;->q:J

    .line 89
    .line 90
    const-wide v0, 0x400000000L

    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    or-long/2addr p1, v0

    .line 96
    iput-wide p1, p0, Lax/o4/g$E;->q:J

    .line 97
    .line 98
    return-void

    .line 99
    :pswitch_62
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    if-eqz p1, :cond_6f

    .line 104
    .line 105
    invoke-static {}, Lax/o4/g$g;->b()Lax/o4/g$g;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    iput-object p1, p0, Lax/o4/g$E;->K0:Lax/o4/g$O;

    .line 110
    .line 111
    goto :goto_75

    .line 112
    :cond_6f
    :try_start_6f
    invoke-static {p2}, Lax/o4/k;->b0(Ljava/lang/String;)Lax/o4/g$f;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    iput-object p1, p0, Lax/o4/g$E;->K0:Lax/o4/g$O;
    :try_end_75
    .catch Lax/o4/j; {:try_start_6f .. :try_end_75} :catch_80

    .line 117
    .line 118
    :goto_75
    iget-wide p1, p0, Lax/o4/g$E;->q:J

    .line 119
    .line 120
    const-wide v0, 0x200000000L

    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    or-long/2addr p1, v0

    .line 126
    iput-wide p1, p0, Lax/o4/g$E;->q:J

    .line 127
    .line 128
    return-void

    .line 129
    :catch_80
    move-exception p0

    .line 130
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-static {v2, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 135
    .line 136
    .line 137
    goto/16 :goto_348

    .line 138
    .line 139
    :pswitch_8a
    invoke-static {p2}, Lax/o4/k;->r0(Ljava/lang/String;)Ljava/lang/Float;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    iput-object p1, p0, Lax/o4/g$E;->J0:Ljava/lang/Float;

    .line 144
    .line 145
    iget-wide p1, p0, Lax/o4/g$E;->q:J

    .line 146
    .line 147
    const-wide v0, 0x100000000L

    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    or-long/2addr p1, v0

    .line 153
    iput-wide p1, p0, Lax/o4/g$E;->q:J

    .line 154
    .line 155
    return-void

    .line 156
    :pswitch_9b
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result p1

    .line 160
    if-eqz p1, :cond_a8

    .line 161
    .line 162
    invoke-static {}, Lax/o4/g$g;->b()Lax/o4/g$g;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    iput-object p1, p0, Lax/o4/g$E;->I0:Lax/o4/g$O;

    .line 167
    .line 168
    goto :goto_ae

    .line 169
    :cond_a8
    :try_start_a8
    invoke-static {p2}, Lax/o4/k;->b0(Ljava/lang/String;)Lax/o4/g$f;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    iput-object p1, p0, Lax/o4/g$E;->I0:Lax/o4/g$O;
    :try_end_ae
    .catch Lax/o4/j; {:try_start_a8 .. :try_end_ae} :catch_b9

    .line 174
    .line 175
    :goto_ae
    iget-wide p1, p0, Lax/o4/g$E;->q:J

    .line 176
    .line 177
    const-wide v0, 0x80000000L

    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    or-long/2addr p1, v0

    .line 183
    iput-wide p1, p0, Lax/o4/g$E;->q:J

    .line 184
    .line 185
    return-void

    .line 186
    :catch_b9
    move-exception p0

    .line 187
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    invoke-static {v2, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 192
    .line 193
    .line 194
    goto/16 :goto_348

    .line 195
    .line 196
    :pswitch_c3
    invoke-static {p2, p1}, Lax/o4/k;->m0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    iput-object p1, p0, Lax/o4/g$E;->H0:Ljava/lang/String;

    .line 201
    .line 202
    iget-wide p1, p0, Lax/o4/g$E;->q:J

    .line 203
    .line 204
    const-wide/32 v0, 0x40000000

    .line 205
    .line 206
    .line 207
    or-long/2addr p1, v0

    .line 208
    iput-wide p1, p0, Lax/o4/g$E;->q:J

    .line 209
    .line 210
    return-void

    .line 211
    :pswitch_d2
    invoke-static {p2}, Lax/o4/k;->e0(Ljava/lang/String;)Lax/o4/g$E$a;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    iput-object p1, p0, Lax/o4/g$E;->G0:Lax/o4/g$E$a;

    .line 216
    .line 217
    iget-wide p1, p0, Lax/o4/g$E;->q:J

    .line 218
    .line 219
    const-wide/32 v0, 0x20000000

    .line 220
    .line 221
    .line 222
    or-long/2addr p1, v0

    .line 223
    iput-wide p1, p0, Lax/o4/g$E;->q:J

    .line 224
    .line 225
    return-void

    .line 226
    :pswitch_e1
    invoke-static {p2, p1}, Lax/o4/k;->m0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    iput-object p1, p0, Lax/o4/g$E;->F0:Ljava/lang/String;

    .line 231
    .line 232
    iget-wide p1, p0, Lax/o4/g$E;->q:J

    .line 233
    .line 234
    const-wide/32 v0, 0x10000000

    .line 235
    .line 236
    .line 237
    or-long/2addr p1, v0

    .line 238
    iput-wide p1, p0, Lax/o4/g$E;->q:J

    .line 239
    .line 240
    return-void

    .line 241
    :pswitch_f0
    invoke-static {p2}, Lax/o4/k;->a0(Ljava/lang/String;)Lax/o4/g$c;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    iput-object p1, p0, Lax/o4/g$E;->x0:Lax/o4/g$c;

    .line 246
    .line 247
    if-eqz p1, :cond_348

    .line 248
    .line 249
    iget-wide p1, p0, Lax/o4/g$E;->q:J

    .line 250
    .line 251
    const-wide/32 v0, 0x100000

    .line 252
    .line 253
    .line 254
    or-long/2addr p1, v0

    .line 255
    iput-wide p1, p0, Lax/o4/g$E;->q:J

    .line 256
    .line 257
    return-void

    .line 258
    :pswitch_101
    invoke-static {p2}, Lax/o4/k;->r0(Ljava/lang/String;)Ljava/lang/Float;

    .line 259
    .line 260
    .line 261
    move-result-object p1

    .line 262
    iput-object p1, p0, Lax/o4/g$E;->E0:Ljava/lang/Float;

    .line 263
    .line 264
    iget-wide p1, p0, Lax/o4/g$E;->q:J

    .line 265
    .line 266
    const-wide/32 v0, 0x8000000

    .line 267
    .line 268
    .line 269
    or-long/2addr p1, v0

    .line 270
    iput-wide p1, p0, Lax/o4/g$E;->q:J

    .line 271
    .line 272
    return-void

    .line 273
    :pswitch_110
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result p1

    .line 277
    if-eqz p1, :cond_11d

    .line 278
    .line 279
    invoke-static {}, Lax/o4/g$g;->b()Lax/o4/g$g;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    iput-object p1, p0, Lax/o4/g$E;->D0:Lax/o4/g$O;

    .line 284
    .line 285
    goto :goto_123

    .line 286
    :cond_11d
    :try_start_11d
    invoke-static {p2}, Lax/o4/k;->b0(Ljava/lang/String;)Lax/o4/g$f;

    .line 287
    .line 288
    .line 289
    move-result-object p1

    .line 290
    iput-object p1, p0, Lax/o4/g$E;->D0:Lax/o4/g$O;
    :try_end_123
    .catch Lax/o4/j; {:try_start_11d .. :try_end_123} :catch_12c

    .line 291
    .line 292
    :goto_123
    iget-wide p1, p0, Lax/o4/g$E;->q:J

    .line 293
    .line 294
    const-wide/32 v0, 0x4000000

    .line 295
    .line 296
    .line 297
    or-long/2addr p1, v0

    .line 298
    iput-wide p1, p0, Lax/o4/g$E;->q:J

    .line 299
    .line 300
    return-void

    .line 301
    :catch_12c
    move-exception p0

    .line 302
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object p0

    .line 306
    invoke-static {v2, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 307
    .line 308
    .line 309
    goto/16 :goto_348

    .line 310
    .line 311
    :pswitch_136
    invoke-virtual {p2, v4}, Ljava/lang/String;->indexOf(I)I

    .line 312
    .line 313
    .line 314
    move-result p1

    .line 315
    if-gez p1, :cond_348

    .line 316
    .line 317
    new-instance p1, Ljava/lang/StringBuilder;

    .line 318
    .line 319
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 320
    .line 321
    .line 322
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object p1

    .line 335
    const-string v0, "|visible|hidden|collapse|"

    .line 336
    .line 337
    invoke-virtual {v0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 338
    .line 339
    .line 340
    move-result p1

    .line 341
    if-nez p1, :cond_158

    .line 342
    .line 343
    goto/16 :goto_348

    .line 344
    .line 345
    :cond_158
    const-string p1, "visible"

    .line 346
    .line 347
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    move-result p1

    .line 351
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 352
    .line 353
    .line 354
    move-result-object p1

    .line 355
    iput-object p1, p0, Lax/o4/g$E;->C0:Ljava/lang/Boolean;

    .line 356
    .line 357
    iget-wide p1, p0, Lax/o4/g$E;->q:J

    .line 358
    .line 359
    const-wide/32 v0, 0x2000000

    .line 360
    .line 361
    .line 362
    or-long/2addr p1, v0

    .line 363
    iput-wide p1, p0, Lax/o4/g$E;->q:J

    .line 364
    .line 365
    return-void

    .line 366
    :pswitch_16d
    invoke-virtual {p2, v4}, Ljava/lang/String;->indexOf(I)I

    .line 367
    .line 368
    .line 369
    move-result p1

    .line 370
    if-gez p1, :cond_348

    .line 371
    .line 372
    new-instance p1, Ljava/lang/StringBuilder;

    .line 373
    .line 374
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 375
    .line 376
    .line 377
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 378
    .line 379
    .line 380
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 381
    .line 382
    .line 383
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 384
    .line 385
    .line 386
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object p1

    .line 390
    const-string v0, "|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|"

    .line 391
    .line 392
    invoke-virtual {v0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 393
    .line 394
    .line 395
    move-result p1

    .line 396
    if-nez p1, :cond_18f

    .line 397
    .line 398
    goto/16 :goto_348

    .line 399
    .line 400
    :cond_18f
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    move-result p1

    .line 404
    xor-int/lit8 p1, p1, 0x1

    .line 405
    .line 406
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 407
    .line 408
    .line 409
    move-result-object p1

    .line 410
    iput-object p1, p0, Lax/o4/g$E;->B0:Ljava/lang/Boolean;

    .line 411
    .line 412
    iget-wide p1, p0, Lax/o4/g$E;->q:J

    .line 413
    .line 414
    const-wide/32 v0, 0x1000000

    .line 415
    .line 416
    .line 417
    or-long/2addr p1, v0

    .line 418
    iput-wide p1, p0, Lax/o4/g$E;->q:J

    .line 419
    .line 420
    return-void

    .line 421
    :pswitch_1a4
    invoke-static {p2, p1}, Lax/o4/k;->m0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object p1

    .line 425
    iput-object p1, p0, Lax/o4/g$E;->A0:Ljava/lang/String;

    .line 426
    .line 427
    iget-wide p1, p0, Lax/o4/g$E;->q:J

    .line 428
    .line 429
    const-wide/32 v0, 0x800000

    .line 430
    .line 431
    .line 432
    or-long/2addr p1, v0

    .line 433
    iput-wide p1, p0, Lax/o4/g$E;->q:J

    .line 434
    .line 435
    return-void

    .line 436
    :pswitch_1b3
    invoke-static {p2, p1}, Lax/o4/k;->m0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object p1

    .line 440
    iput-object p1, p0, Lax/o4/g$E;->z0:Ljava/lang/String;

    .line 441
    .line 442
    iget-wide p1, p0, Lax/o4/g$E;->q:J

    .line 443
    .line 444
    const-wide/32 v0, 0x400000

    .line 445
    .line 446
    .line 447
    or-long/2addr p1, v0

    .line 448
    iput-wide p1, p0, Lax/o4/g$E;->q:J

    .line 449
    .line 450
    return-void

    .line 451
    :pswitch_1c2
    invoke-static {p2, p1}, Lax/o4/k;->m0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object p1

    .line 455
    iput-object p1, p0, Lax/o4/g$E;->y0:Ljava/lang/String;

    .line 456
    .line 457
    iget-wide p1, p0, Lax/o4/g$E;->q:J

    .line 458
    .line 459
    const-wide/32 v0, 0x200000

    .line 460
    .line 461
    .line 462
    or-long/2addr p1, v0

    .line 463
    iput-wide p1, p0, Lax/o4/g$E;->q:J

    .line 464
    .line 465
    return-void

    .line 466
    :pswitch_1d1
    invoke-static {p2, p1}, Lax/o4/k;->m0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object p1

    .line 470
    iput-object p1, p0, Lax/o4/g$E;->y0:Ljava/lang/String;

    .line 471
    .line 472
    iput-object p1, p0, Lax/o4/g$E;->z0:Ljava/lang/String;

    .line 473
    .line 474
    iput-object p1, p0, Lax/o4/g$E;->A0:Ljava/lang/String;

    .line 475
    .line 476
    iget-wide p1, p0, Lax/o4/g$E;->q:J

    .line 477
    .line 478
    const-wide/32 v0, 0xe00000

    .line 479
    .line 480
    .line 481
    or-long/2addr p1, v0

    .line 482
    iput-wide p1, p0, Lax/o4/g$E;->q:J

    .line 483
    .line 484
    return-void

    .line 485
    :pswitch_1e4
    invoke-static {p2}, Lax/o4/k;->s0(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 486
    .line 487
    .line 488
    move-result-object p1

    .line 489
    iput-object p1, p0, Lax/o4/g$E;->w0:Ljava/lang/Boolean;

    .line 490
    .line 491
    if-eqz p1, :cond_348

    .line 492
    .line 493
    iget-wide p1, p0, Lax/o4/g$E;->q:J

    .line 494
    .line 495
    const-wide/32 v0, 0x80000

    .line 496
    .line 497
    .line 498
    or-long/2addr p1, v0

    .line 499
    iput-wide p1, p0, Lax/o4/g$E;->q:J

    .line 500
    .line 501
    return-void

    .line 502
    :pswitch_1f5
    invoke-static {p2}, Lax/o4/k;->G0(Ljava/lang/String;)Lax/o4/g$E$f;

    .line 503
    .line 504
    .line 505
    move-result-object p1

    .line 506
    iput-object p1, p0, Lax/o4/g$E;->v0:Lax/o4/g$E$f;

    .line 507
    .line 508
    if-eqz p1, :cond_348

    .line 509
    .line 510
    iget-wide p1, p0, Lax/o4/g$E;->q:J

    .line 511
    .line 512
    const-wide/32 v0, 0x40000

    .line 513
    .line 514
    .line 515
    or-long/2addr p1, v0

    .line 516
    iput-wide p1, p0, Lax/o4/g$E;->q:J

    .line 517
    .line 518
    return-void

    .line 519
    :pswitch_206
    invoke-static {p2}, Lax/o4/k;->I0(Ljava/lang/String;)Lax/o4/g$E$h;

    .line 520
    .line 521
    .line 522
    move-result-object p1

    .line 523
    iput-object p1, p0, Lax/o4/g$E;->u0:Lax/o4/g$E$h;

    .line 524
    .line 525
    if-eqz p1, :cond_348

    .line 526
    .line 527
    iget-wide p1, p0, Lax/o4/g$E;->q:J

    .line 528
    .line 529
    const-wide v0, 0x1000000000L

    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    or-long/2addr p1, v0

    .line 535
    iput-wide p1, p0, Lax/o4/g$E;->q:J

    .line 536
    .line 537
    return-void

    .line 538
    :pswitch_219
    invoke-static {p2}, Lax/o4/k;->H0(Ljava/lang/String;)Lax/o4/g$E$g;

    .line 539
    .line 540
    .line 541
    move-result-object p1

    .line 542
    iput-object p1, p0, Lax/o4/g$E;->t0:Lax/o4/g$E$g;

    .line 543
    .line 544
    if-eqz p1, :cond_348

    .line 545
    .line 546
    iget-wide p1, p0, Lax/o4/g$E;->q:J

    .line 547
    .line 548
    const-wide/32 v0, 0x20000

    .line 549
    .line 550
    .line 551
    or-long/2addr p1, v0

    .line 552
    iput-wide p1, p0, Lax/o4/g$E;->q:J

    .line 553
    .line 554
    return-void

    .line 555
    :pswitch_22a
    invoke-static {p2}, Lax/o4/k;->k0(Ljava/lang/String;)Lax/o4/g$E$b;

    .line 556
    .line 557
    .line 558
    move-result-object p1

    .line 559
    iput-object p1, p0, Lax/o4/g$E;->s0:Lax/o4/g$E$b;

    .line 560
    .line 561
    if-eqz p1, :cond_348

    .line 562
    .line 563
    iget-wide p1, p0, Lax/o4/g$E;->q:J

    .line 564
    .line 565
    const-wide/32 v0, 0x10000

    .line 566
    .line 567
    .line 568
    or-long/2addr p1, v0

    .line 569
    iput-wide p1, p0, Lax/o4/g$E;->q:J

    .line 570
    .line 571
    return-void

    .line 572
    :pswitch_23b
    invoke-static {p2}, Lax/o4/k;->l0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 573
    .line 574
    .line 575
    move-result-object p1

    .line 576
    iput-object p1, p0, Lax/o4/g$E;->r0:Ljava/lang/Integer;

    .line 577
    .line 578
    if-eqz p1, :cond_348

    .line 579
    .line 580
    iget-wide p1, p0, Lax/o4/g$E;->q:J

    .line 581
    .line 582
    const-wide/32 v0, 0x8000

    .line 583
    .line 584
    .line 585
    or-long/2addr p1, v0

    .line 586
    iput-wide p1, p0, Lax/o4/g$E;->q:J

    .line 587
    .line 588
    return-void

    .line 589
    :pswitch_24c
    invoke-static {p2}, Lax/o4/k;->j0(Ljava/lang/String;)Lax/o4/g$p;

    .line 590
    .line 591
    .line 592
    move-result-object p1

    .line 593
    iput-object p1, p0, Lax/o4/g$E;->q0:Lax/o4/g$p;

    .line 594
    .line 595
    if-eqz p1, :cond_348

    .line 596
    .line 597
    iget-wide p1, p0, Lax/o4/g$E;->q:J

    .line 598
    .line 599
    const-wide/16 v0, 0x4000

    .line 600
    .line 601
    or-long/2addr p1, v0

    .line 602
    iput-wide p1, p0, Lax/o4/g$E;->q:J

    .line 603
    .line 604
    return-void

    .line 605
    :pswitch_25c
    invoke-static {p2}, Lax/o4/k;->i0(Ljava/lang/String;)Ljava/util/List;

    .line 606
    .line 607
    .line 608
    move-result-object p1

    .line 609
    iput-object p1, p0, Lax/o4/g$E;->p0:Ljava/util/List;

    .line 610
    .line 611
    if-eqz p1, :cond_348

    .line 612
    .line 613
    iget-wide p1, p0, Lax/o4/g$E;->q:J

    .line 614
    .line 615
    const-wide/16 v0, 0x2000

    .line 616
    .line 617
    or-long/2addr p1, v0

    .line 618
    iput-wide p1, p0, Lax/o4/g$E;->q:J

    .line 619
    .line 620
    return-void

    .line 621
    :pswitch_26c
    invoke-static {p0, p2}, Lax/o4/k;->h0(Lax/o4/g$E;Ljava/lang/String;)V

    .line 622
    .line 623
    .line 624
    return-void

    .line 625
    :pswitch_270
    :try_start_270
    invoke-static {p2}, Lax/o4/k;->b0(Ljava/lang/String;)Lax/o4/g$f;

    .line 626
    .line 627
    .line 628
    move-result-object p1

    .line 629
    iput-object p1, p0, Lax/o4/g$E;->o0:Lax/o4/g$f;

    .line 630
    .line 631
    iget-wide p1, p0, Lax/o4/g$E;->q:J

    .line 632
    .line 633
    const-wide/16 v0, 0x1000

    .line 634
    .line 635
    or-long/2addr p1, v0

    .line 636
    iput-wide p1, p0, Lax/o4/g$E;->q:J
    :try_end_27d
    .catch Lax/o4/j; {:try_start_270 .. :try_end_27d} :catch_348

    .line 637
    .line 638
    return-void

    .line 639
    :pswitch_27e
    invoke-static {p2}, Lax/o4/k;->r0(Ljava/lang/String;)Ljava/lang/Float;

    .line 640
    .line 641
    .line 642
    move-result-object p1

    .line 643
    iput-object p1, p0, Lax/o4/g$E;->n0:Ljava/lang/Float;

    .line 644
    .line 645
    iget-wide p1, p0, Lax/o4/g$E;->q:J

    .line 646
    .line 647
    const-wide/16 v0, 0x800

    .line 648
    .line 649
    or-long/2addr p1, v0

    .line 650
    iput-wide p1, p0, Lax/o4/g$E;->q:J

    .line 651
    .line 652
    return-void

    .line 653
    :pswitch_28c
    :try_start_28c
    invoke-static {p2}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 654
    .line 655
    .line 656
    move-result-object p1

    .line 657
    iput-object p1, p0, Lax/o4/g$E;->m0:Lax/o4/g$p;

    .line 658
    .line 659
    iget-wide p1, p0, Lax/o4/g$E;->q:J

    .line 660
    .line 661
    const-wide/16 v0, 0x400

    .line 662
    .line 663
    or-long/2addr p1, v0

    .line 664
    iput-wide p1, p0, Lax/o4/g$E;->q:J
    :try_end_299
    .catch Lax/o4/j; {:try_start_28c .. :try_end_299} :catch_348

    .line 665
    .line 666
    return-void

    .line 667
    :pswitch_29a
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 668
    .line 669
    .line 670
    move-result p1

    .line 671
    const-wide/16 v0, 0x200

    .line 672
    .line 673
    if-eqz p1, :cond_2ab

    .line 674
    .line 675
    const/4 p1, 0x0

    .line 676
    iput-object p1, p0, Lax/o4/g$E;->l0:[Lax/o4/g$p;

    .line 677
    .line 678
    iget-wide p1, p0, Lax/o4/g$E;->q:J

    .line 679
    .line 680
    or-long/2addr p1, v0

    .line 681
    iput-wide p1, p0, Lax/o4/g$E;->q:J

    .line 682
    .line 683
    return-void

    .line 684
    :cond_2ab
    invoke-static {p2}, Lax/o4/k;->B0(Ljava/lang/String;)[Lax/o4/g$p;

    .line 685
    .line 686
    .line 687
    move-result-object p1

    .line 688
    iput-object p1, p0, Lax/o4/g$E;->l0:[Lax/o4/g$p;

    .line 689
    .line 690
    if-eqz p1, :cond_348

    .line 691
    .line 692
    iget-wide p1, p0, Lax/o4/g$E;->q:J

    .line 693
    .line 694
    or-long/2addr p1, v0

    .line 695
    iput-wide p1, p0, Lax/o4/g$E;->q:J

    .line 696
    .line 697
    return-void

    .line 698
    :pswitch_2b9
    :try_start_2b9
    invoke-static {p2}, Lax/o4/k;->f0(Ljava/lang/String;)F

    .line 699
    .line 700
    .line 701
    move-result p1

    .line 702
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 703
    .line 704
    .line 705
    move-result-object p1

    .line 706
    iput-object p1, p0, Lax/o4/g$E;->k0:Ljava/lang/Float;

    .line 707
    .line 708
    iget-wide p1, p0, Lax/o4/g$E;->q:J

    .line 709
    .line 710
    const-wide/16 v0, 0x100

    .line 711
    .line 712
    or-long/2addr p1, v0

    .line 713
    iput-wide p1, p0, Lax/o4/g$E;->q:J
    :try_end_2ca
    .catch Lax/o4/j; {:try_start_2b9 .. :try_end_2ca} :catch_348

    .line 714
    .line 715
    return-void

    .line 716
    :pswitch_2cb
    invoke-static {p2}, Lax/o4/k;->D0(Ljava/lang/String;)Lax/o4/g$E$d;

    .line 717
    .line 718
    .line 719
    move-result-object p1

    .line 720
    iput-object p1, p0, Lax/o4/g$E;->j0:Lax/o4/g$E$d;

    .line 721
    .line 722
    if-eqz p1, :cond_348

    .line 723
    .line 724
    iget-wide p1, p0, Lax/o4/g$E;->q:J

    .line 725
    .line 726
    const-wide/16 v0, 0x80

    .line 727
    .line 728
    or-long/2addr p1, v0

    .line 729
    iput-wide p1, p0, Lax/o4/g$E;->q:J

    .line 730
    .line 731
    return-void

    .line 732
    :pswitch_2db
    invoke-static {p2}, Lax/o4/k;->C0(Ljava/lang/String;)Lax/o4/g$E$c;

    .line 733
    .line 734
    .line 735
    move-result-object p1

    .line 736
    iput-object p1, p0, Lax/o4/g$E;->i0:Lax/o4/g$E$c;

    .line 737
    .line 738
    if-eqz p1, :cond_348

    .line 739
    .line 740
    iget-wide p1, p0, Lax/o4/g$E;->q:J

    .line 741
    .line 742
    const-wide/16 v0, 0x40

    .line 743
    .line 744
    or-long/2addr p1, v0

    .line 745
    iput-wide p1, p0, Lax/o4/g$E;->q:J

    .line 746
    .line 747
    return-void

    .line 748
    :pswitch_2eb
    :try_start_2eb
    invoke-static {p2}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 749
    .line 750
    .line 751
    move-result-object p1

    .line 752
    iput-object p1, p0, Lax/o4/g$E;->h0:Lax/o4/g$p;

    .line 753
    .line 754
    iget-wide p1, p0, Lax/o4/g$E;->q:J

    .line 755
    .line 756
    const-wide/16 v0, 0x20

    .line 757
    .line 758
    or-long/2addr p1, v0

    .line 759
    iput-wide p1, p0, Lax/o4/g$E;->q:J
    :try_end_2f8
    .catch Lax/o4/j; {:try_start_2eb .. :try_end_2f8} :catch_348

    .line 760
    .line 761
    return-void

    .line 762
    :pswitch_2f9
    invoke-static {p2}, Lax/o4/k;->r0(Ljava/lang/String;)Ljava/lang/Float;

    .line 763
    .line 764
    .line 765
    move-result-object p1

    .line 766
    iput-object p1, p0, Lax/o4/g$E;->g0:Ljava/lang/Float;

    .line 767
    .line 768
    if-eqz p1, :cond_348

    .line 769
    .line 770
    iget-wide p1, p0, Lax/o4/g$E;->q:J

    .line 771
    .line 772
    const-wide/16 v0, 0x10

    .line 773
    .line 774
    or-long/2addr p1, v0

    .line 775
    iput-wide p1, p0, Lax/o4/g$E;->q:J

    .line 776
    .line 777
    return-void

    .line 778
    :pswitch_309
    invoke-static {p2}, Lax/o4/k;->t0(Ljava/lang/String;)Lax/o4/g$O;

    .line 779
    .line 780
    .line 781
    move-result-object p1

    .line 782
    iput-object p1, p0, Lax/o4/g$E;->f0:Lax/o4/g$O;

    .line 783
    .line 784
    if-eqz p1, :cond_348

    .line 785
    .line 786
    iget-wide p1, p0, Lax/o4/g$E;->q:J

    .line 787
    .line 788
    const-wide/16 v0, 0x8

    .line 789
    .line 790
    or-long/2addr p1, v0

    .line 791
    iput-wide p1, p0, Lax/o4/g$E;->q:J

    .line 792
    .line 793
    return-void

    .line 794
    :pswitch_319
    invoke-static {p2}, Lax/o4/k;->r0(Ljava/lang/String;)Ljava/lang/Float;

    .line 795
    .line 796
    .line 797
    move-result-object p1

    .line 798
    iput-object p1, p0, Lax/o4/g$E;->e0:Ljava/lang/Float;

    .line 799
    .line 800
    if-eqz p1, :cond_348

    .line 801
    .line 802
    iget-wide p1, p0, Lax/o4/g$E;->q:J

    .line 803
    .line 804
    const-wide/16 v0, 0x4

    .line 805
    .line 806
    or-long/2addr p1, v0

    .line 807
    iput-wide p1, p0, Lax/o4/g$E;->q:J

    .line 808
    .line 809
    return-void

    .line 810
    :pswitch_329
    invoke-static {p2}, Lax/o4/k;->e0(Ljava/lang/String;)Lax/o4/g$E$a;

    .line 811
    .line 812
    .line 813
    move-result-object p1

    .line 814
    iput-object p1, p0, Lax/o4/g$E;->d0:Lax/o4/g$E$a;

    .line 815
    .line 816
    if-eqz p1, :cond_348

    .line 817
    .line 818
    iget-wide p1, p0, Lax/o4/g$E;->q:J

    .line 819
    .line 820
    const-wide/16 v0, 0x2

    .line 821
    .line 822
    or-long/2addr p1, v0

    .line 823
    iput-wide p1, p0, Lax/o4/g$E;->q:J

    .line 824
    .line 825
    return-void

    .line 826
    :pswitch_339
    invoke-static {p2}, Lax/o4/k;->t0(Ljava/lang/String;)Lax/o4/g$O;

    .line 827
    .line 828
    .line 829
    move-result-object p1

    .line 830
    iput-object p1, p0, Lax/o4/g$E;->c0:Lax/o4/g$O;

    .line 831
    .line 832
    if-eqz p1, :cond_348

    .line 833
    .line 834
    iget-wide p1, p0, Lax/o4/g$E;->q:J

    .line 835
    .line 836
    const-wide/16 v0, 0x1

    .line 837
    .line 838
    or-long/2addr p1, v0

    .line 839
    iput-wide p1, p0, Lax/o4/g$E;->q:J

    .line 840
    .line 841
    :catch_348
    :cond_348
    :goto_348
    return-void

    .line 842
    nop

    .line 843
    :pswitch_data_34a
    .packed-switch 0x2f
        :pswitch_339
        :pswitch_329
        :pswitch_319
        :pswitch_309
        :pswitch_2f9
        :pswitch_2eb
        :pswitch_2db
        :pswitch_2cb
        :pswitch_2b9
        :pswitch_29a
        :pswitch_28c
        :pswitch_27e
        :pswitch_270
        :pswitch_26c
        :pswitch_25c
        :pswitch_24c
        :pswitch_23b
        :pswitch_22a
        :pswitch_219
        :pswitch_206
        :pswitch_1f5
        :pswitch_1e4
        :pswitch_1d1
        :pswitch_1c2
        :pswitch_1b3
        :pswitch_1a4
        :pswitch_16d
        :pswitch_136
        :pswitch_110
        :pswitch_101
        :pswitch_f0
        :pswitch_e1
        :pswitch_d2
        :pswitch_c3
        :pswitch_9b
        :pswitch_8a
        :pswitch_62
        :pswitch_51
        :pswitch_3e
        :pswitch_2b
    .end packed-switch
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
.end method

.method private T(Lax/o4/g$U;Lorg/xml/sax/Attributes;)V
    .registers 7

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_1
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_40

    .line 7
    .line 8
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sget-object v2, Lax/o4/k$a;->b:[I

    .line 17
    .line 18
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-static {v3}, Lax/o4/k$g;->d(Ljava/lang/String;)Lax/o4/k$g;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    aget v2, v2, v3

    .line 31
    .line 32
    const/4 v3, 0x6

    .line 33
    if-eq v2, v3, :cond_23

    .line 34
    .line 35
    goto :goto_3d

    .line 36
    :cond_23
    const-string v2, ""

    .line 37
    .line 38
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-nez v2, :cond_3b

    .line 47
    .line 48
    const-string v2, "http://www.w3.org/1999/xlink"

    .line 49
    .line 50
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_3d

    .line 59
    .line 60
    :cond_3b
    iput-object v1, p1, Lax/o4/g$U;->o:Ljava/lang/String;

    .line 61
    .line 62
    :cond_3d
    :goto_3d
    add-int/lit8 v0, v0, 0x1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_40
    return-void
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

.method private T0(Lorg/xml/sax/Attributes;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v1, "<radialGradient>"

    .line 5
    .line 6
    invoke-direct {p0, v1, v0}, Lax/o4/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 10
    .line 11
    if-eqz v0, :cond_2d

    .line 12
    .line 13
    new-instance v0, Lax/o4/g$Q;

    .line 14
    .line 15
    invoke-direct {v0}, Lax/o4/g$Q;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lax/o4/k;->a:Lax/o4/g;

    .line 19
    .line 20
    iput-object v1, v0, Lax/o4/g$N;->a:Lax/o4/g;

    .line 21
    .line 22
    iget-object v1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 23
    .line 24
    iput-object v1, v0, Lax/o4/g$N;->b:Lax/o4/g$J;

    .line 25
    .line 26
    invoke-direct {p0, v0, p1}, Lax/o4/k;->D(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, v0, p1}, Lax/o4/k;->S(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0, v0, p1}, Lax/o4/k;->F(Lax/o4/g$j;Lorg/xml/sax/Attributes;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p0, v0, p1}, Lax/o4/k;->O(Lax/o4/g$Q;Lorg/xml/sax/Attributes;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 39
    .line 40
    invoke-interface {p1, v0}, Lax/o4/g$J;->m(Lax/o4/g$N;)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 44
    .line 45
    return-void

    .line 46
    :cond_2d
    new-instance p1, Lax/o4/j;

    .line 47
    .line 48
    const-string v0, "Invalid document. Root element must be <svg>"

    .line 49
    .line 50
    invoke-direct {p1, v0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private U(Lax/o4/g$Z;Lorg/xml/sax/Attributes;)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_1
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_4b

    .line 7
    .line 8
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sget-object v2, Lax/o4/k$a;->b:[I

    .line 17
    .line 18
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-static {v3}, Lax/o4/k$g;->d(Ljava/lang/String;)Lax/o4/k$g;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    aget v2, v2, v3

    .line 31
    .line 32
    const/4 v3, 0x6

    .line 33
    if-eq v2, v3, :cond_2e

    .line 34
    .line 35
    const/16 v3, 0x27

    .line 36
    .line 37
    if-eq v2, v3, :cond_27

    .line 38
    .line 39
    goto :goto_48

    .line 40
    :cond_27
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iput-object v1, p1, Lax/o4/g$Z;->p:Lax/o4/g$p;

    .line 45
    .line 46
    goto :goto_48

    .line 47
    :cond_2e
    const-string v2, ""

    .line 48
    .line 49
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-nez v2, :cond_46

    .line 58
    .line 59
    const-string v2, "http://www.w3.org/1999/xlink"

    .line 60
    .line 61
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_48

    .line 70
    .line 71
    :cond_46
    iput-object v1, p1, Lax/o4/g$Z;->o:Ljava/lang/String;

    .line 72
    .line 73
    :cond_48
    :goto_48
    add-int/lit8 v0, v0, 0x1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_4b
    return-void
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

.method private U0(Lorg/xml/sax/Attributes;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v1, "<rect>"

    .line 5
    .line 6
    invoke-direct {p0, v1, v0}, Lax/o4/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 10
    .line 11
    if-eqz v0, :cond_2e

    .line 12
    .line 13
    new-instance v0, Lax/o4/g$B;

    .line 14
    .line 15
    invoke-direct {v0}, Lax/o4/g$B;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lax/o4/k;->a:Lax/o4/g;

    .line 19
    .line 20
    iput-object v1, v0, Lax/o4/g$N;->a:Lax/o4/g;

    .line 21
    .line 22
    iget-object v1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 23
    .line 24
    iput-object v1, v0, Lax/o4/g$N;->b:Lax/o4/g$J;

    .line 25
    .line 26
    invoke-direct {p0, v0, p1}, Lax/o4/k;->D(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, v0, p1}, Lax/o4/k;->S(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0, v0, p1}, Lax/o4/k;->W(Lax/o4/g$n;Lorg/xml/sax/Attributes;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p0, v0, p1}, Lax/o4/k;->C(Lax/o4/g$G;Lorg/xml/sax/Attributes;)V

    .line 36
    .line 37
    .line 38
    invoke-direct {p0, v0, p1}, Lax/o4/k;->P(Lax/o4/g$B;Lorg/xml/sax/Attributes;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 42
    .line 43
    invoke-interface {p1, v0}, Lax/o4/g$J;->m(Lax/o4/g$N;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_2e
    new-instance p1, Lax/o4/j;

    .line 48
    .line 49
    const-string v0, "Invalid document. Root element must be <svg>"

    .line 50
    .line 51
    invoke-direct {p1, v0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private V(Lax/o4/g$a0;Lorg/xml/sax/Attributes;)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_1
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_4c

    .line 7
    .line 8
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sget-object v2, Lax/o4/k$a;->b:[I

    .line 17
    .line 18
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-static {v3}, Lax/o4/k$g;->d(Ljava/lang/String;)Lax/o4/k$g;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    aget v2, v2, v3

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    if-eq v2, v3, :cond_43

    .line 34
    .line 35
    const/4 v3, 0x2

    .line 36
    if-eq v2, v3, :cond_3c

    .line 37
    .line 38
    const/16 v3, 0x13

    .line 39
    .line 40
    if-eq v2, v3, :cond_35

    .line 41
    .line 42
    const/16 v3, 0x14

    .line 43
    .line 44
    if-eq v2, v3, :cond_2e

    .line 45
    .line 46
    goto :goto_49

    .line 47
    :cond_2e
    invoke-static {v1}, Lax/o4/k;->p0(Ljava/lang/String;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    iput-object v1, p1, Lax/o4/g$a0;->r:Ljava/util/List;

    .line 52
    .line 53
    goto :goto_49

    .line 54
    :cond_35
    invoke-static {v1}, Lax/o4/k;->p0(Ljava/lang/String;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    iput-object v1, p1, Lax/o4/g$a0;->q:Ljava/util/List;

    .line 59
    .line 60
    goto :goto_49

    .line 61
    :cond_3c
    invoke-static {v1}, Lax/o4/k;->p0(Ljava/lang/String;)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    iput-object v1, p1, Lax/o4/g$a0;->p:Ljava/util/List;

    .line 66
    .line 67
    goto :goto_49

    .line 68
    :cond_43
    invoke-static {v1}, Lax/o4/k;->p0(Ljava/lang/String;)Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    iput-object v1, p1, Lax/o4/g$a0;->o:Ljava/util/List;

    .line 73
    .line 74
    :goto_49
    add-int/lit8 v0, v0, 0x1

    .line 75
    .line 76
    goto :goto_1

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

.method private V0(Lorg/xml/sax/Attributes;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v1, "<solidColor>"

    .line 5
    .line 6
    invoke-direct {p0, v1, v0}, Lax/o4/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 10
    .line 11
    if-eqz v0, :cond_27

    .line 12
    .line 13
    new-instance v0, Lax/o4/g$C;

    .line 14
    .line 15
    invoke-direct {v0}, Lax/o4/g$C;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lax/o4/k;->a:Lax/o4/g;

    .line 19
    .line 20
    iput-object v1, v0, Lax/o4/g$N;->a:Lax/o4/g;

    .line 21
    .line 22
    iget-object v1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 23
    .line 24
    iput-object v1, v0, Lax/o4/g$N;->b:Lax/o4/g$J;

    .line 25
    .line 26
    invoke-direct {p0, v0, p1}, Lax/o4/k;->D(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, v0, p1}, Lax/o4/k;->S(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 33
    .line 34
    invoke-interface {p1, v0}, Lax/o4/g$J;->m(Lax/o4/g$N;)V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 38
    .line 39
    return-void

    .line 40
    :cond_27
    new-instance p1, Lax/o4/j;

    .line 41
    .line 42
    const-string v0, "Invalid document. Root element must be <svg>"

    .line 43
    .line 44
    invoke-direct {p1, v0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1
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

.method private W(Lax/o4/g$n;Lorg/xml/sax/Attributes;)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_1
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_21

    .line 7
    .line 8
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {v1}, Lax/o4/k$g;->d(Ljava/lang/String;)Lax/o4/k$g;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sget-object v2, Lax/o4/k$g;->z1:Lax/o4/k$g;

    .line 17
    .line 18
    if-ne v1, v2, :cond_1e

    .line 19
    .line 20
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-direct {p0, v1}, Lax/o4/k;->J0(Ljava/lang/String;)Landroid/graphics/Matrix;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-interface {p1, v1}, Lax/o4/g$n;->j(Landroid/graphics/Matrix;)V

    .line 29
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
.end method

.method private W0()V
    .registers 2

    .line 1
    new-instance v0, Lax/o4/g;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/o4/g;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lax/o4/k;->a:Lax/o4/g;

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
.end method

.method private X(Lax/o4/g$e0;Lorg/xml/sax/Attributes;)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_1
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_85

    .line 7
    .line 8
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sget-object v2, Lax/o4/k$a;->b:[I

    .line 17
    .line 18
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-static {v3}, Lax/o4/k$g;->d(Ljava/lang/String;)Lax/o4/k$g;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    aget v2, v2, v3

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    if-eq v2, v3, :cond_7b

    .line 34
    .line 35
    const/4 v3, 0x2

    .line 36
    if-eq v2, v3, :cond_74

    .line 37
    .line 38
    const/4 v3, 0x3

    .line 39
    if-eq v2, v3, :cond_5f

    .line 40
    .line 41
    const/4 v3, 0x4

    .line 42
    if-eq v2, v3, :cond_4a

    .line 43
    .line 44
    const/4 v3, 0x6

    .line 45
    if-eq v2, v3, :cond_2f

    .line 46
    .line 47
    goto :goto_81

    .line 48
    :cond_2f
    const-string v2, ""

    .line 49
    .line 50
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-nez v2, :cond_47

    .line 59
    .line 60
    const-string v2, "http://www.w3.org/1999/xlink"

    .line 61
    .line 62
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_81

    .line 71
    .line 72
    :cond_47
    iput-object v1, p1, Lax/o4/g$e0;->p:Ljava/lang/String;

    .line 73
    .line 74
    goto :goto_81

    .line 75
    :cond_4a
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    iput-object v1, p1, Lax/o4/g$e0;->t:Lax/o4/g$p;

    .line 80
    .line 81
    invoke-virtual {v1}, Lax/o4/g$p;->j()Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-nez v1, :cond_57

    .line 86
    .line 87
    goto :goto_81

    .line 88
    :cond_57
    new-instance p1, Lax/o4/j;

    .line 89
    .line 90
    const-string p2, "Invalid <use> element. height cannot be negative"

    .line 91
    .line 92
    invoke-direct {p1, p2}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw p1

    .line 96
    :cond_5f
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    iput-object v1, p1, Lax/o4/g$e0;->s:Lax/o4/g$p;

    .line 101
    .line 102
    invoke-virtual {v1}, Lax/o4/g$p;->j()Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-nez v1, :cond_6c

    .line 107
    .line 108
    goto :goto_81

    .line 109
    :cond_6c
    new-instance p1, Lax/o4/j;

    .line 110
    .line 111
    const-string p2, "Invalid <use> element. width cannot be negative"

    .line 112
    .line 113
    invoke-direct {p1, p2}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw p1

    .line 117
    :cond_74
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    iput-object v1, p1, Lax/o4/g$e0;->r:Lax/o4/g$p;

    .line 122
    .line 123
    goto :goto_81

    .line 124
    :cond_7b
    invoke-static {v1}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    iput-object v1, p1, Lax/o4/g$e0;->q:Lax/o4/g$p;

    .line 129
    .line 130
    :cond_81
    :goto_81
    add-int/lit8 v0, v0, 0x1

    .line 131
    .line 132
    goto/16 :goto_1

    .line 133
    .line 134
    :cond_85
    return-void
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
.end method

.method private X0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lax/o4/k;->c:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_b

    .line 5
    .line 6
    iget p1, p0, Lax/o4/k;->d:I

    .line 7
    .line 8
    add-int/2addr p1, v1

    .line 9
    iput p1, p0, Lax/o4/k;->d:I

    .line 10
    .line 11
    return-void

    .line 12
    :cond_b
    const-string v0, "http://www.w3.org/2000/svg"

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1c

    .line 19
    .line 20
    const-string v0, ""

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-nez p1, :cond_1c

    .line 27
    .line 28
    return-void

    .line 29
    :cond_1c
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-lez p1, :cond_23

    .line 34
    .line 35
    goto :goto_24

    .line 36
    :cond_23
    move-object p2, p3

    .line 37
    :goto_24
    invoke-static {p2}, Lax/o4/k$h;->d(Ljava/lang/String;)Lax/o4/k$h;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    sget-object p2, Lax/o4/k$a;->a:[I

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 44
    .line 45
    .line 46
    move-result p3

    .line 47
    aget p2, p2, p3

    .line 48
    .line 49
    packed-switch p2, :pswitch_data_ae

    .line 50
    .line 51
    .line 52
    iput-boolean v1, p0, Lax/o4/k;->c:Z

    .line 53
    .line 54
    iput v1, p0, Lax/o4/k;->d:I

    .line 55
    .line 56
    return-void

    .line 57
    :pswitch_38
    invoke-direct {p0, p4}, Lax/o4/k;->V0(Lorg/xml/sax/Attributes;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :pswitch_3c
    invoke-direct {p0, p4}, Lax/o4/k;->Z0(Lorg/xml/sax/Attributes;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_40
    invoke-direct {p0, p4}, Lax/o4/k;->y(Lorg/xml/sax/Attributes;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :pswitch_44
    invoke-direct {p0, p4}, Lax/o4/k;->j1(Lorg/xml/sax/Attributes;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :pswitch_48
    invoke-direct {p0, p4}, Lax/o4/k;->u(Lorg/xml/sax/Attributes;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :pswitch_4c
    invoke-direct {p0, p4}, Lax/o4/k;->P0(Lorg/xml/sax/Attributes;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :pswitch_50
    invoke-direct {p0, p4}, Lax/o4/k;->f1(Lorg/xml/sax/Attributes;)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :pswitch_54
    invoke-direct {p0, p4}, Lax/o4/k;->k(Lorg/xml/sax/Attributes;)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :pswitch_58
    iput-boolean v1, p0, Lax/o4/k;->e:Z

    .line 90
    .line 91
    iput-object p1, p0, Lax/o4/k;->f:Lax/o4/k$h;

    .line 92
    .line 93
    return-void

    .line 94
    :pswitch_5d
    invoke-direct {p0, p4}, Lax/o4/k;->Y0(Lorg/xml/sax/Attributes;)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :pswitch_61
    invoke-direct {p0, p4}, Lax/o4/k;->T0(Lorg/xml/sax/Attributes;)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :pswitch_65
    invoke-direct {p0, p4}, Lax/o4/k;->w(Lorg/xml/sax/Attributes;)V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :pswitch_69
    invoke-direct {p0, p4}, Lax/o4/k;->x(Lorg/xml/sax/Attributes;)V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :pswitch_6d
    invoke-direct {p0, p4}, Lax/o4/k;->b1(Lorg/xml/sax/Attributes;)V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :pswitch_71
    invoke-direct {p0, p4}, Lax/o4/k;->k1(Lorg/xml/sax/Attributes;)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :pswitch_75
    invoke-direct {p0, p4}, Lax/o4/k;->g1(Lorg/xml/sax/Attributes;)V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :pswitch_79
    invoke-direct {p0, p4}, Lax/o4/k;->h1(Lorg/xml/sax/Attributes;)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :pswitch_7d
    invoke-direct {p0, p4}, Lax/o4/k;->d1(Lorg/xml/sax/Attributes;)V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :pswitch_81
    invoke-direct {p0, p4}, Lax/o4/k;->Q0(Lorg/xml/sax/Attributes;)V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :pswitch_85
    invoke-direct {p0, p4}, Lax/o4/k;->R0(Lorg/xml/sax/Attributes;)V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :pswitch_89
    invoke-direct {p0, p4}, Lax/o4/k;->v(Lorg/xml/sax/Attributes;)V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :pswitch_8d
    invoke-direct {p0, p4}, Lax/o4/k;->n(Lorg/xml/sax/Attributes;)V

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :pswitch_91
    invoke-direct {p0, p4}, Lax/o4/k;->i(Lorg/xml/sax/Attributes;)V

    .line 147
    .line 148
    .line 149
    return-void

    .line 150
    :pswitch_95
    invoke-direct {p0, p4}, Lax/o4/k;->U0(Lorg/xml/sax/Attributes;)V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :pswitch_99
    invoke-direct {p0, p4}, Lax/o4/k;->O0(Lorg/xml/sax/Attributes;)V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :pswitch_9d
    invoke-direct {p0, p4}, Lax/o4/k;->i1(Lorg/xml/sax/Attributes;)V

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    :pswitch_a1
    invoke-direct {p0, p4}, Lax/o4/k;->m(Lorg/xml/sax/Attributes;)V

    .line 163
    .line 164
    .line 165
    return-void

    .line 166
    :pswitch_a5
    invoke-direct {p0, p4}, Lax/o4/k;->q(Lorg/xml/sax/Attributes;)V

    .line 167
    .line 168
    .line 169
    return-void

    .line 170
    :pswitch_a9
    invoke-direct {p0, p4}, Lax/o4/k;->a1(Lorg/xml/sax/Attributes;)V

    .line 171
    .line 172
    .line 173
    return-void

    .line 174
    nop

    .line 175
    :pswitch_data_ae
    .packed-switch 0x1
        :pswitch_a9
        :pswitch_a5
        :pswitch_a5
        :pswitch_a1
        :pswitch_9d
        :pswitch_99
        :pswitch_95
        :pswitch_91
        :pswitch_8d
        :pswitch_89
        :pswitch_85
        :pswitch_81
        :pswitch_7d
        :pswitch_79
        :pswitch_75
        :pswitch_71
        :pswitch_6d
        :pswitch_69
        :pswitch_65
        :pswitch_61
        :pswitch_5d
        :pswitch_58
        :pswitch_58
        :pswitch_54
        :pswitch_50
        :pswitch_4c
        :pswitch_48
        :pswitch_44
        :pswitch_40
        :pswitch_3c
        :pswitch_38
    .end packed-switch
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
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
.end method

.method private Y(Lax/o4/g$R;Lorg/xml/sax/Attributes;)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_1
    invoke-interface {p2}, Lorg/xml/sax/Attributes;->getLength()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_34

    .line 7
    .line 8
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sget-object v2, Lax/o4/k$a;->b:[I

    .line 17
    .line 18
    invoke-interface {p2, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-static {v3}, Lax/o4/k$g;->d(Ljava/lang/String;)Lax/o4/k$g;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    aget v2, v2, v3

    .line 31
    .line 32
    const/4 v3, 0x7

    .line 33
    if-eq v2, v3, :cond_2e

    .line 34
    .line 35
    const/16 v3, 0x57

    .line 36
    .line 37
    if-eq v2, v3, :cond_27

    .line 38
    .line 39
    goto :goto_31

    .line 40
    :cond_27
    invoke-static {v1}, Lax/o4/k;->N0(Ljava/lang/String;)Lax/o4/g$b;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iput-object v1, p1, Lax/o4/g$R;->p:Lax/o4/g$b;

    .line 45
    .line 46
    goto :goto_31

    .line 47
    :cond_2e
    invoke-static {p1, v1}, Lax/o4/k;->w0(Lax/o4/g$P;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :goto_31
    add-int/lit8 v0, v0, 0x1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_34
    return-void
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

.method private Y0(Lorg/xml/sax/Attributes;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v1, "<stop>"

    .line 5
    .line 6
    invoke-direct {p0, v1, v0}, Lax/o4/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 10
    .line 11
    if-eqz v0, :cond_36

    .line 12
    .line 13
    instance-of v0, v0, Lax/o4/g$j;

    .line 14
    .line 15
    if-eqz v0, :cond_2e

    .line 16
    .line 17
    new-instance v0, Lax/o4/g$D;

    .line 18
    .line 19
    invoke-direct {v0}, Lax/o4/g$D;-><init>()V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lax/o4/k;->a:Lax/o4/g;

    .line 23
    .line 24
    iput-object v1, v0, Lax/o4/g$N;->a:Lax/o4/g;

    .line 25
    .line 26
    iget-object v1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 27
    .line 28
    iput-object v1, v0, Lax/o4/g$N;->b:Lax/o4/g$J;

    .line 29
    .line 30
    invoke-direct {p0, v0, p1}, Lax/o4/k;->D(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 31
    .line 32
    .line 33
    invoke-direct {p0, v0, p1}, Lax/o4/k;->S(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 34
    .line 35
    .line 36
    invoke-direct {p0, v0, p1}, Lax/o4/k;->R(Lax/o4/g$D;Lorg/xml/sax/Attributes;)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 40
    .line 41
    invoke-interface {p1, v0}, Lax/o4/g$J;->m(Lax/o4/g$N;)V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 45
    .line 46
    return-void

    .line 47
    :cond_2e
    new-instance p1, Lax/o4/j;

    .line 48
    .line 49
    const-string v0, "Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements."

    .line 50
    .line 51
    invoke-direct {p1, v0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_36
    new-instance p1, Lax/o4/j;

    .line 56
    .line 57
    const-string v0, "Invalid document. Root element must be <svg>"

    .line 58
    .line 59
    invoke-direct {p1, v0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p1
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
.end method

.method private Z(Ljava/lang/String;)V
    .registers 5

    .line 1
    new-instance v0, Lax/o4/b;

    .line 2
    .line 3
    sget-object v1, Lax/o4/b$f;->i0:Lax/o4/b$f;

    .line 4
    .line 5
    sget-object v2, Lax/o4/b$u;->q:Lax/o4/b$u;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lax/o4/b;-><init>(Lax/o4/b$f;Lax/o4/b$u;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lax/o4/k;->a:Lax/o4/g;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lax/o4/b;->d(Ljava/lang/String;)Lax/o4/b$r;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {v1, p1}, Lax/o4/g;->a(Lax/o4/b$r;)V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
.end method

.method private Z0(Lorg/xml/sax/Attributes;)V
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v2, "<style>"

    .line 5
    .line 6
    invoke-direct {p0, v2, v1}, Lax/o4/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 10
    .line 11
    if-eqz v1, :cond_54

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    const-string v2, "all"

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    :goto_10
    invoke-interface {p1}, Lorg/xml/sax/Attributes;->getLength()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-ge v0, v4, :cond_42

    .line 22
    .line 23
    invoke-interface {p1, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    sget-object v5, Lax/o4/k$a;->b:[I

    .line 32
    .line 33
    invoke-interface {p1, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    invoke-static {v6}, Lax/o4/k$g;->d(Ljava/lang/String;)Lax/o4/k$g;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    aget v5, v5, v6

    .line 46
    .line 47
    const/16 v6, 0x58

    .line 48
    .line 49
    if-eq v5, v6, :cond_39

    .line 50
    .line 51
    const/16 v6, 0x59

    .line 52
    .line 53
    if-eq v5, v6, :cond_37

    .line 54
    .line 55
    goto :goto_3f

    .line 56
    :cond_37
    move-object v2, v4

    .line 57
    goto :goto_3f

    .line 58
    :cond_39
    const-string v3, "text/css"

    .line 59
    .line 60
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    :goto_3f
    add-int/lit8 v0, v0, 0x1

    .line 65
    .line 66
    goto :goto_10

    .line 67
    :cond_42
    if-eqz v3, :cond_4f

    .line 68
    .line 69
    sget-object p1, Lax/o4/b$f;->i0:Lax/o4/b$f;

    .line 70
    .line 71
    invoke-static {v2, p1}, Lax/o4/b;->b(Ljava/lang/String;Lax/o4/b$f;)Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-eqz p1, :cond_4f

    .line 76
    .line 77
    iput-boolean v1, p0, Lax/o4/k;->h:Z

    .line 78
    .line 79
    return-void

    .line 80
    :cond_4f
    iput-boolean v1, p0, Lax/o4/k;->c:Z

    .line 81
    .line 82
    iput v1, p0, Lax/o4/k;->d:I

    .line 83
    .line 84
    return-void

    .line 85
    :cond_54
    new-instance p1, Lax/o4/j;

    .line 86
    .line 87
    const-string v0, "Invalid document. Root element must be <svg>"

    .line 88
    .line 89
    invoke-direct {p1, v0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw p1
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
.end method

.method static synthetic a(Lax/o4/k;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/o4/k;->W0()V

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
    .line 22
.end method

.method private static a0(Ljava/lang/String;)Lax/o4/g$c;
    .registers 7

    .line 1
    const-string v0, "auto"

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_a

    .line 9
    .line 10
    return-object v1

    .line 11
    :cond_a
    const-string v0, "rect("

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_13

    .line 18
    .line 19
    return-object v1

    .line 20
    :cond_13
    new-instance v0, Lax/o4/k$i;

    .line 21
    .line 22
    const/4 v2, 0x5

    .line 23
    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-direct {v0, p0}, Lax/o4/k$i;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lax/o4/k$i;->A()V

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Lax/o4/k;->q0(Lax/o4/k$i;)Lax/o4/g$p;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {v0}, Lax/o4/k$i;->z()Z

    .line 38
    .line 39
    .line 40
    invoke-static {v0}, Lax/o4/k;->q0(Lax/o4/k$i;)Lax/o4/g$p;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v0}, Lax/o4/k$i;->z()Z

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, Lax/o4/k;->q0(Lax/o4/k$i;)Lax/o4/g$p;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {v0}, Lax/o4/k$i;->z()Z

    .line 52
    .line 53
    .line 54
    invoke-static {v0}, Lax/o4/k;->q0(Lax/o4/k$i;)Lax/o4/g$p;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-virtual {v0}, Lax/o4/k$i;->A()V

    .line 59
    .line 60
    .line 61
    const/16 v5, 0x29

    .line 62
    .line 63
    invoke-virtual {v0, v5}, Lax/o4/k$i;->f(C)Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-nez v5, :cond_4b

    .line 68
    .line 69
    invoke-virtual {v0}, Lax/o4/k$i;->h()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_4b

    .line 74
    .line 75
    return-object v1

    .line 76
    :cond_4b
    new-instance v0, Lax/o4/g$c;

    .line 77
    .line 78
    invoke-direct {v0, p0, v2, v3, v4}, Lax/o4/g$c;-><init>(Lax/o4/g$p;Lax/o4/g$p;Lax/o4/g$p;Lax/o4/g$p;)V

    .line 79
    .line 80
    .line 81
    return-object v0
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
.end method

.method private a1(Lorg/xml/sax/Attributes;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v1, "<svg>"

    .line 5
    .line 6
    invoke-direct {p0, v1, v0}, Lax/o4/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    new-instance v0, Lax/o4/g$F;

    .line 10
    .line 11
    invoke-direct {v0}, Lax/o4/g$F;-><init>()V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lax/o4/k;->a:Lax/o4/g;

    .line 15
    .line 16
    iput-object v1, v0, Lax/o4/g$N;->a:Lax/o4/g;

    .line 17
    .line 18
    iget-object v1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 19
    .line 20
    iput-object v1, v0, Lax/o4/g$N;->b:Lax/o4/g$J;

    .line 21
    .line 22
    invoke-direct {p0, v0, p1}, Lax/o4/k;->D(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0, v0, p1}, Lax/o4/k;->S(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0, v0, p1}, Lax/o4/k;->C(Lax/o4/g$G;Lorg/xml/sax/Attributes;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0, v0, p1}, Lax/o4/k;->Y(Lax/o4/g$R;Lorg/xml/sax/Attributes;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {p0, v0, p1}, Lax/o4/k;->Q(Lax/o4/g$F;Lorg/xml/sax/Attributes;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 38
    .line 39
    if-nez p1, :cond_2e

    .line 40
    .line 41
    iget-object p1, p0, Lax/o4/k;->a:Lax/o4/g;

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Lax/o4/g;->t(Lax/o4/g$F;)V

    .line 44
    .line 45
    .line 46
    goto :goto_31

    .line 47
    :cond_2e
    invoke-interface {p1, v0}, Lax/o4/g$J;->m(Lax/o4/g$N;)V

    .line 48
    .line 49
    .line 50
    :goto_31
    iput-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 51
    .line 52
    return-void
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

.method static synthetic b(Lax/o4/k;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lax/o4/k;->X0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V

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

.method private static b0(Ljava/lang/String;)Lax/o4/g$f;
    .registers 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    const/16 v1, 0x23

    .line 7
    .line 8
    const/4 v2, 0x5

    .line 9
    const/high16 v3, -0x1000000

    .line 10
    .line 11
    const/4 v4, 0x4

    .line 12
    if-ne v0, v1, :cond_b6

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-static {p0, v0, v1}, Lax/o4/c;->b(Ljava/lang/String;II)Lax/o4/c;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "Bad hex colour value: "

    .line 24
    .line 25
    if-eqz v0, :cond_a1

    .line 26
    .line 27
    invoke-virtual {v0}, Lax/o4/c;->a()I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-eq v5, v4, :cond_82

    .line 32
    .line 33
    if-eq v5, v2, :cond_5c

    .line 34
    .line 35
    const/4 v2, 0x7

    .line 36
    if-eq v5, v2, :cond_51

    .line 37
    .line 38
    const/16 v2, 0x9

    .line 39
    .line 40
    if-ne v5, v2, :cond_3c

    .line 41
    .line 42
    new-instance p0, Lax/o4/g$f;

    .line 43
    .line 44
    invoke-virtual {v0}, Lax/o4/c;->d()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    shl-int/lit8 v1, v1, 0x18

    .line 49
    .line 50
    invoke-virtual {v0}, Lax/o4/c;->d()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    ushr-int/lit8 v0, v0, 0x8

    .line 55
    .line 56
    or-int/2addr v0, v1

    .line 57
    invoke-direct {p0, v0}, Lax/o4/g$f;-><init>(I)V

    .line 58
    .line 59
    .line 60
    return-object p0

    .line 61
    :cond_3c
    new-instance v0, Lax/o4/j;

    .line 62
    .line 63
    new-instance v2, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-direct {v0, p0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw v0

    .line 82
    :cond_51
    new-instance p0, Lax/o4/g$f;

    .line 83
    .line 84
    invoke-virtual {v0}, Lax/o4/c;->d()I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    or-int/2addr v0, v3

    .line 89
    invoke-direct {p0, v0}, Lax/o4/g$f;-><init>(I)V

    .line 90
    .line 91
    .line 92
    return-object p0

    .line 93
    :cond_5c
    invoke-virtual {v0}, Lax/o4/c;->d()I

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    const v0, 0xf000

    .line 98
    .line 99
    .line 100
    and-int/2addr v0, p0

    .line 101
    and-int/lit16 v1, p0, 0xf00

    .line 102
    .line 103
    and-int/lit16 v2, p0, 0xf0

    .line 104
    .line 105
    and-int/lit8 p0, p0, 0xf

    .line 106
    .line 107
    new-instance v3, Lax/o4/g$f;

    .line 108
    .line 109
    shl-int/lit8 v5, p0, 0x1c

    .line 110
    .line 111
    shl-int/lit8 p0, p0, 0x18

    .line 112
    .line 113
    or-int/2addr p0, v5

    .line 114
    shl-int/lit8 v5, v0, 0x8

    .line 115
    .line 116
    or-int/2addr p0, v5

    .line 117
    shl-int/2addr v0, v4

    .line 118
    or-int/2addr p0, v0

    .line 119
    shl-int/lit8 v0, v1, 0x4

    .line 120
    .line 121
    or-int/2addr p0, v0

    .line 122
    or-int/2addr p0, v1

    .line 123
    or-int/2addr p0, v2

    .line 124
    shr-int/lit8 v0, v2, 0x4

    .line 125
    .line 126
    or-int/2addr p0, v0

    .line 127
    invoke-direct {v3, p0}, Lax/o4/g$f;-><init>(I)V

    .line 128
    .line 129
    .line 130
    return-object v3

    .line 131
    :cond_82
    invoke-virtual {v0}, Lax/o4/c;->d()I

    .line 132
    .line 133
    .line 134
    move-result p0

    .line 135
    and-int/lit16 v0, p0, 0xf00

    .line 136
    .line 137
    and-int/lit16 v1, p0, 0xf0

    .line 138
    .line 139
    and-int/lit8 p0, p0, 0xf

    .line 140
    .line 141
    new-instance v2, Lax/o4/g$f;

    .line 142
    .line 143
    shl-int/lit8 v5, v0, 0xc

    .line 144
    .line 145
    or-int/2addr v3, v5

    .line 146
    shl-int/lit8 v0, v0, 0x8

    .line 147
    .line 148
    or-int/2addr v0, v3

    .line 149
    shl-int/lit8 v3, v1, 0x8

    .line 150
    .line 151
    or-int/2addr v0, v3

    .line 152
    shl-int/2addr v1, v4

    .line 153
    or-int/2addr v0, v1

    .line 154
    shl-int/lit8 v1, p0, 0x4

    .line 155
    .line 156
    or-int/2addr v0, v1

    .line 157
    or-int/2addr p0, v0

    .line 158
    invoke-direct {v2, p0}, Lax/o4/g$f;-><init>(I)V

    .line 159
    .line 160
    .line 161
    return-object v2

    .line 162
    :cond_a1
    new-instance v0, Lax/o4/j;

    .line 163
    .line 164
    new-instance v2, Ljava/lang/StringBuilder;

    .line 165
    .line 166
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    invoke-direct {v0, p0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    throw v0

    .line 183
    :cond_b6
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 184
    .line 185
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    const-string v1, "rgba("

    .line 190
    .line 191
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    const/16 v5, 0x29

    .line 196
    .line 197
    const/high16 v6, 0x43800000    # 256.0f

    .line 198
    .line 199
    const/16 v7, 0x25

    .line 200
    .line 201
    if-nez v1, :cond_188

    .line 202
    .line 203
    const-string v8, "rgb("

    .line 204
    .line 205
    invoke-virtual {v0, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 206
    .line 207
    .line 208
    move-result v8

    .line 209
    if-eqz v8, :cond_d4

    .line 210
    .line 211
    goto/16 :goto_188

    .line 212
    .line 213
    :cond_d4
    const-string v1, "hsla("

    .line 214
    .line 215
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    if-nez v1, :cond_ea

    .line 220
    .line 221
    const-string v8, "hsl("

    .line 222
    .line 223
    invoke-virtual {v0, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 224
    .line 225
    .line 226
    move-result v8

    .line 227
    if-eqz v8, :cond_e5

    .line 228
    .line 229
    goto :goto_ea

    .line 230
    :cond_e5
    invoke-static {v0}, Lax/o4/k;->c0(Ljava/lang/String;)Lax/o4/g$f;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    return-object p0

    .line 235
    :cond_ea
    :goto_ea
    new-instance v0, Lax/o4/k$i;

    .line 236
    .line 237
    if-eqz v1, :cond_ef

    .line 238
    .line 239
    goto :goto_f0

    .line 240
    :cond_ef
    const/4 v2, 0x4

    .line 241
    :goto_f0
    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v2

    .line 245
    invoke-direct {v0, v2}, Lax/o4/k$i;-><init>(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v0}, Lax/o4/k$i;->A()V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v0}, Lax/o4/k$i;->n()F

    .line 252
    .line 253
    .line 254
    move-result v2

    .line 255
    invoke-virtual {v0, v2}, Lax/o4/k$i;->d(F)F

    .line 256
    .line 257
    .line 258
    move-result v4

    .line 259
    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    .line 260
    .line 261
    .line 262
    move-result v8

    .line 263
    if-nez v8, :cond_10b

    .line 264
    .line 265
    invoke-virtual {v0, v7}, Lax/o4/k$i;->f(C)Z

    .line 266
    .line 267
    .line 268
    :cond_10b
    invoke-virtual {v0, v4}, Lax/o4/k$i;->d(F)F

    .line 269
    .line 270
    .line 271
    move-result v8

    .line 272
    invoke-static {v8}, Ljava/lang/Float;->isNaN(F)Z

    .line 273
    .line 274
    .line 275
    move-result v9

    .line 276
    if-nez v9, :cond_118

    .line 277
    .line 278
    invoke-virtual {v0, v7}, Lax/o4/k$i;->f(C)Z

    .line 279
    .line 280
    .line 281
    :cond_118
    if-eqz v1, :cond_157

    .line 282
    .line 283
    invoke-virtual {v0, v8}, Lax/o4/k$i;->d(F)F

    .line 284
    .line 285
    .line 286
    move-result v1

    .line 287
    invoke-virtual {v0}, Lax/o4/k$i;->A()V

    .line 288
    .line 289
    .line 290
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 291
    .line 292
    .line 293
    move-result v3

    .line 294
    if-nez v3, :cond_140

    .line 295
    .line 296
    invoke-virtual {v0, v5}, Lax/o4/k$i;->f(C)Z

    .line 297
    .line 298
    .line 299
    move-result v0

    .line 300
    if-eqz v0, :cond_140

    .line 301
    .line 302
    new-instance p0, Lax/o4/g$f;

    .line 303
    .line 304
    mul-float v1, v1, v6

    .line 305
    .line 306
    invoke-static {v1}, Lax/o4/k;->j(F)I

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    shl-int/lit8 v0, v0, 0x18

    .line 311
    .line 312
    invoke-static {v2, v4, v8}, Lax/o4/k;->s(FFF)I

    .line 313
    .line 314
    .line 315
    move-result v1

    .line 316
    or-int/2addr v0, v1

    .line 317
    invoke-direct {p0, v0}, Lax/o4/g$f;-><init>(I)V

    .line 318
    .line 319
    .line 320
    return-object p0

    .line 321
    :cond_140
    new-instance v0, Lax/o4/j;

    .line 322
    .line 323
    new-instance v1, Ljava/lang/StringBuilder;

    .line 324
    .line 325
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 326
    .line 327
    .line 328
    const-string v2, "Bad hsla() colour value: "

    .line 329
    .line 330
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object p0

    .line 340
    invoke-direct {v0, p0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    throw v0

    .line 344
    :cond_157
    invoke-virtual {v0}, Lax/o4/k$i;->A()V

    .line 345
    .line 346
    .line 347
    invoke-static {v8}, Ljava/lang/Float;->isNaN(F)Z

    .line 348
    .line 349
    .line 350
    move-result v1

    .line 351
    if-nez v1, :cond_171

    .line 352
    .line 353
    invoke-virtual {v0, v5}, Lax/o4/k$i;->f(C)Z

    .line 354
    .line 355
    .line 356
    move-result v0

    .line 357
    if-eqz v0, :cond_171

    .line 358
    .line 359
    new-instance p0, Lax/o4/g$f;

    .line 360
    .line 361
    invoke-static {v2, v4, v8}, Lax/o4/k;->s(FFF)I

    .line 362
    .line 363
    .line 364
    move-result v0

    .line 365
    or-int/2addr v0, v3

    .line 366
    invoke-direct {p0, v0}, Lax/o4/g$f;-><init>(I)V

    .line 367
    .line 368
    .line 369
    return-object p0

    .line 370
    :cond_171
    new-instance v0, Lax/o4/j;

    .line 371
    .line 372
    new-instance v1, Ljava/lang/StringBuilder;

    .line 373
    .line 374
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 375
    .line 376
    .line 377
    const-string v2, "Bad hsl() colour value: "

    .line 378
    .line 379
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object p0

    .line 389
    invoke-direct {v0, p0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    throw v0

    .line 393
    :cond_188
    :goto_188
    new-instance v0, Lax/o4/k$i;

    .line 394
    .line 395
    if-eqz v1, :cond_18d

    .line 396
    .line 397
    goto :goto_18e

    .line 398
    :cond_18d
    const/4 v2, 0x4

    .line 399
    :goto_18e
    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v2

    .line 403
    invoke-direct {v0, v2}, Lax/o4/k$i;-><init>(Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    invoke-virtual {v0}, Lax/o4/k$i;->A()V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v0}, Lax/o4/k$i;->n()F

    .line 410
    .line 411
    .line 412
    move-result v2

    .line 413
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 414
    .line 415
    .line 416
    move-result v4

    .line 417
    const/high16 v8, 0x42c80000    # 100.0f

    .line 418
    .line 419
    if-nez v4, :cond_1ad

    .line 420
    .line 421
    invoke-virtual {v0, v7}, Lax/o4/k$i;->f(C)Z

    .line 422
    .line 423
    .line 424
    move-result v4

    .line 425
    if-eqz v4, :cond_1ad

    .line 426
    .line 427
    mul-float v2, v2, v6

    .line 428
    .line 429
    div-float/2addr v2, v8

    .line 430
    :cond_1ad
    invoke-virtual {v0, v2}, Lax/o4/k$i;->d(F)F

    .line 431
    .line 432
    .line 433
    move-result v4

    .line 434
    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    .line 435
    .line 436
    .line 437
    move-result v9

    .line 438
    if-nez v9, :cond_1c0

    .line 439
    .line 440
    invoke-virtual {v0, v7}, Lax/o4/k$i;->f(C)Z

    .line 441
    .line 442
    .line 443
    move-result v9

    .line 444
    if-eqz v9, :cond_1c0

    .line 445
    .line 446
    mul-float v4, v4, v6

    .line 447
    .line 448
    div-float/2addr v4, v8

    .line 449
    :cond_1c0
    invoke-virtual {v0, v4}, Lax/o4/k$i;->d(F)F

    .line 450
    .line 451
    .line 452
    move-result v9

    .line 453
    invoke-static {v9}, Ljava/lang/Float;->isNaN(F)Z

    .line 454
    .line 455
    .line 456
    move-result v10

    .line 457
    if-nez v10, :cond_1d3

    .line 458
    .line 459
    invoke-virtual {v0, v7}, Lax/o4/k$i;->f(C)Z

    .line 460
    .line 461
    .line 462
    move-result v7

    .line 463
    if-eqz v7, :cond_1d3

    .line 464
    .line 465
    mul-float v9, v9, v6

    .line 466
    .line 467
    div-float/2addr v9, v8

    .line 468
    :cond_1d3
    if-eqz v1, :cond_220

    .line 469
    .line 470
    invoke-virtual {v0, v9}, Lax/o4/k$i;->d(F)F

    .line 471
    .line 472
    .line 473
    move-result v1

    .line 474
    invoke-virtual {v0}, Lax/o4/k$i;->A()V

    .line 475
    .line 476
    .line 477
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 478
    .line 479
    .line 480
    move-result v3

    .line 481
    if-nez v3, :cond_209

    .line 482
    .line 483
    invoke-virtual {v0, v5}, Lax/o4/k$i;->f(C)Z

    .line 484
    .line 485
    .line 486
    move-result v0

    .line 487
    if-eqz v0, :cond_209

    .line 488
    .line 489
    new-instance p0, Lax/o4/g$f;

    .line 490
    .line 491
    mul-float v1, v1, v6

    .line 492
    .line 493
    invoke-static {v1}, Lax/o4/k;->j(F)I

    .line 494
    .line 495
    .line 496
    move-result v0

    .line 497
    shl-int/lit8 v0, v0, 0x18

    .line 498
    .line 499
    invoke-static {v2}, Lax/o4/k;->j(F)I

    .line 500
    .line 501
    .line 502
    move-result v1

    .line 503
    shl-int/lit8 v1, v1, 0x10

    .line 504
    .line 505
    or-int/2addr v0, v1

    .line 506
    invoke-static {v4}, Lax/o4/k;->j(F)I

    .line 507
    .line 508
    .line 509
    move-result v1

    .line 510
    shl-int/lit8 v1, v1, 0x8

    .line 511
    .line 512
    or-int/2addr v0, v1

    .line 513
    invoke-static {v9}, Lax/o4/k;->j(F)I

    .line 514
    .line 515
    .line 516
    move-result v1

    .line 517
    or-int/2addr v0, v1

    .line 518
    invoke-direct {p0, v0}, Lax/o4/g$f;-><init>(I)V

    .line 519
    .line 520
    .line 521
    return-object p0

    .line 522
    :cond_209
    new-instance v0, Lax/o4/j;

    .line 523
    .line 524
    new-instance v1, Ljava/lang/StringBuilder;

    .line 525
    .line 526
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 527
    .line 528
    .line 529
    const-string v2, "Bad rgba() colour value: "

    .line 530
    .line 531
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 532
    .line 533
    .line 534
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 535
    .line 536
    .line 537
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object p0

    .line 541
    invoke-direct {v0, p0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 542
    .line 543
    .line 544
    throw v0

    .line 545
    :cond_220
    invoke-virtual {v0}, Lax/o4/k$i;->A()V

    .line 546
    .line 547
    .line 548
    invoke-static {v9}, Ljava/lang/Float;->isNaN(F)Z

    .line 549
    .line 550
    .line 551
    move-result v1

    .line 552
    if-nez v1, :cond_248

    .line 553
    .line 554
    invoke-virtual {v0, v5}, Lax/o4/k$i;->f(C)Z

    .line 555
    .line 556
    .line 557
    move-result v0

    .line 558
    if-eqz v0, :cond_248

    .line 559
    .line 560
    new-instance p0, Lax/o4/g$f;

    .line 561
    .line 562
    invoke-static {v2}, Lax/o4/k;->j(F)I

    .line 563
    .line 564
    .line 565
    move-result v0

    .line 566
    shl-int/lit8 v0, v0, 0x10

    .line 567
    .line 568
    or-int/2addr v0, v3

    .line 569
    invoke-static {v4}, Lax/o4/k;->j(F)I

    .line 570
    .line 571
    .line 572
    move-result v1

    .line 573
    shl-int/lit8 v1, v1, 0x8

    .line 574
    .line 575
    or-int/2addr v0, v1

    .line 576
    invoke-static {v9}, Lax/o4/k;->j(F)I

    .line 577
    .line 578
    .line 579
    move-result v1

    .line 580
    or-int/2addr v0, v1

    .line 581
    invoke-direct {p0, v0}, Lax/o4/g$f;-><init>(I)V

    .line 582
    .line 583
    .line 584
    return-object p0

    .line 585
    :cond_248
    new-instance v0, Lax/o4/j;

    .line 586
    .line 587
    new-instance v1, Ljava/lang/StringBuilder;

    .line 588
    .line 589
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 590
    .line 591
    .line 592
    const-string v2, "Bad rgb() colour value: "

    .line 593
    .line 594
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 595
    .line 596
    .line 597
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 598
    .line 599
    .line 600
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 601
    .line 602
    .line 603
    move-result-object p0

    .line 604
    invoke-direct {v0, p0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 605
    .line 606
    .line 607
    throw v0
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
.end method

.method private b1(Lorg/xml/sax/Attributes;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v1, "<symbol>"

    .line 5
    .line 6
    invoke-direct {p0, v1, v0}, Lax/o4/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 10
    .line 11
    if-eqz v0, :cond_2d

    .line 12
    .line 13
    new-instance v0, Lax/o4/g$T;

    .line 14
    .line 15
    invoke-direct {v0}, Lax/o4/g$T;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lax/o4/k;->a:Lax/o4/g;

    .line 19
    .line 20
    iput-object v1, v0, Lax/o4/g$N;->a:Lax/o4/g;

    .line 21
    .line 22
    iget-object v1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 23
    .line 24
    iput-object v1, v0, Lax/o4/g$N;->b:Lax/o4/g$J;

    .line 25
    .line 26
    invoke-direct {p0, v0, p1}, Lax/o4/k;->D(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, v0, p1}, Lax/o4/k;->S(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0, v0, p1}, Lax/o4/k;->C(Lax/o4/g$G;Lorg/xml/sax/Attributes;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p0, v0, p1}, Lax/o4/k;->Y(Lax/o4/g$R;Lorg/xml/sax/Attributes;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 39
    .line 40
    invoke-interface {p1, v0}, Lax/o4/g$J;->m(Lax/o4/g$N;)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 44
    .line 45
    return-void

    .line 46
    :cond_2d
    new-instance p1, Lax/o4/j;

    .line 47
    .line 48
    const-string v0, "Invalid document. Root element must be <svg>"

    .line 49
    .line 50
    invoke-direct {p1, v0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method static synthetic c(Lax/o4/k;Ljava/lang/String;)V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lax/o4/k;->c1(Ljava/lang/String;)V

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

.method private static c0(Ljava/lang/String;)Lax/o4/g$f;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lax/o4/k$c;->a(Ljava/lang/String;)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_10

    .line 6
    .line 7
    new-instance p0, Lax/o4/g$f;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-direct {p0, v0}, Lax/o4/g$f;-><init>(I)V

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_10
    new-instance v0, Lax/o4/j;

    .line 18
    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v2, "Invalid colour keyword: "

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-direct {v0, p0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v0
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

.method private c1(Ljava/lang/String;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lax/o4/k;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    goto :goto_40

    .line 6
    :cond_5
    iget-boolean v0, p0, Lax/o4/k;->e:Z

    .line 7
    .line 8
    if-eqz v0, :cond_1e

    .line 9
    .line 10
    iget-object v0, p0, Lax/o4/k;->g:Ljava/lang/StringBuilder;

    .line 11
    .line 12
    if-nez v0, :cond_18

    .line 13
    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lax/o4/k;->g:Ljava/lang/StringBuilder;

    .line 24
    .line 25
    :cond_18
    iget-object v0, p0, Lax/o4/k;->g:Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1e
    iget-boolean v0, p0, Lax/o4/k;->h:Z

    .line 32
    .line 33
    if-eqz v0, :cond_37

    .line 34
    .line 35
    iget-object v0, p0, Lax/o4/k;->i:Ljava/lang/StringBuilder;

    .line 36
    .line 37
    if-nez v0, :cond_31

    .line 38
    .line 39
    new-instance v0, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, Lax/o4/k;->i:Ljava/lang/StringBuilder;

    .line 49
    .line 50
    :cond_31
    iget-object v0, p0, Lax/o4/k;->i:Ljava/lang/StringBuilder;

    .line 51
    .line 52
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_37
    iget-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 57
    .line 58
    instance-of v0, v0, Lax/o4/g$Y;

    .line 59
    .line 60
    if-eqz v0, :cond_40

    .line 61
    .line 62
    invoke-direct {p0, p1}, Lax/o4/k;->h(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    :cond_40
    :goto_40
    return-void
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
.end method

.method static synthetic d(Lax/o4/k;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lax/o4/k;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

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

.method private static d0(Ljava/lang/String;)Lax/o4/g$O;
    .registers 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "none"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_1f

    .line 11
    .line 12
    const-string v0, "currentColor"

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1a

    .line 19
    .line 20
    :try_start_13
    invoke-static {p0}, Lax/o4/k;->b0(Ljava/lang/String;)Lax/o4/g$f;

    .line 21
    .line 22
    .line 23
    move-result-object p0
    :try_end_17
    .catch Lax/o4/j; {:try_start_13 .. :try_end_17} :catch_18

    .line 24
    return-object p0

    .line 25
    :catch_18
    const/4 p0, 0x0

    .line 26
    return-object p0

    .line 27
    :cond_1a
    invoke-static {}, Lax/o4/g$g;->b()Lax/o4/g$g;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_1f
    sget-object p0, Lax/o4/g$f;->d0:Lax/o4/g$f;

    .line 33
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
.end method

.method private d1(Lorg/xml/sax/Attributes;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v1, "<text>"

    .line 5
    .line 6
    invoke-direct {p0, v1, v0}, Lax/o4/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 10
    .line 11
    if-eqz v0, :cond_30

    .line 12
    .line 13
    new-instance v0, Lax/o4/g$W;

    .line 14
    .line 15
    invoke-direct {v0}, Lax/o4/g$W;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lax/o4/k;->a:Lax/o4/g;

    .line 19
    .line 20
    iput-object v1, v0, Lax/o4/g$N;->a:Lax/o4/g;

    .line 21
    .line 22
    iget-object v1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 23
    .line 24
    iput-object v1, v0, Lax/o4/g$N;->b:Lax/o4/g$J;

    .line 25
    .line 26
    invoke-direct {p0, v0, p1}, Lax/o4/k;->D(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, v0, p1}, Lax/o4/k;->S(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0, v0, p1}, Lax/o4/k;->W(Lax/o4/g$n;Lorg/xml/sax/Attributes;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p0, v0, p1}, Lax/o4/k;->C(Lax/o4/g$G;Lorg/xml/sax/Attributes;)V

    .line 36
    .line 37
    .line 38
    invoke-direct {p0, v0, p1}, Lax/o4/k;->V(Lax/o4/g$a0;Lorg/xml/sax/Attributes;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 42
    .line 43
    invoke-interface {p1, v0}, Lax/o4/g$J;->m(Lax/o4/g$N;)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 47
    .line 48
    return-void

    .line 49
    :cond_30
    new-instance p1, Lax/o4/j;

    .line 50
    .line 51
    const-string v0, "Invalid document. Root element must be <svg>"

    .line 52
    .line 53
    invoke-direct {p1, v0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method static synthetic e(Lax/o4/k;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/o4/k;->o()V

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
    .line 22
.end method

.method private static e0(Ljava/lang/String;)Lax/o4/g$E$a;
    .registers 2

    .line 1
    const-string v0, "nonzero"

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_b

    .line 8
    .line 9
    sget-object p0, Lax/o4/g$E$a;->q:Lax/o4/g$E$a;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_b
    const-string v0, "evenodd"

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eqz p0, :cond_16

    .line 19
    .line 20
    sget-object p0, Lax/o4/g$E$a;->c0:Lax/o4/g$E$a;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_16
    const/4 p0, 0x0

    .line 24
    return-object p0
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
.end method

.method private e1([CII)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lax/o4/k;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    goto :goto_3d

    .line 6
    :cond_5
    iget-boolean v0, p0, Lax/o4/k;->e:Z

    .line 7
    .line 8
    if-eqz v0, :cond_1a

    .line 9
    .line 10
    iget-object v0, p0, Lax/o4/k;->g:Ljava/lang/StringBuilder;

    .line 11
    .line 12
    if-nez v0, :cond_14

    .line 13
    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v0, p3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lax/o4/k;->g:Ljava/lang/StringBuilder;

    .line 20
    .line 21
    :cond_14
    iget-object v0, p0, Lax/o4/k;->g:Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-virtual {v0, p1, p2, p3}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1a
    iget-boolean v0, p0, Lax/o4/k;->h:Z

    .line 28
    .line 29
    if-eqz v0, :cond_2f

    .line 30
    .line 31
    iget-object v0, p0, Lax/o4/k;->i:Ljava/lang/StringBuilder;

    .line 32
    .line 33
    if-nez v0, :cond_29

    .line 34
    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v0, p3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lax/o4/k;->i:Ljava/lang/StringBuilder;

    .line 41
    .line 42
    :cond_29
    iget-object v0, p0, Lax/o4/k;->i:Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-virtual {v0, p1, p2, p3}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_2f
    iget-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 49
    .line 50
    instance-of v0, v0, Lax/o4/g$Y;

    .line 51
    .line 52
    if-eqz v0, :cond_3d

    .line 53
    .line 54
    new-instance v0, Ljava/lang/String;

    .line 55
    .line 56
    invoke-direct {v0, p1, p2, p3}, Ljava/lang/String;-><init>([CII)V

    .line 57
    .line 58
    .line 59
    invoke-direct {p0, v0}, Lax/o4/k;->h(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    :cond_3d
    :goto_3d
    return-void
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

.method static synthetic f(Lax/o4/k;Lax/o4/k$i;)Ljava/util/Map;
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/o4/k;->x0(Lax/o4/k$i;)Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method private static f0(Ljava/lang/String;)F
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_c

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-static {p0, v1, v0}, Lax/o4/k;->g0(Ljava/lang/String;II)F

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :cond_c
    new-instance p0, Lax/o4/j;

    .line 14
    .line 15
    const-string v0, "Invalid float value (empty string)"

    .line 16
    .line 17
    invoke-direct {p0, v0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0
    .line 21
    .line 22
.end method

.method private f1(Lorg/xml/sax/Attributes;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v1, "<textPath>"

    .line 5
    .line 6
    invoke-direct {p0, v1, v0}, Lax/o4/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 10
    .line 11
    if-eqz v0, :cond_42

    .line 12
    .line 13
    new-instance v0, Lax/o4/g$Z;

    .line 14
    .line 15
    invoke-direct {v0}, Lax/o4/g$Z;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lax/o4/k;->a:Lax/o4/g;

    .line 19
    .line 20
    iput-object v1, v0, Lax/o4/g$N;->a:Lax/o4/g;

    .line 21
    .line 22
    iget-object v1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 23
    .line 24
    iput-object v1, v0, Lax/o4/g$N;->b:Lax/o4/g$J;

    .line 25
    .line 26
    invoke-direct {p0, v0, p1}, Lax/o4/k;->D(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, v0, p1}, Lax/o4/k;->S(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0, v0, p1}, Lax/o4/k;->C(Lax/o4/g$G;Lorg/xml/sax/Attributes;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p0, v0, p1}, Lax/o4/k;->U(Lax/o4/g$Z;Lorg/xml/sax/Attributes;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 39
    .line 40
    invoke-interface {p1, v0}, Lax/o4/g$J;->m(Lax/o4/g$N;)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 44
    .line 45
    iget-object p1, v0, Lax/o4/g$N;->b:Lax/o4/g$J;

    .line 46
    .line 47
    instance-of v1, p1, Lax/o4/g$b0;

    .line 48
    .line 49
    if-eqz v1, :cond_38

    .line 50
    .line 51
    check-cast p1, Lax/o4/g$b0;

    .line 52
    .line 53
    invoke-virtual {v0, p1}, Lax/o4/g$Z;->p(Lax/o4/g$b0;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_38
    check-cast p1, Lax/o4/g$X;

    .line 58
    .line 59
    invoke-interface {p1}, Lax/o4/g$X;->f()Lax/o4/g$b0;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {v0, p1}, Lax/o4/g$Z;->p(Lax/o4/g$b0;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_42
    new-instance p1, Lax/o4/j;

    .line 68
    .line 69
    const-string v0, "Invalid document. Root element must be <svg>"

    .line 70
    .line 71
    invoke-direct {p1, v0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw p1
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
.end method

.method static synthetic g(Lax/o4/k;Ljava/lang/String;Ljava/util/Map;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1, p2}, Lax/o4/k;->r(Ljava/lang/String;Ljava/util/Map;)V

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

.method private static g0(Ljava/lang/String;II)F
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    new-instance v0, Lax/o4/d;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/o4/d;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0, p1, p2}, Lax/o4/d;->b(Ljava/lang/String;II)F

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    if-nez p2, :cond_10

    .line 15
    .line 16
    return p1

    .line 17
    :cond_10
    new-instance p1, Lax/o4/j;

    .line 18
    .line 19
    new-instance p2, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v0, "Invalid float value: "

    .line 25
    .line 26
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-direct {p1, p0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p1
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

.method private g1(Lorg/xml/sax/Attributes;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v1, "<tref>"

    .line 5
    .line 6
    invoke-direct {p0, v1, v0}, Lax/o4/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 10
    .line 11
    if-eqz v0, :cond_4c

    .line 12
    .line 13
    instance-of v0, v0, Lax/o4/g$Y;

    .line 14
    .line 15
    if-eqz v0, :cond_44

    .line 16
    .line 17
    new-instance v0, Lax/o4/g$U;

    .line 18
    .line 19
    invoke-direct {v0}, Lax/o4/g$U;-><init>()V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lax/o4/k;->a:Lax/o4/g;

    .line 23
    .line 24
    iput-object v1, v0, Lax/o4/g$N;->a:Lax/o4/g;

    .line 25
    .line 26
    iget-object v1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 27
    .line 28
    iput-object v1, v0, Lax/o4/g$N;->b:Lax/o4/g$J;

    .line 29
    .line 30
    invoke-direct {p0, v0, p1}, Lax/o4/k;->D(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 31
    .line 32
    .line 33
    invoke-direct {p0, v0, p1}, Lax/o4/k;->S(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 34
    .line 35
    .line 36
    invoke-direct {p0, v0, p1}, Lax/o4/k;->C(Lax/o4/g$G;Lorg/xml/sax/Attributes;)V

    .line 37
    .line 38
    .line 39
    invoke-direct {p0, v0, p1}, Lax/o4/k;->T(Lax/o4/g$U;Lorg/xml/sax/Attributes;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 43
    .line 44
    invoke-interface {p1, v0}, Lax/o4/g$J;->m(Lax/o4/g$N;)V

    .line 45
    .line 46
    .line 47
    iget-object p1, v0, Lax/o4/g$N;->b:Lax/o4/g$J;

    .line 48
    .line 49
    instance-of v1, p1, Lax/o4/g$b0;

    .line 50
    .line 51
    if-eqz v1, :cond_3a

    .line 52
    .line 53
    check-cast p1, Lax/o4/g$b0;

    .line 54
    .line 55
    invoke-virtual {v0, p1}, Lax/o4/g$U;->p(Lax/o4/g$b0;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_3a
    check-cast p1, Lax/o4/g$X;

    .line 60
    .line 61
    invoke-interface {p1}, Lax/o4/g$X;->f()Lax/o4/g$b0;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {v0, p1}, Lax/o4/g$U;->p(Lax/o4/g$b0;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_44
    new-instance p1, Lax/o4/j;

    .line 70
    .line 71
    const-string v0, "Invalid document. <tref> elements are only valid inside <text> or <tspan> elements."

    .line 72
    .line 73
    invoke-direct {p1, v0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw p1

    .line 77
    :cond_4c
    new-instance p1, Lax/o4/j;

    .line 78
    .line 79
    const-string v0, "Invalid document. Root element must be <svg>"

    .line 80
    .line 81
    invoke-direct {p1, v0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw p1
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
.end method

.method private h(Ljava/lang/String;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 2
    .line 3
    check-cast v0, Lax/o4/g$H;

    .line 4
    .line 5
    iget-object v1, v0, Lax/o4/g$H;->i:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_e

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    goto :goto_18

    .line 15
    :cond_e
    iget-object v0, v0, Lax/o4/g$H;->i:Ljava/util/List;

    .line 16
    .line 17
    add-int/lit8 v1, v1, -0x1

    .line 18
    .line 19
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lax/o4/g$N;

    .line 24
    .line 25
    :goto_18
    instance-of v1, v0, Lax/o4/g$c0;

    .line 26
    .line 27
    if-eqz v1, :cond_32

    .line 28
    .line 29
    new-instance v1, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    check-cast v0, Lax/o4/g$c0;

    .line 35
    .line 36
    iget-object v2, v0, Lax/o4/g$c0;->c:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iput-object p1, v0, Lax/o4/g$c0;->c:Ljava/lang/String;

    .line 49
    .line 50
    return-void

    .line 51
    :cond_32
    iget-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 52
    .line 53
    new-instance v1, Lax/o4/g$c0;

    .line 54
    .line 55
    invoke-direct {v1, p1}, Lax/o4/g$c0;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-interface {v0, v1}, Lax/o4/g$J;->m(Lax/o4/g$N;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method private static h0(Lax/o4/g$E;Ljava/lang/String;)V
    .registers 8

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x7c

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "|caption|icon|menu|message-box|small-caption|status-bar|"

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_1d

    .line 28
    .line 29
    goto :goto_74

    .line 30
    :cond_1d
    new-instance v0, Lax/o4/k$i;

    .line 31
    .line 32
    invoke-direct {v0, p1}, Lax/o4/k$i;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    move-object v1, p1

    .line 37
    move-object v2, v1

    .line 38
    :goto_25
    const/16 v3, 0x2f

    .line 39
    .line 40
    invoke-virtual {v0, v3}, Lax/o4/k$i;->s(C)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-virtual {v0}, Lax/o4/k$i;->A()V

    .line 45
    .line 46
    .line 47
    if-nez v4, :cond_31

    .line 48
    .line 49
    goto :goto_74

    .line 50
    :cond_31
    if-eqz p1, :cond_36

    .line 51
    .line 52
    if-eqz v1, :cond_36

    .line 53
    .line 54
    goto :goto_5d

    .line 55
    :cond_36
    const-string v5, "normal"

    .line 56
    .line 57
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    if-eqz v5, :cond_3f

    .line 62
    .line 63
    goto :goto_25

    .line 64
    :cond_3f
    if-nez p1, :cond_48

    .line 65
    .line 66
    invoke-static {v4}, Lax/o4/k$e;->a(Ljava/lang/String;)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-eqz p1, :cond_48

    .line 71
    .line 72
    goto :goto_25

    .line 73
    :cond_48
    if-nez v1, :cond_51

    .line 74
    .line 75
    invoke-static {v4}, Lax/o4/k;->k0(Ljava/lang/String;)Lax/o4/g$E$b;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    if-eqz v1, :cond_51

    .line 80
    .line 81
    goto :goto_25

    .line 82
    :cond_51
    if-nez v2, :cond_5d

    .line 83
    .line 84
    const-string v2, "small-caps"

    .line 85
    .line 86
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-eqz v2, :cond_5d

    .line 91
    .line 92
    move-object v2, v4

    .line 93
    goto :goto_25

    .line 94
    :cond_5d
    :goto_5d
    invoke-static {v4}, Lax/o4/k;->j0(Ljava/lang/String;)Lax/o4/g$p;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-virtual {v0, v3}, Lax/o4/k$i;->f(C)Z

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    if-eqz v3, :cond_78

    .line 103
    .line 104
    invoke-virtual {v0}, Lax/o4/k$i;->A()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Lax/o4/k$i;->r()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    if-eqz v3, :cond_75

    .line 112
    .line 113
    :try_start_70
    invoke-static {v3}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;
    :try_end_73
    .catch Lax/o4/j; {:try_start_70 .. :try_end_73} :catch_74

    .line 114
    .line 115
    .line 116
    goto :goto_75

    .line 117
    :catch_74
    :goto_74
    return-void

    .line 118
    :cond_75
    :goto_75
    invoke-virtual {v0}, Lax/o4/k$i;->A()V

    .line 119
    .line 120
    .line 121
    :cond_78
    invoke-virtual {v0}, Lax/o4/k$i;->y()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-static {v0}, Lax/o4/k;->i0(Ljava/lang/String;)Ljava/util/List;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    iput-object v0, p0, Lax/o4/g$E;->p0:Ljava/util/List;

    .line 130
    .line 131
    iput-object v2, p0, Lax/o4/g$E;->q0:Lax/o4/g$p;

    .line 132
    .line 133
    if-nez p1, :cond_89

    .line 134
    .line 135
    const/16 p1, 0x190

    .line 136
    .line 137
    goto :goto_8d

    .line 138
    :cond_89
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    :goto_8d
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    iput-object p1, p0, Lax/o4/g$E;->r0:Ljava/lang/Integer;

    .line 147
    .line 148
    if-nez v1, :cond_97

    .line 149
    .line 150
    sget-object v1, Lax/o4/g$E$b;->q:Lax/o4/g$E$b;

    .line 151
    .line 152
    :cond_97
    iput-object v1, p0, Lax/o4/g$E;->s0:Lax/o4/g$E$b;

    .line 153
    .line 154
    iget-wide v0, p0, Lax/o4/g$E;->q:J

    .line 155
    .line 156
    const-wide/32 v2, 0x1e000

    .line 157
    .line 158
    .line 159
    or-long/2addr v0, v2

    .line 160
    iput-wide v0, p0, Lax/o4/g$E;->q:J

    .line 161
    .line 162
    return-void
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
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
.end method

.method private h1(Lorg/xml/sax/Attributes;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v1, "<tspan>"

    .line 5
    .line 6
    invoke-direct {p0, v1, v0}, Lax/o4/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 10
    .line 11
    if-eqz v0, :cond_4e

    .line 12
    .line 13
    instance-of v0, v0, Lax/o4/g$Y;

    .line 14
    .line 15
    if-eqz v0, :cond_46

    .line 16
    .line 17
    new-instance v0, Lax/o4/g$V;

    .line 18
    .line 19
    invoke-direct {v0}, Lax/o4/g$V;-><init>()V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lax/o4/k;->a:Lax/o4/g;

    .line 23
    .line 24
    iput-object v1, v0, Lax/o4/g$N;->a:Lax/o4/g;

    .line 25
    .line 26
    iget-object v1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 27
    .line 28
    iput-object v1, v0, Lax/o4/g$N;->b:Lax/o4/g$J;

    .line 29
    .line 30
    invoke-direct {p0, v0, p1}, Lax/o4/k;->D(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 31
    .line 32
    .line 33
    invoke-direct {p0, v0, p1}, Lax/o4/k;->S(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 34
    .line 35
    .line 36
    invoke-direct {p0, v0, p1}, Lax/o4/k;->C(Lax/o4/g$G;Lorg/xml/sax/Attributes;)V

    .line 37
    .line 38
    .line 39
    invoke-direct {p0, v0, p1}, Lax/o4/k;->V(Lax/o4/g$a0;Lorg/xml/sax/Attributes;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 43
    .line 44
    invoke-interface {p1, v0}, Lax/o4/g$J;->m(Lax/o4/g$N;)V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 48
    .line 49
    iget-object p1, v0, Lax/o4/g$N;->b:Lax/o4/g$J;

    .line 50
    .line 51
    instance-of v1, p1, Lax/o4/g$b0;

    .line 52
    .line 53
    if-eqz v1, :cond_3c

    .line 54
    .line 55
    check-cast p1, Lax/o4/g$b0;

    .line 56
    .line 57
    invoke-virtual {v0, p1}, Lax/o4/g$V;->p(Lax/o4/g$b0;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_3c
    check-cast p1, Lax/o4/g$X;

    .line 62
    .line 63
    invoke-interface {p1}, Lax/o4/g$X;->f()Lax/o4/g$b0;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {v0, p1}, Lax/o4/g$V;->p(Lax/o4/g$b0;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_46
    new-instance p1, Lax/o4/j;

    .line 72
    .line 73
    const-string v0, "Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements."

    .line 74
    .line 75
    invoke-direct {p1, v0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw p1

    .line 79
    :cond_4e
    new-instance p1, Lax/o4/j;

    .line 80
    .line 81
    const-string v0, "Invalid document. Root element must be <svg>"

    .line 82
    .line 83
    invoke-direct {p1, v0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw p1
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
.end method

.method private i(Lorg/xml/sax/Attributes;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v1, "<circle>"

    .line 5
    .line 6
    invoke-direct {p0, v1, v0}, Lax/o4/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 10
    .line 11
    if-eqz v0, :cond_2e

    .line 12
    .line 13
    new-instance v0, Lax/o4/g$d;

    .line 14
    .line 15
    invoke-direct {v0}, Lax/o4/g$d;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lax/o4/k;->a:Lax/o4/g;

    .line 19
    .line 20
    iput-object v1, v0, Lax/o4/g$N;->a:Lax/o4/g;

    .line 21
    .line 22
    iget-object v1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 23
    .line 24
    iput-object v1, v0, Lax/o4/g$N;->b:Lax/o4/g$J;

    .line 25
    .line 26
    invoke-direct {p0, v0, p1}, Lax/o4/k;->D(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, v0, p1}, Lax/o4/k;->S(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0, v0, p1}, Lax/o4/k;->W(Lax/o4/g$n;Lorg/xml/sax/Attributes;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p0, v0, p1}, Lax/o4/k;->C(Lax/o4/g$G;Lorg/xml/sax/Attributes;)V

    .line 36
    .line 37
    .line 38
    invoke-direct {p0, v0, p1}, Lax/o4/k;->A(Lax/o4/g$d;Lorg/xml/sax/Attributes;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 42
    .line 43
    invoke-interface {p1, v0}, Lax/o4/g$J;->m(Lax/o4/g$N;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_2e
    new-instance p1, Lax/o4/j;

    .line 48
    .line 49
    const-string v0, "Invalid document. Root element must be <svg>"

    .line 50
    .line 51
    invoke-direct {p1, v0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private static i0(Ljava/lang/String;)Ljava/util/List;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lax/o4/k$i;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lax/o4/k$i;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    :cond_6
    invoke-virtual {v0}, Lax/o4/k$i;->q()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-nez v1, :cond_12

    .line 12
    .line 13
    const/16 v1, 0x2c

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lax/o4/k$i;->u(C)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :cond_12
    if-nez v1, :cond_15

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_15
    if-nez p0, :cond_1c

    .line 23
    .line 24
    new-instance p0, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    :cond_1c
    invoke-interface {p0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Lax/o4/k$i;->z()Z

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lax/o4/k$i;->h()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_6

    .line 40
    .line 41
    return-object p0
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

.method private i1(Lorg/xml/sax/Attributes;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v1, "<use>"

    .line 5
    .line 6
    invoke-direct {p0, v1, v0}, Lax/o4/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 10
    .line 11
    if-eqz v0, :cond_30

    .line 12
    .line 13
    new-instance v0, Lax/o4/g$e0;

    .line 14
    .line 15
    invoke-direct {v0}, Lax/o4/g$e0;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lax/o4/k;->a:Lax/o4/g;

    .line 19
    .line 20
    iput-object v1, v0, Lax/o4/g$N;->a:Lax/o4/g;

    .line 21
    .line 22
    iget-object v1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 23
    .line 24
    iput-object v1, v0, Lax/o4/g$N;->b:Lax/o4/g$J;

    .line 25
    .line 26
    invoke-direct {p0, v0, p1}, Lax/o4/k;->D(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, v0, p1}, Lax/o4/k;->S(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0, v0, p1}, Lax/o4/k;->W(Lax/o4/g$n;Lorg/xml/sax/Attributes;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p0, v0, p1}, Lax/o4/k;->C(Lax/o4/g$G;Lorg/xml/sax/Attributes;)V

    .line 36
    .line 37
    .line 38
    invoke-direct {p0, v0, p1}, Lax/o4/k;->X(Lax/o4/g$e0;Lorg/xml/sax/Attributes;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 42
    .line 43
    invoke-interface {p1, v0}, Lax/o4/g$J;->m(Lax/o4/g$N;)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 47
    .line 48
    return-void

    .line 49
    :cond_30
    new-instance p1, Lax/o4/j;

    .line 50
    .line 51
    const-string v0, "Invalid document. Root element must be <svg>"

    .line 52
    .line 53
    invoke-direct {p1, v0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private static j(F)I
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v0, p0, v0

    .line 3
    .line 4
    if-gez v0, :cond_7

    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    return p0

    .line 8
    :cond_7
    const/high16 v0, 0x437f0000    # 255.0f

    .line 9
    .line 10
    cmpl-float v0, p0, v0

    .line 11
    .line 12
    if-lez v0, :cond_10

    .line 13
    .line 14
    const/16 p0, 0xff

    .line 15
    .line 16
    return p0

    .line 17
    :cond_10
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
    .line 22
.end method

.method private static j0(Ljava/lang/String;)Lax/o4/g$p;
    .registers 2

    .line 1
    :try_start_0
    invoke-static {p0}, Lax/o4/k$d;->a(Ljava/lang/String;)Lax/o4/g$p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_b

    .line 6
    .line 7
    invoke-static {p0}, Lax/o4/k;->o0(Ljava/lang/String;)Lax/o4/g$p;

    .line 8
    .line 9
    .line 10
    move-result-object p0
    :try_end_a
    .catch Lax/o4/j; {:try_start_0 .. :try_end_a} :catch_c

    .line 11
    return-object p0

    .line 12
    :cond_b
    return-object v0

    .line 13
    :catch_c
    const/4 p0, 0x0

    .line 14
    return-object p0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private j1(Lorg/xml/sax/Attributes;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v1, "<view>"

    .line 5
    .line 6
    invoke-direct {p0, v1, v0}, Lax/o4/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 10
    .line 11
    if-eqz v0, :cond_2a

    .line 12
    .line 13
    new-instance v0, Lax/o4/g$f0;

    .line 14
    .line 15
    invoke-direct {v0}, Lax/o4/g$f0;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lax/o4/k;->a:Lax/o4/g;

    .line 19
    .line 20
    iput-object v1, v0, Lax/o4/g$N;->a:Lax/o4/g;

    .line 21
    .line 22
    iget-object v1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 23
    .line 24
    iput-object v1, v0, Lax/o4/g$N;->b:Lax/o4/g$J;

    .line 25
    .line 26
    invoke-direct {p0, v0, p1}, Lax/o4/k;->D(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, v0, p1}, Lax/o4/k;->C(Lax/o4/g$G;Lorg/xml/sax/Attributes;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0, v0, p1}, Lax/o4/k;->Y(Lax/o4/g$R;Lorg/xml/sax/Attributes;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 36
    .line 37
    invoke-interface {p1, v0}, Lax/o4/g$J;->m(Lax/o4/g$N;)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 41
    .line 42
    return-void

    .line 43
    :cond_2a
    new-instance p1, Lax/o4/j;

    .line 44
    .line 45
    const-string v0, "Invalid document. Root element must be <svg>"

    .line 46
    .line 47
    invoke-direct {p1, v0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1
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

.method private k(Lorg/xml/sax/Attributes;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v1, "<clipPath>"

    .line 5
    .line 6
    invoke-direct {p0, v1, v0}, Lax/o4/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 10
    .line 11
    if-eqz v0, :cond_30

    .line 12
    .line 13
    new-instance v0, Lax/o4/g$e;

    .line 14
    .line 15
    invoke-direct {v0}, Lax/o4/g$e;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lax/o4/k;->a:Lax/o4/g;

    .line 19
    .line 20
    iput-object v1, v0, Lax/o4/g$N;->a:Lax/o4/g;

    .line 21
    .line 22
    iget-object v1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 23
    .line 24
    iput-object v1, v0, Lax/o4/g$N;->b:Lax/o4/g$J;

    .line 25
    .line 26
    invoke-direct {p0, v0, p1}, Lax/o4/k;->D(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, v0, p1}, Lax/o4/k;->S(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0, v0, p1}, Lax/o4/k;->W(Lax/o4/g$n;Lorg/xml/sax/Attributes;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p0, v0, p1}, Lax/o4/k;->C(Lax/o4/g$G;Lorg/xml/sax/Attributes;)V

    .line 36
    .line 37
    .line 38
    invoke-direct {p0, v0, p1}, Lax/o4/k;->B(Lax/o4/g$e;Lorg/xml/sax/Attributes;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 42
    .line 43
    invoke-interface {p1, v0}, Lax/o4/g$J;->m(Lax/o4/g$N;)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 47
    .line 48
    return-void

    .line 49
    :cond_30
    new-instance p1, Lax/o4/j;

    .line 50
    .line 51
    const-string v0, "Invalid document. Root element must be <svg>"

    .line 52
    .line 53
    invoke-direct {p1, v0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private static k0(Ljava/lang/String;)Lax/o4/g$E$b;
    .registers 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sparse-switch v1, :sswitch_data_3a

    .line 10
    .line 11
    .line 12
    goto :goto_2c

    .line 13
    :sswitch_c
    const-string v1, "normal"

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-nez p0, :cond_15

    .line 20
    .line 21
    goto :goto_2c

    .line 22
    :cond_15
    const/4 v0, 0x2

    .line 23
    goto :goto_2c

    .line 24
    :sswitch_17
    const-string v1, "italic"

    .line 25
    .line 26
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-nez p0, :cond_20

    .line 31
    .line 32
    goto :goto_2c

    .line 33
    :cond_20
    const/4 v0, 0x1

    .line 34
    goto :goto_2c

    .line 35
    :sswitch_22
    const-string v1, "oblique"

    .line 36
    .line 37
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-nez p0, :cond_2b

    .line 42
    .line 43
    goto :goto_2c

    .line 44
    :cond_2b
    const/4 v0, 0x0

    .line 45
    :goto_2c
    packed-switch v0, :pswitch_data_48

    .line 46
    .line 47
    .line 48
    const/4 p0, 0x0

    .line 49
    return-object p0

    .line 50
    :pswitch_31
    sget-object p0, Lax/o4/g$E$b;->q:Lax/o4/g$E$b;

    .line 51
    .line 52
    return-object p0

    .line 53
    :pswitch_34
    sget-object p0, Lax/o4/g$E$b;->c0:Lax/o4/g$E$b;

    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_37
    sget-object p0, Lax/o4/g$E$b;->d0:Lax/o4/g$E$b;

    .line 57
    .line 58
    return-object p0

    .line 59
    :sswitch_data_3a
    .sparse-switch
        -0x62ce05cf -> :sswitch_22
        -0x4642c5d0 -> :sswitch_17
        -0x3df94319 -> :sswitch_c
    .end sparse-switch

    .line 60
    .line 61
    :pswitch_data_48
    .packed-switch 0x0
        :pswitch_37
        :pswitch_34
        :pswitch_31
    .end packed-switch
.end method

.method private k1(Lorg/xml/sax/Attributes;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v1, "<switch>"

    .line 5
    .line 6
    invoke-direct {p0, v1, v0}, Lax/o4/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 10
    .line 11
    if-eqz v0, :cond_2d

    .line 12
    .line 13
    new-instance v0, Lax/o4/g$S;

    .line 14
    .line 15
    invoke-direct {v0}, Lax/o4/g$S;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lax/o4/k;->a:Lax/o4/g;

    .line 19
    .line 20
    iput-object v1, v0, Lax/o4/g$N;->a:Lax/o4/g;

    .line 21
    .line 22
    iget-object v1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 23
    .line 24
    iput-object v1, v0, Lax/o4/g$N;->b:Lax/o4/g$J;

    .line 25
    .line 26
    invoke-direct {p0, v0, p1}, Lax/o4/k;->D(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, v0, p1}, Lax/o4/k;->S(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0, v0, p1}, Lax/o4/k;->W(Lax/o4/g$n;Lorg/xml/sax/Attributes;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p0, v0, p1}, Lax/o4/k;->C(Lax/o4/g$G;Lorg/xml/sax/Attributes;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 39
    .line 40
    invoke-interface {p1, v0}, Lax/o4/g$J;->m(Lax/o4/g$N;)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 44
    .line 45
    return-void

    .line 46
    :cond_2d
    new-instance p1, Lax/o4/j;

    .line 47
    .line 48
    const-string v0, "Invalid document. Root element must be <svg>"

    .line 49
    .line 50
    invoke-direct {p1, v0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private varargs l(Ljava/lang/String;[Ljava/lang/Object;)V
    .registers 3

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

.method private static l0(Ljava/lang/String;)Ljava/lang/Integer;
    .registers 1

    .line 1
    invoke-static {p0}, Lax/o4/k$e;->a(Ljava/lang/String;)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method private m(Lorg/xml/sax/Attributes;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v1, "<defs>"

    .line 5
    .line 6
    invoke-direct {p0, v1, v0}, Lax/o4/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 10
    .line 11
    if-eqz v0, :cond_2a

    .line 12
    .line 13
    new-instance v0, Lax/o4/g$h;

    .line 14
    .line 15
    invoke-direct {v0}, Lax/o4/g$h;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lax/o4/k;->a:Lax/o4/g;

    .line 19
    .line 20
    iput-object v1, v0, Lax/o4/g$N;->a:Lax/o4/g;

    .line 21
    .line 22
    iget-object v1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 23
    .line 24
    iput-object v1, v0, Lax/o4/g$N;->b:Lax/o4/g$J;

    .line 25
    .line 26
    invoke-direct {p0, v0, p1}, Lax/o4/k;->D(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, v0, p1}, Lax/o4/k;->S(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0, v0, p1}, Lax/o4/k;->W(Lax/o4/g$n;Lorg/xml/sax/Attributes;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 36
    .line 37
    invoke-interface {p1, v0}, Lax/o4/g$J;->m(Lax/o4/g$N;)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 41
    .line 42
    return-void

    .line 43
    :cond_2a
    new-instance p1, Lax/o4/j;

    .line 44
    .line 45
    const-string v0, "Invalid document. Root element must be <svg>"

    .line 46
    .line 47
    invoke-direct {p1, v0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1
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

.method private static m0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .registers 3

    .line 1
    const-string p1, "none"

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p1, :cond_a

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_a
    const-string p1, "url("

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_13

    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_13
    const-string p1, ")"

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    const/4 v0, 0x4

    .line 27
    if-eqz p1, :cond_2b

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    add-int/lit8 p1, p1, -0x1

    .line 34
    .line 35
    invoke-virtual {p0, v0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :cond_2b
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
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

.method private n(Lorg/xml/sax/Attributes;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v1, "<ellipse>"

    .line 5
    .line 6
    invoke-direct {p0, v1, v0}, Lax/o4/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 10
    .line 11
    if-eqz v0, :cond_2e

    .line 12
    .line 13
    new-instance v0, Lax/o4/g$i;

    .line 14
    .line 15
    invoke-direct {v0}, Lax/o4/g$i;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lax/o4/k;->a:Lax/o4/g;

    .line 19
    .line 20
    iput-object v1, v0, Lax/o4/g$N;->a:Lax/o4/g;

    .line 21
    .line 22
    iget-object v1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 23
    .line 24
    iput-object v1, v0, Lax/o4/g$N;->b:Lax/o4/g$J;

    .line 25
    .line 26
    invoke-direct {p0, v0, p1}, Lax/o4/k;->D(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, v0, p1}, Lax/o4/k;->S(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0, v0, p1}, Lax/o4/k;->W(Lax/o4/g$n;Lorg/xml/sax/Attributes;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p0, v0, p1}, Lax/o4/k;->C(Lax/o4/g$G;Lorg/xml/sax/Attributes;)V

    .line 36
    .line 37
    .line 38
    invoke-direct {p0, v0, p1}, Lax/o4/k;->E(Lax/o4/g$i;Lorg/xml/sax/Attributes;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 42
    .line 43
    invoke-interface {p1, v0}, Lax/o4/g$J;->m(Lax/o4/g$N;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_2e
    new-instance p1, Lax/o4/j;

    .line 48
    .line 49
    const-string v0, "Invalid document. Root element must be <svg>"

    .line 50
    .line 51
    invoke-direct {p1, v0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private n0(Ljava/lang/String;)Ljava/lang/Float;
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_50

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x1

    .line 16
    sub-int/2addr v1, v2

    .line 17
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/16 v3, 0x25

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    if-ne v1, v3, :cond_1c

    .line 25
    .line 26
    add-int/lit8 v0, v0, -0x1

    .line 27
    .line 28
    goto :goto_1d

    .line 29
    :cond_1c
    const/4 v2, 0x0

    .line 30
    :goto_1d
    :try_start_1d
    invoke-static {p1, v4, v0}, Lax/o4/k;->g0(Ljava/lang/String;II)F

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/high16 v1, 0x42c80000    # 100.0f

    .line 35
    .line 36
    if-eqz v2, :cond_26

    .line 37
    .line 38
    div-float/2addr v0, v1

    .line 39
    :cond_26
    const/4 v2, 0x0

    .line 40
    cmpg-float v3, v0, v2

    .line 41
    .line 42
    if-gez v3, :cond_2d

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    goto :goto_33

    .line 46
    :cond_2d
    cmpl-float v2, v0, v1

    .line 47
    .line 48
    if-lez v2, :cond_32

    .line 49
    .line 50
    goto :goto_33

    .line 51
    :cond_32
    move v1, v0

    .line 52
    :goto_33
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 53
    .line 54
    .line 55
    move-result-object p1
    :try_end_37
    .catch Ljava/lang/NumberFormatException; {:try_start_1d .. :try_end_37} :catch_38

    .line 56
    return-object p1

    .line 57
    :catch_38
    move-exception v0

    .line 58
    new-instance v1, Lax/o4/j;

    .line 59
    .line 60
    new-instance v2, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    const-string v3, "Invalid offset value in <stop>: "

    .line 66
    .line 67
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-direct {v1, p1, v0}, Lax/o4/j;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 78
    .line 79
    .line 80
    throw v1

    .line 81
    :cond_50
    new-instance p1, Lax/o4/j;

    .line 82
    .line 83
    const-string v0, "Invalid offset value in <stop> (empty string)"

    .line 84
    .line 85
    invoke-direct {p1, v0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw p1
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
.end method

.method private o()V
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

.method static o0(Ljava/lang/String;)Lax/o4/g$p;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_7b

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    sget-object v1, Lax/o4/g$d0;->q:Lax/o4/g$d0;

    .line 12
    .line 13
    add-int/lit8 v2, v0, -0x1

    .line 14
    .line 15
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/16 v3, 0x25

    .line 20
    .line 21
    if-ne v2, v3, :cond_1b

    .line 22
    .line 23
    add-int/lit8 v0, v0, -0x1

    .line 24
    .line 25
    sget-object v1, Lax/o4/g$d0;->j0:Lax/o4/g$d0;

    .line 26
    .line 27
    goto :goto_58

    .line 28
    :cond_1b
    const/4 v3, 0x2

    .line 29
    if-le v0, v3, :cond_58

    .line 30
    .line 31
    invoke-static {v2}, Ljava/lang/Character;->isLetter(C)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_58

    .line 36
    .line 37
    add-int/lit8 v2, v0, -0x2

    .line 38
    .line 39
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    invoke-static {v2}, Ljava/lang/Character;->isLetter(C)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_58

    .line 48
    .line 49
    add-int/lit8 v0, v0, -0x2

    .line 50
    .line 51
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    :try_start_36
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 56
    .line 57
    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-static {v1}, Lax/o4/g$d0;->valueOf(Ljava/lang/String;)Lax/o4/g$d0;

    .line 62
    .line 63
    .line 64
    move-result-object v1
    :try_end_40
    .catch Ljava/lang/IllegalArgumentException; {:try_start_36 .. :try_end_40} :catch_41

    .line 65
    goto :goto_58

    .line 66
    :catch_41
    new-instance v0, Lax/o4/j;

    .line 67
    .line 68
    new-instance v1, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 71
    .line 72
    .line 73
    const-string v2, "Invalid length unit specifier: "

    .line 74
    .line 75
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-direct {v0, p0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw v0

    .line 89
    :cond_58
    :goto_58
    const/4 v2, 0x0

    .line 90
    :try_start_59
    invoke-static {p0, v2, v0}, Lax/o4/k;->g0(Ljava/lang/String;II)F

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    new-instance v2, Lax/o4/g$p;

    .line 95
    .line 96
    invoke-direct {v2, v0, v1}, Lax/o4/g$p;-><init>(FLax/o4/g$d0;)V
    :try_end_62
    .catch Ljava/lang/NumberFormatException; {:try_start_59 .. :try_end_62} :catch_63

    .line 97
    .line 98
    .line 99
    return-object v2

    .line 100
    :catch_63
    move-exception v0

    .line 101
    new-instance v1, Lax/o4/j;

    .line 102
    .line 103
    new-instance v2, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 106
    .line 107
    .line 108
    const-string v3, "Invalid length value: "

    .line 109
    .line 110
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-direct {v1, p0, v0}, Lax/o4/j;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 121
    .line 122
    .line 123
    throw v1

    .line 124
    :cond_7b
    new-instance p0, Lax/o4/j;

    .line 125
    .line 126
    const-string v0, "Invalid length value (empty string)"

    .line 127
    .line 128
    invoke-direct {p0, v0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw p0
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

.method private p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lax/o4/k;->c:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_10

    .line 6
    .line 7
    iget v0, p0, Lax/o4/k;->d:I

    .line 8
    .line 9
    sub-int/2addr v0, v1

    .line 10
    iput v0, p0, Lax/o4/k;->d:I

    .line 11
    .line 12
    if-nez v0, :cond_10

    .line 13
    .line 14
    iput-boolean v2, p0, Lax/o4/k;->c:Z

    .line 15
    .line 16
    return-void

    .line 17
    :cond_10
    const-string v0, "http://www.w3.org/2000/svg"

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_21

    .line 24
    .line 25
    const-string v0, ""

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-nez p1, :cond_21

    .line 32
    .line 33
    goto :goto_87

    .line 34
    :cond_21
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-lez p1, :cond_28

    .line 39
    .line 40
    goto :goto_29

    .line 41
    :cond_28
    move-object p2, p3

    .line 42
    :goto_29
    sget-object p1, Lax/o4/k$a;->a:[I

    .line 43
    .line 44
    invoke-static {p2}, Lax/o4/k$h;->d(Ljava/lang/String;)Lax/o4/k$h;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    aget p1, p1, p2

    .line 53
    .line 54
    if-eq p1, v1, :cond_88

    .line 55
    .line 56
    const/4 p2, 0x2

    .line 57
    if-eq p1, p2, :cond_88

    .line 58
    .line 59
    const/4 p2, 0x4

    .line 60
    if-eq p1, p2, :cond_88

    .line 61
    .line 62
    const/4 p2, 0x5

    .line 63
    if-eq p1, p2, :cond_88

    .line 64
    .line 65
    const/16 p2, 0xd

    .line 66
    .line 67
    if-eq p1, p2, :cond_88

    .line 68
    .line 69
    const/16 p2, 0xe

    .line 70
    .line 71
    if-eq p1, p2, :cond_88

    .line 72
    .line 73
    packed-switch p1, :pswitch_data_92

    .line 74
    .line 75
    .line 76
    goto :goto_87

    .line 77
    :pswitch_4c
    iget-object p1, p0, Lax/o4/k;->i:Ljava/lang/StringBuilder;

    .line 78
    .line 79
    if-eqz p1, :cond_87

    .line 80
    .line 81
    iput-boolean v2, p0, Lax/o4/k;->h:Z

    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-direct {p0, p1}, Lax/o4/k;->Z(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    iget-object p1, p0, Lax/o4/k;->i:Ljava/lang/StringBuilder;

    .line 91
    .line 92
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :pswitch_5f
    iput-boolean v2, p0, Lax/o4/k;->e:Z

    .line 97
    .line 98
    iget-object p1, p0, Lax/o4/k;->g:Ljava/lang/StringBuilder;

    .line 99
    .line 100
    if-eqz p1, :cond_87

    .line 101
    .line 102
    iget-object p2, p0, Lax/o4/k;->f:Lax/o4/k$h;

    .line 103
    .line 104
    sget-object p3, Lax/o4/k$h;->B0:Lax/o4/k$h;

    .line 105
    .line 106
    if-ne p2, p3, :cond_75

    .line 107
    .line 108
    iget-object p2, p0, Lax/o4/k;->a:Lax/o4/g;

    .line 109
    .line 110
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-virtual {p2, p1}, Lax/o4/g;->u(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    goto :goto_82

    .line 118
    :cond_75
    sget-object p3, Lax/o4/k$h;->g0:Lax/o4/k$h;

    .line 119
    .line 120
    if-ne p2, p3, :cond_82

    .line 121
    .line 122
    iget-object p2, p0, Lax/o4/k;->a:Lax/o4/g;

    .line 123
    .line 124
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-virtual {p2, p1}, Lax/o4/g;->s(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    :cond_82
    :goto_82
    iget-object p1, p0, Lax/o4/k;->g:Ljava/lang/StringBuilder;

    .line 132
    .line 133
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 134
    .line 135
    .line 136
    :cond_87
    :goto_87
    return-void

    .line 137
    :cond_88
    :pswitch_88
    iget-object p1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 138
    .line 139
    check-cast p1, Lax/o4/g$N;

    .line 140
    .line 141
    iget-object p1, p1, Lax/o4/g$N;->b:Lax/o4/g$J;

    .line 142
    .line 143
    iput-object p1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 144
    .line 145
    return-void

    .line 146
    nop

    .line 147
    :pswitch_data_92
    .packed-switch 0x10
        :pswitch_88
        :pswitch_88
        :pswitch_88
        :pswitch_88
        :pswitch_88
        :pswitch_88
        :pswitch_5f
        :pswitch_5f
        :pswitch_88
        :pswitch_88
        :pswitch_88
        :pswitch_88
        :pswitch_88
        :pswitch_88
        :pswitch_4c
        :pswitch_88
    .end packed-switch
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

.method private static p0(Ljava/lang/String;)Ljava/util/List;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lax/o4/g$p;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_54

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Lax/o4/k$i;

    .line 14
    .line 15
    invoke-direct {v1, p0}, Lax/o4/k$i;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Lax/o4/k$i;->A()V

    .line 19
    .line 20
    .line 21
    :goto_14
    invoke-virtual {v1}, Lax/o4/k$i;->h()Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-nez p0, :cond_53

    .line 26
    .line 27
    invoke-virtual {v1}, Lax/o4/k$i;->n()F

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-nez v2, :cond_38

    .line 36
    .line 37
    invoke-virtual {v1}, Lax/o4/k$i;->v()Lax/o4/g$d0;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    if-nez v2, :cond_2c

    .line 42
    .line 43
    sget-object v2, Lax/o4/g$d0;->q:Lax/o4/g$d0;

    .line 44
    .line 45
    :cond_2c
    new-instance v3, Lax/o4/g$p;

    .line 46
    .line 47
    invoke-direct {v3, p0, v2}, Lax/o4/g$p;-><init>(FLax/o4/g$d0;)V

    .line 48
    .line 49
    .line 50
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Lax/o4/k$i;->z()Z

    .line 54
    .line 55
    .line 56
    goto :goto_14

    .line 57
    :cond_38
    new-instance p0, Lax/o4/j;

    .line 58
    .line 59
    new-instance v0, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    const-string v2, "Invalid length list value: "

    .line 65
    .line 66
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, Lax/o4/k$i;->b()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-direct {p0, v0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw p0

    .line 84
    :cond_53
    return-object v0

    .line 85
    :cond_54
    new-instance p0, Lax/o4/j;

    .line 86
    .line 87
    const-string v0, "Invalid length list (empty string)"

    .line 88
    .line 89
    invoke-direct {p0, v0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw p0
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
.end method

.method private q(Lorg/xml/sax/Attributes;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v1, "<g>"

    .line 5
    .line 6
    invoke-direct {p0, v1, v0}, Lax/o4/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 10
    .line 11
    if-eqz v0, :cond_2d

    .line 12
    .line 13
    new-instance v0, Lax/o4/g$m;

    .line 14
    .line 15
    invoke-direct {v0}, Lax/o4/g$m;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lax/o4/k;->a:Lax/o4/g;

    .line 19
    .line 20
    iput-object v1, v0, Lax/o4/g$N;->a:Lax/o4/g;

    .line 21
    .line 22
    iget-object v1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 23
    .line 24
    iput-object v1, v0, Lax/o4/g$N;->b:Lax/o4/g$J;

    .line 25
    .line 26
    invoke-direct {p0, v0, p1}, Lax/o4/k;->D(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, v0, p1}, Lax/o4/k;->S(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0, v0, p1}, Lax/o4/k;->W(Lax/o4/g$n;Lorg/xml/sax/Attributes;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p0, v0, p1}, Lax/o4/k;->C(Lax/o4/g$G;Lorg/xml/sax/Attributes;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 39
    .line 40
    invoke-interface {p1, v0}, Lax/o4/g$J;->m(Lax/o4/g$N;)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 44
    .line 45
    return-void

    .line 46
    :cond_2d
    new-instance p1, Lax/o4/j;

    .line 47
    .line 48
    const-string v0, "Invalid document. Root element must be <svg>"

    .line 49
    .line 50
    invoke-direct {p1, v0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private static q0(Lax/o4/k$i;)Lax/o4/g$p;
    .registers 2

    .line 1
    const-string v0, "auto"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/o4/k$i;->g(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_f

    .line 8
    .line 9
    new-instance p0, Lax/o4/g$p;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-direct {p0, v0}, Lax/o4/g$p;-><init>(F)V

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_f
    invoke-virtual {p0}, Lax/o4/k$i;->p()Lax/o4/g$p;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
    .line 21
    .line 22
.end method

.method private r(Ljava/lang/String;Ljava/util/Map;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string p2, "xml-stylesheet"

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_b

    .line 8
    .line 9
    invoke-static {}, Lax/o4/g;->k()Lax/o4/i;

    .line 10
    .line 11
    .line 12
    :cond_b
    return-void
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

.method private static r0(Ljava/lang/String;)Ljava/lang/Float;
    .registers 3

    .line 1
    :try_start_0
    invoke-static {p0}, Lax/o4/k;->f0(Ljava/lang/String;)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, 0x0

    .line 6
    cmpg-float v1, p0, v0

    .line 7
    .line 8
    if-gez v1, :cond_b

    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    goto :goto_13

    .line 12
    :cond_b
    const/high16 v0, 0x3f800000    # 1.0f

    .line 13
    .line 14
    cmpl-float v1, p0, v0

    .line 15
    .line 16
    if-lez v1, :cond_13

    .line 17
    .line 18
    const/high16 p0, 0x3f800000    # 1.0f

    .line 19
    .line 20
    :cond_13
    :goto_13
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 21
    .line 22
    .line 23
    move-result-object p0
    :try_end_17
    .catch Lax/o4/j; {:try_start_0 .. :try_end_17} :catch_18

    .line 24
    return-object p0

    .line 25
    :catch_18
    const/4 p0, 0x0

    .line 26
    return-object p0
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
.end method

.method private static s(FFF)I
    .registers 6

    .line 1
    const/high16 v0, 0x43b40000    # 360.0f

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    cmpl-float v2, p0, v1

    .line 5
    .line 6
    rem-float/2addr p0, v0

    .line 7
    if-ltz v2, :cond_9

    .line 8
    .line 9
    goto :goto_a

    .line 10
    :cond_9
    add-float/2addr p0, v0

    .line 11
    :goto_a
    const/high16 v0, 0x42700000    # 60.0f

    .line 12
    .line 13
    div-float/2addr p0, v0

    .line 14
    const/high16 v0, 0x42c80000    # 100.0f

    .line 15
    .line 16
    div-float/2addr p1, v0

    .line 17
    div-float/2addr p2, v0

    .line 18
    const/high16 v0, 0x3f800000    # 1.0f

    .line 19
    .line 20
    cmpg-float v2, p1, v1

    .line 21
    .line 22
    if-gez v2, :cond_19

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    goto :goto_1f

    .line 26
    :cond_19
    cmpl-float v2, p1, v0

    .line 27
    .line 28
    if-lez v2, :cond_1f

    .line 29
    .line 30
    const/high16 p1, 0x3f800000    # 1.0f

    .line 31
    .line 32
    :cond_1f
    :goto_1f
    cmpg-float v2, p2, v1

    .line 33
    .line 34
    if-gez v2, :cond_24

    .line 35
    .line 36
    goto :goto_2c

    .line 37
    :cond_24
    cmpl-float v1, p2, v0

    .line 38
    .line 39
    if-lez v1, :cond_2b

    .line 40
    .line 41
    const/high16 v1, 0x3f800000    # 1.0f

    .line 42
    .line 43
    goto :goto_2c

    .line 44
    :cond_2b
    move v1, p2

    .line 45
    :goto_2c
    const/high16 p2, 0x3f000000    # 0.5f

    .line 46
    .line 47
    cmpg-float p2, v1, p2

    .line 48
    .line 49
    if-gtz p2, :cond_36

    .line 50
    .line 51
    add-float/2addr p1, v0

    .line 52
    mul-float p1, p1, v1

    .line 53
    .line 54
    goto :goto_3c

    .line 55
    :cond_36
    add-float p2, v1, p1

    .line 56
    .line 57
    mul-float p1, p1, v1

    .line 58
    .line 59
    sub-float p1, p2, p1

    .line 60
    .line 61
    :goto_3c
    const/high16 p2, 0x40000000    # 2.0f

    .line 62
    .line 63
    mul-float v1, v1, p2

    .line 64
    .line 65
    sub-float/2addr v1, p1

    .line 66
    add-float v0, p0, p2

    .line 67
    .line 68
    invoke-static {v1, p1, v0}, Lax/o4/k;->t(FFF)F

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    invoke-static {v1, p1, p0}, Lax/o4/k;->t(FFF)F

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    sub-float/2addr p0, p2

    .line 77
    invoke-static {v1, p1, p0}, Lax/o4/k;->t(FFF)F

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    const/high16 p1, 0x43800000    # 256.0f

    .line 82
    .line 83
    mul-float v0, v0, p1

    .line 84
    .line 85
    invoke-static {v0}, Lax/o4/k;->j(F)I

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    shl-int/lit8 p2, p2, 0x10

    .line 90
    .line 91
    mul-float v2, v2, p1

    .line 92
    .line 93
    invoke-static {v2}, Lax/o4/k;->j(F)I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    shl-int/lit8 v0, v0, 0x8

    .line 98
    .line 99
    or-int/2addr p2, v0

    .line 100
    mul-float p0, p0, p1

    .line 101
    .line 102
    invoke-static {p0}, Lax/o4/k;->j(F)I

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    or-int/2addr p0, p2

    .line 107
    return p0
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

.method private static s0(Ljava/lang/String;)Ljava/lang/Boolean;
    .registers 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sparse-switch v1, :sswitch_data_42

    .line 10
    .line 11
    .line 12
    goto :goto_37

    .line 13
    :sswitch_c
    const-string v1, "visible"

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-nez p0, :cond_15

    .line 20
    .line 21
    goto :goto_37

    .line 22
    :cond_15
    const/4 v0, 0x3

    .line 23
    goto :goto_37

    .line 24
    :sswitch_17
    const-string v1, "auto"

    .line 25
    .line 26
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-nez p0, :cond_20

    .line 31
    .line 32
    goto :goto_37

    .line 33
    :cond_20
    const/4 v0, 0x2

    .line 34
    goto :goto_37

    .line 35
    :sswitch_22
    const-string v1, "scroll"

    .line 36
    .line 37
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-nez p0, :cond_2b

    .line 42
    .line 43
    goto :goto_37

    .line 44
    :cond_2b
    const/4 v0, 0x1

    .line 45
    goto :goto_37

    .line 46
    :sswitch_2d
    const-string v1, "hidden"

    .line 47
    .line 48
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-nez p0, :cond_36

    .line 53
    .line 54
    goto :goto_37

    .line 55
    :cond_36
    const/4 v0, 0x0

    .line 56
    :goto_37
    packed-switch v0, :pswitch_data_54

    .line 57
    .line 58
    .line 59
    const/4 p0, 0x0

    .line 60
    return-object p0

    .line 61
    :pswitch_3c
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 62
    .line 63
    return-object p0

    .line 64
    :pswitch_3f
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 65
    .line 66
    return-object p0

    .line 67
    :sswitch_data_42
    .sparse-switch
        -0x48916256 -> :sswitch_2d
        -0x361a1933 -> :sswitch_22
        0x2dddaf -> :sswitch_17
        0x1bd1f072 -> :sswitch_c
    .end sparse-switch

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
    :pswitch_data_54
    .packed-switch 0x0
        :pswitch_3f
        :pswitch_3f
        :pswitch_3c
        :pswitch_3c
    .end packed-switch
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
.end method

.method private static t(FFF)F
    .registers 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/high16 v1, 0x40c00000    # 6.0f

    .line 3
    .line 4
    cmpg-float v0, p2, v0

    .line 5
    .line 6
    if-gez v0, :cond_8

    .line 7
    .line 8
    add-float/2addr p2, v1

    .line 9
    :cond_8
    cmpl-float v0, p2, v1

    .line 10
    .line 11
    if-ltz v0, :cond_d

    .line 12
    .line 13
    sub-float/2addr p2, v1

    .line 14
    :cond_d
    const/high16 v0, 0x3f800000    # 1.0f

    .line 15
    .line 16
    cmpg-float v0, p2, v0

    .line 17
    .line 18
    if-gez v0, :cond_18

    .line 19
    .line 20
    sub-float/2addr p1, p0

    .line 21
    mul-float p1, p1, p2

    .line 22
    .line 23
    :goto_16
    add-float/2addr p1, p0

    .line 24
    return p1

    .line 25
    :cond_18
    const/high16 v0, 0x40400000    # 3.0f

    .line 26
    .line 27
    cmpg-float v0, p2, v0

    .line 28
    .line 29
    if-gez v0, :cond_1f

    .line 30
    .line 31
    return p1

    .line 32
    :cond_1f
    const/high16 v0, 0x40800000    # 4.0f

    .line 33
    .line 34
    cmpg-float v1, p2, v0

    .line 35
    .line 36
    if-gez v1, :cond_2a

    .line 37
    .line 38
    sub-float/2addr p1, p0

    .line 39
    sub-float/2addr v0, p2

    .line 40
    mul-float p1, p1, v0

    .line 41
    .line 42
    goto :goto_16

    .line 43
    :cond_2a
    return p0
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

.method private static t0(Ljava/lang/String;)Lax/o4/g$O;
    .registers 5

    .line 1
    const-string v0, "url("

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_43

    .line 8
    .line 9
    const-string v0, ")"

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, -0x1

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x4

    .line 18
    if-eq v0, v1, :cond_35

    .line 19
    .line 20
    invoke-virtual {p0, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    add-int/lit8 v0, v0, 0x1

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-lez v0, :cond_2f

    .line 43
    .line 44
    invoke-static {p0}, Lax/o4/k;->d0(Ljava/lang/String;)Lax/o4/g$O;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    :cond_2f
    new-instance p0, Lax/o4/g$u;

    .line 49
    .line 50
    invoke-direct {p0, v1, v2}, Lax/o4/g$u;-><init>(Ljava/lang/String;Lax/o4/g$O;)V

    .line 51
    .line 52
    .line 53
    return-object p0

    .line 54
    :cond_35
    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    new-instance v0, Lax/o4/g$u;

    .line 63
    .line 64
    invoke-direct {v0, p0, v2}, Lax/o4/g$u;-><init>(Ljava/lang/String;Lax/o4/g$O;)V

    .line 65
    .line 66
    .line 67
    return-object v0

    .line 68
    :cond_43
    invoke-static {p0}, Lax/o4/k;->d0(Ljava/lang/String;)Lax/o4/g$O;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0
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
.end method

.method private u(Lorg/xml/sax/Attributes;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v1, "<image>"

    .line 5
    .line 6
    invoke-direct {p0, v1, v0}, Lax/o4/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 10
    .line 11
    if-eqz v0, :cond_30

    .line 12
    .line 13
    new-instance v0, Lax/o4/g$o;

    .line 14
    .line 15
    invoke-direct {v0}, Lax/o4/g$o;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lax/o4/k;->a:Lax/o4/g;

    .line 19
    .line 20
    iput-object v1, v0, Lax/o4/g$N;->a:Lax/o4/g;

    .line 21
    .line 22
    iget-object v1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 23
    .line 24
    iput-object v1, v0, Lax/o4/g$N;->b:Lax/o4/g$J;

    .line 25
    .line 26
    invoke-direct {p0, v0, p1}, Lax/o4/k;->D(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, v0, p1}, Lax/o4/k;->S(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0, v0, p1}, Lax/o4/k;->W(Lax/o4/g$n;Lorg/xml/sax/Attributes;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p0, v0, p1}, Lax/o4/k;->C(Lax/o4/g$G;Lorg/xml/sax/Attributes;)V

    .line 36
    .line 37
    .line 38
    invoke-direct {p0, v0, p1}, Lax/o4/k;->G(Lax/o4/g$o;Lorg/xml/sax/Attributes;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 42
    .line 43
    invoke-interface {p1, v0}, Lax/o4/g$J;->m(Lax/o4/g$N;)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 47
    .line 48
    return-void

    .line 49
    :cond_30
    new-instance p1, Lax/o4/j;

    .line 50
    .line 51
    const-string v0, "Invalid document. Root element must be <svg>"

    .line 52
    .line 53
    invoke-direct {p1, v0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private static u0(Ljava/lang/String;)Lax/o4/g$w;
    .registers 20

    .line 1
    new-instance v0, Lax/o4/k$i;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lax/o4/k$i;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lax/o4/g$w;

    .line 9
    .line 10
    invoke-direct {v1}, Lax/o4/g$w;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lax/o4/k$i;->h()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_14

    .line 18
    .line 19
    goto/16 :goto_282

    .line 20
    .line 21
    :cond_14
    invoke-virtual {v0}, Lax/o4/k$i;->l()Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const/16 v3, 0x4d

    .line 30
    .line 31
    const/16 v9, 0x6d

    .line 32
    .line 33
    if-eq v2, v3, :cond_26

    .line 34
    .line 35
    if-eq v2, v9, :cond_26

    .line 36
    .line 37
    goto/16 :goto_282

    .line 38
    .line 39
    :cond_26
    move v11, v2

    .line 40
    const/4 v2, 0x0

    .line 41
    const/4 v3, 0x0

    .line 42
    const/4 v4, 0x0

    .line 43
    const/4 v5, 0x0

    .line 44
    const/4 v12, 0x0

    .line 45
    const/4 v13, 0x0

    .line 46
    :goto_2d
    invoke-virtual {v0}, Lax/o4/k$i;->A()V

    .line 47
    .line 48
    .line 49
    const/16 v6, 0x6c

    .line 50
    .line 51
    const/high16 v7, 0x40000000    # 2.0f

    .line 52
    .line 53
    const-string v8, " path segment"

    .line 54
    .line 55
    const-string v14, "Bad path coords for "

    .line 56
    .line 57
    const-string v15, "SVGParser"

    .line 58
    .line 59
    sparse-switch v11, :sswitch_data_2ac

    .line 60
    .line 61
    .line 62
    goto/16 :goto_282

    .line 63
    .line 64
    :sswitch_3f
    invoke-virtual {v1}, Lax/o4/g$w;->close()V

    .line 65
    .line 66
    .line 67
    move v2, v12

    .line 68
    move v3, v2

    .line 69
    move v4, v13

    .line 70
    :goto_45
    move v5, v4

    .line 71
    :goto_46
    const/16 p0, 0x0

    .line 72
    .line 73
    goto/16 :goto_279

    .line 74
    .line 75
    :sswitch_4a
    invoke-virtual {v0}, Lax/o4/k$i;->n()F

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    if-eqz v6, :cond_6b

    .line 84
    .line 85
    new-instance v0, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    int-to-char v2, v11

    .line 94
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-static {v15, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 105
    .line 106
    .line 107
    return-object v1

    .line 108
    :cond_6b
    const/16 v6, 0x76

    .line 109
    .line 110
    if-ne v11, v6, :cond_70

    .line 111
    .line 112
    add-float/2addr v5, v4

    .line 113
    :cond_70
    move v4, v5

    .line 114
    invoke-virtual {v1, v2, v4}, Lax/o4/g$w;->e(FF)V

    .line 115
    .line 116
    .line 117
    goto :goto_45

    .line 118
    :sswitch_75
    mul-float v6, v2, v7

    .line 119
    .line 120
    sub-float v3, v6, v3

    .line 121
    .line 122
    mul-float v7, v7, v4

    .line 123
    .line 124
    sub-float v5, v7, v5

    .line 125
    .line 126
    invoke-virtual {v0}, Lax/o4/k$i;->n()F

    .line 127
    .line 128
    .line 129
    move-result v6

    .line 130
    invoke-virtual {v0, v6}, Lax/o4/k$i;->d(F)F

    .line 131
    .line 132
    .line 133
    move-result v7

    .line 134
    invoke-static {v7}, Ljava/lang/Float;->isNaN(F)Z

    .line 135
    .line 136
    .line 137
    move-result v16

    .line 138
    if-eqz v16, :cond_a2

    .line 139
    .line 140
    new-instance v0, Ljava/lang/StringBuilder;

    .line 141
    .line 142
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    int-to-char v2, v11

    .line 149
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-static {v15, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 160
    .line 161
    .line 162
    return-object v1

    .line 163
    :cond_a2
    const/16 v8, 0x74

    .line 164
    .line 165
    if-ne v11, v8, :cond_a8

    .line 166
    .line 167
    add-float/2addr v6, v2

    .line 168
    add-float/2addr v7, v4

    .line 169
    :cond_a8
    move v2, v6

    .line 170
    move v4, v7

    .line 171
    invoke-virtual {v1, v3, v5, v2, v4}, Lax/o4/g$w;->a(FFFF)V

    .line 172
    .line 173
    .line 174
    goto :goto_46

    .line 175
    :sswitch_ae
    mul-float v6, v2, v7

    .line 176
    .line 177
    sub-float/2addr v6, v3

    .line 178
    mul-float v7, v7, v4

    .line 179
    .line 180
    sub-float v3, v7, v5

    .line 181
    .line 182
    invoke-virtual {v0}, Lax/o4/k$i;->n()F

    .line 183
    .line 184
    .line 185
    move-result v5

    .line 186
    invoke-virtual {v0, v5}, Lax/o4/k$i;->d(F)F

    .line 187
    .line 188
    .line 189
    move-result v7

    .line 190
    const/16 p0, 0x0

    .line 191
    .line 192
    invoke-virtual {v0, v7}, Lax/o4/k$i;->d(F)F

    .line 193
    .line 194
    .line 195
    move-result v10

    .line 196
    invoke-virtual {v0, v10}, Lax/o4/k$i;->d(F)F

    .line 197
    .line 198
    .line 199
    move-result v16

    .line 200
    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->isNaN(F)Z

    .line 201
    .line 202
    .line 203
    move-result v17

    .line 204
    if-eqz v17, :cond_e4

    .line 205
    .line 206
    new-instance v0, Ljava/lang/StringBuilder;

    .line 207
    .line 208
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    int-to-char v2, v11

    .line 215
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    invoke-static {v15, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 226
    .line 227
    .line 228
    return-object v1

    .line 229
    :cond_e4
    const/16 v8, 0x73

    .line 230
    .line 231
    if-ne v11, v8, :cond_ed

    .line 232
    .line 233
    add-float/2addr v10, v2

    .line 234
    add-float v16, v16, v4

    .line 235
    .line 236
    add-float/2addr v5, v2

    .line 237
    add-float/2addr v7, v4

    .line 238
    :cond_ed
    move v4, v5

    .line 239
    move v2, v6

    .line 240
    move v5, v7

    .line 241
    move v6, v10

    .line 242
    move/from16 v7, v16

    .line 243
    .line 244
    invoke-virtual/range {v1 .. v7}, Lax/o4/g$w;->c(FFFFFF)V

    .line 245
    .line 246
    .line 247
    :goto_f6
    move v3, v4

    .line 248
    move v2, v6

    .line 249
    move v4, v7

    .line 250
    goto/16 :goto_279

    .line 251
    .line 252
    :sswitch_fb
    const/16 p0, 0x0

    .line 253
    .line 254
    invoke-virtual {v0}, Lax/o4/k$i;->n()F

    .line 255
    .line 256
    .line 257
    move-result v3

    .line 258
    invoke-virtual {v0, v3}, Lax/o4/k$i;->d(F)F

    .line 259
    .line 260
    .line 261
    move-result v5

    .line 262
    invoke-virtual {v0, v5}, Lax/o4/k$i;->d(F)F

    .line 263
    .line 264
    .line 265
    move-result v6

    .line 266
    invoke-virtual {v0, v6}, Lax/o4/k$i;->d(F)F

    .line 267
    .line 268
    .line 269
    move-result v7

    .line 270
    invoke-static {v7}, Ljava/lang/Float;->isNaN(F)Z

    .line 271
    .line 272
    .line 273
    move-result v10

    .line 274
    if-eqz v10, :cond_12a

    .line 275
    .line 276
    new-instance v0, Ljava/lang/StringBuilder;

    .line 277
    .line 278
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    int-to-char v2, v11

    .line 285
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    invoke-static {v15, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 296
    .line 297
    .line 298
    return-object v1

    .line 299
    :cond_12a
    const/16 v8, 0x71

    .line 300
    .line 301
    if-ne v11, v8, :cond_132

    .line 302
    .line 303
    add-float/2addr v6, v2

    .line 304
    add-float/2addr v7, v4

    .line 305
    add-float/2addr v3, v2

    .line 306
    add-float/2addr v5, v4

    .line 307
    :cond_132
    move v2, v6

    .line 308
    move v4, v7

    .line 309
    invoke-virtual {v1, v3, v5, v2, v4}, Lax/o4/g$w;->a(FFFF)V

    .line 310
    .line 311
    .line 312
    goto/16 :goto_279

    .line 313
    .line 314
    :sswitch_139
    const/16 p0, 0x0

    .line 315
    .line 316
    invoke-virtual {v0}, Lax/o4/k$i;->n()F

    .line 317
    .line 318
    .line 319
    move-result v3

    .line 320
    invoke-virtual {v0, v3}, Lax/o4/k$i;->d(F)F

    .line 321
    .line 322
    .line 323
    move-result v5

    .line 324
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    .line 325
    .line 326
    .line 327
    move-result v7

    .line 328
    if-eqz v7, :cond_160

    .line 329
    .line 330
    new-instance v0, Ljava/lang/StringBuilder;

    .line 331
    .line 332
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    int-to-char v2, v11

    .line 339
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 340
    .line 341
    .line 342
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    invoke-static {v15, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 350
    .line 351
    .line 352
    return-object v1

    .line 353
    :cond_160
    if-ne v11, v9, :cond_16a

    .line 354
    .line 355
    invoke-virtual {v1}, Lax/o4/g$w;->i()Z

    .line 356
    .line 357
    .line 358
    move-result v7

    .line 359
    if-nez v7, :cond_16a

    .line 360
    .line 361
    add-float/2addr v3, v2

    .line 362
    add-float/2addr v5, v4

    .line 363
    :cond_16a
    move v2, v3

    .line 364
    move v4, v5

    .line 365
    invoke-virtual {v1, v2, v4}, Lax/o4/g$w;->b(FF)V

    .line 366
    .line 367
    .line 368
    if-ne v11, v9, :cond_172

    .line 369
    .line 370
    goto :goto_174

    .line 371
    :cond_172
    const/16 v6, 0x4c

    .line 372
    .line 373
    :goto_174
    move v3, v2

    .line 374
    move v12, v3

    .line 375
    move v5, v4

    .line 376
    move v13, v5

    .line 377
    move v11, v6

    .line 378
    goto/16 :goto_279

    .line 379
    .line 380
    :sswitch_17b
    const/16 p0, 0x0

    .line 381
    .line 382
    invoke-virtual {v0}, Lax/o4/k$i;->n()F

    .line 383
    .line 384
    .line 385
    move-result v3

    .line 386
    invoke-virtual {v0, v3}, Lax/o4/k$i;->d(F)F

    .line 387
    .line 388
    .line 389
    move-result v5

    .line 390
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    .line 391
    .line 392
    .line 393
    move-result v7

    .line 394
    if-eqz v7, :cond_1a2

    .line 395
    .line 396
    new-instance v0, Ljava/lang/StringBuilder;

    .line 397
    .line 398
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 402
    .line 403
    .line 404
    int-to-char v2, v11

    .line 405
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 406
    .line 407
    .line 408
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    invoke-static {v15, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 416
    .line 417
    .line 418
    return-object v1

    .line 419
    :cond_1a2
    if-ne v11, v6, :cond_1a6

    .line 420
    .line 421
    add-float/2addr v3, v2

    .line 422
    add-float/2addr v5, v4

    .line 423
    :cond_1a6
    move v2, v3

    .line 424
    move v4, v5

    .line 425
    invoke-virtual {v1, v2, v4}, Lax/o4/g$w;->e(FF)V

    .line 426
    .line 427
    .line 428
    move v3, v2

    .line 429
    :goto_1ac
    move v5, v4

    .line 430
    goto/16 :goto_279

    .line 431
    .line 432
    :sswitch_1af
    const/16 p0, 0x0

    .line 433
    .line 434
    invoke-virtual {v0}, Lax/o4/k$i;->n()F

    .line 435
    .line 436
    .line 437
    move-result v3

    .line 438
    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    .line 439
    .line 440
    .line 441
    move-result v6

    .line 442
    if-eqz v6, :cond_1d2

    .line 443
    .line 444
    new-instance v0, Ljava/lang/StringBuilder;

    .line 445
    .line 446
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 447
    .line 448
    .line 449
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 450
    .line 451
    .line 452
    int-to-char v2, v11

    .line 453
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 457
    .line 458
    .line 459
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    invoke-static {v15, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 464
    .line 465
    .line 466
    return-object v1

    .line 467
    :cond_1d2
    const/16 v6, 0x68

    .line 468
    .line 469
    if-ne v11, v6, :cond_1d7

    .line 470
    .line 471
    add-float/2addr v3, v2

    .line 472
    :cond_1d7
    move v2, v3

    .line 473
    invoke-virtual {v1, v2, v4}, Lax/o4/g$w;->e(FF)V

    .line 474
    .line 475
    .line 476
    move v3, v2

    .line 477
    goto/16 :goto_279

    .line 478
    .line 479
    :sswitch_1de
    const/16 p0, 0x0

    .line 480
    .line 481
    invoke-virtual {v0}, Lax/o4/k$i;->n()F

    .line 482
    .line 483
    .line 484
    move-result v3

    .line 485
    invoke-virtual {v0, v3}, Lax/o4/k$i;->d(F)F

    .line 486
    .line 487
    .line 488
    move-result v5

    .line 489
    invoke-virtual {v0, v5}, Lax/o4/k$i;->d(F)F

    .line 490
    .line 491
    .line 492
    move-result v6

    .line 493
    invoke-virtual {v0, v6}, Lax/o4/k$i;->d(F)F

    .line 494
    .line 495
    .line 496
    move-result v7

    .line 497
    invoke-virtual {v0, v7}, Lax/o4/k$i;->d(F)F

    .line 498
    .line 499
    .line 500
    move-result v10

    .line 501
    invoke-virtual {v0, v10}, Lax/o4/k$i;->d(F)F

    .line 502
    .line 503
    .line 504
    move-result v16

    .line 505
    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->isNaN(F)Z

    .line 506
    .line 507
    .line 508
    move-result v17

    .line 509
    if-eqz v17, :cond_215

    .line 510
    .line 511
    new-instance v0, Ljava/lang/StringBuilder;

    .line 512
    .line 513
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 514
    .line 515
    .line 516
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 517
    .line 518
    .line 519
    int-to-char v2, v11

    .line 520
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 521
    .line 522
    .line 523
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 524
    .line 525
    .line 526
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 527
    .line 528
    .line 529
    move-result-object v0

    .line 530
    invoke-static {v15, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 531
    .line 532
    .line 533
    return-object v1

    .line 534
    :cond_215
    const/16 v8, 0x63

    .line 535
    .line 536
    if-ne v11, v8, :cond_220

    .line 537
    .line 538
    add-float/2addr v10, v2

    .line 539
    add-float v16, v16, v4

    .line 540
    .line 541
    add-float/2addr v3, v2

    .line 542
    add-float/2addr v5, v4

    .line 543
    add-float/2addr v6, v2

    .line 544
    add-float/2addr v7, v4

    .line 545
    :cond_220
    move v2, v3

    .line 546
    move v3, v5

    .line 547
    move v4, v6

    .line 548
    move v5, v7

    .line 549
    move v6, v10

    .line 550
    move/from16 v7, v16

    .line 551
    .line 552
    invoke-virtual/range {v1 .. v7}, Lax/o4/g$w;->c(FFFFFF)V

    .line 553
    .line 554
    .line 555
    goto/16 :goto_f6

    .line 556
    .line 557
    :sswitch_22c
    move v10, v2

    .line 558
    const/16 p0, 0x0

    .line 559
    .line 560
    invoke-virtual {v0}, Lax/o4/k$i;->n()F

    .line 561
    .line 562
    .line 563
    move-result v2

    .line 564
    invoke-virtual {v0, v2}, Lax/o4/k$i;->d(F)F

    .line 565
    .line 566
    .line 567
    move-result v3

    .line 568
    move v5, v4

    .line 569
    invoke-virtual {v0, v3}, Lax/o4/k$i;->d(F)F

    .line 570
    .line 571
    .line 572
    move-result v4

    .line 573
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 574
    .line 575
    .line 576
    move-result-object v6

    .line 577
    invoke-virtual {v0, v6}, Lax/o4/k$i;->c(Ljava/lang/Object;)Ljava/lang/Boolean;

    .line 578
    .line 579
    .line 580
    move-result-object v6

    .line 581
    invoke-virtual {v0, v6}, Lax/o4/k$i;->c(Ljava/lang/Object;)Ljava/lang/Boolean;

    .line 582
    .line 583
    .line 584
    move-result-object v7

    .line 585
    invoke-virtual {v0, v7}, Lax/o4/k$i;->e(Ljava/lang/Boolean;)F

    .line 586
    .line 587
    .line 588
    move-result v9

    .line 589
    invoke-virtual {v0, v9}, Lax/o4/k$i;->d(F)F

    .line 590
    .line 591
    .line 592
    move-result v17

    .line 593
    invoke-static/range {v17 .. v17}, Ljava/lang/Float;->isNaN(F)Z

    .line 594
    .line 595
    .line 596
    move-result v18

    .line 597
    if-nez v18, :cond_295

    .line 598
    .line 599
    cmpg-float v18, v2, p0

    .line 600
    .line 601
    if-ltz v18, :cond_295

    .line 602
    .line 603
    cmpg-float v18, v3, p0

    .line 604
    .line 605
    if-gez v18, :cond_25f

    .line 606
    .line 607
    goto :goto_295

    .line 608
    :cond_25f
    const/16 v8, 0x61

    .line 609
    .line 610
    if-ne v11, v8, :cond_266

    .line 611
    .line 612
    add-float/2addr v9, v10

    .line 613
    add-float v17, v17, v5

    .line 614
    .line 615
    :cond_266
    move/from16 v8, v17

    .line 616
    .line 617
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 618
    .line 619
    .line 620
    move-result v5

    .line 621
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 622
    .line 623
    .line 624
    move-result v6

    .line 625
    move v7, v9

    .line 626
    invoke-virtual/range {v1 .. v8}, Lax/o4/g$w;->d(FFFZZFF)V

    .line 627
    .line 628
    .line 629
    move v2, v7

    .line 630
    move v3, v2

    .line 631
    move v4, v8

    .line 632
    goto/16 :goto_1ac

    .line 633
    .line 634
    :goto_279
    invoke-virtual {v0}, Lax/o4/k$i;->z()Z

    .line 635
    .line 636
    .line 637
    invoke-virtual {v0}, Lax/o4/k$i;->h()Z

    .line 638
    .line 639
    .line 640
    move-result v6

    .line 641
    if-eqz v6, :cond_283

    .line 642
    .line 643
    :goto_282
    return-object v1

    .line 644
    :cond_283
    invoke-virtual {v0}, Lax/o4/k$i;->i()Z

    .line 645
    .line 646
    .line 647
    move-result v6

    .line 648
    if-eqz v6, :cond_291

    .line 649
    .line 650
    invoke-virtual {v0}, Lax/o4/k$i;->l()Ljava/lang/Integer;

    .line 651
    .line 652
    .line 653
    move-result-object v6

    .line 654
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 655
    .line 656
    .line 657
    move-result v11

    .line 658
    :cond_291
    const/16 v9, 0x6d

    .line 659
    .line 660
    goto/16 :goto_2d

    .line 661
    .line 662
    :cond_295
    :goto_295
    new-instance v0, Ljava/lang/StringBuilder;

    .line 663
    .line 664
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 665
    .line 666
    .line 667
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 668
    .line 669
    .line 670
    int-to-char v2, v11

    .line 671
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 672
    .line 673
    .line 674
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 675
    .line 676
    .line 677
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 678
    .line 679
    .line 680
    move-result-object v0

    .line 681
    invoke-static {v15, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 682
    .line 683
    .line 684
    return-object v1

    .line 685
    :sswitch_data_2ac
    .sparse-switch
        0x41 -> :sswitch_22c
        0x43 -> :sswitch_1de
        0x48 -> :sswitch_1af
        0x4c -> :sswitch_17b
        0x4d -> :sswitch_139
        0x51 -> :sswitch_fb
        0x53 -> :sswitch_ae
        0x54 -> :sswitch_75
        0x56 -> :sswitch_4a
        0x5a -> :sswitch_3f
        0x61 -> :sswitch_22c
        0x63 -> :sswitch_1de
        0x68 -> :sswitch_1af
        0x6c -> :sswitch_17b
        0x6d -> :sswitch_139
        0x71 -> :sswitch_fb
        0x73 -> :sswitch_ae
        0x74 -> :sswitch_75
        0x76 -> :sswitch_4a
        0x7a -> :sswitch_3f
    .end sparse-switch
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
.end method

.method private v(Lorg/xml/sax/Attributes;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v1, "<line>"

    .line 5
    .line 6
    invoke-direct {p0, v1, v0}, Lax/o4/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 10
    .line 11
    if-eqz v0, :cond_2e

    .line 12
    .line 13
    new-instance v0, Lax/o4/g$q;

    .line 14
    .line 15
    invoke-direct {v0}, Lax/o4/g$q;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lax/o4/k;->a:Lax/o4/g;

    .line 19
    .line 20
    iput-object v1, v0, Lax/o4/g$N;->a:Lax/o4/g;

    .line 21
    .line 22
    iget-object v1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 23
    .line 24
    iput-object v1, v0, Lax/o4/g$N;->b:Lax/o4/g$J;

    .line 25
    .line 26
    invoke-direct {p0, v0, p1}, Lax/o4/k;->D(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, v0, p1}, Lax/o4/k;->S(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0, v0, p1}, Lax/o4/k;->W(Lax/o4/g$n;Lorg/xml/sax/Attributes;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p0, v0, p1}, Lax/o4/k;->C(Lax/o4/g$G;Lorg/xml/sax/Attributes;)V

    .line 36
    .line 37
    .line 38
    invoke-direct {p0, v0, p1}, Lax/o4/k;->H(Lax/o4/g$q;Lorg/xml/sax/Attributes;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 42
    .line 43
    invoke-interface {p1, v0}, Lax/o4/g$J;->m(Lax/o4/g$N;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_2e
    new-instance p1, Lax/o4/j;

    .line 48
    .line 49
    const-string v0, "Invalid document. Root element must be <svg>"

    .line 50
    .line 51
    invoke-direct {p1, v0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method static v0(Ljava/lang/String;)Lax/o4/e;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    new-instance v0, Lax/o4/k$i;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lax/o4/k$i;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lax/o4/k$i;->A()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lax/o4/k$i;->r()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "defer"

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1b

    .line 20
    .line 21
    invoke-virtual {v0}, Lax/o4/k$i;->A()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lax/o4/k$i;->r()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    :cond_1b
    invoke-static {v1}, Lax/o4/k$b;->a(Ljava/lang/String;)Lax/o4/e$a;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0}, Lax/o4/k$i;->A()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lax/o4/k$i;->h()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_5c

    .line 40
    .line 41
    invoke-virtual {v0}, Lax/o4/k$i;->r()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    const-string v2, "meet"

    .line 49
    .line 50
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-nez v2, :cond_59

    .line 55
    .line 56
    const-string v2, "slice"

    .line 57
    .line 58
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_42

    .line 63
    .line 64
    sget-object p0, Lax/o4/e$b;->c0:Lax/o4/e$b;

    .line 65
    .line 66
    goto :goto_5d

    .line 67
    :cond_42
    new-instance v0, Lax/o4/j;

    .line 68
    .line 69
    new-instance v1, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    .line 73
    .line 74
    const-string v2, "Invalid preserveAspectRatio definition: "

    .line 75
    .line 76
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-direct {v0, p0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    throw v0

    .line 90
    :cond_59
    sget-object p0, Lax/o4/e$b;->q:Lax/o4/e$b;

    .line 91
    .line 92
    goto :goto_5d

    .line 93
    :cond_5c
    const/4 p0, 0x0

    .line 94
    :goto_5d
    new-instance v0, Lax/o4/e;

    .line 95
    .line 96
    invoke-direct {v0, v1, p0}, Lax/o4/e;-><init>(Lax/o4/e$a;Lax/o4/e$b;)V

    .line 97
    .line 98
    .line 99
    return-object v0
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
.end method

.method private w(Lorg/xml/sax/Attributes;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v1, "<linearGradient>"

    .line 5
    .line 6
    invoke-direct {p0, v1, v0}, Lax/o4/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 10
    .line 11
    if-eqz v0, :cond_2d

    .line 12
    .line 13
    new-instance v0, Lax/o4/g$M;

    .line 14
    .line 15
    invoke-direct {v0}, Lax/o4/g$M;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lax/o4/k;->a:Lax/o4/g;

    .line 19
    .line 20
    iput-object v1, v0, Lax/o4/g$N;->a:Lax/o4/g;

    .line 21
    .line 22
    iget-object v1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 23
    .line 24
    iput-object v1, v0, Lax/o4/g$N;->b:Lax/o4/g$J;

    .line 25
    .line 26
    invoke-direct {p0, v0, p1}, Lax/o4/k;->D(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, v0, p1}, Lax/o4/k;->S(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0, v0, p1}, Lax/o4/k;->F(Lax/o4/g$j;Lorg/xml/sax/Attributes;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p0, v0, p1}, Lax/o4/k;->I(Lax/o4/g$M;Lorg/xml/sax/Attributes;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 39
    .line 40
    invoke-interface {p1, v0}, Lax/o4/g$J;->m(Lax/o4/g$N;)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 44
    .line 45
    return-void

    .line 46
    :cond_2d
    new-instance p1, Lax/o4/j;

    .line 47
    .line 48
    const-string v0, "Invalid document. Root element must be <svg>"

    .line 49
    .line 50
    invoke-direct {p1, v0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private static w0(Lax/o4/g$P;Ljava/lang/String;)V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lax/o4/k;->v0(Ljava/lang/String;)Lax/o4/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lax/o4/g$P;->o:Lax/o4/e;

    .line 6
    .line 7
    return-void
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

.method private x(Lorg/xml/sax/Attributes;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v1, "<marker>"

    .line 5
    .line 6
    invoke-direct {p0, v1, v0}, Lax/o4/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 10
    .line 11
    if-eqz v0, :cond_30

    .line 12
    .line 13
    new-instance v0, Lax/o4/g$r;

    .line 14
    .line 15
    invoke-direct {v0}, Lax/o4/g$r;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lax/o4/k;->a:Lax/o4/g;

    .line 19
    .line 20
    iput-object v1, v0, Lax/o4/g$N;->a:Lax/o4/g;

    .line 21
    .line 22
    iget-object v1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 23
    .line 24
    iput-object v1, v0, Lax/o4/g$N;->b:Lax/o4/g$J;

    .line 25
    .line 26
    invoke-direct {p0, v0, p1}, Lax/o4/k;->D(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, v0, p1}, Lax/o4/k;->S(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0, v0, p1}, Lax/o4/k;->C(Lax/o4/g$G;Lorg/xml/sax/Attributes;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p0, v0, p1}, Lax/o4/k;->Y(Lax/o4/g$R;Lorg/xml/sax/Attributes;)V

    .line 36
    .line 37
    .line 38
    invoke-direct {p0, v0, p1}, Lax/o4/k;->J(Lax/o4/g$r;Lorg/xml/sax/Attributes;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 42
    .line 43
    invoke-interface {p1, v0}, Lax/o4/g$J;->m(Lax/o4/g$N;)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 47
    .line 48
    return-void

    .line 49
    :cond_30
    new-instance p1, Lax/o4/j;

    .line 50
    .line 51
    const-string v0, "Invalid document. Root element must be <svg>"

    .line 52
    .line 53
    invoke-direct {p1, v0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private x0(Lax/o4/k$i;)Ljava/util/Map;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/o4/k$i;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lax/o4/k$i;->A()V

    .line 7
    .line 8
    .line 9
    const/16 v1, 0x3d

    .line 10
    .line 11
    invoke-virtual {p1, v1}, Lax/o4/k$i;->s(C)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    :goto_e
    if-eqz v2, :cond_22

    .line 16
    .line 17
    invoke-virtual {p1, v1}, Lax/o4/k$i;->f(C)Z

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lax/o4/k$i;->q()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lax/o4/k$i;->A()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v1}, Lax/o4/k$i;->s(C)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    goto :goto_e

    .line 35
    :cond_22
    return-object v0
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

.method private y(Lorg/xml/sax/Attributes;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v1, "<mask>"

    .line 5
    .line 6
    invoke-direct {p0, v1, v0}, Lax/o4/k;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 10
    .line 11
    if-eqz v0, :cond_2d

    .line 12
    .line 13
    new-instance v0, Lax/o4/g$s;

    .line 14
    .line 15
    invoke-direct {v0}, Lax/o4/g$s;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lax/o4/k;->a:Lax/o4/g;

    .line 19
    .line 20
    iput-object v1, v0, Lax/o4/g$N;->a:Lax/o4/g;

    .line 21
    .line 22
    iget-object v1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 23
    .line 24
    iput-object v1, v0, Lax/o4/g$N;->b:Lax/o4/g$J;

    .line 25
    .line 26
    invoke-direct {p0, v0, p1}, Lax/o4/k;->D(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, v0, p1}, Lax/o4/k;->S(Lax/o4/g$L;Lorg/xml/sax/Attributes;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0, v0, p1}, Lax/o4/k;->C(Lax/o4/g$G;Lorg/xml/sax/Attributes;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p0, v0, p1}, Lax/o4/k;->K(Lax/o4/g$s;Lorg/xml/sax/Attributes;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 39
    .line 40
    invoke-interface {p1, v0}, Lax/o4/g$J;->m(Lax/o4/g$N;)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, Lax/o4/k;->b:Lax/o4/g$J;

    .line 44
    .line 45
    return-void

    .line 46
    :cond_2d
    new-instance p1, Lax/o4/j;

    .line 47
    .line 48
    const-string v0, "Invalid document. Root element must be <svg>"

    .line 49
    .line 50
    invoke-direct {p1, v0}, Lax/o4/j;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private static y0(Ljava/lang/String;)Lax/o4/g$E$e;
    .registers 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sparse-switch v1, :sswitch_data_3a

    .line 10
    .line 11
    .line 12
    goto :goto_2c

    .line 13
    :sswitch_c
    const-string v1, "optimizeSpeed"

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-nez p0, :cond_15

    .line 20
    .line 21
    goto :goto_2c

    .line 22
    :cond_15
    const/4 v0, 0x2

    .line 23
    goto :goto_2c

    .line 24
    :sswitch_17
    const-string v1, "auto"

    .line 25
    .line 26
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-nez p0, :cond_20

    .line 31
    .line 32
    goto :goto_2c

    .line 33
    :cond_20
    const/4 v0, 0x1

    .line 34
    goto :goto_2c

    .line 35
    :sswitch_22
    const-string v1, "optimizeQuality"

    .line 36
    .line 37
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-nez p0, :cond_2b

    .line 42
    .line 43
    goto :goto_2c

    .line 44
    :cond_2b
    const/4 v0, 0x0

    .line 45
    :goto_2c
    packed-switch v0, :pswitch_data_48

    .line 46
    .line 47
    .line 48
    const/4 p0, 0x0

    .line 49
    return-object p0

    .line 50
    :pswitch_31
    sget-object p0, Lax/o4/g$E$e;->d0:Lax/o4/g$E$e;

    .line 51
    .line 52
    return-object p0

    .line 53
    :pswitch_34
    sget-object p0, Lax/o4/g$E$e;->q:Lax/o4/g$E$e;

    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_37
    sget-object p0, Lax/o4/g$E$e;->c0:Lax/o4/g$E$e;

    .line 57
    .line 58
    return-object p0

    .line 59
    :sswitch_data_3a
    .sparse-switch
        -0x379c7c9e -> :sswitch_22
        0x2dddaf -> :sswitch_17
        0x159eff6a -> :sswitch_c
    .end sparse-switch

    .line 60
    .line 61
    :pswitch_data_48
    .packed-switch 0x0
        :pswitch_37
        :pswitch_34
        :pswitch_31
    .end packed-switch
.end method

.method private static z0(Ljava/lang/String;)Ljava/util/Set;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lax/o4/k$i;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lax/o4/k$i;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p0, Ljava/util/HashSet;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 9
    .line 10
    .line 11
    :goto_a
    invoke-virtual {v0}, Lax/o4/k$i;->h()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_2f

    .line 16
    .line 17
    invoke-virtual {v0}, Lax/o4/k$i;->r()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, "http://www.w3.org/TR/SVG11/feature#"

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_26

    .line 28
    .line 29
    const/16 v2, 0x23

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {p0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    goto :goto_2b

    .line 39
    :cond_26
    const-string v1, "UNSUPPORTED"

    .line 40
    .line 41
    invoke-virtual {p0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    :goto_2b
    invoke-virtual {v0}, Lax/o4/k$i;->A()V

    .line 45
    .line 46
    .line 47
    goto :goto_a

    .line 48
    :cond_2f
    return-object p0
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
.method z(Ljava/io/InputStream;Z)Lax/o4/g;
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/o4/j;
        }
    .end annotation

    .line 1
    const-string v0, "Exception thrown closing input stream"

    .line 2
    .line 3
    const-string v1, "SVGParser"

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/io/InputStream;->markSupported()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_10

    .line 10
    .line 11
    new-instance v2, Ljava/io/BufferedInputStream;

    .line 12
    .line 13
    invoke-direct {v2, p1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 14
    .line 15
    .line 16
    move-object p1, v2

    .line 17
    :cond_10
    const/4 v2, 0x3

    .line 18
    :try_start_11
    invoke-virtual {p1, v2}, Ljava/io/InputStream;->mark(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    shl-int/lit8 v3, v3, 0x8

    .line 30
    .line 31
    add-int/2addr v2, v3

    .line 32
    invoke-virtual {p1}, Ljava/io/InputStream;->reset()V

    .line 33
    .line 34
    .line 35
    const v3, 0x8b1f

    .line 36
    .line 37
    .line 38
    if-ne v2, v3, :cond_32

    .line 39
    .line 40
    new-instance v2, Ljava/io/BufferedInputStream;

    .line 41
    .line 42
    new-instance v3, Ljava/util/zip/GZIPInputStream;

    .line 43
    .line 44
    invoke-direct {v3, p1}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    .line 45
    .line 46
    .line 47
    invoke-direct {v2, v3}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_31
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_31} :catch_32

    .line 48
    .line 49
    .line 50
    move-object p1, v2

    .line 51
    :catch_32
    :cond_32
    const/16 v2, 0x1000

    .line 52
    .line 53
    :try_start_34
    invoke-virtual {p1, v2}, Ljava/io/InputStream;->mark(I)V

    .line 54
    .line 55
    .line 56
    invoke-direct {p0, p1, p2}, Lax/o4/k;->L0(Ljava/io/InputStream;Z)V
    :try_end_3a
    .catchall {:try_start_34 .. :try_end_3a} :catchall_44

    .line 57
    .line 58
    .line 59
    :try_start_3a
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_3d
    .catch Ljava/io/IOException; {:try_start_3a .. :try_end_3d} :catch_3e

    .line 60
    .line 61
    .line 62
    goto :goto_41

    .line 63
    :catch_3e
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    :goto_41
    iget-object p1, p0, Lax/o4/k;->a:Lax/o4/g;

    .line 67
    .line 68
    return-object p1

    .line 69
    :catchall_44
    move-exception p2

    .line 70
    :try_start_45
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_48
    .catch Ljava/io/IOException; {:try_start_45 .. :try_end_48} :catch_49

    .line 71
    .line 72
    .line 73
    goto :goto_4c

    .line 74
    :catch_49
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 75
    .line 76
    .line 77
    :goto_4c
    throw p2
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
