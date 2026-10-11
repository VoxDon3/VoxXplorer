.class public Lax/W2/u;
.super Lax/W2/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/W2/u$e;,
        Lax/W2/u$f;,
        Lax/W2/u$h;,
        Lax/W2/u$g;
    }
.end annotation


# instance fields
.field private A:Lax/c3/k;

.field private B:Lcom/voxdon/xplorer/file/n;

.field private C:Ljava/lang/String;

.field private D:Lax/u3/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/u3/q<",
            "Ljava/lang/Void;",
            "Ljava/lang/Void;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private E:Lax/u3/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/u3/q<",
            "Ljava/lang/Void;",
            "Ljava/lang/Void;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private F:Lax/W2/j$f;

.field private G:Z

.field private H:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/util/Map$Entry<",
            "Lcom/voxdon/xplorer/file/n;",
            "Ljava/lang/Long;",
            ">;>;"
        }
    .end annotation
.end field

.field private I:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;"
        }
    .end annotation
.end field

.field private J:Lax/a3/x$b;

.field private K:Ljava/lang/String;

.field private L:Lax/B/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/B/b<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private M:Z

.field private w:Lcom/voxdon/xplorer/file/o;

.field private x:Ljava/lang/String;

.field private y:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/W2/u$e;",
            ">;"
        }
    .end annotation
.end field

.field private z:I


# direct methods
.method public constructor <init>(Lax/W2/h$a;Lax/W2/t$a;Ljava/lang/String;Landroid/os/ParcelFileDescriptor;Lcom/voxdon/xplorer/file/n;Lax/c3/k;Lcom/voxdon/xplorer/file/o;Ljava/lang/String;Ljava/util/List;)V
    .registers 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/W2/h$a;",
            "Lax/W2/t$a;",
            "Ljava/lang/String;",
            "Landroid/os/ParcelFileDescriptor;",
            "Lcom/voxdon/xplorer/file/n;",
            "Lax/c3/k;",
            "Lcom/voxdon/xplorer/file/o;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;)V"
        }
    .end annotation

    .line 20
    invoke-direct {p0, p1}, Lax/W2/j;-><init>(Lax/W2/h$a;)V

    .line 21
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lax/W2/u;->y:Ljava/util/List;

    .line 22
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lax/W2/u;->H:Ljava/util/List;

    .line 23
    new-instance p1, Lax/B/b;

    invoke-direct {p1}, Lax/B/b;-><init>()V

    iput-object p1, p0, Lax/W2/u;->L:Lax/B/b;

    .line 24
    iput-object p7, p0, Lax/W2/u;->w:Lcom/voxdon/xplorer/file/o;

    .line 25
    iput-object p8, p0, Lax/W2/u;->x:Ljava/lang/String;

    .line 26
    invoke-virtual {p7}, Lcom/voxdon/xplorer/file/o;->n0()V

    .line 27
    iget-object p1, p0, Lax/W2/u;->w:Lcom/voxdon/xplorer/file/o;

    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/o;->T()Lax/c3/K;

    move-result-object p1

    invoke-virtual {p0, p1}, Lax/W2/j;->h(Lax/c3/K;)V

    .line 28
    new-instance p1, Lax/W2/u$e;

    const/4 p7, 0x0

    invoke-direct {p1, p7}, Lax/W2/u$e;-><init>(Lax/W2/u$a;)V

    .line 29
    iput-object p5, p1, Lax/W2/u$e;->e:Lcom/voxdon/xplorer/file/n;

    .line 30
    iput-object p6, p1, Lax/W2/u$e;->f:Lax/c3/k;

    .line 31
    iput-object p4, p1, Lax/W2/u$e;->c:Landroid/os/ParcelFileDescriptor;

    .line 32
    iput-object p3, p1, Lax/W2/u$e;->d:Ljava/lang/String;

    .line 33
    iput-object p9, p1, Lax/W2/u$e;->h:Ljava/util/List;

    .line 34
    iput-object p8, p1, Lax/W2/u$e;->g:Ljava/lang/String;

    .line 35
    iput-object p2, p1, Lax/W2/u$e;->a:Lax/W2/t$a;

    .line 36
    iget-object p2, p0, Lax/W2/u;->y:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    .line 37
    iput p1, p0, Lax/W2/u;->z:I

    return-void
.end method

.method public constructor <init>(Lax/W2/h$a;Ljava/util/List;Lcom/voxdon/xplorer/file/o;Lax/a3/x$b;Ljava/lang/String;)V
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/W2/h$a;",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;",
            "Lcom/voxdon/xplorer/file/o;",
            "Lax/a3/x$b;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lax/W2/j;-><init>(Lax/W2/h$a;)V

    .line 2
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lax/W2/u;->y:Ljava/util/List;

    .line 3
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lax/W2/u;->H:Ljava/util/List;

    .line 4
    new-instance p1, Lax/B/b;

    invoke-direct {p1}, Lax/B/b;-><init>()V

    iput-object p1, p0, Lax/W2/u;->L:Lax/B/b;

    .line 5
    iput-object p3, p0, Lax/W2/u;->w:Lcom/voxdon/xplorer/file/o;

    .line 6
    iput-object p5, p0, Lax/W2/u;->x:Ljava/lang/String;

    .line 7
    iput-object p2, p0, Lax/W2/u;->I:Ljava/util/List;

    .line 8
    iput-object p4, p0, Lax/W2/u;->J:Lax/a3/x$b;

    .line 9
    invoke-virtual {p3}, Lcom/voxdon/xplorer/file/o;->n0()V

    .line 10
    iget-object p1, p0, Lax/W2/u;->w:Lcom/voxdon/xplorer/file/o;

    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/o;->T()Lax/c3/K;

    move-result-object p1

    invoke-virtual {p0, p1}, Lax/W2/j;->h(Lax/c3/K;)V

    .line 11
    iget-object p1, p0, Lax/W2/u;->I:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_32
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_6f

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/voxdon/xplorer/file/n;

    .line 12
    new-instance p3, Lax/W2/u$e;

    const/4 p4, 0x0

    invoke-direct {p3, p4}, Lax/W2/u$e;-><init>(Lax/W2/u$a;)V

    .line 13
    iput-object p2, p3, Lax/W2/u$e;->e:Lcom/voxdon/xplorer/file/n;

    .line 14
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    move-result-object p4

    iput-object p4, p3, Lax/W2/u$e;->d:Ljava/lang/String;

    .line 15
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, Lax/W2/t;->k(Ljava/lang/String;)Lax/W2/t$a;

    move-result-object p4

    iput-object p4, p3, Lax/W2/u$e;->a:Lax/W2/t$a;

    .line 16
    iget-object p4, p0, Lax/W2/u;->J:Lax/a3/x$b;

    sget-object v0, Lax/a3/x$b;->c0:Lax/a3/x$b;

    if-ne p4, v0, :cond_67

    .line 17
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    move-result-object p2

    invoke-static {p5, p2}, Lax/c3/d0;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p3, Lax/W2/u$e;->g:Ljava/lang/String;

    goto :goto_69

    .line 18
    :cond_67
    iput-object p5, p3, Lax/W2/u$e;->g:Ljava/lang/String;

    .line 19
    :goto_69
    iget-object p2, p0, Lax/W2/u;->y:Ljava/util/List;

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_32

    :cond_6f
    return-void
.end method

.method static synthetic A0(Lax/W2/u;)Lcom/voxdon/xplorer/file/o;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/W2/u;->w:Lcom/voxdon/xplorer/file/o;

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

.method private A1(Lax/W2/u$e;)V
    .registers 5

    .line 1
    sget-object v0, Lax/W2/u$d;->a:[I

    .line 2
    .line 3
    iget-object v1, p1, Lax/W2/u$e;->a:Lax/W2/t$a;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    aget v0, v0, v1

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    if-eq v0, v1, :cond_21

    .line 13
    .line 14
    const/4 v1, 0x3

    .line 15
    if-eq v0, v1, :cond_1a

    .line 16
    .line 17
    invoke-static {}, Lax/u3/b;->f()V

    .line 18
    .line 19
    .line 20
    iget-object v0, p1, Lax/W2/u$e;->d:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {v0}, Lax/Jc/b;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    goto :goto_27

    .line 27
    :cond_1a
    iget-object v0, p1, Lax/W2/u$e;->d:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v0}, Lax/Hc/c;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    goto :goto_27

    .line 34
    :cond_21
    iget-object v0, p1, Lax/W2/u$e;->d:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0}, Lax/Jc/b;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    :goto_27
    iget-object v1, p1, Lax/W2/u$e;->g:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v1, v0}, Lax/c3/d0;->R(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v0}, Lax/c3/d0;->U(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iput-object v0, p0, Lax/W2/u;->C:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {p0}, Lax/W2/j;->w()Lax/W2/v;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iget-wide v1, p1, Lax/W2/u$e;->l:J

    .line 57
    .line 58
    invoke-virtual {v0, v1, v2}, Lax/W2/v;->U(J)V

    .line 59
    .line 60
    .line 61
    sget-object v0, Lax/W2/j$f;->q:Lax/W2/j$f;

    .line 62
    .line 63
    invoke-direct {p0, p1, v0}, Lax/W2/u;->h1(Lax/W2/u$e;Lax/W2/j$f;)Lax/W2/u$f;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    iput-object p1, p0, Lax/W2/u;->E:Lax/u3/q;

    .line 68
    .line 69
    const/4 v0, 0x0

    .line 70
    new-array v0, v0, [Ljava/lang/Void;

    .line 71
    .line 72
    invoke-virtual {p1, v0}, Lax/u3/q;->i([Ljava/lang/Object;)Lax/u3/q;

    .line 73
    .line 74
    .line 75
    return-void
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

.method static synthetic B0(Lax/W2/u;Z)Z
    .registers 2

    .line 1
    iput-boolean p1, p0, Lax/W2/u;->M:Z

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

.method private B1(Lax/W2/u$e;)V
    .registers 4

    .line 1
    iget-object v0, p1, Lax/W2/u$e;->w:Lax/Cc/c;

    .line 2
    .line 3
    invoke-direct {p0}, Lax/W2/u;->o1()Lax/W2/j$f;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {p0, p1, v0, v1}, Lax/W2/u;->i1(Lax/W2/u$e;Lax/Ac/a;Lax/W2/j$f;)Lax/W2/u$f;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Lax/W2/u;->E:Lax/u3/q;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    new-array v0, v0, [Ljava/lang/Void;

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Lax/u3/q;->i([Ljava/lang/Object;)Lax/u3/q;

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
.end method

.method static synthetic C0(Lax/W2/u;)Ljava/util/List;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/W2/u;->I:Ljava/util/List;

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

.method private C1(Lax/W2/u$e;)V
    .registers 4

    .line 1
    iget-object v0, p1, Lax/W2/u$e;->t:Ljava/util/LinkedList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/LinkedList;->poll()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lax/Dc/I;

    .line 8
    .line 9
    invoke-direct {p0}, Lax/W2/u;->o1()Lax/W2/j$f;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-direct {p0, p1, v0, v1}, Lax/W2/u;->i1(Lax/W2/u$e;Lax/Ac/a;Lax/W2/j$f;)Lax/W2/u$f;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lax/W2/u;->E:Lax/u3/q;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    new-array v0, v0, [Ljava/lang/Void;

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Lax/u3/q;->i([Ljava/lang/Object;)Lax/u3/q;

    .line 23
    .line 24
    .line 25
    return-void
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

.method static synthetic D0(Lax/W2/u;)I
    .registers 1

    .line 1
    iget p0, p0, Lax/W2/u;->z:I

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

.method static synthetic E0(Lax/W2/u;I)I
    .registers 2

    .line 1
    iput p1, p0, Lax/W2/u;->z:I

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

.method static synthetic F0(Lax/W2/u;)Ljava/util/List;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/W2/u;->y:Ljava/util/List;

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

.method static synthetic G0(Lax/W2/u;)Lax/W2/u$e;
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/W2/u;->n1()Lax/W2/u$e;

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

.method static synthetic H0(Lax/W2/u;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/W2/u;->s1()V

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

.method static synthetic I0(Lax/W2/u;)Lax/u3/q;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/W2/u;->D:Lax/u3/q;

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

.method static synthetic J0(Lax/W2/u;Lax/W2/u$e;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/W2/u;->x1(Lax/W2/u$e;)V

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

.method static synthetic K0(Lax/W2/u;Lax/u3/q;)Lax/u3/q;
    .registers 2

    .line 1
    iput-object p1, p0, Lax/W2/u;->D:Lax/u3/q;

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

.method static synthetic L0(Lax/W2/u;Lax/W2/u$e;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/W2/u;->g1(Lax/W2/u$e;)V

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

.method static synthetic M0(Lax/W2/u;)Ljava/util/List;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/W2/u;->H:Ljava/util/List;

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

.method static synthetic N0(Lax/W2/u;)Ljava/lang/String;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/W2/u;->C:Ljava/lang/String;

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

.method static synthetic O0(Lax/W2/u;Ljava/lang/String;)Ljava/lang/String;
    .registers 2

    .line 1
    iput-object p1, p0, Lax/W2/u;->C:Ljava/lang/String;

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

.method static synthetic P0(Lax/W2/u;)Lax/W2/j$f;
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/W2/u;->o1()Lax/W2/j$f;

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

.method static synthetic Q0(Lax/W2/u;)Lcom/voxdon/xplorer/file/n;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/W2/u;->B:Lcom/voxdon/xplorer/file/n;

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

.method static synthetic R0(Lax/W2/u;Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/n;
    .registers 2

    .line 1
    iput-object p1, p0, Lax/W2/u;->B:Lcom/voxdon/xplorer/file/n;

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

.method static synthetic S0(Lax/W2/u;)Lax/B/b;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/W2/u;->L:Lax/B/b;

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

.method static synthetic T0(Lax/W2/u;)Ljava/lang/String;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/W2/u;->K:Ljava/lang/String;

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

.method static synthetic U0(Lax/W2/u;Ljava/lang/String;)Ljava/lang/String;
    .registers 2

    .line 1
    iput-object p1, p0, Lax/W2/u;->K:Ljava/lang/String;

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

.method static synthetic V0(Lax/W2/u;Lax/W2/u$e;Ljava/lang/String;Lax/Ac/a;I)V
    .registers 5

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lax/W2/u;->w1(Lax/W2/u$e;Ljava/lang/String;Lax/Ac/a;I)V

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

.method static synthetic W0(Lax/W2/u;Lax/W2/u$e;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/W2/u;->y1(Lax/W2/u$e;)V

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

.method static synthetic X0(Lax/W2/u;Z)Z
    .registers 2

    .line 1
    iput-boolean p1, p0, Lax/W2/u;->G:Z

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

.method static synthetic Y0(Lax/W2/u;Lax/W2/j$f;)Lax/W2/j$f;
    .registers 2

    .line 1
    iput-object p1, p0, Lax/W2/u;->F:Lax/W2/j$f;

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

.method static synthetic Z0(Lax/W2/u;)Lax/u3/q;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/W2/u;->E:Lax/u3/q;

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

.method static synthetic a1(Lax/W2/u;Lax/u3/q;)Lax/u3/q;
    .registers 2

    .line 1
    iput-object p1, p0, Lax/W2/u;->E:Lax/u3/q;

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

.method static synthetic b1(Lax/W2/u;Lax/W2/u$e;Lax/Ac/a;Lax/W2/j$f;)Lax/W2/u$f;
    .registers 4

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lax/W2/u;->i1(Lax/W2/u$e;Lax/Ac/a;Lax/W2/j$f;)Lax/W2/u$f;

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

.method static synthetic c1(Lax/W2/u;Lax/W2/u$e;Lax/W2/j$f;)Lax/W2/u$f;
    .registers 3

    .line 1
    invoke-direct {p0, p1, p2}, Lax/W2/u;->h1(Lax/W2/u$e;Lax/W2/j$f;)Lax/W2/u$f;

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

.method static synthetic d1(Lax/W2/u;Lax/W2/u$e;)Z
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/W2/u;->u1(Lax/W2/u$e;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
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

.method private e1(Lax/Dc/S;Ljava/util/Queue;Lax/c3/a;)V
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/Dc/S;",
            "Ljava/util/Queue<",
            "Lax/Ac/a;",
            ">;",
            "Lax/c3/a;",
            ")V"
        }
    .end annotation

    .line 1
    if-nez p3, :cond_3

    .line 2
    .line 3
    goto :goto_4a

    .line 4
    :cond_3
    invoke-virtual {p3}, Lax/c3/a;->t()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p1, v0}, Lax/Dc/S;->g(Ljava/lang/String;)Lax/Dc/I;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_4a

    .line 13
    .line 14
    invoke-interface {p2, v0}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lax/W2/j;->w()Lax/W2/v;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0}, Lax/Dc/I;->getSize()J

    .line 22
    .line 23
    .line 24
    move-result-wide v2

    .line 25
    invoke-virtual {v1, v2, v3}, Lax/W2/v;->h(J)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lax/W2/j;->w()Lax/W2/v;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const/4 v2, 0x1

    .line 33
    invoke-virtual {v1, v2}, Lax/W2/v;->g(I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lax/Dc/I;->isDirectory()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_4a

    .line 41
    .line 42
    invoke-virtual {p3}, Lax/c3/a;->i0()Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object p3

    .line 46
    if-eqz p3, :cond_4a

    .line 47
    .line 48
    monitor-enter p3

    .line 49
    :try_start_30
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    :goto_34
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_46

    .line 58
    .line 59
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    check-cast v1, Lax/c3/a;

    .line 64
    .line 65
    invoke-direct {p0, p1, p2, v1}, Lax/W2/u;->e1(Lax/Dc/S;Ljava/util/Queue;Lax/c3/a;)V

    .line 66
    .line 67
    .line 68
    goto :goto_34

    .line 69
    :catchall_44
    move-exception p1

    .line 70
    goto :goto_48

    .line 71
    :cond_46
    monitor-exit p3

    .line 72
    return-void

    .line 73
    :goto_48
    monitor-exit p3
    :try_end_49
    .catchall {:try_start_30 .. :try_end_49} :catchall_44

    .line 74
    throw p1

    .line 75
    :cond_4a
    :goto_4a
    return-void
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

.method private f1()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/W2/u;->y:Ljava/util/List;

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
    check-cast v1, Lax/W2/u$e;

    .line 18
    .line 19
    invoke-direct {p0, v1}, Lax/W2/u;->g1(Lax/W2/u$e;)V

    .line 20
    .line 21
    .line 22
    goto :goto_6

    .line 23
    :cond_16
    return-void
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

.method private g1(Lax/W2/u$e;)V
    .registers 4

    .line 1
    iget-object v0, p1, Lax/W2/u$e;->t:Ljava/util/LinkedList;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_7

    .line 5
    .line 6
    iput-object v1, p1, Lax/W2/u$e;->t:Ljava/util/LinkedList;

    .line 7
    .line 8
    :cond_7
    iget-boolean v0, p1, Lax/W2/u$e;->p:Z

    .line 9
    .line 10
    if-eqz v0, :cond_12

    .line 11
    .line 12
    iget-object v0, p1, Lax/W2/u$e;->q:Lax/Dc/T;

    .line 13
    .line 14
    invoke-static {v0}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 15
    .line 16
    .line 17
    iput-object v1, p1, Lax/W2/u$e;->q:Lax/Dc/T;

    .line 18
    .line 19
    :cond_12
    iget-boolean v0, p1, Lax/W2/u$e;->m:Z

    .line 20
    .line 21
    if-eqz v0, :cond_1d

    .line 22
    .line 23
    iget-object v0, p1, Lax/W2/u$e;->n:Lax/Bc/n;

    .line 24
    .line 25
    invoke-static {v0}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p1, Lax/W2/u$e;->n:Lax/Bc/n;

    .line 29
    .line 30
    :cond_1d
    iget-object v0, p1, Lax/W2/u$e;->j:Ljava/io/FileInputStream;

    .line 31
    .line 32
    if-eqz v0, :cond_26

    .line 33
    .line 34
    invoke-static {v0}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 35
    .line 36
    .line 37
    iput-object v1, p1, Lax/W2/u$e;->j:Ljava/io/FileInputStream;

    .line 38
    .line 39
    :cond_26
    iget-object v0, p1, Lax/W2/u$e;->k:Lax/Ec/a;

    .line 40
    .line 41
    if-eqz v0, :cond_2f

    .line 42
    .line 43
    invoke-static {v0}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 44
    .line 45
    .line 46
    iput-object v1, p1, Lax/W2/u$e;->k:Lax/Ec/a;

    .line 47
    .line 48
    :cond_2f
    iput-object v1, p1, Lax/W2/u$e;->w:Lax/Cc/c;

    .line 49
    .line 50
    iget-object v0, p1, Lax/W2/u$e;->v:Lax/Cc/d;

    .line 51
    .line 52
    if-eqz v0, :cond_3a

    .line 53
    .line 54
    invoke-static {v0}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 55
    .line 56
    .line 57
    iput-object v1, p1, Lax/W2/u$e;->v:Lax/Cc/d;

    .line 58
    .line 59
    :cond_3a
    iget-object v0, p1, Lax/W2/u$e;->c:Landroid/os/ParcelFileDescriptor;

    .line 60
    .line 61
    if-eqz v0, :cond_43

    .line 62
    .line 63
    invoke-static {v0}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 64
    .line 65
    .line 66
    iput-object v1, p1, Lax/W2/u$e;->c:Landroid/os/ParcelFileDescriptor;

    .line 67
    .line 68
    :cond_43
    const/4 v0, 0x1

    .line 69
    iput-boolean v0, p1, Lax/W2/u$e;->b:Z

    .line 70
    .line 71
    return-void
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

.method private h1(Lax/W2/u$e;Lax/W2/j$f;)Lax/W2/u$f;
    .registers 10

    .line 1
    iget-object v0, p0, Lax/W2/u;->C:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    invoke-static {v0}, Lax/c3/d0;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_8
    move-object v4, v0

    .line 10
    goto :goto_d

    .line 11
    :cond_a
    const-string v0, ""

    .line 12
    .line 13
    goto :goto_8

    .line 14
    :goto_d
    new-instance v1, Lax/W2/u$f;

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    move-object v2, p0

    .line 18
    move-object v3, p1

    .line 19
    move-object v6, p2

    .line 20
    invoke-direct/range {v1 .. v6}, Lax/W2/u$f;-><init>(Lax/W2/u;Lax/W2/u$e;Ljava/lang/String;Lax/Ac/a;Lax/W2/j$f;)V

    .line 21
    .line 22
    .line 23
    return-object v1
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

.method private i1(Lax/W2/u$e;Lax/Ac/a;Lax/W2/j$f;)Lax/W2/u$f;
    .registers 10

    .line 1
    new-instance v0, Lax/W2/u$f;

    .line 2
    .line 3
    invoke-interface {p2}, Lax/Ac/a;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    move-object v1, p0

    .line 8
    move-object v2, p1

    .line 9
    move-object v4, p2

    .line 10
    move-object v5, p3

    .line 11
    invoke-direct/range {v0 .. v5}, Lax/W2/u$f;-><init>(Lax/W2/u;Lax/W2/u$e;Ljava/lang/String;Lax/Ac/a;Lax/W2/j$f;)V

    .line 12
    .line 13
    .line 14
    return-object v0
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

.method private j1(Lax/W2/u$e;Lax/u3/c;)V
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/a;,
            Lax/b3/j;
        }
    .end annotation

    .line 1
    iget-object v0, p1, Lax/W2/u$e;->n:Lax/Bc/n;

    .line 2
    .line 3
    new-instance v1, Ljava/util/LinkedList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object v1, p1, Lax/W2/u$e;->t:Ljava/util/LinkedList;

    .line 9
    .line 10
    invoke-virtual {v0}, Lax/Bc/n;->q()Ljava/lang/Iterable;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_56

    .line 23
    .line 24
    if-eqz p2, :cond_26

    .line 25
    .line 26
    invoke-interface {p2}, Lax/u3/c;->isCancelled()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_20

    .line 31
    .line 32
    goto :goto_26

    .line 33
    :cond_20
    new-instance p1, Lax/b3/a;

    .line 34
    .line 35
    invoke-direct {p1}, Lax/b3/a;-><init>()V

    .line 36
    .line 37
    .line 38
    throw p1

    .line 39
    :cond_26
    :goto_26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Lax/Bc/l;

    .line 44
    .line 45
    invoke-virtual {v1}, Lax/Bc/l;->getName()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    if-eqz v2, :cond_4b

    .line 50
    .line 51
    iget-object v2, p1, Lax/W2/u$e;->t:Ljava/util/LinkedList;

    .line 52
    .line 53
    invoke-virtual {v2, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lax/W2/j;->w()Lax/W2/v;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v1}, Lax/Bc/l;->getSize()J

    .line 61
    .line 62
    .line 63
    move-result-wide v3

    .line 64
    invoke-virtual {v2, v3, v4}, Lax/W2/v;->h(J)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, Lax/W2/j;->w()Lax/W2/v;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    const/4 v2, 0x1

    .line 72
    invoke-virtual {v1, v2}, Lax/W2/v;->g(I)V

    .line 73
    .line 74
    .line 75
    goto :goto_11

    .line 76
    :cond_4b
    new-instance p1, Lax/b3/g;

    .line 77
    .line 78
    const-string p2, "SevenZ entry does not have name"

    .line 79
    .line 80
    invoke-direct {p1, p2}, Lax/b3/g;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-static {p1}, Lax/Q2/d;->b(Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    throw p1

    .line 87
    :cond_56
    return-void
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

.method private k1(Lax/W2/u$e;Lax/u3/c;)V
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/a;
        }
    .end annotation

    .line 1
    iget-object v0, p1, Lax/W2/u$e;->q:Lax/Dc/T;

    .line 2
    .line 3
    new-instance v1, Ljava/util/LinkedList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object v1, p1, Lax/W2/u$e;->t:Ljava/util/LinkedList;

    .line 9
    .line 10
    iget-object v1, p1, Lax/W2/u$e;->h:Ljava/util/List;

    .line 11
    .line 12
    if-eqz v1, :cond_34

    .line 13
    .line 14
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :goto_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_6c

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Lcom/voxdon/xplorer/file/n;

    .line 29
    .line 30
    if-eqz p2, :cond_2c

    .line 31
    .line 32
    invoke-interface {p2}, Lax/u3/c;->isCancelled()Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-nez v3, :cond_26

    .line 37
    .line 38
    goto :goto_2c

    .line 39
    :cond_26
    new-instance p1, Lax/b3/a;

    .line 40
    .line 41
    invoke-direct {p1}, Lax/b3/a;-><init>()V

    .line 42
    .line 43
    .line 44
    throw p1

    .line 45
    :cond_2c
    :goto_2c
    iget-object v3, p1, Lax/W2/u$e;->t:Ljava/util/LinkedList;

    .line 46
    .line 47
    check-cast v2, Lax/c3/a;

    .line 48
    .line 49
    invoke-direct {p0, v0, v3, v2}, Lax/W2/u;->e1(Lax/Dc/S;Ljava/util/Queue;Lax/c3/a;)V

    .line 50
    .line 51
    .line 52
    goto :goto_11

    .line 53
    :cond_34
    invoke-virtual {v0}, Lax/Dc/S;->f()Ljava/util/Enumeration;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    :goto_38
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_6c

    .line 62
    .line 63
    if-eqz p2, :cond_4d

    .line 64
    .line 65
    invoke-interface {p2}, Lax/u3/c;->isCancelled()Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-nez v1, :cond_47

    .line 70
    .line 71
    goto :goto_4d

    .line 72
    :cond_47
    new-instance p1, Lax/b3/a;

    .line 73
    .line 74
    invoke-direct {p1}, Lax/b3/a;-><init>()V

    .line 75
    .line 76
    .line 77
    throw p1

    .line 78
    :cond_4d
    :goto_4d
    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    check-cast v1, Lax/Dc/I;

    .line 83
    .line 84
    iget-object v2, p1, Lax/W2/u$e;->t:Ljava/util/LinkedList;

    .line 85
    .line 86
    invoke-virtual {v2, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Lax/W2/j;->w()Lax/W2/v;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-virtual {v1}, Lax/Dc/I;->getSize()J

    .line 94
    .line 95
    .line 96
    move-result-wide v3

    .line 97
    invoke-virtual {v2, v3, v4}, Lax/W2/v;->h(J)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, Lax/W2/j;->w()Lax/W2/v;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    const/4 v2, 0x1

    .line 105
    invoke-virtual {v1, v2}, Lax/W2/v;->g(I)V

    .line 106
    .line 107
    .line 108
    goto :goto_38

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

.method private n1()Lax/W2/u$e;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/W2/u;->y:Ljava/util/List;

    .line 2
    .line 3
    iget v1, p0, Lax/W2/u;->z:I

    .line 4
    .line 5
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lax/W2/u$e;

    .line 10
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

.method private o1()Lax/W2/j$f;
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/W2/u;->G:Z

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    iget-object v0, p0, Lax/W2/u;->F:Lax/W2/j$f;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_7
    sget-object v0, Lax/W2/j$f;->q:Lax/W2/j$f;

    .line 9
    .line 10
    return-object v0
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

.method private p1()Z
    .registers 4

    .line 1
    iget v0, p0, Lax/W2/u;->z:I

    .line 2
    .line 3
    iget-object v1, p0, Lax/W2/u;->y:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    sub-int/2addr v1, v2

    .line 11
    if-ge v0, v1, :cond_d

    .line 12
    .line 13
    return v2

    .line 14
    :cond_d
    const/4 v0, 0x0

    .line 15
    return v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private q1(Lax/W2/u$e;)V
    .registers 5

    .line 1
    :try_start_0
    iget-object v0, p1, Lax/W2/u$e;->c:Landroid/os/ParcelFileDescriptor;

    .line 2
    .line 3
    iget-wide v1, p1, Lax/W2/u$e;->i:J

    .line 4
    .line 5
    invoke-static {v0, v1, v2}, Lax/c3/B;->d0(Landroid/os/ParcelFileDescriptor;J)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_7} :catch_7

    .line 6
    .line 7
    .line 8
    :catch_7
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

.method private r1()V
    .registers 5

    .line 1
    invoke-direct {p0}, Lax/W2/u;->n1()Lax/W2/u$e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, Lax/W2/u$e;->f:Lax/c3/k;

    .line 6
    .line 7
    iput-object v1, p0, Lax/W2/u;->A:Lax/c3/k;

    .line 8
    .line 9
    sget-object v1, Lax/W2/u$d;->a:[I

    .line 10
    .line 11
    iget-object v2, v0, Lax/W2/u$e;->a:Lax/W2/t$a;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    aget v1, v1, v2

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    if-eq v1, v2, :cond_59

    .line 21
    .line 22
    const/4 v3, 0x2

    .line 23
    if-eq v1, v3, :cond_47

    .line 24
    .line 25
    const/4 v3, 0x3

    .line 26
    if-eq v1, v3, :cond_47

    .line 27
    .line 28
    const/4 v3, 0x4

    .line 29
    if-eq v1, v3, :cond_38

    .line 30
    .line 31
    const/4 v3, 0x5

    .line 32
    if-eq v1, v3, :cond_22

    .line 33
    .line 34
    return-void

    .line 35
    :cond_22
    iget-object v1, v0, Lax/W2/u$e;->t:Ljava/util/LinkedList;

    .line 36
    .line 37
    if-eqz v1, :cond_31

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_2d

    .line 44
    .line 45
    goto :goto_31

    .line 46
    :cond_2d
    invoke-direct {p0, v0}, Lax/W2/u;->z1(Lax/W2/u$e;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_31
    :goto_31
    invoke-direct {p0, v0}, Lax/W2/u;->g1(Lax/W2/u$e;)V

    .line 51
    .line 52
    .line 53
    invoke-direct {p0, v2}, Lax/W2/u;->t1(Z)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_38
    iget-object v1, v0, Lax/W2/u$e;->w:Lax/Cc/c;

    .line 58
    .line 59
    if-nez v1, :cond_43

    .line 60
    .line 61
    invoke-direct {p0, v0}, Lax/W2/u;->g1(Lax/W2/u$e;)V

    .line 62
    .line 63
    .line 64
    invoke-direct {p0, v2}, Lax/W2/u;->t1(Z)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_43
    invoke-direct {p0, v0}, Lax/W2/u;->B1(Lax/W2/u$e;)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_47
    iget-boolean v1, v0, Lax/W2/u$e;->u:Z

    .line 73
    .line 74
    if-nez v1, :cond_51

    .line 75
    .line 76
    invoke-direct {p0, v0}, Lax/W2/u;->A1(Lax/W2/u$e;)V

    .line 77
    .line 78
    .line 79
    iput-boolean v2, v0, Lax/W2/u$e;->u:Z

    .line 80
    .line 81
    return-void

    .line 82
    :cond_51
    invoke-direct {p0, v0}, Lax/W2/u;->g1(Lax/W2/u$e;)V

    .line 83
    .line 84
    .line 85
    const/4 v0, 0x0

    .line 86
    invoke-direct {p0, v0}, Lax/W2/u;->t1(Z)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_59
    iget-object v1, v0, Lax/W2/u$e;->t:Ljava/util/LinkedList;

    .line 91
    .line 92
    if-eqz v1, :cond_68

    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-eqz v1, :cond_64

    .line 99
    .line 100
    goto :goto_68

    .line 101
    :cond_64
    invoke-direct {p0, v0}, Lax/W2/u;->C1(Lax/W2/u$e;)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_68
    :goto_68
    invoke-direct {p0, v0}, Lax/W2/u;->g1(Lax/W2/u$e;)V

    .line 106
    .line 107
    .line 108
    invoke-direct {p0, v2}, Lax/W2/u;->t1(Z)V

    .line 109
    .line 110
    .line 111
    return-void
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

.method private s1()V
    .registers 2

    .line 1
    iget v0, p0, Lax/W2/u;->z:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lax/W2/u;->z:I

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
.end method

.method private t1(Z)V
    .registers 3

    .line 1
    invoke-direct {p0}, Lax/W2/u;->p1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_d

    .line 6
    .line 7
    invoke-direct {p0}, Lax/W2/u;->s1()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lax/W2/u;->r1()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_d
    if-eqz p1, :cond_1b

    .line 15
    .line 16
    new-instance p1, Lax/W2/u$g;

    .line 17
    .line 18
    invoke-direct {p1, p0}, Lax/W2/u$g;-><init>(Lax/W2/u;)V

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    new-array v0, v0, [Ljava/lang/Void;

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Lax/u3/q;->i([Ljava/lang/Object;)Lax/u3/q;

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1b
    invoke-virtual {p0}, Lax/W2/j;->o()V

    .line 29
    .line 30
    .line 31
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
.end method

.method private u1(Lax/W2/u$e;)Z
    .registers 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_1
    iget-object v1, p1, Lax/W2/u$e;->v:Lax/Cc/d;

    .line 3
    .line 4
    invoke-virtual {v1}, Lax/Cc/d;->p()Lax/Cc/c;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    iput-object v1, p1, Lax/W2/u$e;->w:Lax/Cc/c;
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_9} :catch_e

    .line 9
    .line 10
    if-eqz v1, :cond_d

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    return p1

    .line 14
    :cond_d
    return v0

    .line 15
    :catch_e
    const/4 v1, 0x0

    .line 16
    iput-object v1, p1, Lax/W2/u$e;->w:Lax/Cc/c;

    .line 17
    .line 18
    return v0
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private v1(Landroid/os/Bundle;Lax/Ac/a;)V
    .registers 7

    .line 1
    invoke-interface {p2}, Lax/Ac/a;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "new_file_path"

    .line 6
    .line 7
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p2}, Lax/W2/u;->l1(Lax/Ac/a;)Ljava/lang/Long;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_18

    .line 15
    .line 16
    const-string v1, "new_file_date"

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 19
    .line 20
    .line 21
    move-result-wide v2

    .line 22
    invoke-virtual {p1, v1, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 23
    .line 24
    .line 25
    :cond_18
    const-string v0, "new_file_size"

    .line 26
    .line 27
    invoke-virtual {p0, p2}, Lax/W2/u;->m1(Lax/Ac/a;)J

    .line 28
    .line 29
    .line 30
    move-result-wide v1

    .line 31
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lax/W2/u;->B:Lcom/voxdon/xplorer/file/n;

    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-string v1, "old_file_path"

    .line 41
    .line 42
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lax/W2/u;->B:Lcom/voxdon/xplorer/file/n;

    .line 46
    .line 47
    invoke-interface {v0}, Lax/c3/b;->q()J

    .line 48
    .line 49
    .line 50
    move-result-wide v0

    .line 51
    const-string v2, "old_file_date"

    .line 52
    .line 53
    invoke-virtual {p1, v2, v0, v1}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Lax/W2/u;->B:Lcom/voxdon/xplorer/file/n;

    .line 57
    .line 58
    invoke-interface {v0}, Lax/c3/b;->p()J

    .line 59
    .line 60
    .line 61
    move-result-wide v0

    .line 62
    const-string v2, "old_file_size"

    .line 63
    .line 64
    invoke-virtual {p1, v2, v0, v1}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 65
    .line 66
    .line 67
    const-string v0, "isDirectory"

    .line 68
    .line 69
    invoke-interface {p2}, Lax/Ac/a;->isDirectory()Z

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    invoke-virtual {p1, v0, p2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 74
    .line 75
    .line 76
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

.method static synthetic w0(Lax/W2/u;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/W2/u;->r1()V

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

.method private w1(Lax/W2/u$e;Ljava/lang/String;Lax/Ac/a;I)V
    .registers 11

    .line 1
    new-instance v0, Lax/a3/K;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/a3/K;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroid/os/Bundle;

    .line 7
    .line 8
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v2, "progressTypeString"

    .line 12
    .line 13
    invoke-virtual {p0}, Lax/W2/u;->C()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v2, "fileName"

    .line 21
    .line 22
    invoke-virtual {v1, v2, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-string p2, "applyToAll"

    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    invoke-virtual {v1, p2, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 29
    .line 30
    .line 31
    const-string p2, "errCode"

    .line 32
    .line 33
    invoke-virtual {v1, p2, p4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 34
    .line 35
    .line 36
    if-eq p4, v2, :cond_28

    .line 37
    .line 38
    const/4 p2, 0x2

    .line 39
    if-ne p4, p2, :cond_6a

    .line 40
    .line 41
    :cond_28
    iget-object p2, p0, Lax/W2/u;->B:Lcom/voxdon/xplorer/file/n;

    .line 42
    .line 43
    if-eqz p2, :cond_6a

    .line 44
    .line 45
    if-eqz p3, :cond_32

    .line 46
    .line 47
    invoke-direct {p0, v1, p3}, Lax/W2/u;->v1(Landroid/os/Bundle;Lax/Ac/a;)V

    .line 48
    .line 49
    .line 50
    goto :goto_6a

    .line 51
    :cond_32
    invoke-static {p1}, Lax/W2/u$e;->a(Lax/W2/u$e;)Z

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    if-eqz p2, :cond_6a

    .line 56
    .line 57
    iget-object p2, p1, Lax/W2/u$e;->k:Lax/Ec/a;

    .line 58
    .line 59
    instance-of p4, p2, Lax/Hc/a;

    .line 60
    .line 61
    if-eqz p4, :cond_6a

    .line 62
    .line 63
    check-cast p2, Lax/Hc/a;

    .line 64
    .line 65
    invoke-virtual {p2}, Lax/Hc/a;->d()Lax/Hc/b;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    if-eqz p2, :cond_64

    .line 70
    .line 71
    invoke-virtual {p2}, Lax/Hc/b;->a()J

    .line 72
    .line 73
    .line 74
    move-result-wide v2

    .line 75
    const-wide/16 v4, 0x0

    .line 76
    .line 77
    cmp-long p4, v2, v4

    .line 78
    .line 79
    if-lez p4, :cond_64

    .line 80
    .line 81
    const-string p4, "new_file_date"

    .line 82
    .line 83
    invoke-virtual {p2}, Lax/Hc/b;->a()J

    .line 84
    .line 85
    .line 86
    move-result-wide v2

    .line 87
    invoke-virtual {v1, p4, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 88
    .line 89
    .line 90
    iget-object p2, p0, Lax/W2/u;->B:Lcom/voxdon/xplorer/file/n;

    .line 91
    .line 92
    invoke-interface {p2}, Lax/c3/b;->q()J

    .line 93
    .line 94
    .line 95
    move-result-wide v2

    .line 96
    const-string p2, "old_file_date"

    .line 97
    .line 98
    invoke-virtual {v1, p2, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 99
    .line 100
    .line 101
    :cond_64
    const-string p2, "isDirectory"

    .line 102
    .line 103
    const/4 p4, 0x0

    .line 104
    invoke-virtual {v1, p2, p4}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 105
    .line 106
    .line 107
    :cond_6a
    :goto_6a
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->v2(Landroid/os/Bundle;)V

    .line 108
    .line 109
    .line 110
    new-instance p2, Lax/W2/u$c;

    .line 111
    .line 112
    invoke-direct {p2, p0, p1, p3}, Lax/W2/u$c;-><init>(Lax/W2/u;Lax/W2/u$e;Lax/Ac/a;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, p2}, Lax/a3/K;->v3(Lax/a3/K$i;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0}, Lax/W2/j;->q()Lcom/voxdon/xplorer/service/CommandService;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-virtual {p1, p0, v0}, Lcom/voxdon/xplorer/service/CommandService;->K(Lax/W2/j;Lax/a3/j;)V

    .line 123
    .line 124
    .line 125
    return-void
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

.method static synthetic x0(Lax/W2/u;Lax/W2/u$e;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/W2/u;->q1(Lax/W2/u$e;)V

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

.method private x1(Lax/W2/u$e;)V
    .registers 4

    .line 1
    iget-object v0, p1, Lax/W2/u$e;->d:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_14

    .line 8
    .line 9
    invoke-virtual {p0}, Lax/W2/j;->r()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const v1, 0x7f1300e6

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    goto :goto_16

    .line 21
    :cond_14
    iget-object v0, p1, Lax/W2/u$e;->d:Ljava/lang/String;

    .line 22
    .line 23
    :goto_16
    new-instance v1, Lax/W2/u$b;

    .line 24
    .line 25
    invoke-direct {v1, p0, p1}, Lax/W2/u$b;-><init>(Lax/W2/u;Lax/W2/u$e;)V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    invoke-static {v0, p1, v1}, Lax/a3/L;->n3(Ljava/lang/String;Ljava/lang/String;Lax/a3/L$c;)Lax/a3/L;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p0}, Lax/W2/j;->q()Lcom/voxdon/xplorer/service/CommandService;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0, p0, p1}, Lcom/voxdon/xplorer/service/CommandService;->K(Lax/W2/j;Lax/a3/j;)V

    .line 38
    .line 39
    .line 40
    return-void
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

.method static synthetic y0(Lax/W2/u;Lax/W2/u$e;Lax/u3/c;)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/a;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Lax/W2/u;->k1(Lax/W2/u$e;Lax/u3/c;)V

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

.method private y1(Lax/W2/u$e;)V
    .registers 4

    .line 1
    iget-object v0, p1, Lax/W2/u$e;->d:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_14

    .line 8
    .line 9
    invoke-virtual {p0}, Lax/W2/j;->r()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const v1, 0x7f1300e6

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    goto :goto_16

    .line 21
    :cond_14
    iget-object v0, p1, Lax/W2/u$e;->d:Ljava/lang/String;

    .line 22
    .line 23
    :goto_16
    new-instance v1, Lax/W2/u$a;

    .line 24
    .line 25
    invoke-direct {v1, p0, p1}, Lax/W2/u$a;-><init>(Lax/W2/u;Lax/W2/u$e;)V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    invoke-static {v0, p1, v1}, Lax/a3/L;->n3(Ljava/lang/String;Ljava/lang/String;Lax/a3/L$c;)Lax/a3/L;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p0}, Lax/W2/j;->q()Lcom/voxdon/xplorer/service/CommandService;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0, p0, p1}, Lcom/voxdon/xplorer/service/CommandService;->K(Lax/W2/j;Lax/a3/j;)V

    .line 38
    .line 39
    .line 40
    return-void
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

.method static synthetic z0(Lax/W2/u;Lax/W2/u$e;Lax/u3/c;)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/a;,
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Lax/W2/u;->j1(Lax/W2/u$e;Lax/u3/c;)V

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

.method private z1(Lax/W2/u$e;)V
    .registers 4

    .line 1
    iget-object v0, p1, Lax/W2/u$e;->t:Ljava/util/LinkedList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/LinkedList;->poll()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lax/Bc/l;

    .line 8
    .line 9
    invoke-direct {p0}, Lax/W2/u;->o1()Lax/W2/j$f;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-direct {p0, p1, v0, v1}, Lax/W2/u;->i1(Lax/W2/u$e;Lax/Ac/a;Lax/W2/j$f;)Lax/W2/u$f;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lax/W2/u;->E:Lax/u3/q;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    new-array v0, v0, [Ljava/lang/Void;

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Lax/u3/q;->i([Ljava/lang/Object;)Lax/u3/q;

    .line 23
    .line 24
    .line 25
    return-void
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
    const/4 v0, 0x3

    .line 2
    return v0
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

.method public C()Ljava/lang/String;
    .registers 3

    .line 1
    invoke-virtual {p0}, Lax/W2/j;->r()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const v1, 0x7f130385

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
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    sget-object v3, Lax/W2/u$d;->c:[I

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
    if-eq v3, v2, :cond_4b

    .line 17
    .line 18
    if-eq v3, v0, :cond_28

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
    iget-object v0, p0, Lax/W2/u;->K:Ljava/lang/String;

    .line 42
    .line 43
    if-eqz v0, :cond_2d

    .line 44
    .line 45
    goto :goto_37

    .line 46
    :cond_2d
    iget-object v0, p0, Lax/W2/u;->y:Ljava/util/List;

    .line 47
    .line 48
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Lax/W2/u$e;

    .line 53
    .line 54
    iget-object v0, v0, Lax/W2/u$e;->d:Ljava/lang/String;

    .line 55
    .line 56
    :goto_37
    invoke-virtual {p0}, Lax/W2/j;->r()Landroid/content/Context;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    const v4, 0x7f1302d5

    .line 65
    .line 66
    .line 67
    new-array v2, v2, [Ljava/lang/Object;

    .line 68
    .line 69
    aput-object v0, v2, v1

    .line 70
    .line 71
    invoke-virtual {v3, v4, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    return-object v0

    .line 76
    :cond_4b
    invoke-virtual {p0}, Lax/W2/j;->r()Landroid/content/Context;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-virtual {p0}, Lax/W2/j;->w()Lax/W2/v;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    invoke-virtual {v4}, Lax/W2/v;->H()I

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    invoke-virtual {p0}, Lax/W2/j;->w()Lax/W2/v;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    invoke-virtual {v5}, Lax/W2/v;->H()I

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    iget-object v6, p0, Lax/W2/u;->x:Ljava/lang/String;

    .line 105
    .line 106
    new-array v0, v0, [Ljava/lang/Object;

    .line 107
    .line 108
    aput-object v5, v0, v1

    .line 109
    .line 110
    aput-object v6, v0, v2

    .line 111
    .line 112
    const v1, 0x7f11000a

    .line 113
    .line 114
    .line 115
    invoke-virtual {v3, v1, v4, v0}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    return-object v0
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

.method protected G()Ljava/lang/String;
    .registers 3

    .line 1
    sget-object v0, Lax/W2/u$d;->c:[I

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
    const/4 v0, 0x0

    .line 20
    invoke-virtual {p0, v0}, Lax/W2/j;->v(Z)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0
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
    iget-object v0, p0, Lax/W2/u;->A:Lax/c3/k;

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
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

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
    iget-object v0, p0, Lax/W2/u;->B:Lcom/voxdon/xplorer/file/n;

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
    iget-object v0, p0, Lax/W2/u;->B:Lcom/voxdon/xplorer/file/n;

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
    const/4 v0, 0x1

    .line 2
    return v0
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

.method protected W()V
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

.method protected X()Z
    .registers 4

    .line 1
    iget-object v0, p0, Lax/W2/u;->D:Lax/u3/q;

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
    iget-object v0, p0, Lax/W2/u;->D:Lax/u3/q;

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
    iget-object v2, p0, Lax/W2/u;->E:Lax/u3/q;

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
    iget-object v0, p0, Lax/W2/u;->E:Lax/u3/q;

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
    invoke-virtual {p0}, Lax/W2/j;->w()Lax/W2/v;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lax/W2/v$a;->f0:Lax/W2/v$a;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lax/W2/v;->T(Lax/W2/v$a;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lax/W2/u;->f1()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lax/W2/u;->w:Lcom/voxdon/xplorer/file/o;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->Y()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_26

    .line 20
    .line 21
    invoke-virtual {p0}, Lax/W2/j;->w()Lax/W2/v;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sget-object v1, Lax/W2/v$a;->c0:Lax/W2/v$a;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lax/W2/v;->T(Lax/W2/v$a;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lax/W2/u;->w:Lcom/voxdon/xplorer/file/o;

    .line 31
    .line 32
    invoke-virtual {p0}, Lax/W2/j;->x()Lax/g3/i;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/file/o;->n(Lax/g3/i;)V

    .line 37
    .line 38
    .line 39
    :cond_26
    return-void
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
    iget-object v0, p0, Lax/W2/u;->x:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_3f

    .line 4
    .line 5
    iget-boolean v0, p0, Lax/W2/u;->M:Z

    .line 6
    .line 7
    if-eqz v0, :cond_2e

    .line 8
    .line 9
    iget-object v0, p0, Lax/W2/u;->L:Lax/B/b;

    .line 10
    .line 11
    invoke-virtual {v0}, Lax/B/b;->clear()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lax/W2/u;->L:Lax/B/b;

    .line 15
    .line 16
    iget-object v1, p0, Lax/W2/u;->x:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v1}, Lax/c3/d0;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Lax/B/b;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    invoke-static {}, Lax/W2/w;->c()Lax/W2/w;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v1, p0, Lax/W2/u;->w:Lcom/voxdon/xplorer/file/o;

    .line 30
    .line 31
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/o;->T()Lax/c3/K;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    iget-object v2, p0, Lax/W2/u;->x:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v2}, Lax/c3/d0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    iget-object v3, p0, Lax/W2/u;->L:Lax/B/b;

    .line 42
    .line 43
    invoke-virtual {v0, v1, v2, v3}, Lax/W2/w;->g(Lax/c3/K;Ljava/lang/String;Ljava/util/Set;)V

    .line 44
    .line 45
    .line 46
    goto :goto_3f

    .line 47
    :cond_2e
    invoke-static {}, Lax/W2/w;->c()Lax/W2/w;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget-object v1, p0, Lax/W2/u;->w:Lcom/voxdon/xplorer/file/o;

    .line 52
    .line 53
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/o;->T()Lax/c3/K;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iget-object v2, p0, Lax/W2/u;->x:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v3, p0, Lax/W2/u;->L:Lax/B/b;

    .line 60
    .line 61
    invoke-virtual {v0, v1, v2, v3}, Lax/W2/w;->g(Lax/c3/K;Ljava/lang/String;Ljava/util/Set;)V

    .line 62
    .line 63
    .line 64
    :cond_3f
    :goto_3f
    invoke-virtual {p0}, Lax/W2/j;->w()Lax/W2/v;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0}, Lax/W2/v;->M()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    invoke-virtual {p0}, Lax/W2/j;->w()Lax/W2/v;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v1}, Lax/W2/v;->H()I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    invoke-virtual {p0}, Lax/W2/j;->w()Lax/W2/v;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-virtual {v2}, Lax/W2/v;->C()I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-eqz v0, :cond_62

    .line 89
    .line 90
    add-int/2addr v1, v2

    .line 91
    if-ne v0, v1, :cond_62

    .line 92
    .line 93
    sget-object v0, Lax/W2/h$b;->c0:Lax/W2/h$b;

    .line 94
    .line 95
    invoke-virtual {p0, v0}, Lax/W2/j;->t0(Lax/W2/h$b;)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :cond_62
    sget-object v0, Lax/W2/h$b;->d0:Lax/W2/h$b;

    .line 100
    .line 101
    invoke-virtual {p0, v0}, Lax/W2/j;->t0(Lax/W2/h$b;)V

    .line 102
    .line 103
    .line 104
    return-void
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

.method public c0()V
    .registers 3

    .line 1
    invoke-virtual {p0}, Lax/W2/j;->j0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lax/W2/u;->G:Z

    .line 6
    .line 7
    new-instance v1, Lax/W2/u$h;

    .line 8
    .line 9
    invoke-direct {v1, p0}, Lax/W2/u$h;-><init>(Lax/W2/u;)V

    .line 10
    .line 11
    .line 12
    iput-object v1, p0, Lax/W2/u;->D:Lax/u3/q;

    .line 13
    .line 14
    new-array v0, v0, [Ljava/lang/Void;

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Lax/u3/q;->i([Ljava/lang/Object;)Lax/u3/q;

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
.end method

.method public k()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/W2/u;->w:Lcom/voxdon/xplorer/file/o;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/file/o;->k0(Z)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lax/W2/u;->G:Z

    .line 9
    .line 10
    return-void
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

.method l1(Lax/Ac/a;)Ljava/lang/Long;
    .registers 5

    .line 1
    instance-of v0, p1, Lax/Bc/l;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2f

    .line 5
    .line 6
    move-object v0, p1

    .line 7
    check-cast v0, Lax/Bc/l;

    .line 8
    .line 9
    invoke-virtual {v0}, Lax/Bc/l;->l()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_1b

    .line 14
    .line 15
    invoke-interface {p1}, Lax/Ac/a;->b()Ljava/util/Date;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1

    .line 28
    :cond_1b
    invoke-virtual {v0}, Lax/Bc/l;->k()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_2e

    .line 33
    .line 34
    invoke-virtual {v0}, Lax/Bc/l;->h()Ljava/util/Date;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1

    .line 47
    :cond_2e
    return-object v1

    .line 48
    :cond_2f
    instance-of v0, p1, Lax/Dc/I;

    .line 49
    .line 50
    if-eqz v0, :cond_3e

    .line 51
    .line 52
    check-cast p1, Lax/Dc/I;

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/util/zip/ZipEntry;->getTime()J

    .line 55
    .line 56
    .line 57
    move-result-wide v0

    .line 58
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1

    .line 63
    :cond_3e
    instance-of v0, p1, Lax/Cc/c;

    .line 64
    .line 65
    if-eqz v0, :cond_4f

    .line 66
    .line 67
    invoke-interface {p1}, Lax/Ac/a;->b()Ljava/util/Date;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    .line 72
    .line 73
    .line 74
    move-result-wide v0

    .line 75
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    return-object p1

    .line 80
    :cond_4f
    invoke-static {}, Lax/u3/b;->f()V

    .line 81
    .line 82
    .line 83
    return-object v1
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

.method m1(Lax/Ac/a;)J
    .registers 4

    .line 1
    instance-of v0, p1, Lax/Cc/c;

    .line 2
    .line 3
    if-eqz v0, :cond_b

    .line 4
    .line 5
    check-cast p1, Lax/Cc/c;

    .line 6
    .line 7
    invoke-virtual {p1}, Lax/Cc/c;->j()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0

    .line 12
    :cond_b
    instance-of v0, p1, Lax/Bc/l;

    .line 13
    .line 14
    if-eqz v0, :cond_14

    .line 15
    .line 16
    invoke-interface {p1}, Lax/Ac/a;->getSize()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    return-wide v0

    .line 21
    :cond_14
    invoke-interface {p1}, Lax/Ac/a;->getSize()J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    return-wide v0
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
    const-string v3, "file_extract"

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
    iget-object v1, p0, Lax/W2/u;->w:Lcom/voxdon/xplorer/file/o;

    .line 28
    .line 29
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/o;->S()Lax/Q2/f;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const-string v2, "loc"

    .line 38
    .line 39
    invoke-virtual {v0, v2, v1}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {p0}, Lax/W2/j;->w()Lax/W2/v;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v1}, Lax/W2/v;->x()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    int-to-long v1, v1

    .line 52
    invoke-virtual {v0, v1, v2}, Lax/Q2/a$b;->d(J)Lax/Q2/a$b;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, Lax/Q2/a$b;->e()V

    .line 57
    .line 58
    .line 59
    return-void
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
