.class public Lax/c3/q$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/c3/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "l"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/voxdon/xplorer/file/n;",
        ">;"
    }
.end annotation


# instance fields
.field q:Ljava/text/Collator;


# direct methods
.method constructor <init>()V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ljava/text/Collator;->getInstance()Ljava/text/Collator;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lax/c3/q$l;->q:Ljava/text/Collator;

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


# virtual methods
.method public a(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;)I
    .registers 10

    .line 1
    instance-of v0, p1, Lcom/voxdon/xplorer/file/y;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_34

    .line 6
    .line 7
    instance-of v0, p2, Lcom/voxdon/xplorer/file/y;

    .line 8
    .line 9
    if-eqz v0, :cond_34

    .line 10
    .line 11
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-interface {p2}, Lax/c3/b;->isDirectory()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v0, :cond_21

    .line 20
    .line 21
    if-eqz v3, :cond_21

    .line 22
    .line 23
    invoke-interface {p2, v2}, Lax/c3/b;->r(Z)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-interface {p1, v2}, Lax/c3/b;->r(Z)I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    sub-int/2addr v0, v3

    .line 32
    int-to-long v3, v0

    .line 33
    goto :goto_3d

    .line 34
    :cond_21
    if-eqz v0, :cond_26

    .line 35
    .line 36
    if-nez v3, :cond_26

    .line 37
    .line 38
    return v2

    .line 39
    :cond_26
    if-nez v0, :cond_2b

    .line 40
    .line 41
    if-eqz v3, :cond_2b

    .line 42
    .line 43
    return v1

    .line 44
    :cond_2b
    invoke-interface {p2}, Lax/c3/b;->p()J

    .line 45
    .line 46
    .line 47
    move-result-wide v3

    .line 48
    invoke-interface {p1}, Lax/c3/b;->p()J

    .line 49
    .line 50
    .line 51
    move-result-wide v5

    .line 52
    goto :goto_3c

    .line 53
    :cond_34
    invoke-interface {p2}, Lax/c3/b;->p()J

    .line 54
    .line 55
    .line 56
    move-result-wide v3

    .line 57
    invoke-interface {p1}, Lax/c3/b;->p()J

    .line 58
    .line 59
    .line 60
    move-result-wide v5

    .line 61
    :goto_3c
    sub-long/2addr v3, v5

    .line 62
    :goto_3d
    const-wide/16 v5, 0x0

    .line 63
    .line 64
    cmp-long v0, v3, v5

    .line 65
    .line 66
    if-nez v0, :cond_52

    .line 67
    .line 68
    iget-object v0, p0, Lax/c3/q$l;->q:Ljava/text/Collator;

    .line 69
    .line 70
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    invoke-virtual {v0, p1, p2}, Ljava/text/Collator;->compare(Ljava/lang/String;Ljava/lang/String;)I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    return p1

    .line 83
    :cond_52
    if-lez v0, :cond_55

    .line 84
    .line 85
    return v2

    .line 86
    :cond_55
    return v1
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

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .registers 3

    .line 1
    check-cast p1, Lcom/voxdon/xplorer/file/n;

    .line 2
    .line 3
    check-cast p2, Lcom/voxdon/xplorer/file/n;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lax/c3/q$l;->a(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
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
