.class public Landroidx/lifecycle/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/q$a;,
        Landroidx/lifecycle/q$b;,
        Landroidx/lifecycle/q$c;,
        Landroidx/lifecycle/q$d;
    }
.end annotation


# instance fields
.field private final a:Landroidx/lifecycle/r;

.field private final b:Landroidx/lifecycle/q$b;

.field private final c:Lax/I0/a;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/r;Landroidx/lifecycle/q$b;)V
    .registers 10

    .line 1
    const-string v0, "store"

    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "factory"

    invoke-static {p2, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Landroidx/lifecycle/q;-><init>(Landroidx/lifecycle/r;Landroidx/lifecycle/q$b;Lax/I0/a;ILax/Gb/g;)V

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/r;Landroidx/lifecycle/q$b;Lax/I0/a;)V
    .registers 5

    const-string v0, "store"

    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "factory"

    invoke-static {p2, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultCreationExtras"

    invoke-static {p3, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Landroidx/lifecycle/q;->a:Landroidx/lifecycle/r;

    .line 4
    iput-object p2, p0, Landroidx/lifecycle/q;->b:Landroidx/lifecycle/q$b;

    .line 5
    iput-object p3, p0, Landroidx/lifecycle/q;->c:Lax/I0/a;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/lifecycle/r;Landroidx/lifecycle/q$b;Lax/I0/a;ILax/Gb/g;)V
    .registers 6

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_6

    .line 6
    sget-object p3, Lax/I0/a$a;->b:Lax/I0/a$a;

    .line 7
    :cond_6
    invoke-direct {p0, p1, p2, p3}, Landroidx/lifecycle/q;-><init>(Landroidx/lifecycle/r;Landroidx/lifecycle/q$b;Lax/I0/a;)V

    return-void
.end method

.method public constructor <init>(Lax/G0/v;Landroidx/lifecycle/q$b;)V
    .registers 4

    const-string v0, "owner"

    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "factory"

    invoke-static {p2, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-interface {p1}, Lax/G0/v;->getViewModelStore()Landroidx/lifecycle/r;

    move-result-object v0

    .line 9
    invoke-static {p1}, Lax/G0/u;->a(Lax/G0/v;)Lax/I0/a;

    move-result-object p1

    .line 10
    invoke-direct {p0, v0, p2, p1}, Landroidx/lifecycle/q;-><init>(Landroidx/lifecycle/r;Landroidx/lifecycle/q$b;Lax/I0/a;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Landroidx/lifecycle/p;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/lifecycle/p;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    const-string v0, "modelClass"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_21

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v2, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p0, v0, p1}, Landroidx/lifecycle/q;->b(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/p;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1

    .line 34
    :cond_21
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 35
    .line 36
    const-string v0, "Local and anonymous classes can not be ViewModels"

    .line 37
    .line 38
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p1
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

.method public b(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/p;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/lifecycle/p;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "modelClass"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/lifecycle/q;->a:Landroidx/lifecycle/r;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Landroidx/lifecycle/r;->b(Ljava/lang/String;)Landroidx/lifecycle/p;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p2, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2e

    .line 22
    .line 23
    iget-object p1, p0, Landroidx/lifecycle/q;->b:Landroidx/lifecycle/q$b;

    .line 24
    .line 25
    instance-of p2, p1, Landroidx/lifecycle/q$d;

    .line 26
    .line 27
    if-eqz p2, :cond_1f

    .line 28
    .line 29
    check-cast p1, Landroidx/lifecycle/q$d;

    .line 30
    .line 31
    goto :goto_20

    .line 32
    :cond_1f
    const/4 p1, 0x0

    .line 33
    :goto_20
    if-eqz p1, :cond_28

    .line 34
    .line 35
    invoke-static {v0}, Lax/Gb/l;->c(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v0}, Landroidx/lifecycle/q$d;->c(Landroidx/lifecycle/p;)V

    .line 39
    .line 40
    .line 41
    :cond_28
    const-string p1, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get"

    .line 42
    .line 43
    invoke-static {v0, p1}, Lax/Gb/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v0

    .line 47
    :cond_2e
    new-instance v0, Lax/I0/d;

    .line 48
    .line 49
    iget-object v1, p0, Landroidx/lifecycle/q;->c:Lax/I0/a;

    .line 50
    .line 51
    invoke-direct {v0, v1}, Lax/I0/d;-><init>(Lax/I0/a;)V

    .line 52
    .line 53
    .line 54
    sget-object v1, Landroidx/lifecycle/q$c;->c:Lax/I0/a$b;

    .line 55
    .line 56
    invoke-virtual {v0, v1, p1}, Lax/I0/d;->c(Lax/I0/a$b;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :try_start_3a
    iget-object v1, p0, Landroidx/lifecycle/q;->b:Landroidx/lifecycle/q$b;

    .line 60
    .line 61
    invoke-interface {v1, p2, v0}, Landroidx/lifecycle/q$b;->b(Ljava/lang/Class;Lax/I0/a;)Landroidx/lifecycle/p;

    .line 62
    .line 63
    .line 64
    move-result-object p2
    :try_end_40
    .catch Ljava/lang/AbstractMethodError; {:try_start_3a .. :try_end_40} :catch_41

    .line 65
    goto :goto_47

    .line 66
    :catch_41
    iget-object v0, p0, Landroidx/lifecycle/q;->b:Landroidx/lifecycle/q$b;

    .line 67
    .line 68
    invoke-interface {v0, p2}, Landroidx/lifecycle/q$b;->a(Ljava/lang/Class;)Landroidx/lifecycle/p;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    :goto_47
    iget-object v0, p0, Landroidx/lifecycle/q;->a:Landroidx/lifecycle/r;

    .line 73
    .line 74
    invoke-virtual {v0, p1, p2}, Landroidx/lifecycle/r;->d(Ljava/lang/String;Landroidx/lifecycle/p;)V

    .line 75
    .line 76
    .line 77
    return-object p2
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
