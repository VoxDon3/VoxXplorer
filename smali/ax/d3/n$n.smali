.class Lax/d3/n$n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/d3/n$t;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/d3/n;->x4()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/d3/n;


# direct methods
.method constructor <init>(Lax/d3/n;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/d3/n$n;->a:Lax/d3/n;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
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


# virtual methods
.method public a(Z)V
    .registers 4

    .line 1
    if-eqz p1, :cond_4b

    .line 2
    .line 3
    iget-object p1, p0, Lax/d3/n$n;->a:Lax/d3/n;

    .line 4
    .line 5
    invoke-static {p1}, Lax/d3/n;->K2(Lax/d3/n;)Lax/d3/n$s;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_22

    .line 10
    .line 11
    iget-object p1, p0, Lax/d3/n$n;->a:Lax/d3/n;

    .line 12
    .line 13
    invoke-static {p1}, Lax/d3/n;->K2(Lax/d3/n;)Lax/d3/n$s;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Lax/u3/q;->m()Lax/u3/q$f;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    sget-object v0, Lax/u3/q$f;->d0:Lax/u3/q$f;

    .line 22
    .line 23
    if-eq p1, v0, :cond_22

    .line 24
    .line 25
    invoke-static {}, Lax/d3/n;->M2()Ljava/util/logging/Logger;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const-string v0, "request desktop ads skipped : already running"

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_22
    iget-object p1, p0, Lax/d3/n$n;->a:Lax/d3/n;

    .line 36
    .line 37
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 38
    .line 39
    .line 40
    move-result-wide v0

    .line 41
    invoke-static {p1, v0, v1}, Lax/d3/n;->N2(Lax/d3/n;J)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lax/d3/n$n;->a:Lax/d3/n;

    .line 45
    .line 46
    sget-object v0, Lax/S2/b$b;->d0:Lax/S2/b$b;

    .line 47
    .line 48
    invoke-static {p1, v0}, Lax/d3/n;->O2(Lax/d3/n;Lax/S2/b$b;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lax/d3/n$n;->a:Lax/d3/n;

    .line 52
    .line 53
    new-instance v0, Lax/d3/n$s;

    .line 54
    .line 55
    iget-object v1, p0, Lax/d3/n$n;->a:Lax/d3/n;

    .line 56
    .line 57
    invoke-direct {v0, v1}, Lax/d3/n$s;-><init>(Lax/d3/n;)V

    .line 58
    .line 59
    .line 60
    invoke-static {p1, v0}, Lax/d3/n;->L2(Lax/d3/n;Lax/d3/n$s;)Lax/d3/n$s;

    .line 61
    .line 62
    .line 63
    iget-object p1, p0, Lax/d3/n$n;->a:Lax/d3/n;

    .line 64
    .line 65
    invoke-static {p1}, Lax/d3/n;->K2(Lax/d3/n;)Lax/d3/n$s;

    .line 66
    .line 67
    .line 68
    move-result-object p1

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
    :cond_4b
    iget-object p1, p0, Lax/d3/n$n;->a:Lax/d3/n;

    .line 77
    .line 78
    sget-object v0, Lax/S2/b$b;->i0:Lax/S2/b$b;

    .line 79
    .line 80
    invoke-static {p1, v0}, Lax/d3/n;->O2(Lax/d3/n;Lax/S2/b$b;)V

    .line 81
    .line 82
    .line 83
    return-void
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
