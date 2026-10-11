.class public final synthetic Lax/S0/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final synthetic q:Lax/S0/t;


# direct methods
.method public synthetic constructor <init>(Lax/S0/t;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/S0/r;->q:Lax/S0/t;

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/S0/r;->q:Lax/S0/t;

    invoke-static {v0, p1}, Lax/S0/t;->b(Lax/S0/t;Landroid/os/Message;)Z

    move-result p1

    return p1
.end method
