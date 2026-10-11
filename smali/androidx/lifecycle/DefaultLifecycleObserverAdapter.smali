.class public final Landroidx/lifecycle/DefaultLifecycleObserverAdapter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/DefaultLifecycleObserverAdapter$a;
    }
.end annotation


# instance fields
.field private final c0:Landroidx/lifecycle/f;

.field private final q:Lax/G0/c;


# direct methods
.method public constructor <init>(Lax/G0/c;Landroidx/lifecycle/f;)V
    .registers 4

    .line 1
    const-string v0, "defaultLifecycleObserver"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Landroidx/lifecycle/DefaultLifecycleObserverAdapter;->q:Lax/G0/c;

    .line 10
    .line 11
    iput-object p2, p0, Landroidx/lifecycle/DefaultLifecycleObserverAdapter;->c0:Landroidx/lifecycle/f;

    .line 12
    .line 13
    return-void
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
.method public b(Lax/G0/h;Landroidx/lifecycle/d$a;)V
    .registers 5

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "event"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Landroidx/lifecycle/DefaultLifecycleObserverAdapter$a;->a:[I

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    aget v0, v0, v1

    .line 18
    .line 19
    packed-switch v0, :pswitch_data_4a

    .line 20
    .line 21
    .line 22
    goto :goto_41

    .line 23
    :pswitch_16
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 24
    .line 25
    const-string p2, "ON_ANY must not been send by anybody"

    .line 26
    .line 27
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :pswitch_1e
    iget-object v0, p0, Landroidx/lifecycle/DefaultLifecycleObserverAdapter;->q:Lax/G0/c;

    .line 32
    .line 33
    invoke-interface {v0, p1}, Lax/G0/c;->f(Lax/G0/h;)V

    .line 34
    .line 35
    .line 36
    goto :goto_41

    .line 37
    :pswitch_24
    iget-object v0, p0, Landroidx/lifecycle/DefaultLifecycleObserverAdapter;->q:Lax/G0/c;

    .line 38
    .line 39
    invoke-interface {v0, p1}, Lax/G0/c;->a(Lax/G0/h;)V

    .line 40
    .line 41
    .line 42
    goto :goto_41

    .line 43
    :pswitch_2a
    iget-object v0, p0, Landroidx/lifecycle/DefaultLifecycleObserverAdapter;->q:Lax/G0/c;

    .line 44
    .line 45
    invoke-interface {v0, p1}, Lax/G0/c;->e(Lax/G0/h;)V

    .line 46
    .line 47
    .line 48
    goto :goto_41

    .line 49
    :pswitch_30
    iget-object v0, p0, Landroidx/lifecycle/DefaultLifecycleObserverAdapter;->q:Lax/G0/c;

    .line 50
    .line 51
    invoke-interface {v0, p1}, Lax/G0/c;->d(Lax/G0/h;)V

    .line 52
    .line 53
    .line 54
    goto :goto_41

    .line 55
    :pswitch_36
    iget-object v0, p0, Landroidx/lifecycle/DefaultLifecycleObserverAdapter;->q:Lax/G0/c;

    .line 56
    .line 57
    invoke-interface {v0, p1}, Lax/G0/c;->g(Lax/G0/h;)V

    .line 58
    .line 59
    .line 60
    goto :goto_41

    .line 61
    :pswitch_3c
    iget-object v0, p0, Landroidx/lifecycle/DefaultLifecycleObserverAdapter;->q:Lax/G0/c;

    .line 62
    .line 63
    invoke-interface {v0, p1}, Lax/G0/c;->c(Lax/G0/h;)V

    .line 64
    .line 65
    .line 66
    :goto_41
    iget-object v0, p0, Landroidx/lifecycle/DefaultLifecycleObserverAdapter;->c0:Landroidx/lifecycle/f;

    .line 67
    .line 68
    if-eqz v0, :cond_48

    .line 69
    .line 70
    invoke-interface {v0, p1, p2}, Landroidx/lifecycle/f;->b(Lax/G0/h;Landroidx/lifecycle/d$a;)V

    .line 71
    .line 72
    .line 73
    :cond_48
    return-void

    .line 74
    nop

    .line 75
    :pswitch_data_4a
    .packed-switch 0x1
        :pswitch_3c
        :pswitch_36
        :pswitch_30
        :pswitch_2a
        :pswitch_24
        :pswitch_1e
        :pswitch_16
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
