.class public Lax/k5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/j5/b;


# static fields
.field private static final b:Ljava/lang/String; = "a"


# instance fields
.field a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/j5/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .registers 0

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

.method public constructor <init>(Lax/e5/a;Lax/h5/b;)V
    .registers 10

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lax/k5/a;->a:Ljava/util/List;

    .line 10
    .line 11
    sget-object v0, Lax/k5/a;->b:Ljava/lang/String;

    .line 12
    .line 13
    const-string v1, "Found a device without partition table, yay!"

    .line 14
    .line 15
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    invoke-interface {p2}, Lax/h5/b;->b()J

    .line 19
    .line 20
    .line 21
    move-result-wide v1

    .line 22
    long-to-int v2, v1

    .line 23
    invoke-interface {p1}, Lax/e5/a;->d()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    div-int/2addr v2, v1

    .line 28
    invoke-interface {p2}, Lax/h5/b;->b()J

    .line 29
    .line 30
    .line 31
    move-result-wide v3

    .line 32
    invoke-interface {p1}, Lax/e5/a;->d()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    int-to-long v5, p1

    .line 37
    rem-long/2addr v3, v5

    .line 38
    const-wide/16 v5, 0x0

    .line 39
    .line 40
    cmp-long p1, v3, v5

    .line 41
    .line 42
    if-eqz p1, :cond_30

    .line 43
    .line 44
    const-string p1, "fs capacity is not multiple of block size"

    .line 45
    .line 46
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    :cond_30
    iget-object p1, p0, Lax/k5/a;->a:Ljava/util/List;

    .line 50
    .line 51
    new-instance v0, Lax/j5/c;

    .line 52
    .line 53
    invoke-interface {p2}, Lax/h5/b;->a()I

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    const/4 v1, 0x0

    .line 58
    invoke-direct {v0, p2, v1, v2}, Lax/j5/c;-><init>(III)V

    .line 59
    .line 60
    .line 61
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    return-void
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


# virtual methods
.method public a()Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lax/j5/c;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/k5/a;->a:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
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
