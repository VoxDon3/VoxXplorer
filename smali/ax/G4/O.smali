.class public Lax/G4/O;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/G4/O$a;
    }
.end annotation


# instance fields
.field protected final a:Lax/G4/l;

.field protected final b:Lax/G4/D;

.field protected final c:Ljava/util/Date;


# direct methods
.method public constructor <init>()V
    .registers 2

    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, v0, v0, v0}, Lax/G4/O;-><init>(Lax/G4/l;Lax/G4/D;Ljava/util/Date;)V

    return-void
.end method

.method public constructor <init>(Lax/G4/l;Lax/G4/D;Ljava/util/Date;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lax/G4/O;->a:Lax/G4/l;

    .line 3
    iput-object p2, p0, Lax/G4/O;->b:Lax/G4/D;

    .line 4
    invoke-static {p3}, Lax/w4/d;->b(Ljava/util/Date;)Ljava/util/Date;

    move-result-object p1

    iput-object p1, p0, Lax/G4/O;->c:Ljava/util/Date;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .registers 3

    .line 1
    sget-object v0, Lax/G4/O$a;->b:Lax/G4/O$a;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, p0, v1}, Lax/v4/c;->j(Ljava/lang/Object;Z)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
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

.method public equals(Ljava/lang/Object;)Z
    .registers 6

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_4

    .line 3
    .line 4
    return v0

    .line 5
    :cond_4
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_8

    .line 7
    .line 8
    return v1

    .line 9
    :cond_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_45

    .line 22
    .line 23
    check-cast p1, Lax/G4/O;

    .line 24
    .line 25
    iget-object v2, p0, Lax/G4/O;->a:Lax/G4/l;

    .line 26
    .line 27
    iget-object v3, p1, Lax/G4/O;->a:Lax/G4/l;

    .line 28
    .line 29
    if-eq v2, v3, :cond_26

    .line 30
    .line 31
    if-eqz v2, :cond_43

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Lax/G4/l;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_43

    .line 38
    .line 39
    :cond_26
    iget-object v2, p0, Lax/G4/O;->b:Lax/G4/D;

    .line 40
    .line 41
    iget-object v3, p1, Lax/G4/O;->b:Lax/G4/D;

    .line 42
    .line 43
    if-eq v2, v3, :cond_34

    .line 44
    .line 45
    if-eqz v2, :cond_43

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Lax/G4/D;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_43

    .line 52
    .line 53
    :cond_34
    iget-object v2, p0, Lax/G4/O;->c:Ljava/util/Date;

    .line 54
    .line 55
    iget-object p1, p1, Lax/G4/O;->c:Ljava/util/Date;

    .line 56
    .line 57
    if-eq v2, p1, :cond_44

    .line 58
    .line 59
    if-eqz v2, :cond_43

    .line 60
    .line 61
    invoke-virtual {v2, p1}, Ljava/util/Date;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_43

    .line 66
    .line 67
    goto :goto_44

    .line 68
    :cond_43
    return v1

    .line 69
    :cond_44
    :goto_44
    return v0

    .line 70
    :cond_45
    return v1
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

.method public hashCode()I
    .registers 6

    .line 1
    iget-object v0, p0, Lax/G4/O;->a:Lax/G4/l;

    .line 2
    .line 3
    iget-object v1, p0, Lax/G4/O;->b:Lax/G4/D;

    .line 4
    .line 5
    iget-object v2, p0, Lax/G4/O;->c:Ljava/util/Date;

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    new-array v3, v3, [Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    aput-object v0, v3, v4

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    aput-object v1, v3, v0

    .line 15
    .line 16
    const/4 v0, 0x2

    .line 17
    aput-object v2, v3, v0

    .line 18
    .line 19
    invoke-static {v3}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    return v0
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

.method public toString()Ljava/lang/String;
    .registers 3

    .line 1
    sget-object v0, Lax/G4/O$a;->b:Lax/G4/O$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, p0, v1}, Lax/v4/c;->j(Ljava/lang/Object;Z)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
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
