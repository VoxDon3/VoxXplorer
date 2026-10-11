.class public Lax/W2/f;
.super Lax/W2/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/W2/f$d;,
        Lax/W2/f$c;
    }
.end annotation


# static fields
.field private static final J:Ljava/util/logging/Logger;


# instance fields
.field private A:Lax/W2/f$d;

.field private B:Ljava/lang/String;

.field private C:Lcom/voxdon/xplorer/file/n;

.field private D:Z

.field private E:Lax/W2/j$f;

.field private F:Lax/a3/K;

.field private G:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/W2/g;",
            ">;"
        }
    .end annotation
.end field

.field private H:Lax/W2/g;

.field private I:Lax/B/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/B/b<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private w:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Lax/W2/g;",
            ">;"
        }
    .end annotation
.end field

.field private x:Lcom/voxdon/xplorer/file/n;

.field private y:Lcom/voxdon/xplorer/file/o;

.field private z:Lax/W2/f$c;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const-class v0, Lax/W2/f;

    .line 2
    .line 3
    invoke-static {v0}, Lax/Q2/g;->a(Ljava/lang/Class;)Ljava/util/logging/Logger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lax/W2/f;->J:Ljava/util/logging/Logger;

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

.method public constructor <init>(Lax/W2/h$a;Ljava/util/List;Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/W2/h$a;",
            "Ljava/util/List<",
            "Lax/W2/g;",
            ">;",
            "Lcom/voxdon/xplorer/file/o;",
            "Lcom/voxdon/xplorer/file/n;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lax/W2/j;-><init>(Lax/W2/h$a;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lax/B/b;

    .line 5
    .line 6
    invoke-direct {p1}, Lax/B/b;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lax/W2/f;->I:Lax/B/b;

    .line 10
    .line 11
    iput-object p2, p0, Lax/W2/f;->G:Ljava/util/List;

    .line 12
    .line 13
    iput-object p3, p0, Lax/W2/f;->y:Lcom/voxdon/xplorer/file/o;

    .line 14
    .line 15
    iput-object p4, p0, Lax/W2/f;->x:Lcom/voxdon/xplorer/file/n;

    .line 16
    .line 17
    invoke-virtual {p3}, Lcom/voxdon/xplorer/file/o;->n0()V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lax/W2/f;->y:Lcom/voxdon/xplorer/file/o;

    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/o;->T()Lax/c3/K;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p0, p1}, Lax/W2/j;->h(Lax/c3/K;)V

    .line 27
    .line 28
    .line 29
    return-void
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

.method static synthetic A0(Lax/W2/f;)Ljava/util/List;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/W2/f;->G:Ljava/util/List;

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

.method static synthetic B0(Lax/W2/f;)Lax/W2/f$d;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/W2/f;->A:Lax/W2/f$d;

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

.method static synthetic C0(Lax/W2/f;Lax/W2/f$d;)Lax/W2/f$d;
    .registers 2

    .line 1
    iput-object p1, p0, Lax/W2/f;->A:Lax/W2/f$d;

    .line 2
    .line 3
    return-object p1
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

.method static synthetic D0(Lax/W2/f;)Lax/W2/g;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/W2/f;->H:Lax/W2/g;

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

.method static synthetic E0(Lax/W2/f;Lax/W2/g;)Lax/W2/g;
    .registers 2

    .line 1
    iput-object p1, p0, Lax/W2/f;->H:Lax/W2/g;

    .line 2
    .line 3
    return-object p1
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

.method static synthetic F0(Lax/W2/f;)Lcom/voxdon/xplorer/file/n;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/W2/f;->C:Lcom/voxdon/xplorer/file/n;

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

.method static synthetic G0(Lax/W2/f;Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/n;
    .registers 2

    .line 1
    iput-object p1, p0, Lax/W2/f;->C:Lcom/voxdon/xplorer/file/n;

    .line 2
    .line 3
    return-object p1
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

.method static synthetic H0(Lax/W2/f;)Lcom/voxdon/xplorer/file/o;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/W2/f;->y:Lcom/voxdon/xplorer/file/o;

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

.method static synthetic I0(Lax/W2/f;)Lax/B/b;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/W2/f;->I:Lax/B/b;

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

.method static synthetic J0(Lax/W2/f;)Ljava/util/LinkedList;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/W2/f;->w:Ljava/util/LinkedList;

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

.method static synthetic K0(Lax/W2/f;Ljava/util/LinkedList;)Ljava/util/LinkedList;
    .registers 2

    .line 1
    iput-object p1, p0, Lax/W2/f;->w:Ljava/util/LinkedList;

    .line 2
    .line 3
    return-object p1
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

.method static synthetic L0(Lax/W2/f;Lax/W2/g;)Ljava/lang/String;
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/W2/f;->N0(Lax/W2/g;)Ljava/lang/String;

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

.method static synthetic M0(Lax/W2/f;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/W2/f;->O0()V

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

.method private N0(Lax/W2/g;)Ljava/lang/String;
    .registers 4

    .line 1
    iget-object v0, p0, Lax/W2/f;->x:Lcom/voxdon/xplorer/file/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_15

    .line 12
    .line 13
    invoke-virtual {p1}, Lax/W2/g;->h()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {v0, p1}, Lax/c3/d0;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1

    .line 22
    :cond_15
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 25
    .line 26
    .line 27
    throw p1
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

.method private O0()V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/W2/f;->w:Ljava/util/LinkedList;

    .line 2
    .line 3
    if-eqz v0, :cond_19

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_b

    .line 10
    .line 11
    goto :goto_19

    .line 12
    :cond_b
    new-instance v0, Lax/W2/f$d;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Lax/W2/f$d;-><init>(Lax/W2/f;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lax/W2/f;->A:Lax/W2/f$d;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    new-array v1, v1, [Ljava/lang/Void;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lax/u3/q;->i([Ljava/lang/Object;)Lax/u3/q;

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_19
    :goto_19
    const/4 v0, 0x1

    .line 27
    invoke-virtual {p0, v0}, Lax/W2/j;->l0(Z)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lax/W2/j;->w()Lax/W2/v;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Lax/W2/v;->O()J

    .line 35
    .line 36
    .line 37
    move-result-wide v0

    .line 38
    invoke-virtual {p0}, Lax/W2/j;->w()Lax/W2/v;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v2}, Lax/W2/v;->z()J

    .line 43
    .line 44
    .line 45
    move-result-wide v2

    .line 46
    cmp-long v4, v0, v2

    .line 47
    .line 48
    if-eqz v4, :cond_5f

    .line 49
    .line 50
    sget-object v0, Lax/W2/f;->J:Ljava/util/logging/Logger;

    .line 51
    .line 52
    new-instance v1, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    const-string v2, "Total : "

    .line 58
    .line 59
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lax/W2/j;->w()Lax/W2/v;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v2}, Lax/W2/v;->O()J

    .line 67
    .line 68
    .line 69
    move-result-wide v2

    .line 70
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v2, " != Progress : "

    .line 74
    .line 75
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, Lax/W2/j;->w()Lax/W2/v;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-virtual {v2}, Lax/W2/v;->z()J

    .line 83
    .line 84
    .line 85
    move-result-wide v2

    .line 86
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->severe(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    :cond_5f
    invoke-virtual {p0}, Lax/W2/j;->o()V

    .line 97
    .line 98
    .line 99
    return-void
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

.method private P0(I)V
    .registers 5

    .line 1
    new-instance v0, Lax/a3/K;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/a3/K;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lax/W2/f;->F:Lax/a3/K;

    .line 7
    .line 8
    new-instance v0, Landroid/os/Bundle;

    .line 9
    .line 10
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v1, "progressTypeString"

    .line 14
    .line 15
    invoke-virtual {p0}, Lax/W2/f;->C()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lax/W2/f;->C:Lcom/voxdon/xplorer/file/n;

    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const-string v2, "fileName"

    .line 29
    .line 30
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const-string v1, "isDirectory"

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 37
    .line 38
    .line 39
    const-string v1, "errCode"

    .line 40
    .line 41
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 42
    .line 43
    .line 44
    const-string p1, "applyToAll"

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    invoke-virtual {v0, p1, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 48
    .line 49
    .line 50
    const-string p1, "directoryRename"

    .line 51
    .line 52
    invoke-virtual {v0, p1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, Lax/W2/f;->F:Lax/a3/K;

    .line 56
    .line 57
    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->v2(Landroid/os/Bundle;)V

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, Lax/W2/f;->F:Lax/a3/K;

    .line 61
    .line 62
    new-instance v0, Lax/W2/f$a;

    .line 63
    .line 64
    invoke-direct {v0, p0}, Lax/W2/f$a;-><init>(Lax/W2/f;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v0}, Lax/a3/K;->v3(Lax/a3/K$i;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lax/W2/j;->q()Lcom/voxdon/xplorer/service/CommandService;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    iget-object v0, p0, Lax/W2/f;->F:Lax/a3/K;

    .line 75
    .line 76
    invoke-virtual {p1, p0, v0}, Lcom/voxdon/xplorer/service/CommandService;->K(Lax/W2/j;Lax/a3/j;)V

    .line 77
    .line 78
    .line 79
    return-void
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

.method static synthetic w0(Lax/W2/f;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lax/W2/f;->D:Z

    .line 2
    .line 3
    return p0
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

.method static synthetic x0(Lax/W2/f;Z)Z
    .registers 2

    .line 1
    iput-boolean p1, p0, Lax/W2/f;->D:Z

    .line 2
    .line 3
    return p1
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

.method static synthetic y0(Lax/W2/f;I)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/W2/f;->P0(I)V

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

.method static synthetic z0(Lax/W2/f;Lax/W2/j$f;)Lax/W2/j$f;
    .registers 2

    .line 1
    iput-object p1, p0, Lax/W2/f;->E:Lax/W2/j$f;

    .line 2
    .line 3
    return-object p1
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


# virtual methods
.method public A()Ljava/lang/String;
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/W2/j;->L()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public B()I
    .registers 2

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    return v0
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

.method public C()Ljava/lang/String;
    .registers 3

    .line 1
    invoke-virtual {p0}, Lax/W2/j;->r()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const v1, 0x7f130380

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
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

.method public F()Ljava/lang/String;
    .registers 8

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x1

    .line 4
    sget-object v3, Lax/W2/f$b;->a:[I

    .line 5
    .line 6
    invoke-virtual {p0}, Lax/W2/j;->D()Lax/W2/h$b;

    .line 7
    .line 8
    .line 9
    move-result-object v4

    .line 10
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    aget v3, v3, v4

    .line 15
    .line 16
    if-eq v3, v2, :cond_38

    .line 17
    .line 18
    if-eq v3, v1, :cond_28

    .line 19
    .line 20
    const/4 v0, 0x3

    .line 21
    if-eq v3, v0, :cond_18

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    return-object v0

    .line 25
    :cond_18
    invoke-virtual {p0}, Lax/W2/j;->r()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const v1, 0x7f13008a

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    return-object v0

    .line 41
    :cond_28
    invoke-virtual {p0}, Lax/W2/j;->r()Landroid/content/Context;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const v1, 0x7f1302c8

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    return-object v0

    .line 57
    :cond_38
    invoke-virtual {p0}, Lax/W2/j;->w()Lax/W2/v;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-virtual {v3}, Lax/W2/v;->H()I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-nez v3, :cond_4f

    .line 66
    .line 67
    invoke-virtual {p0}, Lax/W2/j;->w()Lax/W2/v;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-virtual {v3}, Lax/W2/v;->M()I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_4f

    .line 76
    .line 77
    const-string v0, ""

    .line 78
    .line 79
    return-object v0

    .line 80
    :cond_4f
    iget-object v3, p0, Lax/W2/f;->G:Ljava/util/List;

    .line 81
    .line 82
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-ne v3, v2, :cond_7f

    .line 87
    .line 88
    iget-object v3, p0, Lax/W2/f;->G:Ljava/util/List;

    .line 89
    .line 90
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    check-cast v3, Lax/W2/g;

    .line 95
    .line 96
    invoke-virtual {v3}, Lax/W2/g;->h()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-virtual {p0}, Lax/W2/j;->r()Landroid/content/Context;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    iget-object v5, p0, Lax/W2/f;->x:Lcom/voxdon/xplorer/file/n;

    .line 109
    .line 110
    invoke-virtual {v5}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    new-array v1, v1, [Ljava/lang/Object;

    .line 115
    .line 116
    aput-object v3, v1, v0

    .line 117
    .line 118
    aput-object v5, v1, v2

    .line 119
    .line 120
    const v0, 0x7f1302c7

    .line 121
    .line 122
    .line 123
    invoke-virtual {v4, v0, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    return-object v0

    .line 128
    :cond_7f
    invoke-virtual {p0}, Lax/W2/j;->r()Landroid/content/Context;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    iget-object v6, p0, Lax/W2/f;->x:Lcom/voxdon/xplorer/file/n;

    .line 141
    .line 142
    invoke-virtual {v6}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    new-array v1, v1, [Ljava/lang/Object;

    .line 147
    .line 148
    aput-object v5, v1, v0

    .line 149
    .line 150
    aput-object v6, v1, v2

    .line 151
    .line 152
    const v0, 0x7f110008

    .line 153
    .line 154
    .line 155
    invoke-virtual {v4, v0, v3, v1}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    return-object v0
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

.method public G()Ljava/lang/String;
    .registers 3

    .line 1
    sget-object v0, Lax/W2/f$b;->a:[I

    .line 2
    .line 3
    invoke-virtual {p0}, Lax/W2/j;->D()Lax/W2/h$b;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    aget v0, v0, v1

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    if-eq v0, v1, :cond_12

    .line 15
    .line 16
    const-string v0, ""

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_12
    iget-object v0, p0, Lax/W2/f;->y:Lcom/voxdon/xplorer/file/o;

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->S()Lax/Q2/f;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sget-object v1, Lax/Q2/f;->p0:Lax/Q2/f;

    .line 26
    .line 27
    if-ne v0, v1, :cond_1e

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    goto :goto_1f

    .line 31
    :cond_1e
    const/4 v0, 0x0

    .line 32
    :goto_1f
    invoke-virtual {p0, v0}, Lax/W2/j;->v(Z)Ljava/lang/String;

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

.method public H()Lax/c3/K;
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
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

.method public J()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/W2/f;->H:Lax/W2/g;

    .line 2
    .line 3
    if-nez v0, :cond_7

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_7
    invoke-virtual {v0}, Lax/W2/g;->p()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
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

.method public K()Lax/c3/K;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/W2/f;->C:Lcom/voxdon/xplorer/file/n;

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_6
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
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

.method public M()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/W2/f;->C:Lcom/voxdon/xplorer/file/n;

    .line 2
    .line 3
    if-nez v0, :cond_7

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_7
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->W()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
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

.method protected P()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/W2/f;->y:Lcom/voxdon/xplorer/file/o;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->Y()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method protected W()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/W2/f;->F:Lax/a3/K;

    .line 2
    .line 3
    if-eqz v0, :cond_1e

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->X0()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1e

    .line 10
    .line 11
    iget-object v0, p0, Lax/W2/f;->F:Lax/a3/K;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->e1()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_18

    .line 18
    .line 19
    iget-object v0, p0, Lax/W2/f;->F:Lax/a3/K;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroidx/fragment/app/e;->N2()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_18
    iget-object v0, p0, Lax/W2/f;->F:Lax/a3/K;

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    invoke-virtual {v0, v1}, Lax/a3/K;->u3(Z)V

    .line 29
    .line 30
    .line 31
    :cond_1e
    return-void
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

.method protected X()Z
    .registers 4

    .line 1
    iget-object v0, p0, Lax/W2/f;->z:Lax/W2/f$c;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/W2/j;->S(Lax/u3/q;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_10

    .line 9
    .line 10
    iget-object v0, p0, Lax/W2/f;->z:Lax/W2/f$c;

    .line 11
    .line 12
    invoke-virtual {v0}, Lax/u3/q;->e()Z

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    goto :goto_11

    .line 17
    :cond_10
    const/4 v0, 0x0

    .line 18
    :goto_11
    iget-object v2, p0, Lax/W2/f;->A:Lax/W2/f$d;

    .line 19
    .line 20
    invoke-virtual {p0, v2}, Lax/W2/j;->S(Lax/u3/q;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_1f

    .line 25
    .line 26
    iget-object v0, p0, Lax/W2/f;->A:Lax/W2/f$d;

    .line 27
    .line 28
    invoke-virtual {v0}, Lax/u3/q;->e()Z

    .line 29
    .line 30
    .line 31
    return v1

    .line 32
    :cond_1f
    return v0
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

.method protected Y()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/W2/f;->y:Lcom/voxdon/xplorer/file/o;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->Y()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1a

    .line 8
    .line 9
    invoke-virtual {p0}, Lax/W2/j;->w()Lax/W2/v;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, Lax/W2/v$a;->c0:Lax/W2/v$a;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lax/W2/v;->T(Lax/W2/v$a;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lax/W2/f;->y:Lcom/voxdon/xplorer/file/o;

    .line 19
    .line 20
    invoke-virtual {p0}, Lax/W2/j;->x()Lax/g3/i;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/file/o;->n(Lax/g3/i;)V

    .line 25
    .line 26
    .line 27
    :cond_1a
    return-void
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

.method protected Z()V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/W2/f;->x:Lcom/voxdon/xplorer/file/n;

    .line 2
    .line 3
    if-eqz v0, :cond_19

    .line 4
    .line 5
    invoke-static {}, Lax/W2/w;->c()Lax/W2/w;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lax/W2/f;->x:Lcom/voxdon/xplorer/file/n;

    .line 10
    .line 11
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v2, p0, Lax/W2/f;->x:Lcom/voxdon/xplorer/file/n;

    .line 16
    .line 17
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget-object v3, p0, Lax/W2/f;->I:Lax/B/b;

    .line 22
    .line 23
    invoke-virtual {v0, v1, v2, v3}, Lax/W2/w;->g(Lax/c3/K;Ljava/lang/String;Ljava/util/Set;)V

    .line 24
    .line 25
    .line 26
    :cond_19
    invoke-virtual {p0}, Lax/W2/j;->w()Lax/W2/v;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Lax/W2/v;->H()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-virtual {p0}, Lax/W2/j;->w()Lax/W2/v;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Lax/W2/v;->C()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-virtual {p0}, Lax/W2/j;->w()Lax/W2/v;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v2}, Lax/W2/v;->M()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    add-int/2addr v0, v1

    .line 51
    if-ne v2, v0, :cond_3a

    .line 52
    .line 53
    sget-object v0, Lax/W2/h$b;->c0:Lax/W2/h$b;

    .line 54
    .line 55
    invoke-virtual {p0, v0}, Lax/W2/j;->t0(Lax/W2/h$b;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_3a
    sget-object v0, Lax/W2/h$b;->d0:Lax/W2/h$b;

    .line 60
    .line 61
    invoke-virtual {p0, v0}, Lax/W2/j;->t0(Lax/W2/h$b;)V

    .line 62
    .line 63
    .line 64
    return-void
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public c0()V
    .registers 3

    .line 1
    invoke-virtual {p0}, Lax/W2/j;->j0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/W2/f;->x:Lcom/voxdon/xplorer/file/n;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lax/W2/f;->B:Ljava/lang/String;

    .line 15
    .line 16
    new-instance v0, Lax/W2/f$c;

    .line 17
    .line 18
    invoke-direct {v0, p0}, Lax/W2/f$c;-><init>(Lax/W2/f;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lax/W2/f;->z:Lax/W2/f$c;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    new-array v1, v1, [Ljava/lang/Void;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lax/u3/q;->i([Ljava/lang/Object;)Lax/u3/q;

    .line 27
    .line 28
    .line 29
    return-void
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

.method public k()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/W2/f;->G:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_16

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lax/W2/g;

    .line 18
    .line 19
    invoke-virtual {v1}, Lax/W2/g;->f()V

    .line 20
    .line 21
    .line 22
    goto :goto_6

    .line 23
    :cond_16
    iget-object v0, p0, Lax/W2/f;->y:Lcom/voxdon/xplorer/file/o;

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/file/o;->k0(Z)V

    .line 27
    .line 28
    .line 29
    return-void
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

.method public n0()V
    .registers 5

    .line 1
    invoke-virtual {p0}, Lax/W2/j;->D()Lax/W2/h$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lax/Q2/a$c;->a(Lax/W2/h$b;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "command"

    .line 14
    .line 15
    const-string v3, "file_save"

    .line 16
    .line 17
    invoke-virtual {v1, v2, v3}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, "result"

    .line 22
    .line 23
    invoke-virtual {v1, v2, v0}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "tgt"

    .line 28
    .line 29
    iget-object v2, p0, Lax/W2/f;->B:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p0}, Lax/W2/j;->w()Lax/W2/v;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Lax/W2/v;->x()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    int-to-long v1, v1

    .line 44
    invoke-virtual {v0, v1, v2}, Lax/Q2/a$b;->d(J)Lax/Q2/a$b;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Lax/Q2/a$b;->e()V

    .line 49
    .line 50
    .line 51
    return-void
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
